import java.util.Scanner;

public class raa {
    static Scanner tecla=new Scanner(System.in);
    public static void suma() {
        int num1=0, num2=0;
        System.out.println("ingrese el numero 1:");
        num1=tecla.nextInt();
        System.out.println("ingrese el6 numero 2:");
        num2=tecla.nextInt();
        System.out.println("la suma es:" +(num1+num2));
    }
    public static void multiplicacion() {
        int num1=0, num2=0;
        System.out.println("ingrese el numero 1:");
        num1=tecla.nextInt();
        System.out.println("ingrese el6 numero 2:");
        num2=tecla.nextInt();
        System.out.println("la suma es:" +(num1*num2));
        
    }
    public static void nterminos() {
        int nu=0, su=0;
        System.out.println("ingrese un numero:");
        nu=tecla.nextInt();
        for (int i=20; i >= 2; i -= 2)
        su=nu*(nu+1)/2;
        System.out.println("la suma de los "+nu+"primeros numeros es:"+su);
    }

    public static void main(String[] args) {
        nterminos();
    }
}
