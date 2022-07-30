/**
 * HavaSicakliginaGoreEtkinlikOnerme
 */
import java.util.Scanner;

public class HavaSicakliginaGoreEtkinlikOnerme {

    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklıgı gir bakam koç: ");
        heat = input.nextInt();

        if (heat < 5){
            System.out.println("Suan varya ne kayilir ha kayak yapma vakti kenks ");
        }else if (heat <= 25){

            if (heat <= 15){
                System.out.println("Sinemaya gitmenin tam vakti kenks sen anladın...");

            }
            if (heat >=10){
                System.out.println("Piknige git kenks karpuz keser yeriz miss");
            }
        } else {
            System.out.println("Yüzmeye git kenks cayır cayır yanıyor hava bune sıcaktır ya");
        }

    }
}