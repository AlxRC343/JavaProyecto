package DAO;

import DTO.DTODatos;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAOConection {

    Connection conexion;
    List<DTODatos> listadatos = new ArrayList<DTODatos>();
    DTODatos datos;

    private void abrir() {
        String usuario = "AlxCote";
        String contra = "Giltirspark343.";
        String rutaconexion = "jdbc:mysql://localhost:3306/test1?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(rutaconexion, usuario, contra);
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public boolean insertar(DTODatos datosDTO) {
        boolean estado = true;
        try {
            abrir();
            PreparedStatement consulta = conexion.prepareStatement("INSERT INTO datos(ApeP, ApeM, Nombre, Matricula, Modelo) value (?,?,?,?,?)");
            consulta.setString(1, datosDTO.getApeP());
            consulta.setString(2, datosDTO.getApeM());
            consulta.setString(3, datosDTO.getNombre());
            consulta.setString(4, datosDTO.getMatricula());
            consulta.setString(5, datosDTO.getModelo());
            consulta.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
            estado = false;
        }
        return estado;
    }

}
