package ProyekUTS.Interface;

import java.util.ArrayList;
import java.util.List;
import ProyekUTS.Abstract.*;

public class Peminjam implements Peminjaman {
    private List<DataPeminjaman> data = new ArrayList<>();

    @Override
    public void pinjamBuku(Pengguna pengguna, Buku buku) {
        DataPeminjaman pinjam = new DataPeminjaman(pengguna, buku);
        data.add(pinjam);
        System.out.println(pengguna.getNama() + " meminjam buku: " + buku);
    }

    @Override
    public void tampilkanDataPinjaman() {
        System.out.println("\n=== Data Peminjaman ===");
        for (DataPeminjaman p : data) {
            System.out.println(p.getPengguna()  +" - "+  p.getBuku());
        }
    }
}

