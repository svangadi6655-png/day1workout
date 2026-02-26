class Student
{
    Student(){
        System.out.println("constructor working");
    }
    Student(double a){
        System.out.println(a);
    }
    Student(int a,int b){
        System.out.println(a+b);
    }
}
    public class Constructor {
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student(1); 
         Student s3=new Student(10,20);

    }
}
