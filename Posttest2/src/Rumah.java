public class Rumah {
    private String tipe;
    private String luas;
    private int kamar;
    private int lantai;

    Rumah(String tipes, String luass, int kamars, int lantais){
        this.tipe= tipes ;
        this.luas = luass;
        this.kamar = kamars;
        this.lantai = lantais;
    }

    void display(){
        System.out.println("Tipe >>>" + this.tipe);
        System.out.println("Luas >>>" + this.luas);
        System.out.println("Jumlah Kamar >>>" + this.kamar);
        System.out.println("Jumlah Lantai >>>" + this.lantai);
        System.out.println("===========");
    }   

    public void settipe(String newtipe) {
        this.tipe = newtipe;
    }
    
    public void setluas(String newluas) {
        this.luas = newluas;
    }
    
    public void setkamar(int newkamar) {
        this.kamar = newkamar;
    }
    
    public void setlantai(int newlantai) {
        this.lantai = newlantai;
    }

    protected String getTipe() {
        return this.tipe;
    }

    public static String get(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }    
}