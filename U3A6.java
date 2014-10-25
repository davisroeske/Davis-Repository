/**
 * Programm zur Ueberpruefung einiger Wertekombinationen, fuer die der logische Ausdruck "!wert1 & (wert1 | wert2)" den Wert "true" annimmt
 */

public class U3A6 {
	public static void main(String[] args) {
		
		// Zwei Variablen vom Typ boolean werden definiert und bekommen einen Wert zugewiesen
		boolean wert1=true;
		boolean wert2=true;
		
		// Ueberpruefung der Kombination #1
		if(!wert1 & (wert1 | wert2)) {
			System.out.println("JA: wert1==" + wert1 + " wert2==" + wert2);
		}
		else {
			wert2=!wert2;
			// Ueberpruefung der Kombination #2
			if(!wert1 & (wert1 | wert2)) {
			System.out.println("JA: wert1==" + wert1 + " wert2==" + wert2);
			}
			else {
				wert1=!wert1;
				// Ueberpruefung der Kombination #3
				if(!wert1 & (wert1 | wert2)) {
				System.out.println("JA: wert1==" + wert1 + " wert2==" + wert2);
				}
				else {
					wert2=!wert2;
					// Ueberpruefung der Kombination #4
					if(!wert1 & (wert1 | wert2)) {
					System.out.println("JA: wert1==" + wert1 + " wert2==" + wert2);
					}
					else {
						System.out.println("NEIN");
					}
				}
			}
		}
		
}
}