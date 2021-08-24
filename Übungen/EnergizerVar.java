import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class EnergizerVar extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {public void main() {
  int kornAnz = 0;
  kornAnz = omNomNom(); 
  vorAnz(kornAnz);  
}


int omNomNom () {
 int k = 0;
 while (kornDa()) {
  nimm();  
  k++;
 } // eow
 return k;
}

void vorAnz (int schritte) {
  for (int i=1; i<=schritte;i++) {
   vor();
  }
}}