/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import modelo.ModeloVeiculo;

/**
 *
 * @author Haurio-PC
 */
public class ControleVeiculos {
    ConectaBanco conecta = new ConectaBanco();
    ConectaBanco ConectaPro = new ConectaBanco();
    ModeloVeiculo mod = new ModeloVeiculo();
    DateFormat data = new SimpleDateFormat("dd/MM/yyyy");
    int idProprietario;
    String NomeProprietario;
   
    public void InserirVeiculo(ModeloVeiculo mod){
            
            conecta.conexao();
            
        try {
            PreparedStatement pst = conecta.conn.prepareStatement("INSERT INTO veiculos (placa, ano_modelo, ano_fabric, chassi, renavam,"
                    + "numero_motor, marca, modelo, cor_externa, cor_interna, combustivel, motor, especie, km, proprietario, data_cadastro) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"); 
            pst.setString(1, mod.getPlaca());
            pst.setString(2, mod.getAnoModelo());
            pst.setString(3, mod.getAnoFabricacao());
            pst.setString(4, mod.getChassi());
            pst.setString(5, mod.getRenavam());
            pst.setString(6, mod.getNumeromotor());
            pst.setString(7, mod.getMarca());
            pst.setString(8, mod.getModelo());
            pst.setString(9, mod.getCorExterna());
            pst.setString(10, mod.getCorInterna());
            pst.setString(11, mod.getCombustivel());
            pst.setString(12, mod.getMotor());
            pst.setString(13, mod.getEspecie());
            pst.setString(14, mod.getKm());
            pst.setString(15, mod.getProprietario());
            //pst.setInt(15, idProprietario);
            pst.setString(16, mod.getDataCadastro());
            
            
            pst.execute();
            JOptionPane.showMessageDialog(null, "Veiculo Cadastrado com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Cadastrar o veiculo "+ ex);
        }
    } 
    
    public void AlterarVeiculo(ModeloVeiculo mod){
        
        conecta.conexao();
        try {
        
        
            PreparedStatement pst = conecta.conn.prepareStatement("UPDATE  veiculos SET placa=?, ano_modelo=?, ano_fabric=?, chassi=?, renavam=?,"
                    + "numero_motor=?, marca=?, modelo=?, cor_externa=?, cor_interna=?, combustivel=?, motor=?, especie=?, km=?, proprietario=?, data_cadastro=? WHERE id_veiculos = ?");
            
            pst.setString(1, mod.getPlaca());
            pst.setString(2, mod.getAnoModelo());
            pst.setString(3,mod.getAnoFabricacao());
            pst.setString(4, mod.getChassi());
            pst.setString(5, mod.getRenavam());
            pst.setString(6, mod.getNumeromotor());
            pst.setString(7, mod.getMarca());
            pst.setString(8, mod.getModelo());
            pst.setString(9, mod.getCorExterna());
            pst.setString(10, mod.getCorInterna());
            pst.setString(11, mod.getCombustivel());
            pst.setString(12, mod.getMotor());
            pst.setString(13, mod.getEspecie());
            pst.setString(14, mod.getKm());
            pst.setString(15, mod.getProprietario());
            //pst.setInt(15, idProprietario);
            pst.setString(16, mod.getDataCadastro());
            pst.setInt(17, mod.getIdVeiculo());
            
            pst.execute();
            JOptionPane.showMessageDialog(null, "Veiculo Alterado com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar o Veiculo "+ ex);
       }
  
    }
    
    public void ExcluirVeiculo(ModeloVeiculo mod){
        
        conecta.conexao();
        
        try {
            PreparedStatement pst = conecta.conn.prepareStatement("DELETE FROM veiculos WHERE id_veiculos = ?");
            pst.setInt(1, mod.getIdVeiculo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Veiculo Excluido com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Excluir  Veiculo. Veiculo vinculado a OS \n"+ ex);
        }
        
    
    
   
        
    }
    
    public ModeloVeiculo buscaVeiculo(ModeloVeiculo modelo) throws ParseException{
        
        conecta.conexao();
        
        conecta.executaSQL("SELECT * FROM veiculos WHERE placa LIKE '%" + modelo.getPesquisa()+ "%'");
        
        try {
            conecta.rs.first();
            
            mod.setIdVeiculo(conecta.rs.getInt("id_veiculos"));
            mod.setPlaca(conecta.rs.getString("placa"));
            mod.setAnoModelo(conecta.rs.getString("ano_modelo"));
            mod.setAnoFabricacao(conecta.rs.getString("ano_fabric"));
            mod.setChassi(conecta.rs.getString("chassi"));
            mod.setRenavam(conecta.rs.getString("renavam"));
            mod.setNumeromotor(conecta.rs.getString("numero_motor"));
            mod.setMarca(conecta.rs.getString("marca"));
            mod.setModelo(conecta.rs.getString("modelo"));
            mod.setCorExterna(conecta.rs.getString("cor_externa"));
            mod.setCorInterna(conecta.rs.getString("cor_interna"));
            mod.setCombustivel(conecta.rs.getString("combustivel"));
            mod.setMotor(conecta.rs.getString("motor"));
            mod.setEspecie(conecta.rs.getString("especie"));
            mod.setKm(conecta.rs.getString("km"));
            mod.setProprietario(conecta.rs.getString("proprietario"));
            mod.setDataCadastro(conecta.rs.getString("data_cadastro"));
        
            
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Veiculo não cadastrado ");
        }
        conecta.desconecta();
        return mod;
    }
    
    public void buscaNomeProprietario(int cod){
        
        ConectaPro.conexao();
        ConectaPro.executaSQL("SELECT * FROM clientes WHERE id_cliente ='"+ cod +"'");
        
        try {
            ConectaPro.rs.first();
            NomeProprietario = ConectaPro.rs.getString("nome_cliente");
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Erro ao Pesquisar o Proprietario "+ ex);
        }
   
    }
}
