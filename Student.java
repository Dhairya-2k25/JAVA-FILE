import java.util.*;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

 class StudentManagement {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student("Ravi",85));
        list.add(new Student("Shyam", 78));
        list.add(new Student("Sudha", 92));
        list.add(new Student("Jitesh", 66));
        list.add(new Student("Revanth", 74));

        int total = 0;
        for (Student s : list) {
            total =total+ s.marks;
        }

        double average = total / (double) list.size();

        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
    }
}

