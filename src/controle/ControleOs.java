/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.ModeloOs;
import modelo.ModeloServico;
import modelo.ModeloVenda;


/**
 *
 * @author Haurio-PC
 */
public class ControleOs {
    
    float preco;
    int codProd, codCliente;
    ConectaBanco conecta = new ConectaBanco();
    ModeloOs mod = new ModeloOs();
    ConectaBanco c = new ConectaBanco();
    ModeloVenda modVenda = new ModeloVenda();
    
    public void CadastrarOS(ModeloOs mod) {

        conecta.conexao();
        

        try {

            PreparedStatement pst = conecta.conn.prepareStatement("INSERT INTO tab_os(data,hora,tipo,consultor,situacao_os,cliente_os,cpf_cnpj_os,"
                    + "endereco,email,telefone,modelo_os,placa,chassi,combustivel,valor_produto,valor_servico,valor_total,reclamacao1,forma_pagamento) "
                    + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            
           
            pst.setString(1, mod.getData());
            pst.setString(2, mod.getHora());
            pst.setString(3, mod.getTipo());
            pst.setString(4, mod.getConsultor());
            pst.setString(5, mod.getSituacao());
            pst.setString(6, mod.getCliente());
            pst.setString(7, mod.getCpf());
            pst.setString(8, mod.getEndereco());
            pst.setString(9, mod.getEmail());
            pst.setString(10, mod.getTelefone());
            pst.setString(11, mod.getModelo());
            pst.setString(12, mod.getPlaca());
            pst.setString(13, mod.getChassi());
            pst.setString(14, mod.getCombustivel());
            pst.setFloat(15, mod.getValorTotalProduto());
            pst.setFloat(16, mod.getValorServico());
            pst.setFloat(17, mod.getValorTotal());
            pst.setString(18, mod.getReclamacao());
            pst.setString(19, mod.getFormaPagamento());
           
            
            
            

            pst.execute();

            
            
            JOptionPane.showMessageDialog(null, "OS Aberta com Sucesso!!");

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Erro ao Cadastradar Cliente!" + e);
        }

    }
    public void adicionaItem(ModeloVenda mod) {

//        achaCodProduto(mod.getNomeProduto());
//        conecta.conexao();
//        try {
//            PreparedStatement pst = conecta.conn.prepareStatement("INSERT INTO itens_venda_produto(id_venda, id_produto, quantidade_produto) VALUES(?,?,?)");
//            pst.setInt(1, mod.getIdVenda());
//            achaCodProduto(mod.getNomeProduto());
//            pst.setInt(2, codProd);
//            pst.setFloat(3, mod.getQtItem());
//            pst.execute();
//            // baixa de estoque
//            float quant = 0, resul = 0;
//            conecta.executaSQL("select * from produto where nome_produto ='" + mod.getNomeProduto() + "'");
//            conecta.rs.first();
//            quant = conecta.rs.getFloat("quantidade");
//            resul = quant - mod.getQtItem();
//            pst = conecta.conn.prepareStatement("update produto set quantidade = ? where nome_produto = ?");
//            pst.setFloat(1, resul);
//            pst.setString(2, mod.getNomeProduto());
//            pst.execute();
//
//            conecta.desconecta();
//        } catch (SQLException ex) {
//
//            conecta.desconecta();
//            JOptionPane.showMessageDialog(null, "Erro Ao Adiconar Item " + ex);
//        }
    }
        public void achaCodProduto(String nome) {

        conecta.conexao();

        conecta.executaSQL("SELECT * FROM produto WHERE nome_produto = '" + nome + "'");
        try {

            conecta.rs.first();
            codProd = conecta.rs.getInt("id_produto");
            preco = conecta.rs.getFloat("preco_venda");

        } catch (SQLException ex) {
            conecta.desconecta();
            JOptionPane.showMessageDialog(null, "Erro Achar o Codigo " + ex);
        }
        }
        
//        public void achaValorProduto(Float nome) {
//
//        conecta.conexao();
//
//        conecta.executaSQL("SELECT * FROM produto WHERE nome_produto = '" + nome + "'");
//        try {
//
//            conecta.rs.first();
//            preco = conecta.rs.getFloat("preco_venda");
//
//        } catch (SQLException ex) {
//            conecta.desconecta();
//            JOptionPane.showMessageDialog(null, "Erro Achar preço " + ex);
//        }
//        
//    }

    public void adicionaProduto(ModeloOs mod, int id_prod) {
        achaCodProduto(mod.getNomeProduto());
        conecta.conexao();
        try {
            PreparedStatement pst = conecta.conn.prepareStatement("INSERT INTO tab_os_produtos(id_produtos,os,nome_produto,valor_produto, quantidade) VALUES( ?,?,?,?,?)");
            pst.setInt(1, id_prod);
            pst.setInt(2, mod.getOs());
            pst.setString(3,mod.getNomeProduto());
//           pst.setInt(3, codProd);
            pst.setFloat(5, mod.getQtItem());
            //achaValorProduto(mod.getValorTotalProduto());
            pst.setFloat(4,preco);
            pst.execute();
//            
            
            
            // baixa de estoque
            float quant = 0, resul = 0;
            conecta.executaSQL("select * from produto where nome_produto ='" + mod.getNomeProduto() + "'");
            conecta.rs.first();
            quant = conecta.rs.getFloat("quantidade");
            resul = quant - mod.getQtItem();
            pst = conecta.conn.prepareStatement("update produto set quantidade = ? where nome_produto = ?");
            pst.setFloat(1, resul);
            pst.setString(2, mod.getNomeProduto());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Produto adicionado com Sucesso");
            conecta.desconecta();
        } catch (SQLException ex) {

            conecta.desconecta();
            JOptionPane.showMessageDialog(null, "Erro Ao Adiconar Item 1" + ex);
        }
    }

    public void adicionaServico(ModeloOs mod, int id) {
        //achaCodProduto(mod.getNomeProduto());
        conecta.conexao();
        try {
            PreparedStatement pst = conecta.conn.prepareStatement("INSERT INTO sistemaautopecas.tab_os_servico(os,id_servico, descricao,valor,tempo,isServico) VALUES(?,?,?,?,?,?)");
            pst.setInt(1, mod.getOs());
            pst.setInt(2, id);
            pst.setString(3, mod.getServico());
         //   achaCodProduto(mod.getServico());
            pst.setFloat(4, mod.getValorServico());
            pst.setString(5, mod.getTempo());
            pst.setInt(6, 1);
            pst.execute();
            // baixa de estoque
       //     float quant = 0, resul = 0;
            conecta.desconecta();
            JOptionPane.showMessageDialog(null, "Serviço adicionado com Sucesso");
        } catch (SQLException ex) {

            conecta.desconecta();
            JOptionPane.showMessageDialog(null, "Erro Ao Adiconar Item " + ex);
        }
    }
  
     public void AtualizaSituacaoOficina(ModeloOs mod) {

        conecta.conexao();
        

        try {

            PreparedStatement pst = conecta.conn.prepareStatement("UPDATE tab_os SET situacao_os = ? where os=?");
          
            
            pst.setString(1, mod.getSituacao());
            pst.setInt(2, mod.getOs());

           
            pst.execute();

            JOptionPane.showMessageDialog(null, "OS Atualizada com Sucesso!");

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Erro ao Atualizar Serviço" + e);
        }

    }
public void ExcluirProdutoTab(int mod){
        
        conecta.conexao();
        
        try {
            PreparedStatement pst = conecta.conn.prepareStatement("DELETE FROM tab_os_produtos2 WHERE id_tab = ?");
            pst.setInt(1, mod);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Produto Removido com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Excluir o Produto.\n"+ ex);
        }
        
    }
}
