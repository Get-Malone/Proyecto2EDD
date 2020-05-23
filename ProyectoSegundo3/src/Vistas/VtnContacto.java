/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Clases.ArbolBinario;
import Clases.Archivos;
import Clases.Multilistas;
import Clases.Nodo;
import Clases.NodoArbol;
import Clases.Propiedades;
import Clases.TablasHash;
import static Vistas.VtnGrupo.ab;
import static Vistas.VtnGrupo.rb;
import static Vistas.vtnChat.cd;
import cjb.ci.Mensaje;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author zgame
 */
public class VtnContacto extends javax.swing.JFrame {

    public String d; // DATO A BUSCAR
    public Nodo r1; //RAIZ DE LA MULTILISTA

    /**
     * Creates new form VtnContacto
     */
    public void transparenciaBotones() {
        jBRegresarC.setOpaque(false);
        jBRegresarC.setContentAreaFilled(false);
        jBRegresarC.setBorderPainted(false);

        jBAgregarC.setOpaque(false);
        jBAgregarC.setContentAreaFilled(false);
        jBAgregarC.setBorderPainted(false);

        jBEliminarC.setOpaque(false);
        jBEliminarC.setContentAreaFilled(false);
        jBEliminarC.setBorderPainted(false);

        jBMoverC.setOpaque(false);
        jBMoverC.setContentAreaFilled(false);
        jBMoverC.setBorderPainted(false);
    }

