import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface Authentication {
    void register(UserDatabase userDatabase);
    void login(UserDatabase userDatabase);
}   

class FacebookAuth implements Authentication {
    private User user;

    public void register(UserDatabase userDatabase) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Registrasi Facebook berhasil!");
        System.out.print("Masukkan nama Anda: ");
        String name = scanner.nextLine();
        System.out.print("Masukkan username: ");
        String username = scanner.nextLine();
        System.out.print("Masukkan password: ");
        String password = scanner.nextLine();
        System.out.print("Masukkan tanggal lahir Anda: ");
        String birthdate = scanner.nextLine();
        System.out.print("Masukkan alamat Anda: ");
        String address = scanner.nextLine();
        
        user = new User(name, username, password, birthdate, address);
        userDatabase.addUser(user);
        System.out.println("Registrasi berhasil!");
    }
    
    public void login(UserDatabase userDatabase) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan username: ");
        String username = scanner.nextLine();
        System.out.print("Masukkan password: ");
        String password = scanner.nextLine();

        User loggedInUser = userDatabase.getUserByUsernameAndPassword(username, password);
        if (loggedInUser != null) {
            user = loggedInUser;
            System.out.println("Login Facebook berhasil!");
            showHomePage();
        } else {
            System.out.println("Login gagal! Username atau password tidak valid.");
        }
    }
    
    private void showHomePage() {
        System.out.println("----- Home Page -----");
        System.out.println("Nama: " + user.getName());
        System.out.println("Username: " + user.getUsername());
        System.out.println("Tanggal Lahir: " + user.getBirthdate());
        System.out.println("Alamat: " + user.getAddress());
    }
}

class GenshinImpactAuth implements Authentication {
    private User user;

    public void register(UserDatabase userDatabase) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Registrasi Genshin Impact berhasil!");
        System.out.print("Masukkan nama Anda: ");
        String name = scanner.nextLine();
        System.out.print("Masukkan username: ");
        String username = scanner.nextLine();
        System.out.print("Masukkan password: ");
        String password = scanner.nextLine();
        System.out.print("Masukkan tanggal lahir Anda: ");
        String birthdate = scanner.nextLine();
        System.out.print("Masukkan alamat Anda: ");
        String address = scanner.nextLine();
        
        user = new User(name, username, password, birthdate, address);
        userDatabase.addUser(user);
        System.out.println("Registrasi berhasil!");
    }
    
    public void login(UserDatabase userDatabase) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan username: ");
        String username = scanner.nextLine();
        System.out.print("Masukkan password: ");
        String password = scanner.nextLine();

        User loggedInUser = userDatabase.getUserByUsernameAndPassword(username, password);
        if (loggedInUser != null) {
            user = loggedInUser;
            System.out.println("Login Genshin Impact berhasil!");
            showHomePage();
        } else {
            System.out.println("Login gagal! Username atau password tidak valid.");
        }
    }
    
    private void showHomePage() {
        System.out.println("----- Home Page -----");
        System.out.println("Nama: " + user.getName());
        System.out.println("Username: " + user.getUsername());
        System.out.println("Tanggal Lahir: " + user.getBirthdate());
        System.out.println("Alamat: " + user.getAddress());
    }
}

class MobileBankingAuth implements Authentication {
    private User user;

    public void register(UserDatabase userDatabase) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Registrasi Mobile Banking berhasil!");
        System.out.print("Masukkan nama Anda: ");
        String name = scanner.nextLine();
        System.out.print("Masukkan username: ");
        String username = scanner.nextLine();
        System.out.print("Masukkan password: ");
        String password = scanner.nextLine();
        System.out.print("Masukkan tanggal lahir Anda: ");
        String birthdate = scanner.nextLine();
        System.out.print("Masukkan alamat Anda: ");
        String address = scanner.nextLine();
        
        user = new User(name, username, password, birthdate, address);
        userDatabase.addUser(user);
        System.out.println("Registrasi berhasil!");
    }
    
    public void login(UserDatabase userDatabase) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan username: ");
        String username = scanner.nextLine();
        System.out.print("Masukkan password: ");
        String password = scanner.nextLine();

        User loggedInUser = userDatabase.getUserByUsernameAndPassword(username, password);
        if (loggedInUser != null) {
            user = loggedInUser;
            System.out.println("Login Mobile Banking berhasil!");
            showHomePage();
        } else {
            System.out.println("Login gagal! Username atau password tidak valid.");
        }
    }

    private void showHomePage() {
        System.out.println("----- Home Page -----");
        System.out.println("Nama: " + user.getName());
        System.out.println("Username: " + user.getUsername());
        System.out.println("Tanggal Lahir: " + user.getBirthdate());
        System.out.println("Alamat: " + user.getAddress());
    }
}

class User {
    private String name;
    private String username;
    private String password;
    private String birthdate;
    private String address;

    public User(String name, String username, String password, String birthdate, String address) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.birthdate = birthdate;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public String getAddress() {
        return address;
    }
}

class UserDatabase {
    private List<User> userList;

    public UserDatabase() {
        userList = new ArrayList<>();
    }

    public void addUser(User user) {
        userList.add(user);
    }

    public User getUserByUsernameAndPassword(String username, String password) {
        for (User user : userList) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        UserDatabase userDatabase = new UserDatabase(); // Membuat basis data pengguna

        do {
            System.out.print("Masukkan NIM Anda:");
            int nim = scanner.nextInt();
            
            Authentication authSystem;
            
            if (nim % 3 == 0) {
                System.out.println("Sistem Login dan Registrasi Facebook");
                authSystem = new FacebookAuth();
            } else if (nim % 3 == 1) {
                System.out.println("Sistem Login dan Registrasi Genshin Impact");
                authSystem = new GenshinImpactAuth();
            } else {
                System.out.println("Sistem Login dan Registrasi Mobile Banking");
                authSystem = new MobileBankingAuth();
            }
            
            System.out.println("Pilih aksi:");
            System.out.println("1. Registrasi");
            System.out.println("2. Login");
            System.out.println("3. Keluar");
            System.out.print("Masukkan Pilihan Anda:");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    authSystem.register(userDatabase); // Mengirim basis data sebagai parameter
                    break;
                case 2:
                    authSystem.login(userDatabase); // Mengirim basis data sebagai parameter
                    break;
                case 3:
                    exit = true;
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (!exit);
        
        scanner.close();
    }
}