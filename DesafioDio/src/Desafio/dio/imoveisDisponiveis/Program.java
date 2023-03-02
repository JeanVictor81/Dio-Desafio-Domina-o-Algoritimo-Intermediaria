package Desafio.dio.imoveisDisponiveis;

import java.util.Scanner; 

public class Program {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String frase = leitor.next();
        String array[] = new String[3];
        
        // TODO: Crie a condição necessária para remover as barras da String e apresentar de forma mais amigável
        String aux;
        int cont = 0;
        int aux2 = 0;
        
        
        for(int i = 0; i < frase.length(); i++) {
        	aux = frase.substring(i, i+1);
        	if(aux.equals("/")) {
        		cont++;
        		aux2 = i+1;
        	}
        	else {
        		array[cont] = frase.substring(aux2, i+1);
        		
        	}
        }
        System.out.println("Imovel: " + array[0] +" R$"+ array[1]+ " "+ array[2]);
    }
}