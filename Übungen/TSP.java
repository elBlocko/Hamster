import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class TSP extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {int yDiff,xDiff = 0;
int x1, x2, x3, x4,x  = 0;
int y1, y2, y3, y4 = 0;
int S12,S13,S14,S23,S24,S34= 0;
int numCorn,c = 0;
public void main() {
 // Koordinaten holen
 for (int i = 1; i<=4;i++) {
  x= 0;
  getCoordN1();
  }
 // Abstände berechnen

 calcS12();
 calcS13();
 calcS14();
 calcS23();
 calcS24();
 calcS34();
   
// Testausgabe  
 schreib("x1 = " + x1 + "\n y1= " + y1 + "\n x2 = " + x2 + "\n y2= " + y2 +
  "\n x3 = " + x3 + "\n y3= " + y3 + "\n x4 = " + x4 + "\n y4= " + y4); 
 schreib("S12 = " + S12 + "\n S13= " + S13 + "\n S14 = " + S14 + "\n S23= " + S23 +
  "\n S24 = " + S24 + "\n S34= " + S34); 
 
} // eoMain


// Methoden ------------------------------------------------------------------------
void calcS12() {
  if (x1 > x2) {
   xDiff = x1 - x2;
  } else {
   xDiff = x2 - x1;  
  }
  if (y1 > y2) {
   yDiff = y1 - y2;
  } else {
   yDiff = y2 - y1;  
  }
  S12 = xDiff + yDiff;
}
void calcS13() {
 if (x1 > x3) {
   xDiff = x1 - x3;
  } else {
   xDiff = x3 - x1;  
  }
  if (y1 > y3) {
   yDiff = y1 - y3;
  } else {
   yDiff = y3 - y1;  
  }
  S13 = xDiff + yDiff;
}
void calcS14() {
 if (x1 > x4) {
   xDiff = x1 - x4;
  } else {
   xDiff = x4 - x1;  
  }
  if (y1 > y4) {
   yDiff = y1 - y4;
  } else {
   yDiff = y4 - y1;  
  }
  S14 = xDiff + yDiff;
}
void calcS23() {
 if (x2 > x3) {
   xDiff = x2 - x3;
  } else {
   xDiff = x3 - x2;  
  }
  if (y2 > y3) {
   yDiff = y2 - y3;
  } else {
   yDiff = y3 - y2;  
  }
  S23 = xDiff + yDiff;
}
void calcS24() {
 if (x2 > x4) {
   xDiff = x2 - x4;
  } else {
   xDiff = x4 - x2;  
  }
  if (y2 > y4) {
   yDiff = y2 - y4;
  } else {
   yDiff = y4 - y2;  
  }
  S24 = xDiff + yDiff;
}
void calcS34() {
 if (x3 > x4) {
   xDiff = x3 - x4;
  } else {
   xDiff = x4 - x3;  
  }
  if (y3 > y4) {
   yDiff = y3 - y4;
  } else {
   yDiff = y4 - y3;  
  }
  S34 = xDiff + yDiff;
}

void getCoordN1() {   
   while (!kornDa()) { 
    x = scanneZeileNachKorn();
    if (kornDa()) {   
    c = countFieldCorn(); 
    allCornBack();     
    }
   if (c != 0) { 
    if (c == 1) { 
    x1 = x +1; 
    }
    if (c == 2) { 
    x2 = x +1;     
    }
    if (c == 3) { 
    x3 = x +1;    
    }
    if (c == 4) { 
    x4 = x +1;    
    }     
    } // eoif  
  } // eow 
  vor();
 if (c != 0) {     
  if (c == 1) {
  y1 = yDiff  + 1;
  }
  if (c == 2) {
  y2 = yDiff  + 1; 
  }
  if (c == 3) {
  y3 = yDiff  + 1;
  }
  if (c == 4) {
  y4 = yDiff  + 1;
  }
  } // eoif 
 c = 0; 
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
}


int countFieldCorn() {
 numCorn = 0;
 while (kornDa()) {
  nimm();
  numCorn++;
 } 
 return numCorn;
}

void allCornBack() {
  while (!maulLeer()) {
   gib();
  }
}

// Hamstermoves -----------------------------------------------------------

void gehZurNaechstenReihe() {

  yDiff++;

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
}