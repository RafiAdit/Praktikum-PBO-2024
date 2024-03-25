public class RumahToko extends Rumah {
    private int jumlahToko;

    RumahToko(String tipe, String luas, int kamar, int lantai, int jumlahToko) {
        super(tipe, luas, kamar, lantai);
        this.jumlahToko = jumlahToko;
    }

    void display() {
        super.display();
        System.out.println("Jumlah Toko >>> " + jumlahToko);
        System.out.println("===========");
    }
}
