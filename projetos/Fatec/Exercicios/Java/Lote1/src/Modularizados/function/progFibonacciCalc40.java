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
public class progFibonacciCalc40 {
    int x = 0, num = 0;
    public void FiboCalc(){
        if(x == 0&& x == 1){
            System.out.println(x);
        }else {
            while (x<=99){
                num = ((x-2)+(x-1));
                x++;
                System.out.println(x);
            }
        }
    }
}
