import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class Jogger extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {public void main() { 
 while (vornFrei()) { // renne die Hauptgerade bis ans ende
  boolean li = istLinksMauer();  
  boolean re = istRechtsMauer();
  if ((li)&&(re)) {
   vor();  // solange rechts und links Mauer, geh weiter
   } // eoif 
  else {
   if (!li) { // links ist frei, renn den ´Gang hoch und runter, geh weiter
     linksUm();  
     while (vornFrei()) {
      vor();
    } // eow
     umdrehen();  
     while (vornFrei()) {
      vor();
    } // eow
    linksUm();  
    vor();   
   } // eoif  
   if (!re) { // rechts ist frei, renn den ´Gang hoch und runter, geh weiter
     rechtsUm();  
     while (vornFrei()) {      
      vor();
    } // eow
     umdrehen();  
     while (vornFrei()) {
      vor();
    } // eow
    rechtsUm();
    vor();     
    } // eoif     
  } // eoelse  
 } // eow
}

// METHODEN -----------------------------

boolean istLinksMauer() {
 linksUm();
 if (!vornFrei()) {
  rechtsUm();
  return true;
 } // eoif
  else {
  rechtsUm();
  return false;
 } // eoelse
 
}


boolean istRechtsMauer() {
 rechtsUm();
 if (!vornFrei()) {
  linksUm();
  return true;  
 } else {
  linksUm();
  return false;
 }
}


// Hamster MOVES -----------------------

void rechtsUm() {
  linksUm();
  linksUm();
  linksUm();  
}

void  umdrehen() {
  linksUm();
  linksUm(); 
}}