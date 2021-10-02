public class kurikaesi {
    public static void main (String args[]){
        for (int i = 0;i <= 50;i++){
            for (int j = 0;j <= 5;j++){
            if(i == 20){
                break;
            }
            if(i % 2 != 0){
                continue;
            }
            System.out.println(i+"&"+j);

        int arr[] = {2,4,6,8,10};
        int sum = 0;
            for(int k =0;k <=4;k++){
                sum += arr[k];
                System.out.println(arr[k]);
                System.out.println(sum);
            }
        }
    }
  }
}
