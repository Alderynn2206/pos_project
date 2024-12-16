/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Entitas {
public String no_jual, id, tgl_jual, total, bayar, kembalian;
public String kdbrg, nmbrg, satuan, harga, jumlah, stokmin;
    Connection con;
    Statement st;
    ResultSet res;
    String sql;


   
    public String getNojual() {
        return no_jual;
    }

    public String getId() {
        return id;
           
    }public String getTglJual() {
        return tgl_jual;
    }
    
    public String getTotal() {
        return total;
    }
    public String getBayar() {
        return bayar;
    }
    public String getKembalian() {
        return kembalian;
    }
    
    public String getKdbrg(){
        return kdbrg;
    }
    
    public String getNmbrg(){
        return nmbrg;
    }
    
    public String getSatuan(){
        return satuan;
    }
    
    public String getJumlah(){
        return jumlah;
    }
    
    public String getStokmin(){
        return stokmin;
    }
    
    public void setNoJual(String no_jual) {
        this.no_jual = no_jual;
    }

    public void setId(String id) {
        this.id = id;
    }
   
    public void setTglJual(String tgl_jual) {
        this.tgl_jual = tgl_jual;
    }
    
    public void setTotal(String total) {
        this.total = total;
    }
    
    public void setBayar(String bayar) {
        this.bayar = bayar;
    }
    
    public void setKembalian(String kembalian) {
        this.kembalian = kembalian;
    } 
}
