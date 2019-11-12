/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import com.mycompany.segudoprevio.controller.Conexion;
import com.mycompany.segudoprevio.dao.PersonaJpaController;
import com.mycompany.segudoprevio.dto.Persona;

/**
 *
 * @author Daniel
 */
public class prueba {
    
        public static void main(String[] args) throws Exception {
           Conexion con = Conexion.getConexion();
    PersonaJpaController n= new  PersonaJpaController(con.getBd());
  
           
//    Persona per= new Persona("1098102072", "yeison daniel", "Manrique", "yeidan@gmail.com", "23", "Colombiano");
//    n.create(per);
n.destroy("1098102072");
        System.out.println("eliminado");
    }
    
    
}
