/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deby_Kuis2;

/**
 *
 * @author sin
 */
public class Item {
    private String nama;
    private float harga;
    private int jumlah;

    public Item(String nama, int jumlah) {
        this.nama = nama;
        this.jumlah = jumlah;
    }

    
    public Item(String nama, float harga, int jumlah) {
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
        switch (nama){
            case "Gula" : this.harga = 30000;
            break;
            case "Susu" : this.harga = 20000;
            break;
            case "Kopi" : this.harga = 10000;
            break;
            case "Teh" : this.harga = 5000;
            break;
        }
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public float getHarga() {
        return harga;
    }

    public void setHarga(float harga) {
        this.harga = harga;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
    
    public float getTotal(){
        return this.harga * this.jumlah;
    }

    public String toString(){
        return this.nama;
    }
    
}
