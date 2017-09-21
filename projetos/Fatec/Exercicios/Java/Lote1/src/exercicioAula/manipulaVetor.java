/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioAula;

import javax.swing.JOptionPane;

/**
 *
 * @author Ricardo Sousa
 */
public class manipulaVetor {
    public static void main (String [] args){
        int v[] = new int[5];
        int opc = 0;
        do{
            opc = Integer.parseInt(JOptionPane.showInputDialog("1- Carregar vetor\n2- Classificar vetor\n 3- Mostrar vetor\n9-Finalizar"));
            switch(opc){
                case 1:v = FuncaoCarrega(v);
                    break;
                case 2:v = FuncaoClassifica(v);
                    break;
                case 3:v = ProcedimentoMostra(v);
                    break;
                case 9: JOptionPane.showMessageDialog(null,"finalizada");
                    break;
                //defalt: JOptionPane.showMessageDialog(null,"opc inválida");
            }
        }
        while(opc !=9);
    }
    static int[] FuncaoCarrega(int v[]){
        int i;
        for(i = 0; i <5; i ++){
            v[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do " +(i+1)+ "o elemento do vetor."));
            
        }
        return v;
    }
    static int [] FuncaoClassifica(int v[]){
        int i, j , aux;
        for(i = 0; i < 4; i++){
            for (j = i + 1; j < 5; j++) {
                if(v[i]>v[j]){
                    aux = v[i];
                    v[i] = v[j];
                    v[j]=aux;
                    
                }
                }
            }
        return v;
        }
    static int[] ProcedimentoMostra(int v[]){
       System.out.println("O vetor é \n");
       for(int i = 0; i < 5; i++){
           System.out.println(v[i]);
       }
       return v;
}
    }
    
