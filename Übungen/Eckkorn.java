import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class Eckkorn extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {public void main() {
 
 findeEinKorn();
  
    
}


void findeEinKorn() {
// Hamster steht schon auf Korn
 if (kornDa()) {
 nimm();
 return;
 }
// Hamster steht nicht auf Korn
 gehZurWand(); 
 linksUm();
 gehZurWand();  
}
 

void gehZurWand() {
// Renn bis zur wand, wenn Korn da 
 while (vornFrei()) {
 vor();
 if (kornDa()) {
 nimm();
 return; 
 //ende if
 } 
 }// ende while
}}