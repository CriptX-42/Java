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
public class progNassCalcBI33 {
    int dia = 0, mes = 0, anoNasc = 0, anoAtual = 0;
    public void Calcbi(){
    

    switch (mes){
            case 1:
                if(dia <=31){
                    int auxD = 31; 
                   dia = auxD - dia;
                }else{
                    System.out.print("O dia é invalido");
                    break;
                }
        case 2:
                if(dia <=29){
                    int auxD = 29;
                    dia =  auxD - dia;
                }else{
                    System.out.print("O dia é invalido");
                    break;
                }
        case 3:
                if(dia <=31){
                    int auxD = 31;
                    dia =  auxD - dia;
                }else{
                    System.out.print("O dia é invalido");
                    break;
                }
        case 4:
                if(dia <=30){
                    int auxD = 30;
                    dia =  auxD - dia;
                }else{
                    System.out.print("O dia é invalido");
                    break;
                }
        case 5:
                if(dia <=31){
                    int auxD = 31;
                    dia =  auxD - dia;
                    
                }else{
                    System.out.print("O dia é invalido");
                    break;
                }
        case 6:
                if(dia <=30){
                    int auxD = 30;
                    dia =  auxD - dia;
                }else{
                    System.out.print("O dia é invalido");
                    break;
                }
        case 7:
                if(dia <=31){
                    int auxD = 31;
                    dia =  auxD - dia;
                }else{
                    System.out.print("O dia é invalido");
                    break;
                }
        case 8:
                if(dia <=31){
                    int auxD = 31;
                    dia =  auxD - dia;
                }else{
                    System.out.print("O dia é invalido");
                    break;
                }
        case 9:
                if(dia <=30){
                    int auxD = 30;
                    dia =  auxD - dia;
                }else{
                    System.out.print("O dia é invalido");
                    break;
                }
        case 10:
                if(dia <=31){
                    int auxD = 31;
                    dia = dia - auxD;
                }else{
                    System.out.print("O dia é invalido");
                    break;
                }
        case 11:
                if(dia <=30){
                    int auxD = 30;
                    dia = dia - auxD;
                }else{
                    System.out.print("O dia é invalido");
                    break;
                }
        case 12:
                if(dia <=31){
                    int auxD = 31;
                    dia = dia - auxD;
                }else{
                    System.out.print("O dia é invalido");
                    break;
                }
        }
       
        if(mes<=12){
            int auxM = 12;
            mes = auxM - mes;
  
        }else{
            System.out.println("Mes invalido");
        }
        
        if (anoAtual<=anoNasc){
            anoNasc = anoAtual-anoNasc;
        
        }else{
            System.out.println("Ano invalido");
        }
        System.out.println("Você tem :"+anoNasc+" anos, "+mes+" meses, "+dia);
       
    }
    public void CalcNbi(){
        switch (mes){
            case 1:
                if(dia <=31){
                    int auxD = 31; 
                   dia = auxD - dia;
                }else{
                    System.out.print("O dia é invalido");
                    break;
                }
        case 2:
                if(dia <=28){
                    int auxD = 28;
                    dia = auxD - dia;
                }else{
                    System.out.print("O dia é invalido");
                    break;
                }
        case 3:
                if(dia <=31){
                    int auxD = 31;
                    dia =  auxD - dia;
                }else{
                    System.out.print("O dia é invalido");
                    break;
                }
        case 4:
                if(dia <=30){
                    int auxD = 30;
                    dia =  auxD - dia;
                }else{
                    System.out.print("O dia é invalido");
                    break;
                }
        case 5:
                if(dia <=31){
                    int auxD = 31;
                    dia =  auxD - dia;
                }else{
                    System.out.print("O dia é invalido");
                    break;
                }
        case 6:
                if(dia <=30){
                    int auxD = 30;
                    dia =  auxD - dia;
                }else{
                    System.out.print("O dia é invalido");
                    break;
                }
        case 7:
                if(dia <=31){
                    int auxD = 31;
                    dia =  auxD - dia;
                }else{
                    System.out.print("O dia é invalido");
                    break;
                }
        case 8:
                if(dia <=31){
                    int auxD = 31;
                    dia =  auxD - dia;
                }else{
                    System.out.print("O dia é invalido");
                    break;
                }
        case 9:
                if(dia <=30){
                    int auxD = 30;
                    dia =  auxD - dia;
                }else{
                    System.out.print("O dia é invalido");
                    break;
                }
        case 10:
                if(dia <=31){
                    int auxD = 31;
                    dia =  auxD - dia;
                }else{
                    System.out.print("O dia é invalido");
                    break;
                }
        case 11:
                if(dia <=30){
                    int auxD = 30;
                    dia =  auxD - dia;
                }else{
                    System.out.print("O dia é invalido");
                    break;
                }
        case 12:
                if(dia <=31){
                    int auxD = 31;
                    dia =  auxD - dia;
                }else{
                    System.out.print("O dia é invalido");
                    break;
                }
        }
        
        if(mes<=12){
            int auxM = 12;
            mes = auxM - mes;
        }else{
            System.out.println("Mes invalido");
        }
        if (anoAtual>=anoNasc){
            anoNasc = anoAtual-anoNasc;
        }else{
            System.out.println("Dia invalido");
        }
        System.out.println("Você tem :"+anoNasc+" anos, "+mes+" meses, "+dia);
    }
}
