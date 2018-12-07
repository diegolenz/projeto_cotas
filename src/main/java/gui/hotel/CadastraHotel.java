/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.hotel;

import gui.cotas.cadastroCota;
import gui.hotel.apartamento.CadastroApartamento;
import gui.hotel.bloco.*;
import gui.modeltable.TableModelApartamento;
import gui.modeltable.TableModelBloco;
import lib.dao.imp.apartamento.ApartamentoDao;
import lib.dao.imp.bloco.BlocoDao;
import lib.dao.imp.hotel.HotelDao;
import lib.model.apartamento.Apartamento;
import lib.model.bloco.Bloco;
import lib.model.hotel.Hotel;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diego
 */
public class CadastraHotel extends javax.swing.JDialog {

    /**
     * Creates new form CadastraHotel
     */
    private Hotel hotel;
    private Bloco bloco=new Bloco();
    private Apartamento apartamento=new Apartamento();
    private List<Apartamento> apartamentos=new ArrayList<>();
    private List<Bloco> blocos=new ArrayList<>();
    private TableModelBloco tableModelBloco=new TableModelBloco();
    private TableModelApartamento tableModelApartamento=new TableModelApartamento();
    private BlocoDao blocoDao;
    private ApartamentoDao apartamentoDao;
    private HotelDao hotelDao;


