package animals;

public class Mammals extends AbstractAnimals {

  public Mammals(String name, String yearNamed) {
    super(name, yearNamed);
  }

  @Override
  public String move() {
    return "Walk";
  }

  @Override
  public String breath() {
    return "Lungs";
  }

  @Override
  public String reproduce() {
    return "Live births";
  }
}