package com.matera.ex3.regras;

import com.matera.ex3.Cliente;

public class RegraPagamentoAtraso extends CadeiaRegras {
   public RegraPagamentoAtraso() {
      super(null);
   }
   
   public RegraPagamentoAtraso(Regra next) {
      super(next);
   }

   public boolean aplicar(Cliente cli) {
      if (!cli.temPagamentosAtraso()) {
         return aplicarProximaRegra(cli);
      }
      return false;
   }
}