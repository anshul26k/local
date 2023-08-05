import java.util.HashMap;
import java.util.Map;

public class mapc {
       public static void main(String[] args) {
           Map<String,Integer> mp = new HashMap<>();
           mp.put("ak", 48);
           mp.put("sk", 44);
           mp.put("kk", 12);
        
          //print
          
        //   System.out.println(mp.get("sk"));
          System.out.println(mp.keySet());
          for(String temp : mp.keySet()){
            System.out.println(temp+":"+mp.get(temp));
          }
       }

}
