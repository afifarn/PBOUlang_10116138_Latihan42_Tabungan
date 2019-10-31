/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang_10116138_latihan42_tabungan;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Afif Raditya Nugraha
 * KELAS    : PBO_ULANG/IF4
 * NIM      : 10116138
 * LOG      : Program ini berisi program untuk Menampilkan Saldo Tabungan
 */
public class PBOUlang_10116138_Latihan42_Tabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        Scanner scn1 = new Scanner(System.in);
        Tabungan tbg = new Tabungan();
        int jumlah;
        int saldo;
   
        System.out.println("===Program Penarikan Uang===");
        System.out.print("Masukkan Saldo Awal : Rp ");
        saldo = scn.nextInt();
        System.out.print("Jumlah uang yang diambil : Rp ");
        jumlah = scn1.nextInt();
        
        System.out.println("");
        System.out.println("Saldo Anda Sekarang : Rp " + tbg.ambilUang(saldo - jumlah));
    }
    
}
