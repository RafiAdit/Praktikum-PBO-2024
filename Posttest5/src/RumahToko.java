class RumahToko extends Rumah {
    private int jumlahToko;

    RumahToko(String tipe, String luas, int kamar, int lantai, int jumlahToko) {
        super(tipe, luas, kamar, lantai);
        this.jumlahToko = jumlahToko;
    }

    @Override
    void display() {
        System.out.println("Tipe >>> " + getTipe());
        System.out.println("Luas >>> " + getLuas());
        System.out.println("Jumlah Kamar >>> " + getKamar());
        System.out.println("Jumlah Lantai >>> " + getLantai());
        System.out.println("Jumlah Toko >>> " + jumlahToko);
    }

    void display(boolean tambahan) {
        display();
        System.out.println("Ini adalah rumah dengan tambahan toko");
        System.out.println("===========");
    }
}