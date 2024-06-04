/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import controle.ConectaBanco;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.AbstractAction;
import javax.swing.KeyStroke;
import javax.swing.ListSelectionModel;
import modelo.ModeloProduto;
import modelo.ModeloTabela;
import modelo.ModeloVeiculo;

/**
 *
 * @author Haurio-PC
 */
public class FrmVeiculos extends javax.swing.JFrame {

    ConectaBanco conecta = new ConectaBanco();
    ModeloVeiculo mod = new ModeloVeiculo();
    DateFormat data = new SimpleDateFormat("dd/MM/yyyy");
    /**
     * Creates new form FrmVeiculos
     */
    public FrmVeiculos() {
        initComponents();
        setIcon();
        this.setExtendedState(MAXIMIZED_BOTH);
        jLabelCarregando.setVisible(false);
        NovoVeiculo();
        Sair();
      //  qProduto();
        iniciarproduto();
        
        
        chamaTabela("select *from veiculos where placa like '%"+jTextFieldPesquisa.getText()+"%' order by placa asc");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldPesquisa = new javax.swing.JTextField();
        jButtonNovo = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldTotal = new javax.swing.JTextField();
        jLabelCarregando = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 181, 181));

        tabela.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tabela.setForeground(new java.awt.Color(51, 51, 51));
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        tabela.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tabelaKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Pesquisar Veiculo:");

        jTextFieldPesquisa.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextFieldPesquisa.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));
        jTextFieldPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPesquisaActionPerformed(evt);
            }
        });
        jTextFieldPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldPesquisaKeyReleased(evt);
            }
        });

        jButtonNovo.setBackground(new java.awt.Color(255, 255, 255));
        jButtonNovo.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jButtonNovo.setForeground(new java.awt.Color(0, 153, 153));
        jButtonNovo.setText("Novo Veiculo (F6)");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 153, 153));
        jButton3.setText("Relatório Veiculos");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButtonSair.setBackground(new java.awt.Color(255, 255, 255));
        jButtonSair.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jButtonSair.setForeground(new java.awt.Color(0, 153, 153));
        jButtonSair.setText("Sair (ESC)");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Quantidade de Veiculos cadastrados:");

        jTextFieldTotal.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jTextFieldTotal.setForeground(new java.awt.Color(51, 51, 51));
        jTextFieldTotal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));

        jLabelCarregando.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelCarregando.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCarregando.setText("CARREGANDO RELATÓRIO...");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                                .addGap(59, 59, 59)
                                .addComponent(jLabel2)
                                .addGap(10, 10, 10)
                                .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(11, 11, 11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonNovo)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(241, 241, 241)
                        .addComponent(jLabelCarregando)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSair)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelCarregando)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked

    }//GEN-LAST:event_tabelaMouseClicked

    private void tabelaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabelaKeyPressed

//        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
//            int index = (int) tabela.getValueAt(tabela.getSelectedRow(), 0);
//            mod.setIdProduto(index);
//
//            FrmEditarProduto p = new FrmEditarProduto(index);
//            p.setVisible(true);
//            dispose();
       // }
    }//GEN-LAST:event_tabelaKeyPressed

    private void jTextFieldPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPesquisaActionPerformed

    private void jTextFieldPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPesquisaKeyReleased
        conecta.conexao();
        try {

            conecta.executaSQL("select * from produto inner join categorias on produto.id_categoria = categorias.id_categoria where nome_produto like '%"+jTextFieldPesquisa.getText()+"%' order by nome_produto asc");
            conecta.rs.first();

            chamaTabela("select * from produto inner join categorias on produto.id_categoria = categorias.id_categoria where nome_produto like '%"+jTextFieldPesquisa.getText()+"%' order by nome_produto asc");

        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Erro ao Selecioanr Produto");
        }
    }//GEN-LAST:event_jTextFieldPesquisaKeyReleased

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        FrmCadastraVeiculo p = new FrmCadastraVeiculo();
        p.setVisible(true);

    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

