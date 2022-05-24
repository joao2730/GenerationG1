package generation;

public class Ejercicio1 {

    public static void main(String[] args) {
        //cálculo área y calculo del perimetro
        //variables estaticas
        //formula de area triangulo
        //impresion

        //formula perimetro circulo
        //impresion


        //Declaracion variables area triangulo
        double base = 5.5;
        double altura = 3.2;
        int constanteTriangulo = 2;
        //Declaracion variables perimetro circulo
        double pi = 3.14;
        double radio = 8;
        //Variable para operación area de triangulo
        double areaTriangulo = (base * altura)/constanteTriangulo;


        //Variable para operación perimetro de circulo
        double perimetroCirculo = (2 * pi) * radio;
        //Se imprime area triangulo
        System.out.println("*********************");
        System.out.println("*  Calculo de area  *");
        System.out.println("*********************");
        System.out.println("El area del triangulo es: " + areaTriangulo);
        //Se imprime perimetro circulo
        System.out.println("*************************");
        System.out.println("*  Calculo de perimetro *");
        System.out.println("*************************");
        System.out.println("El perimetro del circulo es: " + perimetroCirculo);


    }
}
