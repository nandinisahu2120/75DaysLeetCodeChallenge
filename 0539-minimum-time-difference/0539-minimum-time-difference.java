class Pair{
    int hr, min;
    Pair(int hr, int min){
        this.hr = hr ;
        this.min = min;
    }
}
class Solution {
    int diff(Pair p1 , Pair p2){
        int min , hr;
        if(p1.min > p2.min){
             min = p2.min + 60 - p1.min;
             hr = p2.hr - 1 - p1.hr;
        }
        else{
             min = p2.min - p1.min;
             hr = p2.hr - p1.hr;
        }
        return min + hr * 60;  
    }
    public int findMinDifference(List<String> timePoints) {
        List<Pair> li = new ArrayList<>();
        for(String it : timePoints){
            int hr = Integer.parseInt(it.substring(0, 2));
            int min = Integer.parseInt(it.substring(3, 5));
            li.add(new Pair(hr , min));
        }
        Collections.sort(li,(a , b) ->{
            if(a.hr == b.hr) return a.min - b.min;
            else return a.hr - b.hr;
        });
        int mindiff = Integer.MAX_VALUE;
        for(int i = 1 ; i < li.size(); i++){
            Pair p = li.get(i);
            Pair pprev = li.get(i - 1);
            int diff = diff(pprev , p);
            mindiff = Math.min(mindiff , diff);

        }
        Pair ini = li.get(0);
        Pair np = new Pair(ini.hr + 24, ini.min);
        int diff = diff(li.get(li.size() - 1), np);
        mindiff = Math.min(mindiff , diff);
        return mindiff;
    }
}