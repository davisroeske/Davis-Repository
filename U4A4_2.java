/**
 * Programm zur Ueberpruefung von Tippfehler oder Zahlendreher (Paritaetsbitpruefung)
 */

public class U4A4_2 {
	public static void main(String[] args) {
		
		// zu ueberpruefender Wert und dessen Sicherung ("wert" wird in Rechnung veraendert)
		int wert = 0x1f;
		int sicherung = wert;
		
		// speichert niederwertigsten Bit (Bit 0) von "wert" in neue Variable "pruefbit"
		int pruefbit = wert & 0x1;
		
		// Rechts-Shift(s) um eine Position und Addition zu "summe" solange wert !=0
		int summe = 0;
		while(wert !=0)
		{
			wert = wert >> 1;
			summe += wert & 0x1;
		}
		
		// gibt aus, ob Summe der Bits (modulo 2) mit Pruefbit uebereinstimmt
		if(summe %2 == pruefbit)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
		// "wert" bekommt wieder seinen Ursprungswert (Backup)
		wert = sicherung;

}
}