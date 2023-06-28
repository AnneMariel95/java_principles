package data_structures;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class CollectionsDemo {

    public static void main(String[] args) {
//        setDemo();
//        listDemo();
        queueDemo();
    }
    public static void setDemo() {
        Set fruits = new HashSet();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("lemon");

        System.out.println(fruits);

        fruits.remove("lemon");
        System.out.println("contains lemon? " + fruits.contains("lemon"));

        System.out.println("size: " + fruits.size());

        Set moreFruit = Set.of("pear", "grapes", "cherry");
//        moreFruit.add("cranberry"); Cannot do this because Set.of makes immutable collection
        System.out.println(moreFruit);
    }

    public static void listDemo() {
        List fruits = new ArrayList();
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("orange");

        fruits.set(2, "grape");
        fruits.add("lemon");
//        fruits.remove("lemon"); //removes first found
//        fruits.remove(3);

        System.out.println("index 2: " + fruits.get(2));
        System.out.println("index of grape: " + fruits.indexOf("grape"));
        System.out.println("last index of lemon: " + fruits.lastIndexOf("lemon"));

        System.out.println(fruits);


    }

    public static void queueDemo(){
        Queue fruits = new LinkedList();
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("lemon");

       var removed = fruits.remove();
        System.out.println("removed: " + removed);
        System.out.println("head of queue: " + fruits.peek());

        System.out.println(fruits);
    }
}
