# Laporan Praktikum #3 - Pengantar Konsep PBO

Enkapsulasi Pada Pemrograman Berorientasi Objek 

## Kompetensi

1. Konstruktor 
2. Akses Modifier 
3. Atribut/method pada class 
4. Intansiasi atribut/method  
5. Setter dan getter 
6. Memahami notasi pada UML Class Diagram 

## Ringkasan Materi

1. Enkapsulasi 
Pada modul pertama telah dijabarkan definisi dari enkapsulasi sebagai berikut: Enkapsukasi disebut juga dengan information-hiding. Dalam berinteraksi dengan objek, seringkali kita tidak perlu mengetahui kompleksitas yang ada didalamnya. Hal ini akan lebih mudah dipahami jika kita membayangkan atau menganalisa objek yang ada disekitar kita, misalnya objek sepeda ketika kita mengganti gear pada sepeda, kita tinggal menekan tuas gear yang ada di grip setang sepeda saja. Kita tidak perlu mengetahui bagaimana cara gear berpindah secara teknis. Contoh objek lain misalnya mesin penghisap debu (vacum cleaner), ketika kita mencolokkan kabel vacum cleaner dan menyalakan sakelarnya maka mesin tersebut siap digunakan untuk menghisap debu. Dalam proses tersebut kita tidak mengetahui proses rumit yang terjadi ketika mengubah listrik menjadi tenaga dari vacum cleaner. Dalam contoh diatas vacum cleaner dan sepeda telah menerapkan enkapsulasi atau disebut juga information-hiding atau data hiding karena menyembunyikan detail proses suatu objek dari pengguna. 

2. Konstruktor 
Konstruktor mirip dengan method cara deklarasinya akan tetapi tidak memiliki tipe return. Dan konstruktor dieksekusi ketika instan dari objek dibuat. Jadi setiap kali sebuat objek dibuat dengan keyword new() maka konstruktor akan dieksekusi. Cara untuk membuat konstruktor adalah sebagai berikut:  
    1. Nama konstruktor harus sama dengan nama class 
    2. Konstruktor tidak memiliki tipe data return 
    3. Konstruktor tidak boleh menggunakan modifier abstract, static final, dan syncronized 
Note: Di java kita dapat memiliki konstruktor dengan modifier private, protected, public or default. 

3. Akses Modifier 
Terdapat 2 tipe modifier di java yaitu : akses modifier dan non-access modifier. Dalam hal ini kita akan fokus pada akses modifier yang berguna untuk mengatur akses method, class, dan constructor. Terdapat 4 akses modifier yaitu: 
    1. private – hanya dapat diakses di dalam kelas yang sama 
    2. default –  hanya dapat diakses di dalam package yang sama 
    3. protected – dapat diakases di luar package menggunakan subclass  (membuat inheritance) 
    4. public – dapat diakases dari mana saja 

4. Getter  dan Setter 
Getter adalah public method dan memiliki tipe data return, yang berfungsi untuk mendapatkan nilai dari atribut private. Sedangkan setter adalah public method yang tidak memliki tipe data return, yang berfungsi untuk memanipulasi nilai dari atribut private. 

5. Notasi UML Class Diagram
Keterangan : 
    1. Class 
    2. Interface 
    3. Enumeration – adalah tipe data yang memiliki nilai atau literal yang terbatas. 
    4. Atrributes 
    5. Method 
    6. Literals 
