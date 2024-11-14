import java.util.ArrayList;
import java.util.List;
import Voiture;


public class Main {
  public static void main(String[] args){
    Voiture v1=new Voiture(7474747,"huynday");
    Voiture v2=new Voiture(374747,"Dacia");
    Voiture v3=new Voiture(55555,"volvo");
    List<Voiture> listVoiture=new ArrayList<>();
    Garage  garage=new Garage(listVoiture);
    garage.afficher();
  }
}
