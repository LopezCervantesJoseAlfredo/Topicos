package parentesis;

import java.util.Stack;

public class PilaClase {
		private String strExpresion;
		   
		   public void setExpresion( String Expresion) 
		   {
			   strExpresion = Expresion;
		   }
		   
		   public String getExpresion() 
		   {
			   return strExpresion;
		   }
		   
		   public boolean VerificarParentesis() {
			   
		   Stack<String> Pila = new Stack<>();
		   char Caracter;
           boolean MensajeError = false;
		   
           for(int x = 0; x < strExpresion.length(); x++)
		   {		   
        	   
        	   Caracter = strExpresion.charAt(x);
        	   
			   if(Caracter == '(') 
			   {
				   Pila.push("(");
			   }
			   if(Caracter == ')') 
			   {
			       if(Pila.empty()) 
					{
					   MensajeError = true;
					   break;
				   }
				   else 
				   {
					   Pila.pop();
				   }
			   } 
		   }
		   if(MensajeError) 
		   {
			  return false;  
		   }
		   else if(!Pila.empty())
		   {
			   return false;
		   }
		   else 
		   {
			   return true;
		   }
		   }
		   }

