/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Santiago
 */

public class Nodo {
    String Cexpression;
    int index;
    
    public Nodo (String expression){
        this.index = 0;
        Cexpression=new String();
        Cexpression=expression;
    }
    
    public String returnn (){
        String Aux=Cexpression.substring(index, index+1);
        index ++;
        return (Aux);
    }
    
    public void finalCharacterElement (String charact){
        Cexpression = Cexpression.concat(charact);
    }
    
    public int Characters (){
        return Cexpression.length();
    } 
}
