package ProyekUTS.Abstract;
 
public abstract class Pengguna {
    protected String nama;

    public Pengguna(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public abstract String getInfo();

    @Override
    public String toString() {
        return getInfo();
    }
}

