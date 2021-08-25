import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class Hamsterschach extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {int r,h = 0;
public void main() { 
 liesWerte();
 nVor(r);
 linksUm();
 nVor(h); 
}

void liesWerte() {
 r = liesZahl("Anzahl Felder nach Rechts : "); 
 while (r >= 10) {
  schreib("Zahl darf nicht größer als 9 sein");
  r = liesZahl("Anzahl Felder nach Rechts : "); 
 }
  h = liesZahl("Anzahl Felder nach Oben : ");
  while (h >= 10) { 
  schreib("Zahl darf nicht größer als 9 sein");
 h = liesZahl("Anzahl Felder nach Oben : "); 
  }
}

void nVor(int n) {
 for (int i = 1; i<=n;i++) {
  vor();
 }
}}