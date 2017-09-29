
Tugas IF4150 Rekayasa Perangkat Lunak Spesifik Domain

**Domain Kantin**

Disusun oleh:

13514006                Adi Purnama

13514020                Ikhwanul Muslimin

13514052                Naufal Malik Rabbani

**Program Studi Teknik Informatika**

**Sekolah Teknik Elektro dan Informatika**

**Institut Teknologi Bandung**

**2017**

**Run Contoh Program**
> groovy kantin.groovy

Contoh bahasa yang dibuat silakan cek file kantin.groovy
***

**Kantin**

Kantin adalah sarana untuk menjual makanan. Manusia membutuhkan makanan untuk sumber energi, zat pembangun, dan pengatur tubuh agar tubuh dapat tetap beroperasi dengan optimal. Cara manusia mendapatkan makanan, antara lain:

1. Makan langsung dari bahan yang disediakan oleh alam
2. Mengambil bahan yang disediakan oleh alam, lalu mengolahnya sebelum dimakan
3. Membeli bahan makanan, lalu mengolahnya sebelum dimakan
4. Membeli makanan jadi

Kantin biasa ditemukan di daerah tempat orang sibuk beraktivitas atau bekerja karena mereka tidak memiliki waktu untuk mengumpulkan bahan makanan ataupun memasaknya. Orang membeli makanan yang tersedia di kantin.

**Entitas**

1. Petugas Kantin

Orang yang bekerja di kantin, penggolongannya sebagai berikut:

1.
  1. _Tukang Masak_

Orang yang mengolah bahan makanan mentah menjadi makanan jadi

1.
  1. _Pelayan_

Orang yang menerima pesanan pelanggan, dan mengantarkan masakan ke pelanggan

1.
  1. _Petugas Kebersihan_

Orang yang membersihkan peralatan masak, peralatan makan, dan wilayah kantin

1.
  1. _Kasir_

Orang yang melayani proses pembayaran dari pelanggan

1.
  1. _Petugas Supplier_

Orang yang mengelola dan mensuplai stok bahan makanan

1. Hidangan

Sebuah kantin terdiri dari 1 atau lebih jenis hidangan yang bisa dipesan oleh pelanggan. Daftar hidangan yang bisa dipesan pelanggan dalam sebuah kantin biasa disebut juga dengan Menu. Hidangan dapat berupa makanan atau minuman. Hidangan dapat diproduksi dengan syarat:

1. Tersedianya bahan hidangan untuk memproduksi
2. Tersedianya tukang masak yang memiliki pengetahuan mengenai cara memproduksi hidangan tersebut
3. Tersedianya alat masak yang diperlukan untuk memproduksi hidangan tersebut

Jenis-jenis hidangan diantaranya sebagai berikut:

1.
  1. Hidangan sudah jadi

Hidangan yang telah diproduksi sehingga siap saji, contoh: ayam goreng, nasi, dll.

1.
  1. Hidangan setengah jadi

Hidangan yang perlu diramu dari berbagai bahan hidangan yang sudah diproduksi, contoh: soto ayam, nasi kuning, dll.

1.
  1. Hidangan belum jadi.

Hidangan yang perlu diproduksi tiap ada pesanan, contoh: nasi goreng, mie _instant_ rebus, dll. Pelanggan yang memesan hidangan jenis ini harus menunggu proses produksi selesai.

1. Bahan Hidangan

Bahan-bahan yang diperlukan untuk memproduksi hidangan, misalnya bawang merah, cabai, garam, syuran, tempe, daging, buah-buahan, dan sebagainya.

1. Alat Masak

Alat-alat yang diperlukan untuk memproduksi hidangan, misalnya wajan, spatula, kompor, dan sebagainya.

1. Alat Makan

Adalah alat-alat yang digunakan oleh pelanggan untuk makan, seperti piring, sendok, mangkuk.

1. Pembungkus Hidangan

Untuk membungkus hidangan agar bisa dibawa pulang oleh pelanggan.

1. Wilayah Kantin

