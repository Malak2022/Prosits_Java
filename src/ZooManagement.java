public class ZooManagement {

    public static void main(String[] args) {
        Animal lion = new Animal();
        lion.name = "lion";
        lion.age = 6;
        lion.family = "chats";
        lion.isMammal = false;

        Zoo myZoo = new Zoo();
        myZoo.name = "Zoo";
        myZoo.city = "Tunis";
        myZoo.nbrCages = 25;
        myZoo.animals = new Animal[25];


        Animal dog = new Animal("chien", "zara", 5, true);

        System.out.println(myZoo);
        System.out.println(myZoo.toString());

        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(dog));

        myZoo.displayAnimals();

        System.out.println(myZoo.searchAnimal(dog));
        Animal dog1 = new Animal("chien", "rex", 3, true);
        System.out.println(myZoo.searchAnimal(dog));

        System.out.println(myZoo.removeAnimal(dog));
        myZoo.displayAnimals();

    }

}

