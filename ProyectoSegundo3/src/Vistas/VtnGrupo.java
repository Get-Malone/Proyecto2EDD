<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Clases.Multilistas;
import Clases.Nodo;
import Clases.NodoArbol;
import cjb.ci.Mensaje;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author zgame
 */
public class VtnGrupo extends javax.swing.JFrame {

    public static Nodo r = null;//RAIZ

    /**
     * Creates new form VtnGrupos
     */
    public VtnGrupo() {
        initComponents();
        this.setLocationRelativeTo(null); // CENTRA LA PANTALLA
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLGrupos = new javax.swing.JLabel();
        jBAgregarG = new javax.swing.JButton();
        jBEliminarG = new javax.swing.JButton();
        jLAgregarG = new javax.swing.JLabel();
        jLEliminarG = new javax.swing.JLabel();
        JPGrupos = new javax.swing.JPanel();
        jBBusca = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLGrupos.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLGrupos.setText("Grupos");

        jBAgregarG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregarg50.jpg"))); // NOI18N
        jBAgregarG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarGActionPerformed(evt);
            }
        });

        jBEliminarG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/elimina50.jpg"))); // NOI18N
        jBEliminarG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarGActionPerformed(evt);
            }
        });

        jLAgregarG.setText("Agregar");

        jLEliminarG.setText("Eliminar");

        JPGrupos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JPGrupos.setLayout(new java.awt.GridLayout(0, 1, 0, 1));

        jBBusca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar50.png"))); // NOI18N
        jBBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscaActionPerformed(evt);
            }
        });

        jLabel1.setText("Busqueda");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLGrupos))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(JPGrupos, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLEliminarG)
                                .addGap(31, 31, 31)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBEliminarG, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jBBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBAgregarG, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLAgregarG, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLGrupos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(JPGrupos, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBEliminarG)
                    .addComponent(jBBusca)
                    .addComponent(jBAgregarG))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLEliminarG)
                    .addComponent(jLAgregarG)
                    .addComponent(jLabel1))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBAgregarGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarGActionPerformed

        //PRUEBA DE COMMIT
        
        String s = "";
        s = JOptionPane.showInputDialog("Escriba el nombre de la categoria a añadir"); //ETIQUETA PARA LA CATEGORIA NUEVA

        if (s.length() == 0) {
            Mensaje.error(this, "Debe ecsribir un nombre");
        } else {
            Nodo nom = new Nodo(null, s);

            String[] etqs = new String[1];//arreglo de etiquetas

            etqs[0] = s;

            r = Multilistas.inserta(r, nom, 0, etqs);

            if (r != null) {
                Nodo aux = r;

                JPGrupos.removeAll();

                while (aux != null) {
                    JButton boton = new JButton(aux.getEtq());
                    JPGrupos.add(boton);

                    boton.addActionListener(new ActionListener()//pone una accion al boton
                    {
                        @Override
                        public void actionPerformed(ActionEvent e)//accion del boton
                        {
                            VtnContacto c = new VtnContacto();
                            c.d = boton.getText();
                            c.setVisible(true);

                        }
                    });
                    aux = aux.getSig();
                }

            }

            JPGrupos.revalidate();
            JPGrupos.repaint();
        }


    }//GEN-LAST:event_jBAgregarGActionPerformed

    private void jBEliminarGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarGActionPerformed
        
        String s = "";
        
        s = JOptionPane.showInputDialog("Escriba el nombre de la categoria a eliminar"); //ETIQUETA PARA LA CATEGORIA NUEVA

        if (s.length() == 0) {
            Mensaje.error(this, "Debe escribir un nombre");
        } else {
            Nodo nom = new Nodo(null, s);

            String[] etqs = new String[1];//arreglo de etiquetas

            etqs[0] = s;

            r = Multilistas.elimina(r, 0, etqs);

            if (r != null) {
                Nodo aux = r;
                
                while (aux != null) {

                    JButton boton = new JButton(aux.getEtq());

                    Component componentes[] = JPGrupos.getComponents();

                    for (int i = 0; i < componentes.length; i++) {
                        System.out.println(((JButton) componentes[i]).getText());
                        if (etqs[0].equals(((JButton) componentes[i]).getText().trim())) {
                            JPGrupos.remove(i);
                        }
                    }

                    boton.addActionListener(new ActionListener()//pone una accion al boton
                    {
                        @Override
                        public void actionPerformed(ActionEvent e)//accion del boton
                        {
                            VtnContacto c = new VtnContacto();
                            c.d = boton.getText();
                            c.setVisible(false);

                        }
                    });
                    aux = aux.getSig();
                }

            }

            JPGrupos.revalidate();
            JPGrupos.repaint();
        }
        
        System.out.println(Multilistas.desp(r, 0));
    }//GEN-LAST:event_jBEliminarGActionPerformed

    private void jBBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscaActionPerformed
        
        
            
        
    }//GEN-LAST:event_jBBuscaActionPerformed
        
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
            java.util.logging.Logger.getLogger(VtnGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VtnGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VtnGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VtnGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VtnGrupo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPGrupos;
    private javax.swing.JButton jBAgregarG;
    private javax.swing.JButton jBBusca;
    private javax.swing.JButton jBEliminarG;
    private javax.swing.JLabel jLAgregarG;
    private javax.swing.JLabel jLEliminarG;
    private javax.swing.JLabel jLGrupos;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Clases.Multilistas;
import Clases.Nodo;
import cjb.ci.Mensaje;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author zgame
 */
public class VtnGrupo extends javax.swing.JFrame {

    public static Nodo r = null;//RAIZ

    /**
     * Creates new form VtnGrupos
     */
    public VtnGrupo() {
        initComponents();
        this.setLocationRelativeTo(null); // CENTRA LA PANTALLA
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLGrupos = new javax.swing.JLabel();
        jBAgregarG = new javax.swing.JButton();
        jBEliminarG = new javax.swing.JButton();
        jLAgregarG = new javax.swing.JLabel();
        jLEliminarG = new javax.swing.JLabel();
        JPGrupos = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLGrupos.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLGrupos.setText("Grupos");

        jBAgregarG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregarg50.jpg"))); // NOI18N
        jBAgregarG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarGActionPerformed(evt);
            }
        });

        jBEliminarG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/elimina50.jpg"))); // NOI18N
        jBEliminarG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarGActionPerformed(evt);
            }
        });

        jLAgregarG.setText("Agregar");

        jLEliminarG.setText("Eliminar");

        JPGrupos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JPGrupos.setLayout(new java.awt.GridLayout(0, 1, 0, 1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jBEliminarG, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLEliminarG))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(jLAgregarG))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jBAgregarG, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLGrupos)
                                .addGap(93, 93, 93))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(JPGrupos, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLGrupos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(JPGrupos, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBEliminarG)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLEliminarG)
                            .addComponent(jLAgregarG)))
                    .addComponent(jBAgregarG))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBAgregarGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarGActionPerformed

        String s = "";
        s = JOptionPane.showInputDialog("Escriba el nombre de la categoria a añadir"); //ETIQUETA PARA LA CATEGORIA NUEVA

        if (s.length() == 0) {
            Mensaje.error(this, "Debe ecsribir un nombre");
        } else {
            Nodo nom = new Nodo(null, s);

            String[] etqs = new String[1];//arreglo de etiquetas

            etqs[0] = s;

            r = Multilistas.inserta(r, nom, 0, etqs);

            if (r != null) {
                Nodo aux = r;

                JPGrupos.removeAll();

                while (aux != null) {
                    JButton boton = new JButton(aux.getEtq());
                    JPGrupos.add(boton);

                    boton.addActionListener(new ActionListener()//pone una accion al boton
                    {
                        @Override
                        public void actionPerformed(ActionEvent e)//accion del boton
                        {
                            VtnContacto c = new VtnContacto();
                            c.d = boton.getText();
                            c.setVisible(true);

                        }
                    });
                    aux = aux.getSig();
                }

            }

            JPGrupos.revalidate();
            JPGrupos.repaint();
        }


    }//GEN-LAST:event_jBAgregarGActionPerformed

    private void jBEliminarGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarGActionPerformed
        
        String s = "";
        
        s = JOptionPane.showInputDialog("Escriba el nombre de la categoria a eliminar"); //ETIQUETA PARA LA CATEGORIA NUEVA

        if (s.length() == 0) {
            Mensaje.error(this, "Debe escribir un nombre");
        } else {
            Nodo nom = new Nodo(null, s);

            String[] etqs = new String[1];//arreglo de etiquetas

            etqs[0] = s;

            r = Multilistas.elimina(r, 0, etqs);

            if (r != null) {
                Nodo aux = r;
                
                while (aux != null) {

                    JButton boton = new JButton(aux.getEtq());

                    Component componentes[] = JPGrupos.getComponents();

                    for (int i = 0; i < componentes.length; i++) {
                        System.out.println(((JButton) componentes[i]).getText());
                        if (etqs[0].equals(((JButton) componentes[i]).getText().trim())) {
                            JPGrupos.remove(i);
                        }
                    }

                    boton.addActionListener(new ActionListener()//pone una accion al boton
                    {
                        @Override
                        public void actionPerformed(ActionEvent e)//accion del boton
                        {
                            VtnContacto c = new VtnContacto();
                            c.d = boton.getText();
                            c.setVisible(false);

                        }
                    });
                    aux = aux.getSig();
                }

            }

            JPGrupos.revalidate();
            JPGrupos.repaint();
        }
        
        System.out.println(Multilistas.desp(r, 0));
    }//GEN-LAST:event_jBEliminarGActionPerformed

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
            java.util.logging.Logger.getLogger(VtnGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VtnGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VtnGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VtnGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VtnGrupo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPGrupos;
    private javax.swing.JButton jBAgregarG;
    private javax.swing.JButton jBEliminarG;
    private javax.swing.JLabel jLAgregarG;
    private javax.swing.JLabel jLEliminarG;
    private javax.swing.JLabel jLGrupos;
    // End of variables declaration//GEN-END:variables
}
>>>>>>> parent of 1daf498... V3.2
