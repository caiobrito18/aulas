package com.fatesg.vs01;

/**
 * ContaBancaria
 */
public class ContaBancaria {
  String name;
  double balance;

  public ContaBancaria(String name, double balance) {
    this.name = name;
    this.balance = balance;
  }

  public double deposit(double amount) {
    double newBalance = this.balance += amount;
    this.balance = newBalance;
    return newBalance;
  }

  public double withdraw(double amount) {
    double newBalance = this.balance -= amount;
    this.balance = newBalance;
    return newBalance;
  }

  public double showBalance() {
    return this.balance;
  }
}
