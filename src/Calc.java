/**
 * Esta clase proporciona métodos para realizar operaciones aritméticas básicas.
 */
package src;
public class Calc {

    /**
     * Suma dos números enteros.
     *
     * @param n1 el primer número a sumar
     * @param n2 el segundo número a sumar
     * @return la suma de n1 y n2
     */
    public static int suma(int n1, int n2){
        return n1 + n2;
    }

    /**
     * Resta el segundo número entero del primer número entero.
     *
     * @param n1 el número del cual se restará
     * @param n2 el número que se restará de n1
     * @return la diferencia entre n1 y n2
     */
    public static int resta(int n1, int n2){
        return n1 - n2;
    }

    /**
     * Multiplica dos números enteros.
     *
     * @param n1 el primer número a multiplicar
     * @param n2 el segundo número a multiplicar
     * @return el producto de n1 y n2
     */
    public static int multiplicacion(int n1, int n2){
        return n1 * n2;
    }

}
