package top.theprimone.springbootpractice.bean;

public class Person {

  public String username;

  public String password;

  public String name;

  @Override
  public String toString() {
    return "Person [name=" + name + ", password=" + password + ", username=" + username + "]";
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
  
}
