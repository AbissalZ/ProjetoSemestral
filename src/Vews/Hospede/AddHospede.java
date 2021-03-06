/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vews.Hospede;

import Controller.HospedeDAO;
import Models.Hospede;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Zita_Office
 */
public class AddHospede extends javax.swing.JFrame {

    /**
     * Creates new form AddHospede
     */
    public void ChangeColor(JPanel painel,Color cor){
        painel.setBackground(cor);
    }
    String [] tipoDoc={" ","B.I","Passaporte"};
    public AddHospede() {
        initComponents();
        this.setLocationRelativeTo( null);
        String tDoc[]=new String[tipoDoc.length];
        System.arraycopy(tipoDoc, 0, tDoc, 0, tipoDoc.length);
        tipoDocCB.setModel(new javax.swing.DefaultComboBoxModel<>(tDoc));
        
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nomeTf = new javax.swing.JTextField();
        apelidoTf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        telefoneTf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        emailTf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tipoDocCB = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        nrDocTf = new javax.swing.JTextField();
        nacionalidadeTf = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        saveButton = new javax.swing.JPanel();
        save = new javax.swing.JLabel();
        cancelButton = new javax.swing.JPanel();
        cancel = new javax.swing.JLabel();
        dataNascimentoTf = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(86, 86, 86));

        jLabel1.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("               Registo de Hospede               ");
        jPanel2.add(jLabel1);

        jLabel2.setFont(new java.awt.Font("Serif", 0, 19)); // NOI18N
        jLabel2.setText("Nome:");

