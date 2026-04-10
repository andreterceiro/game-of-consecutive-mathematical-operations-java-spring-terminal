package com.terceiro.consecutive_mathematical_operations;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.Vector;
import java.util.Random;

@Component
public class Main implements CommandLineRunner {
    Vector<Integer> numbers = new Vector<>();

    @Override
    public void run(String ...args) throws Exception
    {
        Random gerador = new Random();
        numbers.add(gerador.nextInt(100));
        numbers.add(gerador.nextInt(100));
        numbers.add(gerador.nextInt(100));        
        String output = "";

        for (int number: numbers) {
            output += number + " + ";
        }
        StringBuilder sb = new StringBuilder(output);

        System.out.println(output.length());

        sb.replace(output.length() - 2, output.length() -1, "=");

        System.out.println(sb.toString());
    }
}