import java.util.ArrayList;

public class ArrayListJavaBasics {
    private final ArrayList<ClassForObject> objectList = new ArrayList<>();

    public void addObject(ClassForObject objectElement) {
        objectList.add(objectElement);
    }

    public void removeObject(ClassForObject objectElement) {
        objectList.remove(objectElement);
    }

    public boolean containsElement(ClassForObject objectElement) {
        boolean isContained = objectList.contains(objectElement);
        System.out.println("Element " + objectElement + " is in the list: " + isContained);
        return isContained;
    }

    public void printElements() {
        int i = 0;
        do {
            System.out.println(objectList.get(i));
            i++;
        }
        while (i<objectList.size());
    }


}
