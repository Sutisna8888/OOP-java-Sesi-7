package ProyekUTS.Abstract;
 
public class DataPeminjaman {
    private Pengguna pengguna;
    private Buku buku;

    public DataPeminjaman(Pengguna pengguna, Buku buku) {
        this.pengguna = pengguna;
        this.buku = buku;
    }

    public Pengguna getPengguna() {
        return pengguna;
    }

    public Buku getBuku() {
        return buku;
    }
}

