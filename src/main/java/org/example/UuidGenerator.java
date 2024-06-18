package org.example;

import java.util.Random;
import java.util.UUID;

public class UuidGenerator {

    @Autowired

    public UUID generateUuid(){
        UUID uuid = UUID.randomUUID();
        Random random = new Random();

        System.out.println(sayHello.sayHello(random.nextInt()));
        return uuid;
    }
}
