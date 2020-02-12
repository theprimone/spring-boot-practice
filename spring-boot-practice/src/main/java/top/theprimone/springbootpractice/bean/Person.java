package top.theprimone.springbootpractice.bean;

public class Person {

  private long id;

  private String username;

  private String password;

  private String name;

  @Override
  public String toString() {
    return "Person [id=" + id + ", name=" + name + ", password=" + password + ", username=" + username + "]";
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }
  
}
