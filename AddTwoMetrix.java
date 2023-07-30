public class AddTwoMetrix {
    public static void main(String[] args) {
        int [][]arr1={{1,8,9},
                     {4,6,9}};
       int [][]arr2={{5,7,9},
                     {9,6,4}};
    int [][]sum={{0,0,0,},{0,0,0}};

    for(int i=0;i<arr1.length;i++){
        for(int j=0;j<arr1[i].length;j++){
            sum[i][j]=arr1[i][j]+arr2[i][j];
            System.out.println(sum[i][j]);
        }

    }

}
}
