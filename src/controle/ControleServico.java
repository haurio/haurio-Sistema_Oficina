/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.ModeloServico;


/**
 *
 * @author Haurio-PC
 */
public class ControleServico {
   ConectaBanco conecta = new ConectaBanco();
   ModeloServico mod = new ModeloServico();
   
   
   
   public void InserirServico(ModeloServico mod) {
    conecta.conexao();
        

        try {

            PreparedStatement pst = conecta.conn.prepareStatement("INSERT INTO servicos (codigo,descricao,tipo_servico,tempo_servico,valor_servico)VALUES(?,?,?,?,?)");
            pst.setString(1, mod.getCodigo());
            pst.setString(2, mod.getDescricacao());
            pst.setString(3, mod.getTipoServico());
            pst.setString(4, mod.getTempoServico());
            pst.setFloat(5, mod.getValorServico());
            
            
            
            pst.execute();

            JOptionPane.showMessageDialog(null, "Serviço Cadastrado com Sucesso!");

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Erro ao Cadastrada Serviço!" + e);
        }

    }

    public void AlterarServico(ModeloServico mod) {

        conecta.conexao();
        

        try {

            PreparedStatement pst = conecta.conn.prepareStatement("UPDATE servicos SET  descricao=?, tipo_servico=?, tempo_servico=?, valor_servico=? WHERE codigo = ?");
          
            
            pst.setString(1, mod.getDescricacao());
            pst.setString(2, mod.getTipoServico());
            pst.setString(3, mod.getTempoServico());
            pst.setFloat(4, mod.getValorServico());
            pst.setString(5, mod.getCodigo());
           
            pst.execute();

            JOptionPane.showMessageDialog(null, "Serviço Atualizado com Sucesso!");

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Erro ao Atualizar Serviço" + e);
        }

    }

    public void ExcluirServico(ModeloServico mod) {

        conecta.conexao();

        try {
            PreparedStatement pst = conecta.conn.prepareStatement("DELETE FROM servicos WHERE codigo = ?");
            pst.setString(1, mod.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Serviço Excluido com Sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Excluir o Serviço \n" + ex);
        }

    }
    
    public ModeloServico pesquisaServico(ModeloServico mod) {

        conecta.conexao();

        conecta.executaSQL("SELECT * FROM servicos WHERE descricao LIKE '%" + mod.getPesquisa() + "%'");

        try {
            conecta.rs.first();
           
            mod.setCodigo(conecta.rs.getString("codigo"));
            mod.setDescricacao(conecta.rs.getString("descricao"));
            mod.setTipoServico(conecta.rs.getString("tipo_servico"));
            mod.setTempoServico(conecta.rs.getString("tempo_servico"));
            mod.setValorServico(conecta.rs.getFloat("valor_servico"));
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Pesquisar o Serviço! " + ex);
        }
        conecta.desconecta();
        return mod;

    }
}

