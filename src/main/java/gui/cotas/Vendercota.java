/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.cotas;

import gui.JanelaPrincipal;
import gui.modeltable.TableModelCotaIntegrantres;
import gui.pesquisa.Pesquisa;

import java.awt.*;
import java.util.List;
import java.util.Vector;

import gui.pesquisa.Pesquisar;
import gui.selecionacota.SelecionaCota;
import lib.dao.imp.cotas.CotasDao;
import lib.dao.imp.pessoa.PessoaDao;
import lib.model.cotas.Cota;
import lib.model.cotas.PessoaCotaTitular;
import lib.model.pessoa.Pessoa;

import javax.swing.*;

/**
 *
 * @author diego.lenz
 */
public class Vendercota extends javax.swing.JInternalFrame {

    /**
     * Creates new form Vendercota
     */
    private List<Pessoa>   pessoascota=new Vector<>();
    private PessoaCotaTitular pessoatitular;
    private Pessoa pessoacota;
    private TableModelCotaIntegrantres modelotabela;
    private Cota cota=new Cota();
    private JFrame tela;

    public Vendercota() {

        initComponents();
    }

    public void setaframe(JFrame tela){
        this.tela=tela;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        lblliente = new javax.swing.JLabel();
        edtcliente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        edtdocumento = new javax.swing.JFormattedTextField();
        btnpesqcliente = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        edthotel = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnpesqcota = new javax.swing.JButton();
        edtapartamento = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        edtcota = new javax.swing.JTextField();
        btncancelar = new javax.swing.JToggleButton();
        btnconfirmar = new javax.swing.JToggleButton();
        btnaddagregado = new javax.swing.JButton();
        btnremover = new javax.swing.JToggleButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaagregadostitulo = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        edtbloco = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setClosable(true);
        setTitle("Venda de cota");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        setDoubleBuffered(true);
        setFrameIcon(null);
        setName(""); // NOI18N
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        setVisible(true);

        lblliente.setText("Nome");

        edtcliente.setEditable(false);
        edtcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtclienteActionPerformed(evt);
            }
        });

        jLabel1.setText("Documento");

        edtdocumento.setEditable(false);
        edtdocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtdocumentoActionPerformed(evt);
            }
        });

        btnpesqcliente.setText("selecionar titular");
        btnpesqcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpesqclienteActionPerformed(evt);
            }
        });

        jLabel2.setText("Selecione hotel, apartamento e cota");

        edthotel.setEditable(false);
        edthotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edthotelActionPerformed(evt);
            }
        });

        jLabel3.setText("Selecione o titular");

        jLabel4.setText("Hotel");

        btnpesqcota.setText("selecionar cota");
        btnpesqcota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpesqcotaActionPerformed(evt);
            }
        });

        edtapartamento.setEditable(false);
        edtapartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtapartamentoActionPerformed(evt);
            }
        });

        jLabel5.setText("Apartamento");

        jLabel6.setText("Cota");

        edtcota.setEditable(false);
        edtcota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtcotaActionPerformed(evt);
            }
        });

        btncancelar.setText("Cancelar");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });

        btnconfirmar.setText("confirmar");
        btnconfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconfirmarActionPerformed(evt);
            }
        });

        btnaddagregado.setText("adicionar agregado");
        btnaddagregado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddagregadoActionPerformed(evt);
            }
        });

        btnremover.setText("remover");
        btnremover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnremoverActionPerformed(evt);
            }
        });

        tabelaagregadostitulo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabelaagregadostitulo.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(tabelaagregadostitulo);

        jLabel7.setText("Bloco");

        edtbloco.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edtcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblliente, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(edthotel, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(edtbloco, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(111, 111, 111)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(edtdocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(edtapartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(49, 49, 49)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(edtcota, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnpesqcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnpesqcota, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(38, 38, 38))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btncancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnconfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnaddagregado, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnremover, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edthotel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edtbloco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblliente)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edtcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edtdocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnpesqcliente)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edtcota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edtapartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnpesqcota))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnaddagregado)
                    .addComponent(btnremover))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncancelar)
                    .addComponent(btnconfirmar))
                .addContainerGap())
        );

        setBounds(0, 0, 959, 529);
    }// </editor-fold>//GEN-END:initComponents

    private void edtclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtclienteActionPerformed

    private void edtdocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtdocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtdocumentoActionPerformed






    private void btnpesqclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpesqclienteActionPerformed
        pessoacota=new Pessoa();
        pessoatitular=new PessoaCotaTitular();
        //agregados=new ArrayList<>();
            Pesquisar.Callback callback =  (pessoatitulo) -> {
                this.pessoatitular.setPessoa(pessoatitulo);
                if (verrificaagrgado(this.pessoatitular.getPessoa())==true) {
                    this.pessoatitular.setPessoa(pessoatitulo);
                    this.edtcliente.setText(pessoatitulo.getNome());
                    this.edtdocumento.setText(pessoatitulo.getCpfCnpj());
                }
            };
        Pesquisar pesquisa=new Pesquisar(tela, true,  callback);
        pesquisa.getContentPane().setBackground(Color.WHITE);
        pesquisa.show();

        
    }//GEN-LAST:event_btnpesqclienteActionPerformed

    private void edthotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edthotelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edthotelActionPerformed

    private void btnpesqcotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpesqcotaActionPerformed
        cota=new Cota();
        SelecionaCota.Callback callback =  (cota) -> {
            this.cota= (Cota) cota;
            this.edthotel.setText(cota.getApartamento().getBloco().getHotel().getNome());
            this.edtbloco.setText(String.valueOf(cota.getApartamento().getBloco().getNumero()));
            this.edtapartamento.setText(String.valueOf(cota.getApartamento().getNumero()));
            this.edtcota.setText(String.valueOf(cota.getNumero()));

        };
        JanelaPrincipal janelaPrincipal=new JanelaPrincipal();
        SelecionaCota formselecionacota=new SelecionaCota(callback,janelaPrincipal, false);
        formselecionacota.show();
    }//GEN-LAST:event_btnpesqcotaActionPerformed

    private void edtapartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtapartamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtapartamentoActionPerformed

    private void edtcotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtcotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtcotaActionPerformed

    private void btnconfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconfirmarActionPerformed
        CotasDao cotasDao=new CotasDao();
        try {
            cotasDao.Inserir(cota);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this , "Ocorreu um erro ao salvar a cota");
            e.printStackTrace();
        }

    }//GEN-LAST:event_btnconfirmarActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btncancelarActionPerformed

    public boolean verrificaagrgado(Pessoa pessoa){
        if (pessoa==null){
            JOptionPane.showMessageDialog(null , "Selecione uma pessoa");
            return false;
        }
        if (pessoascota.contains(pessoa)){
            JOptionPane.showMessageDialog(null , "A pessoa selecionada já esta agregada");
            return false;
        } else
            return true;
    }

    private void btnaddagregadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddagregadoActionPerformed
        pessoacota=new Pessoa();

        //agregados=new ArrayList<>();
        Pesquisar.Callback callback =  (pessoatitulo) -> {
            this.pessoacota=pessoatitulo;
            if (this.verrificaagrgado(pessoacota)==true) {
                if (verrificatitular()) {
                    pessoascota.add(this.pessoacota);
                    modelotabela = new TableModelCotaIntegrantres();
                    modelotabela.setList(pessoascota.toArray());
                    cota.setIntegrantes(pessoascota);
                    this.tabelaagregadostitulo.setModel(modelotabela);
                }
            }
        };
        Pesquisar pesquisa=new Pesquisar(tela, true, callback);
        pesquisa.getContentPane().setBackground(Color.WHITE);
        pesquisa.show();


      /*  if (edtcliente.getText()==""){
            JOptionPane.showMessageDialog(this , "nenhuma pessoa foi selecionada");
        } else {
            if (verrificaagrgado() == true) {
               // pessoacota.setTipo_status("integrante");
                pessoascota.add(pessoacota);
                modelotabela = new TableModelCotaIntegrantres();
                modelotabela.setList(pessoascota.toArray());
                cota.setIntegrantes(pessoascota);
                this.tabelaagregadostitulo.setModel(modelotabela);
            }
        } */


    }//GEN-LAST:event_btnaddagregadoActionPerformed

    public boolean verrificatitular(){
        if (pessoatitular==null){
            return true;
        }
        if  (pessoacota==pessoatitular.getPessoa()){
            JOptionPane.showMessageDialog(this , "A pessoa selecionada é o titular do titulo");
            return false;

        } else  if (pessoatitular.getPessoa().getNome()==cota.getTitular().getPessoa().getNome()
                && (pessoatitular.getPessoa().getCpfCnpj()==cota.getTitular().getPessoa().getCpfCnpj())) {
            JOptionPane.showMessageDialog(this , "A pessoa selecionada já é o titular do titulo");
            return false;
            /*else if (cota.getTitular()!= null){
            JOptionPane.showMessageDialog(this , "O titulo já possui um titular");
            return false; */
        } else
            return true;
    }

    private void btnaddtitularActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
     /*   pessoatitular=new PessoaCotaTitular();
        pessoatitular.getPessoa().setNome(pessoacota.getNome());
        pessoatitular.getPessoa().setCpfCnpj(pessoacota.getCpfCnpj());
        //pessoacota.setTipo_status("Titular");
        //cetar todas as informações
        if (edtcliente.getText()==""){
            JOptionPane.showMessageDialog(this , "nenhuma pessoa foi selecionada");
        } else {
            if (verrificatitular() == true) {
                pessoascota.add(pessoacota);
                modelotabela = new TableModelCotaIntegrantres();
                modelotabela.setList(pessoascota.toArray());
                cota.setTitular(pessoatitular);
                this.tabelaagregadostitulo.setModel(modelotabela);
            }
        } */
    }

    private void btnremoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnremoverActionPerformed
        if (this.tabelaagregadostitulo.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(this, "Nenhuma pessoa selecionada");
            return;
        } else {
            Integer id = (Integer) this.tabelaagregadostitulo.getValueAt(this.tabelaagregadostitulo.getSelectedRow(), 0);
            pessoacota = new Pessoa();
            PessoaDao PDao = new PessoaDao();
            pessoacota = (Pessoa) PDao.carregar(id);
            if ((cota.getTitular() != null)&&(pessoacota.getNome() == cota.getTitular().getPessoa().getNome())
                        && (pessoacota.getCpfCnpj() == cota.getTitular().getPessoa().getCpfCnpj())) {
                    if (JOptionPane.showConfirmDialog(this, "A pessoa selecionada é o titular da cota. Deseja realmente excluir?", title, JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                        cota.setTitular(null);
                        pessoascota.remove(pessoacota);
                        modelotabela.setList(pessoascota.toArray());

                    }

                } else {
                    pessoascota.remove(pessoacota);
                    modelotabela.setList(pessoascota.toArray());
                }
            }
    }//GEN-LAST:event_btnremoverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaddagregado;
    private javax.swing.JToggleButton btncancelar;
    private javax.swing.JToggleButton btnconfirmar;
    private javax.swing.JButton btnpesqcliente;
    private javax.swing.JButton btnpesqcota;
    private javax.swing.JToggleButton btnremover;
    private javax.swing.JTextField edtapartamento;
    private javax.swing.JTextField edtbloco;
    private javax.swing.JTextField edtcliente;
    private javax.swing.JTextField edtcota;
    private javax.swing.JFormattedTextField edtdocumento;
    private javax.swing.JTextField edthotel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblliente;
    private javax.swing.JTable tabelaagregadostitulo;
    // End of variables declaration//GEN-END:variables

}
