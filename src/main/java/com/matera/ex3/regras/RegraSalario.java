package com.matera.ex3.regras;

import com.matera.ex3.Cliente;

public class RegraSalario extends CadeiaRegras {
   
   public RegraSalario() {
      super(null);
   }
   
   public RegraSalario(Regra proxima) {
      super(proxima);
   }

   public boolean aplicar(Cliente cli) {
      if (cli.getSalario() > 2000.0) {
         return aplicarProximaRegra(cli);
      }
      return false;
   }
}