# Nama : Khairunisa Aprilia
# NIM : 2409116060
# Kelas : B Sistem Informasi 2024

# Manajemen Waktu Belajar/Pomodoro Tracker

**- Deskripsi Program**

Program sederhana ini dibuat untuk membantu mengatur waktu belajar dengan menggunakan metode Pomodoro. Metode Pomodoro adalah teknik manajemen waktu yang membagi periode belajar menjadi sesi fokus dan diselingi dengan waktu istirahat. Biasanya untuk sesi fokus waktunya adalah 15, 20, 30 menit dan waktu istirahat waktunya adalah 5, 10, 15 menit. Pengguna dapat menambahkan sesi belajar, melihat daftar sesi, mengupdate, menghapus, serta mencari sesi belajar yang sudah dibuat.

**- Alur Program**

1. Menu Utama

<img width="483" height="227" alt="image" src="https://github.com/user-attachments/assets/6725a50b-a909-4110-9adc-8e5f0fbb11f3" />

Pada menu utama terdapat 6 pilihan yang bisa dipilih. Pilihan-pilihan tersebut memungkinkan pengguna untuk mengelola sesi belajar mereka, termasuk menambah, melihat, mengupdate, menghapus, dan mencari sesi.

2. Menu Tambah Sesi Belajar

<img width="486" height="288" alt="image" src="https://github.com/user-attachments/assets/7704c4cc-445d-4f71-8942-34dba1f5066f" />

Jika memilih nomor 1, program akan meminta Anda memilih jenis sesi yang ingin ditambahkan (Sesi Fokus atau Sesi Istirahat). Setelah itu, Anda akan diminta mengisi nama sesi, durasi waktu belajar, dan waktu istirahat (jika memilih Sesi Istirahat). Jika Anda memilih Sesi Fokus, program akan meminta Anda untuk memasukkan daftar tugas yang bisa diisi satu per satu hingga Anda mengetik selesai.

- Sesi Fokus

  <img width="665" height="194" alt="image" src="https://github.com/user-attachments/assets/f14b54d5-313d-4d03-a19d-313e7bc17ef2" />

- Sesi Istirahat

  <img width="403" height="180" alt="image" src="https://github.com/user-attachments/assets/22a0065a-32ba-48c8-8eec-63f960dc3751" />

3. Menu Lihat Semua Sesi belajar

<img width="365" height="607" alt="image" src="https://github.com/user-attachments/assets/1a316cd7-98f0-4744-9aae-9698af422722" />

Jika memilih nomor 2, program akan menampilkan seluruh daftar sesi yang terdaftar di sistem. 

4. Menu Update Sesi Belajar

<img width="377" height="689" alt="image" src="https://github.com/user-attachments/assets/71a46e1c-b859-401d-9b93-d9e13080a78a" />

Jika memilih nomor 3, diminta untuk memilih nomor sesi yang ingin diupdate. Program akan mengecek terlebih dahulu apakah daftar sesi kosong; jika iya, ditampilkan pesan "Tidak ada sesi yang dapat diupdate". Jika ada, pengguna diminta memilih nomor sesi yang ingin diubah. Program memberikan opsi untuk memperbarui nama sesi, durasi belajar, durasi istirahat (Sesi Istirahat) dan daftar tugas (Sesi Fokus). Jika Anda mengupdate SesiFokus, program juga akan menanyakan apakah Anda ingin memperbarui daftar tugas. Jika ya, daftar tugas lama akan dihapus dan Anda dapat memasukkan tugas baru hingga mengetik "selesai".
Setelah semua perubahan selesai, program menampilkan pesan "Sesi telah berhasil diupdate!". Jika nomor yang dipilih tidak valid, akan muncul pesan "Nomor tidak valid".

5. Menu Hapus Sesi Belajar

<img width="373" height="638" alt="image" src="https://github.com/user-attachments/assets/b00255c2-9f31-4ad7-8404-968ebbd0b63b" />

Jika memilih nomor 4 untuk menghapus sesi belajar, akan diminta memilih nomor sesi belajar yang ingin dihapus. Jika berhasil dihapus akan keluar output sesi telah berhasil dihapus.

6. Menu Cari Sesi Belajar

<img width="385" height="269" alt="image" src="https://github.com/user-attachments/assets/0179c81a-d7f8-4cbd-a5f7-4442048e86e5" />

