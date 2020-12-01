/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Djfernandys
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
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

        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuAreadoMontador = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuMontadores = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 255));
        jLabel5.setText("Chega de Sofrimento");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 420, 70));

        jLabel4.setFont(new java.awt.Font("Lucida Sans", 1, 28)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Busque o Montador mais próximo de você!");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 630, 90));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/montador-de-moveis-zona-sul-e-toda-so-paulo-D_NQ_NP_488615-MLB25270755282_012017-F (1).png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 440, 100, 210));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/Feito com PosterMyWall (1).png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 190, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/bc9cc868c6f6968a46014e24217a1b94.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 150));

        jScrollPane2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jTextPane2.setEditable(false);
        jTextPane2.setBackground(new java.awt.Color(255, 255, 51));
        jTextPane2.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        jTextPane2.setForeground(new java.awt.Color(51, 51, 51));
        jTextPane2.setText("A montagem do seu móvel novo é um fator de extrema importância, devendo tomar uma série de cuidados para não estragar o produto e preservar a segurança da sua família. O serviço de montagem é feito por parceiros cadastrados, e ainda conta com benefícios e condições especiais para você. Por isso, conte com o nossos parceiros para garantir o melhor resultado na montagem e comodidade para você!");
        jScrollPane2.setViewportView(jTextPane2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 380, 200));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/dicas-para-montagem-de-moveis-paciencia.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, -1, 460));

        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuBar1.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N
        jMenuBar1.setPreferredSize(new java.awt.Dimension(132, 50));

        jMenuAreadoMontador.setText("Área do Cliente");
        jMenuAreadoMontador.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N

        jMenuItem2.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N
        jMenuItem2.setText("Agendar Montagem");
        jMenuAreadoMontador.add(jMenuItem2);

        jMenuItem3.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N
        jMenuItem3.setText("Cancelar Montagem");
        jMenuAreadoMontador.add(jMenuItem3);

        jMenuItem4.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N
        jMenuItem4.setText("Cadastro Cliente");
        jMenuAreadoMontador.add(jMenuItem4);

        jMenuItem5.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N
        jMenuItem5.setText("Minhas Montagens");
        jMenuAreadoMontador.add(jMenuItem5);

        jMenuBar1.add(jMenuAreadoMontador);

        jMenuMontadores.setBorder(null);
        jMenuMontadores.setText("Área do Montador");
        jMenuMontadores.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N
        jMenuItem1.setText("Montagens Agendadas");
        jMenuMontadores.add(jMenuItem1);

        jMenuItem6.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N
        jMenuItem6.setText("Cancelar Montagem do Cliente");
        jMenuMontadores.add(jMenuItem6);

        jMenuItem7.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N
        jMenuItem7.setText("Cadastro Montador");
        jMenuMontadores.add(jMenuItem7);

        jMenuItem8.setText("Minhas Avaliações");
        jMenuMontadores.add(jMenuItem8);

        jMenuItem9.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N
        jMenuItem9.setText("Histórico");
        jMenuMontadores.add(jMenuItem9);

        jMenuBar1.add(jMenuMontadores);
        jMenuMontadores.getAccessibleContext().setAccessibleName("Área do Montador");

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenuAreadoMontador;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenu jMenuMontadores;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane2;
    // End of variables declaration//GEN-END:variables
}