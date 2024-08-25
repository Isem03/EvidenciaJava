/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.insertdata;
import java.sql.*;
/**
 *
 * @author IsaiasDev
 */
public class deleteData {
     public static void main(String[] args) {
        // Configuración de la conexión a la base de datos
        String url = "jdbc:mysql://localhost:3306/useradso";
        String user = "root";
        String password = "";

        // Datos a insertar
        String dato1 = "224466";
        

        // SQL para insertar los datos
       String sql = "DELETE FROM aprendizsena WHERE cedula = ?";

        // Conexión y operaciones en la base de datos
        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // Establece los valores en el PreparedStatement
            pstmt.setString(1, dato1);
            

            // Ejecuta la inserción
            int rowsAffected = pstmt.executeUpdate();
            System.out.println("Filas afectadas: " + rowsAffected);

        } catch (SQLException e) {
        }
    }
}
