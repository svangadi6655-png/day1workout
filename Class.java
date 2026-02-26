class Student{
    int id;
    String name;
    void abDisplay(int a){
        System.out.println(a);
        System.out.println(id+""+name);
    }
}
class Class{
    public static void main(String[] args){
        Student s1=new Student();
        s1.id=101;
        s1.name="abc";
        s1.abDisplay(10);
        Student s2=new Student();
        s2.id=102;
        s2.name="xyz";
        s2.abDisplay(20);
        
    }
}