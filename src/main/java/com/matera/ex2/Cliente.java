package com.matera.ex2;

public class Cliente {
   private String nome;
   private String cidade;
   private String estado;

   public Cliente(String nome, String cidade, String estado) {
      this.nome = nome;
      this.cidade = cidade;
      this.estado = estado;
   }

   public String getNome() {
      return nome;
   }

   public String getCidade() {
      return cidade;
   }
   
   public String getEstado() {
      return estado;
   }

   @Override
   public String toString() {
      return nome;
   }

}
