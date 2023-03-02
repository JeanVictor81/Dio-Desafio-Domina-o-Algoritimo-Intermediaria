package Desafio.dio.CamarotedoBlueColdIceCubes;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanhoDaFila = leitor.nextInt();
        int pessoasNoCamarote = 0;
        
        // TODO: Crie a condição necessária para verificar quais números, de acordo com o range de entrada, são ímpares.
        for(int i= 0; i<tamanhoDaFila; i++){
          if(i %2 == 0) {
        		pessoasNoCamarote++;
        	}
        }
        System.out.printf("%d pessoas no camarote", pessoasNoCamarote);
    }
}
