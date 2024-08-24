class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maximum = Integer.MIN_VALUE;
        for(int i =0;i<candies.length;i++){
            if(maximum<candies[i]){
                maximum = candies[i];
            }
        }
        List<Boolean> ans= new ArrayList<>();
        for(int candy : candies){
            ans.add(candy+extraCandies>=maximum);
        }
        return ans;
    }

    }
