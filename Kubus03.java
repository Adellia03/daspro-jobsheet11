import java.util.Scanner;
public class Kubus03 {
    static int hitungVolume (int a){
        int volume= a*a*a;
        return volume;
    }
    
    static int hitungLuasPermukaan (int a){
        int lp= 6*(a*a);
        return lp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int s;

        System.out.println("Masukkan sisi kubus");
        s=sc.nextInt();
        
        int vol = hitungVolume(s);
        int lp = hitungLuasPermukaan(s);

        System.out.println ("Volume kubus adalah "+vol);
        System.out.println ("Luas Permukaan kubus adalah "+lp);
    }
}


