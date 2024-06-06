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
     * Calcula los dígitos de un número entero positivo. //A MODIFICAR
    */
    public ArrayList<Integer> digitos(int n) {
        if (n == 1) throw new IllegalArgumentException ("El número no puede ser cero");
        String caracteres = "";
        int nroCaracteres = caracteres.length();
        
        if(n < 0){
            caracteres = "" + n;
            nroCaracteres = caracteres.length() -1;
        }
        else{
            caracteres = "" + n;
            nroCaracteres = caracteres.length();
        }
        ArrayList<Integer> digitos = new ArrayList<>();
        
        for(int i = nroCaracteres -1; i >= 0; i--){ //Extraer cada número según su posición como potencia decimal.
            int caracterActual = 0;
            if(i < nroCaracteres){
                caracterActual = n;
                caracterActual = caracterActual % 10;
                caracterActual = caracterActual/10;
            }   
            digitos.add(caracterActual);
        }
        System.out.println("El número tiene: " + nroCaracteres + " digitos.");
        for(Integer i: digitos){
            System.out.println(i);
        }
        return digitos;
    }
    
    /**
     * Calcula la suma de los elementos de un arreglo de REALES.
     */
    public float suma(float[] arreglo) {
        float suma = 0; 
        for(int i = 0; i < arreglo.length; i++){
            suma += arreglo[i];
        }
        return suma;
    }
    
    /**
     * Calcula el valor mínimo de un arreglo de reales
     */
    public float minimo(float[] arreglo) {
        if (arreglo == null)
            throw new IllegalArgumentException("Arreglo nulo");
        float minimo = arreglo[0];
        for(int i = 1; i < arreglo.length; i++){
            if(arreglo[i] < arreglo[i-1]){
                minimo = arreglo[i];
            }
        }
        return minimo;
    }
    
    /**
     * Calcula el valor máximo de un arreglo de reales
     */
    public float maximo(float[] arreglo) {
        if (arreglo == null)
            throw new IllegalArgumentException("Arreglo nulo");
        float maximo = arreglo[0];
        for(int i = 1; i < arreglo.length; i++){
            if(arreglo[i] > arreglo[i-1]){
                maximo = arreglo[i];
            }
        }
        return maximo;
    }
    
    /**
     * Calcula el valor promedio de un arreglo de reales
     */
    public float promedio(float[] arreglo) {
        if(arreglo == null)
            throw new IllegalArgumentException("Arreglo nulo");
        float suma = suma(arreglo);
        float cantidad = arreglo.length;
        return suma/cantidad;
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
        if (arreglo == null)
            throw new IllegalArgumentException("Arreglo nulo");
        if (!(arregloOrdenadoAs(arreglo)) && !(arregloOrdenadoDes(arreglo)))
            throw new IllegalArgumentException("El arreglo debe estar ordenado (Ascendente o descendentemente)");
        float mediana = 0;
        for(int i = 0; i < arreglo.length; i++){
            mediana = suma(arreglo) / arreglo.length;
        }
        return mediana;
    }
    
    /**
     * Comprueba si dos arreglos de enteros son iguales
     */
    public boolean iguales(int[] arr1, int[] arr2) {
        if (arr1 == null || arr2 == null)
            throw new IllegalArgumentException("Arreglo/s nulo/s");
        if(arr1.length == arr2.length){
            for(int i = 0; i < arr1.length; i++){
                if(arr1[i] != arr2[i]){
                    return false;
                }
            }
        }
        else{
            return false;
        }
        return true;
    }
    
    /**
     * Comprueba si un arreglo tiene valores repetidos.
     */
    public boolean tieneRepetidos(int[] arreglo) {
        if (arreglo == null)
            throw new IllegalArgumentException("Arreglo nulo");
        for(int i = 0; i < arreglo.length; i++){
            for(int j = 0; j < arreglo.length -1; j++){
                if(i == j){
                    j++;
                }
                else if(arreglo[i] == arreglo[j]){
                    return true;
                }
            }
        }
        return false;
    }
    
    /**
     * Comprueba si un arreglo tiene dos valores cuya suma dé cero.
     */
    public boolean tieneOpuestos(float[] arreglo) {
        if (arreglo == null)
            throw new IllegalArgumentException("Arreglo nulo");
        for(int i = 0; i < arreglo.length; i++){
            float actual = arreglo[i];
            for(int j = 0; j < arreglo.length; j++){
                if(actual + arreglo[j] == 0){
                    return true;
                }
            }
        }
        return false;
    }
    
    /**
     * Chequea si un arreglo de reales esta ordenado ascendentemente.
     */
    public boolean arregloOrdenadoAs(float[] arreglo){
        boolean ordenado = false;
        for(int i = 0; i < arreglo.length -1; i++){
            if(arreglo[i] <= arreglo[i+1]){
                ordenado = true;
            }
            else{
                return false;
            }
        }
        return ordenado;
    }
    
    /**
     * Chequea si un arreglo de reales esta ordenado descendentemente.
     */
    public boolean arregloOrdenadoDes(float[] arreglo){
        boolean ordenado = false;
        for(int i = 0; i < arreglo.length -1; i++){
            if(arreglo[i] >= arreglo[i+1]){
                ordenado = true;
            }
            else{
                return false;
            }
        }
        return ordenado;
    }
}
