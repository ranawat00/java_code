public class Vowel {
    public static void main(String[] args) {
        String str = "hello";
        char[] chars=str.toCharArray();
        int count=0;
        for(char c:chars){
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                count++;
            }
        }
        System.out.println(count);
    }
    
}