    public CadastraHotel(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    public void setHotel(Hotel hotel){
        this.hotel=new Hotel();
        this.hotel=hotel;
        this.carregaredt();

    }
    public void carregaredt(){
        this.edtNome.setText(hotel.getNome());
        this.edtCpf.setText(hotel.getCpfCnpj());
        this.edtRazaoSocial.setText(hotel.getRazaoSocial());
        this.tableModelBloco.setList(hotel.getBlocos().toArray());
        this.blocos=hotel.getBlocos();
        for (Bloco b : blocos){
            apartamentos.addAll(b.getApartamentos());
        }
        this.tableModelApartamento.setList(apartamentos.toArray());
        this.tabelabloco.setModel(tableModelBloco);
        this.jtblapartamento.setModel(tableModelApartamento);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnsalvarhotel = new javax.swing.JButton();
        pnlhotelprincipal = new javax.swing.JTabbedPane();
        pnlInformacoes2 = new javax.swing.JPanel();
        lblCpfCnpj = new javax.swing.JLabel();
        edtNome = new javax.swing.JTextField();
        edtCpf = new javax.swing.JFormattedTextField();
        edtRazaoSocial = new javax.swing.JTextField();
        lblRazaoSocial = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        btnsalvarinfhotel = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnnvenderecos = new javax.swing.JButton();
        btnrmvend = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaend = new javax.swing.JTable();
        btnaltend = new javax.swing.JButton();
        jpnl = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelabloco = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        btnnovobloco = new javax.swing.JButton();
        btnrmvbloco = new javax.swing.JButton();
        btnaltbloco = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtblapartamento = new javax.swing.JTable();
        btnnovoApa = new javax.swing.JButton();
        btnrmvApa = new javax.swing.JButton();
        btnaltApa = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btncanccad = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("cadastro de hotel");

        btnsalvarhotel.setText("salvar cadastro");
        btnsalvarhotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    btnsalvarhotelActionPerformed(evt);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        pnlhotelprincipal.setBackground(new java.awt.Color(255, 255, 255));
        pnlhotelprincipal.setToolTipText("");
        pnlhotelprincipal.setName("blocos"); // NOI18N

        pnlInformacoes2.setBackground(new java.awt.Color(255, 255, 255));

        lblCpfCnpj.setText("CNPJ");

        edtCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtCpfActionPerformed(evt);
            }
        });

        lblRazaoSocial.setText("Razao social");

        lblNome.setText("Nome ");

        btnsalvarinfhotel.setText("salvar informacoes e prosseguir");
        btnsalvarinfhotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalvarinfhotelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlInformacoes2Layout = new javax.swing.GroupLayout(pnlInformacoes2);
        pnlInformacoes2.setLayout(pnlInformacoes2Layout);
        pnlInformacoes2Layout.setHorizontalGroup(
            pnlInformacoes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInformacoes2Layout.createSequentialGroup()
                .addGroup(pnlInformacoes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCpfCnpj, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRazaoSocial, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(pnlInformacoes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edtRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(372, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInformacoes2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnsalvarinfhotel, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        pnlInformacoes2Layout.setVerticalGroup(
            pnlInformacoes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInformacoes2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlInformacoes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInformacoes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlInformacoes2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInformacoes2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lblCpfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlInformacoes2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(edtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 346, Short.MAX_VALUE)
                .addComponent(btnsalvarinfhotel)
                .addGap(19, 19, 19))
        );

        pnlhotelprincipal.addTab("Informacoes basicas", pnlInformacoes2);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("adicionar endereco");

        btnnvenderecos.setText("adicionar");
        btnnvenderecos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnvenderecosActionPerformed(evt);
            }
        });

        btnrmvend.setText("remover");
        btnrmvend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrmvendActionPerformed(evt);
            }
        });

        tabelaend.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabelaend.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(tabelaend);

        btnaltend.setText("alterar");
        btnaltend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaltendActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 723, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnnvenderecos)
                                .addGap(18, 18, 18)
                                .addComponent(btnrmvend)
                                .addGap(18, 18, 18)
                                .addComponent(btnaltend)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnrmvend)
                    .addComponent(btnnvenderecos)
                    .addComponent(btnaltend))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlhotelprincipal.addTab("enderecos", jPanel1);

        jpnl.setBackground(new java.awt.Color(255, 255, 255));
        jpnl.setName("bloco"); // NOI18N

        tabelabloco.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabelabloco);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Blocos");

        btnnovobloco.setText("adicionar");
        btnnovobloco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnovoblocoActionPerformed(evt);
            }
        });

        btnrmvbloco.setText("remover");
        btnrmvbloco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrmvblocoActionPerformed(evt);
            }
        });

        btnaltbloco.setText("alterar");
        btnaltbloco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaltblocoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnlLayout = new javax.swing.GroupLayout(jpnl);
        jpnl.setLayout(jpnlLayout);
        jpnlLayout.setHorizontalGroup(
            jpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnlLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jpnlLayout.createSequentialGroup()
                        .addGroup(jpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpnlLayout.createSequentialGroup()
                                .addComponent(btnnovobloco)
                                .addGap(18, 18, 18)
                                .addComponent(btnrmvbloco)
                                .addGap(18, 18, 18)
                                .addComponent(btnaltbloco)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 723, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jpnlLayout.setVerticalGroup(
            jpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(jpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnrmvbloco, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnaltbloco)
                        .addComponent(btnnovobloco)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlhotelprincipal.addTab("bloco", jpnl);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jtblapartamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(jtblapartamento);

        btnnovoApa.setText("adicionar");
        btnnovoApa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnovoApaActionPerformed(evt);
            }
        });

        btnrmvApa.setText("remover");
        btnrmvApa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrmvApaActionPerformed(evt);
            }
        });

        btnaltApa.setText("alterar");
        btnaltApa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaltApaActionPerformed(evt);
            }
        });

        jLabel4.setText("Apartamentos");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(18, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnnovoApa, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnrmvApa, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnaltApa, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnaltApa)
                    .addComponent(btnrmvApa)
                    .addComponent(btnnovoApa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlhotelprincipal.addTab("Apartamento", jPanel2);

        btncanccad.setText("cancelar cadastro");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btncanccad, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnsalvarhotel, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(pnlhotelprincipal))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlhotelprincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsalvarhotel)
                    .addComponent(btncanccad))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void edtCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtCpfActionPerformed

    private void btnnvenderecosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnvenderecosActionPerformed
        // TODO add your handling code here:
      /*  this.endereco=new Endereco();
        enderecos=new ArrayList<>();
        NovoEndereco.Callback callback = (endereco) -> {

            this.endereco=endereco;
            // this.endereco.setPessoas(pessoa);
            enderecos.add(this.endereco);
            modeloend =new TableModelEndereco();
            modeloend.setList(enderecos.toArray());
            this.tabelaend.setModel(modeloend);
        };
        NovoEndereco novoEndereco = new NovoEndereco(this, true, callback);
        novoEndereco.setVisible(true); */
    }//GEN-LAST:event_btnnvenderecosActionPerformed

    private void btnrmvendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrmvendActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnrmvendActionPerformed

    private void btnaltendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaltendActionPerformed

    }//GEN-LAST:event_btnaltendActionPerformed

    private void btnnovoblocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnovoblocoActionPerformed
        // TODO add your handling code here:
        if (hotel == null){
            JOptionPane.showMessageDialog(this, "cadastre informacoes do hotel na aba 'informações basicas' para prosseguir'.");
        } else {
            CadastroBloco.Callback callback = (bloco) -> {
                this.bloco = bloco;
                blocos.add(this.bloco);
                tableModelBloco.setList(blocos.toArray());
                this.tabelabloco.setModel(tableModelBloco);
            };
            CadastroBloco obj = new CadastroBloco(null, true, callback);
            obj.sethotel(hotel);
            obj.setVisible(true);
        }
    }//GEN-LAST:event_btnnovoblocoActionPerformed

    private void btnrmvblocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrmvblocoActionPerformed
        if (this.tabelabloco.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(this, "Nenhum bloco selecionado");
            return;
        } else {
            bloco = new Bloco();
            bloco = blocos.get(tabelabloco.getSelectedRow());
            blocos.remove(bloco);
            this.tabelabloco.setModel(tableModelBloco);
        }
        }//GEN-LAST:event_btnrmvblocoActionPerformed

    private void btnaltblocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaltblocoActionPerformed
        // TODO add your handling code here:
        if (this.tabelabloco.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(this, "Nenhum bloco selecionado");
            return;
        } else {
            bloco=new Bloco();
            bloco=blocos.get(tabelabloco.getSelectedRow());
            CadastroBloco.Callback callback = (bloco) -> {
                this.bloco = bloco;
                tableModelBloco.setList(blocos.toArray());
                this.tabelabloco.setModel(tableModelBloco);
            };
            CadastroBloco obj = new CadastroBloco(null, true, callback);
            obj.setbloco(bloco);
            obj.setVisible(true);
        }
    }//GEN-LAST:event_btnaltblocoActionPerformed

    private void btnnovoApaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnovoApaActionPerformed
        // TODO add your handling code here:
        if (bloco == null){
            JOptionPane.showMessageDialog(this, "cadastre ao menos um bloco para poder cadastrar um apartamento.");
        } else {
                CadastroApartamento.Callback callback = (apartamento, blocos) -> {
                this.apartamento = apartamento;
                this.blocos=blocos;
                apartamentos.add(this.apartamento);
                tableModelApartamento.setList(apartamentos.toArray());
                this.jtblapartamento.setModel(tableModelApartamento);
            };
            CadastroApartamento obj = new CadastroApartamento(null, true, callback);
            obj.setabloco_hotel(hotel, blocos);
            obj.setVisible(true);
        }
    }//GEN-LAST:event_btnnovoApaActionPerformed

    private void btnrmvApaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrmvApaActionPerformed
        if (this.jtblapartamento.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(this, "Nenhum apartamento selecionado");
            return;
        } else {
            apartamento = new Apartamento();
            apartamento = apartamentos.get(jtblapartamento.getSelectedRow());
            apartamentos.remove(bloco);
            this.jtblapartamento.setModel(tableModelApartamento);
        }

    }//GEN-LAST:event_btnrmvApaActionPerformed

    private void btnaltApaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaltApaActionPerformed
        // TODO add your handling code here:
        if (this.jtblapartamento.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(this, "Nenhum apartamento selecionado");
            return;
        } else {
            apartamento=new Apartamento();
            apartamento=apartamentos.get(jtblapartamento.getSelectedRow());
            CadastroApartamento.Callback callback = (apartamento,blocos) -> {
                this.apartamento = apartamento;
                tableModelApartamento.setList(apartamentos.toArray());
                this.jtblapartamento.setModel(tableModelApartamento);
            };
            CadastroApartamento obj = new CadastroApartamento(null, true, callback);
            obj.setabloco_hotel(hotel, blocos);
            obj.setapartamento(apartamento);
            obj.setVisible(true);
        }
    }//GEN-LAST:event_btnaltApaActionPerformed

    private void btnsalvarhotelActionPerformed(java.awt.event.ActionEvent evt) throws Exception {

        if (hotel!=null) {
            hotel.setBlocos(blocos);
            hotelDao = new HotelDao();
            hotelDao.Inserir(hotel);
            JOptionPane.showMessageDialog(this, "salvo com sucesso");
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "não foi possivel salvar");
            return;
        }





    }

    private void btnsalvarinfhotelActionPerformed(java.awt.event.ActionEvent evt) {
        hotel=new Hotel();
        hotel.setNome(edtNome.getText());
        hotel.setCpfCnpj(edtCpf.getText());
        hotel.setRazaoSocial(edtRazaoSocial.getText());
        JOptionPane.showMessageDialog(this,"informacoes salvas");
        this.pnlhotelprincipal.setSelectedIndex(1);
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
            java.util.logging.Logger.getLogger(CadastraHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastraHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastraHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastraHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CadastraHotel dialog = new CadastraHotel(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaltApa;
    private javax.swing.JButton btnaltbloco;
    private javax.swing.JButton btnaltend;
    private javax.swing.JButton btncanccad;
    private javax.swing.JButton btnnovoApa;
    private javax.swing.JButton btnnovobloco;
    private javax.swing.JButton btnnvenderecos;
    private javax.swing.JButton btnrmvApa;
    private javax.swing.JButton btnrmvbloco;
    private javax.swing.JButton btnrmvend;
    private javax.swing.JButton btnsalvarhotel;
    private javax.swing.JButton btnsalvarinfhotel;
    private javax.swing.JFormattedTextField edtCpf;
    private javax.swing.JTextField edtNome;
    private javax.swing.JTextField edtRazaoSocial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel jpnl;
    private javax.swing.JTable jtblapartamento;
    private javax.swing.JLabel lblCpfCnpj;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblRazaoSocial;
    private javax.swing.JPanel pnlInformacoes2;
    private javax.swing.JTabbedPane pnlhotelprincipal;
    private javax.swing.JTable tabelabloco;
    private javax.swing.JTable tabelaend;
    // End of variables declaration//GEN-END:variables
}
