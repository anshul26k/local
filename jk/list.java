import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
// import java.util.ArrayList;
import java.util.Iterator;

// import javax.swing.text.html.HTMLDocument.Iterator;



public class list {
      public static void main(String[] args) {
            List<Integer> st = new ArrayList<>(); 
            st.add(31);
            st.add(32);
            st.add(85);

            Comparator<Integer> com = (Integer i,Integer j) -> {
                  if(i%10>j%10){
                        return 1;
                  }else{
                        return -1;
                  }
            };

            Collections.sort(st,com);

            // System.out.println(st);

            // for(Integer it : st){
            //       System.out.println(it);
            // }

            Iterator<Integer> it = st.iterator();

            while(it.hasNext()){
                  System.out.println(it.next());
            }




            // int arr[] = new int[10];
            // System.out.println(arr[0]);
      }

      
}
