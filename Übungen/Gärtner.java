
import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class G�rtner extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {public void main() {
 
  int b = liesZahl("Breite = ");
   while (b > 8) { 
    schreib("Zahl darf nicht gr��er als 8 sein");
    b = liesZahl("Breite = "); 
   }
  int h = liesZahl("H�he = ");
   while (h > 8) { 
    schreib("Zahl darf nicht gr��er als 8 sein");
    h = liesZahl("H�he = "); 
   }  
  RechteckPflanzen(h,b);  
}

void RechteckPflanzen(int anz, int feldlaenge) {
 for (int i = 1; i <= anz;i++) {
  for (int k = 1; k <= feldlaenge; k++) {
   gib();
   vor();   
  }
  gehZurNaechstenReihe(feldlaenge);
 }
}

void vorN (int felder) {
 for (int i = 1; i <= felder;i++) {
  vor();
 } 
}

void gehZurNaechstenReihe(int felderLaufen) {
 rechtsUm();
 vor();
 rechtsUm(); 
 vorN(felderLaufen);
 umdrehen(); 
}

void rechtsUm() {
  linksUm();
  linksUm();
  linksUm();  
}

void  umdrehen() {
  linksUm();
  linksUm(); 
}}