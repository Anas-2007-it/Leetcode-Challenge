

import java.util.*;

class Solution {

    TreeMap<Integer, Integer> lo = new TreeMap<>();
    TreeMap<Integer, Integer> hi = new TreeMap<>();

    int loSize = 0, hiSize = 0;
    long loSum = 0, hiSum = 0;

    void addMap(TreeMap<Integer, Integer> map, int v) {
        map.put(v, map.getOrDefault(v, 0) + 1);
    }

    void removeMap(TreeMap<Integer, Integer> map, int v) {
        int count = map.get(v);

        if (count == 1)
            map.remove(v);
        else
            map.put(v, count - 1);
    }

    void add(int v) {
        if (lo.isEmpty() || v <= lo.lastKey()) {
            addMap(lo, v);
            loSize++;
            loSum += v;
        } else {
            addMap(hi, v);
            hiSize++;
            hiSum += v;
        }

        balance();
    }

    void remove(int v) {
        if (lo.containsKey(v)) {
            removeMap(lo, v);
            loSize--;
            loSum -= v;
        } else {
            removeMap(hi, v);
            hiSize--;
            hiSum -= v;
        }

        balance();
    }

    void balance() {
        while (loSize > hiSize + 1) {
            int v = lo.lastKey();

            removeMap(lo, v);
            loSize--;
            loSum -= v;

            addMap(hi, v);
            hiSize++;
            hiSum += v;
        }

        while (loSize < hiSize) {
            int v = hi.firstKey();

            removeMap(hi, v);
            hiSize--;
            hiSum -= v;

            addMap(lo, v);
            loSize++;
            loSum += v;
        }
    }

    long getCost() {
        long median = lo.lastKey();

        return median * loSize - loSum
             + hiSum - median * hiSize;
    }

    public long minOperations(int[] nums, int x, int k) {
        int n = nums.length;

        long[] cost = new long[n - x + 1];

        // First window
        for (int i = 0; i < x; i++)
            add(nums[i]);

        cost[0] = getCost();

        for (int i = x; i < n; i++) {
            remove(nums[i - x]);
            add(nums[i]);

            cost[i - x + 1] = getCost();
        }

        
        long INF = Long.MAX_VALUE / 4;
        long[][] dp = new long[k + 1][n + 1];
        for (long[] row : dp)
            Arrays.fill(row, INF);

        dp[0][0] = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= k; j++) {
                if (dp[j][i] == INF)
                    continue;
                dp[j][i + 1] = Math.min(
                    dp[j][i + 1], dp[j][i]
                );
                if (j < k && i + x <= n) {
                    dp[j + 1][i + x] = Math.min(
                        dp[j + 1][i + x],
                        dp[j][i] + cost[i]
                    );
                }
            }
        }
        return dp[k][n];
    }
}