Wilayah yang mendefinisikan perbatasan suatu kantin. Seseorang dianggap telah memasuki kantin apabila telah masuk ke dalam wilayah ini. Beberapa komponen penting, antara lain:

1. _Wilayah Tempat Makan Konsumen_

Daerah tempat konsumen mengkonsumsi hidangan yang telah dipesan. Atribut pada wilayah ini adalah Kapasitas Pelanggan. Beberapa tipe diantaranya:

- Meja &amp; Kursi
- Kursi saja
- Tanpa meja dan tanpa kursi (lesehan)

1. _Wilayah Produksi_ _Hidangan_

Tempat hidangan diproduksi.

1. _Wilayah Kasir_

Tempat konsumen melakukan proses pembayaran.

1. _Wilayah_ _Hidangan_ _Jadi_

Tempat hidangan yang sudah jadi ditampilkan agar dapat dipilih pelanggan.

**Fungsi**

1. Tukang Masak
  - Memasak

Adalah kegiatan membuat hidangan dari bahan hidangan dengan peralatan masak.

1. Pelayan
  - Menerima order

Adalah kegiatan menerima daftar pesanan dari pelanggan yang hendak makan di kantin atau membungkusnya.

1.
  - Melayani order

Adalah kegiatan melayani pesanan pelanggan, dapat diimplementasikan dengan menyuruh tukang masak, atau mengambil hidangan yang sudah jadi, atau mengolah dari bahan setengah jadi (seperti soto ayam dan sebagainya)

1.
  - Memberi makanan ke pelanggan

Memberikan hidangan di piring apabila pelanggan ingin makan di tempat atau membungkusnya.

1. Kasir
  - Melayani transaksi

Adalah kegiatan melayani pembayaran hidangan pelanggan, meliputi menghitung harga hidangan, menghitung uang yang dibayarkan, dan juga memberikan uang kembalian jika uang yang dibayar lebih dari harga makanan.

1. Petugas Kebersihan
  - Membersihkan

Adalah kegiatan membersihkan alat masak dan alat makan ketika kotor dan tidak sedang digunakan.

1. Supplier
  - Menyediakan bahan hidangan

Adalah kegiatan menyediakan bahan hidangan dari agen penyedia ke dapur, terutama ketika stok bahan makanan hampir habis.

1.
  - Memantau stok

Adalah kegiatan memantau ketersediaan bahan hidangan di dapur.

1. Pelanggan
  - Pesan

Adalah kegiatan memilih hidangan yang ingin dikonsumsi atau dibungkus kepada pelayan dengan cara menuliskannya di kertas atau langsung menyebutkannya ke pelayan

1.
  - Menunggu

Adalah kegiatan yang dilakukan saat makanan sedang disiapkan oleh pelayan hingga makanan telah siap

1.
  - Bayar makanan

Adalah kegiatan memberikan sejumlah uang yang sesuai dengan harga makanan kepada kasir setelah makanan siap atau setelah makanan selesai dimakan di tempat

1.
  - Memakan

Adalah kegiatan mengonsumi makanan yang telah dipesan

1.
  - Bungkus sisa

Adalah kegiatan membungkus hidangan yang tidak habis dikonsumsi di tempat.

**Event**

1. Pelanggan masuk kantin

Adalah kejadian saat koordinat pelanggan memasuki batas koordinat kantin, kemudian koordinatnya berada di dalam koordinat kantin

1. Pelanggan memesan makanan

Adalah kejadian saat pelanggan melakukan fungsi Pesan makanan.

1. Makanan pesanan telah siap

Adalah kejadian saat pelayan selesai menyiapkan makanan yang dipesan pelanggan

1. Pelanggan meninggalkan kantin

Adalah kejadian saat koordinat pelanggan memasuki batas koordinat kantin, kemudian koordinatnya berada di luar koordinat kantin

1. Stok bahan makanan habis

Adalah kejadian saat ketersediaan bahan makanan tertentu di dapur sama sangat mendekati nol..

1. Stok makanan habis

Adalah kejadian saat ketersediaan makanan di _showcase_ menu sangat mendekati nol.

1. Waktu istirahat tiba

