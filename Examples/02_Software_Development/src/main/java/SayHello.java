// SayHello.java
// Copyright © 2020 NextStep IT Training. All rights reserved.
//

import java.time.LocalTime;

public class SayHello {

    public static void main(String[] argv) {

        SayHello helloWorld = new SayHello();

        helloWorld.hello();
    }

    public void hello() {

        java.time.LocalTime now = LocalTime.now();
        String message;

        if (now.getHour() < 12) {

            message = "Good Morning!";

        } else {

            message = "Good Afternoon!";
        }

        System.out.println(message);
    }
}
