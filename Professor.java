/*a. Crie a classe Professor com seu construtor, métodos de acesso e modificadores e
os atributos privados nome, do tipo String, idade, do tipo int. Crie o método
getDados que retorna o valor dos atributos.*/

package com.joao.lista06;


public class Professor {
    
    private String nome = "Joao";
    private int idade = 22;
   


    public Professor(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public String getDados(){
       return "Nome:" + nome + "Idade" +  idade;
    }   
    
}
