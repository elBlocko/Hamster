import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class Mähdrescher extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {public void main() {
   while (vornFrei()) {
   vor();
    ernteSpalte();
  }     
} // eoMain

// ----

void ernteSpalte() {
 rechtsUm();
 while (vornFrei()) {
  rennBisKornAufFeld();
  sammleAllesEin();
 } //eoVF
 umdrehen();
 while (vornFrei()) {
  vor();
 }
 rechtsUm();
} //eom



// Hamster Standard Bewegungen
// -----------------------------------------------------------------------------------------------------
void rechtsUm() {
 for (int i=1; i<=3;i++) {
   linksUm();
  }
}

void umdrehen() { 
 for (int i=1; i<=2;i++) {
   linksUm();
  } 
}

void vorAnz (int schritte) {
  for (int i=1; i<=schritte;i++) {
   vor();
  }
}

void  rennBisKornAufFeld() {
  while (!kornDa()) {
   if (vornFrei()) {
     vor();  
     } //eoif
    else break; 
  }
}
 // eom  

void sammleAllesEin() {
 while (kornDa()) {
  nimm();  
 }
}  // eom
}