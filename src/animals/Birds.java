package animals;

public class Birds extends AbstractAnimals {

  public Birds(String name, int yearNamed) {
    super(name, yearNamed);
  }

  @Override
  public String move() {
    return "Fly";
  }

  @Override
  public String breath() {
    return "Lungs";
  }

  @Override
  public String reproduce() {
    return "Eggs";
  }
}