import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author m
 */
public class departementFenetre extends javax.swing.JFrame {

    private Object tableData;
    private int idDep;
    private String nomDep;
    /**
     * Creates new form departementFenetre
     */
    public departementFenetre() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    private void viderChamps(){
        tfID.setText("");
        tfnomDep.setText("");
        tfPrenomDep.setText("");
        tfFiliere.setText("");
        tfID.requestFocus();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        javax.swing.JPanel jPanel2 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
        tfnomDep = new javax.swing.JTextField();
        javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
        tfPrenomDep = new javax.swing.JTextField();
        javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
        tfFiliere = new javax.swing.JTextField();
        javax.swing.JButton btnAjouter = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        tfID = new javax.swing.JTextField();
        javax.swing.JPanel jPanel3 = new javax.swing.JPanel();
        javax.swing.JButton btnModifier = new javax.swing.JButton();
        javax.swing.JButton btnSupprimer = new javax.swing.JButton();
        javax.swing.JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
        tableEtudiants = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LIU");
        setBackground(new java.awt.Color(51, 51, 255));
        setMinimumSize(new java.awt.Dimension(774, 415));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(774, 403));

        jLabel1.setBackground(new java.awt.Color(0, 255, 204));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/group.png"))); // NOI18N
        jLabel1.setText(" Gestion des Departements");

