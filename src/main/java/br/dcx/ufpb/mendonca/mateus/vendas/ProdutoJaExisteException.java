package br.dcx.ufpb.mendonca.mateus.vendas;

public class ProdutoJaExisteException extends Exception {
    public ProdutoJaExisteException(String msg) {
        super(msg);
    }
}
