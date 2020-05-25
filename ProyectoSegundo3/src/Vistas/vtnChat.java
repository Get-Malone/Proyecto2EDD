/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Clases.Archivos;
import Clases.ColaDinamica;
import Clases.Multilistas;
import Clases.Nodo;
import Clases.PilaDinamica;
import Clases.Propiedades;
import Clases.TablasHash;
import cjb.ci.CtrlInterfaz;
import cjb.ci.Mensaje;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import cjb.ci.Validaciones;
import java.awt.Color;

/**
 *
 * @author josea
 */
public class vtnChat extends javax.swing.JFrame {

    PilaDinamica pdd = new PilaDinamica();
    PilaDinamica pdi = new PilaDinamica();
    public ColaDinamica cd = new ColaDinamica();
//    ColaDinamica auxCd;

    String s = "";
    public Nodo raiz;
    public String d1;
    public String d2;
    public String d3;

    public void transparenciaBotones() {
        jBRegresar.setOpaque(false);
        jBRegresar.setContentAreaFilled(false);
        jBRegresar.setBorderPainted(false);
    }

    /**
     * Creates new form vtnChat
     */
    public vtnChat() {
        initComponents();

        transparenciaBotones();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jpFondo = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtaConvDer = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtaConvIzq = new javax.swing.JTextArea();
        tfMsjDer = new javax.swing.JTextField();
        btnEnviarDer = new javax.swing.JButton();
        tfMsjIzq = new javax.swing.JTextField();
        btnEnviarIzq = new javax.swing.JButton();
        btnOrdenar = new javax.swing.JToggleButton();
        btnBusca = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jBRegresar = new javax.swing.JButton();
        jLFondoArriba = new javax.swing.JLabel();
        jLFondo = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jpFondo.setBackground(new java.awt.Color(255, 255, 255));
        jpFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtaConvDer.setEditable(false);
        jtaConvDer.setBackground(new java.awt.Color(238, 236, 236));
        jtaConvDer.setColumns(20);
        jtaConvDer.setRows(5);
        jtaConvDer.setAutoscrolls(false);
        jtaConvDer.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane2.setViewportView(jtaConvDer);

        jpFondo.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 210, 450));

        jtaConvIzq.setEditable(false);
        jtaConvIzq.setBackground(new java.awt.Color(238, 236, 236));
        jtaConvIzq.setColumns(20);
        jtaConvIzq.setRows(5);
        jtaConvIzq.setAutoscrolls(false);
        jScrollPane3.setViewportView(jtaConvIzq);

        jpFondo.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 210, 450));

        tfMsjDer.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tfMsjDer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMsjDerActionPerformed(evt);
            }
        });
        tfMsjDer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfMsjDerKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfMsjDerKeyTyped(evt);
            }
        });
        jpFondo.add(tfMsjDer, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 210, 150, 27));

        btnEnviarDer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/enviarNuevo.png"))); // NOI18N
        btnEnviarDer.setBorderPainted(false);
        btnEnviarDer.setContentAreaFilled(false);
        btnEnviarDer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarDerActionPerformed(evt);
            }
        });
        btnEnviarDer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnEnviarDerKeyPressed(evt);
            }
        });
        jpFondo.add(btnEnviarDer, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 200, 50, 46));

        tfMsjIzq.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tfMsjIzq.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfMsjIzqKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfMsjIzqKeyTyped(evt);
            }
        });
        jpFondo.add(tfMsjIzq, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 140, 27));

        btnEnviarIzq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/enviarNuevo.png"))); // NOI18N
        btnEnviarIzq.setBorderPainted(false);
        btnEnviarIzq.setContentAreaFilled(false);
        btnEnviarIzq.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEnviarIzqMouseClicked(evt);
            }
        });
        btnEnviarIzq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarIzqActionPerformed(evt);
            }
        });
        btnEnviarIzq.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnEnviarIzqKeyPressed(evt);
            }
        });
        jpFondo.add(btnEnviarIzq, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 51, 46));

        btnOrdenar.setForeground(new java.awt.Color(255, 255, 255));
        btnOrdenar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/25612.png"))); // NOI18N
        btnOrdenar.setBorderPainted(false);
        btnOrdenar.setContentAreaFilled(false);
        btnOrdenar.setEnabled(false);
        btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarActionPerformed(evt);
            }
        });
        jpFondo.add(btnOrdenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, -1, -1));

        btnBusca.setForeground(new java.awt.Color(255, 255, 255));
        btnBusca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/64673.png"))); // NOI18N
        btnBusca.setSelected(true);
        btnBusca.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnBusca.setBorderPainted(false);
        btnBusca.setContentAreaFilled(false);
        btnBusca.setEnabled(false);
        btnBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaActionPerformed(evt);
            }
        });
        jpFondo.add(btnBusca, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 10, 59, 60));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Chat");
        jpFondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 14, 90, 50));

        jBRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atrasNuevo.png"))); // NOI18N
        jBRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRegresarActionPerformed(evt);
            }
        });
        jpFondo.add(jBRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 50, 30));

        jLFondoArriba.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoarribawa.jpg"))); // NOI18N
        jpFondo.add(jLFondoArriba, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoHorizontal.jpg"))); // NOI18N
        jLFondo.setText("jLabel1");
        jpFondo.add(jLFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 850, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarDerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarDerActionPerformed
        PilaDinamica aux = new PilaDinamica();
        Nodo an = null;

        Nodo n = new Nodo(2, tfMsjDer.getText());

        aux.Inserta(n);

        an = aux.Elimina();
        pdd.Inserta(an);//inserta en la pila derecha***********************************

        cd.Inserta(an);

        System.out.println("Esto se inserta en la pila der" + an.getObj().toString());

        jtaConvDer.setText(jtaConvDer.getText() + an.getObj().toString() + "\n");

        if (jtaConvIzq.getText().isEmpty()) {
            jtaConvIzq.setText("\n");
            CtrlInterfaz.habilita(true, btnBusca);
        } else {
            jtaConvIzq.setText(jtaConvIzq.getText() + "\n");
        }
        CtrlInterfaz.limpia(tfMsjDer);
        CtrlInterfaz.cambia(tfMsjDer);
        //CtrlInterfaz.habilita(false, btnBusca);
        btnBusca.setEnabled(rootPaneCheckingEnabled);
        btnOrdenar.setEnabled(rootPaneCheckingEnabled);
    }//GEN-LAST:event_btnEnviarDerActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            Archivos.carga(this);
        } catch (IOException ex) {
            Logger.getLogger(vtnChat.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(vtnChat.class.getName()).log(Level.SEVERE, null, ex);
        }

        String s = "";
        raiz = Multilistas.busca(VtnGrupo.r, d1);
        System.out.println(raiz.getEtq());
        raiz = raiz.getAbj();
        raiz = Multilistas.busca(raiz, d2);
        System.out.println(raiz.getEtq());
//        s = raiz.getEtq();
        raiz = raiz.getAbj();
        raiz = Multilistas.busca(raiz, d3);
        System.out.println(raiz.getEtq());
        if (raiz.getObj() != null) {
            cd = (ColaDinamica) raiz.getObj();
//            TNombre.setText(s);
//            texto();
        } //else
//        {
//            cd = new ColaDinamica();
//        }
        ColaDinamica cdt = new ColaDinamica();
        String si = "";
        String sd = "";
        Nodo aux = null;

        while (cd.getFrente() != null) {
            aux = cd.Elimina();
            if (aux.getTipo() == 1) {
                si += aux.getObj().toString() + "\n";
                sd += "\n";
                cdt.Inserta(aux);
                //CtrlInterfaz.habilita(false, btnBusca);
                btnBusca.setEnabled(rootPaneCheckingEnabled);
                btnOrdenar.setEnabled(rootPaneCheckingEnabled);
            } else {
                sd += aux.getObj().toString() + "\n";
                si += "\n";
                cdt.Inserta(aux);
                //CtrlInterfaz.habilita(false, btnBusca);
                btnBusca.setEnabled(rootPaneCheckingEnabled);
                btnOrdenar.setEnabled(rootPaneCheckingEnabled);
            }
        }

        cd = cdt;

        if (sd.equals("") || si.equals("")) {
            System.out.println("No hay datos que mostrar");
        }
        jtaConvIzq.setText(si);
        jtaConvDer.setText(sd);
    }//GEN-LAST:event_formWindowOpened

    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed

        PilaDinamica pila1 = new PilaDinamica();//para ordenar la cola
        PilaDinamica pila2 = new PilaDinamica();
        ColaDinamica cdt = new ColaDinamica();//para la cola mostrar en los textfield, y evitar que se pierdan datos en la cola
        Nodo aux = null;
        Nodo aux2 = null;
        //para la cola mostrar en los textfield, y evitar que se pierdan datos en la cola
        String si = "";
        String sd = "";
        Nodo auxC = null;

        while (cd.getFrente() != null) {
            aux = (Nodo) cd.Elimina();

            while (pila1.getTope() != null) {
                aux2 = pila1.Elimina();
                if (aux.getTipo() == 1) {
                    if (aux.getObj().toString().compareToIgnoreCase(aux2.getObj().toString()) < 0) {
                        pila1.Inserta(aux2);
                        break;
                    } else {
                        pila2.Inserta(aux2);
                    }
                } else {
                    if (aux.getObj().toString().compareToIgnoreCase(aux2.getObj().toString()) < 0) {
                        pila1.Inserta(aux2);
                        break;
                    } else {
                        pila2.Inserta(aux2);
                    }
                }
            }
            pila1.Inserta(aux);
            while (pila2.getTope() != null) {
                pila1.Inserta(pila2.Elimina());
            }
        }

        while (pila1.getTope() != null) {
            cd.Inserta(pila1.Elimina());
        }

        while (cd.getFrente() != null) {
            auxC = cd.Elimina();
            if (auxC.getTipo() == 1) {
                si += auxC.getObj().toString() + "\n";
                sd += "\n";
                cdt.Inserta(auxC);
            } else {
                sd += auxC.getObj().toString() + "\n";
                si += "\n";
                cdt.Inserta(auxC);
            }
        }

        cd = cdt;

        if (sd.equals("") || si.equals("")) {
            System.out.println("No hay datos que mostrar");
        }
        jtaConvIzq.setText(si);
        jtaConvDer.setText(sd);

        System.out.println("Ordenamiento exitoso");
        Mensaje.exito(this, "Cola de productos ordenada");
    }//GEN-LAST:event_btnOrdenarActionPerformed

    private void btnEnviarIzqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarIzqActionPerformed
        PilaDinamica aux2 = new PilaDinamica();
        Nodo ani = null;

        Nodo x = new Nodo(1, tfMsjIzq.getText());

        aux2.Inserta(x);

        ani = aux2.Elimina();
        pdi.Inserta(ani); //lo inserta en la pila izquierda
        cd.Inserta(ani);
        System.out.println("Esto se inserta en la pila izq" + ani.getObj().toString());

        jtaConvIzq.setText(jtaConvIzq.getText() + ani.getObj().toString() + "\n");
        if (jtaConvDer.getText().isEmpty()) {
            jtaConvDer.setText("\n");
            CtrlInterfaz.habilita(true, btnBusca);
        } else {
            jtaConvDer.setText(jtaConvDer.getText() + "\n");
        }
        CtrlInterfaz.limpia(tfMsjIzq);
        CtrlInterfaz.cambia(tfMsjIzq);
        //CtrlInterfaz.habilita(false, btnBusca);
        btnBusca.setEnabled(rootPaneCheckingEnabled);
        btnOrdenar.setEnabled(rootPaneCheckingEnabled);
    }//GEN-LAST:event_btnEnviarIzqActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

        Propiedades p = new Propiedades(VtnGrupo.r, TablasHash.arr);
        try {
            Archivos.guardar(p, this);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(vtnChat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowClosing

    private void btnBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaActionPerformed
        //propiedad del principe mestizo xdxdxdxdx
        new vtnBusca().setVisible(true);
    }//GEN-LAST:event_btnBuscaActionPerformed

    private void tfMsjDerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMsjDerActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_tfMsjDerActionPerformed

    private void btnEnviarDerKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnEnviarDerKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyChar() == '\n') {
            btnEnviarDerActionPerformed(null);
        }

    }//GEN-LAST:event_btnEnviarDerKeyPressed

    private void tfMsjDerKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfMsjDerKeyPressed
        // TODO add your handling code here:
        Validaciones.enter(this, evt, btnEnviarDer);
    }//GEN-LAST:event_tfMsjDerKeyPressed

    private void tfMsjDerKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfMsjDerKeyTyped
        // TODO add your handling code here:
        if (tfMsjDer.getText().length() == 30) {
            evt.consume();
        }
    }//GEN-LAST:event_tfMsjDerKeyTyped

    private void tfMsjIzqKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfMsjIzqKeyPressed
        // TODO add your handling code here:
        Validaciones.enter(this, evt, btnEnviarIzq);
    }//GEN-LAST:event_tfMsjIzqKeyPressed

    private void tfMsjIzqKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfMsjIzqKeyTyped
        // TODO add your handling code here:
        if (tfMsjIzq.getText().length() == 30) {
            evt.consume();
        }
    }//GEN-LAST:event_tfMsjIzqKeyTyped

    private void btnEnviarIzqKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnEnviarIzqKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyChar() == '\n') {
            btnEnviarIzqActionPerformed(null);
        }
    }//GEN-LAST:event_btnEnviarIzqKeyPressed

    private void btnEnviarIzqMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnviarIzqMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEnviarIzqMouseClicked

    private void jBRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRegresarActionPerformed
        raiz.setObj(cd);
        Propiedades p = new Propiedades(VtnGrupo.r, TablasHash.arr);
        try {
            Archivos.guardar(p, this);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(vtnChat.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
    }//GEN-LAST:event_jBRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(vtnChat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vtnChat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vtnChat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vtnChat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vtnChat().setVisible(true);
            }
        });
    }

    public void InsertaPilasaCola(int tipo, Nodo n) {

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnBusca;
    private javax.swing.JButton btnEnviarDer;
    private javax.swing.JButton btnEnviarIzq;
    private javax.swing.JToggleButton btnOrdenar;
    private javax.swing.JButton jBRegresar;
    private javax.swing.JLabel jLFondo;
    private javax.swing.JLabel jLFondoArriba;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel jpFondo;
    private javax.swing.JTextArea jtaConvDer;
    private javax.swing.JTextArea jtaConvIzq;
    private javax.swing.JTextField tfMsjDer;
    private javax.swing.JTextField tfMsjIzq;
    // End of variables declaration//GEN-END:variables
}
