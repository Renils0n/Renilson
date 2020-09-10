/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacao;

import interface1.Locadora.Locadora;
import modelo_Entidades.Aluguel_Carro;
import modelo_Entidades.Veiculo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import modelo_Servico.Servico_Aluguel;
import modelo_Servico.Taxa_Servico;

/**

 * @author dam

 * Uma locadora brasileira de carros cobra um valor por hora para locações de até
12 horas. Porém, se a duração da locação ultrapassar 12 horas, a locação será
cobrada com base em um valor diário. Além do valor da locação, é acrescido no
preço o valor do imposto conforme regras do país que, no caso do Brasil, é 20%
para valores até 100.00, ou 15% para valores acima de 100.00. Fazer um
programa que lê os dados da locação (modelo do carro, instante inicial e final da
locação), bem como o valor por hora e o valor diário de locação. O programa
deve então gerar a nota de pagamento (contendo valor da locação, valor do
imposto e valor total do pagamento) e informar os dados na tela. Veja os
exemplos.
 * 
 */
 
public class Principal {
    
    public static void main(String[] args) throws ParseException {
        
        Scanner ler = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:ss");
        System.out.println(" Dados ");
        System.out.println(" Data Inicial");
        Date dat_i = format.parse(ler.nextLine());
        
       
        System.out.println(" Data Final");
        Date dat_F = format.parse(ler.nextLine());
        
        System.out.println(" Modelo ");
        String modelo = ler.nextLine();
       
       Aluguel_Carro aluguel = new Aluguel_Carro(dat_i, dat_F,new Veiculo(modelo));
       
        System.out.println("Valor da Hora ");
        double valor_H = ler.nextDouble();
        System.out.println(" Valor da Diaria ");
        double diaria = ler.nextDouble();
        
        Servico_Aluguel servico_alugue = new Servico_Aluguel(valor_H, diaria,new Taxa_Servico()) ;
        
        servico_alugue.processameno_Aluguei(aluguel);   
        
        System.out.println(" Fatura :");
        System.out.println(" Pagamento Basico: "+String.format("%.2f", aluguel.getFatura().getPagamento_basico()));
        System.out.println(" Taxa: "+String.format("%.2f", aluguel.getFatura().getTaxa()));
        System.out.println(" Pagamento Total : "+String.format("%.2f", aluguel.getFatura().totalPagamento()));
    }
}
