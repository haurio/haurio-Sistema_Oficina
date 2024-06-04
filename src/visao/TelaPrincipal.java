package visao;

import controle.ConectaBanco;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.Timer;
import modelo.ModeloLogin;
import visao.FrmCidades;

/**
 *
 * @author Benson
 */
public class TelaPrincipal extends javax.swing.JFrame {

    controle.ConectaBanco conecta = new controle.ConectaBanco();

    ModeloLogin mod = new ModeloLogin();
    Date hoje = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    SimpleDateFormat sdfa = new SimpleDateFormat("yyyy-MM-dd");
    String usuario = mod.getUser();

    public TelaPrincipal(String usuario) {

        initComponents();

        vendas();
        produtos();
        clientes();
        jLabelUser.setText(usuario);
        Sair();
        acesso();
        setIcon();
        jLabelData.setText(sdf.format(hoje));
        Timer tempo = new Timer(1000, new hora());
        tempo.start();
        this.setExtendedState(MAXIMIZED_BOTH);
        data();
        conecta.conexao();

    }

    private TelaPrincipal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void acesso() {

        conecta.conexao();
        conecta.executaSQL("SELECT * FROM users WHERE user ='" + jLabelUser.getText() + "'");
        try {
            //usuario Gerente
            conecta.rs.first();
            if (conecta.rs.getInt("level") == 1) {

                JOptionPane.showMessageDialog(null, "Bem Vindo " + jLabelUser.getText());

                jMenuItemUsuarios.setVisible(false);
                jMenuRelatorios.setVisible(false);
                jMenuItemDadosEmpresa.setVisible(false);
                jMenuItem7.setVisible(false);

                //usuario Vendedor
            } else if (conecta.rs.getInt("level") == 2) {
                JOptionPane.showMessageDialog(null, "Bem Vindo  " + jLabelUser.getText());
                jMenuItemUsuarios.setVisible(false);
                jMenuRelatorios.setVisible(false);
                jMenuCompras.setVisible(false);
                jMenuItemDadosEmpresa.setVisible(false);
                jMenuItem7.setVisible(false);

            } else if (conecta.rs.getInt("level") == 3) {
                //usuario Analista
                JOptionPane.showMessageDialog(null, "Bem Vindo " + jLabelUser.getText());
                jMenuItem7.setVisible(true);

            } else {
                JOptionPane.showMessageDialog(null, "Bem Vindo " + jLabelUser.getText());
                jMenuItem7.setVisible(false);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButtonClientes = new javax.swing.JButton();
        jButtonProdutos = new javax.swing.JButton();
        jButtonVendas = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabelHora = new javax.swing.JLabel();
        jLabelUser = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabelData = new javax.swing.JLabel();
        jLabelLinceca = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuCadastros = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItemUsuarios3 = new javax.swing.JMenuItem();
        jMenuItemCliente = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenuItemVeiculos = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        menuCadastroCidades = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItemUsuarios = new javax.swing.JMenuItem();
        jMenuItemUsuarios1 = new javax.swing.JMenuItem();
        jMenuItemDadosEmpresa = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuVendas = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuCaixa = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuDespesa = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuRecebimentos = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuCompras = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuRelatorios = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItemRelatoriosVendas = new javax.swing.JMenuItem();
        jMenuItemTotalVendas = new javax.swing.JMenuItem();
        jMenuItemMaisVendidos = new javax.swing.JMenuItem();
        jMenuItemRelatorioCompras = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        menuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela Principal");
        setBackground(new java.awt.Color(22, 160, 133));
        setForeground(new java.awt.Color(22, 160, 133));
        setIconImages(null);

        jPanel1.setBackground(new java.awt.Color(0, 181, 181));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/UNI.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Yu Gothic Light", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("(62) 3596-1249 / 98583-6372");

        jButtonClientes.setBackground(new java.awt.Color(0, 153, 153));
        jButtonClientes.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jButtonClientes.setForeground(new java.awt.Color(255, 255, 255));
        jButtonClientes.setText("CADASTRAR CLIENTES - F5");
        jButtonClientes.setBorderPainted(false);
        jButtonClientes.setContentAreaFilled(false);
        jButtonClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonClientes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClientesActionPerformed(evt);
            }
        });

