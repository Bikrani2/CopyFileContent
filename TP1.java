import java.util.Scanner;
public class TP1 {
 
  public static void main(String[] args){
    System.out.println("\t<<WELCOME TO YOUR CONVERTER>>>");
    try(Scanner scanner=new Scanner(System.in);){
      String reconv;
      String str;
    do{
    do {
      System.out.println("\n\nChoisissez 'O' si vous voulez convertir du degré C vers F et 'N' si l'inverse? ");
      str= scanner.nextLine();
    }while (!str.equalsIgnoreCase("O") && !str.equalsIgnoreCase("N"));
    int tr=str.equalsIgnoreCase("O")?1:0;
    switch (tr){
      case 1:
        System.out.println("\nentrer le degé en C :");
        int d=scanner.nextInt();
        int c=(9/5)*d+32;
        System.out.println("\n\nLa température en F est : "+c);
        break;
      case 0:
        System.out.println("\nentrer le degé en F :");
        d=scanner.nextInt();
        c=((d-32)*5)/9;
        System.out.println("\n\nLa température en F est : "+c);
        break;
      default :
        break;
      } 
      scanner.nextLine();
      System.out.println("est ce que tu veux reconvertir O|N?");
      reconv=scanner.nextLine();
    }while(reconv.equalsIgnoreCase("O"));
    System.out.println("on se revoie une autre fois");
    }
  }
}
