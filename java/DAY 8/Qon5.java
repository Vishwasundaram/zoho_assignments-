/*5. Write a program to illustrate the usage of clone() and find out what kind of copy it will make. */
class Address {
    String city;

    Address(String city) {
        this.city = city;
    }
}

class Person implements Cloneable {
    String name;
    Address address;

    Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    protected Object clone() throws CloneNotSupportedException {   //shallow copy
        return super.clone();                                       
    }

    public String toString() {
        return "Name: " + name + ", City: " + address.city;
    }
}

public class Qon5 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address addr1 = new Address("Chennai");
        Person p1 = new Person("Vishwa", addr1);


        Person p2 = (Person) p1.clone();

      
        p1.address.city = "Coimbatore";

        System.out.println("Original: " + p1);
        System.out.println("Cloned  : " + p2);
    }
}
/*OUTPUT:
Original: Name: Vishwa, City: Coimbatore
Cloned  : Name: Vishwa, City: Coimbatore
*/
