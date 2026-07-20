package Day2;
public class day2anagram {
    public static void  main(String[] args){
        String s1 = "Listen";
        String s2 = "Silent";
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        if(s1.length() != s2.length()){
            System.out.println("Not an Anagram");
        }else{
            char[] c1 = s1.toCharArray();
            char[] c2 = s2.toCharArray();
            java.util.Arrays.sort(c1);
            java.util.Arrays.sort(c2);
            if(java.util.Arrays.equals(c1, c2)){
                System.out.println("Anagram");
            }else{
                System.out.println("Not an Anagram");
        
            }
        }
    }
}

