// HelloWorld.java
// Copyright © 2020 NextStep IT Training. All rights reserved.
//

public class HelloWorld {

    public static void main(String[] argv) {

        HelloWorld helloWorld = new HelloWorld();

        helloWorld.printHelloWorld();
        helloWorld.printHelloWorld("Welcome to the new World!");
    }

    public void printHelloWorld() {

        System.out.println("Hello, World!");
    }

    public void printHelloWorld(String message) {

        System.out.println(message);
    }
}