Jika memilih nomor 5, pengguna akan diminta memasukkan nama sesi yang ingin dicari. Misalnya, jika Anda mencari Fisika, program akan menampilkan detail sesi yang sesuai. Jika nama sesi yang Anda cari tidak ditemukan dalam daftar, akan muncul pesan "Sesi tidak ditemukan".

7. Menu Keluar

<img width="754" height="310" alt="image" src="https://github.com/user-attachments/assets/cd43518b-7a60-4840-9a7c-a2265ddc6155" />

Jika memilih nomor 6 untuk keluar dari sistem, akan keluar output terima kasih telah mengunjungi pomodoro tracker.

**- Source Code**

1. Struktur Project

<img width="264" height="208" alt="image" src="https://github.com/user-attachments/assets/644fe6ce-7759-4efc-8c7e-d968effc4b4f" />

   1) Package Model yang terdapat SesiBelajat.java dan tempat menyimpan model data untuk aplikasi, yaitu SesiBelajar (sebagai superclass abstrak), SesiFokus (subclass), dan SesiIstirahat (subclass).
   2) Package Service yang terdapat CrudService.java dan tempat menyimpan kode logika CRUD.
   3) Package Main yang terdapat Main.Java dan tempat menyimpan menu user.

2. SesiBelajar.Java

   1) Package

      <img width="289" height="38" alt="image" src="https://github.com/user-attachments/assets/5d89a2db-621f-44ea-9ea0-5f76488c8eb9" />

      SesiBelajar.java ini disimpan di package model;

   2) Properties dan Deklarasi Attribute
  
      <img width="496" height="82" alt="image" src="https://github.com/user-attachments/assets/a00d0178-f476-4535-87f0-ee23e195f9df" />

      Deklarasi atribut dalam class SesiBelajar. Di dalamnya terdapat empat atribut utama, yaitu namaSesi bertipe String yang menyimpan nama dari sesi belajar, waktuBelajar bertipe int yang menyimpan lama waktu belajar dalam menit. Atribut-atribut ini dibuat dengan modifier private agar tidak bisa diakses langsung dari luar class, sehingga lebih aman dan hanya bisa diakses melalui method getter dan setter yang sudah disediakan.


   3) Constuctor
  
      <img width="732" height="79" alt="image" src="https://github.com/user-attachments/assets/b98c5d96-e683-4bf6-a4c3-399bdde41905" />

      Constructor ini digunakan untuk membuat objek baru dengan memberikan nilai awal pada atribut namaSesi dan waktuBelajar sesuai parameter yang dimasukkan. Kata kunci this dipakai untuk membedakan antara atribut class dengan parameter yang memiliki nama sama.

   4) Getter dan Setter
  
      <img width="1020" height="533" alt="image" src="https://github.com/user-attachments/assets/35c08dc2-3b92-4d3a-9444-835bbc6a0beb" />

      Getter (getNamaSesi, getWaktuBelajar) digunakan untuk mengambil nilai dari atribut, sedangkan setter (setNamaSesi, setWaktuBelajar) digunakan untuk mengubah nilainya dengan validasi: namaSesi tidak boleh kosong/null dan waktuBelajar harus lebih dari 0. Jika aturan dilanggar, program akan melempar IllegalArgumentException, sehingga data yang tersimpan selalu valid.

   5) Metode Abstract
  
      <img width="521" height="75" alt="image" src="https://github.com/user-attachments/assets/02c35351-3063-47c7-92f3-2d1385e1180f" />

      Kode public abstract void infoSesi(); ada di superclass dan fungsinya jadi aturan. Artinya semua kelas turunan dari superclass ini wajib membuat isi atau logika dari infoSesi().

