/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;
import java.util.List;
import logica.EquipoTrabajo;
/**
 *
 * @author Cristo Te Ama...!!
 */
public interface EquipoTrabajoDAO {
    String writeFile(EquipoTrabajo equipoTrabajo) throws Exception;
    EquipoTrabajo queryFile(int queryData) throws Exception;
    //String Modificar(EquipoTrabajo equipoTrabajo) throws Exception;
    //String Eliminar(String id) throws Exception;
}
