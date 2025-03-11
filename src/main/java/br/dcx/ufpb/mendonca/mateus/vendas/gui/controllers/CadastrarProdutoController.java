package br.dcx.ufpb.mendonca.mateus.vendas.gui.controllers;
import br.dcx.ufpb.mendonca.mateus.vendas.ProdutoJaExisteException;
import br.dcx.ufpb.mendonca.mateus.vendas.SistemaVendas;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class CadastrarProdutoController implements ActionListener {

    private SistemaVendas sistema;
    private JFrame janelaPrincipal;

    public CadastrarProdutoController(SistemaVendas sistema, JFrame janelaPrincipal) {
        this.sistema = sistema;
        this.janelaPrincipal = janelaPrincipal;
    }

    public void actionPerformed(ActionEvent event) {
        String codigo = JOptionPane.showInputDialog(janelaPrincipal, "Digite o código do produto");
        String descricao = JOptionPane.showInputDialog(janelaPrincipal, "Digite a descrição do produto");
        try {
            sistema.cadastrarProduto(codigo, descricao);
            JOptionPane.showMessageDialog(janelaPrincipal, "Produto cadastrado com sucesso!");
        } catch (ProdutoJaExisteException e) {
            JOptionPane.showMessageDialog(janelaPrincipal, "Erro! Produto não cadastrado. Destalhes:" +e.getMessage());
            e.printStackTrace();
        }
    }
}
