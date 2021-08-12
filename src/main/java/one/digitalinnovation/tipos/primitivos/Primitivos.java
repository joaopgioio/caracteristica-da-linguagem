package one.digitalinnovation.tipos.primitivos;


public class Primitivos {

    public static void main(String[] args){
        //Inteiros

        //bytes nullByte = null;

        byte b;                 // 8 bits
        byte b1 = 127;
        byte b2 = -128;
        //byte b3 = 129;         // to large

        char c;                 // 16 bits
        char c1 = 'A';
        char c2 = 15;
        //char c3 = 'AA';       // NOK
        //char c4 = -100;       // NOK

        short s;                // 16 bits
        short s1 = 32767;
        short s2 = -32768;

        int i = 2147483647;    // 32 bits
        int i2 = -2147483648;
        // int i3 = -2147483649; //to large

        long l = 9223372036854775807l;   // 64 bits
        long l2 = -9223372036854775808l;   // 64 bits
        //long l3 = 9223372036854775808l;   // to large

        // Flutuantes
        float f = 65f; //32 bits   3.402,823,5 E+38
        float f2 = 65.0f;
        float f3 = -0.f; //1.4 E-45

        double d = 1024.99;   // 64 bits 1.797,693,134,862,315,7 E+308
        double d2 = 10.2456; // 4.9 E-324

        // Boleano

        boolean bo = true;
        boolean bo2 = false;
        //boolean bo3 = "false";  //nok
        //boolean bo4 = 'true';   //nok

        //void v; // palavra reservad

        //System.out.println("byte : " + b); //error
    }
}
