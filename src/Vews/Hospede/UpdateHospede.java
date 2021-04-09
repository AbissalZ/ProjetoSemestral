package Vews.Hospede;

import Controller.HospedeDAO;
import Models.Hospede;
import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import javax.accessibility.AccessibleContext;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.JTextField;
import javax.swing.table.TableModel;

public class UpdateHospede extends javax.swing.JFrame {

    /**
     * Creates new form UpdateHospede
     */
    public void ChangeColor(JPanel painel,Color cor){
        painel.setBackground(cor);
    }
    String [] tipoDoc={" ","B.I","Passaporte"};
    public UpdateHospede() {
        initComponents();
        String tDoc[]=new String[tipoDoc.length];
        for(int i=0;i<tipoDoc.length;i++){
            tDoc[i]=tipoDoc[i];
        }
        tipoDocCB.setModel(new javax.swing.DefaultComboBoxModel<>(tDoc));
        this.setLocationRelativeTo(null);
             
    }

    public String[] getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String[] tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public JTextField getIdTf() {
        return IdTf;
    }

    public void setIdTf(JTextField IdTf) {
        this.IdTf = IdTf;
    }

    public JTextField getApelidoTf() {
        return apelidoTf;
    }

    public void setApelidoTf(JTextField apelidoTf) {
        this.apelidoTf = apelidoTf;
    }

    public JLabel getCancel() {
        return cancel;
    }

    public void setCancel(JLabel cancel) {
        this.cancel = cancel;
    }

    public JPanel getCancelButton() {
        return cancelButton;
    }

    public void setCancelButton(JPanel cancelButton) {
        this.cancelButton = cancelButton;
    }

    public JTextField getDataNascimentoTf() {
        return dataNascimentoTf;
    }

    public void setDataNascimentoTf(JTextField dataNascimentoTf) {
        this.dataNascimentoTf = dataNascimentoTf;
    }

    public JLabel getDelete() {
        return delete;
    }

    public void setDelete(JLabel delete) {
        this.delete = delete;
    }

    public JPanel getDeleteButton() {
        return deleteButton;
    }

    public void setDeleteButton(JPanel deleteButton) {
        this.deleteButton = deleteButton;
    }

    public JTextField getEmailTf() {
        return emailTf;
    }

