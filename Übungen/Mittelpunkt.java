import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class Mittelpunkt extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {int anzVertikal = 0;
int anzHorizontal = 0;
public void main() {
  
  anzVertikal = renneBisEndeMerkeFeldAnzahlVertikal();
  linksUm();
  anzHorizontal = renneBisEndeMerkeFeldAnzahlHorizontal();    
  umdrehen();
  renneZurMitte(anzHorizontal/2);
  rechtsUm();
  renneZurMitte(anzVertikal/2);
}

int renneBisEndeMerkeFeldAnzahlVertikal() {
 int j = 0;
 while (vornFrei()) {
  vor();
  j++;
 }
 return j;
}

int renneBisEndeMerkeFeldAnzahlHorizontal() {
int k = 0;
 while (vornFrei()) {
  vor();
  k++;
 }
 return k;
}

void renneZurMitte (int l) {
  for (int i=1; i<=l;i++) {
     vor();
  } 
}


// -----------------------------------------------


void umdrehen() { 
  for (int i=1; i<=2;i++) {
   linksUm();
  }
}


void rechtsUm() { 
  for (int i=1; i<=3;i++) {
   linksUm();
  }
}}