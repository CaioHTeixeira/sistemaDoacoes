<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

=======
package View;

import Controller.CadastroItemController;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import Model.Usuario;
import javax.swing.JLabel;

>>>>>>> c926bfd7501ee4d3d2f4df9b97ce259c3b03b07a
/**
 *
 * @author caiot
 */
public class CadastroItemView extends javax.swing.JFrame {

    /**
     * Creates new form CadastroItem
     */
<<<<<<< HEAD
    
    public CadastroItemView() {
        initComponents();
=======
    private Usuario usuario;
    private final CadastroItemController cadastroItemController;
    private String caminhoFotoItem = "";
    
    public CadastroItemView() {
        initComponents();
        cadastroItemController = new CadastroItemController();
    }
    
    public CadastroItemView(Usuario usuario) {
        this.usuario = usuario;
        initComponents();
        cadastroItemController = new CadastroItemController(usuario, this);
>>>>>>> c926bfd7501ee4d3d2f4df9b97ce259c3b03b07a
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
        jLabel2 = new javax.swing.JLabel();
        jComboBoxTipoItemCadastroItem = new javax.swing.JComboBox<>();
        jTextFieldDescricaoItemCadastroItem = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldQuantidadeItemCadastroItem = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldCidadeItemCadastroItem = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldIdItemCadastroItem = new javax.swing.JTextField();
        jToggleButtonSalvarItemCadastroItem = new javax.swing.JToggleButton();
        jLabel6 = new javax.swing.JLabel();
        jToggleButtonVoltarCadastroItem = new javax.swing.JToggleButton();
<<<<<<< HEAD
=======
        jLabelImagemCadastro = new javax.swing.JLabel();
        jTextFieldCaminhoFoto = new javax.swing.JTextField();
        jButtonUpload = new javax.swing.JButton();
>>>>>>> c926bfd7501ee4d3d2f4df9b97ce259c3b03b07a

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(600, 600));

        jLabel1.setText("Descrição do item");

        jLabel2.setText("Tipo de item");

        jComboBoxTipoItemCadastroItem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "mobília", "vestuário", "material de construção", "roupa de cama", "utensílios domésticos" }));
        jComboBoxTipoItemCadastroItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoItemCadastroItemActionPerformed(evt);
            }
        });

        jLabel3.setText("Quantidade");

        jLabel4.setText("Cidade");

        jLabel5.setText("Id");

        jToggleButtonSalvarItemCadastroItem.setText("Salvar");
        jToggleButtonSalvarItemCadastroItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonSalvarItemCadastroItemActionPerformed(evt);
            }
        });

        jLabel6.setText("Cadastrar Item");

        jToggleButtonVoltarCadastroItem.setText("Voltar");
        jToggleButtonVoltarCadastroItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonVoltarCadastroItemActionPerformed(evt);
            }
        });

<<<<<<< HEAD
=======
        jButtonUpload.setText("Upload");
        jButtonUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUploadActionPerformed(evt);
            }
        });

>>>>>>> c926bfd7501ee4d3d2f4df9b97ce259c3b03b07a
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addComponent(jLabel6))
                    .addComponent(jLabel1)
<<<<<<< HEAD
                    .addComponent(jLabel2)
=======
>>>>>>> c926bfd7501ee4d3d2f4df9b97ce259c3b03b07a
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldIdItemCadastroItem, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTextFieldDescricaoItemCadastroItem, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextFieldQuantidadeItemCadastroItem, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextFieldCidadeItemCadastroItem, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jToggleButtonSalvarItemCadastroItem, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jToggleButtonVoltarCadastroItem, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
<<<<<<< HEAD
                    .addComponent(jComboBoxTipoItemCadastroItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(276, Short.MAX_VALUE))
=======
                    .addComponent(jComboBoxTipoItemCadastroItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelImagemCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                            .addComponent(jTextFieldCaminhoFoto))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonUpload)
                        .addGap(67, 67, 67))))
>>>>>>> c926bfd7501ee4d3d2f4df9b97ce259c3b03b07a
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
<<<<<<< HEAD
                        .addComponent(jLabel6))
=======
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 544, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jToggleButtonSalvarItemCadastroItem)
                            .addComponent(jToggleButtonVoltarCadastroItem)))
>>>>>>> c926bfd7501ee4d3d2f4df9b97ce259c3b03b07a
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
<<<<<<< HEAD
                        .addComponent(jTextFieldIdItemCadastroItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxTipoItemCadastroItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldDescricaoItemCadastroItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldQuantidadeItemCadastroItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldCidadeItemCadastroItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 311, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButtonSalvarItemCadastroItem)
                    .addComponent(jToggleButtonVoltarCadastroItem))
