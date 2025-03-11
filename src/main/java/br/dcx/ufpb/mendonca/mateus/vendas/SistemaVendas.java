package br.dcx.ufpb.mendonca.mateus.vendas;

public interface SistemaVendas {
    public void cadastrarVenda(String codigoProduto, double valorProduto,
                               Mes mes , int ano) throws ProdutoNaoExisteException;
    public void cadastrarProduto(String codigo, String descricao)
            throws ProdutoJaExisteException;
    public Collection<Venda> pesquisarTodasAsVendas();
    public Collection<Produto> pesquisarTodosOsProdutos();
    public double obterValorTotalVendasMes(Mes mes, int ano);
    public boolean existeVendaDoProduto(String codigoProduto);
    public int contaVendasDoProduto(String codigo);
    public boolean existeProduto(String codigo);
    public String pesquisaDescricaoDoProduto(String codigoProduto)
            throws ProdutoNaoExisteException;
}
