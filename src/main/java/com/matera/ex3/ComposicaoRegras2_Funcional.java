package com.matera.ex3;

import java.util.function.Predicate;

public class ComposicaoRegras2_Funcional {
   public static void avaliar(Cliente cli, Predicate<Cliente> regra) {
      String resultado = regra.test(cli) ? "aceito" : "recusado";
      System.out.println("Resultado: " + resultado);
   }

   public static void main(String[] args) {
      Cliente cliente = new Cliente("John Snow", 5000.0, 2, false, true);
      
      Predicate<Cliente> regraSalario = cli -> cli.getSalario() > 2000.0;
      Predicate<Cliente> regraTempoEmprego = cli -> cli.getTempoEmpregado() > 0;
      Predicate<Cliente> regraPagamentoAtraso = cli -> !cli.temPagamentosAtraso();
      Predicate<Cliente> regraSPC = cli -> !cli.temRestricoesSPC();
      
      avaliar(cliente, regraSalario.and(regraSPC));
      avaliar(cliente, regraSalario.and(regraTempoEmprego).and(regraSPC));
      avaliar(cliente, regraSPC.and(regraTempoEmprego).and(regraPagamentoAtraso));
      avaliar(cliente, regraSPC.and(regraSalario).and(regraTempoEmprego).and(regraPagamentoAtraso));
   }
}
