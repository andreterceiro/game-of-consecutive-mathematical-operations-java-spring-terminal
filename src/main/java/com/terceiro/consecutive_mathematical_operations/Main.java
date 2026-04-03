package com.terceiro.consecutive_mathematical_operations;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.Vector;

@Component
public class Main implements CommandLineRunner {
    Vector<Integer> numbers = new Vector<>();

    @Override
    public void run(String ...args) throws Exception
    {
        this.numbers.add(1);
        this.numbers.add(2);
        System.out.println(this.numbers);
    }
}