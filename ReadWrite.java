import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class ReadWrite{
  double time;
  public ReadWrite(String filePath){
    long startTime = System.currentTimeMillis();
    try{
      FileInputStream file=new FileInputStream(filePath);
      FileOutputStream fos=new FileOutputStream("test.txt");
      byte[] buf=new byte[8];
      int bufRead;
      while((bufRead=file.read(buf))>=0){
        fos.write(buf,0,bufRead);//0 représente le début et bufRead le nombre d'octet qu'on va lire qui vont etre stocké dans un tableau de 8 octet
      }
      this.time=System.currentTimeMillis() - startTime;
      file.close();
      fos.close();
    }catch( IOException f){
      f.printStackTrace();
    }
  }

  public void calculateTimeOfCopying(){
    System.out.println(this.time+"ms");
  }
}