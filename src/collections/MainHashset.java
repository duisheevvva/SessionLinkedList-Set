package collections;

import com.sun.security.jgss.GSSUtil;

import java.util.*;

public class MainHashset {
    public static void main(String[] args) {
//        TODO 1

        Set<String> name = new HashSet<>();
        name.add("Sultan");
        name.add("JOMART");
        name.add("NURDAN");
        name.add("Adilet");
        name.add("Adilet");
        Iterator<String> iterator = name.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // TODO 2
        System.out.println("name.size() = " + name.size());
//        TODO 3
        Set<String> name1 = new TreeSet<>(name);
        System.out.println("Treeset: " + name1);

        LinkedList<String> humans = new LinkedList<>();
        humans.add("Nurmuhamed");
        humans.add("Nurmuhammed");
        humans.add("Bektur");
        humans.add("Beknazar");
        humans.add("Sabina");


        HashSet<String> hashSet = new HashSet<>(humans);
        System.out.println("HashSet : " + hashSet);

//        TODO 4

        if (name == hashSet) {
            System.out.println(true);
        } else System.out.println(false);
// TODO: 19.03.2024 8
        HashSet<String> muuuu = new HashSet<>();
        muuuu.add("Eldiyar");
        muuuu.add("Beka");
        muuuu.add("Jigit");
        muuuu.add("Sultan");
        List<String> names = new ArrayList<>(muuuu);
        for (String s : names) {
            System.out.println(s);

        }

//        TODO 9
        name.clear();
        System.out.println(name);

        // TODO 10
        System.out.println(name.isEmpty());


    }

}
