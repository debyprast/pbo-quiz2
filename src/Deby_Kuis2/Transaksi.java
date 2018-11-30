/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deby_Kuis2;

import java.util.*;
/**
 *
 * @author sin
 */
public class Transaksi {

private Float total;
private final String code;
private  ArrayList<Item> items = new ArrayList<>();

    public Transaksi(String code, ArrayList<Item> items) {
        this.code = code;
        this.items = items;
    }
    
    public ArrayList<Item> getItems(){
        return items;
    }

    public void setItems(ArrayList<Item> items){
        this.items = items;
    }
    
    public float getTotal() {
        return total;
    }

    public void setTotal() {
        float totalAkhir=0;
        for (Item item:this.items){
            totalAkhir+=item.getTotal();
        }
        this.total=totalAkhir;
    }
  
    public String Pembayaran(){
        setTotal();
        String byr = "";
        byr += "Code\t\t : "+ this.code +"\n";
        byr += "Daftar Belanja : \n";
        for (Item item : this.items){
            byr += "\t" + item.getNama() + "(x" + item.getJumlah() + ") : " + item.getTotal() + "\n";
        }
        byr += "Total Belanja\t\t : " + this.total;
        return byr;
    }
}
