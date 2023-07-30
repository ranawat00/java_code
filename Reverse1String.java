import java.util.Scanner;

public class Reverse1String {
    public static void main(String[] args) {
        String res="";
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
       
        for(int i=str.length()-1;i>=0;i--){
            res=res+str.charAt(i);
        }
         System.out.println( res);
    }
    
}
