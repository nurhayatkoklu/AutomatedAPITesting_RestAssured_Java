package POJO;

public class Nationalities {
    String id;
    String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Nationalities{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
