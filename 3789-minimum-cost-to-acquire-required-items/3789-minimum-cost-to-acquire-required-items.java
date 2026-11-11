class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        int have1 = 0, have2 = 0;
        long total = 0;

        if(cost1 < costBoth){
            have1 = need1;
            total = 1L * need1 * cost1;
        }
        else{
            have1 = need1;
            have2 = need1;
            total = 1L * need1 * costBoth;
        }

        if(have2 < need2){
            if(cost2 < costBoth){
                total += 1L * (need2 - have2) * cost2;
            }
            else
                total += 1L * (need2 - have2) * costBoth;
        }

        long other = 1L * Math.min(need1, need2) * costBoth;
        if(need1 > need2)
            if(costBoth > cost1)
                other += 1L * (need1 - need2) * cost1;
            else
                other += 1L * (need1 - need2) * costBoth;
        else
            if(cost2 < costBoth)
                other += 1L * (need2 - need1) * cost2;
            else
                other += 1L * (need2 - need1) * costBoth;

        return Math.min(total, other);
    }
}