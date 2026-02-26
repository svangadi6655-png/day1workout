public class Grade{
    public static void main(String[] args){
        float a=67;
        String g;
        g=(a>=90)?"A":(a>=75)&&(a<=89)?"B":(a>=50)&&(a<=75)?"C":(a<50)?"F":"p";
        System.out.println("grade"+g);
    }
}