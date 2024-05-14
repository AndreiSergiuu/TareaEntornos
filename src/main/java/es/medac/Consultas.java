package es.medac;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Consultas {

    public Consultas() {
    }

    /*
        1.- Sergio esta trabajando para la empresa Medac, siendo el encargado de desarrollar la
        plataforma online. Actualmente estan desarrollando una sección para poder observar el
        total de alumnos que tienen seleccionados.
        Se te solicitá desarrollar un metodo que tenga las siguientes caracteristicas:
         */
    public ArrayList<Personas> obtenerTodasLasPersonas(){

        ArrayList<Personas> listaPersonas = new ArrayList<>();
        String query = "SELECT * FROM PERSONAS";

        try{
            Conexion conexion = new Conexion();
            Statement stm = conexion.getConexion().createStatement();
            ResultSet resultSet = stm.executeQuery(query);

            while(resultSet.next()){
                int id = resultSet.getInt("id");
                String nombre = resultSet.getString("nombre");
                int edad = resultSet.getInt("edad");
                String profesor = resultSet.getString("profesor");

                listaPersonas.add(new Personas(id,nombre,edad,profesor));

            }

            conexion.cerrarConexion();
            stm.close();
            resultSet.close();


        }catch (SQLException error){
            System.out.println("Ha sucedido un error " + error.toString());
        }

        return listaPersonas;
    }

    /*
    2.- Una vez terminada la caracteristica anterior, se quieré crear una sección en la cual un
    profesor puedan ver sus alumnos. Sergio vuelve a ser el encargado, y tiene que tener en
    cuenta las siguientes características.
     */
    public ArrayList<Personas> obtenerTodasLasPersonasPorProfesor(String profesorDeseado){
        ArrayList<Personas> listaPersonas = new ArrayList<>();

        String query = "SELECT * FROM PERSONAS WHERE PROFESOR = ?";

        try{
            Conexion conexion = new Conexion();
            PreparedStatement preparedStatement = conexion.getConexion().prepareStatement(query);
            preparedStatement.setString(1, profesorDeseado);
            ResultSet resultSet = preparedStatement.executeQuery();

            while(resultSet.next()){
                int id = resultSet.getInt("id");
                String nombre = resultSet.getString("nombre");
                int edad = resultSet.getInt("edad");
                String profesor = resultSet.getString("profesor");

                listaPersonas.add(new Personas(id,nombre,edad,profesor));
            }

            conexion.cerrarConexion();
            preparedStatement.close();
            resultSet.close();

        }catch (SQLException error){
            System.out.println("Ha sucedido un error " + error.toString());
        }



        return listaPersonas;
    }




}