3. SesiFokus.java

   1) Package

      <img width="289" height="38" alt="image" src="https://github.com/user-attachments/assets/5d89a2db-621f-44ea-9ea0-5f76488c8eb9" />

      SesiFokus.java ini disimpan di package model;

   2) Import
  
      <img width="476" height="38" alt="image" src="https://github.com/user-attachments/assets/79982c2e-9bac-4e0a-a06b-411cdf40f88a" />

      import java.util.ArrayList digunakan untuk memanggil class ArrayList dari package java.util, yang berfungsi menyimpan data dalam bentuk list dinamis.

   3) Properties dan Deklarasi Attribute
  
      <img width="571" height="53" alt="image" src="https://github.com/user-attachments/assets/7d01f12e-2a6e-461c-be8f-115329d420c9" />

      SesiFokus yang merupakan turunan dari kelas SesiBelajar menggunakan keyword extends, sehingga SesiFokus mewarisi properti dan metode dari SesiBelajar. Di dalamnya terdapat atribut daftarTugas bertipe ArrayList<String> dengan modifier private, yang berarti hanya bisa diakses langsung dari dalam kelas SesiFokus. Atribut ini berfungsi untuk menyimpan daftar tugas dalam bentuk kumpulan data string yang terkait dengan sesi fokus tersebut.

   4) Constructor
  
      <img width="711" height="98" alt="image" src="https://github.com/user-attachments/assets/260d0384-bc9b-4bcf-9a26-d4387ecc87c4" />

      Construktor ini menerima dua parameter, yaitu namaSesi (String) dan waktuBelajar (int), lalu memanggil konstruktor superclass SesiBelajar melalui super(namaSesi, waktuBelajar) untuk menginisialisasi atribut yang diwarisi. Setelah itu, atribut daftarTugas diinisialisasi dengan objek ArrayList baru agar siap digunakan untuk menyimpan data tugas. Dengan cara ini, setiap objek SesiFokus akan langsung memiliki nama sesi, waktu belajar, dan daftar tugas yang kosong saat pertama kali dibuat.

   5) Setter dan Getter
  
      <img width="736" height="231" alt="image" src="https://github.com/user-attachments/assets/f05c83b5-aa9d-42ec-90b8-2ce25daa269e" />

      Metode getDaftarTugas() mengembalikan objek daftarTugas, sehingga memungkinkan bagian lain dari program untuk mengakses seluruh daftar tugas yang disimpan. Metode tambahTugas(String tugas) berfungsi untuk menambahkan tugas baru ke dalam daftarTugas, namun terlebih dahulu memeriksa apakah nilai tugas tidak null dan tidak kosong setelah di-trim. Dengan cara ini, hanya tugas yang valid yang akan dimasukkan ke dalam daftar.

   6) Override
  
      <img width="992" height="385" alt="image" src="https://github.com/user-attachments/assets/53a724bb-30a8-48dd-b0a9-c7f77ea10655" />

      Metode infoSesi() yang meng-override metode abstrak dari superclass SesiBelajar. Metode ini menampilkan informasi lengkap tentang sesi fokus ke layar, termasuk nama sesi, durasi belajar, dan daftar tugas. Jika daftarTugas kosong, akan dicetak tulisan “(kosong)”, sedangkan jika ada isinya, setiap tugas akan ditampilkan satu per satu dengan format “- tugas”. Dengan cara ini, metode infoSesi() memberikan gambaran jelas tentang sesi yang sedang dibuat atau dijalankan.

