package vue;

/**
 * Module 633-1-Programmation - Contrôle continu du 13.01.2018
 * 
 * Application interactive "Classement Coupe de Monde de Ski"
 *
 * @author  NOM:		POSTE:
 */
import java.awt.List;
import metier.Modele;


public class FrmLstSkieurs extends java.awt.Frame {
    
    private Modele modele = new Modele();
    
    public FrmLstSkieurs() {
        initComponents();
        modele.addObserver (new LstSkieursObs(lstSkieurs, lblDiscipline));
        modele.chargerDonnees();//au cas ou on doit recharger etc.
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDiscipline = new java.awt.Label();
        btnLstDisciplines = new java.awt.Button();
        btnTriRang = new java.awt.Button();
        btnTriNom = new java.awt.Button();
        btnTriNationalite = new java.awt.Button();
        lstSkieurs = new java.awt.List();
        rbM = new java.awt.Checkbox();
        rbD = new java.awt.Checkbox();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();

        setTitle("Coupe du Monde de Ski");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        lblDiscipline.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        btnLstDisciplines.setLabel("Liste des Disciplines");
        btnLstDisciplines.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLstDisciplinesActionPerformed(evt);
            }
        });

        btnTriRang.setLabel("Rang");
        btnTriRang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTriRangActionPerformed(evt);
            }
        });

        btnTriNom.setLabel("Nom");
        btnTriNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTriNomActionPerformed(evt);
            }
        });

        btnTriNationalite.setLabel("Nationalité");
        btnTriNationalite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTriNationaliteActionPerformed(evt);
            }
        });

        rbM.setCheckboxGroup(grpSexe);
        rbM.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        rbM.setLabel("Messieurs");
        rbM.setState(true);
        rbM.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbMItemStateChanged(evt);
            }
        });

        rbD.setCheckboxGroup(grpSexe
        );
        rbD.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        rbD.setLabel("Dames");
        rbD.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rmDItemStateChanged(evt);
            }
        });

        label1.setText("Discipline :");

        label2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label2.setText("Sexe :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(lblDiscipline, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLstDisciplines, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lstSkieurs, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnTriRang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTriNationalite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTriNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(rbM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLstDisciplines, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblDiscipline, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnTriRang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTriNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTriNationalite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(lstSkieurs, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        dispose();
    }//GEN-LAST:event_formWindowClosing
    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        System.exit(0);
    }//GEN-LAST:event_formWindowClosed

    private void btnTriRangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTriRangActionPerformed
        // TODO add your handling code here:
        modele.triParRang();
    }//GEN-LAST:event_btnTriRangActionPerformed

    private void btnTriNationaliteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTriNationaliteActionPerformed
        // TODO add your handling code here:
        modele.triParNat();
    }//GEN-LAST:event_btnTriNationaliteActionPerformed

    private void btnTriNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTriNomActionPerformed
        // TODO add your handling code here:
        modele.triParNom();
    }//GEN-LAST:event_btnTriNomActionPerformed

    private void rbMItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbMItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_rbMItemStateChanged

    private void rmDItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rmDItemStateChanged
        // TODO add your handling code here:
        modele.changerSexe(rbM.getState());
    }//GEN-LAST:event_rmDItemStateChanged

    private void btnLstDisciplinesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLstDisciplinesActionPerformed
        // TODO add your handling code here:
        FrmLstDisciplines.getInstance(modele).setVisible(true);
    }//GEN-LAST:event_btnLstDisciplinesActionPerformed
    private java.awt.CheckboxGroup grpSexe = new java.awt.CheckboxGroup();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnLstDisciplines;
    private java.awt.Button btnTriNationalite;
    private java.awt.Button btnTriNom;
    private java.awt.Button btnTriRang;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label lblDiscipline;
    private java.awt.List lstSkieurs;
    private java.awt.Checkbox rbD;
    private java.awt.Checkbox rbM;
    // End of variables declaration//GEN-END:variables
}