    public void setEmailTf(JTextField emailTf) {
        this.emailTf = emailTf;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel10() {
        return jLabel10;
    }

    public void setjLabel10(JLabel jLabel10) {
        this.jLabel10 = jLabel10;
    }

    public JLabel getjLabel12() {
        return jLabel12;
    }

    public void setjLabel12(JLabel jLabel12) {
        this.jLabel12 = jLabel12;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public JLabel getjLabel5() {
        return jLabel5;
    }

    public void setjLabel5(JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }

    public JLabel getjLabel6() {
        return jLabel6;
    }

    public void setjLabel6(JLabel jLabel6) {
        this.jLabel6 = jLabel6;
    }

    public JLabel getjLabel7() {
        return jLabel7;
    }

    public void setjLabel7(JLabel jLabel7) {
        this.jLabel7 = jLabel7;
    }

    public JLabel getjLabel8() {
        return jLabel8;
    }

    public void setjLabel8(JLabel jLabel8) {
        this.jLabel8 = jLabel8;
    }

    public JLabel getjLabel9() {
        return jLabel9;
    }

    public void setjLabel9(JLabel jLabel9) {
        this.jLabel9 = jLabel9;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JPanel getjPanel2() {
        return jPanel2;
    }

    public void setjPanel2(JPanel jPanel2) {
        this.jPanel2 = jPanel2;
    }

    public JTextField getNacionalidadeTf() {
        return nacionalidadeTf;
    }

    public void setNacionalidadeTf(JTextField nacionalidadeTf) {
        this.nacionalidadeTf = nacionalidadeTf;
    }

    public JTextField getNomeTf() {
        return nomeTf;
    }

    public void setNomeTf(JTextField nomeTf) {
        this.nomeTf = nomeTf;
    }

    public JTextField getNrDocTf() {
        return nrDocTf;
    }

    public void setNrDocTf(JTextField nrDocTf) {
        this.nrDocTf = nrDocTf;
    }

    public JTextField getNumHospedeTf() {
        return numHospedeTf;
    }

    public void setNumHospedeTf(JTextField numHospedeTf) {
        this.numHospedeTf = numHospedeTf;
    }

    public JTextField getTelefoneTf() {
        return telefoneTf;
    }

    public void setTelefoneTf(JTextField telefoneTf) {
        this.telefoneTf = telefoneTf;
    }

    public JComboBox<String> getTipoDocCB() {
        return tipoDocCB;
    }

    public void setTipoDocCB(JComboBox<String> tipoDocCB) {
        this.tipoDocCB = tipoDocCB;
    }

    public JLabel getUpdate() {
        return update;
    }

    public void setUpdate(JLabel update) {
        this.update = update;
    }

    public JPanel getUpdateButton() {
        return updateButton;
    }

    public void setUpdateButton(JPanel updateButton) {
        this.updateButton = updateButton;
    }

    public JRootPane getRootPane() {
        return rootPane;
    }

    public void setRootPane(JRootPane rootPane) {
        this.rootPane = rootPane;
    }

    public boolean isRootPaneCheckingEnabled() {
        return rootPaneCheckingEnabled;
    }

    public void setRootPaneCheckingEnabled(boolean rootPaneCheckingEnabled) {
        this.rootPaneCheckingEnabled = rootPaneCheckingEnabled;
    }

    public AccessibleContext getAccessibleContext() {
        return accessibleContext;
    }

    public void setAccessibleContext(AccessibleContext accessibleContext) {
        this.accessibleContext = accessibleContext;
    }
   

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
        deleteButton = new javax.swing.JPanel();
        delete = new javax.swing.JLabel();
        cancelButton = new javax.swing.JPanel();
        cancel = new javax.swing.JLabel();
        IdTf = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        updateButton = new javax.swing.JPanel();
        update = new javax.swing.JLabel();
        dataNascimentoTf = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        numHospedeTf = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(86, 86, 86));

        jLabel1.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("               Actualizar Hospede               ");
        jPanel2.add(jLabel1);

        jLabel2.setFont(new java.awt.Font("Serif", 0, 19)); // NOI18N
        jLabel2.setText("Nome:");

        nomeTf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        apelidoTf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Serif", 0, 19)); // NOI18N
        jLabel3.setText("Apelido:");

        telefoneTf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Serif", 0, 19)); // NOI18N
        jLabel4.setText(" Telefone:");

        emailTf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Serif", 0, 19)); // NOI18N
        jLabel5.setText("Data de Nascimento:");

        jLabel6.setFont(new java.awt.Font("Serif", 0, 19)); // NOI18N
        jLabel6.setText(" Email:");

        jLabel7.setFont(new java.awt.Font("Serif", 0, 19)); // NOI18N
        jLabel7.setText(" Tipo de Documento:");

        tipoDocCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        tipoDocCB.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel8.setFont(new java.awt.Font("Serif", 0, 19)); // NOI18N
        jLabel8.setText("  Nr de Doc:");

        nrDocTf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        nacionalidadeTf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setFont(new java.awt.Font("Serif", 0, 19)); // NOI18N
        jLabel9.setText("Nacionalidade:");

        deleteButton.setBackground(new java.awt.Color(82, 82, 82));
        deleteButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        deleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteButtonMouseExited(evt);
            }
        });

        delete.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("Delete");

        javax.swing.GroupLayout deleteButtonLayout = new javax.swing.GroupLayout(deleteButton);
        deleteButton.setLayout(deleteButtonLayout);
        deleteButtonLayout.setHorizontalGroup(
            deleteButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteButtonLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(delete)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        deleteButtonLayout.setVerticalGroup(
            deleteButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(delete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
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

        IdTf.setForeground(new java.awt.Color(204, 204, 204));
        IdTf.setToolTipText("Clica Enter");
        IdTf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        IdTf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                IdTfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                IdTfFocusLost(evt);
            }
        });
        IdTf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                IdTfKeyPressed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Serif", 0, 19)); // NOI18N
        jLabel12.setText("ID do Hospede a actualizar:");

        updateButton.setBackground(new java.awt.Color(82, 82, 82));
        updateButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        updateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateButtonMouseExited(evt);
            }
        });

        update.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setText("Update");

        javax.swing.GroupLayout updateButtonLayout = new javax.swing.GroupLayout(updateButton);
        updateButton.setLayout(updateButtonLayout);
        updateButtonLayout.setHorizontalGroup(
            updateButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateButtonLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(update)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        updateButtonLayout.setVerticalGroup(
            updateButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(update, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        dataNascimentoTf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel10.setFont(new java.awt.Font("Serif", 0, 19)); // NOI18N
        jLabel10.setText("Numero do Hospede:");

        numHospedeTf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(97, 97, 97)
                                        .addComponent(jLabel3))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(111, 111, 111)
                                            .addComponent(jLabel2))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel6)
                                                .addComponent(jLabel4)
                                                .addComponent(jLabel7))
                                            .addGap(24, 24, 24)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel10)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(numHospedeTf, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(dataNascimentoTf, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(nomeTf, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel12)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(IdTf, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(2, 2, 2)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(222, 222, 222)
                                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(telefoneTf, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(apelidoTf, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(IdTf, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nomeTf, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(apelidoTf, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
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
                    .addComponent(dataNascimentoTf, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(numHospedeTf, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

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
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseClicked
        this.dispose();
    }//GEN-LAST:event_cancelButtonMouseClicked

    private void updateButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateButtonMouseClicked
        Hospede hospede = new Hospede();
        if(nomeTf.getText().isEmpty() || apelidoTf.getText().isEmpty() || emailTf.getText().isEmpty()
               || dataNascimentoTf.getText().isEmpty()||nrDocTf.getText().isEmpty()||nacionalidadeTf.getText().isEmpty()||numHospedeTf.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Por favor, introduza todos dados nos campor de texto!");
       }else{
        hospede.setIdPessoa(Integer.parseInt(IdTf.getText()));
        hospede.setNome(nomeTf.getText());
        hospede.setApelido(apelidoTf.getText());
        hospede.setTelefone(telefoneTf.getText());
        hospede.setEmail(emailTf.getText());
        hospede.setDataNascimento(dataNascimentoTf.getText());
        int index=tipoDocCB.getSelectedIndex();
        hospede.setTipoDeDoc(tipoDoc[index]);        
        hospede.setNrDoc(nrDocTf.getText());
        hospede.setNacionalidade(nacionalidadeTf.getText());
        hospede.setNrHospede(Integer.parseInt(numHospedeTf.getText()));
        new HospedeDAO().update(hospede);
        this.dispose();}
    }//GEN-LAST:event_updateButtonMouseClicked

    private void IdTfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_IdTfFocusGained
        if(IdTf.getText().equals("De seguida clica Enter...")){
            IdTf.setText("");
            IdTf.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_IdTfFocusGained

    private void IdTfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_IdTfFocusLost
        if(IdTf.getText().isEmpty()){
            IdTf.setText("De seguida clica Enter...");
            IdTf.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_IdTfFocusLost

    private void IdTfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IdTfKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            Hospede hospede = new Hospede();
            int id=Integer.parseInt(IdTf.getText());
            hospede= new HospedeDAO().findById(id);
            IdTf.setText(hospede.getIdPessoa().toString());
            nomeTf.setText(hospede.getNome());
            apelidoTf.setText(hospede.getApelido());
            telefoneTf.setText(hospede.getTelefone());
            emailTf.setText(hospede.getEmail());
            String tipDoc=hospede.getTipoDeDoc();
            int index=0;

            for(int i=0;i<tipoDoc.length;i++){
                if(tipDoc.equals(tipoDoc[i])){
                    index=i;
                    break;
                } else {
                }
            }
            tipoDocCB.setSelectedIndex(index);
            nrDocTf.setText(hospede.getNrDoc());
            nacionalidadeTf.setText(hospede.getNacionalidade());
            dataNascimentoTf.setText(hospede.getDataNascimento());
            numHospedeTf.setText(hospede.getNrHospede().toString());
           
        }
    }//GEN-LAST:event_IdTfKeyPressed

    private void deleteButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteButtonMouseEntered
        ChangeColor(deleteButton,new Color(255,255,255));
        delete.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_deleteButtonMouseEntered

    private void deleteButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteButtonMouseExited
        ChangeColor(deleteButton,new Color(82,82,82));
        delete.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_deleteButtonMouseExited

    private void deleteButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteButtonMouseClicked
        new HospedeDAO().remove(Integer.parseInt(IdTf.getText()));
        this.dispose();
    }//GEN-LAST:event_deleteButtonMouseClicked

    private void updateButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateButtonMouseEntered
        ChangeColor(updateButton,new Color(255,255,255));
        update.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_updateButtonMouseEntered

    private void updateButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateButtonMouseExited
        ChangeColor(updateButton,new Color(82,82,82));
        update.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_updateButtonMouseExited

    private void cancelButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseEntered
        ChangeColor(cancelButton,new Color(255,255,255));
        cancel.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_cancelButtonMouseEntered

    private void cancelButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseExited
        ChangeColor(cancelButton,new Color(82,82,82));
        cancel.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_cancelButtonMouseExited

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
            java.util.logging.Logger.getLogger(UpdateHospede.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateHospede.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateHospede.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateHospede.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateHospede().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField IdTf;
    private javax.swing.JTextField apelidoTf;
    private javax.swing.JLabel cancel;
    private javax.swing.JPanel cancelButton;
    private javax.swing.JTextField dataNascimentoTf;
    private javax.swing.JLabel delete;
    private javax.swing.JPanel deleteButton;
    private javax.swing.JTextField emailTf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JTextField numHospedeTf;
    private javax.swing.JTextField telefoneTf;
    private javax.swing.JComboBox<String> tipoDocCB;
    private javax.swing.JLabel update;
    private javax.swing.JPanel updateButton;
    // End of variables declaration//GEN-END:variables
}