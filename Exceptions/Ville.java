
public class Ville {
  int nbreHabitants;
   
  Ville(int nbreHabitants) throws NombresHabitantsException{
      if (nbreHabitants<0){
        throw new NombresHabitantsException();
      }else {
        this.nbreHabitants=nbreHabitants;
      }

    }

  

  public static void main(String[] args) {
    try {
      Ville ville=new Ville(-10);
    } catch (NombresHabitantsException e) {
    }
    System.out.println("c'est bien");
    
  }
}
