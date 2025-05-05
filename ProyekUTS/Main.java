package ProyekUTS;

import ProyekUTS.Abstract.*;
import ProyekUTS.Interface.*;

public class Main {
    public static void main(String[] args) {
        KoleksiBuku<Buku> koleksi = new KoleksiBuku<>();
        koleksi.tambah(new Buku(" Algoritma Pemrograman", "Karsono"));
        koleksi.tambah(new Buku(" Manajemen Pemasaran", "Herlan"));

        Pengguna mhs = new Mahasiswa("Sutisna ", "Teknik Informatika");
        Pengguna dosen = new Dosen("Pak Dedi", "Manajemen");

        Peminjaman layanan = new Peminjam();

        layanan.pinjamBuku(mhs, koleksi.getDaftar().get(0));
        layanan.pinjamBuku(dosen, koleksi.getDaftar().get(1));

        layanan.tampilkanDataPinjaman();
    }
}

