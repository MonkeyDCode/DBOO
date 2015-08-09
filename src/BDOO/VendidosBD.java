/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BDOO;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;

/**
 *
 * @author alberto
 */
public class VendidosBD {
    
    public static boolean alta( String nombre, String director, String año, String genero,String fecha)
    {
        ObjectContainer db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(),"ArchivoVentas");
        
        try
        {
            Vendidos v=new Vendidos(nombre,director,año,genero,fecha);
            
            db.store(v);
            db.close();
            return true;
        }
        catch(Exception e)
        {
            db.close();
            return false;
        }
        
       
    }
    
}
