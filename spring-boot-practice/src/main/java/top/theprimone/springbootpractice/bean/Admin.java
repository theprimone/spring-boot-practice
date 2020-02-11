package top.theprimone.springbootpractice.bean;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@PropertySource(value = { "classpath:admin.properties" })
@Component
@ConfigurationProperties(prefix = "admin")
public class Admin extends Person {

  private Map<String, Object> otherProperties;

  private List<Number> phoneNumbers;

  @Override
  public String toString() {
    return "Admin [otherProperties=" + otherProperties + ", phoneNumbers=" + phoneNumbers + "]";
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

}
