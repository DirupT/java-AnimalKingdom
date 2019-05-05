package animals;

public class Fish extends AbstractAnimals {

  public Fish(String name, String yearNamed) {
    super(name, yearNamed);
  }

  @Override
  public String move() {
    return "Swim";
  }

  @Override
  public String breath() {
    return "Gills";
  }

  @Override
  public String reproduce() {
    return "Eggs";
  }
}