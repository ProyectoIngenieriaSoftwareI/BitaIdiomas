package co.edu.unbosque.Bitacora.Controller;

import java.sql.*;
public class Conexion {
public String bd = "mydb";
public String login = "root";
public String password = "sergio";
public String url = "jdbc:mysql://localhost/"+bd;

public Connection conectar() {
Connection con = null;
try {
Class.forName("org.gjt.mm.mysql.Driver");
con = DriverManager.getConnection(url, login, password);
    System.out.println("conexion establecida");
}
catch(SQLException ex) {
System.out.println("Rayos!!! Hubo un problema al conectar con la base "+url);
}
catch(ClassNotFoundException ex) {
System.out.println(ex);
}
   return con;
}
}