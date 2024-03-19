package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> students = new LinkedList<>();
        students.add("Sabina");
        students.add("Zaripbek");
        students.add("Aizat");
        students.add("Nurmuhamed ");
        students.add("Nurmuhammed");
        students.add("Nurkyz");
        students.add("Sultan");
        students.add("Bektur");
        // TODO 1.
        System.out.println("Get first element " + students.getFirst());
        // TODO 2.
        System.out.println("Get last name : " + students.getLast());
        // TODO: 3.
        System.out.println(students.contains("Bektur"));
        //TODO 4
        List<String> newStudents = new ArrayList<>(students);
        System.out.println("newStudents = " + newStudents);

        //TODO 5
        List<String> menters = new LinkedList<>();
        menters.add("Ulan");
        menters.add("Datka");
        menters.add("Aizat");

        if (menters == students) {
            System.out.println(true);
        } else System.out.println(false);

//        TODO 6
        System.out.println("is ampty or not: " + students.isEmpty());

//        TODO 7

        System.out.println(students.set(4,"Rusbaev")+students);









    }
}




