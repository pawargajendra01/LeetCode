class Solution {
    public int surfaceArea(int[][] grid) {
        int area=0;
        int n=grid.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] > 0){
                    area+=(grid[i][j]*4)+2;
                    if(i-1>=0){
                        if(grid[i-1][j]>=grid[i][j]){
                            area-=grid[i][j];
                        }else{
                            area-=grid[i-1][j];
                        }
                    }
                    if(j-1>=0){
                        if(grid[i][j-1]>=grid[i][j]){
                            area-=grid[i][j];
                        }else{
                            area-=grid[i][j-1];
                        }
                    }
                    if(j+1<n){
                        if(grid[i][j+1]>=grid[i][j]){
                            area-=grid[i][j];
                        }else{
                            area-=grid[i][j+1];
                        }
                    }
                    if(i+1<n){
                        if(grid[i+1][j]>=grid[i][j]){
                            area-=grid[i][j];
                        }else{
                            area-=grid[i+1][j];
                        }
                    }
                }
            }
        }
        return area;
    }
}