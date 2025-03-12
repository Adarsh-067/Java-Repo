package challenge81;

import java.util.Objects;

class person {
    String name;
    int age;

    person(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        person person = (person) obj;
        return person.name.equals(name) && person.age == age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
