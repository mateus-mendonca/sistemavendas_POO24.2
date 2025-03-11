package br.ufpb.dcx.mendonca.mateus.vendas;

import br.dcx.ufpb.mendonca.mateus.vendas.SistemaVendas;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SistemaVendasDeRoupasTest {
    public class SistemaVendasDeRoupasTest {
        @Test
        public void testaCadastro() throws Exception {
            SistemaVendas sistema = new SistemaVendasDeRoupas();
            sistema.cadastrarProduto("B001","Bermuda Preta Hering M");
            assertTrue(sistema.existeProduto("B001"));
//... TODO: COMPLETAR
        }
    }

}
