/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empregado;


public class main {
    public static void main(String[] args){
    
    // Criando um objeto Empregado
    Empregado empregado = new Empregado("123", "João", 2000.0);
    System.out.println("Empregado:");
    System.out.println("Matrícula: " + empregado.getMatricula());
    System.out.println("Nome: " + empregado.getNome());
    System.out.println("Salário: " + empregado.getSalario());

    // Criando um objeto EmpregadoVendedor
   empregadoVen vendedor = new empregadoVen("456", "Maria", 2500.0, 5000.0);
    System.out.println("\nEmpregado Vendedor:");
    System.out.println("Matrícula: " + vendedor.getMatricula());
    System.out.println("Nome: " + vendedor.getNome());
    System.out.println("Salário: " + vendedor.getSalario());
   // System.out.println("Total de Vendas no Mês: " + vendedor.totalvenda());
    System.out.println("Pagamento: " + vendedor.calculaPagamento());
    
    }
    
}
