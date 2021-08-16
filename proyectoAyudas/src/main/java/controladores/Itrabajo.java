/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.util.List;
import modelos.Alumno;
import modelos.Trabajo;
import modelos.Tutor;

public interface Itrabajo {
    
    public List<Trabajo> listarTrabajos_Alumno(int idAlumno); 
    public List<Trabajo> listarTrabajos_Tutor(Tutor tutor); 
    
}
