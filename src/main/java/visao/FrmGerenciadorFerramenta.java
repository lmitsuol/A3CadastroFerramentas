
package visao;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Ferramenta;
/**
 *
 * @author guiho
 */
public class FrmGerenciadorFerramenta extends javax.swing.JFrame {
    private Ferramenta objetoFerramenta;

    /**
     * Creates new form FrmGerenciadorFerramenta
     */
    public FrmGerenciadorFerramenta() {
        initComponents();
        this.objetoFerramenta = new Ferramenta(); //Carrega objetoFerramenta de Ferramenta
        this.carregaTabela();
        this.calculaValorTotal();
    }
 public void calculaValorTotal() {
        double total = 0;
        for (int i = 0; i < JTableFerramenta.getRowCount(); i++) {
            total += Double.parseDouble(JTableFerramenta.getValueAt(i, 3).toString());
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableFerramenta = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JTFNome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        JTFMarca = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        JTFValor = new javax.swing.JTextField();
        JBApagar = new javax.swing.JButton();
        JBEditar = new javax.swing.JButton();
        JBCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setText("Gerenciador de Ferramentas");

        JTableFerramenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Marca", "Valor"
            }
        ));
        JTableFerramenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTableFerramentaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTableFerramenta);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Custo Total:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Nome:");

        JTFNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFNomeActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Marca:");

        JTFMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFMarcaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Valor:");

        JTFValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFValorActionPerformed(evt);
            }
        });

        JBApagar.setText("Apagar");
        JBApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBApagarActionPerformed(evt);
            }
        });

        JBEditar.setText("Editar");
        JBEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBEditarActionPerformed(evt);
            }
        });

        JBCancelar.setText("Cancelar");
        JBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel4)
                                        .addComponent(JTFNome)
                                        .addComponent(jLabel5)
                                        .addComponent(JTFMarca)
                                        .addComponent(jLabel6)
                                        .addComponent(JTFValor, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(94, 94, 94))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(JBApagar)
                                .addGap(18, 18, 18)
                                .addComponent(JBEditar)
                                .addGap(18, 18, 18)
                                .addComponent(JBCancelar)))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(61, 61, 61)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTFMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTFValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JBApagar)
                            .addComponent(JBEditar)
                            .addComponent(JBCancelar)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTFNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFNomeActionPerformed

    private void JTFMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFMarcaActionPerformed

    private void JTFValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFValorActionPerformed

    private void JBApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBApagarActionPerformed
        // TODO add your handling code here:
        try {

            int id = 0;
            String nome = "";
            String marca = "";
            int valor = 0;

            if (this.JTableFerramenta.getSelectedRow() == -1) {
                throw new Mensagem("Selecione uma ferramenta para apagar primeiro");
            } else {
                id = Integer.parseInt(this.JTableFerramenta.getValueAt(this.JTableFerramenta.getSelectedRow(), 0).toString());
            }

            int respostaUsuario = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja apagar este Ferramenta?");

            if (respostaUsuario == 0) {

                if (this.objetoFerramenta.deleteFerramentaBD(id)) {

                    this.JTFNome.setText("");
                    this.JTFMarca.setText("");
                    this.JTFValor.setText("");
                    JOptionPane.showMessageDialog(rootPane, "Ferramenta Apagada com Sucesso.");
                }
            }

            System.out.println(this.objetoFerramenta.getListaFerramenta().toString());
        } catch (Mensagem erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } finally {

            carregaTabela();
        }                                       

    }//GEN-LAST:event_JBApagarActionPerformed

    private void JBEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBEditarActionPerformed
        // TODO add your handling code here:
        try {

            int id = 0;
            String nome = "";
            String marca = "";
            int valor = 0;

            if (this.JTFNome.getText().length() < 1) {
                throw new Mensagem("Nome deve conter ao menos 1 caracteres.");
            } else {
                nome = this.JTFNome.getText();
            }

            if (this.JTFMarca.getText().length() < 1) {
                throw new Mensagem("A marca deve conter ao menos 1 caracteres.");
            } else {
                marca = (this.JTFMarca.getText());
            }
            if (this.JTFValor.getText().length() < 1) {
                throw new Mensagem("O valor deve conter ao menos 1 número.");
            } else {
                valor = Integer.parseInt(this.JTFValor.getText());
            }

            if (this.JTableFerramenta.getSelectedRow() == -1) {
                throw new Mensagem("Escolha uma Ferramenta para Editar Primeiro");
            } else {
                id = Integer.parseInt(this.JTableFerramenta.getValueAt(this.JTableFerramenta.getSelectedRow(), 0).toString());
            }

            if (this.objetoFerramenta.updateFerramentaBD(id, nome, marca, valor)) {

                this.JTFNome.setText("");
                this.JTFMarca.setText("");
                this.JTFValor.setText("");

                JOptionPane.showMessageDialog(null, "Ferramenta Editado com sucesso.");

            }
            System.out.println(this.objetoFerramenta.getListaFerramenta().toString());
        } catch (Mensagem erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Informe um número válido.");
        } finally {
            carregaTabela();
        }
    }//GEN-LAST:event_JBEditarActionPerformed

    private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBCancelarActionPerformed

    private void JTableFerramentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableFerramentaMouseClicked
        // TODO add your handling code here:
        if (this.JTableFerramenta.getSelectedRow() != -1) {
            String nome = this.JTableFerramenta.getValueAt(this.JTableFerramenta.getSelectedRow(), 1).toString();
            String marca = this.JTableFerramenta.getValueAt(this.JTableFerramenta.getSelectedRow(), 2).toString();
            String valor = this.JTableFerramenta.getValueAt(this.JTableFerramenta.getSelectedRow(), 3).toString();

            this.JTFNome.setText(nome);
            this.JTFMarca.setText(marca);
            this.JTFValor.setText(valor);
        }
    }//GEN-LAST:event_JTableFerramentaMouseClicked
public void carregaTabela() {
        DefaultTableModel modelo = (DefaultTableModel) this.JTableFerramenta.getModel();
        modelo.setNumRows(0);
        ArrayList<Ferramenta> minhaLista = objetoFerramenta.getListaFerramenta();
        for (Ferramenta a : minhaLista) {
            modelo.addRow(new Object[]{
                a.getId(),
                a.getNome(),
                a.getMarca(),
                a.getValor(),});
        }
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
            java.util.logging.Logger.getLogger(FrmGerenciadorFerramenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmGerenciadorFerramenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmGerenciadorFerramenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmGerenciadorFerramenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmGerenciadorFerramenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBApagar;
    private javax.swing.JButton JBCancelar;
    private javax.swing.JButton JBEditar;
    private javax.swing.JTextField JTFMarca;
    private javax.swing.JTextField JTFNome;
    private javax.swing.JTextField JTFValor;
    private javax.swing.JTable JTableFerramenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
