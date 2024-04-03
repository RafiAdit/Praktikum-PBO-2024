public class RumahToko extends Rumah {
    private int jumlahToko;

    RumahToko(String tipe, String luas, int kamar, int lantai, int jumlahToko) {
        super(tipe, luas, kamar, lantai);
        this.jumlahToko = jumlahToko;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Jumlah Toko >>> " + jumlahToko);
        
    }

    void display(boolean tambahan) {
        display();
        System.out.println("Ini adalah rumah dengan tambahan toko");
        System.out.println("===========");
    }
}
