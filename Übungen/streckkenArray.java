import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class streckkenArray extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {public void main() {
  int S12,S13,S14,S23,S24,S34= 0;
  S12 = 10;
  S13 = 5;
  S14 = 4;
  S23 = 7;
  S24 = 6;
  S34 = 5;  
  String inhalt = "";
  int min = Integer.MAX_VALUE;
  int erg =0;
  int[] strecken = { S12,S13,S14,S23,S24,S34 };
  for (int i=0;i<=2;i++) {  
   if (strecken[i] < min)
		min = strecken[i]; 
   inhalt += ("\n" + strecken[i] );    
   }   
   schreib("" + min);   
  
 for (int i=0;i<=2;i++) {
  switch(i) {
   	case 0: { 
     if (strecken[3] < strecken[4]) {
     erg = strecken[0] +  strecken[3] +  strecken[5];    
   } else {
    erg = strecken[0] +  strecken[4] +  strecken[5];       
   }    
    break;
    }
    case 1: { 
      if (strecken[3] < strecken[5]) {
     erg = strecken[1] +  strecken[3] +  strecken[4];    
   } else {
    erg = strecken[1] +  strecken[5] +  strecken[4];       
   }     
    break;
    }
    case 2: { 
      if (strecken[4] < strecken[5]) {
     erg = strecken[2] +  strecken[4] +  strecken[3];    
   } else {
    erg = strecken[2] +  strecken[5] +  strecken[3];       
   }   
    break;
    }
  } 
 } 
  
 /*  
 if(min == strecken[0]) {
   schreib("Zuerst nach 2");  
   if (strecken[3] < strecken[4]) {
     erg = strecken[0] +  strecken[3] +  strecken[5];    
   } else {
    erg = strecken[0] +  strecken[4] +  strecken[5];       
   }   
 }   
 if(min == strecken[1]) {
  schreib("Zuerst nach 3");  
  if (strecken[3] < strecken[5]) {
     erg = strecken[1] +  strecken[3] +  strecken[4];    
   } else {
    erg = strecken[1] +  strecken[5] +  strecken[4];       
   }
 }  
 if(min == strecken[2]) {
  schreib("Zuerst nach 4");  
  if (strecken[4] < strecken[5]) {
     erg = strecken[2] +  strecken[4] +  strecken[3];    
   } else {
    erg = strecken[2] +  strecken[5] +  strecken[3];       
   }
 }  */
   
   schreib("Die k�rzeste Strecke f�r die Rundreise in alle St�dte betr�gt " + erg); 
}
}