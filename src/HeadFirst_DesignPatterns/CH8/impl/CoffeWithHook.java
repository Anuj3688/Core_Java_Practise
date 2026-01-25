package HeadFirst_DesignPatterns.CH8.impl;

import HeadFirst_DesignPatterns.CH8.BreweryTemplate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class CoffeWithHook extends BreweryTemplate {
    @Override
    public void addOintments() {
        System.out.println("Adding Milk!");
    }

    @Override
    public void brew() {
        System.out.println("Adding Cofee");
    }

    @Override
    public void hook(){
        String answer = null;
        System.out.println("Do you Need Sugar?");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        if (answer.toLowerCase().equals("yes")){
            System.out.println("Sugar is added!");
            return;
        }
        System.out.println("We have added Sugar? "+answer);
    }
}
