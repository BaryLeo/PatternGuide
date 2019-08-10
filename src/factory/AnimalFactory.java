package factory;

public class AnimalFactory {
    public Animal getAnimal(String type){
        switch (type){
            case "Cat":{
                return new Cat();
            }
            case "Dog":{
                return new Dog();
            }
            case "Mouse": {
                return new Mouse();
            }
        }
        return null;
    }
}
