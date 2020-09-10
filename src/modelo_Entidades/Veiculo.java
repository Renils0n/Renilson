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
public class Veiculo {
    
    
    private String modelo;

    public Veiculo(String modelo) {
        this.modelo = modelo;
    }

    public Veiculo() {
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    
}
