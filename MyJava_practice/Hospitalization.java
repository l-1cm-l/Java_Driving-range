import java.io.*;

public class Hospitalization{
    public static void main(String[] args)throws IOException{
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ご飯の味が薄い入院生活がんばりますか？");
        System.out.println("0…がんばる / 1…入院中にUberEatsを頼んでみる / 2…脱走を試みる / 3…その他");
        int num = Integer.parseInt(br.readLine());
        
        if(num == 0){
            System.out.println("健康になるでしょう");
        }else if(num ==1){
            System.out.println("脳神経外科にも入院しましょう");
        }else if(num == 2){
            System.out.println("入院ではなく投獄されるでしょう");
        }else if(num == 3){
            System.out.println("先生の圧がすごいから大人しくしましょう");
        }else{
            System.out.println("番号は0から3までです。");
        }
    }
}