/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BDOO;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author alberto
 */
public class PanelModificaciones extends javax.swing.JPanel {
    
    private Video antiguo;
    private String nombreAntiguo;
    /**
     * Creates new form PanelModificaciones
     */
    public PanelModificaciones() {
        initComponents();
        btnModificar.setVisible(false);
        btnEditar.setVisible(false);
        textnewNombre.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comboGenero = new javax.swing.JComboBox();
        textCantidad = new javax.swing.JTextField();
        textAño = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnModificar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        comboNombres = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        textDirector = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();
        textnewNombre = new javax.swing.JTextField();

        comboGenero.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "horror", "ciencia ficcion", "comedia", "belica", "romantica", "accion", "biograficas", "drama", "musicales", "documentales" }));
        comboGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboGeneroActionPerformed(evt);
            }
        });

        textCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textCantidadKeyTyped(evt);
            }
        });

        textAño.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textAñoKeyTyped(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel5.setText("Cantidad");

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        jLabel4.setText("Año");

        jLabel6.setText("Genero");

        jLabel2.setText("NOMBRE");

        jLabel1.setText("MODIFICAR UNA PELICULA");

        comboNombres.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "" }));
        comboNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboNombresActionPerformed(evt);
            }
        });

        jLabel3.setText("Director");

        textDirector.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textDirectorKeyTyped(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        textnewNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textnewNombreKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(185, 185, 185))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(textAño, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                            .addComponent(textCantidad, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textDirector))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(btnModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar)
                        .addGap(136, 136, 136))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textnewNombre)
                                    .addComponent(comboNombres, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(comboGenero, 0, 291, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(comboGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditar))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(3, 3, 3)))
                .addComponent(textnewNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textDirector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(textCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificar)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void comboGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboGeneroActionPerformed
        textDirector.setText("");
        textCantidad.setText("");
        textAño.setText("");
        if(comboGenero.getSelectedIndex()!=0)
        {
            comboNombres.removeAllItems();
            String genero = (String) comboGenero.getSelectedItem();
            String[] peliculas = VideosBD.nombresPeliculasGenero(genero);
            comboNombres.addItem("");
            for (int i =0;i<peliculas.length;i++)
            {
                if(peliculas[i]!=null)
                {
                    comboNombres.addItem(peliculas[i]);
                }
            }
            textDirector.setText("");
            textCantidad.setText("");
            textAño.setText("");
            btnEditar.setVisible(false);
        }
        textDirector.setText("");
        textCantidad.setText("");
        textAño.setText("");
        btnEditar.setVisible(false);

    }//GEN-LAST:event_comboGeneroActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        textDirector.setText("");
        textCantidad.setText("");
        textAño.setText("");
        comboGenero.setSelectedIndex(0);
        comboNombres.setSelectedIndex(0);
        btnModificar.setVisible(false);
        textnewNombre.setVisible(false);
        btnEditar.setVisible(false);
        comboNombres.setVisible(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        antiguo=VideosBD.consultaDatos(nombreAntiguo);
        String nombre= textnewNombre.getText();
        String director=textDirector.getText();
        String año=textAño.getText();
        String genero= (String) comboGenero.getSelectedItem();
        String cantidad=textCantidad.getText();
        if(!nombre.equals("")
                    && !director.equals("")
                    && !año.equals("") && año.length()==4
                    && !cantidad.equals("")
                    && comboGenero.getSelectedIndex()>0)
        {
                        boolean y =VideosBD.baja(antiguo.getNombre(), antiguo.getDirector()
                                , antiguo.getAño(), antiguo.getGenero(), antiguo.getCantidad());
                        if(y)
                        {

                                boolean x =VideosBD.alta(nombre, director, año, genero, cantidad);
                                if(x)
                                {
                                    JOptionPane.showMessageDialog(this,"La pelicla se modifico con exito");
                                    textDirector.setText("");
                                    textCantidad.setText("");
                                    textAño.setText("");
                                    comboGenero.setSelectedIndex(0);
                                    comboNombres.setSelectedIndex(0);
                                    btnModificar.setVisible(false);
                                    btnEditar.setVisible(false);
                                    textnewNombre.setVisible(false);
                                    comboNombres.setVisible(true);
                                }
                                else
                                {
                                    JOptionPane.showMessageDialog(this,"Error al modificar la pelicula");
                                }
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(this,"Error al modificar la pelicula");
                        }
        }
        else
        {
                JOptionPane.showMessageDialog(this,"Revisa todos los campos");
        }
        
    }//GEN-LAST:event_btnModificarActionPerformed

    private void comboNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboNombresActionPerformed
        textDirector.setText("");
        textCantidad.setText("");
        textAño.setText("");
        if(comboNombres.getSelectedIndex()!=0)
        {
            String nombre =(String )comboNombres.getSelectedItem();
            Video pelicula = VideosBD.consultaDatos(nombre);
            if(pelicula!=null)
            {
                textDirector.setText(pelicula.getDirector());
                textCantidad.setText(pelicula.getCantidad());
                textAño.setText(pelicula.getAño());
                btnEditar.setVisible(true);
            }
        }
    }//GEN-LAST:event_comboNombresActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        btnEditar.setVisible(false);
        btnModificar.setVisible(true);
        comboNombres.setVisible(false);
        textnewNombre.setVisible(true);
        nombreAntiguo = (String) comboNombres.getSelectedItem();
        textnewNombre.setText(nombreAntiguo);
        
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void textnewNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textnewNombreKeyTyped
        // TODO add your handling code here:
        char car = evt.getKeyChar();    
        if((car<'a' || car>'z') && (car<'A' || car>'Z')
        && (car!=(char)KeyEvent.VK_SPACE) && (car<'0' || car>'9'))
        {
            evt.consume();
        }
    }//GEN-LAST:event_textnewNombreKeyTyped

    private void textDirectorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textDirectorKeyTyped
        // TODO add your handling code here:
        char car = evt.getKeyChar();    
        if((car<'a' || car>'z') && (car<'A' || car>'Z')
        && (car!=(char)KeyEvent.VK_SPACE))
        {
            evt.consume();
        }
    }//GEN-LAST:event_textDirectorKeyTyped

    private void textAñoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textAñoKeyTyped
        char car = evt.getKeyChar();
        String a = textAño.getText();
       
        
        if(a.length()>=4)
        {
            evt.consume();
        }
        else
        {
            if( (car<'0' || car>'9'))
                {
                    evt.consume();
                }
            
            else
            {
                int año =0;
            
            if(a.length()>0)
                 año =Integer.parseInt(a+car);
            
            if(año>2014)
            {
                evt.consume();
            }
            
            }
        }
    }//GEN-LAST:event_textAñoKeyTyped

    private void textCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textCantidadKeyTyped
        char car = evt.getKeyChar();
        if( (car<'0' || car>'9'))
                {
                    evt.consume();
                }
    }//GEN-LAST:event_textCantidadKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox comboGenero;
    private javax.swing.JComboBox comboNombres;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField textAño;
    private javax.swing.JTextField textCantidad;
    private javax.swing.JTextField textDirector;
    private javax.swing.JTextField textnewNombre;
    // End of variables declaration//GEN-END:variables
}
