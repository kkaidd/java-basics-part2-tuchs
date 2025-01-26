import java.util.HashMap;
import java.util.Map;

public class HashMapJavaBasics {
    private final Map<Integer, ClassForObject> objectMap = new HashMap<>();

    public void addObject(Integer key, ClassForObject objectElement) {
        objectMap.put(key, objectElement);
    }

    public void removeObject(Integer key, ClassForObject objectElement){
        objectMap.remove(key);
    }
    public boolean containsObject(Integer key){
        return objectMap.containsKey(key);
    }
    public void printElements() {
        objectMap.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));
    }

}