package Lesson3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] words = {"Nine", "Two", "Five", "One", "Twenty", "Five", "Two", "Eight", "Ten", "Three"};
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println(map);
        Set<String> set = new HashSet<>(Arrays.asList(words));
        System.out.println(set);

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Ivanov", "895247");
        phoneBook.add("Moiseev", "34896");
        phoneBook.add("Ivanov", "+5854");
        phoneBook.add("Fadin", "5472165");
        System.out.println(phoneBook.get("Ivanov"));
        System.out.println(phoneBook.get("Moiseev"));
    }


}
