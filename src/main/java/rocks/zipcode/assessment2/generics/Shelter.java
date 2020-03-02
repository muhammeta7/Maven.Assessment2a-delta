package rocks.zipcode.assessment2.generics;


import rocks.zipcode.assessment2.generics.ageable.Ageable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Shelter is a generic class that holds Objects that extends `Ageable`.
 * For example, if a Person and a Dog extends Ageable, then I can declare the following:
 * <p>
 * Shelter<Person> farmHouse = new Shelter<Person>();
 * Shelter<Dog> dogHouse = new Shelter<Dog>();
 */
public class Shelter<_> implements  Iterable{

    private List<Ageable> shelterList;

    public Shelter() {
        this.shelterList = new ArrayList<>();
    }

    /**
     * @return the number of item in the shelter
     */
    public int size() {
        return shelterList.size();
    }

    public void add(Object object) {
        if(object instanceof  Ageable) {
            shelterList.add((Ageable)object);
        }
    }

    public Boolean contains(Object object) {
        return shelterList.contains((Ageable)object);
    }

    public void remove(Object object) { shelterList.remove((Ageable)object);
    }

    public Object get(Integer index) {
        return shelterList.get(index);
    }

    public Integer getIndexOf(Object ageable) {
        return shelterList.indexOf(ageable);
    }

    @Override
    public Iterator iterator() {return null;};
}