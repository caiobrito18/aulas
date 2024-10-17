package com.fatesg.vs01;

public class Pessoa {
  String nome, nacionalidade;
  int idade;
  double altura;

  Pessoa(String nome, String nacionalidade, int idade, double altura) {
    this.nome = nome;
    this.nacionalidade = nacionalidade;
    this.idade = idade;
    this.altura = altura;
  }

  public void birthday() {
    this.idade += 1;
    System.out.println("Parabéns sua idade aumentou, agora você tem " + this.idade + " anos");
  }

  public void getInfo() {
    System.out.println("nome:" + this.nome);
    System.out.println("idade:" + this.idade);
    System.out.println("altura:" + this.altura);
    System.out.println("nacionalidade:" + this.nome);
  }
}
