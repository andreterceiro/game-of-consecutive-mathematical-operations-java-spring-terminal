# General notes

## Hello word - starting a similar application

1- Please download the basic artifact in [Spring Initializr website](http://start.spring.io)

OBS: You will do not need:

- A special class or dependency to make a command line appliction. Your Spring boilerplate will already has the necessary classes;
- To add a .gitgnore file. The boilerplate will already provide a .gitigore file

2- Please create a class (I created the class Main.java in the same level of the main class - ConsecutiveMathematicalOperationsApplication.java in my case) with this code:

```java
package com.terceiro.consecutive_mathematical_operations;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Main implements CommandLineRunner {
    @Override
    public void run(String ...args) throws Exception
    {
        System.out.println("oi");
    }
}
```

OBS: The method run of the class that implements **CommandLineRunner** (above) will be called when you run the application (instructions in the next step).


## Running the application

Please type in the terminal:

```sh
mvn spring-boot:run
```