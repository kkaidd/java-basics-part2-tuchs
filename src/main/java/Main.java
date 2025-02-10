public class Main {
    public static void main(String[] args) {
        // Создаем тестовые объекты ClassForObject
        ClassForObject obj1 = new ClassForObject(1, "Объект 1", "Описание для первого объекта");
        ClassForObject obj2 = new ClassForObject(2, "Объект 2", "Описание для второго объекта");
        ClassForObject obj3 = new ClassForObject(3, "Объект 3", "Описание для третьего объекта");


        ArrayListJavaBasics arrayList = new ArrayListJavaBasics();

        arrayList.addObject(obj1);
        arrayList.addObject(obj2);
        arrayList.addObject(obj3);

        System.out.println("\n[ArrayList] Все элементы:");
        arrayList.printElements();

        arrayList.removeObject(obj2);
        System.out.println("\n[ArrayList] После удаления obj2:");
        arrayList.printElements();


        LinkedListJavaBasics linkedList = new LinkedListJavaBasics();

        linkedList.addObject(obj1);
        linkedList.addObject(obj2);
        linkedList.addObject(obj3);

        System.out.println("\n[LinkedList] Все элементы:");
        linkedList.printElements();

        int index = linkedList.findElement(obj3);
        System.out.println("\n[LinkedList] Индекс obj3: " + index);

        linkedList.removeObject(1); // Удаляем элемент с индексом 1 (obj2)
        System.out.println("\n[LinkedList] После удаления индекса 1:");
        linkedList.printElements();


        HashSetJavaBasics hashSet = new HashSetJavaBasics();

        hashSet.addObject(obj1);
        hashSet.addObject(obj2);
        hashSet.addObject(obj3);

        System.out.println("\n[HashSet] Все элементы:");
        hashSet.printElements();

        hashSet.removeObject(obj3);
        System.out.println("\n[HashSet] После удаления obj3:");
        hashSet.printElements();


        HashMapJavaBasics hashMap = new HashMapJavaBasics();

        hashMap.addObject(10, obj1);
        hashMap.addObject(20, obj2);
        hashMap.addObject(30, obj3);

        System.out.println("\n[HashMap] Все элементы:");
        hashMap.printElements();

        hashMap.removeObject(20);
        System.out.println("\n[HashMap] После удаления ключа 20:");
        hashMap.printElements();
    }
}