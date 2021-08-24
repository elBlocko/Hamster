import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class inverter extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {public void main() {
  sammleAllesEin();  
  renneBisZurMauerInvertiere();    
  invertiere(); 
}

// Hamster Standard Bewegungen
// --------------------------------------------------------------------------------------------------
void sammleAllesEin() {
 while (kornDa()) {
  nimm();  
 }
}  // eom

void renneBisZurMauerInvertiere() {
    while (vornFrei()) {
     invertiere();
     vor();  
  }
} // eom

void invertiere() {
 if (!kornDa()) {
  gib();
 } // eoif
 else {
  nimm();
 } // eoelse
}}