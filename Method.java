public class Method{
    static void printing(){
        System.out.println("hello world");
    }
    static void sum(int a,int b){
        System.out.println(a+b);
    }
    static int abc(){
        return 0;
    }
    static int add(int a,int b){
        return a+b;
    }
    public static void main(String[] args){
        printing();
        sum(10,20);
        System.out.println(abc());
        int result=add(5,10);
        System.out.println(result);
    }
}