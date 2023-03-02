package Desafio.dio.DcMonalds;

import java.util.Scanner; 

public class Program {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String ingredientes = leitor.next();
        String listaIngredientes[] = new String[4];
        String aux;
        int cont = 0;
        int aux2 = 0;
        
        
        for(int i = 0; i < ingredientes.length(); i++) {
        	aux = ingredientes.substring(i, i+1);
        	if(aux.equals(";")) {
        		cont++;
        		aux2 = i+1;
        	}
        	else {
        		listaIngredientes[cont] = ingredientes.substring(aux2, i+1);
        		
        	}
        }
        for(int i=0; i< listaIngredientes.length; i++) {
        	System.out.println(listaIngredientes[i]);
        	
        }
    }
}