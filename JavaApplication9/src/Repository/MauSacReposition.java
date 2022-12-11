/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DomainModels.MauSac;
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
public class MauSacReposition {

    public List<MauSac> getAll() {
        String query = "SELECT [Id]\n"
                + "      ,[Ma]\n"
                + "      ,[Ten]\n"
                + "  FROM [dbo].[MauSac]";
        try ( Connection conn = SQLConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(query)) {
            List<MauSac> listMS = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                MauSac ms = new MauSac(rs.getString(1), rs.getString(2), rs.getString(3));
                listMS.add(ms);
            }
            return listMS;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public MauSac getOne(String tenMS) {
        String query = "SELECT [Id]\n"
                + "      ,[Ma]\n"
                + "      ,[Ten]\n"
                + "  FROM [dbo].[MauSac]\n"
                + "  WHERE Ten like ?";
        try ( Connection conn = SQLConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setObject(1, tenMS);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                MauSac ms = new MauSac(rs.getString(1), rs.getString(2), rs.getString(3));
                return ms;
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public boolean add(MauSac ms) {
        String query = "INSERT INTO [dbo].[MauSac]\n"
                + "           ([Ma]\n"
                + "           ,[Ten])\n"
                + "     VALUES\n"
                + "           (?,?)";
        int check = 0;
        try ( Connection conn = SQLConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setObject(1, ms.getMaMS());
            ps.setObject(2, ms.getTenMS());
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean update(MauSac ms, String idMS) {
        String query = "UPDATE [dbo].[MauSac]\n"
                + "   SET [Ma] = ?"
                + "      ,[Ten] = ?"
                + " WHERE Id like ?";
        int check = 0;
        try ( Connection conn = SQLConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setObject(1, ms.getMaMS());
            ps.setObject(2, ms.getTenMS());
            ps.setObject(3, idMS);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean delete(String ma) {
        String query = "DELETE FROM [dbo].[MauSac]\n"
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

    public List<MauSac> search(String ten) {
        String query = "SELECT [Id]\n"
                + "      ,[Ma]\n"
                + "      ,[Ten]\n"
                + "  FROM [dbo].[MauSac] where ten like ?";

        try ( Connection conn = SQLConnection.getConnection();  PreparedStatement ps = conn.prepareStatement(query)) {
            List<MauSac> listMS = new ArrayList<>();
            ps.setObject(1, ten);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                MauSac ms = new MauSac(rs.getString(1), rs.getString(2), rs.getString(3));
                listMS.add(ms);
            }
            return listMS;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
}
