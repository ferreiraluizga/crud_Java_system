package view;

import controller.DesenvolvedorController;
import dao.ExceptionDAO;
import model.Desenvolvedor;

public class RelatorioDev extends javax.swing.JFrame {

    public RelatorioDev() {
        initComponents();
    }
    
    public RelatorioDev(int id) throws ExceptionDAO {
        initComponents();
        consulta(id);
    }
    
    private void consulta(int id) throws ExceptionDAO{
        Desenvolvedor desenvolvedor = DesenvolvedorController.consultarDev(id);
        
        lblTitulo.setText("Desenvolvedor: " + desenvolvedor.getNome());

        txtNome.setText(desenvolvedor.getNome());
        txtNascimento.setText(desenvolvedor.getNascimento());
        txtGenero.setText(desenvolvedor.getGenero());
        txtEstadoCivil.setText(desenvolvedor.getEstadoCivil());
        txtAreas.setText(desenvolvedor.getAreas());
        txtCep.setText(desenvolvedor.getCep());
        txtEndereco.setText(desenvolvedor.getEndereco());
        txtBairro.setText(desenvolvedor.getBairro());
        txtComplemento.setText(desenvolvedor.getComplemento());
        txtEstado.setText(desenvolvedor.getEstado());
        txtCidade.setText(desenvolvedor.getCidade());
        txtCelular.setText(desenvolvedor.getCelular());
        txtTelefone.setText(desenvolvedor.getTelefone());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblNascimento = new javax.swing.JLabel();
        lblGenero = new javax.swing.JLabel();
        lblEstadoCivil = new javax.swing.JLabel();
        lblAreas = new javax.swing.JLabel();
        lblCep = new javax.swing.JLabel();
        lblEndereco = new javax.swing.JLabel();
        lblBairro = new javax.swing.JLabel();
        lblComplemento = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        lblCidade = new javax.swing.JLabel();
        lblCelular = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtNascimento = new javax.swing.JTextField();
        txtGenero = new javax.swing.JTextField();
        txtEstadoCivil = new javax.swing.JTextField();
        txtAreas = new javax.swing.JTextField();
        txtCep = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        txtComplemento = new javax.swing.JTextField();
        txtEstado = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta Avançada");
        setResizable(false);

        lblTitulo.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Desenvolvedor:");

        lblNome.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblNome.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblNome.setText("Nome Completo:");

        lblNascimento.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblNascimento.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblNascimento.setText("Data de Nascimento:");

        lblGenero.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblGenero.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblGenero.setText("Gênero:");

        lblEstadoCivil.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblEstadoCivil.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblEstadoCivil.setText("Estado Civil:");

        lblAreas.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblAreas.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblAreas.setText("Áreas de Atuação:");

        lblCep.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblCep.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCep.setText("CEP:");

        lblEndereco.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblEndereco.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblEndereco.setText("Endereço:");

        lblBairro.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblBairro.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblBairro.setText("Bairro:");

        lblComplemento.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblComplemento.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblComplemento.setText("Complemento:");

        lblEstado.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblEstado.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblEstado.setText("Estado:");

        lblCidade.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblCidade.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCidade.setText("Cidade:");

        lblCelular.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblCelular.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblCelular.setText("Celular:");

        lblTelefone.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblTelefone.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblTelefone.setText("Telefone:");

        txtNome.setEditable(false);
        txtNome.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        txtNascimento.setEditable(false);
        txtNascimento.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        txtGenero.setEditable(false);
        txtGenero.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        txtEstadoCivil.setEditable(false);
        txtEstadoCivil.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        txtAreas.setEditable(false);
        txtAreas.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        txtCep.setEditable(false);
        txtCep.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        txtEndereco.setEditable(false);
        txtEndereco.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        txtBairro.setEditable(false);
        txtBairro.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        txtComplemento.setEditable(false);
        txtComplemento.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        txtEstado.setEditable(false);
        txtEstado.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        txtCidade.setEditable(false);
        txtCidade.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        txtCelular.setEditable(false);
        txtCelular.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        txtTelefone.setEditable(false);
        txtTelefone.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 809, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNascimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblGenero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblEstadoCivil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblAreas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblBairro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblComplemento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblEstado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCelular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome)
                            .addComponent(txtNascimento)
                            .addComponent(txtGenero)
                            .addComponent(txtEstadoCivil)
                            .addComponent(txtAreas)
                            .addComponent(txtCep)
                            .addComponent(txtEndereco)
                            .addComponent(txtBairro)
                            .addComponent(txtComplemento)
                            .addComponent(txtEstado)
                            .addComponent(txtCidade)
                            .addComponent(txtCelular)
                            .addComponent(txtTelefone))))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNascimento)
                    .addComponent(txtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGenero)
                    .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstadoCivil)
                    .addComponent(txtEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAreas)
                    .addComponent(txtAreas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCep)
                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEndereco)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBairro)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblComplemento)
                    .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstado)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCidade)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCelular)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefone)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(RelatorioDev.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RelatorioDev.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RelatorioDev.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RelatorioDev.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RelatorioDev().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblAreas;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblCep;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblComplemento;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblEstadoCivil;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblNascimento;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtAreas;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtEstadoCivil;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtNascimento;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
