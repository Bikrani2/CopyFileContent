package genericite;

public class Voiture {
  private int matricule;
  private String marque;

  public Voiture(int val,String marq){
    this.matricule=val;
    this.marque=marq;
  }

  public int getMatricule(){
    return  matricule;
  }

  public String getMarque(){
    return marque;
  }
}