        nomeTf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        nomeTf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nomeTfKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nomeTfKeyTyped(evt);
            }
        });

        apelidoTf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        apelidoTf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                apelidoTfKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apelidoTfKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Serif", 0, 19)); // NOI18N
        jLabel3.setText("Apelido:");

        telefoneTf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        telefoneTf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                telefoneTfKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telefoneTfKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Serif", 0, 19)); // NOI18N
        jLabel4.setText(" Telefone:");

        emailTf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        emailTf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                emailTfKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Serif", 0, 19)); // NOI18N
        jLabel5.setText("Data de Nascimento:");

        jLabel6.setFont(new java.awt.Font("Serif", 0, 19)); // NOI18N
        jLabel6.setText(" Email:");

        jLabel7.setFont(new java.awt.Font("Serif", 0, 19)); // NOI18N
        jLabel7.setText(" Tipo de Documento:");

        tipoDocCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "B.I", "Passaporte" }));
        tipoDocCB.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel8.setFont(new java.awt.Font("Serif", 0, 19)); // NOI18N
        jLabel8.setText("  Nr de Doc:");

        nrDocTf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        nrDocTf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nrDocTfKeyPressed(evt);
            }
        });

        nacionalidadeTf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        nacionalidadeTf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nacionalidadeTfKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nacionalidadeTfKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Serif", 0, 19)); // NOI18N
        jLabel9.setText("Nacionalidade:");

        saveButton.setBackground(new java.awt.Color(82, 82, 82));
        saveButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        saveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                saveButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                saveButtonMouseExited(evt);
            }
        });

        save.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        save.setForeground(new java.awt.Color(255, 255, 255));
        save.setText("Save");

        javax.swing.GroupLayout saveButtonLayout = new javax.swing.GroupLayout(saveButton);
        saveButton.setLayout(saveButtonLayout);
        saveButtonLayout.setHorizontalGroup(
            saveButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(saveButtonLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(save)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        saveButtonLayout.setVerticalGroup(
            saveButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(save, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        cancelButton.setBackground(new java.awt.Color(82, 82, 82));
        cancelButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancelButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancelButtonMouseExited(evt);
            }
        });

        cancel.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        cancel.setForeground(new java.awt.Color(255, 255, 255));
        cancel.setText("Cancel");

        javax.swing.GroupLayout cancelButtonLayout = new javax.swing.GroupLayout(cancelButton);
        cancelButton.setLayout(cancelButtonLayout);
        cancelButtonLayout.setHorizontalGroup(
            cancelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cancelButtonLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(cancel)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        cancelButtonLayout.setVerticalGroup(
            cancelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cancel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        dataNascimentoTf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(111, 111, 111)
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(nomeTf, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel4)
                                .addComponent(jLabel7))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(telefoneTf, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(emailTf, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tipoDocCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(nrDocTf, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(nacionalidadeTf, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(dataNascimentoTf, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(apelidoTf, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nomeTf, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(apelidoTf, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(telefoneTf, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailTf, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipoDocCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(nrDocTf, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(nacionalidadeTf, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(dataNascimentoTf, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseClicked
        this.dispose();
    }//GEN-LAST:event_cancelButtonMouseClicked

    private void saveButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveButtonMouseClicked
       if(nomeTf.getText().isEmpty() || apelidoTf.getText().isEmpty() || emailTf.getText().isEmpty()
               || dataNascimentoTf.getText().isEmpty()||nrDocTf.getText().isEmpty()||nacionalidadeTf.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Por favor, introduza todos dados nos campos de texto!");
       }else{
       String nome=nomeTf.getText().trim();
       String apelido=apelidoTf.getText().trim();
       String telefone=telefoneTf.getText().trim();
       String email=emailTf.getText().trim();
       String dataNascimento=dataNascimentoTf.getText().trim();
       int selectedIndex=tipoDocCB.getSelectedIndex();
       String tipoDeDoc=tipoDoc[selectedIndex];
       String nrDoc=nrDocTf.getText();
       String nacionalidade=nacionalidadeTf.getText();
       int nrHospede=(int)(1000+Math.random()* (10000-1000+1));
       Hospede hospede;
       hospede=new Hospede(nome, apelido ,telefone ,email , dataNascimento, tipoDeDoc, nrDoc, nacionalidade, nrHospede);
       new HospedeDAO().save(hospede);
       this.dispose();}
    }//GEN-LAST:event_saveButtonMouseClicked

    private void saveButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveButtonMouseEntered
        ChangeColor(saveButton,new Color(255,255,255));
        save.setForeground(new Color(0,0,0));
    
    }//GEN-LAST:event_saveButtonMouseEntered

    private void saveButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveButtonMouseExited
        ChangeColor(saveButton,new Color(82,82,82));
        save.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_saveButtonMouseExited

    private void cancelButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseEntered
        ChangeColor(cancelButton,new Color(255,255,255));
        cancel.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_cancelButtonMouseEntered

    private void cancelButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseExited
        ChangeColor(cancelButton,new Color(82,82,82));
        cancel.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_cancelButtonMouseExited

    private void nomeTfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomeTfKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            apelidoTf.requestFocus();
        }
    }//GEN-LAST:event_nomeTfKeyPressed

    private void apelidoTfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apelidoTfKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            telefoneTf.requestFocus();
        }
    }//GEN-LAST:event_apelidoTfKeyPressed

    private void telefoneTfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefoneTfKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            emailTf.requestFocus();
        }
    }//GEN-LAST:event_telefoneTfKeyPressed

    private void emailTfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailTfKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        tipoDocCB.requestFocus();
       }
    }//GEN-LAST:event_emailTfKeyPressed

    private void nrDocTfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nrDocTfKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        nacionalidadeTf.requestFocus();
        }
    }//GEN-LAST:event_nrDocTfKeyPressed

    private void nacionalidadeTfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nacionalidadeTfKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        dataNascimentoTf.requestFocus();
        }
    }//GEN-LAST:event_nacionalidadeTfKeyPressed

    private void nomeTfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomeTfKeyTyped
        char c =evt.getKeyChar();
        if((c<'a' || c>'z')&&(c<'A'||c>'Z')){
            evt.consume();
        }
    }//GEN-LAST:event_nomeTfKeyTyped

    private void apelidoTfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apelidoTfKeyTyped
        char c =evt.getKeyChar();
        if((c<'a' || c>'z')&&(c<'A'||c>'Z')){
            evt.consume();
        }
    }//GEN-LAST:event_apelidoTfKeyTyped

    private void telefoneTfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefoneTfKeyTyped
        char c =evt.getKeyChar();
        if(c<'1' || c>'9'){
            evt.consume();
        }
    }//GEN-LAST:event_telefoneTfKeyTyped

    private void nacionalidadeTfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nacionalidadeTfKeyTyped
        char c =evt.getKeyChar();
        if((c<'a' || c>'z')&&(c<'A'||c>'Z')){
            evt.consume();
        }
    }//GEN-LAST:event_nacionalidadeTfKeyTyped

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
            java.util.logging.Logger.getLogger(AddHospede.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddHospede.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddHospede.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddHospede.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddHospede().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apelidoTf;
    private javax.swing.JLabel cancel;
    private javax.swing.JPanel cancelButton;
    private javax.swing.JTextField dataNascimentoTf;
    private javax.swing.JTextField emailTf;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField nacionalidadeTf;
    private javax.swing.JTextField nomeTf;
    private javax.swing.JTextField nrDocTf;
    private javax.swing.JLabel save;
    private javax.swing.JPanel saveButton;
    private javax.swing.JTextField telefoneTf;
    private javax.swing.JComboBox<String> tipoDocCB;
    // End of variables declaration//GEN-END:variables
}
