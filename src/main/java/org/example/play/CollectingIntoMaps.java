package org.example.play;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CollectingIntoMaps {

    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("Lester",57,'m'),
                new Person("Gillian",60,'f'),
                new Person("Jess",26,'f'),
                new Person("Luke",26,'m'),
                new Person("Claire",55,'f')
        );


        Comparator<Person> oldestPerson = Comparator.comparing(Person::getAge);

        Optional<Person> eldest = people.stream()
                .filter(x->x.getGender() =='m')
                .max(oldestPerson);

//        Map<Boolean,Integer> guys = people.stream()
//                .collect(Collectors.groupingBy(x -> x.getGender() == 'm', Collectors.summingInt(Person::getAge)));

//        Map<Boolean, Long> collect = people.stream()
//                .collect(Collectors.partitioningBy((x -> x.getGender() == 'm'), Collectors.counting()));

        System.out.println("wait here");

//        Map<Character, List<Person>> collect = people
//                .stream()
//                .collect(Collectors.groupingBy(Person::getGender, Collectors.toList()));
//
//        collect.entrySet().forEach(x->System.out.println("key "+x.getKey()+" "+ "value "+x.getValue()));

//        Function<Person,Character> keyMapper = new Function<Person, Character>() {
//            @Override
//            public Character apply(Person person) {
//                return person.getGender();
//            }
//        };
//
//        Function<Person,Integer> valueMapper = new Function<Person, Integer>() {
//            @Override
//            public Integer apply(Person person) {
//                return person.getAge();
//            }
//        };
//
//        BiFunction<Integer,Integer,Integer> mergerMapper = new BiFunction<Integer, Integer, Integer>() {
//            @Override
//            public Integer apply(Integer existingValue, Integer newValue) {
//                return (existingValue.compareTo(newValue) > 0 ? existingValue : newValue);
//            }
//        };
//
////        Map<String, Integer> result = people.stream()
////                .collect(Collectors.toMap(keyMapper, valueMapper));
//
////        Map<String, Person> result = people.stream()
////                .collect(Collectors.toMap(keyMapper, Function.identity()));
//
//        Map<Character, Integer> result = people.stream()
//                .collect(Collectors.toMap(keyMapper, valueMapper, mergerMapper::apply));
//
//
//        result.entrySet().forEach(x->System.out.println(x.getKey()+" "+x.getValue()));
////        result.entrySet().stream().forEach(x->System.out.println(x.getKey()+" "+x.getValue()));

    }

}

class Person {

    String name;
    int age;
    char gender;
    public Person() {
    }

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}