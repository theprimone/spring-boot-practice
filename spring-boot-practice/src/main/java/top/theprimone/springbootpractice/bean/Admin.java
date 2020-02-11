package top.theprimone.springbootpractice.bean;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "admin")
public class Admin {

  private String username;

  private String password;

  private String name;

  private Map<String, Object> otherProperties;

  private List<Number> phoneNumbers;

  @Override
  public String toString() {
    return "Admin [name=" + name + ", otherProperties=" + otherProperties + ", password=" + password + ", phoneNumbers="
        + phoneNumbers + ", username=" + username + "]";
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

  public Map<String, Object> getOtherProperties() {
    return otherProperties;
  }

  public void setOtherProperties(Map<String, Object> otherProperties) {
    this.otherProperties = otherProperties;
  }

  public List<Number> getPhoneNumbers() {
    return phoneNumbers;
  }

  public void setPhoneNumbers(List<Number> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  
}
