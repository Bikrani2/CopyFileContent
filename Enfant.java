public class Enfant extends Personne {
  private String ecole;
  public Enfant(){
    System.out.println("je suis un enfant");
    this.nom="marie";
    System.out.println("je m'appelle "+this.nom);
  }
  public Enfant(String nomEnfant, int ageEnfant,String adresseEnfant,String ecoleEnfant){
    super(nomEnfant,ageEnfant,adresseEnfant);
    this.ecole=ecoleEnfant;
    System.out.println(this.nom+" "+this.age+" "+this.adresse+" "+this.ecole);
  }
  public void augmenterage(){
    super.age+=2;
    System.out.println("c'est mon age : "+age);
  }
}
