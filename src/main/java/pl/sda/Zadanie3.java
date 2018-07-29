package pl.sda;

import java.util.ArrayList;
import java.util.List;

public class Zadanie3 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("Butonierka");
        words.add("Ala ma kota");
        words.add("lalka   ");
        words.add("  tancerka");
        System.out.println(trimAndUpperCase(words));
    }

    public static String trimAndUpperCase (List<String> list){
//        String merged = "";
//        for (int i = 0; i < list.size(); i++){
//            merged += list.get(i).trim().toUpperCase() +" ";
//        }
        String merged = list.stream()
                .map(p ->p.toUpperCase().trim())
                .reduce(((s, s2) -> s + " " +s2))
                .orElse("");
        return merged;
    }
}
