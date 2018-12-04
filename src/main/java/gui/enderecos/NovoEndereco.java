/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.enderecos;

import gui.JanelaPrincipal;
import gui.enderecos.bairro.NovoBairro;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ComboBox;
import lib.dao.imp.endereco.estado.EstadoDao;
import lib.dao.imp.endereco.provincia.ProvinciaDao;
import lib.model.endereco.Endereco;
import lib.model.endereco.bairro.Bairro;
import lib.model.endereco.cidade.Cidade;
import lib.model.endereco.estado.Estado;
import lib.model.endereco.pais.Pais;
import lib.model.endereco.provincia.Provincia;
import util.validacao.ValidacaoFacade;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author diego.lenz
 */
public class NovoEndereco extends javax.swing.JDialog {

    /**
     * Creates new form NovoEndereco
     */

    public interface Callback {

        void handle(Endereco endereco);
    }

    private final ObservableList<Estado> estados;
    private final ObservableList<Cidade> cidades;
    private final ObservableList<Bairro> bairros;
    private final ObservableList<Provincia> provincias;

    private Estado estadoSelecionado;
    private Cidade cidadeSelecionada;
    private Bairro bairroSelecionado;
    private Pais paisSelecionado;
    private Provincia provinciaSelecionado;
    private Bairro meubairro=new Bairro();

    private EstadoDao estadoDao =new EstadoDao();

    private Endereco endereco;
    private final Callback callback;
    private DefaultComboBoxModel comboBoxModel;
    private DefaultComboBoxModel comboBoxModelbairro;

    public ObservableList<Estado> getEstados() {
        return estados;
    }

    public ObservableList<Cidade> getCidades() {
        return cidades;
    }

    public ObservableList<Bairro> getBairros() {
        return bairros;
    }

    public ObservableList<Provincia> getProvincias() {
        return provincias;
    }

    public Estado getEstadoSelecionado() {
        return estadoSelecionado;
    }

    public void setEstadoSelecionado(Estado estadoSelecionado) {
        this.estadoSelecionado = estadoSelecionado;
    }

    public Cidade getCidadeSelecionada() {
        return cidadeSelecionada;
    }

    public void setCidadeSelecionada(Cidade cidadeSelecionada) {
        this.cidadeSelecionada = cidadeSelecionada;
    }

    public Bairro getBairroSelecionado() {
        return bairroSelecionado;
    }

    public void setBairroSelecionado(Bairro bairroSelecionado) {
        this.bairroSelecionado = bairroSelecionado;
    }

    public Pais getPaisSelecionado() {
        return paisSelecionado;
    }

    public void setPaisSelecionado(Pais paisSelecionado) {
        this.paisSelecionado = paisSelecionado;
    }

    public Provincia getProvinciaSelecionado() {
        return provinciaSelecionado;
    }

    public void setProvinciaSelecionado(Provincia provinciaSelecionado) {
        this.provinciaSelecionado = provinciaSelecionado;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    /**
     * Creates new form NovoEnderecoContatoForm
     *
     * @param callback
     */
    public NovoEndereco(Window parent,boolean modal ,Callback callback) {
        super((Dialog) parent, modal);
        this.callback = callback;
        this.endereco = new Endereco();
        this.estados = FXCollections.observableArrayList( new EstadoDao().listar());
        this.cidades =  FXCollections.observableArrayList(new ArrayList<Cidade>());
        this.bairros = FXCollections.observableArrayList(new ArrayList<Bairro>());
        this.provincias = FXCollections.observableArrayList( new ProvinciaDao().listar());


        initComponents();
        DefaultComboBoxModel comboBoxModel=new DefaultComboBoxModel();
        comboBoxModel.addElement("selecione");
        comboBoxModel.addElement(Pais.BRASIL);
        comboBoxModel.addElement(Pais.ARGENTINA);
        comboBoxModel.addElement(Pais.PARAGUAI);
        cmbPais.setModel(comboBoxModel);
        cmbPais.setSelectedItem(Pais.BRASIL);



    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        edtLogradouro = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lblComplemento = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        edtCep = new javax.swing.JFormattedTextField(
           // SwingFormatterFactory.buildCep()
        );
        lblCep = new javax.swing.JLabel();
        cmbCidade = new javax.swing.JComboBox();
        cmbEstado = new javax.swing.JComboBox();
        edtReferencia = new javax.swing.JTextField();
        cmbBairro = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        edtNumero = new javax.swing.JTextField();
        btnNovoBairro = new javax.swing.JButton();
        edtComplemento = new javax.swing.JTextField();
        cmbProvincia = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cmbPais = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        cmbTipoEndereco = new javax.swing.JComboBox<>();
        lblTipoEndereco = new javax.swing.JLabel();
        btnAdicionar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Novo endereco");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        edtLogradouro.setEnabled(false);

        jLabel1.setText("Estado");

        lblComplemento.setText("Complemento");

        jLabel7.setText("Referencia");

        try {
            edtCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#00000-000")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        edtCep.setEnabled(false);

        lblCep.setText("CEP");

        cmbCidade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione um estado" }));
        cmbCidade.setEnabled(false);
        cmbCidade.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbCidadeItemStateChanged(evt);
            }
        });

