public class ReverseWord {
    public static void main(String[] args) {
        String str="Gaurav is a good boy";
        String splitArray[]=str.split(" ");
        for(int i=splitArray.length-1; i>=0;i--)
        {
            System.out.println(splitArray[i]);
        }
       

    }
    
}
