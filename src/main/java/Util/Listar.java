/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import com.mycompany.segudoprevio.controller.Conexion;
import com.mycompany.segudoprevio.dto.Empleado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Daniel
 */
public class Listar implements I_Listar {

    Connection cn = Conexion.getConexion2();

    @Override
    public Empleado BuscarEmpleado(String cod) {
        Empleado n =new Empleado();
        try {
            String sql = "SELECT * FROM empleado";
            PreparedStatement pstm = cn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();

            while (rs.next()) {
                String codigo = rs.getString(1);
                String cedula = rs.getString(2);
                String nombre = rs.getString(3);
                Date fn = rs.getDate(4);
                Date fi = rs.getDate(5);
                Date fr = rs.getDate(6);

               n.setCodigo(codigo);
               n.setCedula(cedula);
               n.setNombre(nombre);
               n.setFechanacimiento(fn);
               n.setFechaingreso(fi);
               n.setFecharetiro(fr);

              
            }

        } catch (Exception e) {
        }
        return n;
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
