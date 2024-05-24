/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.empregado;

public class Empregado {
        private String matricula;
        private String nome;
        private double salario;
        
        public Empregado (String matricula, String nome, double salario ){
            this.matricula = matricula;
            this.nome = nome;
            this.salario = salario;
            
            
        }
        
        public String getMatricula(){
            return matricula;
        }
        
         public String getNome(){
            return nome;
        }
         
          public double getSalario(){
            return salario;
        }
          
          public double calcularPagamento(){
              return salario;
          }
                
                
    
}
