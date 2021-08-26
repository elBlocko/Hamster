import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class Sackgasse extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {boolean l,r = false;
public void main() {
   while (vornFrei()) {
     vor();
    if (sackgasse() == false) {
     break;
    }
   }  
   if(sackgasse()) {
    schreib("SACKGASSE");
   } else {
     schreib("keine SACKGASSE!");   
   }   
  geheZurueck(); 
}

// METHODE

boolean sackgasse() {  
 linksUm();
 l = vornFrei(); 
 rechtsUm();
 rechtsUm();
 r = vornFrei();
 linksUm(); 
 if (l || r == true) {
  return false; 
 } else {
   return true; 
 } 
} // eom



void geheZurueck() {
   umdrehen();
   while (vornFrei()) {
     vor();
  } 
  umdrehen();
}

// Hamster Moves

void rechtsUm(){
linksUm();
linksUm();
linksUm();
}

void umdrehen() {
 linksUm();
 linksUm();
 
}
}