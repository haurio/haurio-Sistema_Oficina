/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.ModeloCliente;

/**
 *
 * @author Benson & Haurio
 */
public class ControleCliente {

    ConectaBanco conectaC = new ConectaBanco();
    ModeloCliente modeloCliente = new ModeloCliente();

    int codBairro, codCidade;
    String Bairro, Cidade, Telefone;

    public void InserirCliente(ModeloCliente mod) {

        conectaC.conexao();
        

        try {

            PreparedStatement pst = conectaC.conn.prepareStatement("INSERT INTO clientes(nome_cliente,tipo_pessoa,cpf_cliente,rg_cliente,sexo,cep,endereco_cliente,numero,"
                    + "complemento,ibge,uf,cidade,bairro,inscricao_estadual,inscricao_municipal,limite_compra,telefone,email,apelido,ddd) "
                    + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getTipo_pessoa());
            pst.setString(3, mod.getCpf());
            pst.setString(4, mod.getRg());
            pst.setString(5, mod.getSexo());
            pst.setString(6, mod.getCep());
            pst.setString(7, mod.getEndereco());
            pst.setString(8, mod.getNumero());
            pst.setString(9, mod.getComplemento());
            pst.setString(10, mod.getIbge());
            pst.setString(11, mod.getUf());
            pst.setString(12, mod.getCidade());
//            buscaCod(mod.getIdCidade());
//            pst.setInt(12, codCidade);
            pst.setString(13, mod.getBairro());
            pst.setString(14, mod.getInscricao_estadual());
            pst.setString(15, mod.getInscricao_municipal());
            pst.setFloat(16, mod.getLimite());
            pst.setString(17, mod.getTelefone());
            pst.setString(18, mod.getEmail());
            pst.setString(19, mod.getApelido());
            pst.setString(20, mod.getDdd());
            
            pst.execute();

            JOptionPane.showMessageDialog(null, "Cliente Cadastrado com Sucesso");

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Erro ao Cadastradar Cliente!" + e);
        }

    }

    public void AlterarCliente(ModeloCliente mod) {

        conectaC.conexao();
//        buscaCod(mod.getIdCidade());

        try {

            PreparedStatement pst = conectaC.conn.prepareStatement("UPDATE clientes SET nome_cliente=?, tipo_pessoa=?, cpf_cliente=?, rg_cliente=?, sexo=?,cep=?, endereco_cliente=?, "
                    + "numero=?, complemento=?, ibge=?, uf=?, cidade=?, bairro=?, inscricao_estadual=?, inscricao_municipal=?, limite_compra=?, telefone=?, email=?, "
                    + "apelido=?, ddd=? WHERE id_cliente = ?");
            pst.setString(1, mod.getNome());
            pst.setString(2, mod.getTipo_pessoa());
            pst.setString(3, mod.getCpf());
            pst.setString(4, mod.getRg());
            pst.setString(5, mod.getSexo());
            pst.setString(6, mod.getCep());
            pst.setString(7, mod.getEndereco());
            pst.setString(8, mod.getNumero());
            pst.setString(9, mod.getComplemento());
            pst.setString(10, mod.getIbge());
            pst.setString(11, mod.getUf());
            pst.setString(12, mod.getCidade());
//            buscaCod(mod.getIdCidade());
//            pst.setInt(12, codCidade);
            pst.setString(13, mod.getBairro());
            pst.setString(14, mod.getInscricao_estadual());
            pst.setString(15, mod.getInscricao_municipal());
            pst.setFloat(16, mod.getLimite());
            pst.setString(17, mod.getTelefone());
            pst.setString(18, mod.getEmail());
            pst.setString(19, mod.getApelido());
            pst.setString(20, mod.getDdd());
            pst.setInt(21, mod.getId());
            
           
            pst.execute();

            JOptionPane.showMessageDialog(null, "Cliente Atualizado com Sucesso!");

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Erro ao Atualizar Cliente" + e);
        }

    }

    public void ExcluirCliente(ModeloCliente mod) {

        conectaC.conexao();

        try {
            PreparedStatement pst = conectaC.conn.prepareStatement("DELETE FROM clientes WHERE id_cliente = ?");
            pst.setInt(1, mod.getId());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Cliente Excluido com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Excluir o Cliente \n" + ex);
        }

    }

