package generation;

public class Main {
    public static void main(String[] args) {
        //variables
        //en java a diferencia de javascript
        //se define el tipo de dato al cula pertenecera la variable
        //tipo de dato //string son textos y van entre comillas siempre
        String nombre = "Joao \n280779837";//nombre = "Joao" \n es salto de linea
        //la palbra String es en mayuscula siempre
        System.out.println(nombre);

        //16bits (un solo caracter entre comillas simples)
        char letraA = 'a';

        //variables numericas es int y long datos primitivos
        //32bits
        int numeroInt = 2147483647;
        System.out.println(numeroInt);

        //8bits
        byte numeroByte = 127;
        System.out.println(numeroByte);

        //16bits
        short numeroShort = 32767;
        System.out.println(numeroShort);

        //64bits (2^263)
        long numeroLong = 922337204;
        System.out.println(numeroLong);

        //float y double (aceptan decimales)

        //variable booleana (true o false)
        boolean acepta = true;//false

        String curso = "G1";

        //los String se comparan con equals
        if(curso.equals("g1")){
            System.out.println("iguales");
        }else {
            System.out.println("distintos");
        }

        if(curso.equalsIgnoreCase("g1")){
            System.out.println("iguales");
        }else {
            System.out.println("distintos");
        }

        if(curso.toLowerCase().equals("g1")) {
            System.out.println("iguales");
        }

        if(curso.equals("g1".toUpperCase())){
            System.out.println("iguales");
        }

        String curso2 = "";//vacio
        String curso3 = null;    //null

        //comparar un String con null
        if(null == curso3) {}

        curso2.isEmpty();
        curso2.isBlank();

        //Float y Double
        //cast es convertir un dato a otro tipo de dato
        float altura = (float) 1.75;//1.75f;

        Float peso = 85.0f;

        float gravedad = Float.parseFloat("9.6");

        //PARSE: convertir String a un tipo de numero
        Integer.parseInt("23");
        Long.parseLong("12484576634");
        Float.parseFloat("85.1");
        Double.parseDouble("1274623847918.646");

        //ejercicio

        Integer a = 56;
        float b = a.floatValue();
        System.out.println(b);

        int i = 56;
        float f = i;
        System.out.println(f);

        int c = 85;
        double g = c;
        System.out.println(g);

        int p = 78;
        Double h = Double.valueOf(p);
        System.out.println(h);

        /*CONVERSION DE DATOS*/
        //automatica
        //byte>short>int>float>double// de una caja mas pequeña a una mas grande

        int num4 = 18;
        float num4f = num4;
        System.out.println(num4 +" "+num4f);

        //manual// minuscula tipo primitivo y mayuscula tipo objeto
        //double>float>long>int>...//de una caja mas grande a una mas pequeña
        Double peso2 = 75.9;
        Float peso2f = peso2.floatValue();//sin f es double primitivo

        /*float peso2PF = peso2.floatValue();
        Float peso2F = peso2PF;*/ //la misma manera un poco mas larga

        float numPrimitivo = 123.4f;
        Float numObjeto = 123.45f;

        // de float a int, SE PIERDEN LOS DECIMALES
        // Float a Integer, SE PIERDEN LOS DECIMALES

        //+ - * / % (operadores)
        // == != > >= < <= (comparacion)

        int dos = 22131;
        int tres = 31312;

        if( 5 == (tres + dos) ) {}





    }



}
