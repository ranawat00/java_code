public class ReverseArray {
    public static void main(String[] args) {
int []arr ={1,2,5,6,8};
int n=Math.floorDiv(arr.length, 2);
for(int i=0;i<n;i++){
    int temp=arr[i];
    arr[i]=arr[arr.length-1-i];
    arr[arr.length-1-i]=temp;

}
for(int ele:arr){
    System.out.print(ele+" ");
}
    }
    
}
