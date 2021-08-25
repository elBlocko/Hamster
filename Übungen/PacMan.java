import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class PacMan extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {public void main() {
 while (vornFrei()) {
  frissEineReiheGerade();  
  schrittZurueck();
  findeKorn();  
  }
 nimm();  
} //eoMain

void rechtsUm() {
 linksUm();
 linksUm();
 linksUm();  
} 
 
void schrittZurueck() {
 linksUm();
 linksUm();
 vor();
 linksUm();
 linksUm();
} 

void frissEineReiheGerade() {
 while (vornFrei() && (kornDa())) {
     nimm();
     vor();      
    } // eow
} // eom

void  dreheBisVornFrei() {
while (!vornFrei()) {
   linksUm(); 
  } // eow 
}

void findeKorn() {
 while (!kornDa()) {
  vor();
  if (kornDa()) {
   return;
  } 
  schrittZurueck();
  linksUm();
 } // eow
}}