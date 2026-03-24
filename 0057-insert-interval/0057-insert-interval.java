class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> li=new ArrayList<>();
        int n=intervals.length;
        int i=0,c=0;
        while(i<n && intervals[i][1]<newInterval[0]){
            // arr[c++]=intervals[i];
            li.add(intervals[i]);
            i++;
        }
        while(i<n && intervals[i][0]<=newInterval[1]){
            newInterval[0]=Math.min(newInterval[0],intervals[i][0]);
            newInterval[1]=Math.max(newInterval[1],intervals[i][1]);
            i++;

        }
        System.out.println(newInterval[0]+" "+newInterval[1]);
        // arr[c++]=newInterval;
        li.add(newInterval);
        while(i<n){
            // arr[c++]=intervals[i++];
            li.add(intervals[i++]);
        }
        
int[][] arr = li.toArray(new int[li.size()][]);    return arr;
    }
}