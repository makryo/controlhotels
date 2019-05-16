/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexion.Conexion;
import Constructores.Habitacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author iUser
 */
public class DaoHabitacion {

    public static boolean add(Habitacion habitacion) {
        Connection con;
        PreparedStatement ps;
        String sql = "insert into habitacion(numero,estado,tipo,precio) values(?,?,?,?)";

        try {
            con = Conexion.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, habitacion.getNumero());
            ps.setString(2, habitacion.getTipo());
            ps.setString(3, habitacion.getEstado());
            ps.setString(4, habitacion.getPrecio());
            ps.executeUpdate();
            con.close();
            return true;
        } catch (SQLException e) {
            System.out.println("Error al insertar " + e);
        }
        return false;
    }

    public static List<Habitacion> habitList() {
        List<Habitacion> list = new ArrayList<>();
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
        String sql = "select * from habitacion";

        try {
            con = Conexion.getConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                list.add(new Habitacion(
                        rs.getInt("id"),
                        rs.getString("numero"),
                        rs.getString("estado"),
                        rs.getString("tipo"),
                        rs.getString("precio")
                ));

            }

        } catch (SQLException e) {
            System.out.println("Error al mostrar " + e);
            list.clear();
        }
        return list;
    }

    public static boolean remove(int id) {
        Connection con;
        PreparedStatement ps;
        String sql = "delete from habitacion where id=?;";
        try {
            con = Conexion.getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            con.close();
            return true;
        } catch (SQLException e) {
            System.out.println("error al eliminar");
            return false;
        }
    }

    public static Habitacion getById(int id) {
        String sql = "select * from habitacion where id='"
                + id + "';";
        try {
            Habitacion hab;
            Connection con = Conexion.getConexion();
            PreparedStatement ps = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = ps.executeQuery();

            ps = con.prepareStatement(sql);

            rs.first();
            hab = new Habitacion(
                    rs.getInt("id"),
                    rs.getString("numero"),
                    rs.getString("estado"),
                    rs.getString("tipo"),
                    rs.getString("precio")
            );
            rs.close();
            ps.close();
            con.close();
            return hab;
        } catch (SQLException e) {
            System.out.println("error byId" + e.getMessage());
            return null;
        }
    }

    public static boolean update(Habitacion hab) {
        Connection con;
        PreparedStatement ps;
        String sql = "update habitacion set numero = ?, estado = ?, tipo = ?, precio = ?";
        int rowAffected;

        try {
            con = Conexion.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, hab.getNumero());
            ps.setString(2, hab.getEstado());
            ps.setString(3, hab.getTipo());
            ps.setString(4, hab.getPrecio());
            ps.setInt(5, hab.getId());
            rowAffected = ps.executeUpdate();
            return rowAffected == 1;
        } catch (SQLException e) {
            System.out.println("error update " + e.getMessage());
            return false;
        }
    }
}
