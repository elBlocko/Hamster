import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class Multiplizieren extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {int multiplikant,multiplikator,c = 0;
public void main() {
 multiplikant = liesZahl("Gib die erste Zahl ein :"); 
 multiplikator = liesZahl("Gib die zweite Zahl ein :");  
 schreib("Die Zahl: " + gibErg());    
}
// 2*5 = 2+2+2+2+2
int gibErg() { 
 int i = 0;
 while (i < multiplikator){
  c += multiplikant; 
  i++;
 }
 return c;
}}