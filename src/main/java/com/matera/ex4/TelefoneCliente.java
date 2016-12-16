package com.matera.ex4;

public class TelefoneCliente {
   private String nome;
   private String codigoArea;
   private String telefone;
   public TelefoneCliente(String nome, String codigoArea, String telefone) {
      this.nome = nome;
      this.codigoArea = codigoArea;
      this.telefone = telefone;
   }
   public String getNome() {
      return nome;
   }
   public String getTelefone() {
      return telefone;
   }
   public String getCodigoArea() {
      return codigoArea;
   }
   @Override
   public String toString() {
      return "[nome=" + nome + ", telefone=(" + codigoArea + ") " + telefone + "]";
   }
   
}
