import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class Heimweg extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {public void main() {
  renneBisKoerner();
   nimmAlleKoernerAuf(); 
   gehInDenBau();
   umdrehen();
   legeKoernerAb();
}




// Hamster Moves
// -----------------------------------------------------------------------------------------------------
void umdrehen() { 
  for (int i=1; i<=2;i++) {
   linksUm();
  }
}

void renneBisKoerner() {
  for (int i=1; i<=5;i++) {
   vor();
  }
}

void nimmAlleKoernerAuf() {
  for (int i=1; i<=9;i++) {
   nimm();
  }
}

 void gehInDenBau() { 
  for (int i=1; i<=3;i++) {
   vor();
  } 
 }
 
 void legeKoernerAb() {
 
   for (int i=1; i<=9;i++) {
  gib();
  }
 
 }}