=======
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldIdItemCadastroItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBoxTipoItemCadastroItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldDescricaoItemCadastroItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelImagemCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldQuantidadeItemCadastroItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldCaminhoFoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCidadeItemCadastroItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButtonUpload))))
>>>>>>> c926bfd7501ee4d3d2f4df9b97ce259c3b03b07a
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxTipoItemCadastroItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoItemCadastroItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTipoItemCadastroItemActionPerformed

    private void jToggleButtonVoltarCadastroItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonVoltarCadastroItemActionPerformed
<<<<<<< HEAD
        HomeView telaHome = new HomeView();
=======
        HomeView telaHome = new HomeView(usuario);
>>>>>>> c926bfd7501ee4d3d2f4df9b97ce259c3b03b07a
        telaHome.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jToggleButtonVoltarCadastroItemActionPerformed

    private void jToggleButtonSalvarItemCadastroItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonSalvarItemCadastroItemActionPerformed
<<<<<<< HEAD
        
    }//GEN-LAST:event_jToggleButtonSalvarItemCadastroItemActionPerformed

=======
        cadastroItemController.salvaItem();
    }//GEN-LAST:event_jToggleButtonSalvarItemCadastroItemActionPerformed

    private void jButtonUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUploadActionPerformed
        cadastroItemController.uploadFotoItem();
    }//GEN-LAST:event_jButtonUploadActionPerformed

    public JComboBox<String> getjComboBoxTipoItemCadastroItem() {
        return jComboBoxTipoItemCadastroItem;
    }

    public void setjComboBoxTipoItemCadastroItem(JComboBox<String> jComboBoxTipoItemCadastroItem) {
        this.jComboBoxTipoItemCadastroItem = jComboBoxTipoItemCadastroItem;
    }

    public JTextField getjTextFieldCidadeItemCadastroItem() {
        return jTextFieldCidadeItemCadastroItem;
    }

    public void setjTextFieldCidadeItemCadastroItem(JTextField jTextFieldCidadeItemCadastroItem) {
        this.jTextFieldCidadeItemCadastroItem = jTextFieldCidadeItemCadastroItem;
    }

    public JTextField getjTextFieldDescricaoItemCadastroItem() {
        return jTextFieldDescricaoItemCadastroItem;
    }

    public void setjTextFieldDescricaoItemCadastroItem(JTextField jTextFieldDescricaoItemCadastroItem) {
        this.jTextFieldDescricaoItemCadastroItem = jTextFieldDescricaoItemCadastroItem;
    }

    public JTextField getjTextFieldIdItemCadastroItem() {
        return jTextFieldIdItemCadastroItem;
    }

    public void setjTextFieldIdItemCadastroItem(JTextField jTextFieldIdItemCadastroItem) {
        this.jTextFieldIdItemCadastroItem = jTextFieldIdItemCadastroItem;
    }

    public JTextField getjTextFieldQuantidadeItemCadastroItem() {
        return jTextFieldQuantidadeItemCadastroItem;
    }

    public void setjTextFieldQuantidadeItemCadastroItem(JTextField jTextFieldQuantidadeItemCadastroItem) {
        this.jTextFieldQuantidadeItemCadastroItem = jTextFieldQuantidadeItemCadastroItem;
    }

    public JLabel getjLabelImagemCadastro() {
        return jLabelImagemCadastro;
    }

    public void setjLabelImagemCadastro(JLabel jLabelImagemCadastro) {
        this.jLabelImagemCadastro = jLabelImagemCadastro;
    }

    public String getCaminhoFotoItem() {
        return caminhoFotoItem;
    }

    public void setCaminhoFotoItem(String caminhoFotoItem) {
        this.caminhoFotoItem = caminhoFotoItem;
    }
    
>>>>>>> c926bfd7501ee4d3d2f4df9b97ce259c3b03b07a
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
            java.util.logging.Logger.getLogger(CadastroItemView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroItemView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroItemView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroItemView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroItemView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
<<<<<<< HEAD
=======
    private javax.swing.JButton jButtonUpload;
>>>>>>> c926bfd7501ee4d3d2f4df9b97ce259c3b03b07a
    private javax.swing.JComboBox<String> jComboBoxTipoItemCadastroItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
<<<<<<< HEAD
=======
    private javax.swing.JLabel jLabelImagemCadastro;
    private javax.swing.JTextField jTextFieldCaminhoFoto;
>>>>>>> c926bfd7501ee4d3d2f4df9b97ce259c3b03b07a
    private javax.swing.JTextField jTextFieldCidadeItemCadastroItem;
    private javax.swing.JTextField jTextFieldDescricaoItemCadastroItem;
    private javax.swing.JTextField jTextFieldIdItemCadastroItem;
    private javax.swing.JTextField jTextFieldQuantidadeItemCadastroItem;
    private javax.swing.JToggleButton jToggleButtonSalvarItemCadastroItem;
    private javax.swing.JToggleButton jToggleButtonVoltarCadastroItem;
    // End of variables declaration//GEN-END:variables
}
