class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int result = 0;
        boolean firstone = true;
        if(flowerbed.length==1 && flowerbed[0]==0 && n<2){
            return true;
        }
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                count++;
            } else if (firstone) {
                if (count > 1) {
                    if (count % 2 == 1) {
                        result = result + (count / 2);
                    } else {
                        result = result + (count / 2);
                    }
                }
                count = 0;
                firstone=false;
            } else {
                if (count > 2) {
                    if (count % 2 == 1) {
                        result = result + (count / 2);
                    } else {
                        result = result + ((count / 2) - 1);
                    }
                }
                count = 0;
            }
            if(i==flowerbed.length-1 && firstone){
                if (count % 2 == 1) {
                        result = result + (count / 2)+1;
                    } else {
                        result = result + (count / 2);
                    }
                return result>=n;
            }
            if(i==flowerbed.length-1&&count>1){
                    if (count % 2 == 1) {
                        result = result + (count / 2);
                    } else {
                        result = result + (count / 2);
                    }
            }
        }
        if (result >= n) {
            return true;
        } else
            return false;
    }
}