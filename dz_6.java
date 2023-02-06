import java.util.HashMap;
import java.util.Iterator;
public class dz_6 {

    private static HashMap<Integer, Object> hMap = new HashMap<>();
    private static final Object OBJECT = new Object();
    public static void main(String[] args) {
        add(8);
        add(3);
        add(6);
        add(2); 
        System.out.println(isEmpty());
        printTerminal();
        System.out.println();
        try {
            System.out.println(printOneElement(12));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void printTerminal(){
        Iterator<Integer> iterator = hMap.keySet().iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
    }

    private static int printOneElement(int index){
        return (Integer)hMap.keySet().toArray()[index];
    }

    public static void add(Integer number){
        hMap.put(number, OBJECT);   
    }

    private static boolean isEmpty(){
        return hMap.isEmpty();
    }
}