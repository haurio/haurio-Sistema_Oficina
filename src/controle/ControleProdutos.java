/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.ModeloProduto;

/**
 *
 * @author cyro
 */
public class ControleProdutos {
    
    ConectaBanco conecta = new ConectaBanco();
    ConectaBanco conProduto = new ConectaBanco();
    ModeloProduto mod = new ModeloProduto();
    int codFornecedor, codCategoria;
    String nomeFornecedor, nomeCategoria;
   
    public void InserirProduto(ModeloProduto mod){
            
            conecta.conexao();
            buscaCodigo(mod.getFornecedorProduto());
            buscaCodCat(mod.getCategoria());
        try {
            PreparedStatement pst = conecta.conn.prepareStatement("INSERT INTO produto (codigobarras, nome_produto, id_categoria, unidade, ncm,"
                    + "cest, cfop, pis, cofins, aliq_federal, aliq_estadual, aliq_municipal, cst, csosn, preco_compra, lucrovenda, lucro_esperado,"
                    + " preco_venda, quantidade, quantidade_minima, id_fornecedor) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"); 
            pst.setString(1, mod.getCodigobarras());
            pst.setString(2, mod.getNomeProduto());
            pst.setInt(3,codCategoria);
            pst.setString(4, mod.getUnidade());
            pst.setString(5, mod.getClassiFiscal());
            pst.setInt(6, mod.getCest());
            pst.setInt(7, mod.getCfop());
            pst.setInt(8, mod.getPis());
            pst.setInt(9, mod.getCofins());
            pst.setFloat(10, mod.getAliqFederal());
            pst.setFloat(11, mod.getAliqEstadual());
            pst.setFloat(12, mod.getAliqMunicipal());
            pst.setInt(13, mod.getCst());
            pst.setInt(14, mod.getCsosn());
            pst.setFloat(15, mod.getPrecoCompra());
            pst.setFloat(16, mod.getLucroVenda());
            pst.setFloat(17, mod.getLucroesperado());
            pst.setFloat(18, mod.getPrecoVenda());
            pst.setInt(19, mod.getQtdProduto());
            pst.setInt(20, mod.getQuantidadeM());
            pst.setInt(21,codFornecedor);
            
            pst.execute();
            JOptionPane.showMessageDialog(null, "Produto Cadastrado com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Cadastrar o Produto "+ ex);
        }
    } 
    
    public void AlterarProduto(ModeloProduto mod){
        buscaCodigo(mod.getFornecedorProduto());
        conecta.conexao();
        try {
        
        
            PreparedStatement pst = conecta.conn.prepareStatement("UPDATE  produto SET codigobarras  = ?, nome_produto = ?, preco_compra = ?, lucrovenda = ?, lucro_esperado = ?, preco_venda = ?, quantidade = ?, quantidade_minima = ?, id_fornecedor = ?,id_categoria = ?, unidade= ?, "
                    + "cest = ?,ncm = ?, cfop = ?, pis = ?, cofins = ?, aliq_federal = ?, aliq_estadual = ?, aliq_municipal = ?, cst = ?, csosn = ? WHERE id_produto = ?");
            pst.setString(1, mod.getCodigobarras());
            pst.setString(2, mod.getNomeProduto());
            pst.setFloat(3, mod.getPrecoCompra());
            pst.setFloat(4, mod.getLucroVenda());
            pst.setFloat(5, mod.getLucroesperado());
            pst.setFloat(6, mod.getPrecoVenda());
            pst.setInt(7, mod.getQtdProduto());
            pst.setInt(8, mod.getQuantidadeM());
            pst.setInt(9,codFornecedor);
            pst.setInt(10,codCategoria);
            pst.setString(11, mod.getUnidade());
            pst.setString(12, mod.getClassiFiscal());
            pst.setInt(13, mod.getCest());
            pst.setInt(14, mod.getCfop());
            pst.setInt(15, mod.getPis());
            pst.setInt(16, mod.getCofins());
            pst.setFloat(17, mod.getAliqFederal());
            pst.setFloat(18, mod.getAliqEstadual());
            pst.setFloat(19, mod.getAliqMunicipal());
            pst.setInt(20, mod.getCst());
            pst.setInt(21, mod.getCsosn());
            pst.setInt(22, mod.getIdProduto());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Produto Alterado com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar o Produto "+ ex);
       }
  
    }
    
