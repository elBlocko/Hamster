import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class Ingenieur extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {boolean yDiffZaehlen = false;
int yDiff, xDiff = 0;
int x1, x2 = 0;
public void main() {
    // renne zeilenweise bis 1. Korn
    // renne zw bis 2. Korn    
    // merke Anzahl gelaufene Felder wenn Korn gefunden
    // merke Anzahl gewechselte Zeilen von Korn 1 bis 2
   
  while (!kornDa()) {
    x1 = scanneZeileNachKorn() +1;    
  }
  vor();
  yDiffZaehlen = true;
  while (!kornDa()) {     
     x2 = scanneZeileNachKorn() +1;    
  } 
 
  if (x1 > x2) {
   xDiff = x1 - x2;
  } else {
   xDiff = x2 - x1;
  
  }
 
  schreib("y-Differenz ist: " + yDiff + "\n x- Differenz ist:  " + xDiff); 
  
}

void gehZurNaechstenReihe() {
 if (yDiffZaehlen) {
  yDiff++;
 }
 rechtsUm();
 vor();
 rechtsUm(); 
 while (vornFrei()) {
  vor();  
 } 
 umdrehen();  
}

void rechtsUm() {
  linksUm();
  linksUm();
  linksUm();  
}

void  umdrehen() {
  linksUm();
  linksUm(); 
}

int scanneZeileNachKorn() { 
 int a = 0;
 while ((vornFrei()) && (!kornDa())) {
  vor();  
  a++;    
 } 
 if (!kornDa()) {
  gehZurNaechstenReihe();
 
 }
  return a;
}}