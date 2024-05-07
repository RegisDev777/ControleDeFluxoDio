package Contandor;

import java.util.Scanner;

public class Contador {

     public static void main(String[] args) {
		
    	 Scanner sc = new Scanner(System.in);
    	 
    	 
    	   System.out.println("primeiro numero:");
    	    int a = sc.nextInt();
    	    
    	   System.out.println("segundo Numero:");
    	    int b = sc.nextInt();
    	    
    	    
    	 try {
    		 Contagem(a, b);
    		 
    	 } catch (ParametrosInvalidosExceptions e) {
			System.out.println(e.getMessage());
		}
    	 
    	 
    	 
    	 
    	 sc.close();
    	 
    	 
    	 
	}

     
   static  void  Contagem (int a , int b) throws ParametrosInvalidosExceptions {
	   
	   if(a > b) {
		   throw new ParametrosInvalidosExceptions("Paramentro A maior que Parametro b");
	   }
	   
	   int contagem = b - a;
	   
	   for(int x = 1 ; x <= contagem ; x++) {System.out.println(x);}
	   
   }
     
     
	

}
