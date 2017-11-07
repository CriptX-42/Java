/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExercAula;

import javax.swing.JOptionPane;

/**
 *
 * @author Ricardo Sousa
 */
public class ClassePrincipal {
    public static void main (String args[]) {
        ClasseMetodos M = new ClasseMetodos();
        int v[] = new  int[5];
        int opc = 0;
      do {
        opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Carregar vetor\n2 - Classificar      vetor \n 3 - Mostrar vetor\n9 - Finalizar"));
            
            switch (opc)
            {
                  case 1: v = M.FunçãoCarrega(v);
                               break;
                  case 2: v = M.FunçãoClassifica(v);
                               break;
                  case 3: M.ProcedimentoMostra(v);
                               break;
                  case 9: JOptionPane.showMessageDialog(null,"finaliza");
                               break;
                  default: JOptionPane.showMessageDialog(null,"opc inválida");
            }
      }
      while(opc != 9);
     
    }
}
