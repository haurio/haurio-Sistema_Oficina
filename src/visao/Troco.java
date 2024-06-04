package visao;

import com.sun.glass.events.KeyEvent;
import java.awt.Toolkit;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.JobName;
import javax.print.attribute.standard.MediaSizeName;
import javax.print.attribute.standard.OrientationRequested;
import javax.swing.JOptionPane;
import modelo.ModeloLogin;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import modelo.ModeloVenda;
import modelo.ModeloProduto;

/**
 *
 * Desenvolvedor: Benson Henrique
 */
public class Troco extends javax.swing.JFrame {

    ModeloVenda modeloVendas = new ModeloVenda();
    ArrayList<ModeloProduto> listaModelProdutoses = new ArrayList<>();

    ModeloLogin modlogin = new ModeloLogin();
    ModeloLogin mod = new ModeloLogin();
    //String usuario = mod.getUser();
    String nome = modlogin.getUser();

    DecimalFormat df = new DecimalFormat("0.00");
    float valorCliente;

    public Troco(float valor, String nome) {
        initComponents();
        setIcon();
        jTextFieldValor.setText(String.valueOf(df.format(valor)));
        jTextFieldValorPago.setText("0,00");
        jTextFieldValorPago.requestFocus();
        jTextFieldValorPago.selectAll();
        jLabelUser.setText(nome);
    }

