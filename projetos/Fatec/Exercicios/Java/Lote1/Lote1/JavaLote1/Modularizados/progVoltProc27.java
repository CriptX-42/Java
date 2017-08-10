/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modularizados;

import java.util.Scanner;

/**
 *
 * @author Ricardo Sousa
 */
public class progVoltProc27 {
    public static void main(String[]args){
        double volt = 0, metro = 0, tempDura = 0;
        Volt vt = new Volt();
        Scanner num = new Scanner(System.in);
        System.out.println("Digite o numero de voltas: ");
        volt = num.nextInt();
        System.out.println("Digite a Extensão do circuito(Em metros): ");
        metro = num.nextInt();
        System.out.println("Tempo de duração em minutos: ");
        tempDura = num.nextInt();
        vt.metro = metro;
        vt.tempDura = tempDura;
        vt.volt = volt;
        System.out.println("A velocidade media é de: "+vt.VeloVolt());
    }
}
class Volt{
    public double volt = 0, metro = 0, tempDura = 0, veloMedia = 0;
    public double VeloVolt(){
         veloMedia= (((volt*metro)/tempDura*60)*3.6);
        return veloMedia;
    }
}