    public VtnContacto() {
        initComponents();
        this.setLocationRelativeTo(null); //CENTRA LA PANTALLA

        jLContactos.setForeground(Color.WHITE); //PONE EL COLOR DE LA ETIQUETA EN BLANCO
        JPContactos.setBackground(Color.WHITE);//PONE BLANCO EL COLOR DEL PANEL

        JPContactos.setLayout(new BoxLayout(JPContactos, BoxLayout.PAGE_AXIS));//CAMBIA EL ESTILO DE EL PANEL, PERMITE QUE LOS BOTONES NO OCUPEN TODA LA PANTALLA

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

        jLContactos = new javax.swing.JLabel();
        jBAgregarC = new javax.swing.JButton();
        jBEliminarC = new javax.swing.JButton();
        jBRegresarC = new javax.swing.JButton();
        jBMoverC = new javax.swing.JButton();
        jLEliminarC = new javax.swing.JLabel();
        jLMoverC = new javax.swing.JLabel();
        jLAgregarC = new javax.swing.JLabel();
        JPContactos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jBBusca = new javax.swing.JButton();
        jLFondoC = new javax.swing.JLabel();
        jLFondoC1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLContactos.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLContactos.setText("Contactos");
        getContentPane().add(jLContactos, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        jBAgregarC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregarCNuevo.png"))); // NOI18N
        jBAgregarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarCActionPerformed(evt);
            }
        });
        getContentPane().add(jBAgregarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 470, 57, -1));

        jBEliminarC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/borrarNuevo.png"))); // NOI18N
        jBEliminarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarCActionPerformed(evt);
            }
        });
        getContentPane().add(jBEliminarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, 56, -1));

        jBRegresarC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atrasNuevo.png"))); // NOI18N
        jBRegresarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRegresarCActionPerformed(evt);
            }
        });
        getContentPane().add(jBRegresarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        jBMoverC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/moverNuevo1.png"))); // NOI18N
        jBMoverC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBMoverCActionPerformed(evt);
            }
        });
        getContentPane().add(jBMoverC, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 470, 55, -1));

        jLEliminarC.setText("Eliminar");
        getContentPane().add(jLEliminarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 530, -1, -1));

        jLMoverC.setText("Mover");
        getContentPane().add(jLMoverC, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 530, -1, -1));

        jLAgregarC.setText("Agregar");
        getContentPane().add(jLAgregarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 530, -1, -1));

        JPContactos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JPContactos.setLayout(new java.awt.GridLayout(0, 1, 0, 1));
        getContentPane().add(JPContactos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 280, 360));

        jLabel1.setText("Busqueda");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 520, 60, 30));

        jBBusca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscarNuevo.png"))); // NOI18N
        jBBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscaActionPerformed(evt);
            }
        });
        getContentPane().add(jBBusca, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 470, 60, -1));

        jLFondoC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondowhats.png"))); // NOI18N
        getContentPane().add(jLFondoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        jLFondoC1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondowa.jpg"))); // NOI18N
        getContentPane().add(jLFondoC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBAgregarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarCActionPerformed

        System.out.println(d);

        String s = "";
        s = JOptionPane.showInputDialog("Escriba el nombre del contacto que desea agregar");
        if (s.length() == 0) {
            Mensaje.error(this, "Debe rellenar el campo");
        }
        if (s.length() != 0) {
            char ppC = s.charAt(0);///////////////////////////////////////////////////////////////////////////////////
            String pps = Character.toString(ppC);///////////Para insertar en la tabla Hash y en los ab////////////////

            Nodo con = new Nodo(null, s);
            String[] etqs = new String[2];
            etqs[0] = d;//toma el texto del boton que se eligio anteriorente
            etqs[1] = s;

            NodoArbol nomNA = new NodoArbol(pps, null, etqs);
            NodoArbol nomNAS = new NodoArbol(s, null, etqs);

            VtnGrupo.r = Multilistas.inserta(VtnGrupo.r, con, 0, etqs); //inserta

            int pos = TablasHash.posicion(nomNA);

            if (TablasHash.arr[pos] == null) {

//            rb = null;
                System.out.println(pos);

                TablasHash.arr[pos] = ab.inserta(rb, nomNA);///falta que inserte el primer dato, no lo inserta porque se borra

//            rb = TablasHash.arr[pos];
                ab.inserta(TablasHash.arr[pos], nomNAS);

                System.out.println("Muestra en el inserta" + TablasHash.arr[pos].getEtq());
            } else {

//                rb = TablasHash.arr[pos];
                ab.inserta(TablasHash.arr[pos], nomNAS);

                System.out.println(TablasHash.arr[pos].getEtq());

                System.out.println(ab.enOrden(rb));

                System.out.println("Muestra en el inserta" + TablasHash.arr[pos].getEtq());

//                System.out.println("Muestra en la raiz en nodo arbol"+ rb.getEtq());
            }

            Propiedades p = new Propiedades(cd, VtnGrupo.r, TablasHash.arr);

            try {
                Archivos.guardar(p, this);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(vtnChat.class.getName()).log(Level.SEVERE, null, ex);
            }

            r1 = Multilistas.busca(VtnGrupo.r, d); //buscar en donde vas a insertar
            r1 = r1.getAbj();//si
            JPContactos.removeAll();

            if (r1 != null) {
                Nodo aux = r1;
                while (aux != null) {
                    JButton boton = new JButton(aux.getEtq());

                    //boton.setLocation(50, 10);
                    boton.setBackground(Color.WHITE);//PONE EL FONDO DEL BOTON EN BLANCO
                    boton.setForeground(Color.BLACK);//PONE LAS LETRAS COLOR NEGRO
                    boton.setFont(new Font("arial", 1, 14));//CAMBIA LA FUENTE Y EL TAMAÑO

                    //ESTABLECE UN TAMAÑO POR DEFECTO PARA LOS BOTONES
                    boton.setMinimumSize(new Dimension(280, 50));
                    boton.setMaximumSize(new Dimension(280, 50));
                    boton.setPreferredSize(new Dimension(280, 50));

                    JPContactos.add(boton);
                    boton.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            VtnHistorial h = new VtnHistorial();
                            h.d1 = d;
                            h.d2 = boton.getText();
                            h.setVisible(true);
                        }
                    }
                    );
                    aux = aux.getSig();
                }
            }

            JPContactos.revalidate();
            JPContactos.repaint();

        }
    }//GEN-LAST:event_jBAgregarCActionPerformed

    private void jBMoverCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBMoverCActionPerformed

        String nom = ""; //nom=NOMBRE A BUSCAR
        String gpo = "";

        nom = JOptionPane.showInputDialog("Escriba el contacto que desea mover");
        if (nom.length() == 0) {
            Mensaje.error(this, "Los campos no deben estar vacios");
        }
        gpo = JOptionPane.showInputDialog("Escriba el grupo al que desea mover este contacto");
        if (gpo.length() == 0) {
            Mensaje.error(this, "Los campos no deben estar vacios");
        }
        if (nom.length() != 0 && gpo.length() != 0) {
            String[] etqsE = new String[2];
            etqsE[0] = d;
            etqsE[1] = nom;

            String[] etqsI = new String[2];
            etqsI[0] = gpo;
            etqsI[1] = nom;

            VtnGrupo.r = Multilistas.mover(VtnGrupo.r, 0, etqsE, etqsI);

            int pos = nom.toUpperCase().codePointAt(0) - 65;

            if (TablasHash.arr[pos] != null) {

                ArbolBinario aba = new ArbolBinario();

                NodoArbol aux = aba.busca(TablasHash.arr[pos], nom);

                if (aux != null) {

                    String[] muestra = new String[2];

                    muestra = aux.getPredecesores();

                    System.out.println(muestra[0]);
                    System.out.println(muestra[1]);

                    aux.setPredecesores(etqsI);

                    Propiedades p = new Propiedades(cd, VtnGrupo.r, TablasHash.arr);
                    try {
                        Archivos.guardar(p, this);
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(vtnChat.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }

            }
            r1 = Multilistas.busca(VtnGrupo.r, d);
            r1 = r1.getAbj();

            if (r1 != null) {
                Nodo aux = r1;
                while (aux != null) {
                    JButton boton = new JButton(aux.getEtq());
                    System.out.println("Etiqueta en aux " + aux.getEtq());
                    Component componentes[] = JPContactos.getComponents();

                    System.out.println("Etiqueta en etqE pos Contactos " + etqsE[1]);

                    for (int i = 0; i < componentes.length; i++) {
                        System.out.println(((JButton) componentes[i]).getText());
                        if (etqsE[1].equals(((JButton) componentes[i]).getText().trim())) {
                            JPContactos.remove(i);
                        }
                    }
                    boton.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            VtnHistorial h = new VtnHistorial();
                            h.d1 = d;
                            h.d2 = boton.getText();
                            h.setVisible(true);
                        }
                    }
                    );
                    aux = aux.getSig();
                }
            }

            JPContactos.revalidate();
            JPContactos.repaint();

        }
        System.out.println(Multilistas.desp(VtnGrupo.r, 0));

    }//GEN-LAST:event_jBMoverCActionPerformed

    private void jBEliminarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarCActionPerformed

        String s = "";

        s = JOptionPane.showInputDialog("Escriba el nombre del contacto que desea eliminar");
        if (s.length() == 0) {
            Mensaje.error(this, "Debe rellenar el campo");
        }
        if (s.length() != 0) {
            Nodo con = new Nodo(null, s);
            String[] etqs = new String[2];
            etqs[0] = d;
            etqs[1] = s;

            boolean c = false;

            if (cjb.ci.Mensaje.pregunta(this, "Eliminar grupo\nSe eliminaran los contactos "
                    + "y conversaciones asociados a este grupo\n¿Continuar?") == 0) {
                c = true;
            }
////////////////////////////////////////////////////esta liminacion ya esta correcta
            if (c) {
                VtnGrupo.r = Multilistas.elimina(VtnGrupo.r, 0, etqs);

                int pos = s.toUpperCase().codePointAt(0) - 65;

                if (TablasHash.arr[pos] != null) {

                    NodoArbol[] arrB = new NodoArbol[2];

                    ab.elimina(TablasHash.arr[pos], s, arrB);

                    Propiedades p = new Propiedades(cd, VtnGrupo.r, TablasHash.arr);

                    try {
                        Archivos.guardar(p, this);
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(vtnChat.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    Mensaje.error(this, "No hay datos en esta posicion del arreglo");
                }
            }

            r1 = Multilistas.busca(VtnGrupo.r, d);
            r1 = r1.getAbj();
//            JPContactos.removeAll();
            if (r1 != null) {
                Nodo aux = r1;
                while (aux != null) {
                    JButton boton = new JButton(aux.getEtq());
                    System.out.println("Etiqueta en aux " + aux.getEtq());
                    Component componentes[] = JPContactos.getComponents();

                    for (int i = 0; i < componentes.length; i++) {
                        System.out.println(((JButton) componentes[i]).getText());
                        if (etqs[1].equals(((JButton) componentes[i]).getText().trim())) {
                            JPContactos.remove(i);
                        }
                    }
                    boton.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            VtnHistorial h = new VtnHistorial();
                            h.d1 = d;
                            h.d2 = boton.getText();
                            h.setVisible(true);
                        }
                    }
                    );
                    aux = aux.getSig();
                }
            }

            if (c) {
                JPContactos.revalidate();
                JPContactos.repaint();
            }

        }
        System.out.println(Multilistas.desp(VtnGrupo.r, 0));
    }//GEN-LAST:event_jBEliminarCActionPerformed

    private void jBRegresarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRegresarCActionPerformed
        new VtnGrupo().setVisible(true);
        dispose();
        //this.setVisible(false);
    }//GEN-LAST:event_jBRegresarCActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        r1 = Multilistas.busca(VtnGrupo.r, d);
        r1 = r1.getAbj();
        JPContactos.removeAll();
        if (r1 != null) {
            Nodo aux = r1;
            while (aux != null) {
                JButton boton = new JButton(aux.getEtq());

                boton.setBackground(Color.WHITE);//PONE EL FONDO DEL BOTON EN BLANCO
                boton.setForeground(Color.BLACK);//PONE LAS LETRAS COLOR NEGRO
                boton.setFont(new Font("arial", 1, 14));//CAMBIA LA FUENTE Y EL TAMAÑO

                //ESTABLECE UN TAMAÑO POR DEFECTO PARA LOS BOTONES
                boton.setMinimumSize(new Dimension(280, 50));
                boton.setMaximumSize(new Dimension(280, 50));
                boton.setPreferredSize(new Dimension(280, 50));

                JPContactos.add(boton);
                boton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        VtnHistorial h = new VtnHistorial();
                        h.d1 = d;
                        h.d2 = boton.getText();
                        h.setVisible(true);
                        dispose();
                    }
                }
                );
                aux = aux.getSig();
            }
        }

