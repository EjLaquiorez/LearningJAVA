public class Drill03_Student {
    
    static class Student{
        String name;
        int age;
        String course;
    }

    public static void main(String[] args) {
        
        Student student1 = new Student();

        student1.name = "Justin Laqz";
        student1.course = "Bachelor of Science in Computer Science";
        student1.age = 27 ;
        Introduce(student1);
    }
    public static void Introduce(Student student1){
        System.out.println("My name is " + student1.name +
        " a graduate of " + student1.course + "," + student1.age +
        " years of age.") ;
    }
}
