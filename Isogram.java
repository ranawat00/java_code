import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Isogram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        isIsogram(s);
      
        
    }
static boolean isIsogram(String s){
    boolean Isogram=false;
    char[] ch=s.toCharArray();
    Set<Character>SetCh=new HashSet<Character>();
    for(Character c:ch){
        if(SetCh.contains(c)){
            Isogram=false;
            break;
        }
          SetCh.add(c);
        Isogram=true;
    }
    return Isogram;
}

}
 
