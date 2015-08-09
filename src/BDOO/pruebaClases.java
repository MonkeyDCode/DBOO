/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BDOO;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.query.Query;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JFrame;

/**
 *
 * @author alberto
 */
public class pruebaClases {
    
    public static void main(String[] args)
    {
        GregorianCalendar fecha = new GregorianCalendar();
        System.out.println(fecha.get(Calendar.DAY_OF_MONTH)+"/"+fecha.get(Calendar.MONTH)+"/"+fecha.get(Calendar.YEAR));
        PanelAltas a= new PanelAltas();
        PanelBajas b = new PanelBajas();
        PanelModificaciones m= new PanelModificaciones();
        PanelVentas v = new PanelVentas();
        PanelReporte r= new PanelReporte();
        Ptincipal ventana = new Ptincipal();
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ventana.pack();
       ventana.setVisible(true);
    }
}
