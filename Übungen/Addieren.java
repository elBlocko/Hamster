import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class Addieren extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {int n,m = 0;

public void main() {
 n = liesZahl("Gib die erste Zahl ein :"); 
 schreib("Das Ergebnis ist: " + gibErg());
    
}

int gibErg() { 
 for (int i=1; i<=n;i++) {
   m += i; 
  } 
 return m;
}}