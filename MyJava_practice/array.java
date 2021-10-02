public class array {
    public static void main(String args[]){
        String[] arr = {"太郎","光","浩二"};

        arr[1] = "闇";

        System.out.println(arr[0] );
        System.out.println(arr[1] );
        System.out.println(arr[2] );

        String[][] arr2;
        arr2 = new String[2][2];

        arr2[0][0] = "斉藤";
        arr2[0][1] = "根本";
        arr2[1][0] = "岸田";
        arr2[1][1] = "山崎";

        System.out.println(arr2[0][0]);
        System.out.println(arr2[0][1]);
        System.out.println(arr2[1][0]);
        System.out.println(arr2[1][1]);

        String[][] arr3 ={{"高橋","ヤマダ"},{"正弘","電機"}};

        System.out.println(arr3[0][1]);
        System.out.println(arr3[1][1]);
    }
    
}
