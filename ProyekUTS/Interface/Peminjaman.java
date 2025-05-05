package ProyekUTS.Interface;

import ProyekUTS.Abstract.Buku;
import ProyekUTS.Abstract.Pengguna;

public interface Peminjaman {
    void pinjamBuku(Pengguna pengguna, Buku buku);
    void tampilkanDataPinjaman();
}

