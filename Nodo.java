/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciopilasedd;

/**
 *
 * @author Santiago
 */

public class Nodo
{
   public Object object; 
   public Nodo next = null;

    public Nodo(Object object)
    {
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public Nodo getNext() {
        return next;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }
}
