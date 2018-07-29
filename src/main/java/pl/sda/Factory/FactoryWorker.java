package pl.sda.Factory;

public class FactoryWorker {
    private int ID;
    private String name;
    private String surname;

    public FactoryWorker(int ID, String name, String surname){
        this.ID = ID;
        this.name = name;
        this.surname = surname;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
