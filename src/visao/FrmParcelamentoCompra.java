
package visao;

import controle.ConectaBanco;
import controle.ControleParcelamento;
import controle.ControleParcelamentoCompra;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.AbstractAction;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.ListSelectionModel;
import modelo.ModeloParcelamentoCompra;
import modelo.ModeloTabela;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import util.TarefasSegundoPlano;

/**
 *
 * @author cyro
 */
public class FrmParcelamentoCompra extends javax.swing.JFrame {
        ConectaBanco conecta = new ConectaBanco();
        ModeloParcelamentoCompra mod = new ModeloParcelamentoCompra();
        ControleParcelamentoCompra control = new ControleParcelamentoCompra();
        DecimalFormat df = new DecimalFormat("0.00");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        int qtdparcela, i=1, cont = 1, codCliente,idCaixa;
        float porcentagem, valorVenda, valorEntrada, valorParcela, valorSemJuros;
        
        private boolean primeiraVezParc = true;
        
    public FrmParcelamentoCompra(int cod, float entrada) {
        initComponents();
        setIcon();
        gerarParcelas();
        //preencherCombo();
        AutoCompleteDecorator.decorate(jComboBoxFornecedor);
        ConectaBanco conecta = new ConectaBanco();
        jTextFieldEntrada.setText(String.valueOf(df.format(entrada)).replace(".", ","));
        conecta.conexao();
        conecta.executaSQL("SELECT * FROM compras WHERE id_compra="+cod);
        try {
            conecta.rs.first();
            
            jTextFieldCodigo.setText(String.valueOf(cod));
            float valorVenda = conecta.rs.getFloat("total_nota");
            jTextFieldValorCompra.setText(String.valueOf(valorVenda));
            Date data = conecta.rs.getDate("data_emissao");
            jTextFieldData.setText(sdf.format(data));
            jComboBoxFornecedor.addItem(conecta.rs.getString("fornecedor"));
            labelIdVenda.setText(String.valueOf(conecta.rs.getInt("id_caixa")));
            idCaixa = Integer.parseInt(labelIdVenda.getText());
            
            float valorTotalSomado = Float.parseFloat(jTextFieldValorCompra.getText()) - entrada;
            jTextFieldTotal.setText(String.valueOf(df.format(valorTotalSomado)).replace(".", ","));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,"Erro ao buscar a Compra"+ ex);
        }
       
    }
    
   

    private FrmParcelamentoCompra() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        jButtonGerar = new javax.swing.JButton();
        jButtonParcelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableForncedores = new javax.swing.JTable();
        jComboBoxFornecedor = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        labelIdVenda3 = new javax.swing.JLabel();
        jTextFieldData = new javax.swing.JTextField();
        jTextFieldValorCompra = new javax.swing.JTextField();
        labelIdVenda2 = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        labelIdVenda1 = new javax.swing.JLabel();
        labelIdVenda = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        labelIdVenda6 = new javax.swing.JLabel();
        jTextFieldTotal = new javax.swing.JTextField();
        labelIdVenda5 = new javax.swing.JLabel();
        jTextFieldJuros = new javax.swing.JTextField();
        jTextFieldParcelas = new javax.swing.JTextField();
        labelIdVenda7 = new javax.swing.JLabel();
        labelIdVenda4 = new javax.swing.JLabel();
        jTextFieldEntrada = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Parcelamento da Venda");

        jPanel1.setBackground(new java.awt.Color(0, 181, 181));

        jButtonGerar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonGerar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonGerar.setForeground(new java.awt.Color(0, 153, 153));
        jButtonGerar.setText("Gerar Duplicatas (F12)");
        jButtonGerar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButtonGerar.setBorderPainted(false);
        jButtonGerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGerarActionPerformed(evt);
            }
        });

        jButtonParcelar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonParcelar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonParcelar.setForeground(new java.awt.Color(0, 153, 153));
        jButtonParcelar.setText("Parcelar");
        jButtonParcelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButtonParcelar.setBorderPainted(false);
        jButtonParcelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonParcelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonParcelarActionPerformed(evt);
            }
        });

        jTableForncedores.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTableForncedores.setForeground(new java.awt.Color(102, 102, 102));
        jTableForncedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableForncedores);

        jComboBoxFornecedor.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jComboBoxFornecedor.setBorder(null);
        jComboBoxFornecedor.setEnabled(false);

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 153, 153), new java.awt.Color(0, 153, 153)));

        labelIdVenda3.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        labelIdVenda3.setForeground(new java.awt.Color(255, 255, 255));
        labelIdVenda3.setText("Data da compra:");

        jTextFieldData.setEditable(false);
        jTextFieldData.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldData.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldData.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldData.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));

        jTextFieldValorCompra.setEditable(false);
        jTextFieldValorCompra.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldValorCompra.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldValorCompra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldValorCompra.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));

        labelIdVenda2.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        labelIdVenda2.setForeground(new java.awt.Color(255, 255, 255));
        labelIdVenda2.setText("Valor total da compra:");

        jTextFieldCodigo.setEditable(false);
        jTextFieldCodigo.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldCodigo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldCodigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldCodigo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));

        labelIdVenda1.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        labelIdVenda1.setForeground(new java.awt.Color(255, 255, 255));
        labelIdVenda1.setText("Código da compra:");

        labelIdVenda.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        labelIdVenda.setForeground(new java.awt.Color(255, 255, 255));
        labelIdVenda.setText("Id Compra");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelIdVenda1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jTextFieldCodigo))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(labelIdVenda2)
                        .addGap(77, 77, 77))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextFieldValorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelIdVenda3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelIdVenda))
                    .addComponent(jTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelIdVenda1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(labelIdVenda2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldValorCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(labelIdVenda3)
                                .addComponent(labelIdVenda))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldData, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 153, 153), new java.awt.Color(0, 153, 153)));

        labelIdVenda6.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        labelIdVenda6.setForeground(new java.awt.Color(255, 255, 255));
        labelIdVenda6.setText("Valor da compra:     R$");

        jTextFieldTotal.setEditable(false);
        jTextFieldTotal.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldTotal.setForeground(new java.awt.Color(0, 153, 153));
        jTextFieldTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldTotal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));

        labelIdVenda5.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        labelIdVenda5.setForeground(new java.awt.Color(255, 255, 255));
        labelIdVenda5.setText("Juros %");

        jTextFieldJuros.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldJuros.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldJuros.setText("0");
        jTextFieldJuros.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));

        jTextFieldParcelas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldParcelas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldParcelas.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));
        jTextFieldParcelas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldParcelasKeyPressed(evt);
            }
        });

        labelIdVenda7.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        labelIdVenda7.setForeground(new java.awt.Color(255, 255, 255));
        labelIdVenda7.setText("Quantidade de parcelas:");

        labelIdVenda4.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        labelIdVenda4.setForeground(new java.awt.Color(255, 255, 255));
        labelIdVenda4.setText("Entrada:");

        jTextFieldEntrada.setEditable(false);
        jTextFieldEntrada.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldEntrada.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldEntrada.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldEntrada.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldEntrada, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelIdVenda4))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(labelIdVenda7)
                        .addGap(8, 8, 8))
                    .addComponent(jTextFieldParcelas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelIdVenda5)
                    .addComponent(jTextFieldJuros, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(labelIdVenda6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelIdVenda7)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jTextFieldJuros, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(labelIdVenda5)
                                        .addGap(49, 49, 49)))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(labelIdVenda6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextFieldTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextFieldParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(labelIdVenda4)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonParcelar, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonGerar, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBoxFornecedor, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBoxFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonParcelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonGerar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonParcelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonParcelarActionPerformed
        parcelar();
        
    }//GEN-LAST:event_jButtonParcelarActionPerformed
    public void parcelar(){
        
        if(primeiraVezParc){ 
        
        qtdparcela = Integer.parseInt(jTextFieldParcelas.getText());
        porcentagem = Float.parseFloat(jTextFieldJuros.getText());
        valorVenda = Float.parseFloat(jTextFieldValorCompra.getText().replace(",", "."));
        valorEntrada = Float.parseFloat(jTextFieldEntrada.getText().replace(",", "."));        
        valorParcela = (valorVenda - valorEntrada) / qtdparcela;
        jTableForncedores.removeAll();
        preencherTabela();
        primeiraVezParc = false;
        jTextFieldTotal.setEnabled(true);
       
        
        }else{
            
        i=1;
        qtdparcela = Integer.parseInt(jTextFieldParcelas.getText());
        porcentagem = Float.parseFloat(jTextFieldJuros.getText());
        valorVenda = Float.parseFloat(jTextFieldValorCompra.getText().replace(",", "."));
        valorEntrada = Float.parseFloat(jTextFieldEntrada.getText().replace(",", "."));
        valorParcela = (valorVenda - valorEntrada) / qtdparcela;
        jTableForncedores.removeAll();
        preencherTabela();        
        jTextFieldTotal.setEnabled(true);
        primeiraVezParc = false;
        
        
        }
    }
    public void preencherCombo(){
        
        conecta.conexao();
        conecta.executaSQL("SELECT * FROM fornecedor ORDER BY nome_fornecedor");
        jComboBoxFornecedor.removeAllItems();
        
        try {
            conecta.rs.first();
                  
            do {                
                jComboBoxFornecedor.addItem(""+conecta.rs.getString("nome_fornecedor"));
                codCliente = conecta.rs.getInt("id_fornecedor");
            } while (conecta.rs.next());
                    
                    } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane,"Erro ao preencher o Fornecedor"+ ex);
        }
        
    }
    private void jButtonGerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGerarActionPerformed
        
        int j = 1;

        GregorianCalendar gc = new GregorianCalendar();
         
         Date diaAtual = new Date();
         int parcelas = Integer.parseInt(jTextFieldParcelas.getText()); 
         int e;
         if(jTableForncedores.getColumnCount() > 0){
         for(e = 1;e <=parcelas;e++){
             
             Calendar c = Calendar.getInstance();
             c.setTime(diaAtual);
             c.set(Calendar.MONTH, c.get(Calendar.MONTH)+ e);
             Date d = c.getTime();
         
                mod.setCodVenda(Integer.parseInt(jTextFieldCodigo.getText()));
                mod.setIdCaixa(idCaixa);
                //mod.setEntrada(valorEntrada);
                mod.setValorParcela(valorParcela+(valorParcela *(porcentagem /100)));
                mod.setValor_total(Float.parseFloat(jTextFieldTotal.getText().replace(",", ".")));
                mod.setValor_venda(Float.parseFloat(jTextFieldValorCompra.getText().replace(",", ".")));
                mod.setNumParc(e);
                mod.setDataVenc(d);
                mod.setCliente(String.valueOf(jComboBoxFornecedor.getSelectedItem()));
                //mod.setDatavenda(String.valueOf(jTextFieldData.getText()));
                control.SalvaParcela(mod);
         
         }
        
        JOptionPane.showMessageDialog(rootPane, "Compra Parcelada Cadastrada");
        dispose();
         }else{
             
            JOptionPane.showMessageDialog(null,"Coloque a quantidade de parcelas e clique em Parcelar ");
            jTextFieldParcelas.requestFocus();
             
         }
