import java.util.Scanner;

public class repasoja {
        static Scanner objtecla1=new Scanner(System.in); //atrivutos objetos global
        //variables atributos
        static int a=10;
        static char b;
        static short c;
        float d;
        static double e=5;
        long f;
    //metodo funciones
    public static void saludo() {
       //variable local
        System.out.println("dime tu nombre");
        String nombre=objtecla1.next();
        System.out.println("hola "+nombre);
    }
    public static void saludo2() {
        System.out.println("hola");
    }
    public static void obasciacas() {
        System.out.println("Suma: "+(a+e));
        System.out.println("Resta: "+(a-e));
        System.out.println("Divicion: "+(a/e));
        System.out.println("Multiplicacion: "+(a*e));
        System.out.println("Potncia: "+(Math.pow(a,e)));
    }

    public void obasciacas2() {
        System.out.println("Suma: "+(a+e));
        System.out.println("Suma: "+(a-e));
        System.out.println("Suma: "+(a/e));
        System.out.println("Suma: "+(a*e));
        System.out.println("Suma: "+(Math.pow(a,e)));
    }

    public static void main(String[] args) {
      //saludo();
      obasciacas();


      repasoja objRJ=new repasoja();
      objRJ.obasciacas2();
    }
    
}
