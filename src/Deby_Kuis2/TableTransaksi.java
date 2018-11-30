/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deby_Kuis2;
import javax.swing.table.*;
/**
 *
 * @author sin
 */
public class TableTransaksi extends DefaultTableModel{
    private String[] kolom;//untuk menyimpan nama kolom
    public TableTransaksi(){ 
        this.kolom = new String[]{
            "Nama", "Harga", "Jumlah"
        };
    }
    
    public String[] getKolomNama(){//mengambil kolom nama
        return this.kolom;
    }
    
    @Override
    public String toString(){//convert
        return "TableTransaksi{"+"KolomNama"+kolom+"}";
    }

    public int getKeyListeners(){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
