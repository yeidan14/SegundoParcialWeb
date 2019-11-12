/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import com.mycompany.segudoprevio.controller.Conexion;
import com.mycompany.segudoprevio.dto.Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Daniel
 */
public class Listar implements I_Listar {

    Connection cn = Conexion.getConexion2();

    @Override
    public List<Persona> Personas() {
        List<Persona> listPersonas = new ArrayList<Persona>();
        try {
            String sql = "SELECT * FROM persona";
            PreparedStatement pstm = cn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();

            while (rs.next()) {
                String doc = rs.getString(1);
                String nombre = rs.getString(2);
                String apellidos = rs.getString(3);
                String emai = rs.getString(4);
                String edad = rs.getString(5);
                String nacionalidad = rs.getString(6);

                Persona p = new Persona(doc, nombre, apellidos, emai, edad, nacionalidad);

                listPersonas.add(p);
            }

        } catch (Exception e) {
        }
        return listPersonas;
    }

//    @Override
//    public List<Alumno> ListarAlumnosComputacion() {
//        List<Alumno> lstAlumnos = new ArrayList<Alumno>();
//        try {
//            String sql = "SELECT * FROM TBAlumno WHERE carrera = 'Computacion'"; 
//            PreparedStatement pstm = cn.prepareStatement(sql);
//            ResultSet rs = pstm.executeQuery();
//            
//            while(rs.next()){
//                int codigo = rs.getInt(1);
//                String nombre = rs.getString(2);
//                String carrera = rs.getString(3);
//                int edad = rs.getInt(4);
//                
//                Alumno alumno = new Alumno(codigo, nombre, carrera, edad);
//                
//                lstAlumnos.add(alumno);
//            }
//            
//        } catch (Exception e) {
//        }
//        return lstAlumnos;
//    }
}
