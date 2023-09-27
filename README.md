# Tugas M03: Transaksi

## Tujuan
Mempraktekkan penggunaan `constructor` pada Kelas Java

## Deskripsi 

Mahasiswa diminta untuk membuat 2 buat kelas yaitu kelas `Pelanggan` dan kelas `Transaksi`.


Buatlah kelas `Pelanggan` dengan properti berikut ini.

* Nama (string)
* No. ID (integer)
* No. HP (string)
* Email (string)
* member (boolean) // true jika member, false jika bukan.
* Status (integer) // 1 = aktif, 0 = non-aktif

Buatlah kelas `Transaksi` dimana kelas ini memiliki property berikut ini yang semuanya memiliki access modifier Public.
* jumlah barang (integer)
* harga barang (integer)
* pelanggan (Pelanggan) bersifat no modifier

Selain itu, kelas `Transaksi` juga memiliki sebuah constructor dengan argumen berupa objek dari kelas `Pelanggan`. Kelas `Transaksi` juga memiliki method `hitungTotalBayar` yang akan menghitung jumlah pembayaran yang harus dibayar oleh pelanggan dengan aturan sebagai berikut:
* Jika total belanja 500rb - 1jt, pelanggan tersebut mendapat diskon member 1%
* Jika total belanja > 1jt hingga 10jt, pelanggan tersebut mendapat diskon member 3%
* Jika total belanja > 10 jt, pelanggan tersebut mendapat diskon member 3%

Aturan diatas hanya berlaku untuk pelanggan yang merupakan member.
