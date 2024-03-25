public class RumahTinggal extends Rumah {
    private boolean adaTaman;

    RumahTinggal(String tipe, String luas, int kamar, int lantai, boolean adaTaman) {
        super(tipe, luas, kamar, lantai);
        this.adaTaman = adaTaman;
    }

    void display() {
        super.display();
        System.out.println("Ada Taman >>> " + adaTaman);
        System.out.println("===========");
    }
}
