package com.matera.ex1;

import java.nio.file.Files;
import java.nio.file.Paths;

public class BuscaArquivo3_Funcional {
   public static void main(String[] args) throws Exception {
      String palavra = "SILVA";
      String arquivo = "nomes.txt";
      
      long contador = Files.lines(Paths.get(arquivo))
         .filter(linha -> linha.contains(palavra))
         .count();
      System.out.printf("A palavra [%s] ocorreu %d vezes\n", palavra, contador);
   }

}
