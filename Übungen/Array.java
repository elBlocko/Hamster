import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class Array extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {public void main() {
   int x=1;
   String inhalt = "";
   int[] harry = new int[100];
   for (int i=0;i<harry.length;i++) {   
   harry[i] = x;  
   inhalt += ("\n" + x); 
    x++;
   }   
   schreib(inhalt);
}
}