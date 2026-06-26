class Solution {
    public int[] sortByReflection(int[] nums) {
         int[] arr=new int[nums.length];
        
        for(int i=0;i<nums.length;i++)
       { 
          long n=nums[i];
           long refel=0,f=1;
           String rev="";
           
           while(n>0){
               long d=n%2;
              
               if(d==0)
                   rev+='0';
               else 
                   rev+=1;
               n/=2;
           }
          
           int l=rev.length()-1;
           
           while(l>=0){
             
               char ch=rev.charAt(l--);
               if(ch=='0')
               refel=refel+0*f;
               else
                  refel=refel+1*f; 
        
               f*=2;
           }
          
           arr[i]=(int)refel;
           
           
        }
           for(int i=0;i<arr.length;i++){
               for(int j=0;j<arr.length-i-1;j++)
                   {
                       if(arr[j]==arr[j+1]){
                           if(nums[j]>nums[j+1]){
                            int t=nums[j];
                           nums[j]=nums[j+1];
                           nums[j+1]=t;
                           }
                       }
                       if(arr[j]>arr[j+1]){
                           int t=arr[j];
                           arr[j]=arr[j+1];
                           arr[j+1]=t;
                           t=nums[j];
                           nums[j]=nums[j+1];
                           nums[j+1]=t;
                       }
                       
                   }
           }
        return nums;
        
        
    }
}