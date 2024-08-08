package view;

import controller.DesenvolvedorController;
import dao.ExceptionDAO;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;
import model.Desenvolvedor;

public class MenuAdm extends javax.swing.JFrame {

    public MenuAdm() throws ExceptionDAO {
        initComponents();
        setDataAtual();
        formatarCampos();
    }
    
    private String setDataAtual() {
        LocalDate dataAtual = LocalDate.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = dataAtual.format(formatter);

        return dataFormatada;
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
        panelCadastrar = new javax.swing.JPanel();
        lblCivil = new javax.swing.JLabel();
        lblCidade = new javax.swing.JLabel();
        lblComplemento = new javax.swing.JLabel();
        rdnMasculino = new javax.swing.JRadioButton();
        txtComplemento = new javax.swing.JTextField();
        lblEstado = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        rdnFeminino = new javax.swing.JRadioButton();
        lblVagas = new javax.swing.JLabel();
        lblCep = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        lblGenero = new javax.swing.JLabel();
        checkFront = new javax.swing.JCheckBox();
        txtBairro = new javax.swing.JTextField();
        lblCelular = new javax.swing.JLabel();
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
        txtTelefone = new javax.swing.JFormattedTextField();
        checkCloud = new javax.swing.JCheckBox();
        btnIncluir = new javax.swing.JButton();
        lblNome = new javax.swing.JLabel();
        btnLimpar = new javax.swing.JButton();
        rdnSolteiro = new javax.swing.JRadioButton();
        lblEndereco = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        rdnCasado = new javax.swing.JRadioButton();
        lblBairro = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        rdnIndefinido = new javax.swing.JRadioButton();
        menuBar = new javax.swing.JMenuBar();
        menuUser = new javax.swing.JMenu();
        menuEncerrar = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenuItem();
        menuConsulta = new javax.swing.JMenu();
        menuConsultar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Developers.com");
        setResizable(false);

        panelCadastrar.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro"));

        lblCivil.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblCivil.setText("Estado Civil:");

        lblCidade.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblCidade.setText("Cidade:");

        lblComplemento.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblComplemento.setText("Complemento:");

        btnGroupGenero.add(rdnMasculino);
        rdnMasculino.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        rdnMasculino.setText("Masculino");

        lblEstado.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblEstado.setText("Estado:");

        btnGroupGenero.add(rdnFeminino);
        rdnFeminino.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        rdnFeminino.setText("Feminino");

        lblVagas.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblVagas.setText("Áreas de Interesse e Atuação:");

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

        btnIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/addIcon.gif"))); // NOI18N
        btnIncluir.setText("Incluir");
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });

        lblNome.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblNome.setText("Nome Completo:");

        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/clearIcon.gif"))); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnGroupCivil.add(rdnSolteiro);
        rdnSolteiro.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        rdnSolteiro.setText("Solteiro(a)");

        lblEndereco.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblEndereco.setText("Endereço:");

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/closeIcon.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnGroupCivil.add(rdnCasado);
        rdnCasado.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        rdnCasado.setText("Casado(a)");

        lblBairro.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lblBairro.setText("Bairro:");

        lblTitulo.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Cadastro de Desenvolvedor");

        btnGroupGenero.add(rdnIndefinido);
        rdnIndefinido.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        rdnIndefinido.setText("Prefiro não dizer");

        javax.swing.GroupLayout panelCadastrarLayout = new javax.swing.GroupLayout(panelCadastrar);
        panelCadastrar.setLayout(panelCadastrarLayout);
        panelCadastrarLayout.setHorizontalGroup(
            panelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadastrarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCadastrarLayout.createSequentialGroup()
                        .addComponent(lblNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblNascimento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCadastrarLayout.createSequentialGroup()
                        .addGroup(panelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rdnIndefinido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblGenero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rdnFeminino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rdnMasculino, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(panelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(rdnCasado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rdnSolteiro))
                            .addComponent(rdnViuvo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(panelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCadastrarLayout.createSequentialGroup()
                                .addGroup(panelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(checkFront, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(checkBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(checkFull, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(panelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(checkCloud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(checkDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(checkAnalista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(lblVagas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(lblTitulo, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelCadastrarLayout.createSequentialGroup()
                        .addGroup(panelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCelular)
                            .addComponent(lblEstado))
                        .addGap(12, 12, 12)
                        .addGroup(panelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboBoxEstado, 0, 189, Short.MAX_VALUE)
                            .addComponent(txtCelular))
                        .addGap(18, 18, 18)
                        .addGroup(panelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCadastrarLayout.createSequentialGroup()
                                .addComponent(lblTelefone)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTelefone))
                            .addGroup(panelCadastrarLayout.createSequentialGroup()
                                .addComponent(lblCidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCidade))))
                    .addGroup(panelCadastrarLayout.createSequentialGroup()
                        .addComponent(btnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(btnSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelCadastrarLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(lblBairro)
                        .addGap(12, 12, 12)
                        .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblComplemento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtComplemento))
                    .addGroup(panelCadastrarLayout.createSequentialGroup()
                        .addComponent(lblCep)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblEndereco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtEndereco)))
                .addContainerGap())
        );
        panelCadastrarLayout.setVerticalGroup(
            panelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCadastrarLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addGroup(panelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNascimento)
                    .addComponent(txtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelCadastrarLayout.createSequentialGroup()
                        .addComponent(lblGenero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdnMasculino)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdnFeminino)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdnIndefinido))
                    .addGroup(panelCadastrarLayout.createSequentialGroup()
                        .addGroup(panelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCivil)
                            .addComponent(lblVagas))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdnSolteiro)
                            .addComponent(checkFront)
                            .addComponent(checkDados))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdnCasado)
                            .addComponent(checkBack)
                            .addComponent(checkAnalista))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdnViuvo)
                            .addComponent(checkFull)
                            .addComponent(checkCloud))))
                .addGap(18, 18, 18)
                .addGroup(panelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCep)
                    .addComponent(lblEndereco)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblComplemento)
                    .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBairro)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(panelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstado)
                    .addComponent(comboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCidade)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCelular)
                    .addComponent(lblTelefone)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIncluir)
                    .addComponent(btnLimpar)
                    .addComponent(btnSair))
                .addGap(18, 18, 18))
        );

        menuUser.setText("Usuário");

        menuEncerrar.setText("Encerrar Sessão");
        menuEncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEncerrarActionPerformed(evt);
            }
        });
        menuUser.add(menuEncerrar);

        menuSair.setText("Sair");
        menuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairActionPerformed(evt);
            }
        });
        menuUser.add(menuSair);

        menuBar.add(menuUser);

        menuConsulta.setText("Consulta");

        menuConsultar.setText("Consultar, Editar e Deletar");
        menuConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultarActionPerformed(evt);
            }
        });
        menuConsulta.add(menuConsultar);

        menuBar.add(menuConsulta);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(panelCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuEncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEncerrarActionPerformed
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_menuEncerrarActionPerformed

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
        //confirmação para sair da aplicação
        int status = JOptionPane.showConfirmDialog(rootPane, "Deseja sair do sistema?", "Sair", JOptionPane.YES_NO_OPTION);
        if (status == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_menuSairActionPerformed

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        String nome, nascimento, genero, estadoCivil, areas, cep, endereco, bairro, complemento, estado, cidade, celular, telefone;
        String cadastro = setDataAtual();

        if (txtNome.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Para cadastrar um usuário, é necessário pelo menos seu nome."
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
            dev.setCadastro(cadastro);

            try {
                DesenvolvedorController.cadastrarDev(dev);
                limparCampos();
            } catch (ExceptionDAO ex) {
                JOptionPane.showMessageDialog(null, "Erro ao cadastrar: " + ex, "Dados do Usuário", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limparCampos();
    }//GEN-LAST:event_btnLimparActionPerformed

    public void limparCampos(){
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
    }
    
    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void menuConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultarActionPerformed
        try {
            new Consulta().setVisible(true);
        } catch (ExceptionDAO ex) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir dados: " + ex, "Dados do Usuário", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_menuConsultarActionPerformed

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
            java.util.logging.Logger.getLogger(MenuAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MenuAdm().setVisible(true);
                } catch (ExceptionDAO ex) {
                    JOptionPane.showMessageDialog(null, "Erro: " + ex, "Dados do Usuário", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGroupCivil;
    private javax.swing.ButtonGroup btnGroupGenero;
    private javax.swing.JButton btnIncluir;
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
    private javax.swing.JLabel lblNascimento;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblVagas;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuConsulta;
    private javax.swing.JMenuItem menuConsultar;
    private javax.swing.JMenuItem menuEncerrar;
    private javax.swing.JMenuItem menuSair;
    private javax.swing.JMenu menuUser;
    private javax.swing.JPanel panelCadastrar;
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
    private javax.swing.JFormattedTextField txtNascimento;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
