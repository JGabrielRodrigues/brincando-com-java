package com.mycompany.empregado;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class empregadoVen extends Empregado{
    
    private double totalvendas;
    
    public empregadoVen (String matricula, String nome, double salario, double totalvendas){
        super(matricula, nome, salario);
        this.totalvendas = totalvendas;
    }
        public double getTotalvendas() {
        return totalvendas;
    }
        
        public double calculaPagamento() {
 
        double bonusVendas = totalvendas * 0.1;
        return getSalario() + bonusVendas;
    }


 

}
