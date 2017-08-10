/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modularizados.function;

/**
 *
 * @author Ricardo Sousa
 */
public class progMedMensalCalc31 {
    double precAtual = 0, medMensal=0, novoPrec = 0;
    public void MedM(){
    if(medMensal < 500 && precAtual <30){
            novoPrec = (precAtual*0.10);
            novoPrec += precAtual;
            System.out.println("O novo valor é de: "+novoPrec);
        }else if(medMensal >= 500 && medMensal <1000 && precAtual >=30 && precAtual <80){
            novoPrec = (precAtual*0.15);
            novoPrec += precAtual;
            System.out.println("O novo valor é de: "+novoPrec);
        }else if(medMensal >= 1000 && precAtual >=80){
            novoPrec = (precAtual*0.05);
            precAtual -= novoPrec ;
            System.out.println("O novo valor é de: "+precAtual);
        }else{
         System.out.println("Não houve alteração no preço do produto: "+precAtual);   
        }
}
}
