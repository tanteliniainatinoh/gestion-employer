import com.mycompany.medicalcenter.HibernateUtil;
import com.mycompany.medicalcenter.Patient;
import java.awt.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Session;
import org.hibernate.query.Query;

public class PatientFrame extends javax.swing.JFrame {

    public PatientFrame() {
        initComponents();
        refreshTable();
        searchField.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            public void insertUpdate(javax.swing.event.DocumentEvent e) {
                filterTable();
            }
            public void removeUpdate(javax.swing.event.DocumentEvent e) {
                filterTable();
            }
            public void changedUpdate(javax.swing.event.DocumentEvent e) {
                filterTable();
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCTextField1 = new app.bolivia.swing.JCTextField();
        jPanel1 = new javax.swing.JPanel();
        codePatField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nomField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        prenomField = new javax.swing.JTextField();
        BtnAjouter = new javax.swing.JButton();
        BtnModifier = new javax.swing.JButton();
        BtnSupprimer = new javax.swing.JButton();
        BtnActualiser = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListePatient = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        searchField = new app.bolivia.swing.JCTextField();
        jLabel7 = new javax.swing.JLabel();

        jCTextField1.setForeground(new java.awt.Color(204, 204, 204));
        jCTextField1.setText("recherche...");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));

        codePatField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codePatFieldActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        jLabel2.setText("Codelieu");

        jLabel3.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        jLabel3.setText("Designation");

        jLabel4.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        jLabel4.setText("Province");