Notasi akses modifier pada UML class diagram adalah sebagai berikut: 
    1. Tanda plus (+) untuk public 
    2. Tanda pagar (#)  untuk protected 
    3. Tanda  minus (-) untuk private 
    4. Untuk default, maka tidak diberi notasi 

## Percobaan

### Percobaan 1 - Enkapsulasi 
Didalam percobaan enkapsulasi, buatlah class Motor yang memiliki atribut kecepatan dan kontakOn, dan memiliki method printStatus() untuk menampilkan status motor. Seperti berikut 

1. Buka Netbeans, buat project MotorEncapsulation. 

2. Buat class Motor. Klik kanan pada package motorencapsulation – New – Java Class. 

3. Ketikkan kode class Motor dibawah ini. 
![Gambar motorencapsulation ](img/1.Motor1841720193Lintang.PNG)
link kode program : [ini link ke kode program](../../src\3_Enkapsulasi\Motor1841720193Lintang.java)

4. Kemudian buat class MotorDemo, ketikkan kode berikut ini. 
![Gambar motorencapsulation ](img/2.MotorDemo1841720193Lintang.PNG)
link kode program : [ini link ke kode program](../../src\3_Enkapsulasi\MotorDemo1841720193Lintang.java)

Dari percobaan 1 - enkapsulasi, menurut anda, adakah yang janggal?  
Yaitu, kecepatan motor tiba-tiba saja berubah dari 0 ke 50. Lebih janggal lagi, posisi kontak motor masih dalam kondisi OFF. Bagaimana mungkin sebuah motor bisa sekejap berkecepatan dari nol ke 50, dan itupun kunci kontaknya OFF?  

Nah dalam hal ini, akses ke atribut motor ternyata tidak terkontrol. Padahal, objek di dunia nyata selalu memiliki batasan dan mekanisme bagaimana objek tersebut dapat digunakan. Lalu, bagaimana kita bisa memperbaiki class Motor diatas agar dapat digunakan dengan baik? Kita bisa pertimbangkan beberapa hal berikut ini:  
1. Menyembunyikan atribut internal (kecepatan, kontakOn) dari pengguna (class lain)  
2. Menyediakan method khusus untuk mengakses atribut.  

###  Percobaan 2 - Access Modifier 
Pada percobaan ini akan digunakan access modifier untuk memperbaiki cara kerja class Motor pada percobaan ke-1. 

1. Ubah cara kerja class motor sesuai dengan UML class diagram berikut. 

2. Berdasarkan UML class diagram tersebut maka class Motor terdapat perubahan, yaitu: 
    a. Ubah access modifier kecepatan dan kontakOn menjadi private 
    b. Tambahkan method nyalakanMesin, matikanMesin, tambahKecepatan, kurangiKecepatan. 
Implementasi class Motor adalah sebagai berikut: 
![Gambar motorencapsulation ](img/3.Motor1841720193Lintang.PNG)
link kode program : [ini link ke kode program](../../src\3_Enkapsulasi\Motor1841720193Lintang.java)

3. Kemudian pada class MotorDemo, ubah code menjadi seperti berikut: 
![Gambar motorencapsulation ](img/4.MotorDemo1841720193Lintang.PNG)
link kode program : [ini link ke kode program](../../src\3_Enkapsulasi\MotorDemo1841720193Lintang.java)

Dari percobaan diatas, dapat kita amati sekarang atribut kecepatan tidak bisa diakses oleh pengguna dan diganti nilainya secara sembarangan. Bahkan ketika mencoba menambah kecepatan saat posisi kontak masih OFF, maka akan muncul notifikasi bahwa mesin OFF. 

Untuk mendapatkan kecepatan yang diinginkan, maka harus dilakukan secara gradual, yaitu dengan memanggil method tambahKecepatan() beberapa kali. Hal ini mirip seperti saat kita mengendarai motor. 

### Pertanyaan

1. Pada class TestMobil, saat kita menambah kecepatan untuk pertama kalinya, mengapa muncul peringatan “Kecepatan tidak bisa bertambah karena Mesin Off!”?  
    - Karena status kontak masih off, oleh karena itu kecepatan tidak bisa ditambah kecuali dinyalakan terlebih dahulu
2. Mengapat atribut kecepatan dan kontakOn diset private? 
    - Agar atribut kecepatan pada class Motor.java tidak bisa di ganti nilainya kecuali dengan method khusus pada class MotorDemo.java 
3. Ubah class Motor sehingga kecepatan maksimalnya adalah 100!
![Gambar motor ](img/18.Motor1841720193Lintang.PNG)
link kode program : [ini link ke kode program](../../src\3_Enkapsulasi\Motor1841720193Lintang.java)

###  Percobaan 3 -  Getter dan Setter 
Misalkan di sebuah sistem informasi koperasi, terdapat class Anggota. Anggota memiliki atribut nama, alamat dan simpanan, dan method setter, getter dan setor dan pinjam. Semua atribut pada anggota tidak boleh diubah sembarangan, melainkan hanya dapat diubah melalui method setter, getter, setor dan tarik. Khusus untuk atribut simpanan tidak terdapat setter karena simpanan akan bertambah ketika melakukan transaksi setor dan akan berkurang ketika melakukan peminjaman/tarik.

1. Berikut ini UML class buatlah class Mahasiswa pada program: 

2. Sama dengan percobaan 1 untuk membuat project baru 
    a. Buka Netbeans, buat project KoperasiGetterSetter. 
    b. Buat class Anggota. Klik kanan pada package koperasigettersetter – New – Java Class. 
    c. Ketikkan kode class Anggota dibawah ini. 
![Gambar KoperasiGetterSetter ](img/5.Anggota1841720193Lintang.PNG)
link kode program : [ini link ke kode program](../../src\3_Enkapsulasi\Anggota1841720193Lintang.java)

Jika diperhatikan pada class Anggota, atribut nama dan alamat memili masing-masing 1 getter dan setter. Sedangkan atribut simpanan hanya memiliki getSimpanan() saja, karena seperti tujuan awal, atribut simpanan akan berubah nilainya jika melakukan transaksi setor() dan pinjam/tarik().  

3. Selanjutnya buatlah class KoperasiDemo untuk mencoba class Anggota. 
![Gambar KoperasiGetterSetter ](img/6.KoperasiDemo1841720193Lintang.PNG)
link kode program : [ini link ke kode program](../../src\3_Enkapsulasi\KoperasiDemo1841720193Lintang.java)

Dapat dilihat pada hasil percobaan diatas, untuk mengubah simpanan tidak dilakukan secara langsung dengan mengubah atribut simpanan, melainkan melalui method setor() dan pinjam(). Untuk menampilkan nama pun harus melalui method getNama(), dan untuk menampilkan simpanan melalui getSimpanan(). 

###  Percobaan 4 -  Konstruktor, Instansiasi  

1. Langkah pertama percobaan 4 adalah ubah class KoperasiDemo seperti berikut 
![Gambar KoperasiGetterSetter ](img/7.KoperasiDemo1841720193Lintang.PNG)
link kode program : [ini link ke kode program](../../src\3_Enkapsulasi\KoperasiDemo1841720193Lintang.java)

Dapat dilihat hasil running program, ketika dilakukan pemanggilan method getNama() hasilnya hal ini terjadi  karena atribut nama belum diset nilai defaultnya. Hal ini dapat ditangani dengan membuat kontruktor. 

3. Ubah class Anggota menjadi seperti berikut 
![Gambar KoperasiGetterSetter ](img/8.Anggota1841720193Lintang.PNG)
link kode program : [ini link ke kode program](../../src\3_Enkapsulasi\Anggota1841720193Lintang.java)

Pada class Anggota dibuat kontruktor dengan access modifier default yang memiliki 2 parameter nama dan alamat. Dan didalam konstruktor tersebut dipastikan nilai simpanan untuk pertama kali adalah Rp. 0.

4. Selanjutnya ubah class KoperasiDemo sebagai berikut 
![Gambar KoperasiGetterSetter ](img/9.KoperasiDemo1841720193Lintang.PNG)
link kode program : [ini link ke kode program](../../src\3_Enkapsulasi\KoperasiDemo1841720193Lintang.java)

Setelah menambah konstruktor pada class Anggoata maka atribut nama dan alamat secara otomatis harus diset terlebih dahulu dengan melakukan passing parameter jika melakukan instansiasi class Anggota. Hal ini biasa dilakukan untuk atribut yang membutuhkan nilai yang spesifik. Jika tidak membutuhkan nilai spesifik dalam konstruktor tidak perlu parameter. Contohnya simpanan untuk anggota baru diset 0, maka simpanan tidak perlu untuk dijadikan parameter pada konstruktor. 

###   Pertanyaan – Percobaan 3 dan 4 

1. Apa yang dimaksud getter dan setter? 
    - Getter adalah public method dan memiliki tipe data return, yang berfungsi untuk mendapatkan nilai dari atribut private. Sedangkan setter adalah public method yang tidak memliki tipe data return, yang berfungsi untuk memanipulasi nilai dari atribut private.

2. Apa kegunaan dari method getSimpanan()? 
    - Merupakan method yang digunakan untuk mendapatkan nilai dari atribut simpanan yang nantinya method tersebut digunkan untuk menampilkan nilai dari atribut simpanan.

3. Method apa yang digunakan untk menambah saldo?
    - Method setor.

4. Apa yand dimaksud konstruktor? 
    - Konstruktor mirip dengan method cara deklarasinya akan tetapi tidak memiliki tipe return. Dan konsturktor dieksekusi ketika instan dari objek dibuat. Jadi setiap kali sebuat objek dibuat dengan keyword new() maka konstruktor akan dieksekusi. Atau kalau dari pandangan saya konstruktor merupakan cara untuk menambah parameter pada objek. 

5. Sebutkan aturan dalam membuat konstruktor? 
    - Nama konstruktor harus sama dengan nama class 
    - Konstruktor tidak memiliki tipe data return 
    - Konstruktor tidak boleh menggunakan modifier abstract, static, final, dan syncronized 

6. Apakah boleh konstruktor bertipe private? 
    - Tidak, bila private maka objek tidak bisa diakes atau tidak bisa di instansiasi oleh class lain.

7. Kapan menggunakan parameter dengan passsing parameter? 
    - Bila kita menggunakan konstruktor maka sebaiknya kita menggunakan passing parameter dan juga sebaliknya. 

8. Apa perbedaan atribut class dan instansiasi atribut? 
    - Class merupakan brueprint dari prototype dari objek, kalau instansiasi dibunakan untuk memanggil sebuah objek dari class yang lain. 

9. Apa perbedaan class method dan instansiasi method?  
    - Method merupakan suatu operasi berupa fungsi-fungsi yang dapat dikerjakan oleh suatu object. 

## Tugas

1. Cobalah program dibawah ini dan tuliskan hasil outputnya 
![Gambar EncapDemo ](img/10.EncapDemo1841720193Lintang.PNG)
link kode program : [ini link ke kode program](../../src\3_Enkapsulasi\EncapDemo1841720193Lintang.java)
 
![Gambar EncapTest ](img/11.EncapTest1841720193Lintang.PNG)
link kode program : [ini link ke kode program](../../src\3_Enkapsulasi\EncapTest1841720193Lintang.java)

2. Pada program diatas, pada class EncapTest kita mengeset age dengan nilai 35, namun pada saat ditampilkan ke layar nilainya 30, jelaskan mengapa. 

3. Ubah program diatas agar atribut age dapat diberi nilai maksimal 30 dan minimal 18. 
![Gambar EncapTest ](img/12.EncapDemo1841720193Lintang.PNG)
link kode program : [ini link ke kode program](../../src\3_Enkapsulasi\EncapDemo1841720193Lintang.java)

4. Pada sebuah sistem informasi koperasi simpan pinjam, terdapat class Anggota yang memiliki atribut antara lain nomor KTP, nama, limit peminjaman, dan jumlah pinjaman. Anggota dapat meminjam uang dengan batas limit peminjaman yang ditentukan. Anggota juga dapat mengangsur pinjaman. Ketika Anggota tersebut mengangsur pinjaman, maka jumlah pinjaman akan berkurang sesuai dengan nominal yang diangsur. Buatlah class Anggota tersebut, berikan atribut, method dan konstruktor sesuai dengan kebutuhan. Uji dengan TestKoperasi berikut ini untuk memeriksa apakah class Anggota yang anda buat telah sesuai dengan yang diharapkan. 
![Gambar Anggota ](img/13.Anggota1841720193Lintang.PNG)
link kode program : [ini link ke kode program](../../src\3_Enkapsulasi\AnggotaTugas1841720193Lintang.java)
![Gambar TestKoperasi ](img/14.TestKoperasi1841720193Lintang.PNG)
link kode program : [ini link ke kode program](../../src\3_Enkapsulasi\TestKoperasi1841720193Lintang.java)

5. Modifikasi soal no. 4 agar nominal yang dapat diangsur minimal adalah 10% dari jumlah pinjaman saat ini. Jika mengangsur kurang dari itu, maka muncul peringatan “Maaf, angsuran harus 10% dari jumlah pinjaman”. 
![Gambar AnggotaDiskon ](img/15.AnggotaDiskon1841720193Lintang.PNG)
link kode program : [ini link ke kode program](../../src\3_Enkapsulasi\AnggotaTugas1841720193Lintang.java)
![Gambar TestKoperasiDiskon ](img/16.TestKoperasiDiskon1841720193Lintang.PNG)
link kode program : [ini link ke kode program](../../src\3_Enkapsulasi\TestKoperasi1841720193Lintang.java)

6. Modifikasi class TestKoperasi, agar jumlah pinjaman dan angsuran dapat menerima input dari console. 
![Gambar TestKoperasiDiskon ](img/17.TestKoperasiModifikasi1841720193Lintang.PNG)
link kode program : [ini link ke kode program](../../src\3_Enkapsulasi\TestKoperasiModifikasi1841720193Lintang.java)

## Kesimpulan

Dari percobaan diatas, telah dipelajari kosep dari enkapsulasi, kontruktor, access modifier yang terdiri dari 4 jenis yaitu public, protected, default dan private. Konsep atribut atau method class yang ada di dalam blok code class dan konsep instansiasi atribut atau method. Cara penggunaan getter dan setter beserta fungsi dari getter dan setter. Dan juga telah dipelajari atau memahami notasi UML 

## Pernyataan Diri

Saya menyatakan isi tugas, kode program, dan laporan praktikum ini dibuat oleh saya sendiri. Saya tidak melakukan plagiasi, kecurangan, menyalin/menggandakan milik orang lain.

Jika saya melakukan plagiasi, kecurangan, atau melanggar hak kekayaan intelektual, saya siap untuk mendapat sanksi atau hukuman sesuai peraturan perundang-undangan yang berlaku.

Ttd,

***(LINTANG KUSUMA ADJIE)***
