import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class Ausgeliefert extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {public void main() {
  int anz = 0;
  int n = 0;
  while (!kornDa()) {
   vor();
  }
  while (kornDa()) {   
   nimm();
   n++;
  }
  while (!maulLeer()) {
   gib();
  }
  anz  = liesZahl("Anzahl Körner zum Aufnehmen (max 10) : ");
   while (anz > n) { 
    schreib("Zahl darf nicht größer als 10 sein");
    anz = liesZahl("Anzahl Felder nach Oben : "); 
   }
  nimmN(anz);
  vor(); 
  while(vornFrei())  {
   vor();
  } 
}

// METHODEN ----------------------------------------

void nimmN (int N) {
 for (int i = 1; i<= N; i++) {
  nimm();
 } 
}}