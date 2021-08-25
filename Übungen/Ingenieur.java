import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class Ingenieur extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {public void main() {
    // renne zeilenweise bis 1. Korn
    // renne zw bis 2. Korn    
    // merke Anzahl gelaufene Felder wenn Korn gefunden
    // merke Anzahl gewechselte Zeilen von Korn 1 bis 2
  int gelFelder, gewZeilen = 0;
  
  while (!kornDa()) {
    gelFelder = scanneZeileNachKorn() +1;
    
  }
  
  
   
//  gewZeilen = gehZurNaechstenReihe();
    
    
}

int gehZurNaechstenReihe() {
 int b = 0; 
 b++;   
 rechtsUm();
 vor();
 rechtsUm(); 
 while (vornFrei()) {
  vor();  
 } 
 umdrehen(); 
 return b;
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