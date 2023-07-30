public class Hollowright {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i ; j++) {
            
            // for(int k=1;k<=i;k++){
                if (j == 1 || j == i || i==9 ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
