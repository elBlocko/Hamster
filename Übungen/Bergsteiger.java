import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class Bergsteiger extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {public void main() {
 
vor();
stufeHochsteigen();
stufeHochsteigen();
nimm();
stufeHochsteigen();
stufeHochsteigen();
umdrehen();
}


// -----------------------------------------------------------------------------------------------------
void rechtsUm() {
 linksUm();
 linksUm();
 linksUm();
}


void umdrehen() { 
 linksUm();
 linksUm(); 
}

void stufeHochsteigen(){

linksUm();
vor();
rechtsUm();
vor();

}}