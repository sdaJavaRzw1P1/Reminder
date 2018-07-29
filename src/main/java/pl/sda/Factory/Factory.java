package pl.sda.Factory;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.BiFunction;

public class Factory {
    public static void main(String[] args) {
        List<FactoryWorker> workersList = new LinkedList<>();
        workersList.add(new FactoryWorker("1","Jan", "Nowak"));
        workersList.add(new FactoryWorker("2","Jan", "Kowalski"));
        workersList.add(new FactoryWorker("3","Pawel", "Nowak"));
        workersList.add(new FactoryWorker("4","Anna", "Nowak"));
        workersList.add(new FactoryWorker("5","Dagmara", "Nowak"));
        workersList.add(new FactoryWorker("6","Rafal", "Nowak"));
        workersList.add(new FactoryWorker("7","Jan", "Nowak"));
        workersList.add(new FactoryWorker("8","Rafal", "Nowak"));
        workersList.add(new FactoryWorker("9","Karol", "Nowak"));
        workersList.add(new FactoryWorker("10","Rafal", "Nowak"));
        workersList.add(new FactoryWorker("11","Jan", "Nowak"));
        workersList.add(new FactoryWorker("12","Anna", "Nowak"));

        System.out.println(giftLottery(workersList));
        System.out.println(uniqueWorkersNames(workersList));
        Map test = mostPopularNames(workersList);
        System.out.println(test.entrySet());

        Queue<FactoryWorker> ticketQeueue = new LinkedList<>();
        ticketQeueue.add(workersList.get(2));
        ticketQeueue.add(workersList.get(4));
        ticketQeueue.add(workersList.get(7));
        ticketQeueue.add(workersList.get(9));
        System.out.println(ticketQeueue);
    }

    public static String giftLottery(List<FactoryWorker> list){
        int randomNumber = ThreadLocalRandom.current().nextInt(0, list.size());
        return list.get(randomNumber).toString();
    }

    public static Set uniqueWorkersNames(List<FactoryWorker> list){
        Set<String> uniqueNames = new HashSet<>();
        for (FactoryWorker worker : list){
            uniqueNames.add(worker.getName());
        }
        return uniqueNames;
    }

    public static Map<String, Integer> mostPopularNames(List<FactoryWorker> list){
        Map<String, Integer> map = new HashMap<>();
        for (FactoryWorker worker : list){
            map.computeIfAbsent(worker.getName(), key -> map.put(key, 0));
            map.computeIfPresent(worker.getName(), (key, value) -> value + 1);
        }
        return map;
    }
}
