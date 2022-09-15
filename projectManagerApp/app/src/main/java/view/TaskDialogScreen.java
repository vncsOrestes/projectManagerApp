/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import controller.TaskController;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import model.Project;
import model.Task;

/**
 *
 * @author vinicius.santos
 */
public class TaskDialogScreen extends javax.swing.JDialog {

    TaskController controller;
    Project project;

    public TaskDialogScreen(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        controller = new TaskController();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1Toolbar = new javax.swing.JPanel();
        jLabel1ToolbarTitle = new javax.swing.JLabel();
        jLabel2ToolbarSave = new javax.swing.JLabel();
        jPanel2Task = new javax.swing.JPanel();
        jLabel3Name = new javax.swing.JLabel();
        jTextField1Name = new javax.swing.JTextField();
        jLabel4Description = new javax.swing.JLabel();
        jScrollPane1Description = new javax.swing.JScrollPane();
        jTextArea1Description = new javax.swing.JTextArea();
        jLabel5Deadline = new javax.swing.JLabel();
        jScrollPane2Notes = new javax.swing.JScrollPane();
        jTextArea2Notes = new javax.swing.JTextArea();
        jLabel6Notes = new javax.swing.JLabel();
        jFormattedTextField1Deadline = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(445, 620));
        setResizable(false);

        jPanel1Toolbar.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1Toolbar.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1ToolbarTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1ToolbarTitle.setForeground(java.awt.Color.white);
        jLabel1ToolbarTitle.setText("Tarefa");

        jLabel2ToolbarSave.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2ToolbarSave.setIcon(new javax.swing.ImageIcon("C:\\Users\\vinicius.santos\\Documents\\NetBeansProjects\\projectManagerApp\\app\\src\\main\\icons\\diskette.png")); // NOI18N
        jLabel2ToolbarSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2ToolbarSaveMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1ToolbarLayout = new javax.swing.GroupLayout(jPanel1Toolbar);
        jPanel1Toolbar.setLayout(jPanel1ToolbarLayout);
        jPanel1ToolbarLayout.setHorizontalGroup(
            jPanel1ToolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1ToolbarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1ToolbarTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2ToolbarSave, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1ToolbarLayout.setVerticalGroup(
            jPanel1ToolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1ToolbarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1ToolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1ToolbarTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2ToolbarSave, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2Task.setBackground(java.awt.Color.white);

        jLabel3Name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3Name.setText("Nome");

        jTextField1Name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel4Description.setText("Descri��o");

        jTextArea1Description.setColumns(20);
        jTextArea1Description.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextArea1Description.setRows(5);
        jScrollPane1Description.setViewportView(jTextArea1Description);

        jLabel5Deadline.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5Deadline.setText("Prazo");

        jTextArea2Notes.setColumns(20);
        jTextArea2Notes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextArea2Notes.setRows(5);
        jScrollPane2Notes.setViewportView(jTextArea2Notes);

        jLabel6Notes.setText("Notas");

        jFormattedTextField1Deadline.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

        javax.swing.GroupLayout jPanel2TaskLayout = new javax.swing.GroupLayout(jPanel2Task);
        jPanel2Task.setLayout(jPanel2TaskLayout);
        jPanel2TaskLayout.setHorizontalGroup(
            jPanel2TaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2TaskLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2TaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1Name)
                    .addComponent(jLabel3Name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4Description, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1Description)
                    .addComponent(jScrollPane2Notes)
                    .addComponent(jLabel6Notes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5Deadline, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addComponent(jFormattedTextField1Deadline))
                .addGap(15, 15, 15))
        );
        jPanel2TaskLayout.setVerticalGroup(
            jPanel2TaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2TaskLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3Name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4Description)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1Description, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5Deadline)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedTextField1Deadline, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel6Notes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2Notes, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1Toolbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2Task, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1Toolbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2Task, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2ToolbarSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2ToolbarSaveMouseClicked
        // TODO add your handling code here:

        try {
            if (jTextField1Name.getText().isEmpty() || jFormattedTextField1Deadline.getText().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Tarefa n�o cadastrada. Existem campos obrigat�rios para preencher!!!");
            } else {
                Task task = new Task();

                task.setIdProject(project.getId());

                task.setName(jTextField1Name.getText());
                task.setDescription(jTextArea1Description.getText());
                task.setNotes(jTextArea2Notes.getText());
                task.setIsCompleted(false);

                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                Date deadline = null;
                deadline = dateFormat.parse(jFormattedTextField1Deadline.getText());
                task.setDeadline(deadline);

                controller.save(task);
                this.dispose();
                JOptionPane.showMessageDialog(rootPane, "Tarefa salva com sucesso");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }


    }//GEN-LAST:event_jLabel2ToolbarSaveMouseClicked

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
            java.util.logging.Logger.getLogger(TaskDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaskDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaskDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaskDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TaskDialogScreen dialog = new TaskDialogScreen(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField jFormattedTextField1Deadline;
    private javax.swing.JLabel jLabel1ToolbarTitle;
    private javax.swing.JLabel jLabel2ToolbarSave;
    private javax.swing.JLabel jLabel3Name;
    private javax.swing.JLabel jLabel4Description;
    private javax.swing.JLabel jLabel5Deadline;
    private javax.swing.JLabel jLabel6Notes;
    private javax.swing.JPanel jPanel1Toolbar;
    private javax.swing.JPanel jPanel2Task;
    private javax.swing.JScrollPane jScrollPane1Description;
    private javax.swing.JScrollPane jScrollPane2Notes;
    private javax.swing.JTextArea jTextArea1Description;
    private javax.swing.JTextArea jTextArea2Notes;
    private javax.swing.JTextField jTextField1Name;
    // End of variables declaration//GEN-END:variables

    public void setProject(Project project) {
        this.project = project;
    }

}