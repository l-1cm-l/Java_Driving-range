class Student{
    String name = "sato";
    public void calculateAvg(int math,int english){
        System.out.println((math+english)/2);
    }
}

public class kurasu {
    public static void main(String args[]){
        Student a0001 = new Student();
        a0001.name = "sato";
        System.out.println(a0001.name);
        a0001.calculateAvg(90,80);

        Student a0002 = new Student();
        a0002.name = "suzuki";
        System.out.println(a0002.name);
        a0002.calculateAvg(80,89);
    }
}
