import java.util.Random;
public class bunki {
    public static void main(String args[]){
        Random rand = new Random();
        int age = rand.nextInt(30);
        System.out.println(age);
        if (age > 20){
            System.out.println("成人");
        }
        else if(age == 20){
            System.out.println("ハタチ");
        }
        else{
            System.out.println("未成年");
    }
  }  
}