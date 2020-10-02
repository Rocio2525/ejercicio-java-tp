
public class clase3 {

   
    public static void main(String[] args) {
     //DEFINIR VARIABLES
        int A = 1 , B = 2 , C=3 , D=4 ;
        System.out.println("valores iniciales");
        System.out.println("Variable A = " + A);
	System.out.println("Variable B = " + B);
	System.out.println("Variable C " + C );
        System.out.println("variable D ="+ D);
         B=C;
         C=A;
         A=D;
         D=B;
       //VALORES FINALES
        System.out.println("Valores finales");
        System.out.println("B toma el valor de C -> B = " + B);
        System.out.println("C toma el valor de A -> C =  " + C);
        System.out.println("A toma el valor de D -> A =  " + A);
        System.out.println("D toma el valor de B -> D =  " + D);
    }
    
}
