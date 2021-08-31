import java.util.ArrayList;
import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class Fakultät_Array_ausgabe extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {int n = 0;
String inhalt = "";
  
public void main() {
  
  // Eingabe Zahl n stellen  
  n = liesZahl("Bitte gib die Zahl an Elementen ein");
  
  // erzeuge Liste mit Elementen von 1 bis n   
   ArrayList<Integer> myNumbers = new ArrayList<Integer>();
   for (int i=1;i<=n;i++) {   
    myNumbers.add(i);
   inhalt += ("\n" + i); 
 } 
  // erzeuge Liste mit n! Möglichen Anordnungen der Elemente
 
   
  // gebe die Liste aus   
  schreib("" + inhalt.charAt(1));
   
 
}

}