//        String message = "Deseja Imprimir as Parcelas ?";
//        String title = "Impressão de Parcelas";
//        int finalizar = JOptionPane.showConfirmDialog(this, message, title ,JOptionPane.YES_OPTION);
//         
//        if(finalizar == JOptionPane.YES_OPTION){
//            
//            TarefasSegundoPlano parc = new TarefasSegundoPlano();
//            parc.Parcelar(Integer.parseInt(jTextFieldCodigo.getText()));
//            
//        }else{
//            
//           JOptionPane.showMessageDialog(null,"Parcelas não serão imprimidas");
//        }
        
        
        
        
        
        
    }//GEN-LAST:event_jButtonGerarActionPerformed

    private void jTextFieldParcelasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldParcelasKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            
            parcelar();
        }
    }//GEN-LAST:event_jTextFieldParcelasKeyPressed

        public void preencherTabela(){
        
        ArrayList dados = new ArrayList();
        
        String[] Colunas = new String[]{"Código da Parcela", "Data Parcela", "Valor Parcela", "Entrada"};
        
        float valorAtuParc, valorSemJuros, valorTotalVenda=0;
        valorAtuParc = valorParcela+(valorParcela*(porcentagem / 100));
        valorSemJuros = (valorVenda - valorEntrada) / qtdparcela;
         GregorianCalendar gc = new GregorianCalendar();
         SimpleDateFormat adf = new SimpleDateFormat("yyyy/MM/dd");
         
         Date diaAtual = new Date();
         int parcelas = Integer.parseInt(jTextFieldParcelas.getText()); 
         int e;
         for(e = 1; e <=parcelas;e++){
         Calendar c = Calendar.getInstance();
         c.setTime(diaAtual);
         c.set(Calendar.MONTH, c.get(Calendar.MONTH)+ e);
         Date d = c.getTime();
         
         if(porcentagem != 0){
                    
                    dados.add(new Object[]{e, sdf.format(d), df.format(valorAtuParc), df.format(valorEntrada)});
                }else{
                    dados.add(new Object[]{e, sdf.format(d), df.format(valorSemJuros), df.format(valorEntrada)});
                    
                    
                }
         
         }
//        valorAtuParc = valorParcela+(valorParcela*(porcentagem / 100));
//        valorSemJuros = (valorVenda - valorEntrada) / qtdparcela;
//           
//            while(i <= qtdparcela) {
//                valorTotalVenda = valorTotalVenda+valorAtuParc;
//                if(mesInt < 10 && porcentagem != 0){
//                    
//                    dados.add(new Object[]{i, dia+"0"+ mesInt +"/"+ anoInt, dc.format(valorAtuParc), valorEntrada});
//                }else{
//                    dados.add(new Object[]{i, dia + mesInt +"/"+ anoInt, dc.format(valorSemJuros), valorEntrada});
//                    
//                }
//                
//                if(mesInt>12){
//                    
//                    anoInt++;
//                    mesInt=1;
//                }
//                mesInt++;
//                i++;
//                cont++;
//                
//            }
            
        //jTextFieldTotal.setText(String.valueOf(dc.format(valorTotalVenda).replace(",", ".")));
        
        ModeloTabela modelo = new ModeloTabela(dados, Colunas);
        
        jTableForncedores.setModel(modelo);
        
        jTableForncedores.getColumnModel().getColumn(0).setPreferredWidth(120);
        jTableForncedores.getColumnModel().getColumn(0).setResizable(false);
        jTableForncedores.getColumnModel().getColumn(1).setPreferredWidth(250);
        jTableForncedores.getColumnModel().getColumn(1).setResizable(false);
        jTableForncedores.getColumnModel().getColumn(2).setPreferredWidth(180);
        jTableForncedores.getColumnModel().getColumn(2).setResizable(false);
        jTableForncedores.getColumnModel().getColumn(3).setPreferredWidth(180);
        jTableForncedores.getColumnModel().getColumn(3).setResizable(false);
        
        
        jTableForncedores.getTableHeader().setReorderingAllowed(false);
        jTableForncedores.setAutoResizeMode(jTableForncedores.AUTO_RESIZE_OFF);
        jTableForncedores.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jTableForncedores.setRowHeight(28);
        
    }
        
        private void gerarParcelas() {
       javax.swing.InputMap inputMap = this.getRootPane().getInputMap(javax.swing.JComponent.WHEN_IN_FOCUSED_WINDOW);
                inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_F12, 0),"duplicatas");
                this.getRootPane().setInputMap(javax.swing.JComponent.WHEN_IN_FOCUSED_WINDOW, inputMap);
                this.getRootPane().getActionMap().put("duplicatas", new AbstractAction(){
                private static final long serialVersionUID = 1L;
                public void actionPerformed(ActionEvent arg0) {            
                jButtonGerar.doClick();
                }
            });   
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
            java.util.logging.Logger.getLogger(FrmParcelamentoCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmParcelamentoCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmParcelamentoCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmParcelamentoCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmParcelamentoCompra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGerar;
    private javax.swing.JButton jButtonParcelar;
    private javax.swing.JComboBox<String> jComboBoxFornecedor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableForncedores;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldData;
    private javax.swing.JTextField jTextFieldEntrada;
    private javax.swing.JTextField jTextFieldJuros;
    private javax.swing.JTextField jTextFieldParcelas;
    private javax.swing.JTextField jTextFieldTotal;
    private javax.swing.JTextField jTextFieldValorCompra;
    private javax.swing.JLabel labelIdVenda;
    private javax.swing.JLabel labelIdVenda1;
    private javax.swing.JLabel labelIdVenda2;
    private javax.swing.JLabel labelIdVenda3;
    private javax.swing.JLabel labelIdVenda4;
    private javax.swing.JLabel labelIdVenda5;
    private javax.swing.JLabel labelIdVenda6;
    private javax.swing.JLabel labelIdVenda7;
    // End of variables declaration//GEN-END:variables

    public void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
    }
}
