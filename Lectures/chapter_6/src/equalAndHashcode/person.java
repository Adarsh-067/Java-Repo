package equalAndHashcode;

import java.util.Objects;

public class person {
    private String name;
    private int Age;
    private int id;

    public person(String name, int age, int id) {
        this.name = name;
        Age = age;
        this.id = id;
    }

   /* @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof person)){
            return false;
        }
        person per = (person) obj;
        return per.name.equals(name) &&
                per.Age == Age &&
                per.id == id;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        person person = (person) o;
        return Age == person.Age && id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, Age, id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