4. SesiIstirahat.java
   
  1) Package

      <img width="289" height="38" alt="image" src="https://github.com/user-attachments/assets/5d89a2db-621f-44ea-9ea0-5f76488c8eb9" />

      SesiIstirahat.java ini disimpan di package model;

   2) Properties dan Deklarasi Attribute

      <img width="624" height="56" alt="image" src="https://github.com/user-attachments/assets/6d502c57-92e4-437e-a61e-ca107f6b100a" />

      SesiIstirahat yang merupakan turunan dari kelas SesiBelajar menggunakan keyword extends. Di dalamnya terdapat atribut private int waktuIstirahat;, yang berfungsi menyimpan lama waktu istirahat dalam satuan menit. Karena atribut ini memiliki modifier private, maka nilainya hanya dapat diakses dan diubah melalui metode yang ada di dalam kelas SesiIstirahat, menjaga enkapsulasi data agar tidak bisa diubah sembarangan dari luar kelas.

   3) Constructur
     
      <img width="970" height="113" alt="image" src="https://github.com/user-attachments/assets/d24c8cf4-796c-41b7-a496-c1826de968f2" />

      Construktor ini menerima tiga parameter yaitu namaSesi, waktuBelajar, dan waktuIstirahat. Pertama, ia memanggil konstruktor superclass SesiBelajar melalui super(namaSesi, waktuBelajar) untuk menginisialisasi atribut yang diwarisi. Setelah itu, konstruktor memanggil metode setWaktuIstirahat(waktuIstirahat) untuk mengatur nilai atribut waktuIstirahat milik kelas ini. Dengan cara ini, setiap objek SesiIstirahat akan memiliki nama sesi, waktu belajar, dan lama istirahat yang sudah terisi saat objek dibuat.


      4) Setter dan Getter
     
         <img width="1047" height="396" alt="image" src="https://github.com/user-attachments/assets/d78a01e6-31de-417f-962d-c80574cd0a07" />

         Metode getWaktuIstirahat() digunakan untuk mengembalikan nilai waktuIstirahat, sehingga dapat diakses dari luar kelas. Metode setWaktuIstirahat(int waktuIstirahat) bertugas mengatur nilai atribut, tetapi terlebih dahulu memvalidasi agar nilainya harus lebih besar dari 0. Jika nilainya tidak valid (≤ 0), akan dilemparkan IllegalArgumentException. Dengan pendekatan ini, data waktuIstirahat terlindungi dari input yang salah sekaligus mendukung prinsip enkapsulasi.

      5) Override
     
         <img width="1050" height="185" alt="image" src="https://github.com/user-attachments/assets/8f4fab48-3f23-466f-865c-104c10c9c1be" />

         Metode infoSesi() yang meng-override metode abstrak dari superclass SesiBelajar. Metode ini menampilkan informasi lengkap tentang objek SesiIstirahat, yaitu nama sesi, waktu belajar, dan waktu istirahat, masing-masing ditampilkan dalam satuan menit. Dengan adanya override ini, setiap kali infoSesi() dipanggil pada objek SesiIstirahat, program akan menampilkan detail yang sesuai dengan karakteristik sesi istirahat, bukan perilaku default dari superclass.

