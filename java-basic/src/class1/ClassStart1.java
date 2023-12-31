package class1;

public class ClassStart1 {
    public static void main(String[] args) {
        Student student = new Student();

        student.name = "학생1";
        student.age = 20;
        student.grade = 80;

        System.out.println("이름: " + student.name + " 나이: " + student.age + " 점수: " + student.grade);
        System.out.println(student);
        
    }
}