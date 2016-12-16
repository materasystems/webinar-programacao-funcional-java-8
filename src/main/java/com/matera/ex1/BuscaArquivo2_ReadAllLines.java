package com.matera.ex1;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class BuscaArquivo2_ReadAllLines {
   public static void main(String[] args) throws Exception {
      String palavra = "SILVA";
      String arquivo = "nomes.txt";
      
      long contador = 0;
      List<String> linhas = Files.readAllLines(Paths.get(arquivo));
      for (String linha : linhas) {
         if (linha.contains(palavra)) {
            contador++;
         }
      }
      System.out.printf("A palavra [%s] ocorreu %d vezes\n", palavra, contador);
   }

}
