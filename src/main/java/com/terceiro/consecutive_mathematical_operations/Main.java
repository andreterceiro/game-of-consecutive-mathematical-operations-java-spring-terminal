package com.terceiro.consecutive_mathematical_operations;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.Vector;
import java.util.Random;
import java.util.Scanner;

@Component
public class Main implements CommandLineRunner {
    Vector<Integer> numbers = new Vector<>();
    Integer acertos = 0;

    @Override
    public void run(String ...args) throws Exception
    {
        Random gerador = new Random();


        this.numbers.add(gerador.nextInt(100));
        this.numbers.add(gerador.nextInt(100));


        while(true) {
            this.numbers.add(gerador.nextInt(100));
            Integer userSum = this.askForTheSum();
            Integer rightSum = this.numbers.stream().reduce(0,Integer::sum);

            if (! userSum.equals(rightSum)) {
                System.out.println("Você errou. O resultado correto é " + String.valueOf(rightSum));
                break;
            }
            acertos = acertos + 1;
        }

        System.out.println("Você acertou " + acertos + " somas");
    }

    private Integer askForTheSum() {
        Scanner scanner = new Scanner(System.in);
        String output = "";

        for (int number: numbers) {
            output += number + " + ";
        }

        StringBuilder sb = new StringBuilder(output);
        sb.replace(output.length() - 2, output.length() -1, "=");
        System.out.println(sb.toString());
        System.out.print("Digite a soma por favor: ");
        return Integer.parseInt(scanner.nextLine());
    }
}