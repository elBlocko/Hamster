import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class Mittelwert extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {float n,m = 0;
public void main() {
 n = liesZahl("Gib die erste Zahl ein :"); 
 m = liesZahl("Gib die zweite Zahl ein :");
 schreib("Der Mittelwert ist: " + ((m+n)/2));   
}
}