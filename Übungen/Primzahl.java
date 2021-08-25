import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class Primzahl extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {public void main() {
int zahl = 0;
zahl = liesZahl("Gib die erste Zahl ein :");    
if (istPrimzahl(zahl) == true) {
 schreib("Es ist eine Primzahl ");
} // eoif
 else {
schreib("Es ist eine Primzahl ");
 } // eoelse
}


boolean istPrimzahl(int zahl) { 
            boolean primi = true;
             for (int i = 2; i < zahl; i++) {
                    if ((zahl % i) == 0) {
                           primi = false;
                           break;
                    }
             }
             return primi;
       }
}