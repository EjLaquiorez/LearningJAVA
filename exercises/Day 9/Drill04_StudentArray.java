public class Drill04_StudentArray {

    static class Student {
    String name;
    int age;
    String major;
    double gpa;
}

    public static void main(String[] args) {
        Student[] students = new Student[5];

        students[0] = new Student();
        students[0].name = "Alice Johnson";
        students[0].age = 20;
        students[0].major = "Computer Science";
        students[0].gpa = 3.8;

        students[1] = new Student();
        students[1].name = "Bob Smith";
        students[1].age = 21;
        students[1].major = "Mathematics";
        students[1].gpa = 3.5;

        students[2] = new Student();
        students[2].name = "Carol White";
        students[2].age = 19;
        students[2].major = "Biology";
        students[2].gpa = 3.9;

        students[3] = new Student();
        students[3].name = "David Brown";
        students[3].age = 22;
        students[3].major = "Physics";
        students[3].gpa = 3.2;

        students[4] = new Student();
        students[4].name = "Eva Green";
        students[4].age = 20;
        students[4].major = "Chemistry";
        students[4].gpa = 3.7;

        for (int i = 0; i < students.length; i++) {
            System.out.println("Name: " + students[i].name);
            System.out.println("Age: " + students[i].age);
            System.out.println("Major: " + students[i].major);
            System.out.println("GPA: " + students[i].gpa);
            System.out.println();
        }
    }
}