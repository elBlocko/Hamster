import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class FunktionenKorn extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {int anz,n = 0;
public void main() {  
   anzKornAufAktFeld();  
   schreib("" + anz);  
   n = liesZahl("Auf wieviel Körner soll ich prüfen ?");      
   if (genugKornAufFeld(n)) {
   schreib("Ja es sind mindestens " + n + "Körner auf dem Feld");
   } else {
   schreib("Nein, es sind weniger als " + n + "Körner auf dem Feld");
   }
  
   if (geradeAnzKorn(anz)) {
     schreib("Kornanzahl ist gerade");
    } else { schreib("Kornanzahl ist un0gerade");
   } 
   
   
}

// METHODEN ----------------------------
int anzKornAufAktFeld() {
while (kornDa()) {    
    anz++;
    nimm();    
   } 
  return anz;  
}

boolean genugKornAufFeld(int n) {
  if (n <= anz) {
   return true;
  } else {
   return false;  
  }
}

boolean geradeAnzKorn(int anz) {
 if (anz%2 == 0) {
  return true; 
 } else {
  return false;
 }

}}