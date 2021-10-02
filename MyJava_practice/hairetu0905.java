public class hairetu0905 {
    public static void main(String args[]){
        int arr[][] = {{1,3,5,7,9},{2,4,6,8,10}};
        int sum = 0;
        for(int i=0;i<=5;i++){
            for(int j=0;j<=5;j++){
                if(i == 5){
                    break;
                }
                if(j == 5){
                    break;
                }

                sum += arr[i][j];
            }
            System.out.println(sum);
        }
    }
}
