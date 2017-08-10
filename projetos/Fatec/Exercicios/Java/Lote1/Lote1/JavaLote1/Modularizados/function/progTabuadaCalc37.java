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
public class progTabuadaCalc37 {
    int N=0,X=0,Y=0;
    public void TabuadaCalc(){
        while(X<10){
            X++;
            Y=X*N;
            System.out.println(Y);
        }
    }
}
