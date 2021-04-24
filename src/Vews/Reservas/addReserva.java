package Vews.Reservas;

import Controller.HospedeDAO;
import Controller.QuartoDAO;
import Controller.ReservasDAO;
import Models.Hospede;
import Models.Quarto;
import Models.Reservas;
import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import java.awt.Dimension;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class addReserva extends javax.swing.JFrame {
    
    List <Quarto> quartos= new QuartoDAO().findAll();
    public addReserva() {
        initComponents();
        setmodel();
        
        String quarto  []=new String[quartos.size()];
        
        for(int i=0;i<quartos.size();i++){
            quarto[i]="Id: "+quartos.get(i).getIdQuarto()+" "+quartos.get(i).getTipo()+" "+quartos.get(i).getStatus()+" "+
                    quartos.get(i).getDisp();
        }
        quartoCB.setModel( new javax.swing.DefaultComboBoxModel<>(quarto));
        
    }
    
    public void ChangeColor(JPanel painel,Color cor){
        painel.setBackground(cor);
    }
    
    DefaultListModel df = new DefaultListModel();
    public void setmodel(){
      HospedeDAO dao = new HospedeDAO();
      List<Hospede> list=dao.findAll();
      for(int i=0;i<new HospedeDAO().findAll().size();i++){ 
          
          df.add(0 ,"Id: "+list.get(i).getIdPessoa()+" Nome: "+list.get(i).getNome()+" "+list.get(i).getApelido());
            
      }  
      listaHospedes.setModel(df);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tempoEstadiaTf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        saveButton = new javax.swing.JPanel();
        save = new javax.swing.JLabel();
        cancelButton = new javax.swing.JPanel();
        cancel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        hospedeTf = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        pagamentoCB = new javax.swing.JCheckBox();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaHospedes = new javax.swing.JList<>();
        quartoCB = new javax.swing.JComboBox<>();
        dataChegadaDc = new com.toedter.calendar.JDateChooser();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(898, 462));

        jPanel2.setBackground(new java.awt.Color(86, 86, 86));

        jLabel1.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("               Registo de Reserva               ");
        jPanel2.add(jLabel1);

        jLabel2.setFont(new java.awt.Font("Serif", 0, 19)); // NOI18N
        jLabel2.setText("Data de Chegada:");

        tempoEstadiaTf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tempoEstadiaTf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tempoEstadiaTfKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Serif", 0, 19)); // NOI18N
        jLabel4.setText(" Tempo de Estadia:");

        jLabel6.setFont(new java.awt.Font("Serif", 0, 19)); // NOI18N
        jLabel6.setText("Pagamento:");

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

        jLabel5.setFont(new java.awt.Font("Serif", 0, 19)); // NOI18N
        jLabel5.setText("Hospede:");

        hospedeTf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        hospedeTf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                hospedeTfFocusGained(evt);
            }
        });
        hospedeTf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                hospedeTfKeyPressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Serif", 0, 19)); // NOI18N
        jLabel8.setText("Quarto:");

        jPanel6.setBackground(new java.awt.Color(86, 86, 86));
        jPanel6.setPreferredSize(new java.awt.Dimension(393, 42));

        jLabel10.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Lista de Hopedes");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(103, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jScrollPane2.setViewportView(listaHospedes);

        quartoCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        dataChegadaDc.setDateFormatString("dd/mm/yyy");
        dataChegadaDc.setIcon(new ImageIcon(getClass().getResource("/Images/icons8_calendar_27px_1.png")));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dataChegadaDc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(15, 15, 15)
                                        .addComponent(tempoEstadiaTf, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(59, 59, 59)
                                        .addComponent(jLabel6)
                                        .addGap(15, 15, 15)
                                        .addComponent(pagamentoCB))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(160, 160, 160)
                                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(15, 15, 15)
                                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(74, 74, 74)
                                                .addComponent(jLabel5))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(89, 89, 89)
                                                .addComponent(jLabel8)))
                                        .addGap(15, 15, 15)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(quartoCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(hospedeTf, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(145, 145, 145)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(dataChegadaDc, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel4))
                            .addComponent(tempoEstadiaTf, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(pagamentoCB))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel5))
                            .addComponent(hospedeTf, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(quartoCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE))))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hospedeTfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hospedeTfKeyPressed

    }//GEN-LAST:event_hospedeTfKeyPressed

    private void hospedeTfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_hospedeTfFocusGained
        
    }//GEN-LAST:event_hospedeTfFocusGained

    private void cancelButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseExited
        ChangeColor(cancelButton,new Color(82,82,82));
        cancel.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_cancelButtonMouseExited

    private void cancelButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseEntered
        ChangeColor(cancelButton,new Color(255,255,255));
        cancel.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_cancelButtonMouseEntered

    private void cancelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseClicked
        this.dispose();
    }//GEN-LAST:event_cancelButtonMouseClicked

    private void saveButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveButtonMouseExited
        ChangeColor(saveButton,new Color(82,82,82));
        save.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_saveButtonMouseExited

    private void saveButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveButtonMouseEntered
        ChangeColor(saveButton,new Color(255,255,255));
        save.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_saveButtonMouseEntered

    private void saveButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveButtonMouseClicked
        if(tempoEstadiaTf.getText().isEmpty()
            ||hospedeTf.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor, introduza todos dados nos campor de texto!");
        }else{
            Reservas reserva = new Reservas();
            int codRes=(int)(10000+Math.random()* (10000-1000+1));
            reserva.setCodReserva(codRes);
            SimpleDateFormat sdf1 = new SimpleDateFormat("dd/mm/yyy"); 
            reserva.setDataChegada(sdf1.format(dataChegadaDc.getDate()));//dataChegadaTf.getText()
            Date data = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyy"); 
            reserva.setDataReserva(sdf.format(data));//dataResTf.getText()
            reserva.setTempoEstadia(Integer.parseInt(tempoEstadiaTf.getText()));
            if(pagamentoCB.equals(true)){
                reserva.setPagamento(true);
            }else{
                reserva.setPagamento(false);
            }
            Hospede hp = new Hospede();
            hp.setIdPessoa(Integer.parseInt(hospedeTf.getText()));
            reserva.setHospede(hp);
            int index=quartoCB.getSelectedIndex()+1;
            Quarto qt = new Quarto();
            qt.setIdQuarto(index);
            reserva.setQuartos(qt);
            if(reserva.isPagamento()) {
                reserva.setEstado("Activa");
            } else {
                reserva.setEstado("Standby");
            }
            new ReservasDAO().save(reserva);
            this.dispose();

        }
    }//GEN-LAST:event_saveButtonMouseClicked

    private void tempoEstadiaTfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tempoEstadiaTfKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            hospedeTf.requestFocus();
        }
    }//GEN-LAST:event_tempoEstadiaTfKeyPressed

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
            java.util.logging.Logger.getLogger(addReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addReserva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cancel;
    private javax.swing.JPanel cancelButton;
    private com.toedter.calendar.JDateChooser dataChegadaDc;
    private javax.swing.JTextField hospedeTf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listaHospedes;
    private javax.swing.JCheckBox pagamentoCB;
    private javax.swing.JComboBox<String> quartoCB;
    private javax.swing.JLabel save;
    private javax.swing.JPanel saveButton;
    private javax.swing.JTextField tempoEstadiaTf;
    // End of variables declaration//GEN-END:variables
}
