/* Larynt Sawfa Kenanga - 202110370311189 */
import java.util.Scanner;

//Class Mahasiswa
public class Mahasiswa {

    private String Nama;
    private String NIM;
    private String Password;

    public void setNama(String Nama){
        this.Nama = Nama;
    }

    public void setNIM(String NIM){
        this.NIM = NIM;
    }

    public void setPassword(String Password){
        this.Password = Password;
    }

    public String getNama(){
        return Nama;
    }

    public String getNIM(){
        return NIM;
    }

    public String getPassword(){
        return Password;
    }

    public void daftar(){
        Scanner userInput = new Scanner(System.in);

        System.out.println("=== Daftar ===");
        System.out.print("Nama : ");
        String inputnama = userInput.nextLine();
        setNama(inputnama);
        while (true){
            System.out.print("NIM : ");
            String inputnim = userInput.nextLine();
            setNIM(inputnim);
            if(inputnim.length()==15){
                break;
            }else {
                System.out.println("NIM harus berjumlah 15 angka");
            }
        }
        while (true){
            System.out.print("Password : ");
            String inputpassword = userInput.nextLine();
            setPassword(inputpassword);
            if (inputpassword.length()>=8){
                break;
            }else {
                System.out.println("Password minimal 8 karakter");
            }
        }
    }

    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.daftar();
        System.out.println("");
        System.out.printf("Selamat %s Anda Berhasil Daftar", mahasiswa1.getNama());
        System.out.println("\n\nBerikut Username dan Password anda : ");
        System.out.println("Username : " + mahasiswa1.getNIM());
        System.out.println("Password : " + mahasiswa1.getPassword());
    }
}