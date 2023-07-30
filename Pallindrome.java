import java.util.Scanner;
public class Pallindrome {
    public static void main(String[] args) {
        String res="";
        System.out.println("Enter the String=");
        Scanner sc=new Scanner(System.in);
        // System.out.println("Enter a number");
        String str=sc.nextLine();
        for(int i=str.length()-1;i>=0;i--){
            res=res+str.charAt(i);
        }
        if(str.equals(res)){
            System.out.println("Yes");

        }
        else{
            System.out.println("No");
        }
    }
    
}
