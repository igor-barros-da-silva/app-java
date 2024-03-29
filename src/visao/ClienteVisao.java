package visao;

import entidade.Cidade;
import entidade.Cliente;
import entidade.Estado;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import util.HibernateUtil;

public class ClienteVisao extends javax.swing.JDialog {
    
    private Cliente cli;
    private List<Cliente> listaClientes = new ArrayList<Cliente>();
    private List<Cidade> listaCidades = new ArrayList<Cidade>();
    private List<Estado> listaEstados = new ArrayList<Estado>();
    
    public ClienteVisao(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        montaTabela();
        validaTela("inicio");
        montaCombo();
        limpaCampos();
    }
    
    public void montaCombo(){
         
        listaCidades = HibernateUtil.getSession().createCriteria(Cidade.class).list();
        cCidade.removeAllItems();
        for(Cidade c : listaCidades){
            cCidade.addItem(c.getNome());            
        }
        listaEstados = HibernateUtil.getSession().createCriteria(Estado.class).list();
        cEstado.removeAllItems();        
        for(Estado e : listaEstados){
            cEstado.addItem(e.getNome());            
        }
    }
    
    private void validaTela(String acao){
        if (acao.equals("inicio")) {
            cNome.setEnabled(false);         
            cCpf.setEnabled(false);
            cRg.setEnabled(false);         
            cEndereco.setEnabled(false);            
            cNum.setEnabled(false);            
            cComplemento.setEnabled(false);            
            cBairro.setEnabled(false);            
            cCEP.setEnabled(false);            
            cEstado.setEnabled(false);            
            cCidade.setEnabled(false);            
            cTel1.setEnabled(false);            
            cTel2.setEnabled(false);            
            btNovo.setEnabled(true);
            btAlterar.setEnabled(false);
            btExcluir.setEnabled(false);
            btCancelar.setEnabled(false);
            btSalvar.setEnabled(false);
            btSair.setEnabled(true);            
        }else if (acao.equals("novo")) {
            cNome.setEnabled(true);         
            cCpf.setEnabled(true);
            cRg.setEnabled(true);         
            cEndereco.setEnabled(true);            
            cNum.setEnabled(true);            
            cComplemento.setEnabled(true);            
            cBairro.setEnabled(true);            
            cCEP.setEnabled(true);            
            cEstado.setEnabled(true);            
            cCidade.setEnabled(true);            
            cTel1.setEnabled(true);            
            cTel2.setEnabled(true);            
            btNovo.setEnabled(false);
            btAlterar.setEnabled(false);
            btExcluir.setEnabled(false);
            btCancelar.setEnabled(true);
            btSalvar.setEnabled(true);
            btSair.setEnabled(true);            
        }else if (acao.equals("selecionar")) {
            cNome.setEnabled(false);         
            cCpf.setEnabled(false);
            cRg.setEnabled(false);         
            cEndereco.setEnabled(false);            
            cNum.setEnabled(false);            
            cComplemento.setEnabled(false);            
            cBairro.setEnabled(false);            
            cCEP.setEnabled(false);            
            cEstado.setEnabled(false);            
            cCidade.setEnabled(false);            
            cTel1.setEnabled(false);            
            cTel2.setEnabled(false);            
            btNovo.setEnabled(true);
            btAlterar.setEnabled(true);
            btExcluir.setEnabled(true);
            btCancelar.setEnabled(true);
            btSalvar.setEnabled(false);
            btSair.setEnabled(true);            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        cCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cNome = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cCpf = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cRg = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cEndereco = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        cEstado = new javax.swing.JComboBox<String>();
        jLabel17 = new javax.swing.JLabel();
        cTel1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        cTel2 = new javax.swing.JTextField();
        btCancelar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        btNovo = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        btSalvar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        cNum = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        cComplemento = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        cBairro = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        cCEP = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        cCidade = new javax.swing.JComboBox<String>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setText("Código:");

        cCodigo.setEditable(false);
        cCodigo.setEnabled(false);

        jLabel3.setText("Nome:");

        cNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cNomeActionPerformed(evt);
            }
        });

        jLabel6.setText("CPF:");

        jLabel7.setText("RG:");

        jLabel10.setText("Endereco:");

        jLabel15.setText("Estado:");

        cEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel17.setText("Tel 1:");

        jLabel18.setText("Tel 2:");

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        btNovo.setText("Novo");
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });

        btAlterar.setText("Alterar");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Cadastro de Clientes");

        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);

        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        jLabel11.setText("Número:");

        jLabel12.setText("Complemento:");

        jLabel13.setText("Bairro:");

        jLabel14.setText("CEP:");

        jLabel16.setText("Cidade:");

        cCidade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cCidadeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btNovo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btAlterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btSalvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btSair))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(18, 18, 18)
                                .addComponent(cCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 752, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(18, 18, 18)
                                        .addComponent(cEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel11)
                                        .addGap(18, 18, 18)
                                        .addComponent(cNum, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel17)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel12)
                                                .addGap(18, 18, 18)
                                                .addComponent(cComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jLabel15)
                                                .addGap(18, 18, 18)
                                                .addComponent(cEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel18)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel13)
                                                .addGap(18, 18, 18)
                                                .addComponent(cBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(cTel2, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                                    .addComponent(cTel1))))
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel14)
                                        .addGap(18, 18, 18)
                                        .addComponent(cCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cNome, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(cRg, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCancelar)
                    .addComponent(btSair)
                    .addComponent(btNovo)
                    .addComponent(btAlterar)
                    .addComponent(btExcluir)
                    .addComponent(btSalvar))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(cRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(cNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(cComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(cBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(cCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(cCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(cTel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(cEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(cTel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed

        limpaCampos();
        validaTela("inicio");
        // TODO add your handling code here:
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed

        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btSairActionPerformed

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed

        cli = new Cliente();
        limpaCampos();
        validaTela("novo");
        // TODO add your handling code here:
    }//GEN-LAST:event_btNovoActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed

        validaTela("novo");
        // TODO add your handling code here:
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        
        Object[] opcoes = {"Sim", "Não"};
        int i = JOptionPane.showOptionDialog(null, "Tem certeza que deseja excluir "
            + "este registro?", "Atenção", JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
        if (i == JOptionPane.YES_OPTION) {
            HibernateUtil.beginTransaction();
            HibernateUtil.getSession().delete(cli);
            HibernateUtil.commitTransaction();
            HibernateUtil.closeSession();
            limpaCampos();
            montaTabela();            
            validaTela("inicio");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btExcluirActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        
        cli = listaClientes.get(tabela.getSelectedRow());
        cCodigo.setText(cli.getId().toString());
        cNome.setText(cli.getNome());
        cCpf.setText(cli.getCpf());
        cRg.setText(cli.getRg());
        cEndereco.setText(cli.getEndereco());
        cNum.setText(cli.getNumero());
        cComplemento.setText(cli.getComplemento());
        cBairro.setText(cli.getBairro());
        cCEP.setText(cli.getCep());
        cTel1.setText(cli.getTel1());
        cTel2.setText(cli.getTel2());
        cCidade.setSelectedItem(cli.getCidade().getNome());
        cEstado.setSelectedItem(cli.getEstado().getNome());

        validaTela("selecionar");
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelaMouseClicked

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        if (validaCampos()) {
            if (cCodigo.getText().equals("")) {
                cli.setId(null);
            } else {
                cli.setId(Long.parseLong(cCodigo.getText()));
            }

            cli.setNome(cNome.getText());          
            cli.setCpf(cCpf.getText());            
            cli.setRg(cRg.getText());           
            cli.setEndereco(cEndereco.getText());
            cli.setNumero(cNum.getText());
            cli.setComplemento(cComplemento.getText());
            cli.setBairro(cBairro.getText());
            cli.setCep(cCEP.getText());
            cli.setTel1(cTel1.getText());
            cli.setTel2(cTel2.getText());
            cli.setCidade(listaCidades.get(cCidade.getSelectedIndex()));
            cli.setEstado(listaEstados.get(cEstado.getSelectedIndex()));

            HibernateUtil.beginTransaction();
            HibernateUtil.getSession().merge(cli);
            HibernateUtil.commitTransaction();
            HibernateUtil.closeSession();

            montaTabela();            
            limpaCampos();
            validaTela("inicio");
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_btSalvarActionPerformed
    
    private Boolean validaCampos() {
        String mensagem = "";
        Boolean retorno = true;
        if (cCEP.getText().equals("")) {
            mensagem = mensagem + "O campo CEP é obrigatório!\n";
            retorno = false;
        }
        if (cTel1.getText().equals("")) {
            mensagem = mensagem + "O campo Telefone é obrigatório!\n";
            retorno = false;
        }
        if (retorno == false) {
            JOptionPane.showMessageDialog(null, mensagem);
        }
        return retorno;
    }
    
    private void cCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cCidadeActionPerformed

    private void cNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cNomeActionPerformed
    
    public void montaTabela() {
        listaClientes = HibernateUtil.getSession().
                createCriteria(Cliente.class).list();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Código");
        modelo.addColumn("Nome");
        modelo.addColumn("Cpf");
        modelo.addColumn("Rg"); 
        modelo.addColumn("Endereço");
        modelo.addColumn("Número");
        modelo.addColumn("Complemento");
        modelo.addColumn("Bairro");
        modelo.addColumn("CEP");
        modelo.addColumn("Estado");
        modelo.addColumn("Cidade");
        modelo.addColumn("Telefone 1");
        modelo.addColumn("Telefone 2");
        for (Cliente l : listaClientes) {
            modelo.addRow(new Object[]{l.getId(), l.getNome(), l.getCpf(),
                l.getRg(), l.getEndereco(), l.getNumero(), l.getComplemento(),
                l.getBairro(), l.getCep(), l.getEstado().getNome(),
                l.getCidade().getNome(), l.getTel1(), l.getTel2()});
        }
        tabela.setModel(modelo);
    }
    
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
            java.util.logging.Logger.getLogger(ClienteVisao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteVisao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteVisao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteVisao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ClienteVisao dialog = new ClienteVisao(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btSair;
    private javax.swing.JButton btSalvar;
    private javax.swing.JTextField cBairro;
    private javax.swing.JTextField cCEP;
    private javax.swing.JComboBox<String> cCidade;
    private javax.swing.JTextField cCodigo;
    private javax.swing.JTextField cComplemento;
    private javax.swing.JTextField cCpf;
    private javax.swing.JTextField cEndereco;
    private javax.swing.JComboBox<String> cEstado;
    private javax.swing.JTextField cNome;
    private javax.swing.JTextField cNum;
    private javax.swing.JTextField cRg;
    private javax.swing.JTextField cTel1;
    private javax.swing.JTextField cTel2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
    
    public Cliente getCli() {
        return cli;
    }

    public void setCli(Cliente cli) {
        this.cli = cli;
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }
    
    private void limpaCampos() {
        cCodigo.setText("");
        cNome.setText("");      
        cCpf.setText("");
        cRg.setText("");       
        cEndereco.setText("");
        cNum.setText("");
        cComplemento.setText("");
        cBairro.setText("");
        cCEP.setText("");
        cTel1.setText("");
        cTel2.setText("");
    }
}
