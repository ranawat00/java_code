import java.util.HashSet;

public class MissingMamber {
    public static void main(String[] args) {
     Integer a[]={1,2,4};
     missingnumber(a);
    }
    public static void missingnumber(Integer a[]){
        HashSet<Integer>set=new HashSet<Integer>();
            for (int num:a){
                set.add(num);
}
int n=a.length+1;
for(int i=0;i<n;i++){
    if(!set.contains(i)){
        System.out.println("Missing number is "+i+"");
     }
   }
 }    
}
