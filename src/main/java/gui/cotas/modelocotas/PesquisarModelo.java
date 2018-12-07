/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.cotas.modelocotas;

import gui.modeltable.TableModelModeloPeriodo;
import gui.modeltable.TableModelPessoa;

import lib.dao.imp.cotas.ModeloPeriodoDao;
import lib.dao.imp.pessoa.PessoaDao;
import lib.model.cotas.ModeloPeriodo;
import lib.model.pessoa.Pessoa;
//import sun.plugin2.jvm.RemoteJVMLauncher;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;

/**
 *
 * @author diego.lenz
 */
public class PesquisarModelo extends javax.swing.JDialog {
    private ModeloPeriodo modeloperiodo=null;
    private TableModelModeloPeriodo modelotabela=new TableModelModeloPeriodo();
    private final Callback callback;
    private List<ModeloPeriodo> list=new ArrayList<>();
    private ModeloPeriodoDao modeloPeriododao= new ModeloPeriodoDao();

    /**
     * Creates new form Pesquisar
     */

    public interface Callback {

        void handle(ModeloPeriodo modeloPeriodo);
    }

    public PesquisarModelo(Window parent, boolean modal, Callback callBack) {
        super((Dialog) parent, modal);
        this.callback=callBack;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbselecionapesquisa = new javax.swing.JComboBox();
        edtpesquisa = new javax.swing.JFormattedTextField();
        btnpesquisar = new javax.swing.JToggleButton();
        btnselecionar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);
        setModal(true);

        cmbselecionapesquisa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "generico" }));
        cmbselecionapesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbselecionapesquisaActionPerformed(evt);
            }
        });

        btnpesquisar.setText("Pesquisar");
        btnpesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpesquisarActionPerformed(evt);
            }
        });

        btnselecionar.setText("selecionar");
        btnselecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnselecionarActionPerformed(evt);
            }
        });

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabela.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tabela);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmbselecionapesquisa, 0, 164, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtpesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(btnpesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnselecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbselecionapesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtpesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnpesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnselecionar)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnpesquisarActionPerformed(java.awt.event.ActionEvent evt) {

        modeloperiodo=new ModeloPeriodo();
        list= modeloPeriododao.listar();
        modelotabela.setList(list.toArray());
        tabela.setModel(modelotabela);
    }

    private void btnselecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnselecionarActionPerformed
        // TODO add your handling code here:
        //PessoaCotaDao pdao=new PessoaCotaDao();
        if (tabela.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(this , "Nenhum modelo selecionada");
            return;
        } else {
            Integer id=(Integer)this.tabela.getValueAt(this.tabela.getSelectedRow(),0);
            modeloperiodo = (ModeloPeriodo) modeloPeriododao.carregar(id);
            callback.handle(modeloperiodo);
            this.dispose();
        }
    }//GEN-LAST:event_btnselecionarActionPerformed

    private void cmbselecionapesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbselecionapesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbselecionapesquisaActionPerformed

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
            java.util.logging.Logger.getLogger(PesquisarModelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PesquisarModelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PesquisarModelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PesquisarModelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PesquisarModelo dialog = new PesquisarModelo(new javax.swing.JFrame(), true,null);
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
    private javax.swing.JToggleButton btnpesquisar;
    private javax.swing.JButton btnselecionar;
    private javax.swing.JComboBox cmbselecionapesquisa;
    private javax.swing.JFormattedTextField edtpesquisa;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
