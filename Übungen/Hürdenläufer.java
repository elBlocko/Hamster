import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class H�rdenl�ufer extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {public void main() {
 
 rennZumEnde ();
 nimm();
 umdrehen();
 
}

// Blick geradeaus vor der Mauer bis nach der Mauer
void springe() {
 linksUm();
 vor();
 rechtsUm();
 vor();
 vor();
 rechtsUm();
 vor();
 linksUm();
}


// geh bis zur Mauer und spring dr�ber
void nimmH�rde() {
 vor();  
 vor();    
 springe();
}

void rennZumEnde () {
 nimmH�rde();
 nimmH�rde();
 nimmH�rde();
 nimmH�rde();
 nimmH�rde();
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
}