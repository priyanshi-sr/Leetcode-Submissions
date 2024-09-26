class Solution {
    public List<List<String>> groupAnagrams(String[] arr) {
        return (Group(arr));
    }
     public static  List<List<String>> Group(String[] arr){
        HashMap<String, List<String>> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            String key = Anagram_Key(arr[i]);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());

            }
            map.get(key).add(arr[i]);
        }
        List<List<String>> ans = new ArrayList<>();
        for(String key : map.keySet()){
            ans.add(map.get(key));
        }
        return ans;
    }
    public static String Anagram_Key(String str) {
        int[] freq = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch - 97]++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < freq.length; i++) {
            sb.append(freq[i] + " ");
        }
        return sb.toString();
    }

}
