package ru.geekbrains.seminar_1.homework;

import com.google.gson.Gson;

public class Program {
    public static void main(String[] args) {
        Person person = new Person("John", "Doe", 30);
        Gson gson = new Gson();
        String json = gson.toJson(person);
        System.out.println(json);
        String jsonInput = "{\"firstName\":\"Jane\",\"lastName\":\"Smith\",\"age\":25}";
        Person deserializedPerson = gson.fromJson(jsonInput, Person.class);
        System.out.println(deserializedPerson.getFirstName());
        System.out.println(deserializedPerson.getLastName());
        System.out.println(deserializedPerson.getAge());
        System.out.println(deserializedPerson.hashCode());
        System.out.println(deserializedPerson.equals(person));
        System.out.println(deserializedPerson.equals(deserializedPerson));
        System.out.println(deserializedPerson.toString());
    }
}


