/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Santiago
 */

import java.util.Scanner;
public class Main{
    
    
   public static void main (String[] args)
   {
        String operators = "+-*/+!=";
        String postFija = new String ();
        Pila battery = new Pila (50);
       
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite la expresión infija para convertirla a postfija: \n");
        String notation = scan.nextLine();
        Nodo infija = new Nodo(notation);
       
        battery.elementEntry("(");
        infija.finalCharacterElement("(");
        for (int i = 0; i <infija.Characters(); i++)
        {
            String cadena = infija.returnn();
            if (cadena.equals("("))
            {
                battery.elementEntry(cadena);         
            }else if (!operators.contains(cadena) && !cadena.endsWith(")"))
            {
                postFija=postFija.concat(cadena);
            }
                    
            if (operators.contains(cadena))
            {
                if (cadena.equals("!"))
                {
                    
                }
                else{
                    String Aux=battery.seeCupbattery();
                    int precedenceC = operators.indexOf(cadena);
                    int precedenceA = operators.indexOf(Aux);
                    while (precedenceA>=precedenceC && !Aux.equals("(")){
                        postFija=postFija.concat(battery.extractElement());
                        Aux=battery.seeCupbattery();
                        precedenceA=operators.indexOf(Aux);
                    }
                }
                battery.elementEntry(cadena);
            }
            if(cadena.equals(")"))
            {
                String Aux=battery.seeCupbattery();
                while (!Aux.equals("(") )
                {
                    postFija=postFija.concat(battery.extractElement());
                    Aux=battery.seeCupbattery();
                }
                battery.extractElement();
                
            }
        }
    System.out.println("La expresion postfija es: "+postFija);
    }
}
        