        BtnAjouter.setBackground(new java.awt.Color(51, 204, 0));
        BtnAjouter.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnAjouter.setForeground(new java.awt.Color(255, 255, 255));
        BtnAjouter.setText("AJOUTER");
        BtnAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAjouterActionPerformed(evt);
            }
        });

        BtnModifier.setBackground(new java.awt.Color(102, 0, 102));
        BtnModifier.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnModifier.setForeground(new java.awt.Color(255, 255, 255));
        BtnModifier.setText("MODIFIER");
        BtnModifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModifierActionPerformed(evt);
            }
        });

        BtnSupprimer.setBackground(new java.awt.Color(204, 0, 0));
        BtnSupprimer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnSupprimer.setForeground(new java.awt.Color(255, 255, 255));
        BtnSupprimer.setText("SUPPRIMER");
        BtnSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSupprimerActionPerformed(evt);
            }
        });

        BtnActualiser.setBackground(new java.awt.Color(0, 112, 192));
        BtnActualiser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnActualiser.setForeground(new java.awt.Color(255, 255, 255));
        BtnActualiser.setText("ANNULER");
        BtnActualiser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnActualiserActionPerformed(evt);
            }
        });

        ListePatient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "codelieu", "Designation", "Province"
            }
        ));
        ListePatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListePatientMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ListePatient);
        if (ListePatient.getColumnModel().getColumnCount() > 0) {
            ListePatient.getColumnModel().getColumn(0).setResizable(false);
            ListePatient.getColumnModel().getColumn(1).setResizable(false);
            ListePatient.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LIEU");

        exit.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 0, 0));
        exit.setText("X");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(353, 353, 353)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exit)
                .addGap(4, 4, 4)
                .addComponent(jLabel1)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        searchField.setText("recherche...");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_search.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prenomField)
                    .addComponent(nomField)
                    .addComponent(codePatField)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(BtnActualiser, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                            .addComponent(BtnAjouter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BtnModifier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnSupprimer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(searchField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel2)
                        .addGap(29, 29, 29)
                        .addComponent(codePatField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(nomField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(prenomField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnAjouter, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnModifier, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnActualiser, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnSupprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 839, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 577, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void filterTable() {
    try (Session session = HibernateUtil.getSessionFactory().openSession()) {
        DefaultTableModel model = (DefaultTableModel) ListePatient.getModel();
        model.setRowCount(0); // Effacer les lignes actuelles

        String searchText = searchField.getText().trim().toLowerCase();
        Query<Patient> query = session.createQuery("FROM Patient", Patient.class);
        var patients = query.getResultList();

        for (Patient p : patients) {
            if (p.getCodepat().toLowerCase().contains(searchText) || 
                p.getNom().toLowerCase().contains(searchText)) {
                Object[] row = {
                    p.getCodepat(),
                    p.getNom(),
                    p.getPrenom(),
                    
                };
                model.addRow(row);
            }
        }
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Erreur lors du filtrage : " + e.getMessage());
    }
}
    
    private void refreshTable() {
    try (Session session = HibernateUtil.getSessionFactory().openSession()) {
        DefaultTableModel model = (DefaultTableModel) ListePatient.getModel(); // Assurez-vous que maTable est votre JTable
        model.setRowCount(0); // Effacer les lignes de la table

        Query<Patient> query = session.createQuery("FROM Patient", Patient.class);
        var patients = query.getResultList();

        for (Patient p : patients) {
            Object[] row = {
                p.getCodepat(),
                p.getNom(),
                p.getPrenom(),
                
            };
            model.addRow(row); // Ajouter la ligne au modèle
        }
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Erreur lors du rafraîchissement : " + e.getMessage());
    }
    searchField.setText(""); // Réinitialiser le champ de recherche
    filterTable(); // Appeler la méthode de filtrage
}

    
    private void BtnAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAjouterActionPerformed
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
        session.beginTransaction();
        
        Patient p = new Patient(
            codePatField.getText(),
            nomField.getText(),
            prenomField.getText()
            
        );

        session.save(p);
        session.getTransaction().commit();

        JOptionPane.showMessageDialog(this, "Lieu ajouté !");
        
        refreshTable(); // 🔴 Mise à jour de la JTable après l'ajout
        
        codePatField.setText("");
        nomField.setText("");
        prenomField.setText("");
        
       

    } catch (org.hibernate.exception.ConstraintViolationException e) {
        // Gestion spécifique de la violation de contrainte unique
        JOptionPane.showMessageDialog(this, 
            "Erreur : Le code lieu " + codePatField.getText() + " existe déjà !", 
            "Erreur de duplication", 
            JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BtnAjouterActionPerformed

    private void BtnActualiserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnActualiserActionPerformed
        codePatField.setText("");
        nomField.setText("");
        prenomField.setText("");
        
    }//GEN-LAST:event_BtnActualiserActionPerformed

    private void ListePatientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListePatientMouseClicked
        DefaultTableModel Df = (DefaultTableModel)ListePatient.getModel();
        int selectedIindex = ListePatient.getSelectedRow();

        codePatField.setText(Df.getValueAt(selectedIindex, 0).toString());
        nomField.setText(Df.getValueAt(selectedIindex, 1).toString());
        prenomField.setText(Df.getValueAt(selectedIindex, 2).toString());
        
    }//GEN-LAST:event_ListePatientMouseClicked

    private void BtnModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModifierActionPerformed
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
        session.beginTransaction();

        // Récupérer le patient à modifier via son Codepat
        String codepat = codePatField.getText();
        Patient p = session.get(Patient.class, codepat);

        if (p != null) { // Vérifie si le patient existe
            // Modifier les valeurs
            p.setNom(nomField.getText());
            p.setPrenom(prenomField.getText());
           
           

            session.update(p); // Mise à jour en base
            session.getTransaction().commit();

            JOptionPane.showMessageDialog(this, "Lieu modifié avec succès !");
            refreshTable(); // 🔄 Mise à jour de la JTable
            
            codePatField.setText("");
            nomField.setText("");
            prenomField.setText("");
            
        } else {
            JOptionPane.showMessageDialog(this, "Lieu introuvable !");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Erreur : " + e.getMessage());
    }
    }//GEN-LAST:event_BtnModifierActionPerformed

    private void BtnSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSupprimerActionPerformed
        int selectedRow = ListePatient.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Veuillez sélectionner un lieu à supprimer.");
        return;
    }

    int confirmation = JOptionPane.showConfirmDialog(this, "Voulez-vous vraiment supprimer ce lieu ?", "Confirmation", JOptionPane.YES_NO_OPTION);

    if (confirmation == JOptionPane.YES_OPTION) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();

            // Récupérer le code du patient sélectionné
            String codepat = ListePatient.getValueAt(selectedRow, 0).toString();
            Patient p = session.get(Patient.class, codepat);

            if (p != null) {
                // Supprimer d'abord les visites associées
                Query query = session.createQuery("DELETE FROM Visite WHERE patient.codepat = :codepat");
                query.setParameter("codepat", codepat);
                query.executeUpdate();

                // Ensuite, supprimer le patient
                session.delete(p);
                session.getTransaction().commit();

                JOptionPane.showMessageDialog(this, "Lieu supprimé avec succès !");
                refreshTable();
                codePatField.setText("");
                nomField.setText("");
                prenomField.setText("");
                
            } else {
                JOptionPane.showMessageDialog(this, "Lieu introuvable !");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erreur : " + e.getMessage());
        }
    }
    }//GEN-LAST:event_BtnSupprimerActionPerformed

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        AccueilFrame af = new AccueilFrame();
        af.setVisible(true);
        dispose();
    }//GEN-LAST:event_exitMouseClicked

    private void codePatFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codePatFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codePatFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnActualiser;
    private javax.swing.JButton BtnAjouter;
    private javax.swing.JButton BtnModifier;
    private javax.swing.JButton BtnSupprimer;
    private javax.swing.JTable ListePatient;
    private javax.swing.JTextField codePatField;
    private javax.swing.JLabel exit;
    private app.bolivia.swing.JCTextField jCTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nomField;
    private javax.swing.JTextField prenomField;
    private app.bolivia.swing.JCTextField searchField;
    // End of variables declaration//GEN-END:variables

}
