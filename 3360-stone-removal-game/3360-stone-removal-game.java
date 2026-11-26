class Solution {
    public boolean canAliceWin(int n) {
        int opt= 10;
        boolean alice = true;
        while (n >= opt) {
            n -= opt;
            opt--;
            alice = !alice;
        }
        return !alice;
    }
}

