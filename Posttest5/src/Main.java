import java.io.*;
import java.util.*;

public class Main {
    private static final InputStreamReader p = new InputStreamReader(System.in);
    private static final BufferedReader input = new BufferedReader(p);

    private static final ArrayList<Rumah> DataRumah = new ArrayList<>();

    private static void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        while (true) {
            System.out.println("===========");
            System.out.println(" Pendataan");
            System.out.println("===========");
            System.out.println("1. Nambah data");
            System.out.println("2. Display data");
            System.out.println("3. Update data");
            System.out.println("4. Delete data");
            System.out.println("5. Exit");
            System.out.println("===========");
            System.out.print("Masukan pilihan anda >>> ");
            int pilih = Integer.parseInt(input.readLine());
            switch (pilih) {
                case 1:
                    createData();
                    break;
                case 2:
                    displayData();
                    break;

                case 3:
                    updateData();
                    break;

                case 4:
                    deleteData();
                    break;

                case 5:
                    System.out.println("Keluar program");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Pilihan tidak ada");
                    break;
            }
        }
    }

    static void createData() throws NumberFormatException, IOException {
        System.out.println("Nambah data");
        System.out.println("===========");
        System.out.println("1. Data Rumah Tinggal");
        System.out.println("2. Data Rumah Toko");
        System.out.print("Pilih jenis rumah yang mau ditambahkan >>>");
        int batasan = Integer.parseInt(input.readLine());
        switch (batasan) {
            case 1:
                createDataRumahTinggal();
                break;
            case 2:
                createDataRumahToko();
                break;

            default:
                System.out.println("Pilihan tidak ada");
                System.out.println("===========");
                break;
        }
        System.out.println("Data telah di tambahkan");
        System.out.println("===========");
    }

    static void createDataRumahTinggal() throws NumberFormatException, IOException {
        System.out.println("Nambah data Rumah Tinggal");
        System.out.println("===========");
        System.out.print("Masukan tipe rumah >>> ");
        final String tipe = input.readLine();
        System.out.print("Masukan luas rumah >>> ");
        String luas = input.readLine();
        System.out.print("Masukan jumlah kamar >>> ");
        int kamar = Integer.parseInt(input.readLine());
        System.out.print("Masukan jumlah lantai >>> ");
        int lantai = Integer.parseInt(input.readLine());
        System.out.print("Apakah ada taman? (true/false) >>> ");
        boolean adaTaman = Boolean.parseBoolean(input.readLine());
        RumahTinggal rumahTinggal = new RumahTinggal(tipe, luas, kamar, lantai, adaTaman);
        DataRumah.add(rumahTinggal);
        System.out.println("Data Rumah Tinggal telah ditambahkan");
        System.out.println("===========");
    }

    static void createDataRumahToko() throws NumberFormatException, IOException {
        System.out.println("Nambah data Rumah Toko");
        System.out.println("===========");
        System.out.print("Masukan tipe rumah >>> ");
        final String tipe = input.readLine();
        System.out.print("Masukan luas rumah >>> ");
        String luas = input.readLine();
        System.out.print("Masukan jumlah kamar >>> ");
        int kamar = Integer.parseInt(input.readLine());
        System.out.print("Masukan jumlah lantai >>> ");
        int lantai = Integer.parseInt(input.readLine());
        System.out.print("Masukan jumlah toko >>> ");
        int jumlahToko = Integer.parseInt(input.readLine());
        RumahToko rumahToko = new RumahToko(tipe, luas, kamar, lantai, jumlahToko);
        DataRumah.add(rumahToko);
        System.out.println("Data Rumah Toko telah ditambahkan");
        System.out.println("===========");
    }

    static void displayData() {
        for (int i = 0; i < DataRumah.size(); i++) {
            int index = i + 1;
            System.out.println("Index " + index + ": ");
            Rumah rumah = DataRumah.get(i);
            rumah.display();
        }
    }

    static void updateData() throws IOException {
        System.out.println("Update Data");
        System.out.println("============");
        displayData();
        System.out.print("Masukkan index data yang ingin diupdate >>> ");
        int idx = Integer.parseInt(input.readLine());
        int idxUpdate = idx - 1;
        if (idxUpdate >= 0 && idxUpdate < DataRumah.size()) {
            Rumah rumah = DataRumah.get(idxUpdate);
            System.out.println("Data sebelum diupdate:");
            rumah.display();
            System.out.print("Masukkan luas rumah baru >>> ");
            String newLuas = input.readLine();
            System.out.print("Masukkan jumlah kamar baru >>> ");
            int newKamar = Integer.parseInt(input.readLine());
            System.out.print("Masukkan jumlah lantai baru >>> ");
            int newLantai = Integer.parseInt(input.readLine());
    
            rumah.updateData(newLuas, newKamar, newLantai);
    
            System.out.println("Data berhasil diupdate!");
    
            // Menampilkan kembali semua data setelah update
            System.out.println("Data setelah diupdate:");
            System.out.println("===========");
            displayData();
        } else {
            System.out.println("Indeks data tidak valid!");
            System.out.println("===========");
        }
    }
    

    static void deleteData() throws IOException {
        System.out.println("Delete Data");
        System.out.println("============");
        displayData();
        System.out.print("Masukkan index data yang ingin didelete >>> ");
        int idx = Integer.parseInt(input.readLine());
        int idxUpdate = idx - 1;
        if (idxUpdate >= 0 && idxUpdate < DataRumah.size()) {
            DataRumah.remove(idxUpdate);
            System.out.println("Data berhasil dihapus:");
            System.out.println("===========");
            displayData();
        } else {
            System.out.println("Indeks data tidak valid!");
            System.out.println("===========");
        }
    }
}
