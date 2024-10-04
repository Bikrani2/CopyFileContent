import java.util.Scanner;
public class TP1 {
  public static void main(String[] args){
    System.out.println("\t<<WELCOME TO YOUR CONVERTER>>>");
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    do {
      System.out.println("Choisissez 'O' si vous voulez convertir du degré C vers F et 'N' si l'inverse? ");
    }while (str=="O" || str=="N");
    if (str=="O"){
      System.out.println("entrer le degé en C :");
      int d=sc.nextInt();
      int c=(9/5)*d+32;
      System.out.println("La température en F est : "+c);
    }else{
      System.out.println("entrer le degé en F :");
      int d=sc.nextInt();
      int c=((d-32)*5)/9;
      System.out.println("La température en F est : "+c);
    }
  }

}
