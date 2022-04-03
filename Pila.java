/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciopilasedd;

/**
 *
 * @author Santiago
 */

public class Pila
{
    public Nodo cima = null;
    public Object object;
    int count = 0;
    
    // Metodo para apilar nodos que contienen objetos
    public void push(Object object)
    {
        Nodo newnodo = new Nodo(object);
        if(cima == null)
        {
            cima = newnodo;
            count = count + 1;
        }else{
            // Se verifica que el objeto que contiene el nodo a ingresar 
            // no esté vacio para prevenir futuros errores.
            if(object != null)
            {
                newnodo.next = cima;
                cima = newnodo;
                count = count + 1;
            }
        }
    }
    
    // Metodo eliminar ultimo elemento agregado a la pila
    public Object pop()
    {
        if(cima != null)
        {
            Nodo temporal = cima;
            cima = cima.next;
            count = count - 1;
            return temporal.object;            
        }else{
            return null;
        }
    }
            
            
    // Metodo desapilar
    public void popR()
    {
        if(cima != null)
        {
            Nodo remove = cima;
            cima = cima.next;
            remove.next = null;
            count = count - 1;
            
        }else{
            System.out.println("La pila se encuentra vacia");
            
        }
    }
    
    // Meotod para obtener el objeto contenido en el nodo cima
    public Object peek()
    {
        return cima.object;
    }
    
    // Metodo para saber el numero de nodos de la pila
    public int size()
    {
        return count;
    }
    
    // Metodo para saber si la pila se encuentra vacia
    public boolean isEmpty()
    {
        return cima == null;
    }
    
    // Metodo para convertir a tipo texto cualquier objeto
    public String toString()
    {
        Nodo temporal = cima;
        String out = "";
        while(temporal != null)
        {
            out = out + temporal.object;
            temporal = temporal.next;
        }
        return out;
    }
    
    public void print()
    {
        Nodo temporal = cima;
        // Cuando el nodo temporal apunte a null, entonces no abran mas nodos en la pila
        while(temporal != null)
        {
            // Va recorriendo e imprimiendo nodo por nodo separados por una ","
            System.out.print(temporal.object + ",");
            temporal = temporal.next;          
        }
    }  
}