        jPanel2.setBackground(new java.awt.Color(0, 51, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ajouter Etudiant", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(102, 102, 255));
        jPanel2.setOpaque(false);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("idDep");

        tfFiliere.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        btnAjouter.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnAjouter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("nomDep");

        tfnomDep.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        tfPrenomDep.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tfPrenomDep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPrenomDepActionPerformed(evt);
            }
        });

        
        btnAjouter.setText("Ajouter");
        btnAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjouterActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("ID");

        tfID.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tfID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAjouter, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfnomDep, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(tfPrenomDep)
                            .addComponent(tfFiliere)
                            .addComponent(tfID))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfnomDep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfPrenomDep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfFiliere, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAjouter, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Liste des Etudiants", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N
        jPanel3.setOpaque(false);

        btnModifier.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnModifier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clear-format.png"))); // NOI18N
        btnModifier.setText("Modifier");
        btnModifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifierActionPerformed(evt);
            }
        });

        btnSupprimer.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSupprimer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bin.png"))); // NOI18N
        btnSupprimer.setText("Supprimer");
        btnSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupprimerActionPerformed(evt);
            }
        });

        tableEtudiants.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "nomDep"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableEtudiants);
        if (tableEtudiants.getColumnModel().getColumnCount() > 0) {
            tableEtudiants.getColumnModel().getColumn(0).setResizable(false);
            tableEtudiants.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(btnModifier, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(btnSupprimer))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnModifier, btnSupprimer});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModifier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSupprimer, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnModifier, btnSupprimer});

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private boolean verifierIDUnique(String id) {
        DefaultTableModel model = (DefaultTableModel) tableEtudiants.getModel();
        for (int i = 0; i < model.getRowCount(); i++) {
            if (model.getValueAt(i, 0).equals(id)) {
                return false; // ID déjà existant
            }
        }
        return true; // ID unique
    }
    
    private void btnAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjouterActionPerformed
        String id = tfID.getText();
        String nomDep = tfnomDep.getText();
        String prenomDep = tfPrenomDep.getText();
        String filiere = tfFiliere.getText();
        
        if (id.isEmpty() || nomDep.isEmpty() || prenomDep.isEmpty() || filiere.isEmpty()){
            JOptionPane.showMessageDialog(this, 
                    "SVP Saisir tous les champs.",
                    "Essayer a nouveau.",
                    JOptionPane.ERROR_MESSAGE);
        } else if (!verifierIDUnique(id)) {
            JOptionPane.showMessageDialog(this, 
                    "L'ID entré existe déjà.",
                    "Essayer a nouveau avec un ID unique.",
                    JOptionPane.ERROR_MESSAGE);
        }
        else{
            DefaultTableModel model = (DefaultTableModel) tableEtudiants.getModel();
            model.addRow(new Object[]{id, nomDep});
            
            String query = "INSERT INTO GestionEtudiants (id, nomDep, prenomDep, filiere) VALUES (?, ?, ?, ?)";
            try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitySystem", "root", "");
            PreparedStatement statement = connection.prepareStatement(query)) {
                
                statement.setString(1, idDep);
                statement.setString(2, nomDep);
                statement.executeUpdate();

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        viderChamps();    
    }//GEN-LAST:event_btnAjouterActionPerformed

    private void tfPrenomDepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPrenomDepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPrenomDepActionPerformed

    private void btnModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifierActionPerformed
        
        int row = tableEtudiants.getSelectedRow();

        if (row < 0) {
            JOptionPane.showMessageDialog(this,
                    "Aucune ligne n'est sélectionnée! SVP sélectionnez une ligne.",
                    "Sélectionnez une ligne.",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            String nomDep = tfnomDep.getText();
            String prenomDep = tfPrenomDep.getText();
            String filiere = tfFiliere.getText();

            if (nomDep.isEmpty() || prenomDep.isEmpty() || filiere.isEmpty()) {
                JOptionPane.showMessageDialog(this,
                        "SVP Saisir tous les champs.",
                        "Essayer à nouveau.",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                DefaultTableModel model = (DefaultTableModel) tableEtudiants.getModel();
                model.setValueAt(idDep, row, 1);
                model.setValueAt(nomDep, row, 2);

                String query = "UPDATE GestionEtudiants SET nomDep=?, prenomDep=?, filiere=? WHERE id=?";
                try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/GestionEtudiants", "root", "");
                     PreparedStatement statement = connection.prepareStatement(query)) {
                    statement.setString(1, idDep);
                    statement.setString(2, nomDep);
                    statement.setInt(4, Integer.parseInt((String) model.getValueAt(row, 0)));
                    int rowsAffected = statement.executeUpdate();
                    if (rowsAffected > 0) {
                        JOptionPane.showMessageDialog(this, "Enregistrement modifié avec succès.");
                    } else {
                        JOptionPane.showMessageDialog(this, "Échec de la modification de l'enregistrement.");
                    }
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(this, "Erreur lors de la modification de l'enregistrement : " + e.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
                }
                viderChamps(); // Vide les champs texte après la modification
            }
        }
    }//GEN-LAST:event_btnModifierActionPerformed

    private void btnSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupprimerActionPerformed
        int row = tableEtudiants.getSelectedRow();

        if (row < 0) {
            JOptionPane.showMessageDialog(this,
                    "Aucune ligne n'est sélectionnée! Veuillez sélectionner une ligne.",
                    "Sélectionnez une ligne",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            DefaultTableModel model = (DefaultTableModel) tableEtudiants.getModel();

            // Récupérer l'ID de la ligne sélectionnée
            String idStr = (String) model.getValueAt(row, 0); // Supposons que l'ID est dans la colonne 0

            // Convertir l'ID en entier
            int id = Integer.parseInt(idStr);

            // Supprimer l'enregistrement de la base de données en utilisant l'ID
            String query = "DELETE FROM GestionEtudiants WHERE id=?";
            try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/GestionEtudiants", "root", "");
                 PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setInt(1, id);
                int rowsAffected = statement.executeUpdate();

                if (rowsAffected > 0) {
                    // Supprimer la ligne sélectionnée du modèle de table uniquement si la suppression dans la base de données a réussi
                    model.removeRow(row);
                    JOptionPane.showMessageDialog(this, "Enregistrement supprimé avec succès de la base de données et de l'interface.");
                } else {
                    JOptionPane.showMessageDialog(this, "Aucun enregistrement n'a été supprimé de la base de données.", "Avertissement", JOptionPane.WARNING_MESSAGE);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Erreur lors de la suppression de l'enregistrement : " + e.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Erreur lors de la conversion de l'ID en entier : " + e.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnSupprimerActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        DefaultTableModel model = (DefaultTableModel) tableEtudiants.getModel();
        Vector<Vector> tableData = model.getDataVector();
        
        try {
            FileOutputStream file = new FileOutputStream("file.bin");
            ObjectOutputStream output = new ObjectOutputStream(file);
            
            output.writeObject(tableData);
            
            output.close();
            file.close();
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        try {
            FileInputStream file = new FileInputStream("file.bin");
            ObjectInputStream input = new ObjectInputStream(file);
            
            Vector<Vector> tableData = (Vector<Vector>)input.readObject();
            
            input.close();
            file.close();
            
            DefaultTableModel model = (DefaultTableModel) tableEtudiants.getModel();
            for(int i=0; i < tableData.size(); i++){
                Vector row = tableData.get(i);
                model.addRow(new Object[] { row.get(0), row.get(1), row.get(2), row.get(3)});
            }
            
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_formWindowOpened

    private void tfIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfIDActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new departementFenetre().setVisible(true);
            }
        });

        try {
            
            Connection cnt = DriverManager.getConnection("jdbc:mysql://localhost:3306/universitySystem","root","");
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            if (cnt != null) {
                System.out.println("Connexion etablie");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTable tableEtudiants;
    private javax.swing.JTextField tfFiliere;
    private javax.swing.JTextField tfID;
    private javax.swing.JTextField tfnomDep;
    private javax.swing.JTextField tfPrenomDep;
    // End of variables declaration//GEN-END:variables
}