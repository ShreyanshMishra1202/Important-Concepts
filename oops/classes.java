import java.util.Arrays;

public class classes {
    public static void main(String[] args) {
        Student[] st=new Student[5];
        System.out.println(Arrays.toString(st));
        Student s1;
        s1=new Student();
        // s1.roll=19;
        // s1.name="Shreyansh";
        //It can be initialized here.
        System.out.println(s1.roll);
        System.out.println(s1.name);
        System.out.println(s1.marks);
    }
}
class Student{
    int roll;
    String name;
    // float marks=90.0f;  // it can also be initialized here
    float marks;

    void greeting(){
        System.out.println("Exam :: "+name);
    }
    public Student() { 
        this.roll=18;
        this.name="Shreyansh";
        this.marks=98.0f;

    }

    
}