    private Troco() {
        initComponents();
        setIcon();

        jTextFieldValorPago.setText("0,00");
        jTextFieldValorPago.requestFocus();
        jTextFieldValorPago.selectAll();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelTroco = new javax.swing.JLabel();
        jLabelTroco1 = new javax.swing.JLabel();
        jLabelTroco2 = new javax.swing.JLabel();
        jTextFieldTroco = new javax.swing.JTextField();
        jTextFieldValor = new javax.swing.JTextField();
        jTextFieldValorPago = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabelUser = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 181, 181));

        jLabelTroco.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        jLabelTroco.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTroco.setText("Valor da venda:");

        jLabelTroco1.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        jLabelTroco1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTroco1.setText("Valor pago pelo cliente:");

        jLabelTroco2.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        jLabelTroco2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTroco2.setText("Valor do troco:");

        jTextFieldTroco.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        jTextFieldTroco.setForeground(new java.awt.Color(102, 0, 0));
        jTextFieldTroco.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldTroco.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));
        jTextFieldTroco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldTrocoKeyPressed(evt);
            }
        });

        jTextFieldValor.setEditable(false);
        jTextFieldValor.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldValor.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        jTextFieldValor.setForeground(new java.awt.Color(0, 181, 181));
        jTextFieldValor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldValor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));

        jTextFieldValorPago.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        jTextFieldValorPago.setForeground(new java.awt.Color(0, 181, 181));
        jTextFieldValorPago.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldValorPago.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));
        jTextFieldValorPago.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldValorPagoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldValorPagoFocusLost(evt);
            }
        });
        jTextFieldValorPago.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldValorPagoKeyPressed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 153));
        jButton1.setText("Finalizar");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabelUser.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        jLabelUser.setForeground(new java.awt.Color(0, 0, 204));
        jLabelUser.setText("Benson");
        jLabelUser.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldTroco)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldValorPago)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelTroco)
                                    .addComponent(jLabelTroco2))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelTroco1)
                        .addGap(60, 373, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(233, 233, 233)
                .addComponent(jLabelUser, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jTextFieldValor, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabelUser, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabelTroco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addComponent(jLabelTroco1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldValorPago, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabelTroco2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldTroco, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(55, 55, 55)
                    .addComponent(jTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(343, Short.MAX_VALUE)))
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

    private void jTextFieldValorPagoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldValorPagoKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            float valorvenda = Float.parseFloat(jTextFieldValor.getText().replace(",", "."));
            valorCliente = Float.parseFloat(jTextFieldValorPago.getText().replace(",", "."));

            if (valorvenda > valorCliente) {
                JOptionPane.showMessageDialog(null, "Valor da Venda é maior que o Valor dado pelo Cliente");
                jTextFieldValorPago.selectAll();

            } else {
                float resultado = valorCliente - valorvenda;
                jTextFieldTroco.setText(String.valueOf(df.format(resultado)));
                jTextFieldTroco.requestFocus();
            }
        }
    }//GEN-LAST:event_jTextFieldValorPagoKeyPressed

    private void jTextFieldTrocoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTrocoKeyPressed
       if (!jTextFieldTroco.getText().isEmpty()) {

            int opcao = JOptionPane.showConfirmDialog(null, "Deseja imprimir Cupom ?", "Atenção", JOptionPane.YES_NO_OPTION);
            //se sim imprimi cupom, se não não faz nada    
            if (opcao == JOptionPane.OK_OPTION) {
                imprimirCupom(listaModelProdutoses, modeloVendas);

                //mod.setUser(jLabelUser.getText());
                FrmVenda venda = new FrmVenda(mod.getUser());
                venda.setVisible(true);

                this.dispose();
            } else if (opcao != JOptionPane.OK_OPTION) {

                mod.setUser(jLabelUser.getText());
                FrmVenda venda = new FrmVenda(mod.getUser());
                venda.setVisible(true);

                this.dispose();

            }

        }
    }//GEN-LAST:event_jTextFieldTrocoKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (!jTextFieldTroco.getText().isEmpty()) {

            int opcao = JOptionPane.showConfirmDialog(null, "Deseja imprimir Cupom ?", "Atenção", JOptionPane.YES_NO_OPTION);
            //se sim imprimi cupom, se não não faz nada    
            if (opcao == JOptionPane.OK_OPTION) {
                imprimirCupom(listaModelProdutoses, modeloVendas);

                //mod.setUser(jLabelUser.getText());
                FrmVenda venda = new FrmVenda(mod.getUser());
                venda.setVisible(true);

                this.dispose();
            } else if (opcao != JOptionPane.OK_OPTION) {

                mod.setUser(jLabelUser.getText());
                FrmVenda venda = new FrmVenda(mod.getUser());
                venda.setVisible(true);

                this.dispose();

            }

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextFieldValorPagoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldValorPagoFocusLost
        jTextFieldValorPago.setText(df.format(valorCliente));
    }//GEN-LAST:event_jTextFieldValorPagoFocusLost

    private void jTextFieldValorPagoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldValorPagoFocusGained
        jTextFieldValorPago.selectAll();
    }//GEN-LAST:event_jTextFieldValorPagoFocusGained

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
            java.util.logging.Logger.getLogger(Troco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Troco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Troco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Troco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Troco().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabelTroco;
    private javax.swing.JLabel jLabelTroco1;
    private javax.swing.JLabel jLabelTroco2;
    private javax.swing.JLabel jLabelUser;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldTroco;
    private javax.swing.JTextField jTextFieldValor;
    private javax.swing.JTextField jTextFieldValorPago;
    // End of variables declaration//GEN-END:variables

    public void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
    }

    private void imprimirCupom(ArrayList<ModeloProduto> listaModelProdutoses, ModeloVenda modeloVendas) {

        String dataF = "dd/MM/yyyy";
        String horaF = "H:mm - a";
        String data, hora;
        //pegar data
        java.util.Date tempoAtual = new java.util.Date();
        SimpleDateFormat formata = new SimpleDateFormat(dataF);
        data = formata.format(tempoAtual);
        //pegar hora
        formata = new SimpleDateFormat(horaF);
        hora = formata.format(tempoAtual);

        String conteudoImprimir = "";

        for (int i = 0; i < listaModelProdutoses.size(); i++) {
            conteudoImprimir
                    += listaModelProdutoses.get(i).getNomeProduto() + "    "
                    + listaModelProdutoses.get(i).getQtdProduto() + "    "
                    + listaModelProdutoses.get(i).getPrecoVenda() + "\n\r";
        }

        this.imprimir("Easy-Store DESENVOLVINTO DE SISTEMAS"
                + "RUA DAS FLORES 123, CENTRO\n\r"
                + "CNPJ: 00.000.000/0001-00\n\r"
                + "--------------------------------\n\r"
                + "          CUPOM NÃO FISCAL       \n\r"
                + "----------------------------------\n\r"
                + "DESCRICAO   QT   PREÇO \n\r"
                + conteudoImprimir + ""
                + "----------------------------------\n\r"
                + "VALOR BRUTO: " + modeloVendas.getValorVenda() + "\n\r"
                + "   DESCONTO: " /*+ modeloVendas.getVenDesconto + "\n\r"*/
                + "VALOR TOTAL: " + modeloVendas.getValorVenda() + "\n\r"
                + "----------------------------------\n\r"
                + data + " - " + hora + "\n\r"
                + "\n\r"
                + "     OBRIGADO E VOLTE SEMPRE   \n\r"
                + " \n\r\n\r\f"
        );

    }

    public void imprimir(String pTexto) {
        // /n/r para novas linhas e /f para fim da pagina  
        try {
            InputStream prin = new ByteArrayInputStream(pTexto.getBytes());
            DocFlavor docFlavor = DocFlavor.INPUT_STREAM.AUTOSENSE;
            SimpleDoc documentoTexto = new SimpleDoc(prin, docFlavor, null);
            PrintService impressora = PrintServiceLookup.lookupDefaultPrintService();
            // pega a //impressora padrao  
            PrintRequestAttributeSet printerAttributes = new HashPrintRequestAttributeSet();
            printerAttributes.add(new JobName("Impressao", null));
            printerAttributes.add(OrientationRequested.PORTRAIT);
            printerAttributes.add(MediaSizeName.ISO_A4);
            // informa o tipo de folha  
            DocPrintJob printJob = impressora.createPrintJob();

            try {
                printJob.print(documentoTexto, (PrintRequestAttributeSet) printerAttributes);
                //tenta imprimir  
            } catch (PrintException e) {
                JOptionPane.showMessageDialog(null, "Não foi possível realizar a impressão !!", "Erro", JOptionPane.ERROR_MESSAGE);
                // mostra //mensagem de erro  
            }

            prin.close();

        } catch (Exception e) {

        }

    }
}
