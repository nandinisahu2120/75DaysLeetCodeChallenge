class Solution {
    public double[] internalAngles(int[] sides) {
        double[] arr=new double[3];
        double a=sides[0],b=sides[1],c=sides[2];
        if(a+b>c && b+c>a && c+a>b){
            double C=((double)(a*a+b*b-c*c)/(double)((2*a*b)));
            double A=((double)(-a*a+b*b+c*c)/(double)((2*b*c)));
            double B=((double)(a*a-b*b+c*c)/(double)((2*a*c)));
            arr[0]=Math.toDegrees(Math.acos(A));
            arr[1]=Math.toDegrees(Math.acos(B));
            arr[2]=Math.toDegrees(Math.acos(C));
            Arrays.sort(arr);
            return arr;
            
        }
        else return new double[]{};
    }
}