/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo_Entidades;

/**
 *
 * @author dam
 */
public class Fatura {
    
    
    private Double taxa;
    private Double pagamento_basico;

    

    public Fatura(Double taxa, Double pagamento_basico) {
        this.taxa = taxa;
        this.pagamento_basico = pagamento_basico;
    }

    public Double getTaxa() {
        return taxa;
    }

    public void setTaxa(Double taxa) {
        this.taxa = taxa;
    }

    public Double getPagamento_basico() {
        return pagamento_basico;
    }

    public void setPagamento_basico(Double pagamento_basico) {
        this.pagamento_basico = pagamento_basico;
    }
    
    public double totalPagamento(){
        return getPagamento_basico() + getTaxa();
    }
}
