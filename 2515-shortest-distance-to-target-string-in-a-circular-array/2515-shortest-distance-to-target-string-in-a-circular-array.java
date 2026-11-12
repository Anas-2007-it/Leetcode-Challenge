class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
         int n = words.length;
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (words[i].equals(target)) {
                int diff = Math.abs(i - startIndex);
                int distance = Math.min(diff, n - diff);
                ans = Math.min(ans, distance);
            }
        }

        if (ans == Integer.MAX_VALUE)
            return -1;

        return ans;
    }
}
