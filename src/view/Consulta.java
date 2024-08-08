package view;

import controller.DesenvolvedorController;
import dao.ExceptionDAO;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.Desenvolvedor;

public class Consulta extends javax.swing.JFrame {

    public Consulta() throws ExceptionDAO {
        initComponents();
        listarDev();
    }

    private void listarDev() throws ExceptionDAO {
        List<Desenvolvedor> desenvolvedores = DesenvolvedorController.listarDev();

        DefaultTableModel model = (DefaultTableModel) tblDesenvolvedor.getModel();

        model.setRowCount(0);

        int columnSize[] = {10, 200, 100, 300};
        for (int i = 0; i < tblDesenvolvedor.getColumnCount(); i++) {
            tblDesenvolvedor.getColumnModel().getColumn(i).setPreferredWidth(columnSize[i]);
        }

        for (Desenvolvedor dev : desenvolvedores) {
            Object[] row = new Object[4];
            row[0] = dev.getId();
            row[1] = dev.getNome();
            row[2] = dev.getCelular();
            row[3] = dev.getAreas();
            model.addRow(row);
        }
    }

    public void refreshTable() throws ExceptionDAO {
        List<Desenvolvedor> desenvolvedores = DesenvolvedorController.listarDev();

        DefaultTableModel model = (DefaultTableModel) tblDesenvolvedor.getModel();

        model.setRowCount(0);

        int columnSize[] = {10, 200, 100, 300};
        for (int i = 0; i < tblDesenvolvedor.getColumnCount(); i++) {
            tblDesenvolvedor.getColumnModel().getColumn(i).setPreferredWidth(columnSize[i]);
        }

        for (Desenvolvedor dev : desenvolvedores) {
            Object[] row = new Object[4];
            row[0] = dev.getId();
            row[1] = dev.getNome();
            row[2] = dev.getCelular();
            row[3] = dev.getAreas();
            model.addRow(row);
        }
    }

    public int buscarId() {
        int row = tblDesenvolvedor.getSelectedRow();
        if (row != -1) {
            int id = (int) tblDesenvolvedor.getValueAt(row, 0);
            return id;
        } else {
            JOptionPane.showMessageDialog(rootPane, "Selecione uma linha", "Erro", JOptionPane.ERROR_MESSAGE);
            return -1;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDesenvolvedor = new javax.swing.JTable();
        lblId = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnConsulta = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consultar Desenvolvedores");
        setResizable(false);

        lblTitulo.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Consultar Desenvolvedores Cadastrados");

        tblDesenvolvedor.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tblDesenvolvedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Celular", "Áreas de Atuação"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDesenvolvedor);

        lblId.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblId.setText("Insira o ID do desenvolvedor para buscar seu registro no sistema:");

        btnBuscar.setText("Buscar por Id");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnDeletar.setText("Deletar registro selecionado");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar registro selecionado");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnConsulta.setText("Consultar todos os dados do registro");
        btnConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaActionPerformed(evt);
            }
        });

        btnRefresh.setText("Atualizar dados da tabela");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnConsulta)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar)))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeletar)
                    .addComponent(btnEditar)
                    .addComponent(btnConsulta)
                    .addComponent(btnRefresh))
                .addGap(18, 18, 18))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if (txtId.getText().isEmpty()) {
            int id = Integer.parseInt(txtId.getText());

            TableModel model = tblDesenvolvedor.getModel();

            for (int row = 0; row < model.getRowCount(); row++) {
                if (id == (int) model.getValueAt(row, 0)) {
                    tblDesenvolvedor.setRowSelectionInterval(row, row);
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Id não encontrado", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Digite um Id válido", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        int confirm = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja deletar este desenvolvedor?", "Confirmação", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            try {
                if (buscarId() > 0) {
                    DesenvolvedorController.deletarDev(buscarId());
                    JOptionPane.showMessageDialog(null, "Deleção concluída com sucesso!", "Dados do Usuário", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (ExceptionDAO ex) {
                JOptionPane.showMessageDialog(null, "Erro ao deletar: " + ex, "Dados do Usuário", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        try {
            refreshTable();
        } catch (ExceptionDAO ex) {
            JOptionPane.showMessageDialog(null, "Erro ao deletar: " + ex, "Dados do Usuário", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (buscarId() > 0) {
            EditarDev c = new EditarDev(buscarId());
            c.setVisible(true);
        }      
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaActionPerformed
        RelatorioDev c;
        try {
            if (buscarId() > 0) {
                c = new RelatorioDev(buscarId());
                c.setVisible(true);
            }            
        } catch (ExceptionDAO ex) {
            JOptionPane.showMessageDialog(null, "Erro ao editar: " + ex, "Dados do Usuário", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnConsultaActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        try {
            refreshTable();
        } catch (ExceptionDAO ex) {
            JOptionPane.showMessageDialog(null, "Erro ao recarregar: " + ex, "Dados do Usuário", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnRefreshActionPerformed

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
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Consulta().setVisible(true);
                } catch (ExceptionDAO ex) {
                    JOptionPane.showMessageDialog(null, "Erro: " + ex, "Dados do Usuário", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnConsulta;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblDesenvolvedor;
    private javax.swing.JTextField txtId;
    // End of variables declaration//GEN-END:variables
}
