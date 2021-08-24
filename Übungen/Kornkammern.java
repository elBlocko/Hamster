import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class Kornkammern extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {int kornAnz = 0;
int felderHoch = 0;
int gerannterWeg = 0;
int wegZurMitte = 0;
// --------------------------------------------------------------------------------------------
public void main() {
 
 
   
  renneBisEndeSammleAllesEin();
  felderHoch = renneHochLegeHaelfteAb();
  gerannterWeg = renneRunterLegeRestAb();
  wegZurMitte = gerannterWeg - felderHoch;
  renneInDieMitte(wegZurMitte);  
} // eoMain

void renneBisEndeSammleAllesEin() { 
 while (vornFrei()) {
  rennBisKornAufFeld();
  kornAnz += sammleAllesEin();
 }  // eow  
}
 // eom


int renneHochLegeHaelfteAb() {
 int l = 0;
 linksUm();
  while (vornFrei()) {
   vor();
   l++;
}  
  gibAnz(kornAnz/2); 
  umdrehen();   
  return l;
}


int  renneRunterLegeRestAb(){
  int j = 0;
  while (vornFrei()) {
   vor();
   j++;
  }
  gibAnz(kornAnz/2);  
  umdrehen();
  return j;
 } 

 
void renneInDieMitte(int w) {
   for (int i=1; i<=w;i++) {
     vor();
  } 
  linksUm();
}

// -------------------------------------------------------------------------------------------------------

void rennBisKornAufFeld() {
  while (!kornDa()) {
   if (vornFrei()) {
     vor();  
     } //eoif
    else break; 
  }
}
 // eom

int sammleAllesEin() {
 int k = 0;
  while (kornDa()) {
   nimm();  
   k++;
  } // eow
 return k;
} // eom


void gibAnz(int Anz) {  
   for (int i=1; i<=Anz;i++) {
     gib();
  } 
}

void umdrehen() { 
  for (int i=1; i<=2;i++) {
   linksUm();
  }
}


}