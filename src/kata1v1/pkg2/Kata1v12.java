package kata1v1.pkg2;

import java.util.Date;

public class Kata1v12 {

    public static void main(String[] args) {
        Person person = new Person ("Cristina","Benlliure Jiménez", new Date(96,6,21));
        System.out.println(person.getName() + person.getSurname() + " tiene " + person.getAge());
    }
}
