/**
 * Programm zur Ueberpruefung von Tippfehler oder Zahlendreher (Paritaetsbitpruefung)
 */

public class U4A4 {
	public static void main(String[] args) {
		
		// zu ueberpruefender Wert und dessen Sicherung ("wert" wird in Rechnung veraendert)
		int wert = 0x1f;
		int sicherung = wert;
		
		// speichert niederwertigsten Bit (Bit 0) von "wert" in neue Variable "pruefbit"
		int pruefbit = wert & 0x1;
		
		// Rechts-Shift(s) um eine Position und erneute Speicherung in neue Variablen
		wert = wert >> 1;
		int bit1 = wert & 0x1;
		wert = wert >> 1;
		int bit2 = wert & 0x1;
		wert = wert >> 1;
		int bit3 = wert & 0x1;
		wert = wert >> 1;
		int bit4 = wert & 0x1;
		
		// gibt aus, ob Summe der Bits (modulo 2) mit Pruefbit uebereinstimmt
		if((bit1 + bit2 + bit3 + bit4) %2 == pruefbit)
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