
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
        //TODO: Completar la implementación, reemplazando la línea siguiente
        return false;
    }
    
    /**
     * Calcula la suma de los elementos de un arreglo de ENTEROS.
     */
    public int suma(int[] arreglo) {
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
        //TODO: Completar la implementación, reemplazando la línea siguiente
        return 0;
    }
    
    /**
     * Calcula el valor máximo de un arreglo de reales
     */
    public float maximo(float[] arreglo) {
        if(arreglo == null)
            throw new IllegalArgumentException("Arreglo nulo");
        float suma = 0;
        float cantidad = arreglo.length;
        for(int i = 0; i < arreglo.length; i++){
            suma += arreglo[i];
        }
        return suma/cantidad;
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
     * 
     */
    public float[] ordArregloAs(float[] arreglo){
        float minimo = arreglo[0];
        float maximo = arreglo[0];
        for(int i = 0; i < arreglo.length; i++){
            for(int j = 1; j < arreglo.length -1; j++){
                if(arreglo[i] > arreglo[j]){
                    maximo = arreglo[i];
                    minimo = arreglo[j];
                    arreglo[j] = maximo;
                    arreglo[i] = minimo;
                }
            }
        }
        return arreglo;
    }
}
