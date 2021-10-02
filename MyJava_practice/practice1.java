import java.util.Random;

public class practice1 {
    public static void main(String[] args){
        int age;
        Random rand = new Random();
        age = rand.nextInt(50);
        
        if(age>20){
            System.out.println("おとな");
        }else if(age == 20){
            System.out.println("ハタチ");
        }else{
            System.out.println("こども");
        }
        System.out.println(age);
    }   
}