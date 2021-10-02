public class Test0905 {
    public static void main(String args[]){
    for(int i = 0;i < 5;i++){
    for(int j = 5;j < 10;j++){
        if(i==4){
            break;
        }
        if(i==1){
            continue;
        }
        if(i+j == 8){
            System.out.println("合計が8");
        }
        System.out.println(i+ "_" +j);
    }
   }
 }
}

class Testarray{
    public static void main(String args[]){
        int arr[] = {2,4,6,8,10};
        int sum = 0;

        for(int i =0;i < 5;i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
}