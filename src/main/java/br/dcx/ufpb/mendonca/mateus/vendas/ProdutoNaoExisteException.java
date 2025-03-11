package br.dcx.ufpb.mendonca.mateus.vendas;

public class ProdutoNaoExisteException extends Exception {
    public ProdutoNaoExisteException(String msg) {
        super(msg);
    }
}
