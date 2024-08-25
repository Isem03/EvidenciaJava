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
public class verDatos {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/useradso";
        String user = "root";
        String password = "";
        
        // Establece la conexión y consulta todos los datos
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            String sql = "SELECT * FROM aprendizsena"; 
            try (Statement statement = connection.createStatement();
                 ResultSet resultSet = statement.executeQuery(sql)) {

                // Imprime los datos de cada registro
                while (resultSet.next()) {
                  
                    String nombre = resultSet.getString("nombre");
                    String cedula = resultSet.getString("cedula");

                    System.out.println("cedula: " + cedula + ", nombre: " + nombre);
                }
            }
        } catch (SQLException e) {
        }
    }
}
