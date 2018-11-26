/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deby_Kuis2;

import java.util.ArrayList;
/**
 *
 * @author sin
 */
public class Transaksi {
  
private final String code;
private final ArrayList<Item> items = new ArrayList<>();
private final ArrayList<Item> item;
private float total;

    public Transaksi(String code, ArrayList<Item> items) {
        this.code = code;
        this.item = items;
    }
    
    public void setTotal(){
        float total = 0;
        for (Item item : this.items){
            total += item.getTotal();
        }
        this.total = total;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
    
    
}
