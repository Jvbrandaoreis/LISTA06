/*Crie a classe Atribuicao com seu construtor, métodos de acesso e modificadores e
os atributos privados professor, do tipo Professor, e disciplina, do tipo Disciplina.
Crie o método getDados que retorna o valor dos atributos.*/
  
package com.joao.lista06;

public class Atribuicao {
    private String nome;
    private int idade;
    private String nomeDisciplina;
    private boolean pratica;
    private Disciplina disciplina;
    private Professor professor;
    
    public Atribuicao(String nome, int idade, String nomeDisciplina, boolean pratica, Disciplina disciplina , Professor professor){
       this.nome = nome;
       this.idade = idade;
       this.nomeDisciplina = nomeDisciplina;
       this.pratica = pratica;
       this.disciplina = disciplina;
       this.professor = professor;
            
    }
    
   /* Professor professor = new Professor(nome,idade);
    Disciplina disciplina = new Disciplina(nomeDisciplina,pratica);*/
    
    public void setProfessorNome(String nome){
         professor.setNome(nome);
    }
    
    public void setProfessorIdade(int idade){
        professor.setIdade(idade);
    }
    
    public void setDisciplinaNomeDisciplina(String nomeDisciplina){
        disciplina.setNome(nomeDisciplina);        
    }
    
    public void setDisciplinaPratica(boolean pratica){
        disciplina.setPratica(pratica);
    }
    
    public String getDados(){
        return "" + professor.getDados() + disciplina.getDados();
    }
}
