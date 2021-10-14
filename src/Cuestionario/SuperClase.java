package Cuestionario;

import java.util.StringTokenizer;

public class SuperClase 
{
	  String[] preguntas = {
		        "Para que sirve JDK Java?", "Aplicacion mas recomendada por el profesor para desarrollo de java?", "Creador de java?",
		        "Cuales son las versiones de Java que hay?", "Sofware donde se desarrollo esta aplicacion?"
		    };
		    
		   public String obtenerPregunta(int posicion){
		        return preguntas[posicion];
		    }
		    
		    String[] RespuestasPregunta1 = {"Desarrollar Aplicaciones","Jugar","Ejecutar Aplicaciones","Escuchar musica"};
		    String[] RespuestasPregunta2 = {"Visual Code","Eclipse","Sublime Text","Android studio"};
		    String[] RespuestasPregunta3 = {"James Gosling (Empresa Sun)","Galileo Galilei","Emiliano Zapata","Jose Maria Morelos"};			        
		    String[] RespuestasPregunta4 = {"JSE   JEE  JME","Lite y Pro","De paga y gratis","Solo hay una version"};			        
		    String[] RespuestasPregunta5 = {"Eclipse","Visual Studio","Opera","Google Chrome"};			        
            
		    int [] Puntos = {0,0,0,0,0};
		    
		    public String obtenerRespuesta(int posicion){
		        return preguntas[posicion];
		    }
}
