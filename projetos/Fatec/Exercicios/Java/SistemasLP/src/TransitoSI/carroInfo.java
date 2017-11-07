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
class carroInfo{
    int codCidade;
    int qtdAcidentes;
    int tipoVeiculo;
    String nomeCidade;
   
    //construtor
    carroInfo(){
      this(0 , 0 , 0 , "");
    }
    carroInfo(int CodCidade, int QTDAvident,int TipoVeiculo,String NomeCidade){
        codCidade = CodCidade;
        qtdAcidentes = QTDAvident;
        tipoVeiculo = TipoVeiculo;
        nomeCidade = NomeCidade;
    }
}
