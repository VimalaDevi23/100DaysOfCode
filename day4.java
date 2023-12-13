https://leetcode.com/problems/can-place-flowers/description/?envType=study-plan-v2&envId=leetcode-75

class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        int count =0;
        int length = flowerbed.length;

        for(int i=0;i<length;i++){
            if(flowerbed[i]==0){
                boolean canPlant = ((i==0||flowerbed[i-1]==0)&&
                (i==length-1||flowerbed[i+1]==0));
                if(canPlant){
                    flowerbed[i]=1;
                    count++;
                }
            }
        }
        return count>=n;
        
    }
}
