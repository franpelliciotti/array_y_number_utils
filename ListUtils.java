import java.util.ArrayList;
import java.util.List;
/**
 * Implementaciones de rutinas utilitarias para listas.
 * 
 * @author Francine 
 * @version 0.1
 */
public class ListUtils
{
    /**
     * Realiza una búsqueda lineal por una lista.
     * @return true si el elemento pasado es encontrado.
     */
    public boolean busquedaLineal(ArrayList<Integer> lista, int elem){
        for(int i = 0; i < lista.size(); i++){
            if(lista.get(i) == elem){
                return true;
            }
        }
        return false;
    }
    
    /**
     * Chequea si una lista está ordenada ascendentemente.
     */
    public boolean ordAs(ArrayList<Integer> lista){
        for(int i = 1; i < lista.size(); i++){
            if(lista.get(i) < lista.get(i-1)){
                return false;
            }
        }
        return true;
    }
    
    /**
     * @return La lista del parámetro ordenada por inserción.
     */
    public ArrayList<Integer> ordInsercion(ArrayList<Integer> lista){
        return null;
    }
    
    /**
     * @return La lista del parámetro ordenada por selección.
     */
    public ArrayList<Integer> ordSeleccion(ArrayList<Integer> lista){
        return null;
    }
    
    /**
     * @return La lista del parámetro permutada aleatoriamente.
     */
    public ArrayList<Integer> permutacionAleatoria(ArrayList<Integer> lista){
        return null;
    }
    
    public ArrayList<Integer> merge(ArrayList<Integer> lista1, ArrayList<Integer> lista2){
        if(!ordAs(lista1) && !(ordAs(lista2))) throw new IllegalArgumentException("La listas deben estar ordenadas.");
        return null;
    }
}
