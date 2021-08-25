import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class Rundgang extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {public void main() {
 for (int i = 1; i <=4;i++) {
  while (vornFrei()) {
   if (!kornDa()) {
    vor();
   } // eoif
   else {
    nimm();
    vor(); // ohne vor(); sammelt alles ein
   } // eoelse
  } //eow  
   linksUm();   
 } // eofor    
}
}