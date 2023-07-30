import java.util.Arrays;

public class SortCharacter {
    public static void main(String[] args) {
        String str="University";
        char ch[]=str.toCharArray();
        Arrays.sort(ch);
        String sortedStr=new String(ch);
            System.out.println(sortedStr);
        }
}
