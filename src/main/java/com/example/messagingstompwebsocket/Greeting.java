package com.example.messagingstompwebsocket;

public class Greeting {
  private String content;

  Greeting() {

  }

  Greeting(String content) {
    this.content = content;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }
}
