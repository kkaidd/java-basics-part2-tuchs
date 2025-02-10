import java.util.LinkedList;

public class LinkedListJavaBasics {
    private final LinkedList<ClassForObject> objectList = new LinkedList<>();

    public void addObject(ClassForObject objectElement) {
        objectList.add(objectElement);
    }

    public void removeObject(int index) {
        if (index >= 0 && index < objectList.size()) {
            objectList.remove(index);
        }
    }

    public int findElement(ClassForObject objectElement) {
        for (int i = 0; i < objectList.size(); i++) {
            if (objectList.get(i).equals(objectElement)) {
                return i;
            }
        }
        return -1;
    }

    public void printElements() {
        for (int i = 0; i < objectList.size(); i++) {
            System.out.println("Index " + i + ": " + objectList.get(i));
        }
    }
}