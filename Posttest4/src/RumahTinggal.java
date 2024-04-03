public class RumahTinggal extends Rumah {
    private boolean adaTaman;

    RumahTinggal(String tipe, String luas, int kamar, int lantai, boolean adaTaman) {
        super(tipe, luas, kamar, lantai);
        this.adaTaman = adaTaman;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Ada Taman >>> " + adaTaman);
    }

    void display(boolean tambahan) {
        display();
        if (adaTaman) {
            System.out.println("Ini adalah rumah tinggal dengan properti tambahan");
        } else {
            System.out.println("Ini adalah rumah tinggal tanpa properti tambahan");
        }
        System.out.println("===========");
    }
}

