package StartingJava;
public class JavaVariablesAndDataTypes {
    public static void main(String[] args) {
        // Integers ---> byte 8,short 16,int 32,long 64
        byte b = 34;
        short s = 76;
        int i = 23456;
        long l = 23456789;

        System.out.println("Byte Value is " + b);
        System.out.println("Short Value is " + s);
        System.out.println("Int Value is " + i);
        System.out.println("Long Value is " + l);

        // RealNumbers ---> float 32 , double 64
        float f = 12.34f;
        double d = 1234.5678;
        System.out.println("Float Value is " + f);
        System.out.println("Double Value is " + d);

        // Character datatype ----> char 16 (UniCode)
        char c = 'c';
        System.out.println("Character Value is " + c);

        // Boolean datatype ----> Boolean (True , False)
        Boolean bool = false;
        System.out.println("Boolean Value is " + bool);
    }
}
