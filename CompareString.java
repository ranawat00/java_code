public class CompareString {
    public static void main(String[] args) {
    String str1="Ranveer";
    String str2="Ranveer";
    boolean isCompare=false;
    for(int i=0;i<str1.length();i++){
        // for(int j=0;j<str2.length();j++){
            if(str1.charAt(i)!=str2.charAt(i)){
                isCompare=false;
                break;
            }
            isCompare=true;
            }
            System.out.println("Both the string are equal = " +isCompare);
        }
    }
    

