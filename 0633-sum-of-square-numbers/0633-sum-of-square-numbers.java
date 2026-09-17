class Solution {
    public boolean judgeSquareSum(int c) {
           for (long a = 0; a * a <= c; a++) {
            //b^2=c-a^2
             long rem = c - a * a;
             long start = 0;
             long end = (long) Math.sqrt(rem);

            while (start <= end) {

                long mid = start + (end - start) / 2;
                long square = mid * mid;

                if (square == rem) {
                    return true;
                }
                else if (square < rem) {
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
        }

        return false;
    }
}