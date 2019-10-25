import javax.xml.crypto.dsig.spec.HMACParameterSpec;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {
    public static void main(String[] args)
    { // 1 Implemet the map Interface
        Map<Integer,String> hmap=new TreeMap<Integer,String>();
        mapUtil(hmap);
    }

    private static void mapUtil(Map<Integer, String> map) {
        // 2 Add key-value pairs
        map.put(100,"Edwin");
        map.put(101,"Clife");
        map.put(102,"Terrence");
        map.put(103,"Zitha");
        map.put(104,"Shaun");
        map.put(105,"Ebenezer");
        // access the elements
        System.out.println("see all keys:" + map.keySet());
        System.out.println("See all key-value pairs:" + map);

        // 3 Iterate through a map of key-value pairs
        for(int key: map.keySet())
        {
            System.out.println("[Key:"+ key +" ," + "Value:" + map.get(key) + "]");
        }
    }
}
