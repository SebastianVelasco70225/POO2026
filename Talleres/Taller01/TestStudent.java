package Talleres.Taller01;

public class TestStudent {
    public static void main(String[] args) {
        Student student= new Student();
        student.setStudentId(70225);
        student.setStudentId(10);
        student.setGrade1(3.4);
        student.getAverage();
        student.setGrade2(3.4);
        student.getAverage();
        student.setGrade3(5.0);
        student.getAverage();
        student.setGrade1(-8);
        student.setGrade2(10);
        student.setGrade3(5.1);
        student.getAverage();
        student.setName("Sebastián");
        student.setName(null);
        student.getInfo();
    }
}
