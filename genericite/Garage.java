
import java.util.ArrayList;
import java.util.List;
public class Garage {
  List<Voiture> listVoiture=new ArrayList<>();

  public Garage(List <? extends Voiture> list){
    for (Voiture obj:list){
      this.listVoiture.add(obj);
    }
  }

  public void afficher(){
    for (Voiture item:this.listVoiture){
      System.out.println(item.getMatricule()+" "+item.getMarque());
    }
  }
}
