/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang_10116138_latihan42_tabungan;

/**
 *
 * @author 
 * NAMA     : Afif Raditya Nugraha
 * KELAS    : PBO_ULANG/IF4
 * NIM      : 10116138
 * LOG      : Program ini berisi program untuk Menampilkan Saldo Tabungan
 */
public class Tabungan {
    private int saldo;

    public Tabungan(){
        
    }
    
    public Tabungan(int saldo) {
        this.saldo = saldo;
    }
    public int ambilUang(int jumlah){
        int ambilUang;
        return ambilUang = jumlah - saldo;
    }

}
