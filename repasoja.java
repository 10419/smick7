import java.util.Scanner;

public class repasoja {
        static Scanner objtecla1=new Scanner(System.in); //atrivutos objetos global
        //variables atributos
        static int a=10;
        static char b;//una sola letra o Numero
        static short c;
        float d;
        static double e=5;//mas grande que el float
        long f;//mas grande que int
        Integer j;
        Double h;
        Long L;
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
        System.out.println("Potencia: "+(Math.pow(a,e)));
    }

    public void obasciacas2() {
        System.out.println("Suma: "+(a+e));
        System.out.println("Suma: "+(a-e));
        System.out.println("Suma: "+(a/e));
        System.out.println("Suma: "+(a*e));
        System.out.println("Suma: "+(Math.pow(a,e)));
    }
    public static void numerospareshasta100() {
        for(int contador=0;contador<100;contador++){
            if(contador%2==0){
                System.out.println("los numeors pares son :"+contador);
            }
        }
    }
    public static void numerosfibo(){
        int numAnt=0;
        int numNue=1;
        int numTem=0;
        int contador=1;
        System.out.println("numeros fibonaci");
        int numFinal=objtecla1.nextInt();
        while(contador<numFinal){
            numTem=numNue;
            numNue=numAnt+numNue;
            numAnt=numTem;
            contador++;
            System.out.println("el numero fibonachi es:"+numFinal+"es:"+numNue);
        }

    }
    
    public static void menuMain(){
        String mensaje="Seleccion el algoritmo que desea ejecutar:"+
        "\n1=salud0"+
        "\n2=saludo2"+
        "\n3=obasciacas "+
        "\n4=obasciacas2"+
        "\n5=numeroshasta100"+
        "\n6=numerosfibonachi"+
        "\n0=Salir del programa";
        
        System.out.println(mensaje);
        int opcion=0;
        do{
            opcion=objtecla1.nextInt();
            switch(opcion){
                case 1: saludo();break;
                case 2: saludo2();;break;
                case 3: obasciacas();;break;
                case 5: numerospareshasta100();;break;
                case 6: numerosfibo();;break;
                
            }
            if(opcion!=0)
            System.out.println("\n Desea seguir probando: "+mensaje);
            
        }while(opcion!=0);        
    }
    public static void main(String[] args) {
        menuMain();
    }

    
}
