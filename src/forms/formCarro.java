/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import classes.Carro;

/**
 *
 * @author alunoces
 */
public class formCarro extends javax.swing.JFrame {

    
    //instanciar a classe carro para conseguir usar as variáveis nos outros métodos.
    private Carro car = null;
    /**
     * Creates new form formCarro
     */
    public formCarro() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        tfModelo = new javax.swing.JTextField();
        tfMarca = new javax.swing.JTextField();
        tfPrecoLocacao = new javax.swing.JTextField();
        tfDiasLocado = new javax.swing.JTextField();
        tfValorTotalLocacao = new javax.swing.JTextField();
        tfValorMulta = new javax.swing.JTextField();
        btCadastrar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btCalcularMulta = new javax.swing.JButton();
        lbMensagem = new javax.swing.JLabel();
        lbMensagemDias = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Codigo");

        jLabel2.setText("Modelo");

        jLabel3.setText("Marca");

        jLabel4.setText("Preço Locação");

        jLabel5.setText("Dias Locados");

        jLabel6.setText("Valor total de Locacao");

        jLabel7.setText("Valor da multa");

        tfMarca.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                tfMarcaInputMethodTextChanged(evt);
            }
        });

        tfPrecoLocacao.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tfPrecoLocacaoPropertyChange(evt);
            }
        });

        tfDiasLocado.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfDiasLocadoFocusLost(evt);
            }
        });

        tfValorTotalLocacao.setEditable(false);
        tfValorTotalLocacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfValorTotalLocacaoActionPerformed(evt);
            }
        });

        tfValorMulta.setEditable(false);

        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        btLimpar.setText("Limpar");

        jButton3.setText("Sair");

        btCalcularMulta.setText("Calcular Multa");
        btCalcularMulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCalcularMultaActionPerformed(evt);
            }
        });

        lbMensagem.setForeground(new java.awt.Color(255, 0, 51));

        lbMensagemDias.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(27, 27, 27))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(63, 63, 63)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfDiasLocado, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(tfValorMulta)
                            .addComponent(tfMarca)
                            .addComponent(tfPrecoLocacao)
                            .addComponent(tfValorTotalLocacao)
                            .addComponent(tfModelo)
                            .addComponent(tfCodigo, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                                .addComponent(btCalcularMulta, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 96, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addComponent(lbMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(lbMensagemDias, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btCadastrar)
                        .addGap(87, 87, 87)
                        .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lbMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addComponent(tfMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfPrecoLocacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(64, 64, 64)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfDiasLocado)
                    .addComponent(lbMensagemDias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfValorTotalLocacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfValorMulta)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btCalcularMulta)
                        .addGap(53, 53, 53)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btCadastrar)
                    .addComponent(btLimpar)
                    .addComponent(jButton3))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        // TODO add your handling code here:
        String codigo = tfCodigo.getText();
        String nome = tfModelo.getText();
        String marca = tfMarca.getText();
        
        
        
        Carro car = new Carro();
        
        car.setCodigo(codigo);
        car.setNome(nome);
        car.setMarca(marca);
        
        car.setPreco(Float.parseFloat(tfPrecoLocacao.getText()));        
        car.setDiasParaLocacao(Integer.parseInt(tfDiasLocado.getText()));
        car.setValorLocacao(Float.parseFloat(tfPrecoLocacao.getText()));
        
        //pegar retorno metodo
     
        
     //  String valorTexto String.valueOf(valorAluguel);
        int dias = Integer.parseInt(tfDiasLocado.getText());
     
        float multa = car.calcularMulta(dias);
       
        float valorTotalLocacao = car.calcularValorAluguel(dias);
        String valor = String.valueOf(valorTotalLocacao);
        tfValorTotalLocacao.setText(valor);
                
        lbMensagem.setText("cadastro realizado");

    }//GEN-LAST:event_btCadastrarActionPerformed

    private void tfMarcaInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_tfMarcaInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMarcaInputMethodTextChanged

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        //instância carro
        Carro car = new Carro();
        
        //seta dados no formulario
        tfMarca.setText(car.getMarca());
        tfModelo.setText(car.getModelo());
        tfDiasLocado.setText(String.valueOf(car.getDiasParaLocacao()));
                
        
    }//GEN-LAST:event_formWindowOpened

    private void tfDiasLocadoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfDiasLocadoFocusLost
        // TODO add your handling code here:
        
        Carro car = new Carro();
        
        int diasLocacao = Integer.parseInt(tfDiasLocado.getText());
        
        if(diasLocacao < 10){
            
            lbMensagemDias.setText("Dias não pode ser menor que 10.");
        }
    }//GEN-LAST:event_tfDiasLocadoFocusLost

    private void tfValorTotalLocacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfValorTotalLocacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfValorTotalLocacaoActionPerformed

    private void tfPrecoLocacaoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tfPrecoLocacaoPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPrecoLocacaoPropertyChange

    private void btCalcularMultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCalcularMultaActionPerformed
        // TODO add your handling code here:
        int dias = Integer.parseInt(tfDiasLocado.getText());
        float multa = car.calcularMulta(dias);
        
        tfValorMulta.setText(String.valueOf(multa));
        
    }//GEN-LAST:event_btCalcularMultaActionPerformed

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
            java.util.logging.Logger.getLogger(formCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formCarro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btCalcularMulta;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lbMensagem;
    private javax.swing.JLabel lbMensagemDias;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfDiasLocado;
    private javax.swing.JTextField tfMarca;
    private javax.swing.JTextField tfModelo;
    private javax.swing.JTextField tfPrecoLocacao;
    private javax.swing.JTextField tfValorMulta;
    private javax.swing.JTextField tfValorTotalLocacao;
    // End of variables declaration//GEN-END:variables
}
