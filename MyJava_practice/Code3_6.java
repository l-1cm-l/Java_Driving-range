public class Code3_6 {
    public static void main(String[] args){
        int fortune = new java.util.Random().nextInt(5);
        switch (fortune){
            case 0:
            System.out.println("大吉_"+fortune);
            break;

            case 1:
            System.out.println("中吉_"+fortune);
            break;

            case 2:
            System.out.println("小吉_"+fortune);
            break;

            case 3:
            System.out.println("凶_"+fortune);
            break;

            case 4:
            System.out.println("大凶_"+fortune);
            break;
        }
    }
}
