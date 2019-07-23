package Structural.Proxy.Exercise;

import java.lang.reflect.Proxy;

public class Demo {
    
    public static void main(String[] args) {
        Storage db = new Application();
        db.insertUser(new UserData("Oscar", "Patricio", 21, "Rojo Gomez"));
        db.insertUser(new UserData("Juan", "Patricio", 21, "Rojo Gomez"));
        db.insertUser(new UserData("Pedro", "Patricio", 21, "Rojo Gomez"));
        db.insertUser(new UserData("Pepe", "Guzman", 21, "Rojo Gomez"));
        db.insertUser(new UserData("Paolo", "Perez", 21, "Rojo Gomez"));
        
        System.out.println(db.getAllUsers());
        System.out.println(db.getAllUsers());
        System.out.println(db.getAllUsers());
        System.out.println(db.getAllUsers());
        System.out.println(db.getAllUsers());
        System.out.println(db.getAllUsers());
        System.out.println(db.getAllUsers());
        System.out.println(db.getAllUsers());
        System.out.println(db.getAllUsers());
        System.out.println(db.getAddresses());
        System.out.println(db.getUsernames());
        System.out.println(db.getUsersWithAge(21));
        System.out.println(db.getUsersWithNameLike("Oscar"));
        db.insertUser(new UserData("Saul", "Perez", 20, "Rojo Gomez"));
        System.out.println(db.getAllUsers());
        System.out.println(db.getAllUsers());
        System.out.println(db.getAllUsers());
        System.out.println();
        System.out.println("------ Información del proxy ------\n" + db);
    
        System.out.println();
        System.out.println("------ Proxy dinamico ------");
        Storage logged = QueryHandler.withQueryCounter(db, Storage.class);
        logged.getAllUsers();
        logged.insertUser(new UserData("Francisco", "Perez", 20, "Rojo Gomez"));
        logged.insertUser(new UserData("Pablo", "Perez", 20, "Rojo Gomez"));
        logged.insertUser(new UserData("Luis", "Perez", 20, "Rojo Gomez"));
        logged.insertUser(new UserData("Angel", "Perez", 20, "Rojo Gomez"));
        logged.getAllUsers();
        logged.getAllUsers();
    }
}
