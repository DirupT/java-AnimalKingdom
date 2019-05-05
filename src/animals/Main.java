package animals;

import java.util.ArrayList;

public class Main {

  public static void printAnimals(ArrayList<AbstractAnimals> animals, CheckAnimal tester) {
    for (AbstractAnimals a : animals) {
      if (tester.test(a)) {
        System.out.println("Name: " + a.getName() + ", Year Named: " + a.getYearNamed());
      }
    }
  }

  public static void printAnimals(ArrayList<AbstractAnimals> animals) {
    for (AbstractAnimals a : animals) {
      System.out.println("Name: " + a.getName() + ", Year Named: " + a.getYearNamed());
    }
  }

  public static void main(String[] args) {
    // Mammals
    Mammals panda = new Mammals("Panda", 1869);
    Mammals zebra = new Mammals("Zebra", 1778);
    Mammals koala = new Mammals("Koala", 1816);
    Mammals sloth = new Mammals("Sloth", 1804);
    Mammals armadillo = new Mammals("Armadillo", 1758);
    Mammals raccoon = new Mammals("Raccoon", 1758);
    Mammals bigfoot = new Mammals("Bigfoot", 2021);

    // Birds
    Birds pigeon = new Birds("Pigeon", 1837);
    Birds peacock = new Birds("Peacock", 1821);
    Birds toucan = new Birds("Toucan", 1758);
    Birds parrot = new Birds("Parrot", 1824);
    Birds swan = new Birds("Swan", 1758);

    // Fish
    Fish salmon = new Fish("Salmon", 1758);
    Fish catfish = new Fish("Catfish", 1817);
    Fish perch = new Fish("Perch", 1758);

    ArrayList<AbstractAnimals> animalsList = new ArrayList<AbstractAnimals>();

    // Mammals
    animalsList.add(panda);
    animalsList.add(zebra);
    animalsList.add(koala);
    animalsList.add(sloth);
    animalsList.add(armadillo);
    animalsList.add(raccoon);
    animalsList.add(bigfoot);

    // Birds
    animalsList.add(pigeon);
    animalsList.add(peacock);
    animalsList.add(toucan);
    animalsList.add(parrot);
    animalsList.add(swan);

    // Fish
    animalsList.add(salmon);
    animalsList.add(catfish);
    animalsList.add(perch);

    System.out.println("\nAnimals in descending order by year named:\n");
    animalsList.sort((a1, a2) -> a2.getYearNamed() - a1.getYearNamed());
    printAnimals(animalsList);

    System.out.println("\nAnimals in alphabetical order:\n");
    animalsList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
    printAnimals(animalsList);

    System.out.println("\nAnimals by how they move:\n");
    animalsList.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
    printAnimals(animalsList);

    System.out.println("\nAnimals that breath with lungs:\n");
    printAnimals(animalsList, a -> a.breath() == "Lungs");

    System.out.println("\nAnimals that breath with lungs and named in 1758:\n");
    printAnimals(animalsList, a -> a.breath() == "Lungs" && a.getYearNamed() == 1758);

    System.out.println("\nAnimals that breath with lungs and lay eggs:\n");
    printAnimals(animalsList, a -> a.breath() == "Lungs" && a.reproduce() == "Eggs");

    System.out.println("\nAnimals that were named in 1758 in alphabetical order:\n");
    animalsList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
    printAnimals(animalsList, a -> a.getYearNamed() == 1758);
  }
}