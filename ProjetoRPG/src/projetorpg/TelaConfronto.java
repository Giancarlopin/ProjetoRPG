package projetorpg;

import Modelo.Oponente;
import Modelo.Personagem;
import ferramentas.CaixaDeDialogo;
import java.util.Random;

/**
 *
 * @author dmdullius
 */
public class TelaConfronto extends javax.swing.JFrame {

    Personagem personagem;
    Oponente oponente;

    /**
     * Creates new form Tela_confronto
     */
    public TelaConfronto(Personagem personagem) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.personagem = personagem;
        mostrarPersonagem();
        

    }

    //metodo pra mostar personagem
    private void mostrarPersonagem() {
        classep.setText(String.valueOf(personagem.getClasse()));

        personageml.setText(personagem.getNome());
        vidap.setText(String.valueOf(personagem.getVida()));
        ataquep.setText(String.valueOf(personagem.getAtaque()));
    }

//metodo mostar openente
    private void MostrarOponente() {
        vida_op.setText(String.valueOf(oponente.getVida_op()));
        ataque_op.setText(String.valueOf(oponente.getAtaque_op()));
        //inimigo.setText(String.valueOf(oponente.getNome_op()));
        //classe_op.setText(String.valueOf(oponente.getClasse_op()));
    }

//gerar oponente
    //ramdom
    Random gerador = new Random();

    private void GerarOponente() {
        try {

            oponente.setAtaque_op(gerador.nextInt(500 + 1));
            oponente.setVida_op(gerador.nextInt(600 + 1));

        } catch (Exception ex) {
            CaixaDeDialogo.obterinstancia().exibirMensagem(ex.toString(), 'e');
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

        titulo = new javax.swing.JLabel();
        personageml = new javax.swing.JLabel();
        vidap = new javax.swing.JLabel();
        inimigo = new javax.swing.JLabel();
        vida_op = new javax.swing.JLabel();
        ataquep = new javax.swing.JLabel();
        ataque_op = new javax.swing.JLabel();
        classe_op = new javax.swing.JLabel();
        classep = new javax.swing.JLabel();
        atacar = new javax.swing.JButton();
        voltar = new javax.swing.JButton();
        gera_op = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        titulo.setFont(new java.awt.Font("Vladimir Script", 2, 24)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("MAGO'S QUEST");
        titulo.setToolTipText("");

        personageml.setFont(new java.awt.Font("Vladimir Script", 0, 24)); // NOI18N
        personageml.setText("Personagem:");

        vidap.setFont(new java.awt.Font("Vladimir Script", 0, 24)); // NOI18N
        vidap.setText("Vida atual:");

        inimigo.setFont(new java.awt.Font("Vladimir Script", 0, 24)); // NOI18N
        inimigo.setText("Opnente:");

        vida_op.setFont(new java.awt.Font("Vladimir Script", 0, 24)); // NOI18N
        vida_op.setText("Vida atual:");

        ataquep.setFont(new java.awt.Font("Vladimir Script", 0, 24)); // NOI18N
        ataquep.setText("Ataque:");

        ataque_op.setFont(new java.awt.Font("Vladimir Script", 0, 24)); // NOI18N
        ataque_op.setText("Ataque:");

        classe_op.setFont(new java.awt.Font("Vladimir Script", 0, 24)); // NOI18N
        classe_op.setText("Classe: ");

        classep.setFont(new java.awt.Font("Vladimir Script", 0, 24)); // NOI18N
        classep.setText("Classe: ");

        atacar.setFont(new java.awt.Font("Vladimir Script", 0, 24)); // NOI18N
        atacar.setText("Atacar");
        atacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atacarActionPerformed(evt);
            }
        });

        voltar.setFont(new java.awt.Font("Vladimir Script", 0, 24)); // NOI18N
        voltar.setText("Voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        gera_op.setFont(new java.awt.Font("Vladimir Script", 0, 24)); // NOI18N
        gera_op.setText("Gerar Oponente");
        gera_op.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gera_opActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(titulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(voltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(76, 76, 76)
                        .addComponent(atacar, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(gera_op, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ataquep)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(classep, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                .addGap(404, 404, 404))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(personageml)
                                    .addComponent(vidap))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(145, 145, 145)
                                    .addComponent(classe_op, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(137, 137, 137)
                                    .addComponent(inimigo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(145, 145, 145)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ataque_op, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(vida_op, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(71, 71, 71))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(inimigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(classe_op)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(vida_op, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(personageml)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(classep)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vidap)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(ataquep))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ataque_op)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(atacar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gera_op, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atacarActionPerformed
        ataque();
        //MostrarOponente();
    }//GEN-LAST:event_atacarActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        // TODO add your handling code here:
        Principal tela = new Principal();
        tela.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_voltarActionPerformed

    private void gera_opActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gera_opActionPerformed
        // TODO add your handling code here:
        GerarOponente();
    }//GEN-LAST:event_gera_opActionPerformed
    private void ataque() {

        int ataque = 0;
        if (gerador.nextInt(20) + 1 > 13) {
            ataque = personagem.getAtaque() / 2;
        } else {
            ataque = personagem.getAtaque() / 3;
        }
        personagem.getAtaque();
        int vida_resta = oponente.getVida_op() - ataque;
        oponente.setVida_op(vida_resta);

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
            java.util.logging.Logger.getLogger(TelaConfronto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaConfronto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaConfronto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaConfronto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaConfronto(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atacar;
    private javax.swing.JLabel ataque_op;
    private javax.swing.JLabel ataquep;
    private javax.swing.JLabel classe_op;
    private javax.swing.JLabel classep;
    private javax.swing.JButton gera_op;
    private javax.swing.JLabel inimigo;
    private javax.swing.JLabel personageml;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel vida_op;
    private javax.swing.JLabel vidap;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