//        new Thread(){
//
//            public void run(){
//                jLabelCarregando.setVisible(true);
//                TarefasSegundoPlano tarefa = new TarefasSegundoPlano();
//                tarefa.relatorioProdutos();
//                jLabelCarregando.setVisible(false);
//            }
//
//        }.start();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmVeiculos().setVisible(true);
            }
        });
    }
    private void iniciarproduto(){
         chamaTabela("select *  from produto inner join categorias on produto.id_categoria = categorias.id_categoria ");
    }
    private void chamaTabela(String SQL) {
       
      

        ArrayList dados = new ArrayList();

        String[] Colunas = new String[]{"ID","Placa","Ano Modelo","Ano Fabricação", "Chassi", "Renavam", "Nº Motor", "Marca", "Modelo",
        "Cor Externa","Cor Interna","Combustivel","Torque","Especie","KM","Fornecedor","Data Cadastro"};
        conecta.conexao();
        conecta.executaSQL(SQL);
       
        try {

            conecta.rs.first();

            do {
                 Date data_cadastro = conecta.rs.getDate("data_cadastro");
                dados.add(new Object[]{conecta.rs.getInt("id_veiculos"), conecta.rs.getString("placa"), conecta.rs.getString("ano_modelo"),
                         conecta.rs.getString("ano_fabric"),conecta.rs.getString("chassi"),conecta.rs.getString("renavam"),conecta.rs.getString("numero_motor"),
                         conecta.rs.getString("marca"),conecta.rs.getString("modelo"),conecta.rs.getString("cor_externa"),conecta.rs.getString("cor_interna"),
                         conecta.rs.getString("combustivel"),conecta.rs.getString("motor"), conecta.rs.getString("especie"), conecta.rs.getString("fornecedor"), data.format(data_cadastro)});
            } while (conecta.rs.next());
        } catch (SQLException e) {

            //JOptionPane.showMessageDialog(null, "ERRO AO CONECTAR"+ e);
        }

        ModeloTabela modelo = new ModeloTabela(dados, Colunas);

        tabela.setModel(modelo);
        tabela.getColumnModel().getColumn(0).setPreferredWidth(40);
        tabela.getColumnModel().getColumn(0).setResizable(false);
        tabela.getColumnModel().getColumn(1).setPreferredWidth(60);
        tabela.getColumnModel().getColumn(1).setResizable(false);
        tabela.getColumnModel().getColumn(2).setPreferredWidth(80);
        tabela.getColumnModel().getColumn(2).setResizable(false);
        tabela.getColumnModel().getColumn(3).setPreferredWidth(100);
        tabela.getColumnModel().getColumn(3).setResizable(false);
        tabela.getColumnModel().getColumn(4).setPreferredWidth(100);
        tabela.getColumnModel().getColumn(4).setResizable(false);
        tabela.getColumnModel().getColumn(5).setPreferredWidth(80);
        tabela.getColumnModel().getColumn(5).setResizable(false);
        tabela.getColumnModel().getColumn(6).setPreferredWidth(105);
        tabela.getColumnModel().getColumn(6).setResizable(false);
        tabela.getColumnModel().getColumn(7).setPreferredWidth(110);
        tabela.getColumnModel().getColumn(7).setResizable(false);
        tabela.getColumnModel().getColumn(8).setPreferredWidth(300);
        tabela.getColumnModel().getColumn(8).setResizable(false);
        tabela.getColumnModel().getColumn(9).setPreferredWidth(120);
        tabela.getColumnModel().getColumn(9).setResizable(false);
        tabela.getColumnModel().getColumn(10).setPreferredWidth(120);
        tabela.getColumnModel().getColumn(10).setResizable(false);
        tabela.getColumnModel().getColumn(11).setPreferredWidth(100);
        tabela.getColumnModel().getColumn(11).setResizable(false);
        tabela.getColumnModel().getColumn(12).setPreferredWidth(65);
        tabela.getColumnModel().getColumn(12).setResizable(false);
        tabela.getColumnModel().getColumn(13).setPreferredWidth(100);
        tabela.getColumnModel().getColumn(13).setResizable(false);
        tabela.getColumnModel().getColumn(14).setPreferredWidth(70);
        tabela.getColumnModel().getColumn(14).setResizable(false);
        tabela.getColumnModel().getColumn(15).setPreferredWidth(90);
        tabela.getColumnModel().getColumn(15).setResizable(false);
        tabela.getColumnModel().getColumn(16).setPreferredWidth(100);
        tabela.getColumnModel().getColumn(16).setResizable(false);
        
        
        
        

        tabela.getTableHeader().setReorderingAllowed(false);
        tabela.setAutoResizeMode(tabela.AUTO_RESIZE_OFF);
        tabela.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tabela.setRowHeight(28);

    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelCarregando;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldPesquisa;
    private javax.swing.JTextField jTextFieldTotal;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables

public void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
    }
 private void NovoVeiculo() {
        javax.swing.InputMap inputMap = this.getRootPane().getInputMap(javax.swing.JComponent.WHEN_IN_FOCUSED_WINDOW);
                inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_F6, 0),"novo");
                this.getRootPane().setInputMap(javax.swing.JComponent.WHEN_IN_FOCUSED_WINDOW, inputMap);
                this.getRootPane().getActionMap().put("novo", new AbstractAction(){
                private static final long serialVersionUID = 1L;
                public void actionPerformed(ActionEvent arg0) {            
                jButtonNovo.doClick();
                }
            });
    }
 private void Sair() {
       javax.swing.InputMap inputMap = this.getRootPane().getInputMap(javax.swing.JComponent.WHEN_IN_FOCUSED_WINDOW);
                inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0),"escape");
                this.getRootPane().setInputMap(javax.swing.JComponent.WHEN_IN_FOCUSED_WINDOW, inputMap);
                this.getRootPane().getActionMap().put("escape", new AbstractAction(){
                private static final long serialVersionUID = 1L;
                public void actionPerformed(ActionEvent arg0) {            
                jButtonSair.doClick();
                }
            });   
    }
}