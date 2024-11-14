import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class Test {
  public static void main(String[] args) {
      Hashtable map=new Hashtable();
      map.put("Bikrani Fatima",21);
      map.put("Bikrani Mohamed",23);
      Iterator<Map.Entry<String,Integer>> iterator=map.entrySet().iterator();
      while(iterator.hasNext()){
        Map.Entry<String,Integer> entry=iterator.next();
        System.out.println("("+entry.getKey()+","+entry.getValue()+")");
      }


  }
}
