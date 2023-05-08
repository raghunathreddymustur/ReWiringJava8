package OptionalClass;



import java.util.Optional;

class Property
{
    String ownerName;
    Optional<Bike> bike;

    public Property(String ownerName, Optional<Bike> bike) {
        this.ownerName = ownerName;
        this.bike = bike;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Optional<Bike> getBike() {
        return bike;
    }

    public void setBike(Optional<Bike> bike) {
        this.bike = bike;
    }
}
class Bike {
    String name;

    public Bike(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class Person
{
    Property property;
}

public class flatMapExample {
    public static void main(String[] args) {
        Person p=new Person();
        p.property=new Property("Raghu",Optional.of(new Bike("BMW")));
        Optional.ofNullable(p).flatMap(person -> person.property.bike).ifPresent(bike -> System.out.println(bike.getName()));
    }
}
