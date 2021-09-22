public class ejercicios {

    /*
    Maximo comun divisor (mcd), algoritmo de Euclides
    a = 412 y b = 184
     */
    /*public static int mcd(int a, int b){
        int mcd;

        if(a == b){
            //caso base
            mcd = b;

        } else {
            if(a > b){
                a = a - b;
            }else {
                b = b - a;
            }
            mcd = mcd(a,b);
        }
        return mcd;
    }
    /*
    Suma de los elementos de un vector
    vector = {2, 4, 6}
    suma = 2 + {4, 6}
    suma = 4 + {6}
    suma = 6 (caso base)
     */
    /public static int sumaVector(int[] vector, int indice){
        int suma;

        if(indice == vector.length - 1){
            suma = vector[indice];
        } else {
            suma = vector[indice] + sumaVector(vector, indice + 1);


        }
        return suma;
        // Invertir cadena con recursividad
    }
    public  static  String  InvertirPalabra ( String  palabra , int  longitud ) {
        si (longitud == 0 ) {
            volver palabra . charat (longitud) + " " ;


        } más
        volver palabra . charAt (longitud) + InvertirPalabra (palabra, longitud - 1 );


    }
    public  static  void  main ( String [] args ) {
        Escáner teclado =  nuevo  Escáner ( Sistema . En);
        String palabra;
        int longitud;
        Sistema . fuera . println ( " ingrese una palabra " );
        palabra = teclado . Siguiente();
        longitud = palabra . largo();
        String palabra_invertida = InvertirPalabra (palabra, longitud - 1 );
        Sistema . fuera . println ( " La palabra invertida es " + palabra_invertida);
    }

}
