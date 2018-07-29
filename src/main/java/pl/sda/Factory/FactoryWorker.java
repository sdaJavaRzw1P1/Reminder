package pl.sda.Factory;

public class FactoryWorker {
    private String ID;
    private String name;
    private String surname;

    public FactoryWorker(String ID, String name, String surname) {
        this.ID = ID;
        this.name = name;
        this.surname = surname;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String toString(){
        return "ID: " + ID + " | Pracownik: " + name + " " + surname;
    }
}
