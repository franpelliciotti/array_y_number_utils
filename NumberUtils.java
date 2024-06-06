import java.util.ArrayList;
import java.util.Iterator;
/**
 * Clase NumberUtils: contiene implementaciones de rutinas fundamentales
 * sobre números.
 * 
 * @author N. Aguirre
 * @version 0.1
 */
import java.util.ArrayList;

public class NumberUtils
{
    /**
     * Comprueba si un número es primo.
     */
    public boolean esPrimo(int n) {
        int contador = 0;
        for(int i = 1; i < 11; i++){
            if(n % i == 0){
                contador += 1;
            }
        }
        if(contador < 3){
            return true;
        }
        return false;
    }
    
    /**
     * Comprueba si un número es compuesto.
     */
    public boolean esCompuesto(int n) {
        if(n > 1) throw new IllegalArgumentException("El número no puede ser menor a 1.");
        int contador = 0;
        for(int i = 1; i < 11; i++){
            if(n % i == 0){
                contador += 1;
            }
        }
        if(contador >= 3){
            return true;
        }
        return false;
    }

    /**
     * Comprueba si un número es compuesto en base al método esPrimo(n).
     */
    public boolean esCompuesto2(int n) {
        if(n > 1) throw new IllegalArgumentException("El número no puede ser menor a 1.");
        
        if(esPrimo(n)){
            return false;
        }
        return true;
    }
    
    /**
     * Calcula el máximo común divisor de dos números.
     */
    public int maximoComunDivisor(int n, int m) { //en proceso
        if(n <= 0 || m <= 0)
            throw new IllegalArgumentException("Los numeros no pueden ser menores o iguales a cero.");
        int maximo = 0;
        int minimo = 0;
        int mcd = 0;
        if(n > m){
            maximo = n;
            minimo = m;
        }
        else{
            maximo = m;
            minimo = n;
        }
        for(int i = 0; minimo > 0; i++){
            mcd = minimo; //guardamos el valor del minimo.
            minimo = maximo % minimo; //asignamos el resto del máximo y el mínimo al mínimo.
            maximo = mcd; //le asignamos el minimo anterior al máximo.
        }
        return mcd;
    }

    /**
     * Calcula el mínimo común múltiplo de dos números.
     */
    public int minimoComunMultiplo(int n, int m) {
        int maximo = 0;
        int minimo = 0;
        int mcm = maximo;
        if(n > m){
            maximo = n;
            minimo = m;
        }
        else{
            maximo = m;
            minimo = n;
        }

        while (mcm % minimo > 0) {
            mcm += maximo;
        }
        return mcm;
    }
    
    /**
     * Calcula los divisores de un número.
     */
    public ArrayList<Integer> divisores(int n) {
        ArrayList<Integer> divisores = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                divisores.add(i);
            }
        }
        for(Integer i: divisores){
            System.out.println(i);
        }
        return divisores;
    }
    
    /**
     * Calcula los primeros n números primos //A modificar
     */
    public int[] primos(int n) {
        int[] primos = new int[n];
        for(int i = 0; i < primos.length; i++){
            for(int j = 0; j < primos.length; j++){
                if(esPrimo(j)){
                    primos[j] = j;
                }
            }
        }
        return primos;
    }
    
    /**
     * Calcula el n-ésimo número de Fibonacci
     */
    public int nthFib(int n) {
        if(n <= 0) throw new IllegalArgumentException("El número no puede ser menor a uno.");
        int numero = 0;
        if(n == 1){
            numero = 0;
        }
        else if(n == 2){
            numero = 1;
        }
        return numero;
    }
    
    /**
     * Calcula los dígitos de un número entero positivo.
     */
    public ArrayList<Integer> digitos(int n) {
        //TODO: Completar la implementación, reemplazando la línea siguiente
        return null;
    }
    
    /**
     * Calcula el valor mínimo de un arreglo de reales
     */
    public float minimo(float[] arreglo) {
        //TODO: Completar la implementación, reemplazando la línea siguiente
        return 0;
    }
    
    /**
     * Calcula el valor máximo de un arreglo de reales
     */
    public float maximo(float[] arreglo) {
        //TODO: Completar la implementación, reemplazando la línea siguiente
        return 0;
    }
    
    
    /**
     * Calcula el valor promedio de un arreglo de reales
     */
    public float promedio(float[] arreglo) {
        //TODO: Completar la implementación, reemplazando la línea siguiente
        return 0;
    }
    
    /**
     * Retorna un arreglo con los primeros n números de Fibonacci
     */
    public int[] fibSequence(int n) {
        //TODO: Completar la implementación, reemplazando la línea siguiente
        return null;
    }
    
    /**
     * Calcula la mediana de un arreglo de reales
     */
    public float mediana(float[] arreglo) {
        //TODO: Completar la implementación, reemplazando la línea siguiente
        return 0;
    }
    
    /**
     * Comprueba si dos arreglos de enteros son iguales
     */
    public boolean iguales(int[] arr1, int[] arr2) {
        //TODO: Completar la implementación, reemplazando la línea siguiente
        return false;
    }
    
    /**
     * Comprueba si un arreglo tiene valores repetidos
     */
    public boolean tieneRepetidos(int[] arreglo) {
        //TODO: Completar la implementación, reemplazando la línea siguiente
        return false;
    }
    
    /**
     * Comprueba si un arreglo tiene dos valores cuya suma dé cero.
     */
    public boolean tieneOpuestos(float[] arreglo) {
        //TODO: Completar la implementación, reemplazando la línea siguiente
        return false;
    }
    
}
