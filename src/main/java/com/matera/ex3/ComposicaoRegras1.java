package com.matera.ex3;

import com.matera.ex3.regras.Regra;
import com.matera.ex3.regras.RegraPagamentoAtraso;
import com.matera.ex3.regras.RegraSPC;
import com.matera.ex3.regras.RegraSalario;
import com.matera.ex3.regras.RegraTempoEmprego;

public class ComposicaoRegras1 {
   public static void avaliar(Cliente cli, Regra regra) {
      String resultado = regra.aplicar(cli) ? "aceito" : "recusado";
      System.out.println("Resultado: " + resultado);
   }

   public static void main(String[] args) {
      Cliente cliente = new Cliente("John Snow", 5000.0, 2, false, true);

      avaliar(cliente, new RegraSalario(new RegraSPC()));

      avaliar(cliente, new RegraSalario(new RegraTempoEmprego(new RegraSPC())));

      avaliar(cliente,
            new RegraSPC(
                  new RegraTempoEmprego(new RegraPagamentoAtraso())));

      avaliar(cliente,
            new RegraSPC(
                  new RegraSalario(
                        new RegraTempoEmprego(new RegraPagamentoAtraso()))));
   }
}
