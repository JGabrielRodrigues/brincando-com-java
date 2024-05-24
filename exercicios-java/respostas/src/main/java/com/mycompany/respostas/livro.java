package com.mycompany.respostas;

public class livro {
    String titulo, autor;


    public livro(String titulo, String autor){

    this.titulo = titulo;
    this.autor = autor;
    }
    
    public String gettitulo(){
        return this.titulo;
    }
    
    public String getautor(){
        return this.autor;
    }
}



