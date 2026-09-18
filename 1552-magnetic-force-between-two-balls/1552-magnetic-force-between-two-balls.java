import java.util.*;

class Solution {
    public int maxDistance(int[] position, int m) {

        Arrays.sort(position);

        int start = 1;
        int end = position[position.length - 1] - position[0];

        int answer = 0;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (canPlace(position, m, mid)) {
                answer = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return answer;
    }

    private boolean canPlace(int[] position, int m, int distance) {

        int count = 1;
        int lastPosition = position[0];

        for (int i = 1; i < position.length; i++) {

            if (position[i] - lastPosition >= distance) {
                count++;
                lastPosition = position[i];
            }

            if (count >= m) {
                return true;
            }
        }

        return false;
    }
}