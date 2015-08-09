/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BDOO;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author alberto
 */
public class PanelVentas extends javax.swing.JPanel {

    /**
     * Creates new form PanelVentas
     */
    public PanelVentas() {
        initComponents();
        textAño.setEditable(false);
        textDirector.setEditable(false);
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
        jLabel3 = new javax.swing.JLabel();
        comboNombres = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        textDirector = new javax.swing.JTextField();
        textAño = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        comboGenero.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "horror", "ciencia ficcion", "comedia", "belica", "romantica", "accion", "biograficas", "drama", "musicales", "documentales" }));
        comboGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboGeneroActionPerformed(evt);
            }
        });

        jLabel3.setText("Director");

        comboNombres.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "" }));
        comboNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboNombresActionPerformed(evt);
            }
        });

        jLabel2.setText("NOMBRE");

        jLabel6.setText("Genero");

        jLabel4.setText("Año");

        jLabel1.setText("VENTAS");

        jButton1.setText("Vender");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textDirector)
                                    .addComponent(comboNombres, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textAño)
                                    .addComponent(comboGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(comboGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textDirector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnCancelar))
                .addGap(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void comboGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboGeneroActionPerformed
        textDirector.setText("");
        
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
            
            textAño.setText("");
        }
        textDirector.setText("");
        textAño.setText("");

    }//GEN-LAST:event_comboGeneroActionPerformed

    private void comboNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboNombresActionPerformed
        textDirector.setText("");
        textAño.setText("");
        if(comboNombres.getSelectedIndex()!=0)
        {
            String nombre =(String )comboNombres.getSelectedItem();
            Video pelicula = VideosBD.consultaDatos(nombre);
            if(pelicula!=null)
            {
                textDirector.setText(pelicula.getDirector());
                textAño.setText(pelicula.getAño());
            }
        }
    }//GEN-LAST:event_comboNombresActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        textDirector.setText("");
        textAño.setText("");
        comboGenero.setSelectedIndex(0);
        comboNombres.setSelectedIndex(0);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nombre = (String) comboNombres.getSelectedItem();
        Video vi = VideosBD.consultaDatos(nombre);
        try
        {
            int cantidad =Integer.parseInt(vi.getCantidad());
            if(cantidad > 0)
            {
                String cantNew = Integer.toString(cantidad-1);
                boolean y =VideosBD.baja(vi.getNombre(), vi.getDirector(), vi.getAño(), vi.getGenero(), vi.getCantidad());
                if(y)
                {
                    boolean x=VideosBD.alta(nombre,textDirector.getText(),
                            textAño.getText(),comboGenero.getSelectedItem().toString(),cantNew);
                    if(x)
                    {
                        GregorianCalendar fecha = new GregorianCalendar();
                        String date =fecha.get(Calendar.DAY_OF_MONTH)+"/"+fecha.get(Calendar.MONTH)+"/"+fecha.get(Calendar.YEAR);

                        String genero = comboGenero.getSelectedItem().toString();
                        System.out.println(genero);
                        boolean z=VendidosBD.alta(nombre, textDirector.getText(),
                                textAño.getText(),genero , date);
                        if (z)
                        {
                            JOptionPane.showMessageDialog(this, "Venta realizada con exito");
                            textDirector.setText("");
                            textAño.setText("");
                            comboGenero.setSelectedIndex(0);
                            comboNombres.setSelectedIndex(0);
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(this, "Error en la venta");
                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(this, "Error");
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Error");
                }
            
            
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Agotado");
                textDirector.setText("");
                textAño.setText("");
                comboGenero.setSelectedIndex(0);
                comboNombres.setSelectedIndex(0);
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, "Error");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox comboGenero;
    private javax.swing.JComboBox comboNombres;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField textAño;
    private javax.swing.JTextField textDirector;
    // End of variables declaration//GEN-END:variables
}
