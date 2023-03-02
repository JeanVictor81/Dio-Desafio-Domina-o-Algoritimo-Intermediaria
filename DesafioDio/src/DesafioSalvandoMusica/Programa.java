package DesafioSalvandoMusica;

import java.util.Scanner; 

public class Programa {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String arquivoDoPc = leitor.next();
        
        if(arquivoDoPc.substring(arquivoDoPc.length() - 4).equals(".mp3")){
          System.out.println("Salvar");
        }
        else{
          System.out.println("Deletar");
        }
        

    }
}
