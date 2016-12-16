package com.matera.ex3;

public class Cliente {
   
   private String nome;
   private double salario;
   private int tempoEmpregado;
   private boolean restricoesSPC;
   private boolean pagamentosAtraso;
   
   public Cliente(String nome, double salario, int tempoEmpregado, boolean restricoesSPC, boolean pagamentosAtraso) {
      this.nome = nome;
      this.salario = salario;
      this.tempoEmpregado = tempoEmpregado;
      this.restricoesSPC = restricoesSPC;
      this.pagamentosAtraso = pagamentosAtraso;
   }
   public String getNome() {
      return nome;
   }
   public double getSalario() {
      return salario;
   }
   public int getTempoEmpregado() {
      return tempoEmpregado;
   }
   public boolean temRestricoesSPC() {
      return restricoesSPC;
   }
   public boolean temPagamentosAtraso() {
      return pagamentosAtraso;
   }
 }