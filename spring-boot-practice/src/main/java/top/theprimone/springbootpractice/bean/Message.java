package top.theprimone.springbootpractice.bean;

public class Message {

  private String message;

  private String documentationUrl;

  public Message(String message, String documentationUrl) {
    this.message = message;
    this.documentationUrl = documentationUrl;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public String getDocumentationUrl() {
    return documentationUrl;
  }

  public void setDocumentationUrl(String documentationUrl) {
    this.documentationUrl = documentationUrl;
  }
  
}
