class Solution {
    public static String longestCommonPrefix(String[] str) {
    if (str.length == 0) {
        return "";
    }
    String result = str[0];
    
    for (int i = 1; i < str.length; i++) {
        while (!str[i].startsWith(result)) {
            result = result.substring(0, result.length() - 1);
            if (result.isEmpty()) {
                return "";
            }
        }
    }
    
    return result;
}
}