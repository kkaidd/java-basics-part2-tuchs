import java.util.Objects;

public class ClassForObject {
    private int objectId;
    private String objectName;
    private String objectDescription;

    public ClassForObject(int objectId, String objectName, String objectDescription) {
        this.objectId = objectId;
        this.objectName = objectName;
        this.objectDescription = objectDescription;
    }

    public int getObjectId() {
        return objectId;
    }

    public String getObjectName() {
        return objectName;
    }

    public String getObjectDescription() {
        return objectDescription;
    }

    @Override
    public String toString() {
        return "ClassForObject{" +
                "objectId=" + objectId +
                ", objectName='" + objectName + '\'' +
                ", objectDescription='" + objectDescription + '\'' +
                '}';
    }
}