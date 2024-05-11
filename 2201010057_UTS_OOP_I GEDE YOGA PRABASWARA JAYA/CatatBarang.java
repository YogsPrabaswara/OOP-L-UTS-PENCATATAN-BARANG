package Aplikasi;

import java.util.Scanner;

/**
 * Aplikasi Pencatatan Barang Pada Gudang
 * Nama : I Gede Yoga Prabaswara Jaya 
 * Nim : 2201010057
 * Kelas : L
 */

// Akses Modifier
public class CatatBarang {
    private int brs = 200;
    private int klm = 5;
    private int raktif = 0;
    // Akses Modifier 
    
    //Penyimpanan Menggunanakan Array
    String[][] CB = new String[brs][klm];
    // Penyimpanan Menggunakan Array
    
    // Penggunaan Constructor Untuk Menyimpan Data Barang di Array CB
    public CatatBarang() {
        // Inisialisasi CB dengan nilai kosong
        for (int i = 0; i < brs; i++) {
            for (int j = 0; j < klm; j++) {
                CB[i][j] = "";
            }
        }
    }
    // Penggunaan Constructor Untuk Menyimpan Data Barang di Array CB
    
    // Mengambil Inputan User dan Menyimpannya Pada StoreData
    Scanner dtIN = new Scanner(System.in);
    public void StoreData(){
        int idx = 0;
        raktif++;
        if (raktif > brs){
            System.out.println("Data Sudah Penuh");
            return;
        }
        if(raktif>0) {
            idx=raktif-1;
        }
        System.out.println("=======================");
        System.out.println("Menambahkan Data Barang");
        System.out.println("=======================");
            
        System.out.print("Nama Barang : ");
        CB[idx][0] = dtIN.nextLine();
        
        System.out.print("Kategori Barang : ");
        CB[idx][1] = dtIN.nextLine();
        
        System.out.print("Harga Barang : ");
        CB[idx][2] = dtIN.nextLine();
        
        System.out.print("Berat (kg) : ");
        CB[idx][3] = dtIN.nextLine();
        
        System.out.print("Status (Siap Dijual / Belum Siap) : ");
        CB[idx][4] = dtIN.nextLine();
        System.out.println(" ");
    }
    
    // Mengambil Dari Inputan ID Barang dan Mengupdate List Barang
    public void Update(int idx){
        if(idx >= raktif || idx < 0){
            System.out.println("Indeks tidak valid");
            return;
        }

        System.out.print("Nama Barang : ");
        CB[idx][0] = dtIN.nextLine();
        
        System.out.print("Kategori Barang : ");
        CB[idx][1] = dtIN.nextLine();
        
        System.out.print("Harga Barang : ");
        CB[idx][2] = dtIN.nextLine();
        
        System.out.print("Berat (kg) : ");
        CB[idx][3] = dtIN.nextLine();
        
        System.out.print("Status (Siap Dijual / Belum Siap) : ");
        CB[idx][4] = dtIN.nextLine();
        System.out.println(" ");
    }
    public void Destroy(int idx){
        if(idx >= raktif || idx < 0){
            System.out.println("Indeks tidak valid");
            return;
        }

        System.out.println("=================");
        System.out.println("Hapus Data Barang");
        System.out.println("=================");

        for(int i = idx; i < raktif - 1; i++){
            CB[i] = CB[i + 1];
        }
        raktif--;
    }
    
    // Perintah Untuk Menggunakan ViewData
    public void viewdata(){
        int posbrs = 0;
        System.out.println("=============");
        System.out.println("Daftar Barang");
        System.out.println("=============");
        for(int i=0; i<raktif; i++){
            posbrs++;
            System.out.println("ID Barang : "+ i);
            System.out.println("Nama Barang : "+ CB[i][0]);
            System.out.println("Kategori Barang : "+ CB[i][1]);
            System.out.println("Harga Barang : "+ "Rp."+ CB[i][2]);
            System.out.println("Berat Barang : "+ CB[i][3] + " kg");
            System.out.println("Status Barang : "+ CB[i][4]);
            System.out.println(" ");
        }
    }
    // Metode overloading untuk viewdata dengan parameter tambahan
    public void viewdata(int startIndex, int endIndex) {
        if (startIndex < 0 || startIndex >= raktif || endIndex < 0 || endIndex >= raktif || startIndex > endIndex) {
            System.out.println("Indeks tidak valid");
            System.out.println(" ");
            return;
        }
        System.out.println("Daftar Barang dari Indeks " + startIndex + " hingga " + endIndex);
        System.out.println("====================================");
        for (int i = startIndex; i <= endIndex; i++) {
            System.out.println("ID Barang : " + i);
            System.out.println("Nama Barang : " + CB[i][0]);
            System.out.println("Kategori Barang : " + CB[i][1]);
            System.out.println("Harga Barang : " + "Rp." + CB[i][2]);
            System.out.println("Berat Barang : " + CB[i][3] + " kg");
            System.out.println("Status Barang : " + CB[i][4]);
            System.out.println(" ");
        }
    }
}
