/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabalho;

/**
 *
 * @author Ricardo Sousa
 */
import java.io.*;
import java.util.Scanner;
public class tbBanco {
    public static void main(String[]args) throws IOException{
        
        // *Declarações
        Scanner ler = new Scanner(System.in);
        int opc = 0;
        int cedulas[][] = new int[2][6];
            
            cedulas[0][0]=2;
            cedulas[0][1]=5;
            cedulas[0][2]=10;
            cedulas[0][3]=20;
            cedulas[0][4]=50;
            cedulas[0][5]=100;
        
        int difCedulas[][]= new int[2][6];
        
        System.out.println("Por favor, digite o seu banco \n 1-Banco do BR \n 2-Santander \n 3-Itaú \n 4-Vem pra caixa vc tbm...Vem");
        opc = ler.nextInt();
        
        switch(opc){
            case 1:
             cedulas = carrega(cedulas);
                for (int i = 0; i < 6; i++) {
                    difCedulas[1][i]=cedulas[1][i];
                }
            break;
        case 2:
            
            break;
            
        }
        
    }
    public static int[][] carrega(int cedulas[][])throws IOException{
        InputStreamReader go = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(go);
                Scanner ler = new Scanner(System.in);
                for (int i = 0; i < 6; i++) {
                    System.out.print("Coloque aqui o numero de cedulas de :"+ cedulas[0][i]);
                    cedulas[1][i]= ler.nextInt();
            
        }
                return cedulas;
    }
    public static int [][] sacar(int difCedulas[][],int cedulas[][])throws IOException{
      InputStreamReader go = new InputStreamReader(System.in);
	BufferedReader in = new BufferedReader(go);
        
        Scanner ler = new Scanner(System.in);
        int saque = 0;
        
        System.out.println("Valor de sua retirada:");
        saque = ler.nextInt();
        return null;
    }
}
