https://leetcode.com/problems/find-the-highest-altitude/description/

class Solution {
    public int largestAltitude(int[] gain) {
        int currentAltitude=0;
        int highestAltitude=0;
        for(int netgain : gain){
            currentAltitude += netgain;
            highestAltitude = Math.max(highestAltitude,currentAltitude);
        }

        return highestAltitude;

        
    }
}
