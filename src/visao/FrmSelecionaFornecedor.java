
package visao;

import controle.ConectaBanco;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.ListSelectionModel;
import modelo.ModeloTabela;

/**
 *
 * @author cyro
 */
public class FrmSelecionaFornecedor extends javax.swing.JFrame {
        ConectaBanco conecta = new ConectaBanco();
        //ModeloTabela modelo = new ModeloTabela();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        DecimalFormat df = new DecimalFormat("0.00");
        PreparedStatement pst;
        ResultSet rs;
        
        
        
    public FrmSelecionaFornecedor() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        setIcon();
        Sair();
       
        
        preencherTabela();
        //somaValores();
        
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
        tabelaClientes = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButtonSair = new javax.swing.JButton();
        jTextFieldSoma = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldPesquisar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Selecione o Fornecedor");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(0, 181, 181));
        jPanel1.setToolTipText("Selecionar Cliente");

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

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Total a pagar:");

        jButtonSair.setBackground(new java.awt.Color(255, 255, 255));
        jButtonSair.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jButtonSair.setForeground(new java.awt.Color(0, 153, 153));
        jButtonSair.setText("Sair (ESC)");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jTextFieldSoma.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldSoma.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldSoma, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSair)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSoma, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 153, 153), new java.awt.Color(0, 153, 153)));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Digite o nome do fornecedor:");

        jTextFieldPesquisar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTextFieldPesquisar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));
        jTextFieldPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldPesquisarKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(jTextFieldPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 787, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(186, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(0, 32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void tabelaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaClientesMouseClicked
//        int cod = (int) tabelaClientes.getValueAt(tabelaClientes.getSelectedRow(),1);
//        
//        FrmBaixaParcela b = new FrmBaixaParcela(cod);
//        b.setVisible(true);
        
    }//GEN-LAST:event_tabelaClientesMouseClicked

    private void jTextFieldPesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPesquisarKeyReleased
        conecta.conexao();
        
       
            try {
                 conecta.executaSQL("select pc.cod_compra , pc.id_parc_compra , pc.id_fornecedor , f.nome_fornecedor , pc.valor_parc , pc.pago ,pc.valor_resta , pc.datavenc  from compras c inner join parcela_compra pc on c.id_compra = pc.cod_compra inner join fornecedor f on pc.id_fornecedor = f.id_fornecedor where nome_fornecedor like '%"+jTextFieldPesquisar.getText()+"%' and estado!='Pago' order by pc.datavenc asc");
                 
                 conecta.rs.first();
                 
                 if(conecta.rs.next()){
                 
                 preencherTabela();
                 }else{
                  
//                     JOptionPane.showMessageDialog(null, "Não Existe Cliente com Esse Nome");
                 
                 }
                
            } catch (SQLException ex) {
                Logger.getLogger(FrmSelecionaFornecedor.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_jTextFieldPesquisarKeyReleased

    private void tabelaClientesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabelaClientesKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
        
         int cod = (int) tabelaClientes.getValueAt(tabelaClientes.getSelectedRow(),1);
        
        FrmBaixaParcelaCompra b = new FrmBaixaParcelaCompra(cod);
        b.setVisible(true);
        dispose();
        
        }
    }//GEN-LAST:event_tabelaClientesKeyPressed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonSairActionPerformed

        public void preencherTabela(){
            ArrayList dados = new ArrayList();
           
            String[] Colunas = new String[]{"Cod Compra","Cod Parcela", "Cod Cliente", "Nome Cliente", "Valor Parcela", "Valor Pago","Valor Restante","Data Vencimento"};
            conecta.conexao();
            conecta.executaSQL("select pc.cod_compra , pc.id_parc_compra , pc.id_fornecedor , f.nome_fornecedor , pc.valor_parc , pc.pago ,pc.valor_resta , pc.datavenc  from compras c inner join parcela_compra pc on c.id_compra = pc.cod_compra inner join fornecedor f on pc.id_fornecedor = f.id_fornecedor where f.nome_fornecedor like '%"+jTextFieldPesquisar.getText()+"%' and pc.estado!='Pago' order by pc.datavenc asc");
            
            try {
                
                conecta.rs.first();
                
                do {
                    float valorParcela = conecta.rs.getFloat("valor_parc");
                    float valorPago = conecta.rs.getFloat("pago");
                    float valorResta = conecta.rs.getFloat("valor_resta");
                    Date data = conecta.rs.getDate("datavenc");
                    dados.add(new Object[]{conecta.rs.getInt("cod_compra"), conecta.rs.getInt("id_parc_compra"), conecta.rs.getInt("id_fornecedor"), conecta.rs.getString("nome_fornecedor"),df.format(valorParcela), df.format(valorPago),df.format(valorResta), sdf.format(data)});
                } while (conecta.rs.next());
            } catch (Exception e) {
                
                //JOptionPane.showMessageDialog(null, "ERRO AO CONECTAR"+ e);
            
        }
            
            ModeloTabela modelo = new ModeloTabela(dados, Colunas);
            
            tabelaClientes.setModel(modelo);
            tabelaClientes.getColumnModel().getColumn(0).setPreferredWidth(120);
            tabelaClientes.getColumnModel().getColumn(0).setResizable(false);
            tabelaClientes.getColumnModel().getColumn(1).setPreferredWidth(120);
            tabelaClientes.getColumnModel().getColumn(1).setResizable(false);
            tabelaClientes.getColumnModel().getColumn(2).setPreferredWidth(120);
            tabelaClientes.getColumnModel().getColumn(2).setResizable(false);
            tabelaClientes.getColumnModel().getColumn(3).setPreferredWidth(250);
            tabelaClientes.getColumnModel().getColumn(3).setResizable(false);
            tabelaClientes.getColumnModel().getColumn(4).setPreferredWidth(170);
            tabelaClientes.getColumnModel().getColumn(4).setResizable(false);
            tabelaClientes.getColumnModel().getColumn(5).setPreferredWidth(170);
            tabelaClientes.getColumnModel().getColumn(5).setResizable(false);
            tabelaClientes.getColumnModel().getColumn(6).setPreferredWidth(170);
            tabelaClientes.getColumnModel().getColumn(6).setResizable(false);
            tabelaClientes.getColumnModel().getColumn(7).setPreferredWidth(200);
            tabelaClientes.getColumnModel().getColumn(7).setResizable(false);
            
            
            
            tabelaClientes.getTableHeader().setReorderingAllowed(false);
            tabelaClientes.setAutoResizeMode(tabelaClientes.AUTO_RESIZE_OFF);
            tabelaClientes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            tabelaClientes.setRowHeight(30);
            
            
            somaValores();
        
        
    
        
    }
    public void somaValores(){
        
        conecta.conexao();
        conecta.executaSQL("select pc.cod_compra , pc.id_parc_compra , pc.id_fornecedor , f.nome_fornecedor , pc.valor_parc , pc.pago ,pc.valor_resta , pc.datavenc  from compras c inner join parcela_compra pc on c.id_compra = pc.cod_compra inner join fornecedor f on pc.id_fornecedor = f.id_fornecedor where f.nome_fornecedor like '"+jTextFieldPesquisar.getText()+"%' and pc.estado!='Pago' order by pc.datavenc asc");
        float valorResta = 0;
        float valorParcela = 0;
        float resultado;
        try {
               conecta.rs.first();
                
                do {

                    valorResta = valorResta + conecta.rs.getFloat("valor_resta");
                    valorParcela = valorParcela + conecta.rs.getFloat("valor_parc");
                    resultado = valorParcela - valorResta;
                    
                } while (conecta.rs.next());
                jTextFieldSoma.setText(String.valueOf(df.format(resultado)).replace(".", ","));
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao conectar"+ex);
            }
        
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
            java.util.logging.Logger.getLogger(FrmSelecionaFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmSelecionaFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmSelecionaFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmSelecionaFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmSelecionaFornecedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldPesquisar;
    private javax.swing.JTextField jTextFieldSoma;
    private javax.swing.JTable tabelaClientes;
    // End of variables declaration//GEN-END:variables

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

    public void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
    }
    
}
