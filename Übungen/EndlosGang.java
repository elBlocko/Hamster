import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class EndlosGang extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {public void main() {
 while ((!kornDa()) && (vornFrei())) {
  vor(); 
  if (!vornFrei()) {
    if (istLinksMauer()) {
      rechtsUm();         
    } // eoif1      
  } // eoif2
 } // eow  
 nimm();    
} //eoMain

boolean istLinksMauer() {
 linksUm();
 if (!vornFrei()) {
  rechtsUm();
  return true;
 } // eoif
  else {
  return false;
 } // eoelse
 
}

/*
boolean istReechtsMauer() {
 rechtsUm();
 if (!vornFrei()) {
  return = true;
 } else {
  return = false;
 }
 linksUm();
}
*/


void rechtsUm() {
  linksUm();
  linksUm();
  linksUm();  
}}