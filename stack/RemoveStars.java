class Solution {
    public String removeStars(String s) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            
            if (current == '*') {
                int lastPosition = result.length() - 1;
                result.deleteCharAt(lastPosition);
            } else {
                result.append(current);
            }
        }
        
        return result.toString();
    }
}
