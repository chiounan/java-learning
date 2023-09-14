// Given a text txt[0..n-1] and a pattern pat[0..m-1], 
// write a function search(char pat[], char txt[]) 
// that prints all occurrences of pat[] in txt[]. 
// You may assume that n > m.

public class StrMatch {
    
    public static void search(String txt, String pattern) {
        int m = pattern.length();
        int n = txt.length();

        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++)
                if (txt.charAt(i + j) != pattern.charAt(j))
                    break;
            if (j == m)
                System.out.println("Pattern found at index " + i);        
        }
    }

    public static void main(String args[]) {
        String txt = "AABAACAADAABAAABAA";
        String pattern = "AABA";

        System.out.println("Text: " + txt);
        System.out.println("Pattern: " + pattern);
        search(txt, pattern);
    }
}
