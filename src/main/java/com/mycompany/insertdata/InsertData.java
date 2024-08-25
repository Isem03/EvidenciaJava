/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.insertdata;

import java.sql.*;

public class InsertData {

   public static void main(String[] args) {
        // Configuración de la conexión a la base de datos
        String url = "jdbc:mysql://localhost:3306/useradso";
        String user = "root";
        String password = "";

        // Datos a insertar
        String dato1 = "224466";
        String dato2 = "Ponchito";

        // SQL para insertar los datos
        String sql = "INSERT INTO aprendizsena (cedula, nombre) VALUES (?, ?)";

        // Conexión y operaciones en la base de datos
        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            // Establece los valores en el PreparedStatement
            pstmt.setString(1, dato1);
            pstmt.setString(2, dato2);

            // Ejecuta la inserción
            int rowsAffected = pstmt.executeUpdate();
            System.out.println("Filas afectadas: " + rowsAffected);

        } catch (SQLException e) {
        }
    }
}
