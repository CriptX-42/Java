/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TransitoSI;

/**
 *
 * @author Ricardo Sousa
 */
import java.io.*;	
import javax.swing.*;   
public class Operacoes {
    public carroInfo[] GravaCarro (carroInfo[]cInfo)throws IOException{
        int i;
        String fileName = "EstatisticasCarro.txt";
        BufferedWriter writer = new BufferedWriter(new FileWriter( fileName ));
        for(i = 0; i < 3; i++){
            cInfo[i] = new carroInfo();
        }
        for (i = 0; i < 3; i++) {
            cInfo[i].codCidade = Integer.parseInt(JOptionPane.showInputDialog("Entre com o código da cidade: " +i));
            writer.write( cInfo[i].codCidade );
            writer.newLine();
            
            cInfo[i].nomeCidade = JOptionPane.showInputDialog("Entre com o nome da cidade: " +i);
            writer.write(cInfo[i].nomeCidade);
            writer.newLine();
            
            cInfo[i].qtdAcidentes = Integer.parseInt(JOptionPane.showInputDialog("Entre com a quantidade de acidentes: " +i));
            writer.write(cInfo[i].qtdAcidentes);
            writer.newLine();
            
            cInfo[i].tipoVeiculo = Integer.parseInt(JOptionPane.showInputDialog("Entre com o tipo de veiculo: " +i));
            writer.write(cInfo[i].tipoVeiculo);
            writer.newLine();
        }
        System.out.println("GRAVAÇÃO FEITA COM SUCESSO");
        writer.close();
        return cInfo;
}
    public void Ftipo (carroInfo[ ] cInfo)throws IOException{
        int i;
        String fileName = "EstatisticasCarro.txt";
        BufferedReader ler = new BufferedReader(new FileReader( fileName ));	
        
        for (i = 0; i < 3; i++) {
            System.out.println(cInfo[i].tipoVeiculo);
        }
    }
    public void pConsultaAceidentes(carroInfo[]cInfo){
        int i;
        for ( i = 0; i < 3; i++) {
            if(cInfo[i].qtdAcidentes > 100 && cInfo[i].qtdAcidentes <500){
            System.out.println(cInfo[i].qtdAcidentes + " " + cInfo[i].nomeCidade);
        }else{
                
            }
            
        }
    }
    public void orgVetores (carroInfo[] cInfo){
        int med;
        int i;
        
        for (i = 0; i < 3; i++) {
            
        }
    }
}