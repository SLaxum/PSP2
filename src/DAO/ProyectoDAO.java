package DAO;
import logica.Proyecto;
import java.util.List;

//Interfaz que se implementa en la clase proyectoData,
//  con los metodos necesarios para el manejo de datos.
public interface ProyectoDAO {
    String writeFile (Proyecto proyecto) throws Exception;
    Proyecto queryFile(int queryData) throws Exception;
    List<Proyecto> readFile() throws Exception;
    String writeFileEquipo(Proyecto proyecto) throws Exception ;
    String writeFileTarea(Proyecto proyecto) throws Exception;
    //String Modificar(Tarea tarea) throws Exception;
    //String Eliminar(String id) throws Exception;
}