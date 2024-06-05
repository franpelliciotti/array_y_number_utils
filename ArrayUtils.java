/**
 * Clase ArrayUtils: contiene implementaciones de rutinas fundamentales
 * sobre arreglos.
 * 
 * @author N. Aguirre
 * @version 0.1
 */
public class ArrayUtils
{
    
    /**
     * Comprueba si un elemento (entero) pertenece a un arreglo.
     */
    public boolean pertenece(int elem, int[] arreglo) {
        if (arreglo == null)
            throw new IllegalArgumentException("Arreglo nulo");
        for(int i = 0; i < arreglo.length; i++){
            if(arreglo[i] == elem){
                return true;
            }
        }
        return false;
    }
    
    /**
     * Calcula la suma de los elementos de un arreglo de ENTEROS.
     */
    public int suma(int[] arreglo) {
        if (arreglo == null)
            throw new IllegalArgumentException("Arreglo nulo");
        int suma = 0; 
        for(int i = 0; i < arreglo.length; i++){
            suma += arreglo[i];
        }
        return suma;
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
        int[] fibo = new int[n];
        fibo[1] = 1;
        for(int i = 2; i < fibo.length; i++){
            fibo[i] = fibo[i-1] + fibo[i-2];
        }
        return fibo;
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
    
    /**
     * Ordena un arreglo de reales ascendentemente: /INCOMPLETO.
     * 25134
     * 21534
     * 21354
     * 21345
     * 12345
     */
    public float[] ordArregloAs(float[] arreglo){
        
        return arreglo;
    }
}
