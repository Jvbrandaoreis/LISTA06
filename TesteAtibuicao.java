/*Crie a classe TesteAtribuicao com o método main que instancia um Professor, uma
Disciplina e uma Atribuicao. Imprima dos dados da Atribuicao.*/
package com.joao.lista06;

import javax.swing.JOptionPane;


public class TesteAtibuicao {
    
    public static void main(String... args){
        
        String nome = "Joao";
        int idade = 22;
        String nomeDisciplina = "POO"; 
        boolean pratica = true;
        
        Professor professor = new Professor(nome,idade);
        Disciplina disciplina = new Disciplina(nomeDisciplina,pratica);
        
        Atribuicao atribuicao = new Atribuicao(nome,idade,nomeDisciplina,pratica,disciplina,professor);
        
        String saida = atribuicao.getDados();
        System.out.println(saida);
        
        nome = JOptionPane.showInputDialog("Digite o nome do professor");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite idade do professor"));
        nomeDisciplina = JOptionPane.showInputDialog("Digite o nome da Disciplina");
        pratica = Boolean.parseBoolean(JOptionPane.showInputDialog("é pratica? true/false"));
        
                
        atribuicao.setProfessorNome(nome);
        atribuicao.setProfessorIdade(idade);
        atribuicao.setDisciplinaNomeDisciplina(nomeDisciplina);
        atribuicao.setDisciplinaPratica(pratica);
        
        saida = atribuicao.getDados();
        System.out.println(saida);        
    }
}
