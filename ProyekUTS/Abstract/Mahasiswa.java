package ProyekUTS.Abstract;
 
public class Mahasiswa extends Pengguna {
    private String jurusan;

    public Mahasiswa(String nama, String jurusan) {
        super(nama);
        this.jurusan = jurusan;
    }

    @Override
    public String getInfo() {
        return "Mahasiswa: " + nama + "- "+  jurusan;
    }
}
