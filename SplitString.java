public class SplitString {
    public static void main(String[] args) {
        String s = "123-4567890";
        String str[]=s.split("-");
        printString(str,"String Split method");
    
        
    }
    public static void printString(String str[],String apporach){
        System.out.println("Spliting string by using "+apporach);
        for(String string:str){
            System.out.println(string);
        }
    }

}
