/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
/**
 *
 * @author joser
 */
public class ListaSimple {
    
    private Nodo cabeza;
    private Nodo ultimo;
    private int size;

    public ListaSimple() {
        this.cabeza = null;
        this.ultimo = null;
        this.size = 0;
    }

    public Nodo getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }

    public Nodo getUltimo() {
        return ultimo;
    }

    public void setUltimo(Nodo ultimo) {
        this.ultimo = ultimo;
    }
    
    public int Size() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    public boolean isEmpty(){
        
        return size == 0;
        
    }
    
    public boolean add(int valor){
        
        Nodo nuevo = new Nodo(valor);
        
        if(0 == size){ // comprueba que esta vacio
            cabeza = nuevo; // agrega el nuevo a la cabeza y al ultimo
            ultimo = nuevo;
        }else{
            ultimo.setSig(nuevo); // si no esta vacio, agrega al final
            ultimo = nuevo; // selecciona al nuevo como el ultimo
        }
        
        size++;
        
        return true;
        
    }
    
    public boolean addFirst(int valor){
        
        Nodo nuevo = new Nodo(valor);
        
        if(0 == size){ // si esta vacio, simplemente agrega el nodo
            cabeza = nuevo;
            ultimo = nuevo;
        }else{
            nuevo.setSig(cabeza); //si no esta vacio, hace que la cabeza sea el siguiente del nuevo
            cabeza = nuevo; // agrega el nuevo a la cabeza
        }
        size++;
        return true;
    }
    
    @Override
    public String toString(){
        
        Nodo aux = cabeza; //Inicializa el nodo auxiliar con el valor de la cabeza
        String resultado = "";
     
        for(int i = 0; i < size; i++){
            
            resultado +="[" + aux.getDato()+ "] "; //Toma el dato del auxiliar y lo agrega al string
            aux = aux.getSig(); //le da un nuevo valor al auxiliar, el valor dado es del nodo que sigue, osea se corre un campo
            
        }
        
        return resultado;
    }
    
    /**
     * 
     * @param valor
     * @return 
     */
    public int indexOf(int valor){
        
        Nodo aux = cabeza; // Nodo auxiliar
        
        int cont = 0; // un indexOf, en caso de no encontrar el objeto, returna un -1 por defecto
        
        if(size == 0){ // verifica vacio
            return -1;
        }else{
            
            for(int i = 0; i < size; i++){
                
                if(aux.getDato() == valor){ //Verifica si el valor dado esta en la lista
                    return cont; // returna index
                }
                
                aux = aux.getSig();// en caso de no estar en esa posicion, continua con la siguiente
                cont++;// suma al index
                
            }
            
            return -1;// en caso de no estar definitivamente, retorna -1
            
        }
          
    }
    
    
    
    public int get(int index){
        
        int dato;

        ArrayIndexOutOfBoundsException e = null;
        
        Nodo aux = cabeza;
        int cont = 0;
            
        if(size == 0){

            return -1;

        }else{
            for(int i = 0; i < size; i++){

                if(cont == index){
                    dato = aux.getDato();
                    return dato;
                }

                aux = aux.getSig();
                cont++;

            } 
        }
        
//        System.out.println(e.getMessage());
        return -1;
        
    }
    
}
