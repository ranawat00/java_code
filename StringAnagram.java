import java.util.Arrays;
public class StringAnagram {
    public static void main(String[] args) {
        String str1="java";
        String str2="avja";
        System.out.println(isAnagram(str1,str2));
      

    }
     public static boolean isAnagram(String str1, String str2) {
    char[] charArrayfromString1=str1.toCharArray();
    char[] charArrayfromString2=str2.toCharArray();
    Arrays.sort(charArrayfromString1);
    Arrays.sort(charArrayfromString2);
    return Arrays.equals(charArrayfromString1, charArrayfromString2);

}
}