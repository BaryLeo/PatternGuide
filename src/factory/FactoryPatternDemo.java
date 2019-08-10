package factory;

public class FactoryPatternDemo {
    public void runDemo(){
        System.out.println("工厂模式");
        AnimalFactory animalFactory = new AnimalFactory();
        Animal a = animalFactory.getAnimal("Dog");
        a.sound();
        Animal b = animalFactory.getAnimal("Cat");
        b.sound();
        Animal c = animalFactory.getAnimal("Mouse");
        c.sound();
    }
}
