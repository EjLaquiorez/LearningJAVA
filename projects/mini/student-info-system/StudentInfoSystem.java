public class StudentInfoSystem {

    static class Student {
        String name;
        int age;
        String course;
        double gpa;

        void introduce() {
            System.out.println("Hi, I'm " + name + ".");
            System.out.println("I'm " + age + " years old.");
            System.out.println("I study " + course + ".");
            System.out.println("My GPA is " + gpa + ".");
        }

        boolean isHonorStudent() {
            return gpa >= 3.5;
        }
    }

    public static void main(String[] args) {
        Student[] students = new Student[5];

        students[0] = new Student();
        students[0].name = "Alice Johnson";
        students[0].age = 20;
        students[0].course = "Computer Science";
        students[0].gpa = 3.8;

        students[1] = new Student();
        students[1].name = "Bob Smith";
        students[1].age = 21;
        students[1].course = "Mathematics";
        students[1].gpa = 3.2;

        students[2] = new Student();
        students[2].name = "Carol White";
        students[2].age = 19;
        students[2].course = "Biology";
        students[2].gpa = 3.9;

        students[3] = new Student();
        students[3].name = "David Brown";
        students[3].age = 22;
        students[3].course = "Physics";
        students[3].gpa = 3.4;

        students[4] = new Student();
        students[4].name = "Eva Green";
        students[4].age = 20;
        students[4].course = "Chemistry";
        students[4].gpa = 3.7;

        for (int i = 0; i < students.length; i++) {
            System.out.println("===== Student " + (i + 1) + " =====");
            students[i].introduce();
            
            if (students[i].isHonorStudent()) {
                System.out.println("Honor Student: YES");
            } else {
                System.out.println("Honor Student: NO");
            }
            
            System.out.println();
        }
    }
}