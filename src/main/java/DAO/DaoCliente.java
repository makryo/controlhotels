/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import Constructores.Cliente;
import Conexion.Conexion;
import Constructores.Logs;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import static java.sql.ResultSet.TYPE_SCROLL_SENSITIVE;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author iUser
 */
public class DaoCliente {

    public static boolean add(Cliente cliente) {
        Connection con;
        PreparedStatement ps;
        String sql = "insert into cliente (nombre,telefono,direccion, estado) "
                + "values('"
                + cliente.getNombre() + "','"
                + cliente.getTelefono() + "','"
                + cliente.getDireccion() + "','"
                + cliente.getEstado() + "');";

        try {

            con = Conexion.getConexion();
            Statement stmt;
            stmt = (Statement) con.createStatement();
            stmt.executeUpdate(sql);
            return true;

        } catch (SQLException e) {
            System.out.println("error al insertar " + e);
        }
        return false;
    }

    public static List<Cliente> clienteList() {
        List<Cliente> list = new ArrayList<>();
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
        String sql = "select * from cliente;";

        try {
            con = Conexion.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                list.add(new Cliente(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("telefono"),
                        rs.getString("direccion"),
                        rs.getString("estado")));
            }
            return list;
        } catch (SQLException e) {
            System.out.println("Error al mostrar " + e);
            list.clear();

        }

        return null;
    }

    public static boolean remove(int id) throws ClassNotFoundException {
        Connection con;
        PreparedStatement ps;
        String sql = "delete from cliente where id=?";
        try {
            con = Conexion.getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            con.close();
            return true;
        } catch (SQLException e) {
            System.out.println("error al borrar " + e);
            return false;
        }
    }

    public static Cliente getById(int id) {

        String sql = "select * from cliente where id='"
                + id+"';";

        try {
            Cliente client;
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = ps.executeQuery();

            ps = con.prepareStatement(sql);

            //ps.setInt(1, id);

            rs.first();
            client = new Cliente(
                    rs.getInt("id"),
                    rs.getString("nombre"),
                    rs.getString("telefono"),
                    rs.getString("direccion"),
                    rs.getString("estado")
            );
            rs.close();
            ps.close();
            con.close();
            return client;
        } catch (SQLException e) {
            System.out.println("error byId, " + e.getMessage());
            return null;
        }
    }

    public static boolean update(Cliente cli, int id) {
        Connection con;
        PreparedStatement ps;
        String sql = "update cliente set nombre = ?, direccion = ?, telefono = ?, estado = ? where id = '"
                + cli.getId()+"'";
        int rowAffected;

        try {
            con = Conexion.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, cli.getNombre());
            ps.setString(2, cli.getDireccion());
            ps.setString(3, cli.getTelefono());
            ps.setString(4, cli.getEstado());
            //ps.setInt(5, cli.getId());
            rowAffected = ps.executeUpdate();

            return rowAffected == 1;
        } catch (SQLException e) {
            System.out.println("error update " + e.getMessage());
            return false;
        }

    }

    public static Logs setLogin(String logi) {
        String sql = "select * from login where usuario='"
                + logi + "';";
        try {
            Connection con = Conexion.getConexion();
            PreparedStatement stem = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stem.executeQuery();

            rs.first();
            Logs loge = new Logs(
                    rs.getString("usuario"),
                    rs.getString("pass"));
            return loge;
        } catch (SQLException e) {
            System.out.println("error en el login " + e);
            return null;
        }
    }

}
