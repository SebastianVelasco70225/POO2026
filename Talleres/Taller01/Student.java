package Talleres.Taller01;

public class Student {

    private String name;
    private int studentID;
    private double grade1;
    private double grade2;
    private double grade3;
    private double average;
    private int count=0;     

    public void setStudentId(int id){
        if (count==0) {
            this.studentID=id;
            count+=1;
        }
        else{
            System.out.println("Luego de establecer el código de estudiante no es posible cambiarlo");
        }
    }

    public void setName(String name){
        if (name==null||name==""){
            System.out.println("Nombre inválido");
        }
        else {
            this.name=name;
        }
    }
    
    public void setGrade1(double grade){
        if (comprobation(grade)){
            this.grade1=grade;
            average=(grade1+grade2+grade3)/3;
        }
        else{
            System.out.println("Nota inválida");
        }
    }
    
    public void setGrade2(double grade){
        if (comprobation(grade)){
            this.grade2=grade;
            average=(grade1+grade2+grade3)/3;
        }
        else{
            System.out.println("Nota inválida");
        }
    }
    
    public void setGrade3(double grade){
        if (comprobation(grade)){
            this.grade3=grade;
            average=(grade1+grade2+grade3)/3;
        }
        else{
            System.out.println("Nota inválida");
        }
    }

    public void getAverage(){
        System.out.println("El promedio de notas es: "+average);
    }

    private boolean comprobation(double grade){
        if (grade<0||grade>5){
            return false;
        }
        return true;
    }

    public void getInfo(){
        System.out.println("Nombre estudiante: "+name);
        System.out.println("ID estudiante: "+studentID);
        System.out.println("Nota 1: "+grade1);
        System.out.println("Nota 2: "+grade2);
        System.out.println("Nota 3: "+grade3);
        System.out.println("Promedio: "+average);
    }
}
