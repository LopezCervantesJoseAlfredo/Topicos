package hiloconbarradeprogreso;

public class CreacionDeHilo implements Runnable{
	public static boolean finalizado = false;
	public static int avance = 0;
	public String nombreHilo;
	
	public CreacionDeHilo ( String nombre) 
	{
		this.nombreHilo = nombre;
	}


   @Override 
   public void run()
   {
	   finalizado = false;
         
         for(int i = 1; i<=100; i++) 
         {
        	 System.out.println("Procesando Hilo.Java "+ i + " % ");
        	 
        	 avance = i; 
        	 
        	 try 
        	 {
        		 Thread.sleep(100);
        	 }
        	 catch(InterruptedException e) 
        	 {
        		 System.out.println("Se interrumpio el Hilo.Java en " + i +"%");        	 	 
        	 }
         }
         finalizado = true;
   }
   }