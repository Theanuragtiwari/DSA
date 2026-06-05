class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String , List<String>> mp = new HashMap<>();
        for ( String s: strs){
            char[] c= s.toCharArray();
            Arrays.sort(c);
            String sortedString = new String (c);
            if (!mp.containsKey(sortedString)){
                mp.put(sortedString, new ArrayList<>());
            }
            mp.get(sortedString).add(s);
        }
        return new ArrayList<>( mp.values());
    }
}