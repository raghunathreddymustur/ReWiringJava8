package MethodReferences;

@FunctionalInterface
interface ReactTelevision
{
    void display();
}
// referencing the instance method of a particular object
public class TypeOne {
    public static void main(String[] args) {
        TypeOne typeOne=new TypeOne();

        // Creating implementation vai method reference
        ReactTelevision reactTelevision=typeOne::allKindsOfDisplay;

        reactTelevision.display();
    }

    void allKindsOfDisplay()
    {
        System.out.println("displayed");
    }
}
