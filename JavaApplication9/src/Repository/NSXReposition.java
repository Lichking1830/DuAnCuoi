/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DomainModels.NSX;
import Ultilities.SQLConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class NSXReposition {

    public List<NSX> getAll() {
        String query = "SELECT [Id]\n"
                + "      ,[Ma]\n"
                + "      ,[Ten]\n"
                + "  FROM [dbo].[NSX]";
        try ( Connection conn = SQLConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(query)) {
            List<NSX> listNSX = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                NSX nsx = new NSX(rs.getString(1), rs.getString(2), rs.getString(3));
                listNSX.add(nsx);
            }
            return listNSX;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public NSX getOne(String tenNSX) {
        String query = "SELECT [Id]\n"
                + "      ,[Ma]\n"
                + "      ,[Ten]\n"
                + "  FROM [dbo].[NSX]\n"
                + "  WHERE Ten like ?";
        try ( Connection conn = SQLConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setObject(1, tenNSX);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                NSX nsx = new NSX(rs.getString(1), rs.getString(2), rs.getString(3));
                return nsx;
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public boolean add(NSX nsx) {
        String query = "INSERT INTO [dbo].[NSX]\n"
                + "           ([Ma]\n"
                + "           ,[Ten])\n"
                + "     VALUES\n"
                + "           (?,?)";
        int check = 0;
        try ( Connection conn = SQLConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setObject(1, nsx.getMaNSX());
            ps.setObject(2, nsx.getTenNSX());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean update(NSX nsx, String idNSX) {
        String query = "UPDATE [dbo].[NSX]\n"
                + "   SET [Ma] = ?"
                + "      ,[Ten] = ?"
                + " WHERE Id like ?";
        int check = 0;
        try ( Connection conn = SQLConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setObject(1, nsx.getMaNSX());
            ps.setObject(2, nsx.getTenNSX());
            ps.setObject(3, idNSX);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean delete(String ma) {
        String query = "DELETE FROM [dbo].[NSX]\n"
                + "      WHERE ma like ?";
        int check = 0;
        try ( Connection conn = SQLConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setObject(1, ma);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public List<NSX> search(String ten) {
        String query = "SELECT [Id]\n"
                + "      ,[Ma]\n"
                + "      ,[Ten]\n"
                + "  FROM [dbo].[NSX] where ten like ?";
        try ( Connection conn = SQLConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(query)) {
            List<NSX> listNSX = new ArrayList<>();
            ps.setObject(1, ten);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                NSX nsx = new NSX(rs.getString(1), rs.getString(2), rs.getString(3));
                listNSX.add(nsx);
            }
            return listNSX;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
}
