import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class Negativ extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {int n = 0;
public void main() {
 n = liesZahl("Gib deine Zahl ein :"); 
 schreib("Die Zahl: " + n + gibStr());   
}

String gibStr() {
 String Ergebnis = "";
 if (n >= 0) {
  Ergebnis = " ist eine positive Zahl";
 } else {
  Ergebnis = " ist eine negative Zahl";
 }
 return Ergebnis;
}

}