    public void ExcluirProduto(ModeloProduto mod){
        
        conecta.conexao();
        
        try {
            PreparedStatement pst = conecta.conn.prepareStatement("DELETE FROM produto WHERE id_produto = ?");
            pst.setInt(1, mod.getIdProduto());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Produto Excluido com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Excluir o Produto. Produto ligado a Venda \n"+ ex);
        }
        
    }
    
    public void buscaNomeFornecedor(int cod){
        
        conProduto.conexao();
        conProduto.executaSQL("SELECT * FROM fornecedor WHERE id_fornecedor ='"+ cod +"'");
        
        try {
            conProduto.rs.first();
            nomeFornecedor = conProduto.rs.getString("nome_fornecedor");
        } catch (SQLException ex) {
             //JOptionPane.showMessageDialog(null, "Erro ao Pesquisar o Produto "+ ex);
        }
        
    }
    
    public void buscaNomeCategoria(int cat){
        
        conProduto.conexao();
        conProduto.executaSQL("SELECT * FROM categorias WHERE id_categoria ='"+ cat +"'");
        
        try {
            conProduto.rs.first();
            nomeCategoria = conProduto.rs.getString("nome_categoria");
        } catch (SQLException ex) {
             //JOptionPane.showMessageDialog(null, "Erro ao Pesquisar a Categoria "+ ex);
        }
        
    }
    
    public ModeloProduto buscaProduto(ModeloProduto modelo){
        
        conecta.conexao();
        
        conecta.executaSQL("SELECT * FROM produto WHERE nome_produto LIKE '%" + modelo.getPesquisa()+ "%'");
        
        try {
            conecta.rs.first();
            buscaNomeFornecedor(conecta.rs.getInt("id_fornecedor"));
            buscaNomeCategoria(conecta.rs.getInt("id_categoria"));
            mod.setCodigobarras(conecta.rs.getString("codigobarras"));
            mod.setIdProduto(conecta.rs.getInt("id_produto"));
            mod.setNomeProduto(conecta.rs.getString("nome_produto"));
            mod.setPrecoCompra(conecta.rs.getFloat("preco_compra"));
            mod.setLucroVenda(conecta.rs.getFloat("lucrovenda"));
            mod.setLucroesperado(conecta.rs.getFloat("lucro_esperado"));
            mod.setPrecoVenda(conecta.rs.getFloat("preco_venda"));
            mod.setQtdProduto(conecta.rs.getInt("quantidade"));
            mod.setQuantidadeM(conecta.rs.getInt("quantidade_minima"));
            mod.setFornecedorProduto(nomeFornecedor);
            mod.setCategoria(nomeCategoria);
            mod.setCest(conecta.rs.getInt("cest"));
            mod.setClassiFiscal(conecta.rs.getString("ncm"));
            mod.setCfop(conecta.rs.getInt("cfop"));
            mod.setPis(conecta.rs.getInt("pis"));
            mod.setCofins(conecta.rs.getInt("cofins"));
            mod.setAliqFederal(conecta.rs.getFloat("aliq_federal"));
            mod.setAliqEstadual(conecta.rs.getFloat("aliq_estadual"));
            mod.setAliqMunicipal(conecta.rs.getFloat("aliq_municipal"));
            mod.setCst(conecta.rs.getInt("cst"));
            mod.setCsosn(conecta.rs.getInt("csosn"));
            
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Pesquisar o Produto "+ ex);
        }
        conecta.desconecta();
        return mod;
    }
    
    public void buscaCodigo(String nome){
        
        conecta.conexao();
        conecta.executaSQL("SELECT * FROM fornecedor WHERE nome_fornecedor='"+nome+"'");
        
        try {
            conecta.rs.first();
            codFornecedor = conecta.rs.getInt("id_fornecedor");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar o Codigo "+ ex);
        }
        
        
    }
    
    public void buscaCodCat(String categoria){
        
        conecta.conexao();
        conecta.executaSQL("SELECT * FROM categorias WHERE nome_categoria='"+categoria+"'");
        
        try {
            conecta.rs.first();
            codCategoria = conecta.rs.getInt("id_categoria");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar o Codigo "+ ex);
        }
        
        
    }
    
}
