package view;

import controller.DesenvolvedorController;
import dao.ExceptionDAO;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;
import model.Desenvolvedor;

public class EditarDev extends javax.swing.JFrame {
    
    public EditarDev() { 
        initComponents();
        formatarCampos();
    }
    
    public EditarDev(int id){
        initComponents();
        formatarCampos();
        try {
            atribuirDadosAtuais(id);
        } catch (ExceptionDAO ex) {
            Logger.getLogger(EditarDev.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void atribuirDadosAtuais(int id) throws ExceptionDAO {
        Desenvolvedor dev = DesenvolvedorController.consultarDev(id);

        txtId.setText(String.valueOf(id));
        txtNome.setText(dev.getNome());
        txtNascimento.setText(dev.getNascimento());
        txtCep.setText(dev.getCep());
        txtEndereco.setText(dev.getEndereco());
        txtBairro.setText(dev.getBairro());
        txtComplemento.setText(dev.getComplemento());
        txtCidade.setText(dev.getCidade());
        txtCelular.setText(dev.getCelular());
        txtTelefone.setText(dev.getTelefone());

        String genero = dev.getGenero();
        if (genero != null) {
            if (genero.equals("Masculino")) {
                rdnMasculino.setSelected(true);
            } else if (genero.equals("Feminino")) {
                rdnFeminino.setSelected(true);
            }
        }

        String areas = dev.getAreas();
        if (areas != null) {
            checkFront.setSelected(areas.contains("Desenvolvedor Front-End"));
            checkBack.setSelected(areas.contains("Desenvolvedor Back-End"));
            checkFull.setSelected(areas.contains("Desenvolvedor Full-Stack"));
            checkDados.setSelected(areas.contains("Engenheiro de Dados"));
            checkAnalista.setSelected(areas.contains("Analista de Sistemas"));
            checkCloud.setSelected(areas.contains("Engenheiro de Cloud"));
        }

        String estadoCivil = dev.getEstadoCivil();
        if (estadoCivil != null) {
            if (estadoCivil.equals("Solteiro(a)")) {
                rdnSolteiro.setSelected(true);
            } else if (estadoCivil.equals("Casado(a)")) {
                rdnCasado.setSelected(true);
            } else if (estadoCivil.equals("Viúvo(a)")) {
                rdnViuvo.setSelected(true);
            }
        }

        String estado = dev.getEstado();
        if (estado != null) {
            comboBoxEstado.setSelectedItem(estado);
        }
    }
    
    private void formatarCampos() {
        try {
            MaskFormatter cepMask = new MaskFormatter("#####-###");
            cepMask.setPlaceholderCharacter('_');
            cepMask.install(txtCep);

            MaskFormatter telefoneMask = new MaskFormatter("(##) ####-####");
            telefoneMask.setPlaceholderCharacter('_');
            telefoneMask.install(txtTelefone);

            MaskFormatter dataMask = new MaskFormatter("##/##/####");
            dataMask.setPlaceholderCharacter('_');
            dataMask.install(txtNascimento);
            
            MaskFormatter celularMask = new MaskFormatter("(##) #####-####");
            celularMask.setPlaceholderCharacter('_');
            celularMask.install(txtCelular);
        } catch (ParseException excp) {}
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupGenero = new javax.swing.ButtonGroup();
        btnGroupCivil = new javax.swing.ButtonGroup();
        btnLimpar = new javax.swing.JButton();
        lblEndereco = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        lblBairro = new javax.swing.JLabel();
        rdnIndefinido = new javax.swing.JRadioButton();
        lblCidade = new javax.swing.JLabel();
        rdnMasculino = new javax.swing.JRadioButton();
        lblEstado = new javax.swing.JLabel();
        rdnFeminino = new javax.swing.JRadioButton();
        lblCep = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        lblGenero = new javax.swing.JLabel();
        checkFront = new javax.swing.JCheckBox();
        lblCelular = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        rdnViuvo = new javax.swing.JRadioButton();
        checkBack = new javax.swing.JCheckBox();
        lblTelefone = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        lblNascimento = new javax.swing.JLabel();
        checkFull = new javax.swing.JCheckBox();
        txtNascimento = new javax.swing.JFormattedTextField();
        checkDados = new javax.swing.JCheckBox();
        txtCep = new javax.swing.JFormattedTextField();
        comboBoxEstado = new javax.swing.JComboBox<>();
        txtCelular = new javax.swing.JFormattedTextField();
        checkAnalista = new javax.swing.JCheckBox();
        checkCloud = new javax.swing.JCheckBox();
        rdnSolteiro = new javax.swing.JRadioButton();
        rdnCasado = new javax.swing.JRadioButton();
        lblTitulo = new javax.swing.JLabel();
        lblCivil = new javax.swing.JLabel();
        lblComplemento = new javax.swing.JLabel();
        txtComplemento = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        lblVagas = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JFormattedTextField();
        btnAtualizar = new javax.swing.JButton();
        lblNome = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editar");
        setResizable(false);

        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/clearIcon.gif"))); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        lblEndereco.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblEndereco.setText("Endereço:");

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/closeIcon.png"))); // NOI18N
        btnSair.setText("Cancelar");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        lblBairro.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblBairro.setText("Bairro:");

        btnGroupGenero.add(rdnIndefinido);
        rdnIndefinido.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        rdnIndefinido.setText("Prefiro não dizer");

        lblCidade.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblCidade.setText("Cidade:");

        btnGroupGenero.add(rdnMasculino);
        rdnMasculino.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        rdnMasculino.setText("Masculino");

        lblEstado.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblEstado.setText("Estado:");

        btnGroupGenero.add(rdnFeminino);
        rdnFeminino.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        rdnFeminino.setText("Feminino");

        lblCep.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblCep.setText("CEP:");

        lblGenero.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblGenero.setText("Gênero:");

        checkFront.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        checkFront.setText("Desenvolvedor Front-End");

        lblCelular.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblCelular.setText("Celular:");

        btnGroupCivil.add(rdnViuvo);
        rdnViuvo.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        rdnViuvo.setText("Viúvo(a)");

        checkBack.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        checkBack.setText("Desenvolvedor Back-End");

        lblTelefone.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblTelefone.setText("Telefone:");

        lblNascimento.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblNascimento.setText("Data de Nascimento:");

        checkFull.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        checkFull.setText("Desenvolvedor Full-Stack");

        checkDados.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        checkDados.setText("Engenheiro de Dados");

        comboBoxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione um Estado:", "Acre (AC)", "Alagoas (AL)", "Amapá (AP)", "Amazonas (AM)", "Bahia (BA)", "Ceará (CE)", "Distrito Federal (DF)", "Espírito Santo (ES)", "Goiás (GO)", "Maranhão (MA)", "Mato Grosso (MT)", "Mato Grosso do Sul (MS)", "Minas Gerais (MG)", "Pará (PA)", "Paraíba (PB)", "Paraná (PR)", "Pernambuco (PE)", "Piauí (PI)", "Rio de Janeiro (RJ)", "Rio Grande do Norte (RN)", "Rio Grande do Sul (RS)", "Rondônia (RO)", "Roraima (RR)", "Santa Catarina (SC)", "São Paulo (SP)", "Sergipe (SE)", "Tocantins (TO)" }));

        checkAnalista.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        checkAnalista.setText("Analista de Sistemas");

        checkCloud.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        checkCloud.setText("Engenheiro de Cloud");

        btnGroupCivil.add(rdnSolteiro);
        rdnSolteiro.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        rdnSolteiro.setText("Solteiro(a)");

        btnGroupCivil.add(rdnCasado);
        rdnCasado.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        rdnCasado.setText("Casado(a)");

        lblTitulo.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Editar Cadastro de Desenvolvedor");

        lblCivil.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblCivil.setText("Estado Civil:");

        lblComplemento.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblComplemento.setText("Complemento:");

        lblVagas.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblVagas.setText("Áreas de Interesse e Atuação:");

        btnAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/addIcon.gif"))); // NOI18N
        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        lblNome.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblNome.setText("Nome Completo:");

        lblId.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblId.setText("Id:");

        txtId.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblNascimento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rdnIndefinido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblGenero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rdnFeminino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rdnMasculino, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(rdnCasado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rdnSolteiro))
                            .addComponent(rdnViuvo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(checkFront, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(checkBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(checkFull, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(checkCloud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(checkDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(checkAnalista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(lblVagas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(lblTitulo, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCelular)
                            .addComponent(lblEstado))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboBoxEstado, 0, 189, Short.MAX_VALUE)
                            .addComponent(txtCelular))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTelefone)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblId)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtId))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCidade))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(btnSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(lblBairro)
                        .addGap(12, 12, 12)
                        .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblComplemento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtComplemento))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCep)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblEndereco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtEndereco)))
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
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNascimento)
                    .addComponent(txtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblGenero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdnMasculino)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdnFeminino)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdnIndefinido))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCivil)
                            .addComponent(lblVagas))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdnSolteiro)
                            .addComponent(checkFront)
                            .addComponent(checkDados))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdnCasado)
                            .addComponent(checkBack)
                            .addComponent(checkAnalista))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdnViuvo)
                            .addComponent(checkFull)
                            .addComponent(checkCloud))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCep)
                    .addComponent(lblEndereco)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblComplemento)
                    .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBairro)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstado)
                    .addComponent(comboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCidade)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCelular)
                    .addComponent(lblTelefone)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblId)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtualizar)
                    .addComponent(btnLimpar)
                    .addComponent(btnSair))
                .addGap(18, 18, 18))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        //limpar campos de cadastro e colocando foco na primeira caixa de texto
        txtNome.setText(null);
        txtNascimento.setText(null);
        btnGroupGenero.clearSelection();
        btnGroupCivil.clearSelection();
        checkFront.setSelected(false);
        checkBack.setSelected(false);
        checkFull.setSelected(false);
        checkDados.setSelected(false);
        checkAnalista.setSelected(false);
        checkCloud.setSelected(false);
        txtCep.setText(null);
        txtEndereco.setText(null);
        txtBairro.setText(null);
        txtComplemento.setText(null);
        comboBoxEstado.setSelectedIndex(0);
        txtCidade.setText(null);
        txtCelular.setText(null);
        txtTelefone.setText(null);
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        //variaveis para armazenar dados do usuário
        int id = Integer.parseInt(txtId.getText());
        String nome, nascimento, genero, estadoCivil, areas, cep, endereco, bairro, complemento, estado, cidade, celular, telefone;

        //verificar se há um nome para registrar um usuário, se não houver, um alerta é emitido
        if (txtNome.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Para atualizar o cadastro de um usuário, é necessário pelo menos seu nome."
                    + "\nDigite um nome para proseguir.", "Dados do Usuário", JOptionPane.WARNING_MESSAGE);
        } else {
            
            if (txtNome.getText().equals("")) {
                nome = null;
            } else {
                nome = txtNome.getText();
            }

            if (txtNascimento.getText().equals("__/__/____")) {
                nascimento = null;
            } else {
                nascimento = txtNascimento.getText();
            }

            if (rdnMasculino.isSelected()) {
                genero = "Masculino";
            } else if (rdnFeminino.isSelected()) {
                genero = "Feminino";
            } else if (rdnIndefinido.isSelected()) {
                genero = "Não Especificado";
            } else {
                genero = null;
            }

            if (rdnSolteiro.isSelected()) {
                estadoCivil = "Solteiro(a)";
            } else if (rdnCasado.isSelected()) {
                estadoCivil = "Casado(a)";
            } else if (rdnViuvo.isSelected()) {
                estadoCivil = "Viúvo(a)";
            } else {
                estadoCivil = null;
            }

            String temp = "";
            if (checkFront.isSelected()) {
                temp += checkFront.getText() + ", ";
            }
            if (checkBack.isSelected()) {
                temp += checkBack.getText() + ", ";
            }
            if (checkFull.isSelected()) {
                temp += checkFull.getText() + ", ";
            }
            if (checkDados.isSelected()) {
                temp += checkDados.getText() + ", ";
            }
            if (checkAnalista.isSelected()) {
                temp += checkAnalista.getText() + ", ";
            }
            if (checkCloud.isSelected()) {
                temp += checkCloud.getText() + ", ";
            }
            if (temp.equals("")) {
                areas = null;
            } else {
                areas = temp.substring(0, temp.length() - 2);
            }

            if (txtCep.getText().equals("_____-___")) {
                cep = null;
            } else {
                cep = txtCep.getText();
            }

            if (txtEndereco.getText().equals("")) {
                endereco = null;
            } else {
                endereco = txtEndereco.getText();
            }

            if (txtBairro.getText().equals("")) {
                bairro = null;
            } else {
                bairro = txtBairro.getText();
            }

            if (txtComplemento.getText().equals("")) {
                complemento = null;
            } else {
                complemento = txtComplemento.getText();
            }

            if (comboBoxEstado.getSelectedIndex() == 0) {
                estado = null;
            } else {
                estado = String.valueOf(comboBoxEstado.getSelectedItem());
            }

            if (txtCidade.getText().equals("")) {
                cidade = null;
            } else {
                cidade = txtCidade.getText();
            }

            if (txtCelular.getText().equals("(__) _____-____")) {
                celular = null;
            } else {
                celular = txtCelular.getText();
            }

            if (txtTelefone.getText().equals("(__) ____-____")) {
                telefone = null;
            } else {
                telefone = txtTelefone.getText();
            }
            
            Desenvolvedor dev = new Desenvolvedor();
            dev.setId(id);
            dev.setNome(nome);
            dev.setNascimento(nascimento);
            dev.setGenero(genero);
            dev.setEstadoCivil(estadoCivil);
            dev.setAreas(areas);
            dev.setCep(cep);
            dev.setEndereco(endereco);
            dev.setBairro(bairro);
            dev.setComplemento(complemento);
            dev.setEstado(estado);
            dev.setCidade(cidade);
            dev.setCelular(celular);
            dev.setTelefone(telefone);

            try {
                DesenvolvedorController.editarDev(dev);
            } catch (ExceptionDAO ex) {
                Logger.getLogger(EditarDev.class.getName()).log(Level.SEVERE, null, ex);
            }

            this.dispose();
        }
    }//GEN-LAST:event_btnAtualizarActionPerformed

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
            java.util.logging.Logger.getLogger(EditarDev.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarDev.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarDev.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarDev.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarDev().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.ButtonGroup btnGroupCivil;
    private javax.swing.ButtonGroup btnGroupGenero;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSair;
    private javax.swing.JCheckBox checkAnalista;
    private javax.swing.JCheckBox checkBack;
    private javax.swing.JCheckBox checkCloud;
    private javax.swing.JCheckBox checkDados;
    private javax.swing.JCheckBox checkFront;
    private javax.swing.JCheckBox checkFull;
    private javax.swing.JComboBox<String> comboBoxEstado;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblCep;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblCivil;
    private javax.swing.JLabel lblComplemento;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNascimento;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblVagas;
    private javax.swing.JRadioButton rdnCasado;
    private javax.swing.JRadioButton rdnFeminino;
    private javax.swing.JRadioButton rdnIndefinido;
    private javax.swing.JRadioButton rdnMasculino;
    private javax.swing.JRadioButton rdnSolteiro;
    private javax.swing.JRadioButton rdnViuvo;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JFormattedTextField txtCelular;
    private javax.swing.JFormattedTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtId;
    private javax.swing.JFormattedTextField txtNascimento;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables

}
