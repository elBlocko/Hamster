import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class Diagonale extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {public void main() {
 renneAuﬂenkreisVerteileVier();
 gehZumInnerenKreis();
 renneInnerenKreisVerteileVier();
 gehZurMitte();  
 legeLetztesKornGehZurEndPosition();   
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


// -----------------------------------------------------------------------------------------------------

void renneAuﬂenkreisVerteileVier() {
 linksUm();
 gib();
 renneVierFelder();
 gib();
 rechtsUm();
 renneVierFelder();
 gib();
 rechtsUm();
 renneVierFelder();
 gib();
 rechtsUm();
}

void renneInnerenKreisVerteileVier() {
 gib();
 renneZweiFelder();
 rechtsUm();
 gib();
 renneZweiFelder();
 rechtsUm();
 gib();
 renneZweiFelder();
 rechtsUm();
 gib();
}



void gehZumInnerenKreis() {
 renneDreiFelder();
 rechtsUm();
 vor();
}

void gehZurMitte() {
 
 vor();
 rechtsUm();
 vor();
}

void legeLetztesKornGehZurEndPosition() {
 gib();
 rechtsUm();
 renneZweiFelder();
 rechtsUm();
 vor();
 umdrehen();
}

void renneVierFelder() {
 vor();
 vor();
 vor();
 vor(); 
}

void renneDreiFelder() {
 vor();
 vor();
 vor();
 
}

void renneZweiFelder() {
 vor();
 vor();

}

}