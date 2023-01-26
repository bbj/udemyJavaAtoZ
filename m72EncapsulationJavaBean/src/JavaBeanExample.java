import java.io.Serializable;

public class JavaBeanExample implements Serializable {

    /**
     * implements Serializable:
     * - is mandatory for JavaBeans
     * - if implemented, the object state will be serialized and deserialized when needed
     * - used when:
     *      - passed to streams
     *      - saving object state
     * - Serializable interface has no methods or fields and serves only to identify the semantics of being serializable.
     */

    private String name;
    private int id;

    public JavaBeanExample() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return this.name+"-"+this.id;
    }
}
