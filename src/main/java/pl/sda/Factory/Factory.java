package pl.sda.Factory;

import java.util.LinkedList;
import java.util.List;

public class Factory {
    public static void main(String[] args) {
        List<FactoryWorker> workersList = new LinkedList<>();
        workersList.add(new FactoryWorker(1,"Jan", "Nowak"));
        workersList.add(new FactoryWorker(2,"Jan", "Kowalski"));
        workersList.add(new FactoryWorker(3,"Pawel", "Nowak"));
        workersList.add(new FactoryWorker(4,"Anna", "Nowak"));
        workersList.add(new FactoryWorker(5,"Dagmara", "Nowak"));
        workersList.add(new FactoryWorker(6,"Rafal", "Nowak"));
        workersList.add(new FactoryWorker(7,"Jan", "Nowak"));
        workersList.add(new FactoryWorker(8,"Rafal", "Nowak"));
        workersList.add(new FactoryWorker(9,"Karol", "Nowak"));
        workersList.add(new FactoryWorker(10,"Rafal", "Nowak"));
        workersList.add(new FactoryWorker(11,"Jan", "Nowak"));


    }

    public static void giftLottery (List<FactoryWorker>){


    }
}