//        ArbolBinario arbb = new ArbolBinario();
//        
//        NodoArbol aux = arbb.busca(TablasHash.arr[1], "Brayan");
//        
//        String [] guarda = aux.getPredecesores();
//        
//        System.out.println("Mostrando predesesores " + guarda[0] + "\n" +guarda[1]);
        
        JPContactos.revalidate();
        JPContactos.repaint();
//        System.out.println(TablasHash.muestra());
    }//GEN-LAST:event_formWindowOpened

    private void jBBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscaActionPerformed

        String s = "";
        s = JOptionPane.showInputDialog("Escriba el nombre del contacto que deseas buscar"); //ETIQUETA PARA LA CATEGORIA NUEVA

        if (s.length() == 0) {
            Mensaje.error(this, "Debe ecsribir un nombre");
        } else {

            char ppC = s.charAt(0);///////////////////////////////////////////////////////////////////////////////////
            String pps = Character.toString(ppC);///////////Para insertar en la tabla Hash y en los ab////////////////

            int pos = s.toUpperCase().codePointAt(0) - 65;

            if (TablasHash.arr[pos] != null) {

                ArbolBinario aba = new ArbolBinario();

                NodoArbol aux = aba.busca(TablasHash.arr[pos], s);

                if (aux != null) {

                    String[] pr = aux.getPredecesores();

                    String grupo = pr[0];
                    String contacto = pr[1];
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                    Nodo r2 = Multilistas.busca(VtnGrupo.r, grupo);

                    r2 = r2.getAbj();
                    r2 = Multilistas.busca(r2, contacto);

//                    JPHistorial.removeAll();
//                    r2 = r2.getAbj();
                    if (r2 != null) {
                        VtnHistorial h = new VtnHistorial();
                        h.d1 = grupo;
                        h.d2 = contacto;
                        h.setVisible(true);
                        dispose();
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

                    } else {

                        Mensaje.error(this, "No se encontro el dato");

                    }

                } else {

                    Mensaje.error(this, "No hay nada en la posicion " + pos + " del arreglo");

                }

            }

        }
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
            java.util.logging.Logger.getLogger(VtnContacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VtnContacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VtnContacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VtnContacto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VtnContacto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPContactos;
    private javax.swing.JButton jBAgregarC;
    private javax.swing.JButton jBBusca;
    private javax.swing.JButton jBEliminarC;
    private javax.swing.JButton jBMoverC;
    private javax.swing.JButton jBRegresarC;
    private javax.swing.JLabel jLAgregarC;
    private javax.swing.JLabel jLContactos;
    private javax.swing.JLabel jLEliminarC;
    private javax.swing.JLabel jLFondoC;
    private javax.swing.JLabel jLFondoC1;
    private javax.swing.JLabel jLMoverC;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
