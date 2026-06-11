import com.mycompany.medicalcenter.HibernateUtil;
import com.mycompany.medicalcenter.Medecin;
import java.awt.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Session;
import org.hibernate.query.Query;

public class MedecinFrame extends javax.swing.JFrame {

    
    public MedecinFrame() {
        initComponents();
        refreshTable();
        // Ajouter un DocumentListener pour filtrer en temps réel
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        codeMedField = new app.bolivia.swing.JCTextField();
        jLabel3 = new javax.swing.JLabel();
        nomField = new app.bolivia.swing.JCTextField();
        jLabel4 = new javax.swing.JLabel();
        prenomField = new app.bolivia.swing.JCTextField();
        jLabel5 = new javax.swing.JLabel();
        gradeField = new app.bolivia.swing.JCTextField();
        BtnAjouter = new javax.swing.JButton();
        BtnModifier = new javax.swing.JButton();
        BtnActualiser = new javax.swing.JButton();
        BtnSupprimer = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListeMedecin = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        searchField = new app.bolivia.swing.JCTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 255, 255));

        jLabel2.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        jLabel2.setText("Codeemp");

        jLabel3.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        jLabel3.setText("Nom");

        jLabel4.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        jLabel4.setText("Prénom");

        jLabel5.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        jLabel5.setText("Poste");

        BtnAjouter.setBackground(new java.awt.Color(51, 204, 0));
        BtnAjouter.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnAjouter.setForeground(new java.awt.Color(255, 255, 255));
        BtnAjouter.setText("AJOUTER");
        BtnAjouter.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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

        BtnActualiser.setBackground(new java.awt.Color(0, 112, 192));
        BtnActualiser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnActualiser.setForeground(new java.awt.Color(255, 255, 255));
        BtnActualiser.setText("ANNULER");
        BtnActualiser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnActualiserActionPerformed(evt);
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

        ListeMedecin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codeemp", "Nom", "Prénom", "Poste"
            }
        ));
        ListeMedecin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListeMedecinMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ListeMedecin);

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("EMPLOYE");

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

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_search.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(prenomField, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nomField, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(gradeField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(BtnAjouter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtnActualiser, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(BtnModifier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtnSupprimer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(codeMedField, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 25, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(searchField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(10, 10, 10)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(codeMedField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(nomField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(prenomField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(gradeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnAjouter, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnModifier, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnActualiser, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnSupprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE))
                .addGap(21, 21, 21))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void refreshTable() {
    try (Session session = HibernateUtil.getSessionFactory().openSession()) {
        DefaultTableModel model = (DefaultTableModel) ListeMedecin.getModel(); // Assurez-vous que maTable est votre JTable
        model.setRowCount(0); // Effacer les lignes de la table

        Query<Medecin> query = session.createQuery("FROM Medecin", Medecin.class);
        var medecins = query.getResultList();

        for (Medecin m : medecins) {
            Object[] row = {
                m.getCodemed(),
                m.getNom(),
                m.getPrenom(),
                m.getGrade()
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
    private void filterTable() {
    try (Session session = HibernateUtil.getSessionFactory().openSession()) {
        DefaultTableModel model = (DefaultTableModel) ListeMedecin.getModel();
        model.setRowCount(0); // Effacer les lignes actuelles

        String searchText = searchField.getText().trim().toLowerCase();
        Query<Medecin> query = session.createQuery("FROM Medecin", Medecin.class);
        var medecins = query.getResultList();

        for (Medecin m : medecins) {
            if (m.getCodemed().toLowerCase().contains(searchText) || 
                m.getNom().toLowerCase().contains(searchText)) {
                Object[] row = {
                    m.getCodemed(),
                    m.getNom(),
                    m.getPrenom(),
                    m.getGrade()
                };
                model.addRow(row);
            }
        }
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Erreur lors du filtrage : " + e.getMessage());
    }
}
    
    private void BtnAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAjouterActionPerformed
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();

            Medecin p = new Medecin(
                codeMedField.getText(),
                nomField.getText(),
                prenomField.getText(),
                gradeField.getText()
            );

            session.save(p);
            session.getTransaction().commit();

            JOptionPane.showMessageDialog(this, "Employer ajouté !");

            refreshTable(); // 🔴 Mise à jour de la JTable après l'ajout

            codeMedField.setText("");
            nomField.setText("");
            prenomField.setText("");
            gradeField.setText("");

        } catch (org.hibernate.exception.ConstraintViolationException e) {
        // Gestion spécifique de la violation de contrainte unique
        JOptionPane.showMessageDialog(this, 
            "Erreur : Le code médecin " + codeMedField.getText() + " existe déjà !", 
            "Erreur de duplication", 
            JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BtnAjouterActionPerformed

    private void BtnModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModifierActionPerformed
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();

            // Récupérer le médecin à modifier via son Codepat
            String codemed = codeMedField.getText();
            Medecin m = session.get(Medecin.class, codemed);

            if (m != null) { // Vérifie si le patient existe
                // Modifier les valeurs
                m.setNom(nomField.getText());
                m.setPrenom(prenomField.getText());
                m.setGrade(gradeField.getText());

                session.update(m); // Mise à jour en base
                session.getTransaction().commit();

                JOptionPane.showMessageDialog(this, "Employer modifié avec succès !");
                refreshTable(); // 🔄 Mise à jour de la JTable

                codeMedField.setText("");
                nomField.setText("");
                prenomField.setText("");
                gradeField.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "Employer introuvable !");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erreur : " + e.getMessage());
        }
        
    }//GEN-LAST:event_BtnModifierActionPerformed

    private void BtnActualiserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnActualiserActionPerformed
        codeMedField.setText("");
        nomField.setText("");
        prenomField.setText("");
        gradeField.setText("");
    }//GEN-LAST:event_BtnActualiserActionPerformed

    private void BtnSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSupprimerActionPerformed
        int selectedRow = ListeMedecin.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Veuillez sélectionner un employer à supprimer.");
            return;
        }

        int confirmation = JOptionPane.showConfirmDialog(this, "Voulez-vous vraiment supprimer ce employer ?", "Confirmation", JOptionPane.YES_NO_OPTION);

        if (confirmation == JOptionPane.YES_OPTION) {
            try (Session session = HibernateUtil.getSessionFactory().openSession()) {
                session.beginTransaction();

                // Récupérer le code du médecin sélectionné
                String codemed = ListeMedecin.getValueAt(selectedRow, 0).toString();
                Medecin m = session.get(Medecin.class, codemed);

                if (m != null) {
                    // Supprimer d'abord les visites associées
                    Query query = session.createQuery("DELETE FROM Visite WHERE medecin.codemed = :codemed");
                    query.setParameter("codemed", codemed);
                    query.executeUpdate();

                    // Ensuite, supprimer le médecin
                    session.delete(m);
                    session.getTransaction().commit();

                    JOptionPane.showMessageDialog(this, "Employer supprimé avec succès !");
                    refreshTable();
                    codeMedField.setText("");
                    nomField.setText("");
                    prenomField.setText("");
                    gradeField.setText("");
                } else {
                    JOptionPane.showMessageDialog(this, "Employer introuvable !");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Erreur : " + e.getMessage());
            }
            
        }
    }//GEN-LAST:event_BtnSupprimerActionPerformed

    private void ListeMedecinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListeMedecinMouseClicked
        DefaultTableModel Df = (DefaultTableModel)ListeMedecin.getModel();
        int selectedIindex = ListeMedecin.getSelectedRow();

        codeMedField.setText(Df.getValueAt(selectedIindex, 0).toString());
        nomField.setText(Df.getValueAt(selectedIindex, 1).toString());
        prenomField.setText(Df.getValueAt(selectedIindex, 2).toString());
        gradeField.setText(Df.getValueAt(selectedIindex, 3).toString());
    }//GEN-LAST:event_ListeMedecinMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        AccueilFrame af = new AccueilFrame();
        af.setVisible(true);
        dispose();
    }//GEN-LAST:event_exitMouseClicked

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
            java.util.logging.Logger.getLogger(MedecinFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MedecinFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MedecinFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MedecinFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MedecinFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnActualiser;
    private javax.swing.JButton BtnAjouter;
    private javax.swing.JButton BtnModifier;
    private javax.swing.JButton BtnSupprimer;
    private javax.swing.JTable ListeMedecin;
    private app.bolivia.swing.JCTextField codeMedField;
    private javax.swing.JLabel exit;
    private app.bolivia.swing.JCTextField gradeField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private app.bolivia.swing.JCTextField nomField;
    private app.bolivia.swing.JCTextField prenomField;
    private app.bolivia.swing.JCTextField searchField;
    // End of variables declaration//GEN-END:variables
}
