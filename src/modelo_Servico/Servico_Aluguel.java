/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo_Servico;

import modelo_Entidades.Aluguel_Carro;
import modelo_Entidades.Fatura;

/**
 *
 * @author dam
 */
public class Servico_Aluguel {
    
    
    private double valor_Hora;
    private double valor_Diaria;
    private Taxa_Servico taxaServico;
    
     

    public Servico_Aluguel(double valor_Hora, double valor_Diaria, Taxa_Servico taxaServico) {
        this.valor_Hora = valor_Hora;
        this.valor_Diaria = valor_Diaria;
        this.taxaServico = taxaServico;
    }

    public double getValor_Hora() {
        return valor_Hora;
    }

    public void setValor_Hora(double valor_Hora) {
        this.valor_Hora = valor_Hora;
    }

    public double getValor_Diaria() {
        return valor_Diaria;
    }

    public void setValor_Diaria(double valor_Diaria) {
        this.valor_Diaria = valor_Diaria;
    }

    public Taxa_Servico getTaxaServico() {
        return taxaServico;
    }

    public void setTaxaServico(Taxa_Servico taxaServico) {
        this.taxaServico = taxaServico;
    }
        
    
    public void  processameno_Aluguei(Aluguel_Carro aluguel_Carro){
        
       long t1 = aluguel_Carro.getSaida().getTime() ;
       long t2 = aluguel_Carro.getEntrada().getTime();
       double hora_total= (double)(t1-t2)/1000/60/60;
       System.out.println(" Tempo : "+ hora_total/24+" dias");
       double pagamento_basico ;
       if( hora_total <= 12)
           pagamento_basico = Math.ceil(hora_total)* valor_Hora;
       else{
           pagamento_basico = Math.ceil(hora_total/24)* valor_Diaria;
       }
       double taxa = taxaServico.taxa(pagamento_basico);
       aluguel_Carro.setFatura(new Fatura(taxa, pagamento_basico));
    }
        
        
}
