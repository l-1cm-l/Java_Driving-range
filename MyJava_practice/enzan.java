public class enzan {
    public static void main(String args[]){
        int num1 = 10;
        int num2 = 2;
        int num3 = 10;

        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        System.out.println(num1 % num2);
        System.out.println(num1 > num2);
        System.out.println(num1 < num2);
        System.out.println(num1 + num2 >= num3);
        System.out.println(num1 >= num3);
        System.out.println(num1 == num3);
        System.out.println(num1 != num3);
        System.out.println(num1 > num2 || num1 < num2);//どちらかが満たせばtrue(AND)
        System.out.println(num1 > num2 && num1 < num2);//両方満たさないとtrueがこない(OR)

        num1 += 10;
        System.out.println(num1);
        num1 -= num2;
        System.out.println(num1);

        num1++;
        System.out.println(num1);

        num1--;
        System.out.println(num1);

    }
}
