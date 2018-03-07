package vue;
import metier.Modele;

public class FrmLstDisciplines extends java.awt.Frame {
    
    private static FrmLstDisciplines frmLstDisciplines = null;
    private static Modele modele;
    
    private FrmLstDisciplines(Modele modele) { //constructeur privé
        this.modele=modele;
        initComponents();
        modele.addObserver(new LstDiscObs(lstDisciplines));
        modele.chargerLstDisc();
    }
    public static FrmLstDisciplines getInstance(Modele modele){ //getInstance publique
        if(frmLstDisciplines == null) {frmLstDisciplines = new FrmLstDisciplines(modele);}
        return frmLstDisciplines;
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lstDisciplines = new java.awt.List();

        setTitle("Disciplines");
        setType(java.awt.Window.Type.UTILITY);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        lstDisciplines.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                lstDisciplinesItemStateChanged(evt);
            }
        });
        lstDisciplines.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lstDisciplinesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lstDisciplines, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lstDisciplines, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_formWindowClosing

    private void lstDisciplinesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lstDisciplinesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lstDisciplinesActionPerformed

    private void lstDisciplinesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_lstDisciplinesItemStateChanged
        // TODO add your handling code here:
        modele.changerDiscipline(lstDisciplines.getSelectedIndex());
    }//GEN-LAST:event_lstDisciplinesItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.List lstDisciplines;
    // End of variables declaration//GEN-END:variables
}