class Student{
    String name;
    public double calculateAvg(double[] data){
        double sum = 0;
        for (int i=0;i < data.length;i++){
            sum += data[i];
        }
        double avg = sum/data.length;
        return avg;
    }

public String judge(double avg){
    String result;
    if(avg>=60){
        result = "pass";
    }else{
        result = "failed";
    }
    return result;
  }
}

public class testJudge {
    public static void main(String[] args){
        Student a001 = new Student();
        a001.name = "sato";
        double[] data = {59,69,80,43,64};
        
        double avg = a001.calculateAvg(data);
        String result = a001.judge(avg);

        System.out.println(avg);
        System.out.println(a001.name + " " +result);

        Student a002 = new Student();
        a002.name = "suzuki";
        double [] data1 = {0,1,0,1,2};

        double avg1 = a002.calculateAvg(data1);
        String result1 = a002.judge(avg1);

        System.out.println(avg1);
        System.out.println(a002.name + " " +result1);

    }
    
}
