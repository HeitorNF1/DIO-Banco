package com.banco;

public class ContaCorrente extends Conta {


    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }
    @Override
    public void imprimirDados() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirDados();
    }

}
