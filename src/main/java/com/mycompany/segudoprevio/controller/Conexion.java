/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.segudoprevio.controller;

/**
 *
 * @author Daniel
 */
import java.sql.Connection;
import java.sql.DriverManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author estudiante
 */
public class Conexion {
    
    private static Conexion conexion;
    private final EntityManagerFactory bd; 

    private  Conexion() {
        this.bd=Persistence.createEntityManagerFactory("SegundoP");
        
    }
    
    
    public static Conexion getConexion()
    {
        if(conexion==null)
        {
            conexion=new Conexion();
        }
    return conexion;
    }

    public EntityManagerFactory getBd() {
        return bd;
    }
    
     public static Connection getConexion2(){
        Connection cn = null;
        try {
        //?useUnicode=true&amp;useJDBCCompliantTimezoneShift=true&amp;useLegacyDatetimeCode=false&amp;serverTimezone=UTC
            String url = "jdbc:mysql://localhost:3306/segundo_parcial";
            String Driver = "com.mysql.jdbc.Driver";
            String user = "root";
            String clave = "";
            Class.forName(Driver);
            cn = DriverManager.getConnection(url, user, clave);
            
        } catch (Exception e) {
            
            
            System.err.println("error en conexion" +e);
        }
        return cn;
    } 
    
    
}
