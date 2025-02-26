package visao;

import controle.ConectaBanco;
import controle.ControleParcelamento;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.AbstractAction;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.ListSelectionModel;
import modelo.ModeloParcelamentoVenda;
import modelo.ModeloTabela;

public class FrmSelecionaProduto extends javax.swing.JFrame {

    ConectaBanco conecta = new ConectaBanco();
    ModeloParcelamentoVenda mod = new ModeloParcelamentoVenda();
    PreparedStatement pst;
    ResultSet rs;
    ControleParcelamento control = new ControleParcelamento();
    DecimalFormat dc = new DecimalFormat("0.00");

    private String nomeProduto;

    private JTextField descricao;
    private JTextField jTextFieldProduto;

    public FrmSelecionaProduto() {
        initComponents();
        jTextFieldPesquisar.requestFocus();
        Sair();
        setIcon();
        preencherTabela();

    }

    FrmSelecionaProduto(JTextField jTextFieldProduto) {
        initComponents();
        jTextFieldPesquisar.requestFocus();
        Sair();
        setIcon();
        preencherTabela();
        this.descricao = jTextFieldProduto;

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaClientes = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldPesquisar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Selecionar Produto");

        jPanel1.setBackground(new java.awt.Color(0, 181, 181));

        tabelaClientes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tabelaClientes.setForeground(new java.awt.Color(51, 51, 51));
        tabelaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabelaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaClientesMouseClicked(evt);
            }
        });
        tabelaClientes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tabelaClientesKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaClientes);

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 153, 153), new java.awt.Color(0, 153, 153)));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Digite o nome do produto:");

        jTextFieldPesquisar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextFieldPesquisar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));
        jTextFieldPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldPesquisarKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldPesquisar)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 153));
        jButton1.setText("Concluir");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButtonSair.setBackground(new java.awt.Color(255, 255, 255));
        jButtonSair.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jButtonSair.setForeground(new java.awt.Color(0, 153, 153));
        jButtonSair.setText("Sair (ESC)");
        jButtonSair.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButtonSair.setBorderPainted(false);
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 870, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSair, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tabelaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaClientesMouseClicked

        String nome = (String) tabelaClientes.getValueAt(tabelaClientes.getSelectedRow(), 1);
        jTextFieldPesquisar.setText(nome);

    }//GEN-LAST:event_tabelaClientesMouseClicked

    private void jTextFieldPesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPesquisarKeyReleased
        conecta.conexao();
        try {

            conecta.executaSQL("select id_produto ,nome_produto , preco_venda , quantidade from produto where nome_produto like '" + jTextFieldPesquisar.getText() + "%' order by nome_produto asc");
            conecta.rs.first();

            preencherTabela();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Selecioanr Produto");
        } finally {

            conecta.desconecta();
        }
    }//GEN-LAST:event_jTextFieldPesquisarKeyReleased

    private void tabelaClientesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabelaClientesKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            this.nomeProduto = (String) tabelaClientes.getValueAt(tabelaClientes.getSelectedRow(), 1);
            this.descricao.setText(nomeProduto);
       
            jTextFieldPesquisar.setText("");
            preencherTabela();
            this.dispose();
            descricao.requestFocus();

        }
    }//GEN-LAST:event_tabelaClientesKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        this.nomeProduto = (String) tabelaClientes.getValueAt(tabelaClientes.getSelectedRow(), 1);
        this.descricao.setText(nomeProduto);
       
        jTextFieldPesquisar.setText("");
        preencherTabela();
        this.dispose();
        descricao.requestFocus();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

    public void preencherTabela() {
        ArrayList dados = new ArrayList();

        String[] Colunas = new String[]{"Codigo Produto", "Nome Produto", "Preço", "Estoque"};
        conecta.conexao();
        conecta.executaSQL("select id_produto ,nome_produto , preco_venda , quantidade from produto where nome_produto like '" + jTextFieldPesquisar.getText() + "%' order by nome_produto asc");

        try {

            conecta.rs.first();

            do {
                float valor = conecta.rs.getFloat("preco_venda");
                dados.add(new Object[]{conecta.rs.getInt("id_produto"), conecta.rs.getString("nome_produto"), dc.format(valor), conecta.rs.getInt("quantidade")});
            } while (conecta.rs.next());
        } catch (Exception e) {

            //JOptionPane.showMessageDialog(null, "ERRO AO CONECTAR"+ e);
        }

        ModeloTabela modelo = new ModeloTabela(dados, Colunas);

        tabelaClientes.setModel(modelo);
        tabelaClientes.getColumnModel().getColumn(0).setPreferredWidth(150);
        tabelaClientes.getColumnModel().getColumn(0).setResizable(false);
        tabelaClientes.getColumnModel().getColumn(1).setPreferredWidth(380);
        tabelaClientes.getColumnModel().getColumn(1).setResizable(false);
        tabelaClientes.getColumnModel().getColumn(2).setPreferredWidth(170);
        tabelaClientes.getColumnModel().getColumn(2).setResizable(false);
        tabelaClientes.getColumnModel().getColumn(3).setPreferredWidth(170);
        tabelaClientes.getColumnModel().getColumn(3).setResizable(false);

        tabelaClientes.getTableHeader().setReorderingAllowed(false);
        tabelaClientes.setAutoResizeMode(tabelaClientes.AUTO_RESIZE_OFF);
        tabelaClientes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tabelaClientes.setRowHeight(30);

        tabelaClientes.removeAll();

    }

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
            java.util.logging.Logger.getLogger(FrmSelecionaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmSelecionaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmSelecionaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmSelecionaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmSelecionaProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldPesquisar;
    private javax.swing.JTable tabelaClientes;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the nomeProduto
     */
    public String getNomeProduto() {
        return nomeProduto;
    }

    /**
     * @param nomeProduto the nomeProduto to set
     */
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
    }

    private void Sair() {
        javax.swing.InputMap inputMap = this.getRootPane().getInputMap(javax.swing.JComponent.WHEN_IN_FOCUSED_WINDOW);
        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "escape");
        this.getRootPane().setInputMap(javax.swing.JComponent.WHEN_IN_FOCUSED_WINDOW, inputMap);
        this.getRootPane().getActionMap().put("escape", new AbstractAction() {
            private static final long serialVersionUID = 1L;

            public void actionPerformed(ActionEvent arg0) {
                jButtonSair.doClick();
            }
        });
    }
}
