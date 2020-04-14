/*Crie a classe Disciplina com seu construtor, métodos de acesso e modificadores e
os atributos privados nome, do tipo String, pratica, do tipo boolean. Crie o método
getDados que retorna o valor dos atributos.*/
package com.joao.lista06;

public class Disciplina {
    private String nomeDisciplina = "POO";
    private boolean pratica = false;
    
    public Disciplina(String nomeDisciplina, boolean pratica){
        this.nomeDisciplina = nomeDisciplina;
        this.pratica = pratica;
    }
    
    public String getNome(){
        return nomeDisciplina;
    }
    
    public void setNome(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
    }
    
    public boolean getPratica(){
        return pratica;
    }
    
    public void setPratica(boolean pratica){
        this.pratica = pratica;
    }
    
    public String getDados(){
        return nomeDisciplina + pratica;
    }
}    
