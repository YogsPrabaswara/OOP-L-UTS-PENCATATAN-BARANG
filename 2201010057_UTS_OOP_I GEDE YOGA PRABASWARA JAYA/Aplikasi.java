package Aplikasi;

/**
 * Aplikasi Pencatatan Barang Pada Gudang
 * Nama : I Gede Yoga Prabaswara Jaya 
 * Nim : 2201010057
 * Kelas : L
 */

public class Aplikasi {

    public static void main(String[] args) {
            CatatBarang CaBar = new CatatBarang();
            String ul = "Ya";
            do{
                System.out.println("A. List Data Barang");
                System.out.println("B. Tambah Data Barang");
                System.out.println("C. Edit Data Barang");
                System.out.println("D. Hapus Data Barang");
                System.out.println("E. Exit");
                System.out.println(" ");
                System.out.print("Pilih A/B/C/D/E : ");
                String mPIL = CaBar.dtIN.nextLine();
                switch (mPIL) {
                case "A":
                    System.out.println("=========List Data Barang=========");
                    System.out.println("1. Tampilkan Semua Data");
                    System.out.println("2. Tampilkan Data dengan Rentang 0-200");
                    System.out.println(" ");
                    System.out.print("Pilih : ");
                    int opsi = Integer.parseInt(CaBar.dtIN.nextLine());
                    switch (opsi) {
                        case 1:
                            CaBar.viewdata(); // Panggil metode viewdata tanpa parameter
                            break;
                        case 2:
                            System.out.print("Masukkan Indeks Awal: ");
                            int startIndex = Integer.parseInt(CaBar.dtIN.nextLine());
                            System.out.print("Masukkan Indeks Akhir: ");
                            int endIndex = Integer.parseInt(CaBar.dtIN.nextLine());
                            CaBar.viewdata(startIndex, endIndex); // Panggil metode viewdata dengan parameter
                            break;
                        default:
                            System.out.println("Opsi tidak valid");
                            break;
                    }
                    break;
                case "B":
                    CaBar.StoreData();
                    break;
                case "C":
                    System.out.print("Masukkan Produk ID Untuk Edit Data : ");
                    int updateIdx = Integer.parseInt(CaBar.dtIN.nextLine());
                    CaBar.Update(updateIdx);
                    break;
                case "D":
                    System.out.print("Masukkan Produk ID Untuk Hapus Data : ");
                    int deleteIdx = Integer.parseInt(CaBar.dtIN.nextLine());
                    CaBar.Destroy(deleteIdx);
                    break;
                case "E":
                    ul = "Tidak";
                    break;
                default:
                    System.out.println("type A/B/C/D");
                    break;
            }
        }while(ul.equals("Ya")); 
                
    }
    
}
