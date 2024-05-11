Kelas : CatatBarang 

Atribut : 
brs : integer (private) - Kapasitas baris data barang ( default 200 ) 
klm : integer (private) - Kapasitas kolom data barang ( default 5 ) 
raktif : integer (private) - Jumlah data barang yang tersimpan 
CB:String[][] - Array untuk menyimpan data barang ( ukuran brs x klm ) 

Metode : 
Constructor : CatatanBarang() - Inisialisasi array CB dengan nilai kosong 
Penyimpanan Data : StoreData() - Mengambil inputan dari user dan menyimpannya di array CB
Update (int idx) - Mengupdate data barang pada indeks tertentu 
Destroy (int idx) - Menghapus data barang pada indeks tertentu 

Tampilan Data : 
viewdata() : Menampilkan daftar dari semua data barang 
viewdata(int startIndex, int endIndex) - Menampilkan daftar data barang dengan rentang indeks tertentu 

Prinsip Access Modifier : 
brs, klm, raktif : private - Hanya bisa diakses dari dalam kelas CatatBarang 
CB : private - Hanya dapat diakses dari dalam kelas CatatBarang 
StoreData(), Update(), Destroy(), viewdata(), viewdata() : public - Dapat diakses dari luar kelas CatatBarang 

Constructor : 
Digunakan untuk menginisialisasi array CB dengan nilai kosong 

Overloading : 
Metode viewdata() memiliki dua versi : 
viewdata() - Menampilkan semua data barang 
viewdata(int startIndex, int endIndex) - Menampilkan data barang dengan rentang indeks tertentu 

Overriding :
Tidak ada 