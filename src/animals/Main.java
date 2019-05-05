package animals;

import java.util.ArrayList;

public class Main {

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

    System.out.println(animalsList);
  }
}