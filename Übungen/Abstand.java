import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class Abstand extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {int n,m, abstand = 0;
public void main() {
 n = liesZahl("Gib die erste Zahl ein :"); 
 m = liesZahl("Gib die zweite Zahl ein :");
 berechneAbstand();
 if (abstand < 0) {
  abstand = abstand * (-1);
 } // eoif   
 schreib("Der Abstand ist " + abstand);
}

int berechneAbstand() {
 if (n > m) {
  abstand = (n - m);      
 } 
 if (n < m) {
  abstand = (m - n);     
 }
 if (n == m) {
  abstand = 0;
  }
 return abstand;  
} // eom
}