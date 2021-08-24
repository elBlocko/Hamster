import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class ferngesteuert extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {int feldNummer;
public void main() {	
   feldNummer = liesZahl("Gib eine Feldnummer ein auf welcher der Hamster essen darf :");  
   if (feldNummer > 10) {
    schreib("Nummer ist größer als 10");
    return;
   }  
   vorAnz(feldNummer);  
   nimm();
}


// Hamster Standard Bewegungen
// -----------------------------------------------------------------------------------------------------
void vorAnz (int schritte) {
  for (int i=1; i<=schritte;i++) {
   vor();
  }
}}