        jButtonProdutos.setBackground(new java.awt.Color(0, 153, 153));
        jButtonProdutos.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jButtonProdutos.setForeground(new java.awt.Color(255, 255, 255));
        jButtonProdutos.setText("CADASTRAR PRODUTOS - F4");
        jButtonProdutos.setBorderPainted(false);
        jButtonProdutos.setContentAreaFilled(false);
        jButtonProdutos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonProdutos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProdutosActionPerformed(evt);
            }
        });

        jButtonVendas.setBackground(new java.awt.Color(0, 153, 153));
        jButtonVendas.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jButtonVendas.setForeground(new java.awt.Color(255, 255, 255));
        jButtonVendas.setText("REALIZAR VENDA - F2");
        jButtonVendas.setBorderPainted(false);
        jButtonVendas.setContentAreaFilled(false);
        jButtonVendas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVendas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButtonVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVendasActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));

        jLabelHora.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jLabelHora.setForeground(new java.awt.Color(255, 255, 255));
        jLabelHora.setText("08:25:06");

        jLabelUser.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jLabelUser.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUser.setText("Usuário:");

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("USUÁRIO:");

        jLabelData.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jLabelData.setForeground(new java.awt.Color(255, 255, 255));
        jLabelData.setText("data");

        jLabelLinceca.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        jLabelLinceca.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLinceca.setText("Vencimento");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelData, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelHora, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(315, 315, 315)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelUser, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelLinceca, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelData, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelHora, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelUser)
                        .addComponent(jLabel1)
                        .addComponent(jLabelLinceca, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(310, 310, 310)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(295, 295, 295))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(233, 233, 233)
                .addComponent(jButtonVendas, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                .addGap(75, 75, 75)
                .addComponent(jButtonProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                .addGap(42, 42, 42)
                .addComponent(jButtonClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                .addGap(200, 200, 200))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(470, 470, 470)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(392, 392, 392))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(65, 65, 65)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addGap(34, 34, 34)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(688, 80));

        menuCadastros.setBackground(new java.awt.Color(102, 102, 102));
        menuCadastros.setForeground(new java.awt.Color(102, 0, 102));
        menuCadastros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cadastro.png"))); // NOI18N
        menuCadastros.setText("Cadastros    ");
        menuCadastros.setAlignmentX(1.5F);
        menuCadastros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuCadastros.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        menuCadastros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuCadastrosMouseClicked(evt);
            }
        });
        menuCadastros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastrosActionPerformed(evt);
            }
        });

        jMenuItem4.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jMenuItem4.setForeground(new java.awt.Color(102, 0, 102));
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/produto.png"))); // NOI18N
        jMenuItem4.setText("   Produtos");
        jMenuItem4.setPreferredSize(new java.awt.Dimension(155, 40));
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        menuCadastros.add(jMenuItem4);

        jMenu8.setForeground(new java.awt.Color(102, 0, 102));
        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cliente.png"))); // NOI18N
        jMenu8.setText("   Clientes");
        jMenu8.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        jMenuItemUsuarios3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jMenuItemUsuarios3.setForeground(new java.awt.Color(102, 0, 102));
        jMenuItemUsuarios3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cliente.png"))); // NOI18N
        jMenuItemUsuarios3.setText("Cadastrar");
        jMenuItemUsuarios3.setPreferredSize(new java.awt.Dimension(155, 40));
        jMenuItemUsuarios3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemUsuarios3ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItemUsuarios3);

        jMenuItemCliente.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItemCliente.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jMenuItemCliente.setForeground(new java.awt.Color(102, 0, 102));
        jMenuItemCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cliente.png"))); // NOI18N
        jMenuItemCliente.setText("Pesquisar");
        jMenuItemCliente.setPreferredSize(new java.awt.Dimension(155, 40));
        jMenuItemCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemClienteActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItemCliente);

        menuCadastros.add(jMenu8);

        jMenuItem6.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem6.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jMenuItem6.setForeground(new java.awt.Color(102, 0, 102));
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fornecedores.png"))); // NOI18N
        jMenuItem6.setText("   Fornecedores");
        jMenuItem6.setPreferredSize(new java.awt.Dimension(155, 40));
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        menuCadastros.add(jMenuItem6);

        jMenuItem22.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem22.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jMenuItem22.setForeground(new java.awt.Color(102, 0, 102));
        jMenuItem22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/produto.png"))); // NOI18N
        jMenuItem22.setText("   Produtos");
        jMenuItem22.setPreferredSize(new java.awt.Dimension(155, 40));
        jMenuItem22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem22ActionPerformed(evt);
            }
        });
        menuCadastros.add(jMenuItem22);

        jMenuItemVeiculos.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItemVeiculos.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jMenuItemVeiculos.setForeground(new java.awt.Color(102, 0, 102));
        jMenuItemVeiculos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Veiculos.png"))); // NOI18N
        jMenuItemVeiculos.setText("   Veiculos");
        jMenuItemVeiculos.setPreferredSize(new java.awt.Dimension(155, 40));
        jMenuItemVeiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVeiculosActionPerformed(evt);
            }
        });
        menuCadastros.add(jMenuItemVeiculos);

        jMenuItem14.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem14.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jMenuItem14.setForeground(new java.awt.Color(102, 0, 102));
        jMenuItem14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/categoria.png"))); // NOI18N
        jMenuItem14.setText("  Serviços");
        jMenuItem14.setPreferredSize(new java.awt.Dimension(155, 40));
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        menuCadastros.add(jMenuItem14);
        menuCadastros.add(jSeparator3);

        jMenuItem1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jMenuItem1.setForeground(new java.awt.Color(102, 0, 102));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/categoria.png"))); // NOI18N
        jMenuItem1.setText("   Categorias");
        jMenuItem1.setPreferredSize(new java.awt.Dimension(155, 40));
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuCadastros.add(jMenuItem1);

        jMenuItem3.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jMenuItem3.setForeground(new java.awt.Color(102, 0, 102));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/despesas.png"))); // NOI18N
        jMenuItem3.setText("   Despesas");
        jMenuItem3.setPreferredSize(new java.awt.Dimension(155, 40));
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        menuCadastros.add(jMenuItem3);

        menuCadastroCidades.setBackground(new java.awt.Color(255, 255, 255));
        menuCadastroCidades.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        menuCadastroCidades.setForeground(new java.awt.Color(102, 0, 102));
        menuCadastroCidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/city.png"))); // NOI18N
        menuCadastroCidades.setText("   Cidades");
        menuCadastroCidades.setPreferredSize(new java.awt.Dimension(155, 40));
        menuCadastroCidades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuCadastroCidadesMouseClicked(evt);
            }
        });
        menuCadastroCidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastroCidadesActionPerformed(evt);
            }
        });
        menuCadastros.add(menuCadastroCidades);

        jMenu7.setForeground(new java.awt.Color(102, 0, 102));
        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/users.png"))); // NOI18N
        jMenu7.setText("   Usuários");
        jMenu7.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        jMenuItemUsuarios.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jMenuItemUsuarios.setForeground(new java.awt.Color(102, 0, 102));
        jMenuItemUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/users.png"))); // NOI18N
        jMenuItemUsuarios.setText("Cadastro");
        jMenuItemUsuarios.setPreferredSize(new java.awt.Dimension(155, 40));
        jMenuItemUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemUsuariosActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItemUsuarios);

        jMenuItemUsuarios1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jMenuItemUsuarios1.setForeground(new java.awt.Color(102, 0, 102));
        jMenuItemUsuarios1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/users.png"))); // NOI18N
        jMenuItemUsuarios1.setText("  Alteração");
        jMenuItemUsuarios1.setPreferredSize(new java.awt.Dimension(155, 40));
        jMenuItemUsuarios1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemUsuarios1ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItemUsuarios1);

        menuCadastros.add(jMenu7);

        jMenuItemDadosEmpresa.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jMenuItemDadosEmpresa.setForeground(new java.awt.Color(102, 0, 102));
        jMenuItemDadosEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/categoria.png"))); // NOI18N
        jMenuItemDadosEmpresa.setText("   Dados Empresa");
        jMenuItemDadosEmpresa.setPreferredSize(new java.awt.Dimension(133, 40));
        jMenuItemDadosEmpresa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItemDadosEmpresaMouseClicked(evt);
            }
        });
        jMenuItemDadosEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDadosEmpresaActionPerformed(evt);
            }
        });
        menuCadastros.add(jMenuItemDadosEmpresa);

        jMenuItem7.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jMenuItem7.setForeground(new java.awt.Color(102, 0, 102));
        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Valid.png"))); // NOI18N
        jMenuItem7.setText("   Liberação do Sistema");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        menuCadastros.add(jMenuItem7);

        jMenuItem13.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jMenuItem13.setForeground(new java.awt.Color(102, 0, 102));
        jMenuItem13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/id-card.png"))); // NOI18N
        jMenuItem13.setText("  Validação do Sistema");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        menuCadastros.add(jMenuItem13);

        jMenuBar1.add(menuCadastros);

        jMenu3.setForeground(new java.awt.Color(102, 0, 102));
        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/relatorio.png"))); // NOI18N
        jMenu3.setText("Ordem Serviço  ");
        jMenu3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        jMenuItem19.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jMenuItem19.setForeground(new java.awt.Color(102, 0, 102));
        jMenuItem19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/categoria.png"))); // NOI18N
        jMenuItem19.setText("Abrir Ordem Serviço");
        jMenuItem19.setPreferredSize(new java.awt.Dimension(185, 40));
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem19);

        jMenuItem21.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jMenuItem21.setForeground(new java.awt.Color(102, 0, 102));
        jMenuItem21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/categoria.png"))); // NOI18N
        jMenuItem21.setText("Status OS");
        jMenuItem21.setPreferredSize(new java.awt.Dimension(185, 40));
        jMenuItem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem21ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem21);

        jMenuItem23.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jMenuItem23.setForeground(new java.awt.Color(102, 0, 102));
        jMenuItem23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/categoria.png"))); // NOI18N
        jMenuItem23.setText("Encerrar OS");
        jMenuItem23.setPreferredSize(new java.awt.Dimension(185, 40));
        jMenuItem23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem23ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem23);

        jMenuBar1.add(jMenu3);

        jMenu5.setForeground(new java.awt.Color(102, 0, 102));
        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/relatorio.png"))); // NOI18N
        jMenu5.setText("Oficina  ");
        jMenu5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        jMenuItem16.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jMenuItem16.setForeground(new java.awt.Color(102, 0, 102));
        jMenuItem16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/categoria.png"))); // NOI18N
        jMenuItem16.setText("Consultar OS");
        jMenuItem16.setPreferredSize(new java.awt.Dimension(185, 40));
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem16);

        jMenuItem17.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jMenuItem17.setForeground(new java.awt.Color(102, 0, 102));
        jMenuItem17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/categoria.png"))); // NOI18N
        jMenuItem17.setText("Atualizar OS");
        jMenuItem17.setPreferredSize(new java.awt.Dimension(185, 40));
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem17);

        jMenuBar1.add(jMenu5);

        jMenu6.setForeground(new java.awt.Color(102, 0, 102));
        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/compras.png"))); // NOI18N
        jMenu6.setText("Caixa Operacional  ");
        jMenu6.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        jMenuVendas.setForeground(new java.awt.Color(102, 0, 102));
        jMenuVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vendas.png"))); // NOI18N
        jMenuVendas.setText("Realizar Venda    ");
        jMenuVendas.setToolTipText("Realizar Venda");
        jMenuVendas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuVendas.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jMenuVendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuVendasMouseClicked(evt);
            }
        });
        jMenuVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuVendasActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuVendas);

        jMenu4.setForeground(new java.awt.Color(102, 0, 102));
        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/receipt.png"))); // NOI18N
        jMenu4.setText("Abrir Caixa");
        jMenu4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        jMenuItem8.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem8.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jMenuItem8.setForeground(new java.awt.Color(102, 0, 102));
        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/abrircaixa.png"))); // NOI18N
        jMenuItem8.setText("   Abrir Caixa");
        jMenuItem8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jMenuItem8.setPreferredSize(new java.awt.Dimension(143, 40));
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem8);

        jMenu6.add(jMenu4);

        jMenuItem15.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem15.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jMenuItem15.setForeground(new java.awt.Color(102, 0, 102));
        jMenuItem15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/categoria.png"))); // NOI18N
        jMenuItem15.setText("OS Finalizadas");
        jMenuItem15.setPreferredSize(new java.awt.Dimension(155, 40));
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem15);

        jMenuBar1.add(jMenu6);

        jMenuCaixa.setForeground(new java.awt.Color(102, 0, 102));
        jMenuCaixa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/compras.png"))); // NOI18N
        jMenuCaixa.setText("Financeiro    ");
        jMenuCaixa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuCaixa.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jMenuCaixa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuCaixaMouseClicked(evt);
            }
        });
        jMenuCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCaixaActionPerformed(evt);
            }
        });

        jMenuItem9.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem9.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jMenuItem9.setForeground(new java.awt.Color(102, 0, 102));
        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fecharcaixa.png"))); // NOI18N
        jMenuItem9.setText("  Movimentação Caixa");
        jMenuItem9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jMenuItem9.setPreferredSize(new java.awt.Dimension(143, 40));
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenuCaixa.add(jMenuItem9);

        jMenuItem11.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jMenuItem11.setForeground(new java.awt.Color(102, 0, 102));
        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/despesas.png"))); // NOI18N
        jMenuItem11.setText("   Caixas Fechados");
        jMenuItem11.setPreferredSize(new java.awt.Dimension(185, 40));
        jMenuItem11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem11MouseClicked(evt);
            }
        });
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenuCaixa.add(jMenuItem11);
        jMenuItem11.getAccessibleContext().setAccessibleName("   Caixas Fechados   ");

        jMenuCaixa.add(jSeparator2);

        jMenuDespesa.setForeground(new java.awt.Color(102, 0, 102));
        jMenuDespesa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bank.png"))); // NOI18N
        jMenuDespesa.setText("Registrar Despesa    ");
        jMenuDespesa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuDespesa.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jMenuDespesa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuDespesaMouseClicked(evt);
            }
        });
        jMenuCaixa.add(jMenuDespesa);
        jMenuCaixa.add(jSeparator1);

        jMenuRecebimentos.setForeground(new java.awt.Color(102, 0, 102));
        jMenuRecebimentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/file.png"))); // NOI18N
        jMenuRecebimentos.setText("Recebimento    ");
        jMenuRecebimentos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuRecebimentos.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jMenuRecebimentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuRecebimentosMouseClicked(evt);
            }
        });
        jMenuRecebimentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuRecebimentosActionPerformed(evt);
            }
        });
        jMenuCaixa.add(jMenuRecebimentos);

        jMenu2.setForeground(new java.awt.Color(102, 0, 102));
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/relatorio.png"))); // NOI18N
        jMenu2.setText("Cartão    ");
        jMenu2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        jMenuItem12.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jMenuItem12.setForeground(new java.awt.Color(102, 0, 102));
        jMenuItem12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/despesas.png"))); // NOI18N
        jMenuItem12.setText("  Recebimento");
        jMenuItem12.setPreferredSize(new java.awt.Dimension(185, 40));
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem12);

        jMenuCaixa.add(jMenu2);

        jMenuBar1.add(jMenuCaixa);

        jMenuCompras.setForeground(new java.awt.Color(102, 0, 102));
        jMenuCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/vendas.png"))); // NOI18N
        jMenuCompras.setText("Compras    ");
        jMenuCompras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuCompras.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jMenuCompras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuComprasMouseClicked(evt);
            }
        });

        jMenuItem2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jMenuItem2.setForeground(new java.awt.Color(102, 0, 102));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/comprar.png"))); // NOI18N
        jMenuItem2.setText("   Realizar Compras");
        jMenuItem2.setPreferredSize(new java.awt.Dimension(199, 40));
        jMenuItem2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem2MouseClicked(evt);
            }
        });
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenuCompras.add(jMenuItem2);

        jMenuItem5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jMenuItem5.setForeground(new java.awt.Color(102, 0, 102));
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/pagarconta.png"))); // NOI18N
        jMenuItem5.setText("   Pagamento de Contas");
        jMenuItem5.setPreferredSize(new java.awt.Dimension(199, 40));
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenuCompras.add(jMenuItem5);

        jMenuBar1.add(jMenuCompras);

        jMenuRelatorios.setBackground(new java.awt.Color(255, 255, 255));
        jMenuRelatorios.setForeground(new java.awt.Color(102, 0, 102));
        jMenuRelatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/relatorio.png"))); // NOI18N
        jMenuRelatorios.setText("Relatórios    ");
        jMenuRelatorios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuRelatorios.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N

        jMenuItem10.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jMenuItem10.setForeground(new java.awt.Color(102, 0, 102));
        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/rel1.png"))); // NOI18N
        jMenuItem10.setText("   Relatório de Vendas");
        jMenuItem10.setPreferredSize(new java.awt.Dimension(153, 40));
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenuRelatorios.add(jMenuItem10);

        jMenuItemRelatoriosVendas.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItemRelatoriosVendas.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jMenuItemRelatoriosVendas.setForeground(new java.awt.Color(102, 0, 102));
        jMenuItemRelatoriosVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/rel2.png"))); // NOI18N
        jMenuItemRelatoriosVendas.setText("   Relatórios do Dia");
        jMenuItemRelatoriosVendas.setPreferredSize(new java.awt.Dimension(195, 40));
        jMenuItemRelatoriosVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRelatoriosVendasActionPerformed(evt);
            }
        });
        jMenuRelatorios.add(jMenuItemRelatoriosVendas);

        jMenuItemTotalVendas.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItemTotalVendas.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jMenuItemTotalVendas.setForeground(new java.awt.Color(102, 0, 102));
        jMenuItemTotalVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/rel3.png"))); // NOI18N
        jMenuItemTotalVendas.setText("   Total de Vendas do Mês");
        jMenuItemTotalVendas.setPreferredSize(new java.awt.Dimension(195, 40));
        jMenuItemTotalVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTotalVendasActionPerformed(evt);
            }
        });
        jMenuRelatorios.add(jMenuItemTotalVendas);

        jMenuItemMaisVendidos.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItemMaisVendidos.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jMenuItemMaisVendidos.setForeground(new java.awt.Color(102, 0, 102));
        jMenuItemMaisVendidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/rel4.png"))); // NOI18N
        jMenuItemMaisVendidos.setText("   Produtos mais Vendidos");
        jMenuItemMaisVendidos.setPreferredSize(new java.awt.Dimension(220, 40));
        jMenuItemMaisVendidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMaisVendidosActionPerformed(evt);
            }
        });
        jMenuRelatorios.add(jMenuItemMaisVendidos);

        jMenuItemRelatorioCompras.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItemRelatorioCompras.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jMenuItemRelatorioCompras.setForeground(new java.awt.Color(102, 0, 102));
        jMenuItemRelatorioCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/rel4.png"))); // NOI18N
        jMenuItemRelatorioCompras.setText("   Relatório Compras");
        jMenuItemRelatorioCompras.setPreferredSize(new java.awt.Dimension(195, 40));
        jMenuItemRelatorioCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRelatorioComprasActionPerformed(evt);
            }
        });
        jMenuRelatorios.add(jMenuItemRelatorioCompras);

        jMenuBar1.add(jMenuRelatorios);

        jMenu1.setForeground(new java.awt.Color(102, 0, 102));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/changeuser.png"))); // NOI18N
        jMenu1.setText("Trocar Usuário    ");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        menuSair.setBackground(new java.awt.Color(255, 255, 255));
        menuSair.setForeground(new java.awt.Color(102, 0, 102));
        menuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sair_1.png"))); // NOI18N
        menuSair.setText("Sair    ");
        menuSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuSair.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        menuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSairMouseClicked(evt);
            }
        });
        menuSair.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                menuSairKeyPressed(evt);
            }
        });
        jMenuBar1.add(menuSair);

        setJMenuBar(jMenuBar1);

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
    private void setarIconeNoTitulo() {
        try {
            Image icon = Toolkit.getDefaultToolkit().getImage("dist/icone/logo.png");
            this.setIconImage(icon);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    private void menuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSairMouseClicked

        if (JOptionPane.showConfirmDialog(null, "Deseja Sair") == JOptionPane.OK_OPTION) {

            conecta.desconecta();
            System.exit(0);

        }

    }//GEN-LAST:event_menuSairMouseClicked

    private void menuSairKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_menuSairKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuSairKeyPressed

    private void jMenuVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuVendasActionPerformed

    }//GEN-LAST:event_jMenuVendasActionPerformed

    private void jMenuVendasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuVendasMouseClicked

        conecta.conexao();
        conecta.executaSQL("select id_caixa,status from caixa");
        try {
            conecta.rs.last();
            String caixa = conecta.rs.getString("status");

            if (caixa.equals("aberto")) {
                mod.setUser(jLabelUser.getText());
                FrmVenda venda = new FrmVenda(mod.getUser());
                venda.setVisible(true);

            } else {

                JOptionPane.showMessageDialog(null, "Não Existe Caixa Aberto... Abri Caixa");
                FrmAbrirCaixa c = new FrmAbrirCaixa();
                c.setVisible(true);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro!  Informe o codigo de erro ao suporte: 01833");
            //esse erro "01833", é porque no DB Não existe nem um registro de caixa!
        }


    }//GEN-LAST:event_jMenuVendasMouseClicked

    private void jMenuRecebimentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuRecebimentosActionPerformed
        conecta.conexao();
        conecta.executaSQL("select id_caixa,status from caixa");
        try {
            conecta.rs.last();
            String caixa = conecta.rs.getString("status");
            if (caixa.equals("aberto")) {

                FrmSelecionaCliente cliente = new FrmSelecionaCliente();
                cliente.setVisible(true);

            } else {

                JOptionPane.showMessageDialog(null, "Não Existe Caixa Aberto... Abrir Caixa");
                FrmAbrirCaixa c = new FrmAbrirCaixa();
                c.setVisible(true);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro" + ex);
        }
    }//GEN-LAST:event_jMenuRecebimentosActionPerformed

    private void jMenuRecebimentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuRecebimentosMouseClicked
        conecta.conexao();
        conecta.executaSQL("select id_caixa,status from caixa");
        try {
            conecta.rs.last();
            String caixa = conecta.rs.getString("status");

            if (caixa.equals("aberto")) {

                FrmSelecionaCliente cliente = new FrmSelecionaCliente();
                cliente.setVisible(true);

            } else {

                JOptionPane.showMessageDialog(null, "Não Existe Caixa Aberto... Abrir Caixa");
                FrmAbrirCaixa c = new FrmAbrirCaixa();
                c.setVisible(true);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro" + ex);
        }
    }//GEN-LAST:event_jMenuRecebimentosMouseClicked

    private void menuCadastrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrosActionPerformed
        FrmDadosEmpresa d = new FrmDadosEmpresa();
        d.setVisible(true);
    }//GEN-LAST:event_menuCadastrosActionPerformed

    private void menuCadastrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuCadastrosMouseClicked

    }//GEN-LAST:event_menuCadastrosMouseClicked

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        FrmFornecedores frm = new FrmFornecedores();
        frm.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        FrmProdutos produto = new FrmProdutos();
        produto.setVisible(true);

    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItemClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemClienteActionPerformed
        FrmClientes cliente = new FrmClientes();
        cliente.setVisible(true);
    }//GEN-LAST:event_jMenuItemClienteActionPerformed

    private void menuCadastroCidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastroCidadesActionPerformed
        FrmCidades city = new FrmCidades();
        city.setVisible(true);
    }//GEN-LAST:event_menuCadastroCidadesActionPerformed

    private void menuCadastroCidadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuCadastroCidadesMouseClicked

    }//GEN-LAST:event_menuCadastroCidadesMouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        FrmCategorias cat = new FrmCategorias();
        cat.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCaixaActionPerformed


    }//GEN-LAST:event_jMenuCaixaActionPerformed

    private void jMenuCaixaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuCaixaMouseClicked

    }//GEN-LAST:event_jMenuCaixaMouseClicked

    private void jMenuItemMaisVendidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMaisVendidosActionPerformed
        RelatorioProdutosVendidos p = new RelatorioProdutosVendidos();
        p.setVisible(true);
    }//GEN-LAST:event_jMenuItemMaisVendidosActionPerformed

    private void jMenuItemRelatoriosVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRelatoriosVendasActionPerformed
        FrmRelatoriosVendas rel = new FrmRelatoriosVendas();
        rel.setVisible(true);
    }//GEN-LAST:event_jMenuItemRelatoriosVendasActionPerformed

    private void jMenuDespesaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuDespesaMouseClicked
        conecta.conexao();
        conecta.executaSQL("select id_caixa,status from caixa");
        try {
            conecta.rs.last();
            String caixa = conecta.rs.getString("status");

            if (caixa.equals("aberto")) {

                FrmRegistrarDespesa desp = new FrmRegistrarDespesa();
                desp.setVisible(true);

            } else {

                JOptionPane.showMessageDialog(null, "Não Existe Caixa Aberto... Abrir Caixa");
                FrmAbrirCaixa c = new FrmAbrirCaixa();
                c.setVisible(true);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro" + ex);
        }
    }//GEN-LAST:event_jMenuDespesaMouseClicked

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        new FrmDespesa().setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItemTotalVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTotalVendasActionPerformed
        new RelatorioVendaMes().setVisible(true);
    }//GEN-LAST:event_jMenuItemTotalVendasActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        FrmLogin l = new FrmLogin();
        l.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        FrmLogin l = new FrmLogin();
        l.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jButtonProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProdutosActionPerformed
        FrmCadastraProduto p = new FrmCadastraProduto();
        p.setVisible(true);
    }//GEN-LAST:event_jButtonProdutosActionPerformed

    private void jButtonClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClientesActionPerformed
        FrmCadastrarClientes c = new FrmCadastrarClientes();
        c.setVisible(true);
    }//GEN-LAST:event_jButtonClientesActionPerformed

    private void jMenuItemUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemUsuariosActionPerformed
        FrmCadastroUsuario c = new FrmCadastroUsuario();
        c.setVisible(true);
    }//GEN-LAST:event_jMenuItemUsuariosActionPerformed

    private void jMenuComprasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuComprasMouseClicked

    }//GEN-LAST:event_jMenuComprasMouseClicked

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

        JOptionPane.showMessageDialog(null, "Em breve, volte na versão 2.5!");

        /* conecta.conexao();
              conecta.executaSQL("select id_caixa, status from caixa");
          try {
              conecta.rs.last();
              String caixa = conecta.rs.getString("status");
            
              if(caixa.equals("aberto")){
                mod.setUser(jLabelUser.getText());
                FrmCompra compra = new FrmCompra(mod.getUser());
                compra.setVisible(true);
              
              }else{
            
                JOptionPane.showMessageDialog(null,"Não Existe Caixa Aberto... Abrir Caixa");
                FrmAbrirCaixa c = new FrmAbrirCaixa();
                c.setVisible(true);
               }
                } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Erro"+ex);
                }
         */
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed

        conecta.conexao();
        conecta.executaSQL("select id_caixa,status from caixa");
        try {
            conecta.rs.last();
            String caixa = conecta.rs.getString("status");

            if (caixa.equals("aberto")) {

                FrmSelecionaFornecedor forn = new FrmSelecionaFornecedor();
                forn.setVisible(true);

            } else {

                JOptionPane.showMessageDialog(null, "Não Existe Caixa Aberto... Abrir Caixa");
                FrmAbrirCaixa c = new FrmAbrirCaixa();
                c.setVisible(true);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro" + ex);
        }


    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        FrmCaixa c = new FrmCaixa();
        c.setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        conecta.conexao();
        conecta.executaSQL("SELECT * FROM caixa");
        try {
            conecta.rs.last();
            String statusCaixa = conecta.rs.getString("status");

            if (statusCaixa.equals("aberto")) {

                JOptionPane.showMessageDialog(null, "Caixa Já está Aberto");

            } else {

                FrmAbrirCaixa a = new FrmAbrirCaixa();
                a.setVisible(true);

            }
        } catch (SQLException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        RelatorioVendasDatas v = new RelatorioVendasDatas();
        v.setVisible(true);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItemDadosEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDadosEmpresaActionPerformed
        FrmDadosEmpresa d = new FrmDadosEmpresa();
        d.setVisible(true);

    }//GEN-LAST:event_jMenuItemDadosEmpresaActionPerformed

    private void jMenuItem11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem11MouseClicked
        CaixasFechados c = new CaixasFechados();
        c.setVisible(true);
    }//GEN-LAST:event_jMenuItem11MouseClicked

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        CaixasFechados c = new CaixasFechados();
        c.setVisible(true);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed

        FrmSelecionaCartao c = new FrmSelecionaCartao();
        c.setVisible(true);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jButtonVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVendasActionPerformed
        conecta.conexao();
        conecta.executaSQL("select id_caixa,status from caixa");
        try {
            conecta.rs.last();
            String caixa = conecta.rs.getString("status");

            if (caixa.equals("aberto")) {
                mod.setUser(jLabelUser.getText());
                FrmVenda venda = new FrmVenda(mod.getUser());
                venda.setVisible(true);

            } else {

                JOptionPane.showMessageDialog(null, "Não Existe Caixa Aberto... Abri Caixa");
                FrmAbrirCaixa c = new FrmAbrirCaixa();
                c.setVisible(true);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro" + ex);
        }
    }//GEN-LAST:event_jButtonVendasActionPerformed

    private void jMenuItemDadosEmpresaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItemDadosEmpresaMouseClicked

    }//GEN-LAST:event_jMenuItemDadosEmpresaMouseClicked

    private void jMenuItem2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2MouseClicked

    private void jMenuItemRelatorioComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRelatorioComprasActionPerformed
        RelatorioComprasDatas c = new RelatorioComprasDatas();
        c.setVisible(true);

    }//GEN-LAST:event_jMenuItemRelatorioComprasActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // verificando usuario para adicionar chave de acesso. add 03/01/2018

        try {
            conecta.executaSQL("SELECT * FROM users where user='" + jLabelUser.getText() + "'");
            conecta.rs.first();

            if (conecta.rs.getString("tipo").equals("Analista")) {
                FrmCadastroVenc frm = new FrmCadastroVenc();
                frm.setVisible(true);

            } else {

                JOptionPane.showMessageDialog(rootPane, "Esse Usuario não tem permissão!");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro fatal! " + "\n" + ex);
            System.out.println(ex);
        } finally {

            conecta.desconecta();

        }

    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        // chamando tela FrmValidaSis. add 04/1/2018
        FrmValidaSis frm = new FrmValidaSis();
        frm.setVisible(true);
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItemVeiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVeiculosActionPerformed
         FrmCadastraVeiculo veiculo = new FrmCadastraVeiculo();
        veiculo.setVisible(true);
    }//GEN-LAST:event_jMenuItemVeiculosActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        FrmCadastraServico servico = new FrmCadastraServico();
        servico.setVisible(true);
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        FrmMecanico Oficina = new FrmMecanico();
        Oficina.setVisible(true);
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        FrmFinalizarOsOficina Oficina = new FrmFinalizarOsOficina();
        Oficina.setVisible(true);
                                  
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
        FrmAberturaOS cliente = new FrmAberturaOS();
        cliente.setVisible(true);
    }//GEN-LAST:event_jMenuItem19ActionPerformed

    private void jMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem21ActionPerformed
      FrmStatusOS Status = new FrmStatusOS();
        Status.setVisible(true);
    }//GEN-LAST:event_jMenuItem21ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItemUsuarios1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemUsuarios1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemUsuarios1ActionPerformed

    private void jMenuItemUsuarios3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemUsuarios3ActionPerformed
       FrmCadastrarClientes cliente = new FrmCadastrarClientes();
        cliente.setVisible(true);
    }//GEN-LAST:event_jMenuItemUsuarios3ActionPerformed

    private void jMenuItem22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem22ActionPerformed

    private void jMenuItem23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem23ActionPerformed
    public void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
    }

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClientes;
    private javax.swing.JButton jButtonProdutos;
    private javax.swing.JButton jButtonVendas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JLabel jLabelHora;
    private javax.swing.JLabel jLabelLinceca;
    private javax.swing.JLabel jLabelUser;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCaixa;
    private javax.swing.JMenu jMenuCompras;
    private javax.swing.JMenu jMenuDespesa;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem jMenuItemCliente;
    private javax.swing.JMenuItem jMenuItemDadosEmpresa;
    private javax.swing.JMenuItem jMenuItemMaisVendidos;
    private javax.swing.JMenuItem jMenuItemRelatorioCompras;
    private javax.swing.JMenuItem jMenuItemRelatoriosVendas;
    private javax.swing.JMenuItem jMenuItemTotalVendas;
    private javax.swing.JMenuItem jMenuItemUsuarios;
    private javax.swing.JMenuItem jMenuItemUsuarios1;
    private javax.swing.JMenuItem jMenuItemUsuarios3;
    private javax.swing.JMenuItem jMenuItemVeiculos;
    private javax.swing.JMenu jMenuRecebimentos;
    private javax.swing.JMenu jMenuRelatorios;
    private javax.swing.JMenu jMenuVendas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JMenuItem menuCadastroCidades;
    private javax.swing.JMenu menuCadastros;
    private javax.swing.JMenu menuSair;
    // End of variables declaration//GEN-END:variables

    public class hora implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            Calendar now = Calendar.getInstance();
            jLabelHora.setText(String.format("%1$tH:%1$tM:%1$tS", now));
        }

    }

    private void vendas() {
        javax.swing.InputMap inputMap = this.getRootPane().getInputMap(javax.swing.JComponent.WHEN_IN_FOCUSED_WINDOW);
        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_F2, 0), "vendas");
        this.getRootPane().setInputMap(javax.swing.JComponent.WHEN_IN_FOCUSED_WINDOW, inputMap);
        this.getRootPane().getActionMap().put("vendas", new AbstractAction() {
            private static final long serialVersionUID = 1L;

            public void actionPerformed(ActionEvent arg0) {
                jButtonVendas.doClick();
            }
        });
    }

    private void produtos() {
        javax.swing.InputMap inputMap = this.getRootPane().getInputMap(javax.swing.JComponent.WHEN_IN_FOCUSED_WINDOW);
        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_F4, 0), "produtos");
        this.getRootPane().setInputMap(javax.swing.JComponent.WHEN_IN_FOCUSED_WINDOW, inputMap);
        this.getRootPane().getActionMap().put("produtos", new AbstractAction() {
            private static final long serialVersionUID = 1L;

            public void actionPerformed(ActionEvent arg0) {
                jButtonProdutos.doClick();
            }
        });
    }

    private void clientes() {
        javax.swing.InputMap inputMap = this.getRootPane().getInputMap(javax.swing.JComponent.WHEN_IN_FOCUSED_WINDOW);
        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_F5, 0), "clientes");
        this.getRootPane().setInputMap(javax.swing.JComponent.WHEN_IN_FOCUSED_WINDOW, inputMap);
        this.getRootPane().getActionMap().put("clientes", new AbstractAction() {
            private static final long serialVersionUID = 1L;

            public void actionPerformed(ActionEvent arg0) {
                jButtonClientes.doClick();
            }
        });
    }

    private void Sair() {
        javax.swing.InputMap inputMap = this.getRootPane().getInputMap(javax.swing.JComponent.WHEN_IN_FOCUSED_WINDOW);
        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "escape");
        this.getRootPane().setInputMap(javax.swing.JComponent.WHEN_IN_FOCUSED_WINDOW, inputMap);
        this.getRootPane().getActionMap().put("escape", new AbstractAction() {
            private static final long serialVersionUID = 1L;

            public void actionPerformed(ActionEvent arg0) {
            }
        });
    }

    private void data() {
        conecta.executaSQL("select * from chaveacesso");
        try {
            conecta.rs.last();
            char[] data = conecta.rs.getString("datavenc").toCharArray();

            jLabelLinceca.setText(("O Sistema expira dia: " + data[0] + data[1] + "-" + data[2] + data[3] + "-" + data[4] + data[5] + data[6] + data[7]));

        } catch (SQLException ex) {
            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
