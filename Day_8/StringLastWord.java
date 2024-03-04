package Day_8;

public class StringLastWord {
    
    public static void main(String[] args) {
        String s = "Tap Academy";
        System.out.println("Last word in \"" + s + "\": " + getLastWord(s));
    }

    private static String getLastWord(String s) {
        StringBuilder lastWord = new StringBuilder();
        
        // Start iterating through the string from the end
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            
            // If a non-space character is found, prepend it to the lastWord StringBuilder
            if (c != ' ') {
                lastWord.insert(0, c);
            } 
            // If a space is found and lastWord is not empty, it means we found the last word
            else if (lastWord.length() > 0) {
                break;
            }
        }
        
        return lastWord.toString();
    }
}
