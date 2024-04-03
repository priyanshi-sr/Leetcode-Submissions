class Solution {
    public String simplifyPath(String path) {
      Stack<String> stack = new Stack<>();
        String[] components = path.split("/");

        for( String name : components) {
            if( name.equals(".") || name.isEmpty()) continue;
            else if (name.equals("..")) {
                if(!stack.isEmpty()) stack.pop();
            } else stack.add(name);
        }
        
        StringBuilder res = new StringBuilder();
        for(String name: stack) {
            res.append("/");
            res.append(name);
        }
        
        return res.length() > 0 ? res.toString() : "/";
    }
}
