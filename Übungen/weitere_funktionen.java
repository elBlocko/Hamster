import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class weitere_funktionen extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {int a = 0;
public void main() {
  if (hintenFrei()) {
   schreib("Ja, hinten ist frei");
   } else {
   schreib("Nein, hinten ist nicht frei"); 
  }  
  umdrehen();
  nFelderFrei();
  umdrehen();
  nVor(a);
  umdrehen();  
  schreib(a + " Felder vor mir Frei"); 
  
}

boolean hintenFrei() {
  umdrehen();
  if (vornFrei()) {
   return true;
  } else {
   return false;
  }
}

void umdrehen() {
 linksUm();
 linksUm();
 
}

int nFelderFrei() {
 
 while (vornFrei()) {
  vor();
  a++;
 }
 return a;

}

void nVor(int a) {
 for (int i =1; i<=a;i++) {
  vor();
 }


}}