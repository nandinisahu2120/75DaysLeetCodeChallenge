class Solution {
    public String sortt(String s){
        char[] ch=s.toCharArray();
        Arrays.sort(ch);
        String str=new String(ch);
        return str;
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        String[] st=new String[strs.length];
        for(int i=0;i<strs.length;i++){
            st[i]=sortt(strs[i]);
        }
        Set<String> set=new HashSet<>();
        List<List<String>> li=new ArrayList<>();
        for(int i=0;i<strs.length;i++){
            if(set.contains(st[i]))
            continue;
            else
            { 
            set.add(st[i]);
            List<String> list=new ArrayList<>();
            for(int j=0;j<strs.length;j++){
                if(st[i].compareTo(st[j])==0){
                    list.add(strs[j]);
                }
            }
            li.add(list);}
        }
        return li;
    }
}