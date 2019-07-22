package Structural.Proxy.Exercise;

public class Demo {
    public static void main(String[] args) {
        Storage storage = new Application();
        storage.insertUser(new UserData("Oscar", "Patricio", 21, "Rojo Gomez"));
        storage.insertUser(new UserData("Juan", "Patricio", 21, "Rojo Gomez"));
        storage.insertUser(new UserData("Pedro", "Patricio", 21, "Rojo Gomez"));
        storage.insertUser(new UserData("Pepe", "Guzman", 21, "Rojo Gomez"));
        storage.insertUser(new UserData("Paolo", "Perez", 21, "Rojo Gomez"));
        
        System.out.println(storage.getAddresses());
        System.out.println(storage.getUsernames());
        System.out.println(storage.getUsersWithAge(21));
        System.out.println(storage.getUsersWithNameLike("Oscar"));
        System.out.println();
        System.out.println("------ Información del proxy ------\n" + storage);
    }
}
