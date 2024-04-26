abstract class Rumah {
    protected final String tipe;
    protected String luas;
    protected int kamar;
    protected int lantai;

    Rumah(String tipe, String luas, int kamar, int lantai) {
        this.tipe = tipe;
        this.luas = luas;
        this.kamar = kamar;
        this.lantai = lantai;
    }

    abstract void display();

    public void updateData(String newLuas, int newKamar, int newLantai){
        this.luas = newLuas;
        this.kamar = newKamar;
        this.lantai = newLantai;
    }

    protected final String getTipe() {
        return this.tipe;
    }

    protected final String getLuas() {
        return this.luas;
    }

    protected final int getKamar() {
        return this.kamar;
    }

    protected final int getLantai() {
        return this.lantai;
    }
}