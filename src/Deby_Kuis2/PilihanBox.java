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
    private final HashMap<String , Float> item = new HashMap<>();//memetakan nilai dengan key unik

    public PilihanBox(){//menu pilihan yang ada
        this.item.put("Gula", new Float(30000));
        this.item.put("Kopi", new Float(30000));
        this.item.put("Susu", new Float(30000));
        this.item.put("Teh", new Float(30000));
    }
    
    public ArrayList<String> getSemuaNama(){//list menu yang ada
        ArrayList<String> str = new ArrayList<>();
        for (String item:this.item.keySet()){
                str.add(item);
        }
        return str;
    }    
    
    public ArrayList<Float> getSemuaHarga(){//list total harga
        ArrayList<Float> flt = new ArrayList<>();
        for (float item:this.item.values()){
                flt.add(item);
        }
        return flt;
    }     
    
    public void addItem(String nama, float harga){//list tambah item
        this.item.put(nama, harga);
    }
}