        cmbEstado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbEstadoItemStateChanged(evt);
            }
        });

        edtReferencia.setEnabled(false);

        cmbBairro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione uma cidade" }));
        cmbBairro.setEnabled(false);
        cmbBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBairroActionPerformed(evt);
            }
        });

        jLabel3.setText("Bairro");

        jLabel6.setText("Numero");

        jLabel2.setText("Cidade");

        jLabel4.setText("Logradouro");

        edtNumero.setEnabled(false);
        edtNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                edtNumeroKeyTyped(evt);
            }
        });

        btnNovoBairro.setText("Novo bairro");
        btnNovoBairro.setEnabled(false);
        btnNovoBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoBairroActionPerformed(evt);
            }
        });

        edtComplemento.setEnabled(false);

        cmbProvincia.setEnabled(false);
        cmbProvincia.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbProvinciaItemStateChanged(evt);
            }
        });

        jLabel8.setText("Provincia");

        cmbPais.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbPaisItemStateChanged(evt);
            }
        });

        jLabel9.setText("Pais");

        lblTipoEndereco.setText("Tipo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblComplemento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(lblTipoEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(110, 110, 110)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cmbBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNovoBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(edtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(edtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCep, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cmbPais, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbEstado, javax.swing.GroupLayout.Alignment.LEADING, 0, 355, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cmbTipoEndereco, javax.swing.GroupLayout.Alignment.LEADING, 0, 355, Short.MAX_VALUE)
                        .addComponent(edtComplemento, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNovoBairro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(edtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCep)
                    .addComponent(edtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(edtReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblComplemento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbTipoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTipoEndereco))
                .addContainerGap())
        );

        btnAdicionar.setText("Adicionar");
        btnAdicionar.setEnabled(false);
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAdicionar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionar)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbCidadeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCidadeItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            cidadeSelecionada = (Cidade) cmbCidade.getSelectedItem();
            bairros.clear();
            Collections.sort(cidadeSelecionada.getBairroList(), Comparator.comparing(Bairro::getNome));
            bairros.addAll(cidadeSelecionada.getBairroList());
        }
        cmbBairro.setEnabled(cidadeSelecionada != null);
        comboBoxModel=new DefaultComboBoxModel(bairros.toArray());
        cmbBairro.setModel(comboBoxModel);
        btnNovoBairro.setEnabled(cidadeSelecionada != null);
    }//GEN-LAST:event_cmbCidadeItemStateChanged

    private void cmbEstadoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbEstadoItemStateChanged
        if (cmbEstado.getSelectedItem()!=null) {
            estadoSelecionado = (Estado) cmbEstado.getSelectedItem();
            cidades.clear();
            Collections.sort(estadoSelecionado.getCidadeList(), Comparator.comparing(Cidade::getNome));
            cidades.addAll(estadoSelecionado.getCidadeList());
            DefaultComboBoxModel comboBoxModelcid=new DefaultComboBoxModel(cidades.toArray());
            cmbCidade.setModel(comboBoxModelcid);
            if (cidades.isEmpty()) {
                bairros.clear();
                cmbBairro.setEnabled(false);
                btnNovoBairro.setEnabled(false);
            }
        }

        cmbCidade.setEnabled(estadoSelecionado != null);
    }//GEN-LAST:event_cmbEstadoItemStateChanged

    private void cmbBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBairroActionPerformed
       /*  comboBoxModel=new DefaultComboBoxModel(cidadeSelecionada.getBairroList().toArray());

        this.cmbBairro.setModel(comboBoxModel);*/
        bairroSelecionado=(Bairro) cmbBairro.getSelectedItem();
        boolean itemSelecionado = bairroSelecionado != null;

        edtComplemento.setEnabled(itemSelecionado);
        edtLogradouro.setEnabled(itemSelecionado);
        edtNumero.setEnabled(itemSelecionado);
        edtReferencia.setEnabled(itemSelecionado);
        btnAdicionar.setEnabled(itemSelecionado);
        edtCep.setEnabled(itemSelecionado);
        if (itemSelecionado) {
            if (bairroSelecionado.getCep() != null && !bairroSelecionado.getCep().trim().isEmpty()) {
                edtCep.setText(bairroSelecionado.getCep());
            } else if (cidadeSelecionada.getCep() != null && !cidadeSelecionada.getCep().trim().isEmpty()) {
                edtCep.setText(cidadeSelecionada.getCep());
            }
        }
    }//GEN-LAST:event_cmbBairroActionPerformed

    private void edtNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtNumeroKeyTyped
        if (!"0123456789".contains(String.valueOf(evt.getKeyChar()))) {
            evt.consume();
        }
    }//GEN-LAST:event_edtNumeroKeyTyped

    private void btnNovoBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoBairroActionPerformed
        JanelaPrincipal janela=new JanelaPrincipal();

        NovoBairro.Callback callback= (bairro) ->{
            meubairro =bairro;
            bairros.add(meubairro);
            this.comboBoxModelbairro=new DefaultComboBoxModel(bairros.toArray());
            this.cmbBairro.setModel(comboBoxModelbairro);

        };
        NovoBairro form = new NovoBairro(this, callback, false, meubairro);
        form.setVisible(true);
        form.setcidade(cidadeSelecionada);
        if (form.isSalvo()) {
            cidadeSelecionada.getBairroList().add(form.getBairro());
            bairros.add(form.getBairro());
            Collections.sort(bairros, Comparator.comparing(Bairro::getNome));
            setBairroSelecionado(form.getBairro());
            cmbBairro.setSelectedItem(form.getBairro());
        }
    }//GEN-LAST:event_btnNovoBairroActionPerformed

    private void cmbProvinciaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbProvinciaItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            provinciaSelecionado = (Provincia) cmbProvincia.getSelectedItem();
            estados.clear();
            estados.addAll(provinciaSelecionado.getEstados());
            if (estados.isEmpty()) {
                cidades.clear();
                bairros.clear();
                cmbCidade.setEnabled(false);
                btnNovoBairro.setEnabled(false);
            }
        }
    }//GEN-LAST:event_cmbProvinciaItemStateChanged

    private void cmbPaisItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbPaisItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            paisSelecionado = (Pais) cmbPais.getSelectedItem();
            edtCep.setText(paisSelecionado.getZipCode());

            estados.clear();
            if (cmbPais.getSelectedItem()==Pais.BRASIL){
                    cmbEstado.setEnabled(true);
                    cmbProvincia.setEnabled(false);
                    estados.addAll(estadoDao.getByPais(Pais.BRASIL));
                    DefaultComboBoxModel comboBoxModelest=new DefaultComboBoxModel(estados.toArray());
                    comboBoxModelest.insertElementAt("selecione", 0);
                    cmbEstado.setSelectedItem("selecione");
                    cmbEstado.setModel(comboBoxModelest);
                } else
            if (paisSelecionado.equals(Pais.ARGENTINA)) {
                cmbEstado.setEnabled(false);
                cmbProvincia.setEnabled(true);
                estados.addAll(estadoDao.getByPais(Pais.ARGENTINA));
                DefaultComboBoxModel comboBoxModelest=new DefaultComboBoxModel(estados.toArray());
                cmbProvincia.setModel(comboBoxModelest);
                if (!provincias.isEmpty()) {
                    cmbProvincia.setSelectedIndex(0);
                }
            } else if (paisSelecionado.equals(Pais.PARAGUAI)) {
                cmbEstado.setEnabled(false);
                cmbProvincia.setEnabled(true);
                estados.addAll(estadoDao.getByPais(Pais.PARAGUAI));
                DefaultComboBoxModel comboBoxModelest=new DefaultComboBoxModel(estados.toArray());
                cmbProvincia.setModel(comboBoxModelest);

            } else  {
                estados.addAll(new EstadoDao().getByPais(paisSelecionado));
                cmbProvincia.setEnabled(false);
                cmbProvincia.setSelectedIndex(-1);
            }
            if (estados.isEmpty()) {
                cidades.clear();
                bairros.clear();
                cmbCidade.setEnabled(false);
                btnNovoBairro.setEnabled(false);
            }
            }

    }//GEN-LAST:event_cmbPaisItemStateChanged

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        endereco=new Endereco();
        endereco.setComplemento(this.edtComplemento.getText());
        endereco.setBairro(bairroSelecionado);
        endereco.setLogradouro("as");

        /*ValidacaoFacade.Resultado resultado = ValidacaoFacade.validar(endereco);
        if (resultado.isValoresInvalidos()) {
            JOptionPane.showMessageDialog(this, "falha ao salvar, Os seguintes problemas foram encontrados:\n" + resultado.getMensagem());
            return;
        } */

        dispose();
        callback.handle(endereco);

    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        boolean cancelar ;
        if ( JOptionPane.showConfirmDialog(this, "Tem certeza de que deseja cancelar?", null,JOptionPane.NO_OPTION, JOptionPane.YES_OPTION)==1){
            cancelar=false;
        } else {
            cancelar=true;
        }

        if (cancelar) {
            this.dispose();
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(NovoEndereco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NovoEndereco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NovoEndereco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NovoEndereco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NovoEndereco dialog = new NovoEndereco(new javax.swing.JFrame() ,true, null);
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
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnNovoBairro;
    private javax.swing.JComboBox cmbBairro;
    private javax.swing.JComboBox cmbCidade;
    private javax.swing.JComboBox cmbEstado;
    private javax.swing.JComboBox cmbPais;
    private javax.swing.JComboBox<String> cmbProvincia;
    private javax.swing.JComboBox<String> cmbTipoEndereco;
    private javax.swing.JFormattedTextField edtCep;
    private javax.swing.JTextField edtComplemento;
    private javax.swing.JTextField edtLogradouro;
    private javax.swing.JTextField edtNumero;
    private javax.swing.JTextField edtReferencia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCep;
    private javax.swing.JLabel lblComplemento;
    private javax.swing.JLabel lblTipoEndereco;
    // End of variables declaration//GEN-END:variables
}
