/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan_p5;

/**
 *
 * @author Fadhil Ramadhan
 */
public class Pesan {
    String nama, tipe, gula;
    Integer harga, qty;
 
    public Pesan(String nama, String tipe, String gula, Integer harga, Integer qty) {
        this.nama = nama;
        this.tipe = tipe;
        this.gula = gula;
        this.harga = harga;
        this.qty = qty;
    }
 
    public String getNama() {
        return nama;
    }
 
    public String getTipe() {
        return tipe;
    }
 
    public String getGula() {
        return gula;
    }
 
    public Integer getHarga() {
        return harga;
    }
 
    public Integer getQty() {
        return qty;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public void setGula(String gula) {
        this.gula = gula;
    }

    public void setHarga(Integer harga) {
        this.harga = harga;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }
    
    
     public Pesan(String nama, String gula, Integer harga, Integer qty, Integer bayar, Integer kembali) {
        this.nama = nama;
        this.gula = gula;
        this.harga = harga;
        this.qty = qty;
    }
}
