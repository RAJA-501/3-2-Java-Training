import java.util.*;


class Student {
String name;
int age;
int marks;


Student(String name, int age, int marks) {
this.name = name;
this.age = age;
this.marks = marks;
}
}


public class StudentInformationSystem {


public static void main(String[] args) {
ArrayList<Student> students = new ArrayList<>();


students.add(new Student("Rahul", 20, 85));
students.add(new Student("Aisha", 19, 92));
students.add(new Student("Kiran", 21, 78));


System.out.println("Student Records");
System.out.println("----------------");
for (Student s : students) {
System.out.println("Name: " + s.name + ", Age: " + s.age + ", Marks: " + s.marks);
}
int total = 0;
for (Student s1 : students) {
total += s1.marks;
}


double average = (double) total / students.size();
System.out.println("----------------");
System.out.printf("Average Marks: %.2f%n", average);
}
}