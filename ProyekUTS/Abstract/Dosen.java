package ProyekUTS.Abstract;
 
public class Dosen extends Pengguna {
    private String prodi;

    public Dosen(String nama, String prodi) {
        super(nama);
        this.prodi = prodi;
    }

    @Override
    public String getInfo() {
        return "Dosen: " + nama + " - " + prodi;
    }
}

