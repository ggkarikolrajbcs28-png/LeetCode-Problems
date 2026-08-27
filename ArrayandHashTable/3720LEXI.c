public class Solution {
    public String lexGreaterPermutation(String s, String target) {
        int n = s.length();
        int[] letterCounts = new int[26];
        
        for (int i = 0; i < n; i++) {
            letterCounts[s.charAt(i) - 'a']++;
        }
        
        StringBuilder prefix = new StringBuilder();
        int maxMatchedLength = 0;
        
        for (int i = 0; i < n; i++) {
            char targetChar = target.charAt(i);
            int charIndex = targetChar - 'a';
            
            if (letterCounts[charIndex] > 0) {
                letterCounts[charIndex]--;
                prefix.append(targetChar);
                maxMatchedLength++;
            } else {
                break;
            }
        }
        
        for (int i = maxMatchedLength; i >= 0; i--) {
            if (i < maxMatchedLength) {
                char charToReturn = prefix.charAt(prefix.length() - 1);
                prefix.deleteCharAt(prefix.length() - 1);
                letterCounts[charToReturn - 'a']++;
            }
            
            if (i == n) {
                continue;
            }
            
            char targetChar = target.charAt(i);
            int targetCharIndex = targetChar - 'a';
            
            for (int nextCharIndex = targetCharIndex + 1; nextCharIndex < 26; nextCharIndex++) {
                if (letterCounts[nextCharIndex] > 0) {
                    prefix.append((char) (nextCharIndex + 'a'));
                    letterCounts[nextCharIndex]--;
                    
                    for (int remIndex = 0; remIndex < 26; remIndex++) {
                        while (letterCounts[remIndex] > 0) {
                            prefix.append((char) (remIndex + 'a'));
                            letterCounts[remIndex]--;
                        }
                    }
                    
                    return prefix.toString();
                }
            }
        }
        
        return "";
    }
}
