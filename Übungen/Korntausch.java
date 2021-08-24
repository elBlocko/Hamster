import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class Korntausch extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {public void main() {
 fuellDieBacken();
 rennAnsEnde();
 gehEinFeldZurueck();
 entleereDieBacken();
 rennAnsEnde();
 fuellDieBacken();
 umdrehen();
 rennAnsEnde();
 entleereDieBacken();
 umdrehen();
 rennAnsEnde();
 gehEinFeldZurueck();
 fuellDieBacken();
 rennAnsEnde();
 entleereDieBacken();
    
}

void fuellDieBacken(){
 while (kornDa()) {
  nimm();  
 }
} //eom
void rennAnsEnde(){
  while (vornFrei()) {
  vor();  
 }
}  //eom


void gehEinFeldZurueck(){
 umdrehen();
 vor();
 umdrehen(); 
}  //eom

void entleereDieBacken(){
 while (!maulLeer()) {
  gib();  
 }
} //eom

void umdrehen(){
 int i = 0;
 while (i != 2) {
  linksUm();
  i++;
 } 
} //eom

}