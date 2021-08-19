package View;

import Controller.PesquisarItemController;
import Model.Usuario;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author caiot
 */
public class PesquisarItemView extends javax.swing.JFrame {

    private Usuario usuario;
    private final PesquisarItemController pesquisarItemController;
    private String caminhoFotoItem = "";
    
    public PesquisarItemView() {
        initComponents();
        pesquisarItemController = new PesquisarItemController();
    }

    PesquisarItemView(Usuario usuario) {
        this.usuario = usuario;
        initComponents();
        pesquisarItemController = new PesquisarItemController(usuario, this);
    }

    public JTextField getjTextFieldTipoItemPesquisarItem() {
        return jTextFieldTipoItemPesquisarItem;
    }

    public void setjTextFieldTipoItemPesquisarItem(JTextField jTextFieldTipoItemPesquisarItem) {
        this.jTextFieldTipoItemPesquisarItem = jTextFieldTipoItemPesquisarItem;
    }
    
    

    public JLabel getjLabelImagem() {
        return jLabelImagem;
    }

    public void setjLabelImagem(JLabel jLabelImagem) {
        this.jLabelImagem = jLabelImagem;
    }

    public JTextField getjTextFieldCidadeItemPesquisarItem() {
        return jTextFieldCidadeItemPesquisarItem;
    }

    public void setjTextFieldCidadeItemPesquisarItem(JTextField jTextFieldCidadeItemPesquisarItem) {
        this.jTextFieldCidadeItemPesquisarItem = jTextFieldCidadeItemPesquisarItem;
    }

    public JTextField getjTextFieldDescricaoItemPesquisarItem() {
        return jTextFieldDescricaoItemPesquisarItem;
    }

    public void setjTextFieldDescricaoItemPesquisarItem(JTextField jTextFieldDescricaoItemPesquisarItem) {
        this.jTextFieldDescricaoItemPesquisarItem = jTextFieldDescricaoItemPesquisarItem;
    }

    public JTextField getjTextFieldIdItemPesquisarItem() {
        return jTextFieldIdItemPesquisarItem;
    }

    public void setjTextFieldIdItemPesquisarItem(JTextField jTextFieldIdItemPesquisarItem) {
        this.jTextFieldIdItemPesquisarItem = jTextFieldIdItemPesquisarItem;
    }

    public JTextField getjTextFieldQuantidadeItemPesquisarItem() {
        return jTextFieldQuantidadeItemPesquisarItem;
    }

    public void setjTextFieldQuantidadeItemPesquisarItem(JTextField jTextFieldQuantidadeItemPesquisarItem) {
        this.jTextFieldQuantidadeItemPesquisarItem = jTextFieldQuantidadeItemPesquisarItem;
    }
    
    public String getCaminhoFotoItem() {
        return caminhoFotoItem;
    }

    public void setCaminhoFotoItem(String caminhoFotoItem) {
        this.caminhoFotoItem = caminhoFotoItem;
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
        jLabel6 = new javax.swing.JLabel();
        jTextFieldIdItemPesquisarItem = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldDescricaoItemPesquisarItem = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldQuantidadeItemPesquisarItem = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldCidadeItemPesquisarItem = new javax.swing.JTextField();
        jToggleButtonPesquisarItem = new javax.swing.JToggleButton();
        jToggleButtonVoltarPesquisarItem = new javax.swing.JToggleButton();
        jLabelImagem = new javax.swing.JLabel();
        jTextFieldTipoItemPesquisarItem = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel5.setText("Pesquisar Item");

        jLabel6.setText("Id");

        jLabel2.setText("Tipo de item");

        jLabel1.setText("Digite a descrição do item");

        jLabel3.setText("Quantidade");

        jLabel4.setText("Cidade");

        jToggleButtonPesquisarItem.setText("Pesquisar");
        jToggleButtonPesquisarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonPesquisarItemActionPerformed(evt);
            }
        });

        jToggleButtonVoltarPesquisarItem.setText("Voltar");
        jToggleButtonVoltarPesquisarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonVoltarPesquisarItemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jToggleButtonPesquisarItem, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jToggleButtonVoltarPesquisarItem, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextFieldCidadeItemPesquisarItem)
                            .addComponent(jTextFieldQuantidadeItemPesquisarItem)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldIdItemPesquisarItem, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldTipoItemPesquisarItem))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 219, Short.MAX_VALUE)
                        .addComponent(jLabelImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(269, 269, 269)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextFieldDescricaoItemPesquisarItem, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelImagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(75, 75, 75))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldDescricaoItemPesquisarItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldIdItemPesquisarItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldTipoItemPesquisarItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldQuantidadeItemPesquisarItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCidadeItemPesquisarItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jToggleButtonPesquisarItem)
                            .addComponent(jToggleButtonVoltarPesquisarItem))))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButtonPesquisarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonPesquisarItemActionPerformed
        pesquisarItemController.pesquisaItem();
    }//GEN-LAST:event_jToggleButtonPesquisarItemActionPerformed

    private void jToggleButtonVoltarPesquisarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonVoltarPesquisarItemActionPerformed
        HomeView telaHome = new HomeView(usuario);
        telaHome.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jToggleButtonVoltarPesquisarItemActionPerformed

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
            java.util.logging.Logger.getLogger(PesquisarItemView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PesquisarItemView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PesquisarItemView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PesquisarItemView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PesquisarItemView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelImagem;
    private javax.swing.JTextField jTextFieldCidadeItemPesquisarItem;
    private javax.swing.JTextField jTextFieldDescricaoItemPesquisarItem;
    private javax.swing.JTextField jTextFieldIdItemPesquisarItem;
    private javax.swing.JTextField jTextFieldQuantidadeItemPesquisarItem;
    private javax.swing.JTextField jTextFieldTipoItemPesquisarItem;
    private javax.swing.JToggleButton jToggleButtonPesquisarItem;
    private javax.swing.JToggleButton jToggleButtonVoltarPesquisarItem;
    // End of variables declaration//GEN-END:variables
}