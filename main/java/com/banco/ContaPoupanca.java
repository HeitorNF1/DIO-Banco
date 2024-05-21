package com.banco;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }
    @Override
    public void imprimirDados() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirDados();
    }

}
