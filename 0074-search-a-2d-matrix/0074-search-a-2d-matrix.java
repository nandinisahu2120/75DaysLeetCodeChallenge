class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l=0,h=(matrix.length*matrix[0].length)-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            int temp=matrix[(mid)/matrix[0].length][(mid)%matrix[0].length];
            if(target==temp)
            return true;
            else if(target>temp)
            l=mid+1;
            else
            h=mid-1;
        }
        return false;
    }
}