import com.mycompany.medicalcenter.HibernateUtil;

import com.mycompany.medicalcenter.Patient;
import com.mycompany.medicalcenter.Medecin;
import com.mycompany.medicalcenter.Visite;
import java.awt.List;
import java.time.LocalDate;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Session;
import org.hibernate.query.Query;

public class VisiteFrame extends javax.swing.JFrame {

    
    public VisiteFrame() {
        initComponents();
        loadMedecins();
        refreshTable();
        loadPatients();
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
        cbxCodemed = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cbxCodepat = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        DateVisite = new com.toedter.calendar.JDateChooser();
        btnAjouter = new javax.swing.JButton();
        btnModifier = new javax.swing.JButton();
        btnActualiser = new javax.swing.JButton();
        btnSupprimer = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListeVisite = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        searchField = new app.bolivia.swing.JCTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 255, 255));

        jLabel2.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        jLabel2.setText("Codeemp");

        jLabel3.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        jLabel3.setText("Codelieu");

        jLabel4.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        jLabel4.setText("Date");

        btnAjouter.setBackground(new java.awt.Color(51, 204, 0));
        btnAjouter.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAjouter.setForeground(new java.awt.Color(255, 255, 255));
        btnAjouter.setText("AJOUTER");
        btnAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjouterActionPerformed(evt);
            }
        });

        btnModifier.setBackground(new java.awt.Color(102, 0, 102));
        btnModifier.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnModifier.setForeground(new java.awt.Color(255, 255, 255));
        btnModifier.setText("MODIFIER");
        btnModifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifierActionPerformed(evt);
            }
        });

        btnActualiser.setBackground(new java.awt.Color(0, 112, 192));
        btnActualiser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnActualiser.setForeground(new java.awt.Color(255, 255, 255));
        btnActualiser.setText("ANNULER");
        btnActualiser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualiserActionPerformed(evt);
            }
        });

        btnSupprimer.setBackground(new java.awt.Color(204, 0, 0));
        btnSupprimer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSupprimer.setForeground(new java.awt.Color(255, 255, 255));
        btnSupprimer.setText("SUPPRIMER");
        btnSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupprimerActionPerformed(evt);
            }
        });

        ListeVisite.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Employe", "Lieu", "Date"
            }
        ));
        ListeVisite.setSelectionBackground(new java.awt.Color(255, 255, 255));
        ListeVisite.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListeVisiteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ListeVisite);

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Yu Gothic Medium", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("AFFECTATION");

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
                .addContainerGap(815, Short.MAX_VALUE)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(353, 353, 353)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon_search.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbxCodepat, 0, 256, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(cbxCodemed, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DateVisite, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAjouter)
                            .addComponent(btnActualiser))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSupprimer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnModifier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addComponent(jLabel2))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addComponent(jLabel5)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cbxCodemed, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(cbxCodepat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(DateVisite, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnModifier, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAjouter, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSupprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnActualiser, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(75, Short.MAX_VALUE))
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

    private void filterTable() {
    try (Session session = HibernateUtil.getSessionFactory().openSession()) {
        DefaultTableModel model = (DefaultTableModel) ListeVisite.getModel();
        model.setRowCount(0); // Effacer les lignes actuelles

        String searchText = searchField.getText().trim().toLowerCase();
        Query<Visite> query = session.createQuery("FROM Visite", Visite.class);
        var visites = query.getResultList();

        for (Visite v : visites) {
            String nomMedecin = v.getMedecin().getNom().toLowerCase();
            String prenomMedecin = v.getMedecin().getPrenom().toLowerCase();
            String nomPatient = v.getPatient().getNom().toLowerCase();
            String prenomPatient = v.getPatient().getPrenom().toLowerCase();
            String codemed = v.getMedecin().getCodemed().toLowerCase(); // Ajout du codemed
            String codepat = v.getPatient().getCodepat().toLowerCase();

          if (nomMedecin.contains(searchText) || prenomMedecin.contains(searchText) || 
                nomPatient.contains(searchText) || prenomPatient.contains(searchText) ||
                codemed.contains(searchText) || codepat.contains(searchText)) {
                Object[] row = {
                    v.getMedecin().getCodemed(), // Affiche codemed au lieu de nom + prénom
                    v.getPatient().getCodepat(), // Affiche codepat au lieu de nom + prénom
                    v.getDate()                  // Garde la date
                };
                model.addRow(row);
            }
        }
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Erreur lors du filtrage : " + e.getMessage());
    }
}

    
    private void loadMedecins() {
    try (Session session = HibernateUtil.getSessionFactory().openSession()) {
        
        var medecins = session.createQuery("FROM Medecin", Medecin.class).getResultList();
        cbxCodemed.removeAllItems(); // Vider le ComboBox
        for (Medecin m : medecins) {
            cbxCodemed.addItem(m.getCodemed()); // Ajouter les médecins au ComboBox
        }
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Erreur de chargement des employe !");
    }
}
    
    private void loadPatients() {
    try (Session session = HibernateUtil.getSessionFactory().openSession()) {
        var patients = session.createQuery("FROM Patient", Patient.class).getResultList();
        cbxCodepat.removeAllItems();
        for (Patient p : patients) {
            cbxCodepat.addItem(p.getCodepat());
        }
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Erreur de chargement des lieu !");
    }
}


    
    private void refreshTable() {
    try (Session session = HibernateUtil.getSessionFactory().openSession()) {
        DefaultTableModel model = (DefaultTableModel) ListeVisite.getModel(); // Assurez-vous que maTable est votre JTable
        model.setRowCount(0); // Effacer les lignes de la table

        Query<Visite> query = session.createQuery("FROM Visite", Visite.class);
        var visites = query.getResultList();

        for (Visite v : visites) {
            Object[] row = {
                v.getMedecin().getCodemed(),
                v.getPatient().getCodepat(), 
                v.getDate()
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
    
    private void btnAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjouterActionPerformed
       
    try (Session session = HibernateUtil.getSessionFactory().openSession()) {
          session.beginTransaction();

          // Récupérer les codes sélectionnés
          String codemed = (String) cbxCodemed.getSelectedItem();
          String codepat = (String) cbxCodepat.getSelectedItem();

          if (codemed == null || codepat == null) {
              JOptionPane.showMessageDialog(this, "Veuillez sélectionner un employer et un lieu !");
              return;
          }

          // Récupérer les objets Medecin et Patient
          Medecin medecin = session.get(Medecin.class, codemed);
          Patient patient = session.get(Patient.class, codepat);

          if (medecin == null || patient == null) {
              JOptionPane.showMessageDialog(this, "Médecin ou patient introuvable !");
              return;
          }

          // Vérifier et récupérer la date
          if (DateVisite.getDate() == null) {
              JOptionPane.showMessageDialog(this, "Veuillez sélectionner une date !");
              return;
          }
          LocalDate dateVisite = DateVisite.getDate().toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();

          // Créer une nouvelle visite
          Visite visite = new Visite(medecin, patient, dateVisite);

          // Sauvegarde de l'objet
          session.save(visite);
          session.getTransaction().commit();

          JOptionPane.showMessageDialog(this, "Affectation ajoutée avec succès !");
          refreshTable();
          
          // Pas de champs texte à vider ici, mais on peut réinitialiser les composants si besoin
        cbxCodemed.setSelectedIndex(-1);
        cbxCodepat.setSelectedIndex(-1);
        DateVisite.setDate(null);
      } catch (Exception e) {
          e.printStackTrace();
          JOptionPane.showMessageDialog(this, "Erreur lors de l'ajout de l'affectation : " + e.getMessage());
      }
    }//GEN-LAST:event_btnAjouterActionPerformed

    private void btnActualiserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualiserActionPerformed

        cbxCodemed.setSelectedIndex(-1);
        cbxCodepat.setSelectedIndex(-1);
        DateVisite.setDate(null);
    }//GEN-LAST:event_btnActualiserActionPerformed

    private void btnModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifierActionPerformed
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
        session.beginTransaction();

        // Récupérer la ligne sélectionnée dans la JTable
        int selectedRow = ListeVisite.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Veuillez sélectionner une affectation  à modifier !");
            return;
        }

        // Récupérer l'ID de la visite à partir de la JTable (on suppose que l'ID est dans une colonne cachée ou dérivable)
        // Si l'ID n'est pas affiché, vous devez l'ajouter au modèle ou le récupérer autrement
        DefaultTableModel model = (DefaultTableModel) ListeVisite.getModel();
        String codemedFromTable = (String) model.getValueAt(selectedRow, 0); // Colonne "Codemed"
        String codepatFromTable = (String) model.getValueAt(selectedRow, 1); // Colonne "Codepat"
        LocalDate dateFromTable = (LocalDate) model.getValueAt(selectedRow, 2); // Colonne "Date"

        // Rechercher la visite correspondante dans la base de données
        Query<Visite> query = session.createQuery(
            "FROM Visite v WHERE v.medecin.codemed = :codemed AND v.patient.codepat = :codepat AND v.date = :date", 
            Visite.class
        );
        query.setParameter("codemed", codemedFromTable);
        query.setParameter("codepat", codepatFromTable);
        query.setParameter("date", dateFromTable);
        Visite visite = query.uniqueResult();

        if (visite != null) { // Vérifie si la visite existe
            // Récupérer les nouvelles valeurs depuis l'interface
            String newCodemed = (String) cbxCodemed.getSelectedItem();
            String newCodepat = (String) cbxCodepat.getSelectedItem();
            
            if (newCodemed == null || newCodepat == null) {
                JOptionPane.showMessageDialog(this, "Veuillez sélectionner un employer et un lieu !");
                return;
            }

            if (DateVisite.getDate() == null) {
                JOptionPane.showMessageDialog(this, "Veuillez sélectionner une date !");
                return;
            }
            LocalDate newDate = DateVisite.getDate().toInstant()
                .atZone(java.time.ZoneId.systemDefault())
                .toLocalDate();

            // Récupérer les objets Medecin et Patient à partir des nouveaux codes
            Medecin newMedecin = session.get(Medecin.class, newCodemed);
            Patient newPatient = session.get(Patient.class, newCodepat);

            if (newMedecin == null || newPatient == null) {
                JOptionPane.showMessageDialog(this, "emplyer ou lieu introuvable !");
                return;
            }

            // Modifier les valeurs de la visite
            visite.setMedecin(newMedecin);
            visite.setPatient(newPatient);
            visite.setDate(newDate);

            // Mise à jour en base
            session.update(visite);
            session.getTransaction().commit();

            JOptionPane.showMessageDialog(this, "affectation modifiée avec succès !");
            refreshTable(); // Mise à jour de la JTable
            // Pas de champs texte à vider ici, mais on peut réinitialiser les composants si besoin
            cbxCodemed.setSelectedIndex(-1);
            cbxCodepat.setSelectedIndex(-1);
            DateVisite.setDate(null);
        } else {
            JOptionPane.showMessageDialog(this, "Affectation introuvable !");
        }
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Erreur lors de la modification : " + e.getMessage());
    }
    }//GEN-LAST:event_btnModifierActionPerformed

    private void btnSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupprimerActionPerformed
        

    int selectedRow = ListeVisite.getSelectedRow(); // Vérifie si une ligne est sélectionnée
      if (selectedRow == -1) {
          JOptionPane.showMessageDialog(this, "Veuillez sélectionner une affectation à supprimer.");
          return;
      }

      int confirmation = JOptionPane.showConfirmDialog(this, "Voulez-vous vraiment supprimer cette affectation ?", "Confirmation", JOptionPane.YES_NO_OPTION);

      if (confirmation == JOptionPane.YES_OPTION) {
          try (Session session = HibernateUtil.getSessionFactory().openSession()) {
              session.beginTransaction();

              // Récupérer les valeurs de la ligne sélectionnée
              DefaultTableModel model = (DefaultTableModel) ListeVisite.getModel();
              String codemed = model.getValueAt(selectedRow, 0).toString(); // Colonne "Codemed"
              String codepat = model.getValueAt(selectedRow, 1).toString(); // Colonne "Codepat"
              LocalDate date = (LocalDate) model.getValueAt(selectedRow, 2); // Colonne "Date"

              // Rechercher la visite correspondante dans la base de données
              Query<Visite> query = session.createQuery(
                  "FROM Visite v WHERE v.medecin.codemed = :codemed AND v.patient.codepat = :codepat AND v.date = :date", 
                  Visite.class
              );
              query.setParameter("codemed", codemed);
              query.setParameter("codepat", codepat);
              query.setParameter("date", date);
              Visite visite = query.uniqueResult();

              if (visite != null) {
                  session.delete(visite); // Suppression en base
                  session.getTransaction().commit();

                  JOptionPane.showMessageDialog(this, "Affectation supprimée avec succès !");
                  refreshTable(); // Mise à jour de la JTable
                  // Pas de champs texte à vider ici, mais on peut réinitialiser les composants si besoin
                  cbxCodemed.setSelectedIndex(-1);
                  cbxCodepat.setSelectedIndex(-1);
                  DateVisite.setDate(null);
              } else {
                  JOptionPane.showMessageDialog(this, "Affectation introuvable !");
              }
          } catch (Exception e) {
              e.printStackTrace();
              JOptionPane.showMessageDialog(this, "Erreur lors de la suppression : " + e.getMessage());
          }
      }
    }//GEN-LAST:event_btnSupprimerActionPerformed

    private void ListeVisiteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListeVisiteMouseClicked
        DefaultTableModel df = (DefaultTableModel) ListeVisite.getModel();
    int selectedIndex = ListeVisite.getSelectedRow();

    if (selectedIndex != -1) { // Vérifie qu'une ligne est bien sélectionnée
        // Récupérer les valeurs de la ligne sélectionnée
        String codemed = df.getValueAt(selectedIndex, 0).toString(); // Colonne "Codemed"
        String codepat = df.getValueAt(selectedIndex, 1).toString(); // Colonne "Codepat"
        LocalDate date = (LocalDate) df.getValueAt(selectedIndex, 2); // Colonne "Date"

        // Mettre à jour les JComboBox
        cbxCodemed.setSelectedItem(codemed); // Sélectionne le code du médecin
        cbxCodepat.setSelectedItem(codepat); // Sélectionne le code du patient

        // Mettre à jour le JDateChooser
        DateVisite.setDate(java.util.Date.from(date.atStartOfDay()
            .atZone(java.time.ZoneId.systemDefault())
            .toInstant()));
    }
    }//GEN-LAST:event_ListeVisiteMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        AccueilFrame af = new AccueilFrame();
        af.setVisible(true);
        dispose();
    }//GEN-LAST:event_exitMouseClicked

   
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
            java.util.logging.Logger.getLogger(VisiteFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VisiteFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VisiteFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VisiteFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VisiteFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DateVisite;
    private javax.swing.JTable ListeVisite;
    private javax.swing.JButton btnActualiser;
    private javax.swing.JButton btnAjouter;
    private javax.swing.JButton btnModifier;
    private javax.swing.JButton btnSupprimer;
    private javax.swing.JComboBox<String> cbxCodemed;
    private javax.swing.JComboBox<String> cbxCodepat;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private app.bolivia.swing.JCTextField searchField;
    // End of variables declaration//GEN-END:variables
}
