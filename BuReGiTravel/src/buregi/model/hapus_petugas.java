/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buregi.model;

import com.sun.xml.internal.ws.handler.HandlerException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Resa Yudha
 */
public class hapus_petugas {
    public Connection koneksi;
    public boolean hapuspetugas;
    
    public boolean hapuspetugas(String idktp){
        koneksi = new koneksiDataBase().condb();
        try{
            String sql ="delete from karyawan where id_ktp='"+idktp+"'";
            Statement stat = (Statement) koneksi.createStatement();
            stat.executeUpdate(sql);
            return hapuspetugas = true;
        }catch(SQLException | HandlerException ex){
            JOptionPane.showMessageDialog(null,"Terjadi Kesalahan"+ ex);
            return hapuspetugas = false;
        }
    }
}
