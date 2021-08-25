import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class Teiler extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {int n,m;
public void main() {
 n = liesZahl("Gib die erste Zahl ein :"); 
 m = liesZahl("Gib die zweite Zahl ein :");
 
 if (n%m == 0) {
  schreib(m + " ist Teiler von " + n);
 } 
  else { schreib(m + " ist kein Teiler von " + n);
  }
}
}