   public void buscaCod(String Cidade) {

        try {
            conectaC.executaSQL("SELECT * FROM cidades WHERE municipio ='" + Cidade + "'");
            conectaC.rs.first();
            codCidade = conectaC.rs.getInt("id_cidade");

        } catch (SQLException ex) {
            Logger.getLogger(ControleCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void buscaNomes(int codBairro, int codCid) {

        try {

            conectaC.executaSQL("SELECT * FROM bairro WHERE id_bairro = " + codBairro);
            conectaC.rs.first();
            Bairro = conectaC.rs.getString("nome_bairro");

            conectaC.executaSQL("SELECT * FROM cidades WHERE id_cidade = " + codCid);
            conectaC.rs.first();
            Cidade = conectaC.rs.getString("municipio");

        } catch (Exception ex) {
            Logger.getLogger(ControleCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ModeloCliente pesquisaCliente(ModeloCliente mod) {

        conectaC.conexao();

        conectaC.executaSQL("SELECT * FROM clientes WHERE nome_cliente LIKE '%" + mod.getPesquisa() + "%'");

        try {
            conectaC.rs.first();
            
            mod.setId(conectaC.rs.getInt("id_cliente"));
            mod.setNome(conectaC.rs.getString("nome_cliente"));
            mod.setTipo_pessoa(conectaC.rs.getString("tipo_pessoa"));
            mod.setCpf(conectaC.rs.getString("cpf_cliente"));
            mod.setRg(conectaC.rs.getString("rg_cliente"));
            mod.setSexo(conectaC.rs.getString("sexo"));
            mod.setCep(conectaC.rs.getString("cep"));
            mod.setEndereco(conectaC.rs.getString("endereco_cliente"));
            mod.setNumero(conectaC.rs.getString("numero"));
            mod.setComplemento(conectaC.rs.getString("complemento"));
            mod.setIbge(conectaC.rs.getString("ibge"));
            mod.setUf(conectaC.rs.getString("uf"));
            mod.setCidade(conectaC.rs.getString("cidade"));
            mod.setBairro(conectaC.rs.getString("bairro"));
            mod.setInscricao_estadual(conectaC.rs.getString("inscricao_estadual"));
            mod.setInscricao_municipal(conectaC.rs.getString("inscricao_municipal"));
            mod.setLimite(conectaC.rs.getFloat("limite_compra"));
            mod.setDdd(conectaC.rs.getString("ddd"));
            mod.setTelefone(conectaC.rs.getString("telefone"));
            mod.setEmail(conectaC.rs.getString("email"));
            mod.setApelido(conectaC.rs.getString("apelido"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Pesquisar o Produto " + ex);
        }
        conectaC.desconecta();
        return mod;

    }

    public ModeloCliente chamaCliente(ModeloCliente mod) {

        conectaC.conexao();

        conectaC.executaSQL("SELECT * FROM clientes WHERE nome_cliente LIKE '%" + mod.getPesquisa() + "%'");

        try {
            conectaC.rs.first();
            //buscaNomeFornecedor(conectaC.rs.getInt("id_fornecedor"));
            mod.setId(conectaC.rs.getInt("id_cliente"));
            mod.setNome(conectaC.rs.getString("nome_cliente"));
            mod.setEndereco(conectaC.rs.getString("endereco_cliente"));
            mod.setRg(conectaC.rs.getString("rg_cliente"));
            mod.setCpf(conectaC.rs.getString("cpf_cliente"));
            mod.setDdd(conectaC.rs.getString("ddd"));
            mod.setTelefone(conectaC.rs.getString("telefone"));
            mod.setSexo(conectaC.rs.getString("sexo"));
            mod.setUf(conectaC.rs.getString("uf"));
            mod.setCidade(conectaC.rs.getString("cidade"));
            mod.setInscricao_estadual(conectaC.rs.getString("inscricao_estadual"));
            mod.setInscricao_municipal(conectaC.rs.getString("inscricao_municipal"));
            mod.setNumero(conectaC.rs.getString("numero"));
            mod.setComplemento(conectaC.rs.getString("complemento"));
            mod.setIbge(conectaC.rs.getString("ibge"));
            mod.setCep(conectaC.rs.getString("cep"));

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Pesquisar o Produto " + ex);
        }
        conectaC.desconecta();
        return mod;

    }

}
