import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class Quartier extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {int a = 0;
public void main() {
    int richtung = laengsterGang();
    
    if(richtung==1) {
      linksUm();    
    }
    if(richtung==3) {
      for (int i = 2;i<=3;i++) {
        linksUm();
      }           
    }    
    while(vornFrei()) {
      vor();
    }    
}

int laengsterGang() { 
int x,y,z =0;
 x = pruefeGang();
 a=0;
 linksUm();
 y= pruefeGang();
 a=0;
 umdrehen();
 z= pruefeGang();
 linksUm();
 a=0; 
  // geradeaus
  if (x>y && x>z) {
    return 2;
  }
  // links vom Hamster
  if (y>x && y>z) {
    return 1;
  }
  
  // rechts vom Hamster
  if (z>y && z>x) {
    return 3;
  } else {   
  return 0;
  } 
}

int pruefeGang () {  
  while (vornFrei()) {   
   vor();
   a++;
 }
 umdrehen(); 
 vorN(a);
 umdrehen();
 return a;
}

void umdrehen() {
 linksUm();
 linksUm();
}

void rechtsUm() {
 linksUm();
 linksUm();
 linksUm(); 
}


void vorN (int anz) {
 for (int i=1;i<=anz;i++) {
  vor();
 } 
}}