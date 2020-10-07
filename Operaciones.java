import  java.util.Scanner ;
public class Operaciones {

    
    public static void main(String[] args) {
      //obj escaner 
         Scanner leer = new Scanner(System.in);
        
        //variables
        int n1,n2;
        int operacion = 0;
        String operaciones; 
        double resultados;
        
        //ya le agrego lo que falta y despue comparto
      
    
        
        System.out.println("ingrese el primer número");
        n1 =leer.nextInt ();
        System.out.println("ingrese el segundo  número");
        n2 =leer.nextInt ();
        System.out.println( "Resta" + n1 + "+" +  n2 + "="+ (n1+n2));
        System.out.println( "Resta" + n1 + "-" +  n2 + "="+ (n1-n2));
        System.out.println( "Division" + n1 + "/" +  n2 + "="+ (n1/n2));
        operaciones=leer.next();
        System.out.println( "Multiplicación" + n1 + "*" +  n2 + "="+ (n1*n2));

        
        
        switch(operacion){
            case 1: resultados = n1+n2;
                operaciones= "suma";
                    
            break;
            case 2: resultados = n1-n2;
                operaciones= "resta";
                
             break;    
               
               
                
            case 3:resultados = n1/n2;
                operaciones= "division";
                
             break; 
                  
                
               
            
               
            case 4: resultados = n1* n2;
                operaciones= "multiplicacion";
             break;     
              
                
             
             
              
         default: System.out.println("Error, la opcion  no existe");
            break;      
                  
        }
      
        }
        
        
    }
    

