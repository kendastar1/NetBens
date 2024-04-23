package Main;

import java.awt.Color;
import java.util.Random;

public class Matriz extends javax.swing.JFrame {
    
    public int matriz[][];
    public byte tamaño;
    
    public Matriz() {
        initComponents();
        
        setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.LIGHT_GRAY);
        
    }
    
    private String E1(int matriZ1[][]) {
        String K = "";
        
        for (byte a = 0; a < matriZ1.length; a++) {
            K = K + matriZ1[a][a] + "  ";
        }
        return K;
    }
    
    private String E2(int matriZ2[][]) {
        String KE = "";
        
        for (byte a = 0; a < matriZ2.length; a++) {
            for (byte b = 0; b < matriZ2.length; b++) {
                if (a + b == matriZ2.length - 1) {
                    KE = KE + matriZ2[a][b] + "  ";
                }
            }
        }
        return KE;
    }
    
    private String E3(int matriZ3[][]) {
        String OR = "";
        
        for (byte a = 0; a < matriZ3.length; a++) {
            for (byte b = 0; b < matriZ3.length; b++) {
                if (a < b) {
                    OR = OR + matriZ3[a][b] + "  ";
                }
            }
        }
        return OR;
    }
    
    private String E4(int matriZ4[][]) {
        String GE= "";
        
        for (byte a = 0; a < matriZ4.length; a++) {
            for (byte b = 0; b < matriZ4.length; b++) {
                if (a > b) {
                    GE = GE + matriZ4[a][b] + "  ";
                }
            }
        }
        return GE;
        
    }
    
    private String E5(int matriZ5[][]) {
        String LK = "";
        
        for (byte a = 0; a < matriZ5.length; a++) {
            for (byte b = 0; b < matriZ5.length; b++) {
                if ((a + b) < matriZ5.length - 1) {
                    LK = LK + matriZ5[a][b] + "  ";
                }
            }
        }
        return LK;
    }
    
    private String E6(int matriZ5[][]) {
        String MM = "";
        
        for (byte a = 0; a < matriZ5.length; a++) {
            for (byte b = 0; b < matriZ5.length; b++) {
                if ((a + b) > matriZ5.length - 1) {
                    MM = MM + matriZ5[a][b] + "  ";
                }
            }
        }
        return MM;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        TamañoNum = new javax.swing.JTextField();
        Generar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Matriz = new javax.swing.JTextArea();
        edp = new javax.swing.JLabel();
        Ep1 = new javax.swing.JLabel();
        eds = new javax.swing.JLabel();
        Es = new javax.swing.JLabel();
        eedp = new javax.swing.JLabel();
        ADP = new javax.swing.JLabel();
        eddp = new javax.swing.JLabel();
        DDp = new javax.swing.JLabel();
        eeds = new javax.swing.JLabel();
        Ads = new javax.swing.JLabel();
        edds = new javax.swing.JLabel();
        DDs = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setText("Tamaño de la Matriz");

        Generar.setText("Generate");
        Generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerarActionPerformed(evt);
            }
        });

        Matriz.setColumns(20);
        Matriz.setRows(5);
        Matriz.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jScrollPane1.setViewportView(Matriz);

        edp.setText("Diagonal Principal");

        Ep1.setBackground(new java.awt.Color(255, 255, 255));
        Ep1.setOpaque(true);

        eds.setText("Diagonal Secundaria");

        Es.setBackground(new java.awt.Color(255, 255, 255));
        Es.setOpaque(true);

        eedp.setText("Arriba de la Diagonal Principal");

        ADP.setBackground(new java.awt.Color(255, 255, 255));
        ADP.setOpaque(true);

        eddp.setText("Debajo de la Diagonal Principal");

        DDp.setBackground(new java.awt.Color(255, 255, 255));
        DDp.setOpaque(true);

        eeds.setText("Arriba de la Diagonal Secundaria");

        Ads.setBackground(new java.awt.Color(255, 255, 255));
        Ads.setOpaque(true);

        edds.setText("Debajo de la Diagonal Secundaria");

        DDs.setBackground(new java.awt.Color(255, 255, 255));
        DDs.setOpaque(true);

        jLabel2.setText("Matriz");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DDs, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                            .addComponent(Ep1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Es, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(eds, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(edp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(eedp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(eeds, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Ads, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ADP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DDp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(eddp)
                                    .addComponent(edds))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(61, 61, 61)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TamañoNum, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Generar))
                .addGap(45, 45, 45))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(TamañoNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(edp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Ep1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(eds)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Es, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(eedp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ADP, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(eddp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DDp, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eeds)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Ads, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(edds)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DDs, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Generar))
                .addContainerGap(247, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerarActionPerformed
        
        Random sdlg = new Random();
        
        this.tamaño = Byte.parseByte(this.TamañoNum.getText());
        
        matriz = new int[tamaño][tamaño];
        
        for (byte a = 0; a < this.matriz.length; a++) {
            for (byte b = 0; b < this.matriz.length; b++) {
                matriz[a][b] = sdlg.nextInt(100);
            }
        }
        
        String s = "";
        for (byte a = 0; a < matriz.length; a++) {
            s = s + " [  ";
            for (byte b = 0; b < matriz.length; b++) {
                s = s + String.valueOf(matriz[a][b]) + "  ";
            }
            s = s + "]\n\n";
        }
        
        this.Matriz.setText(s);
        
        this.Ep1.setText(E1(matriz));
        
        this.Es.setText(E2(matriz));
        
        this.ADP.setText(E3(matriz));
        
        this.DDp.setText(E4(matriz));
        
        this.Ads.setText(E5(matriz));
        
        this.DDs.setText(E6(matriz));
    }//GEN-LAST:event_GenerarActionPerformed
    
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
            java.util.logging.Logger.getLogger(Matriz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Matriz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Matriz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Matriz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Matriz().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ADP;
    private javax.swing.JLabel Ads;
    private javax.swing.JLabel DDp;
    private javax.swing.JLabel DDs;
    private javax.swing.JLabel Ep1;
    private javax.swing.JLabel Es;
    private javax.swing.JButton Generar;
    private javax.swing.JTextArea Matriz;
    private javax.swing.JTextField TamañoNum;
    private javax.swing.JLabel eddp;
    private javax.swing.JLabel edds;
    private javax.swing.JLabel edp;
    private javax.swing.JLabel eds;
    private javax.swing.JLabel eedp;
    private javax.swing.JLabel eeds;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
