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
public class progFatoraCalc35 {
    int n = 0, fat=1;
    public void calculFatora(){
        
    
    if(n < 0){
            System.out.println("Não da fatoria negativo");
        }    
            else
            {
                while(n > 1)
                {
                    fat *= n;
                    n--;
                    System.out.println(fat);
                }
            
            }
    }
}
