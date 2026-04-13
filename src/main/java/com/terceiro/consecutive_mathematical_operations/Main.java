package com.terceiro.consecutive_mathematical_operations;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.Vector;
import java.util.Random;
import java.util.Scanner;

@Component
public class Main implements CommandLineRunner {
    Vector<Integer> numbers = new Vector<>();

    @Override
    public void run(String ...args) throws Exception
    {
        Random gerador = new Random();
        Scanner scanner = new Scanner(System.in);

        numbers.add(gerador.nextInt(100));
        numbers.add(gerador.nextInt(100));
        numbers.add(gerador.nextInt(100));        
        String output = "";

        for (int number: numbers) {
            output += number + " + ";
        }
        StringBuilder sb = new StringBuilder(output);
        sb.replace(output.length() - 2, output.length() -1, "=");
        //System.out.println(numbers.stream().reduce(0,Integer::sum));
        System.out.println(sb.toString());
        System.out.print("Digite a soma por favor: ");
        Integer userSum = Integer.parseInt(scanner.nextLine());
        System.out.println(userSum);
    }
}