/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Santiago
 */
public class Pila {
    String [] BatteryV;
    int elements;
    int cup;
    
    public Pila(int size){
        elements = size;
        BatteryV=new String [elements];
        cup = -1;
    }
    
    public boolean fullBattery(){
        if (cup == elements-1){
            return (true);
        }
        return (false);
    }
    public boolean emptyBattery(){
        if (cup ==-1){
            return (true);
        }
        return (false);
    }
    public void elementEntry(String element){
        if (!fullBattery()){
            cup ++;
            BatteryV[cup]=element;
            elements++;          
        }
    }
    public String seeCupbattery(){
        return (BatteryV[cup]);
        
    }
    public String extractElement(){
        String aux = "";
        if (!emptyBattery()){
            aux = BatteryV[cup];
            cup--;
            elements--;
               
    }
    return (aux);
    }
   
}
