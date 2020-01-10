package com.github.curriculeon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People implements Iterable<Person> {
    private List<Person> personList;

    public People(List<Person> personList) {
        this.personList = personList;
    }

    public People() {
        this.personList = new ArrayList<>();
    }

    public void add(Person person) {
        this.personList.add(person);
    }

    public Person findById(long id){
        for (int i = 0; i <this.personList.size(); i++) {
            Person person = this.personList.get(i);
            if (person.getId() == (id)) {
                return person;
            }
        }
        return null;
    }

    public boolean contains(Person person) {
        return this.personList.contains(person);
    }

    public void remove(Person person){
        this.personList.remove(person);
    }

    public void removeAll(){
        this.personList.removeAll(personList);

    }

    public void count(){
        this.personList.size();
    }
    Person[] toarray(){
        return this.personList.toArray(new Person[]{});
    }

    @Override
    public Iterator<Person> iterator() {
        return personList.iterator();
    }

}