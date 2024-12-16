package method;

import entity.Entitas;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Control {
    Connection con=null;
    Statement st=null;
    ResultSet rs=null;
    String sql=null;

    public Control(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_transaksi","root","");
            st=con.createStatement();
        }catch(Exception a){
            JOptionPane.showMessageDialog(null, "Koneksi Database Gagal, Terjadi kesalahaan Pada : \n"+a);
        }
    }

    public List tampil(){
        List logBarang = new ArrayList();       
        sql="select no_jual from jual order by id_jual asc";
        try{
            rs=st.executeQuery(sql);

            while(rs.next()){
                Entitas eb=new Entitas();
                eb.setNoJual(rs.getString("no_jual"));               
                logBarang.add(eb);
            }
        } catch(SQLException a){
            JOptionPane.showMessageDialog(null, "Terjadi kesalahaan tampil, pada :\n"+a);
        }
        return logBarang;
    }
    
    private static Connection mysqlconfig;
    public static Connection Koneksi()throws SQLException{
        try {
            String url="jdbc:mysql://localhost:3306/db_transaksi"; //url database
            String user="root"; //user database
            String pass=""; //pass word database
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlconfig=DriverManager.getConnection(url, user, pass);            
        } catch (SQLException e) {
            System.err.println("koneksi gagal "+e.getMessage()); //perintah menampilkan error pada koneksi
        }
        return mysqlconfig;
    }
    
}
