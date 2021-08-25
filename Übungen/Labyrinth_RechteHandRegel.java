import de.hamster.debugger.model.Territorium;import de.hamster.debugger.model.Territory;import de.hamster.model.HamsterException;import de.hamster.model.HamsterInitialisierungsException;import de.hamster.model.HamsterNichtInitialisiertException;import de.hamster.model.KachelLeerException;import de.hamster.model.MauerDaException;import de.hamster.model.MaulLeerException;import de.hamster.model.MouthEmptyException;import de.hamster.model.WallInFrontException;import de.hamster.model.TileEmptyException;public class Labyrinth_RechteHandRegel extends de.hamster.debugger.model.IHamster implements de.hamster.model.HamsterProgram {int a,b,c;
public void main() {
while (!kornDa()){
while (linksMauer()&&vornFrei()&&!kornDa()){
 svor();
 }
pruefe();
}
}
boolean linksMauer(){
 linksUm();
 if (!vornFrei()){
  rechtsUm();
  return true;
 }else{
  rechtsUm();
  return false;
  }
 
}

void rechtsUm(){
linksUm();
linksUm();
linksUm();
}
void pruefe(){
 linksUm();
 if (vornFrei()){
  svor();
 }else{
  pruefe2();
  }
}
void pruefe2(){
 rechtsUm();
 if (vornFrei()){
  svor();
 }else{
  pruefe3();
 }
}
void pruefe3(){
 rechtsUm();
 if (vornFrei()){
  svor();
 }else{
  schreib("Kein Ausweg");
  }
}
void svor(){
 if(!kornDa()){
  vor();
 }
}
}