Adalah kejadian saat waktu kerja pegawai kantin diberhentikan sesaat yang telah terjadwal.

1. Kantin buka

Adalah kejadian saat telah ada pegawai kantin, terutama tukang masak, kasir, dan pelayan, dan beberapa makanan telah tersaji di _showcase_ menu (untuk kantin yang tidak dengan sistem masakan baru dimasak setelah dipesan)

1. Kantin tutup

Adalah kejadian saat pegawai tidak lagi bekerja berdasarkan jadwal yang telah ditentukan.

**Behavior**

1. Ketika pelanggan masuk kantin, ia akan segera menuju bagian _showcase_ makanan untuk pesan makanan
2. Ketika pelanggan memesan makanan, pelayan akan menerima order dan melayani order, sedangkan pelanggan menunggu makanan
3. Ketika makanan telah siap, pelayan akan memberikan makanan ke pelanggan, kemudian pelanggan membayar makanan ke kasir. Kasir melayani transaksi.
4. Ketika pelanggan meninggalkan kantin, petugas kebersihan akan membersihkan meja dan membereskan piring
5. Ketika stok makanan habis, kantin tidak menerima pesanan makanan tersebut
6. Ketika waktu istirahat tiba, kantin tidak menerima pesanan sampai waktu istirahat berakhir
7. Ketika kantin buka, kantin menerima pesanan
8. Ketika waktu tutup tiba, kantin tidak menerima pesanan sehingga semua pelanggan selesai makan, kemudian kantin ditutup

**Aksioma**

1. Selalu tersedia uang kembalian
2. Mata uang yang digunakan dalam transaksi adalah rupiah
3. Harga yang dibayar antara dibungkus dan makan di tempat sama
4. Seseorang dapat melakukan lebih dari 1 peran sebagai petugas kantin. Sebagai contoh, seseorang dapat bertugas sebagai tukang masak sekaligus kasir.
5. Terdapat 2 mekanisme pemesanan makanan yang dapat dipilih , yaitu
  1. Dilayani oleh pelayan

Jika mekanisme ini dipilih oleh kantin. Pelanggan dapat melakukan aksi &quot;pesan&quot;, namun tidak dapat melakukan aksi &quot;ambil prasmanan&quot;.

1.
  1. Prasmanan

Jika mekanisme ini dipilih oleh kantin. Pelanggan dapat melakukan aksi &quot;ambil prasmanan&quot;, namun tidak dapat melakukan aksi &quot;pesan&quot;.

1. Apabila mekanisme pemesanan makanan yang dipilih adalah &quot;prasmanan&quot;, hidangan yang dapat disediakan hanya hidangan jadi dan hidangan setengah jadi.
2. Zona produksi makanan bisa berlokasi di luar wilayah kantin.
3. Waktu tunggu saat pelanggan melakukan aksi &quot;menunggu&quot; bergantung pada jenis hidangan yang dipesan. Urutan dari waktu tercepat hingga terlama :
  1. Hidangan jadi
  2. Hidangan setengah jadi
  3. Hidangan belum jadi
4. Kantin yang memiliki pembungkus hidangan dapat menyediakan opsi pesan bungkus dan bungkus sisa. Hidangan tidak dapat dibungkus apabila kantin tidak memiliki pembungkus hidangan.
5. Pembungkus hidangan , bahan makanan bersifat habis pakai. Alat masak bersifat berulang kali pakai selama masih bisa digunakan.
6. Alat makan dapat bersifat berulang kali pakai dan ada yang bersifat habis pakai.
7. Alat makan yang bersifat berulang kali pakai dapat digunakan dalam keadaan bersih.
8. Alat makan berulang kali pakai yang sudah digunakan bersifat kotor. Harus dibersihkan oleh petugas kebersihan sebelum dapat digunakan lagi.
9. Seorang tukang masak dapat memiliki satu atau lebih pengetahuan mengenai cara memproduksi hidangan.
10. Hidangan dapat diproduksi dengan syarat:
  1. Tersedianya bahan hidangan untuk memproduksi.
  2. Tersedianya tukang masak yang memiliki pengetahuan mengenai cara memproduksi hidangan tersebut.
  3. Tersedianya alat masak yang diperlukan untuk memproduksi hidangan tersebut.
