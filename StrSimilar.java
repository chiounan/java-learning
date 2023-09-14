// Given a text txt[0..n-1] and a pattern pat[0..m-1] 
// and fault toelrnace text lenght ft. 
// Write a function semisearch(char pat[], char txt[], int ft) 
// that prints all occurrences of pat[] and allow ft mismatch characters in txt[]. 
// You may assume that n > m.

public class StrSimilar {
    
    public static void semisearch(String txt, String pattern, int ft) {
        int m = pattern.length();
        int n = txt.length();
        int ft_tmp;

        for (int i = 0; i <= n - m; i++) {
            ft_tmp = 0;
            int j = 0;
            for (j = 0; j < m; j++) {
                if (txt.charAt(i + j) != pattern.charAt(j))
                    ft_tmp++;
                if (ft_tmp > ft)
                    break;
            }
            if (j == m)
                System.out.println("Pattern found at index: " + i);                
        }
    }

    public static void main(String args[]) {
        String txt = "AABAACAADAABAAABAA";
        String pattern = "AABA";
        int ft = 1;

        System.out.println("Text: " + txt);
        System.out.println("Pattern: " + pattern);
        semisearch(txt, pattern, ft);
    }
}
