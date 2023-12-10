public class ZooManagement {

    public static void main(String[] args) {
        Animal lion = new Animal();
        lion.name = "lion";
        lion.age = 5;
        lion.family = "chats";
        lion.isMammal = true;

        Zoo myZoo = new Zoo("Zoo", "Tunis");
        Zoo notMyZoo = new Zoo("ParkTun", "Ben Arous");


        Animal dog = new Animal("chien", "Rex", 3, true);


        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(dog));

        myZoo.displayAnimals();

        System.out.println(myZoo.searchAnimal(dog));
        Animal dog1 = new Animal("chien", "Zara", 2, true);
        System.out.println(myZoo.searchAnimal(dog1));

        //   System.out.println(myZoo.removeAnimal(dog));
        myZoo.displayAnimals();


        System.out.println(myZoo);

        myZoo.addAnimal(lion);
        myZoo.addAnimal(dog);
        myZoo.addAnimal(dog1);
        myZoo.displayAnimals();
        System.out.println("a" + myZoo.removeAnimal(lion));
        myZoo.displayAnimals();
        System.out.println("a" + myZoo.removeAnimal(dog1));
        myZoo.displayAnimals();
        System.out.println("a" + myZoo.removeAnimal(dog));
        myZoo.displayAnimals();

//        System.out.println(Zoo.comparerZoo(myZoo, notMyZoo));
//        System.out.println(myZoo.isZooFull());

    }

}


