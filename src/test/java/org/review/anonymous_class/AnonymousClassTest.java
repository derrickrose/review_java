package org.review.anonymous_class;

import org.junit.Test;

public class AnonymousClassTest {

  @Test
  public void helloWorld_Test() {
    // We're instantiating right here anonymous classes
    ISpeak english =
        new ISpeak() {
          @Override
          public void helloWorld() {
            System.out.println("Hello World, I do speak english!!");
          }
        };

    ISpeak spanish =
        new ISpeak() {
          @Override
          public void helloWorld() {
            System.out.println("Hola Mundo, hablo espagnol!!!");
          }
        };

    english.helloWorld();
    spanish.helloWorld();
  }
}