5. CrudService.java

  1) Package
  
     <img width="216" height="23" alt="image" src="https://github.com/user-attachments/assets/e8648800-f464-4908-8213-091e68a73d8a" />

     CrudService.java ini disimpan di package service.

   2) Import

         <img width="393" height="130" alt="image" src="https://github.com/user-attachments/assets/c6051394-9dce-4763-ad55-ace0bc91c73a" />

      - import model.SesiBelajar; berfungsi untuk mengimpor class SesiBelajar yang sudah dibuat dalam package model, sehingga bisa dipanggil di file lain tanpa perlu menuliskan path lengkapnya.
      - import model.SesiFokus; berfungsi untuk mengimpor class SesiFokus yang sudah dibuat dalam package model, sehingga bisa dipanggil di file lain tanpa perlu menuliskan path lengkapnya.
      - import model.SesiIstirahat; berfungsi untuk mengimpor class SesiIstirahat yang sudah dibuat dalam package model, sehingga bisa dipanggil di file lain tanpa perlu menuliskan path lengkapnya.
      - import java.util.ArrayList; digunakan untuk memanggil class ArrayList dari library Java, yang berfungsi menyimpan data dalam bentuk list dinamis.
      - import java.util.Scanner; berfungsi memanggil class Scanner dari library Java, yang digunakan untuk membaca input dari pengguna melalui keyboard.
     
      3) Data Default
     
         <img width="962" height="538" alt="image" src="https://github.com/user-attachments/assets/dfd8a710-a1ab-489c-a81f-f59a70ddd2f0" />

         CrudService yang berfungsi sebagai pengelola data sesi belajar. Di dalamnya terdapat atribut daftarSesi bertipe ArrayList<SesiBelajar> untuk menyimpan kumpulan objek sesi, serta atribut input untuk membaca data dari pengguna melalui Scanner. Konstruktor CrudService() menginisialisasi daftarSesi dan input, lalu membuat tiga objek sesi: dua objek SesiFokus dengan daftar tugas masing-masing, dan satu objek SesiIstirahat. Ketiga objek tersebut kemudian ditambahkan ke dalam daftarSesi, sehingga CrudService memiliki daftar awal sesi yang siap digunakan untuk operasi CRUD (Create, Read, Update, Delete) dalam program.

      4) Create (tambahSesi)
     
         <img width="959" height="712" alt="image" src="https://github.com/user-attachments/assets/fa4be15a-63a4-46c8-9cdf-ec2655c6d717" />

         Metode tambahSesi() digunakan untuk menambahkan sesi baru ke dalam daftar. Program menampilkan pilihan jenis sesi yang tersedia, lalu meminta pengguna memasukkan nama sesi dan waktu belajar (dalam menit). Jika pengguna memilih sesi fokus, maka dibuat objek `SesiFokus` dan program masuk ke perulangan do-while untuk menambahkan daftar tugas hingga pengguna mengetik “selesai”. Jika memilih sesi istirahat, maka pengguna juga diminta memasukkan waktu istirahat (dalam menit) sebelum dibuat objek SesiIstirahat. Setiap objek sesi yang berhasil dibuat akan ditambahkan ke dalam daftarSesi, sedangkan jika pilihan tidak valid program menampilkan pesan kesalahan.

      5) Read (lihatSesi)

         <img width="761" height="309" alt="image" src="https://github.com/user-attachments/assets/bd30b245-22fd-41f5-8f54-0ad8132e6ad6" />

         tampilkanSesi() digunakan untuk menampilkan daftar sesi belajar yang sudah tersimpan. Jika daftarSesi masih kosong, program akan menampilkan pesan “Belum ada sesi belajar”. Namun jika terdapat data, program mencetak judul daftar sesi kemudian melakukan perulangan for untuk mengambil setiap objek SesiBelajar dari daftarSesi. Setiap sesi ditampilkan dengan nomor urut, memanggil metode infoSesi() untuk menampilkan detail sesi, dan dipisahkan dengan garis pembatas.

      6) Update (updateSesi)
     
         <img width="685" height="789" alt="image" src="https://github.com/user-attachments/assets/bd0fe698-13a9-41d2-b9ed-1265c1296790" />

         updateSesi() digunakan untuk memperbarui data sesi belajar yang sudah ada dalam daftar. Program menampilkan daftar sesi terlebih dahulu, lalu meminta pengguna memilih nomor sesi yang ingin diupdate. Setelah itu, pengguna dapat mengganti nama sesi, waktu belajar, dan jika sesi yang dipilih merupakan SesiFokus, pengguna juga diberi opsi untuk memperbarui daftar tugas melalui perulangan do-while hingga mengetik “selesai”. Jika sesi yang dipilih adalah SesiIstirahat, pengguna dapat memperbarui waktu istirahat. Apabila input sesuai, perubahan akan disimpan dan program menampilkan pesan bahwa sesi berhasil diupdate, sedangkan input yang tidak valid akan menghasilkan pesan kesalahan.

      7) Delete (hapusSesi)
     
         <img width="545" height="267" alt="image" src="https://github.com/user-attachments/assets/4b246500-96f2-4b77-be3b-500e6b74e5ad" />

         hapusSesi() digunakan untuk menghapus data sesi belajar dari daftar. Program terlebih dahulu menampilkan daftar sesi, lalu memeriksa apakah daftar kosong; jika kosong maka ditampilkan pesan bahwa tidak ada sesi yang bisa dihapus. Jika ada, pengguna diminta memilih nomor sesi yang ingin dihapus, kemudian program memvalidasi input tersebut. Apabila nomor valid, sesi yang sesuai dihapus dari daftarSesi dan ditampilkan pesan keberhasilan, sedangkan jika input tidak valid program menampilkan pesan kesalahan.

      8) Search (cariSesi)
     
         <img width="525" height="291" alt="image" src="https://github.com/user-attachments/assets/f61f4c45-f6d3-4d64-bebf-374b857ee8e4" />

         cariSesi() digunakan untuk mencari sesi belajar berdasarkan nama yang dimasukkan pengguna. Program meminta input keyword, kemudian melakukan pencarian pada setiap objek dalam daftarSesi dengan membandingkan nama sesi dalam bentuk huruf kecil. Jika ditemukan, detail sesi ditampilkan melalui pemanggilan metode infoSesi() dan hasil dipisahkan dengan garis pembatas. Jika tidak ada sesi yang cocok dengan keyword, program menampilkan pesan bahwa sesi tidak ditemukan.

      9) Validasi Data Input
     
          <img width="643" height="291" alt="image" src="https://github.com/user-attachments/assets/876d96f5-8bfb-4710-aa3b-65cd40385a6e" />

         validasiInputInt() digunakan untuk memvalidasi input angka dari pengguna agar sesuai dengan format yang benar. Metode ini menerima parameter berupa pesan, lalu menjalankan perulangan while(true) dengan blok try-catch. Input yang diberikan pengguna diubah menjadi integer menggunakan Integer.parseInt(), kemudian dicek apakah bernilai lebih dari 0. Jika input tidak valid atau tidak sesuai, program akan menampilkan pesan kesalahan dan meminta input ulang. Metode ini memastikan hanya angka positif yang dapat diterima sebelum nilai dikembalikan.


