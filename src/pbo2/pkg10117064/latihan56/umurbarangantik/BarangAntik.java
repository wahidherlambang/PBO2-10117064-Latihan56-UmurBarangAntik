/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117064.latihan56.umurbarangantik;

/**
 *
 * @author WAHID HERLAMBANG
 * NAMA     : Wahid Herlambang Suroso
 * KELAS    : PBO2
 * NIM      : 10117064
 * Deskripsi Program : Program ini berisi program tentang umur barang antik.
 */
public class BarangAntik {
    private int umur;
    
    public BarangAntik(int umur){
        this.umur=umur;
    }
    
    public void tampilUmur(){
        System.out.println("Umur barang antik ini adalah " + umur + " tahun.");
    }
}
