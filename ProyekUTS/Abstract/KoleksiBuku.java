package ProyekUTS.Abstract;

import java.util.ArrayList;
import java.util.List;

public class KoleksiBuku<T> {
    private List<T> daftar = new ArrayList<>();

    public void tambah(T item) {
        daftar.add(item);
    }

    public List<T> getDaftar() {
        return daftar;
    }
}

