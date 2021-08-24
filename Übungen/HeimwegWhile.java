import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class HeimwegWhile extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {public void main() {
   renneBisKoerner();
   nimmAlleKoernerAuf(); 
   gehInDenBau();
   umdrehen();
   legeKoernerAb();
}




// Hamster Moves
// -----------------------------------------------------------------------------------------------------
void umdrehen() { 
 int i = 0;
 while (i != 2) {
  linksUm();
  i++;
 } 
}

void renneBisKoerner() {
 int i = 0;
 while (i != 5) {
  vor();
  i++;
 } 
}

void nimmAlleKoernerAuf() {
 int i = 0;
 while (i != 9) {
 nimm();
 i++;
 } 
}

 void gehInDenBau() { 
 int i = 0;
 while (i != 3) {
  vor();
  i++;
 }  
 }
 
 void legeKoernerAb() {
 
  int i = 0;
 while (i != 9) {
  gib();
  i++;
 } 
 
 }}