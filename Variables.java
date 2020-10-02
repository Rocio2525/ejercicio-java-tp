
package variables;


public class Variables {

    
    public static void main(String[] args) {
       // Variables 	
		int numero1;
                int numero2;
                int suma;
                int edad;
		String nombre;
                		
             // Constante	
		final int NUMERO_3= 4;
             // Ingreso los valores a la variables numero1 y numero2
		numero1 = 30;
		numero2 = 40;
              //Declarar variables
              System.out.println("numero1"  +"   " + numero1 );
              System.out.println("numero2" + "   " +  numero2 );
             
                
              // operación suma
              System.out.println("suma  "+ numero1 + "+" + numero2 + "=" + 
                      (numero1+numero2));
              //Cambiar valores     n1 y n2
              numero1=100;
              numero2=50;
              //variables
              System.out.println("numero1"  +"   " + numero1 );
              System.out.println("numero2" + "   " +  numero2 );
              //suma
              System.out.println("suma  "+ numero1 + "+" + numero2 + "=" + 
                      (numero1+numero2));
              System.out.println("constsnte " + " " + NUMERO_3);
                     
    }
    
}
