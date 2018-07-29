package pl.sda;

import java.util.*;
import java.util.stream.Collectors;

public class Zadanie4 {
    Random random=new Random();
    List<String> listPracow=new ArrayList<>(Arrays.asList("Adam Taki", "Bartek Jakistam", "Anna Inna", "Pawel Obcy", "Adam Inny", "Bartek Tezinny"));

    public void zad1(){
        System.out.println(listPracow.get(random.nextInt(listPracow.size())));
    }
    public void zad2(){
        System.out.println(new HashSet<>(listPracow.stream().map(pracow->pracow.split(" ")[0]).collect(Collectors.toList())));
        //Set<String> set=new HashSet<>(listPracow.stream().map(pracow->pracow.split(" ")[0]).collect(Collectors.toList()));
    }

}
