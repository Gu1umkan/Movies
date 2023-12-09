package models;

public class Actor {
  private  long id;
  private String name;
  private String role;

  public Actor(long id, String name, String role) {
    this.id = id;
    this.name = name;
    this.role = role;
  }

  public Actor() {
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  @Override
  public String toString() {
    return STR."Actor: " +
            "id: " + id +
            "   name: " + name +
            "   role:" + role
            ;
  }
}
