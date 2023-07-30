public class Wheather {

    public static void main(String[] args) {
        int [] arr={45,89,78,96,47};
        int num=65;
        boolean isInArray=false;
        for(int n:arr){
            if(n==num){
                isInArray=true;
                break;
            }
        }
        if(isInArray){
            System.out.println("The number is in the array");

        }
        else{
            System.out.println("The number is not in the array");
        }
    }
    
}
