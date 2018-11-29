/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deby_Kuis2;

import java.util.HashMap;
import java.util.ArrayList;
/**
 *
 * @author sin
 */
public class PilihanBox {
    private final HashMap<String , Float> item = new HashMap<>();

    public PilihanBox(){
        this.item.put("Gula", new Float(30000));
        this.item.put("Kopi", new Float(30000));
        this.item.put("Susu", new Float(30000));
        this.item.put("Teh", new Float(30000));
    }
    
    public ArrayList<String> getSemuaNama(){
        ArrayList<String> str = new ArrayList<>();
        for (String item:this.item.keySet()){
                str.add(item);
        }
        return str;
    }    
    
    public ArrayList<Float> getSemuaHarga(){
        ArrayList<Float> flt = new ArrayList<>();
        for (float item:this.item.values()){
                flt.add(item);
        }
        return flt;
    }     
    
    public void addItem(String nama, float harga){
        this.item.put(nama, harga);
    }
}