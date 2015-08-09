/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BDOO;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;

/**
 *
 * @author alberto
 */
public class Ptincipal extends JFrame{
    VentanaLogin vLogin;
    PanelAltas altas;
    PanelBajas bajas;
    PanelModificaciones modif;
    PanelReporte report;
    PanelVentas ventas;
    
    CardLayout cardLO;
    JPanel panel1;
    JMenu peliculas;
    JMenuBar menu1;
    
    JRadioButtonMenuItem Alta;
    JRadioButtonMenuItem Baja;
    JRadioButtonMenuItem Modi;
    JRadioButtonMenuItem Venta;
    JRadioButtonMenuItem Reporte; 
    ButtonGroup bGroup1;
    
    public Ptincipal()
    {
        super();
        init();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }

    private void init() {
        
        vLogin=new VentanaLogin();
        altas = new PanelAltas();
        bajas = new PanelBajas();
        modif = new PanelModificaciones();
        report = new PanelReporte();
        ventas = new PanelVentas();
        
        cardLO = new CardLayout();
        peliculas = new JMenu("Peliculas");
        panel1=new JPanel();
        menu1=new JMenuBar();
        
        Alta=new JRadioButtonMenuItem("Agregar Pelicula");
        Baja=new JRadioButtonMenuItem("Eliminar Pelicula");
        Modi=new JRadioButtonMenuItem("Editar Pelicula");
        Venta=new JRadioButtonMenuItem("Vender Pelicula");
        Reporte=new JRadioButtonMenuItem("Reporte general de Ventas");
        bGroup1=new ButtonGroup();
        bGroup1.add(Alta);
        bGroup1.add(Baja);
        bGroup1.add(Modi);
        bGroup1.add(Venta);
        bGroup1.add(Reporte);
        menu1.add(peliculas);
        peliculas.add(Alta);
        peliculas.add(Baja);
        peliculas.add(Modi);
        peliculas.add(Venta);
        peliculas.add(Reporte);
        panel1.setLayout(cardLO);
        this.getContentPane().setLayout(new BorderLayout());
        panel1.add(vLogin,"Login");
        panel1.add(altas,"Agregar peliculas");
        panel1.add(bajas,"Eliminar peliculas");
        panel1.add(modif,"Editar peliculas");
        panel1.add(ventas,"Vender peliculas");
        panel1.add(report,"Reporte");
        
        setJMenuBar(menu1);
        menu1.setVisible(false);
        setContentPane(panel1);
        setSize(new Dimension(400,300));

        vLogin.getLogin().addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                iniciaSesion(); //To change body of generated methods, choose Tools | Templates.
            }   
        });        
        Alta.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                AgregarPel();
            }
        });
        Baja.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                EliminarPel();
            }
        });
        Modi.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                EditarPel();
            }
        });
        Venta.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                VenderPel();
            }
        });
        Reporte.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ReportePel();
            }
        });
  
    }
    
    private void iniciaSesion() {
        String user =vLogin.getUser().getText();
        String pass =String.valueOf(vLogin.getPassword().getPassword());
        if (user.equals("usuario")&& pass.equals("password")){
            cardLO.next(panel1);
            this.setSize(new Dimension(484,462));
            menu1.setVisible(true);
            System.out.println("Si funciono");
        }  
        else {
            JOptionPane.showMessageDialog(this, "Usuario y/o contraseña no validos","ERROR",JOptionPane.ERROR_MESSAGE);
        }

    }
    private void AgregarPel()
    {
        this.setSize(new Dimension(429,483));
        cardLO.show(panel1,"Agregar peliculas");
    }
    
    private void EliminarPel(){
        this.setSize(new Dimension(550,483));
        cardLO.show(panel1,"Eliminar peliculas");
    }
    
    private void EditarPel(){
        this.setSize(new Dimension(550,483));
        cardLO.show(panel1,"Editar peliculas");
    }
    
    private void VenderPel()
    {
        this.setSize(new Dimension(429,483));
        cardLO.show(panel1,"Vender peliculas");
    }
    private void ReportePel()
    {
        this.setSize(new Dimension(700,483));
        cardLO.show(panel1,"Reporte");
    }
}