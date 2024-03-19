package collections;

import com.sun.source.tree.Tree;

import java.util.Arrays;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class MainTreeSet {
    public static void main(String[] args) {

//        TODO 1
        Random random = new Random();

        TreeSet<Integer>numbers = new TreeSet<>();
        for (int i = 1; i <=20; i++) {

         numbers.add(random.nextInt(1,50));
        }
        System.out.println(numbers);



//        TODO 2
        Set<Integer> newNumbers = new TreeSet<>(numbers);
        System.out.println();
        System.out.println("New List: " + newNumbers);
        // TODO 3
        System.out.println("Size : " + numbers.size());

//        TODO 4
        TreeSet<Integer> tree = new TreeSet<>();
        for (Integer integer :newNumbers){
            if (integer<7){
                tree.add(integer);
            }

        }
        System.out.println(tree);

//        TODO 5
        Random random2 = new Random();

        TreeSet<Integer>numbers2 = new TreeSet<>();
        for (int i = 1; i <=20; i++) {

            numbers2.add(random2.nextInt(1,50));
        }
        System.out.println(numbers2.reversed());

    }
}
