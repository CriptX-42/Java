/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TransitoSI;


import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Ricardo Sousa
 */
public class Principal {
    public static void main(String args[]) throws IOException{
        
        carroInfo[] cInfo = new carroInfo[3];
        Operacoes m = new Operacoes();
        int opc = 0;
        
        while (opc!=9){
            opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Cadastrar Registros \n"
                    + "2 - Tipos de veiculo \n"
                    + "3 - Consultar acidentes \n"
                    + "4 - Consultar \n"
                    + "5 - Estatísticas \n"
                    + "--------------------------"));
            
            switch(opc){
                case 1: cInfo = m.GravaCarro(cInfo);
                    break;
                case 2: m.Ftipo(cInfo);
                    break;
                case 3: m.pConsultaAceidentes(cInfo);
                    break;    
                    
                case 5: m.pConsultaAceidentes(cInfo);
                    break;    
            }
            
        }   
    }
}
