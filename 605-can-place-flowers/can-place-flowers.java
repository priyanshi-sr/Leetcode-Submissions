class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(flowerbed==null) return true;
        for(int i =0;i<flowerbed.length;i++){
          if (flowerbed[i] == 0 && 
            (i == 0 || flowerbed[i - 1] == 0) && 
            (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {

            flowerbed[i] = 1;  
            n--;  
            if (n == 0) {
                return true;  
            }

            i++;  
        }
    }

    return n <= 0;  
}
}