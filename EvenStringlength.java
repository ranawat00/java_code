public class EvenStringlength {
    public static void main(String[] args) {
        String str = "Welcome to the my word";
        for(String s: str.split(" ")){
            if(s.length()%2==0){
            System.out.println(s);
        }
    }
    
}
}