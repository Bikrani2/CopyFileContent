public class Personne {
  protected String nom;
  protected int age;
  protected String adresse;
  public Object object;
  public Personne(){
    System.out.println("c'est un constructeur par defaut.");
  }
  public Personne(String nomPersonne,int agePersonne, String adressePersonne){
    nom=nomPersonne;
    age=agePersonne;
    adresse=adressePersonne;
    afficher(this);
  }
  //constructeur de copie predn les attributs de l'objet dans le paramètre et les affecte à l'objet créé 
  public Personne(Personne personne){
    this.nom=personne.nom;
    this.age=personne.age;
    this.adresse=personne.adresse;
    afficher(personne);
  }
  private void afficher(Personne personne){
    System.out.println(personne.nom+" "+personne.age+" "+personne.adresse);
  }
  public void augmenterage(){
    this.age+=3;
    System.out.println(age);
  }
  public static void main (String[] args){
    Enfant enfant=new Enfant();
    Enfant enfant2=new Enfant("laila",23,"Casa","EHTP");
    enfant.augmenterage();
    
  }
}
