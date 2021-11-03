package hiloconbarradeprogreso;

import javax.swing.JProgressBar;

public class VerificarProgresoBarra implements Runnable{
	
	private JProgressBar barra;
	
	public VerificarProgresoBarra ( JProgressBar barraVentana) 
	{
		this.barra = barraVentana;
	}


   @Override 
   public void run()
   {
	   while(!CreacionDeHilo.finalizado) 
	   {
		   barra.setValue(CreacionDeHilo.avance);
		   barra.repaint();
		   
		   if(CreacionDeHilo.finalizado)
		   {
			   barra.setValue(100);
			   System.out.println("Progreso Hilo.Java Finalizado");
			   break;
		   }
	   }
	   }
   }
   