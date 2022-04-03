/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciopilasedd;

/**
 *
 * @author Santiago
 */
public class InfijaaPosfija
{   
    public void evaluar(String infija)
    {
        Pila expEntrada = new Pila();
        Pila pilaOperadores = new Pila();
        Pila expSalida = new Pila();   
        
        // Se limpia la expresion infija(para evitar futuros errores)
        //la separamos por caracteres y se introduce en un array tipo String
        String expInfija = depurar(infija);
        String[] arrayInfija = expInfija.split(" ");
        
        //Se añade cada elemento del array como nodos diferentes en la pila
        for(int p = arrayInfija.length - 1; p >= 0; p--)
        {
            expEntrada.push(p);
        }
        
        try
        {
            //Switch case para convertir la expresion infija a postfija
            while(expEntrada.isEmpty())
            {
                switch(pref((String) expEntrada.peek()))
                {
                    case 1:
                        pilaOperadores.push(expEntrada.pop());
                        break;
                    case 3:
                    case 4:
                        while(pref((String) pilaOperadores.peek()) >= pref((String) expEntrada.peek()))
                        {
                            expSalida.push(pilaOperadores.pop());
                        }
                        pilaOperadores.push(expEntrada.pop());
                        break;
                    case 2:
                        while(!pilaOperadores.peek().equals("("))
                        {
                            expSalida.push(pilaOperadores.pop());
                        }
                        pilaOperadores.pop();
                        expEntrada.pop();
                        break;
                    default:
                        expSalida.push(expEntrada.pop());
                }
            }
            // Filtra la expresion convertida y se guarda en la variable 
            String expPosfija = expSalida.toString().replaceAll("[\\]\\[,]", "");
            
            // Muestra la expresion convertida a posfija
            System.out.println("La expresion convertida a Posfija es: " + expPosfija);
        }catch(Exception ex){
            System.out.println("Hay un error en la expresión ingresada");
        }
    }
    // Metodo que elimina elementos no deseados en la expresion infija
    public static String depurar(String n)
    {
        // Elimina espacios en blanco
        n = n.replaceAll("\\n+", "");
        // Escribe la expresion entre parentesis
        n = "(" + n + ")";
        String operadores = "+-*/()";
        String texto = "";
            
        for(int i = 0; i < n.length(); i++)
        {
            if(operadores.contains("" + n.charAt(i)))
            {
                texto = texto + " " + n.charAt(i) + " ";
            }else{
                texto = texto + n.charAt(i);
            }
        }
        return texto.replaceAll("\\n+", " ").trim();
    }
    
    // Metodo para reconocer la jerarquia de los operadores
    public static int pref(String operador)
    {
        int o = 0;
        if(operador.equals("^"))
        {
            o = 5;
        }
        if(operador.equals("*") || operador.equals("/"))
        {
            o = 4;
        }
        if(operador.equals("+") || operador.equals("-"))
        {
            o = 3;
        }
        if(operador.equals(")"))
        {
            o = 2;
        }
        if(operador.equals("("))
        {
            o = 1;
        }
        return o;
    }
}
