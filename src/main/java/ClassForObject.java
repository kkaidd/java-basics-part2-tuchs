public class ClassForObject {
    private int objectId;
    private String objectName;
    private String objectDescription;

    public ClassForObject(int objectId, String objectName, String objectDescription) {
        this.objectId = objectId;
        this.objectName = objectName;
        this.objectDescription = objectDescription;
    }

    @Override
    public String toString() {
        return "ClassForObject{"
                + "objectId =" + objectId
                + ", objectName ='" + objectName + '\''
                + ", objectDescription ='" + objectDescription + '\''
                + '}';
    }


    public int getObjectId() {
        return this.objectId;
    }

    public String getObjectName() {
        return this.objectName;
    }

    public String getObjectDescription() {
        return this.objectDescription;
    }

    public static void main(String[] args) {
        ClassForObject object1 = new ClassForObject(1, "Object1", "Description1");
        ClassForObject object2 = new ClassForObject(2, "Object2", "Description2");
        System.out.println(object1);
        System.out.println(object2);
    }
}
