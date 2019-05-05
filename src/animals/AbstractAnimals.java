package animals;

public abstract class AbstractAnimals {
  private static int maxID = 0;
  private int id;
  private String name;
  private int yearNamed;

  public AbstractAnimals(String name, int yearNamed) {
    maxID++;
    id = maxID;

    this.name = name;
    this.yearNamed = yearNamed;
  }

  // methods
  public abstract String move();

  public abstract String breath();

  public abstract String reproduce();

  public String getName() {
    return name;
  }

  public String getYearNamed() {
    return yearNamed;
  }

  public String consume() {
    return "Nom Nom Nom";
  };
}