import java.util.HashSet;
import java.util.Iterator;

public class HashSetJavaBasics {
    private final HashSet<ClassForObject> objectSet = new HashSet<>();

    public void addObject(ClassForObject objectElement) {
        objectSet.add(objectElement);
    }

    public void removeObject(ClassForObject objectElement) {
        objectSet.remove(objectElement);
    }

    public boolean containsElement(ClassForObject objectElement) {
        return objectSet.contains(objectElement);
    }

    public void printElements() {
        Iterator<ClassForObject> iterator = objectSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}