6. Main.java (Entry Point Class)

   1) Package

      <img width="206" height="27" alt="image" src="https://github.com/user-attachments/assets/dcc96ae6-e4c1-4edc-9138-aa2cf704d624" />

      Main.java ini disimpan di package main;

   2) Import
  
      <img width="352" height="48" alt="image" src="https://github.com/user-attachments/assets/12b9d4a3-72dd-42f3-8a04-7610ac327b0f" />

      - import service.CrudService; digunakan untuk mengimpor class CrudService yang berada di dalam package service. Class ini kemungkinan berisi interface atau class dasar yang menyediakan operasi CRUD (Create, Read, Update, Delete) untuk dikelola di program.
      - import java.util.Scanner; digunakan untuk mengimpor class Scanner dari library Java, yang berfungsi membaca input dari pengguna (misalnya input dari keyboard).
     
   3) Menu Utama
  
      <img width="925" height="543" alt="image" src="https://github.com/user-attachments/assets/da9231d6-3bfc-455e-93b5-f3c97ce4a9d0" />

  
      Class Main yang berfungsi sebagai titik awal (entry point) program. Di dalam method main, pertama dibuat objek CrudService bernama crud yang akan menangani operasi CRUD (Create, Read, Update, Delete) pada sesi belajar. Kemudian dibuat objek Scanner bernama sc untuk membaca input pengguna dari keyboard. Sebuah variabel pilihan juga disiapkan untuk menyimpan menu yang dipilih. Setelah itu, program menampilkan menu utama di dalam perulangan do-while, yang berisi daftar pilihan seperti menambah sesi belajar, melihat semua sesi, mengupdate, menghapus, mencari sesi, atau keluar dari program. Menu ini menjadi antarmuka utama agar pengguna bisa berinteraksi dengan sistem manajemen waktu belajar berbasis Pomodoro Tracker. Setelah daftar menu ditampilkan, program melakukan validasi input menggunakan while (!sc.hasNextInt()) untuk memastikan bahwa pengguna hanya bisa memasukkan angka. Jika pengguna memasukkan input yang bukan angka, program akan menampilkan pesan "Input harus berupa angka yang valid (1-6).", kemudian meminta input ulang. Setelah valid, nilai menu yang dipilih disimpan ke variabel pilihan dengan sc.nextInt(), dan sc.nextLine() dipanggil untuk membersihkan buffer agar tidak terjadi error saat membaca input berikutnya.

   4) Logika Menu Utama
     
      <img width="989" height="304" alt="image" src="https://github.com/user-attachments/assets/72caa7ef-1bc4-49c7-bdb9-7b44c890e551" />

   Bagian akhir dari logika menu utama yang menggunakan switch-case untuk mengeksekusi pilihan pengguna. Setiap angka menu (1–6) akan memanggil method yang sesuai dari objek crud (yang merupakan instance dari CrudService).
   
   - Case 1 → memanggil crud.tambahSesi() untuk menambah sesi belajar baru.
   - Case 2 → memanggil crud.tampilkanSesi() untuk menampilkan semua sesi belajar.
   - Case 3 → memanggil crud.updateSesi() untuk mengubah data sesi belajar.
   - Case 4 → memanggil crud.hapusSesi() untuk menghapus sesi belajar.
   - Case 5 → memanggil crud.cariSesi() untuk mencari sesi belajar berdasarkan nama.
   - Case 6 → menampilkan pesan ucapan terima kasih dan keluar dari program
   - Default → menampilkan pesan jika input tidak valid.

Loop do-while akan terus berjalan selama pilihan != 6, artinya program hanya akan berhenti jika pengguna memilih menu keluar. Setelah keluar, sc.close() dipanggil untuk menutup Scanner dan mengakhiri program dengan baik.











         


         


         




         

     

         


















