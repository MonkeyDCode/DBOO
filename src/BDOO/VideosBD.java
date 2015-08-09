/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BDOO;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.ext.DatabaseClosedException;
import com.db4o.query.Query;

/**
 *
 * @author alberto
 */
public class VideosBD {
    
    
    public static boolean alta( String nombre, String director, String año, String genero,String cantidad)
    {
        ObjectContainer db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(),"ArchivoVideo");
        
        try
        {
            Video v=new Video(nombre,director,año,genero,cantidad);
            
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
    
    public static boolean baja( String nombre, String director, String año, String genero,String cantidad)
    {
        ObjectContainer db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(),"ArchivoVideo");
        try
        {
            
            
            ObjectSet result2 = db.queryByExample(new Video(nombre, director, año, genero,cantidad));
            Video o3 =(Video)result2.next();
            
            db.delete(o3);
            db.close();
            return true;
        }
        catch(Exception e)
        {
            db.close();
            return false;
        }
        
    }
    
    
    public static boolean modif( String nombreAnterior,String nombre, String director, String año, String genero,String cantidad)
    {
        ObjectContainer db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(),"ArchivoVideo");
        try
        {
            
            
            ObjectSet result = db.queryByExample(new Video(nombreAnterior));
            Video v =(Video)result.next();
            db.delete(v);
            Video vnew=new Video(nombre,director,año,genero,cantidad);
            db.store(vnew);
            db.close();
            return true;
        }
        catch(Exception e)
        {
            db.close();
            return false;
        }
    }
    
    public static String[] nombresPeliculasGenero(String genero)
    {
        ObjectContainer db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(),"ArchivoVideo");
            String[] a=new String[1000];
            try
            {
                    
                    Query q =db.query();
                    q.constrain(Video.class);
                    ObjectSet result =q.execute();
                    Video r;
                    int i =0;
                    while(result.hasNext())
                    {
                        r=(Video) result.next();
                        if(r.getGenero().equals(genero))
                        {
                            a[i]=r.getNombre();
                            i++;
                        }
                    }
                    db.close();
                    return a;
            }
            catch(DatabaseClosedException e)
            {
                return null;
            }
    }
    
    public static Video consultaDatos(String nombre)
    {
        ObjectContainer db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(),"ArchivoVideo");
            
            try
            {
                    
                
            ObjectSet result = db.queryByExample(new Video(nombre));
            Video v =(Video)result.next();
                    
                    db.close();
                    return v;
            }
            catch(DatabaseClosedException e)
            {
                return null;
            }
    }

    public static Video[] consulta()
        {
            ObjectContainer db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(),"ArchivoVideo");
            
            try
            {
                
                    Query q =db.query();
                    q.constrain(Video.class);
                    ObjectSet result =q.execute();
                    Video[] resu= new Video[1000];
                    int i=0;
                    while(result.hasNext())
                    {
                        resu[i]=(Video)result.next();
                        i++;

                    }
                    return resu;
                
                    
                //db.close();
                
            }
            catch(DatabaseClosedException e)
            {
                return null;
            }
        
        }
    public static boolean isPelicula(String nombre)
    {
        ObjectContainer db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(),"ArchivoVideo");
        boolean flag =false;    
            try
            {
                
                    Query q =db.query();
                    q.constrain(Video.class);
                    ObjectSet result =q.execute();
                    Video resu;
                   
                    while(result.hasNext())
                    {
                        resu=(Video)result.next();
                        if(resu.getNombre().equals(nombre))
                        {
                            flag=true;
                            break;
                        }
                        

                    }
                    db.close();
                    return flag;
                
                    
                //
                
            }
            catch(DatabaseClosedException e)
            {
                return false;
            }
    }
    }
    

