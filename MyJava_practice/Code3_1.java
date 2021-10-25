import java.util.Random;
public class Code3_1 {
    public static void main(String[] args){
        Random r = new Random();
        boolean b = r.nextBoolean();
        if (b == true){
            System.out.println("運動します_"+b);
        }else{
            System.out.println("Netflix_"+b);
        }
    }
}
