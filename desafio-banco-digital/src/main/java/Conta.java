package main.java;

public abstract class Conta {
    private int agencia;
    private int numero;
    private double saldo;

    public void sacar(double valor){
        this.saldo -= valor;
    }

    public void depositar(double valor){
        this.saldo += saldo;
    }

    public void transferir(Conta conta, double valor){
        this.saldo -= valor;
        conta.saldo += valor;
    }

}