11. Zona hidangan jadi bersifat _optional_. Dapat ada ataupun tidak ada pada suatu kantin.
12. Pelanggan yang mendapatkan makanan/minuman dari kantin wajib melakukan transaksi pembayaran.
13. Terdapat 2 mekanisme transaksi pembayaran yang dapat dipilih oleh kantin, yaitu :
  1. Pembayaran dilakukan di awal pemesanan.
  2. Pembayaran dilakukan setelah makanan/minuman selesai dikonsumsi atau diterima oleh pelanggan (jika dibungkus) .

**Diagram Kelas**

 ![alt text](https://raw.githubusercontent.com/punyaikhwan/kantin-dsl/master/images/ClassDiagram.png)

Penjelasan:

1. Tukang masak, petugas kebersihan, kasir, dan supplier adalah kelas turunan dari kelas pegawai. Sehingga, masing-masing memiliki atribut yang sama dengan pegawai.
2. Dalam memasak, tukang masak melibatkan satu atau lebih alat masak dan satu atau lebih bahan makana.
3. Tukang masak dapat memasak beberapa makanan atau tidak masak sama sekali sebuah makanan.
4. Pelanggan dapat memesan satu atau lebih makanan atau tidak memesan sama sekali sebuah makanan.
5. Dalam kegiatan makan, pelanggan dapat menggunakan beberapa alat makan.
6. Satu kasir melayani banyak pelanggan, sedangkan satu pelanggan pasti hanya dilayani satu kasir.

**Use Case dalam Pemesanan Makanan**
![alt text](https://raw.githubusercontent.com/punyaikhwan/kantin-dsl/master/images/use%20case%20pemesanan.png)

Penjelasan:

1. Pelanggan melakukan pemesanan ke pelayan.
2. Ketika menerima pesanan, pelayan dapat meminta tukang masak untuk memasakkan makanan yang dipesan jika tidak terdapat di _showcase_ menu.
3. Ketika masak, tukang masak pasti akan mengambil alat masak dan bahan makanan
4. Setelah makanan siap, pelayan memberikan hidangan ke pelanggan.

**Use Case Pembayaran**
![alt text](https://raw.githubusercontent.com/punyaikhwan/kantin-dsl/master/images/use%20case%20pembayaran.png)
 
 Penjelasan:

1. Pelanggan melakukan pembayaran ke kasir.
2. Kasir akan menerima pembayaran dengan menghitung uang bayar.
3. Kasir akan memberikan uang kembalian ketika uang yang dibayarkan lebih dari harga makanan.

**Sequence Diagram : Pembayaran Setelah Hidangan Dikonsumsi**

 ![alt text](https://raw.githubusercontent.com/punyaikhwan/kantin-dsl/master/images/sequence%20diagram%20bayar%20akhir.PNG)

Pelanggan memesan hidangan ke pelayan. Pelayan lalu akan menyiapkan hidangan (jika tersedia). Lalu, pelanggan makan di tempat , dan melakukan pembayaran. Pembayaran dilakukan setelah pelanggan selesai makan.

**Sequence Diagram : PembayaranSetelah Hidangan Dipesan**

 ![alt text](https://raw.githubusercontent.com/punyaikhwan/kantin-dsl/master/images/sequence%20diagram%20bayar%20awal.PNG)

 Setelah pelanggan melakukan pemesanan ke pelayan, pelanggan harus membayar terlebih dahulu. Setelah pembayaran, pesanan baru diproses , lalu pelanggan mendapatkan makanan yang dipesan.

**Log Activity**

| **Nama** | **Tugas** | **Waktu** |
| --- | --- | --- |
| Adi Purnama | Definisi kantin, entitas, fungsi, aksioma | 24 – 26 September 2017 |
| Ikhwanul Muslimin | Diagram UML, fungsi, event, behavior | 25 – 26 September 2017 |
| Naufal Malik Rabbani | Entitas, fungsi, event | 25 – 26 September 2017 |
