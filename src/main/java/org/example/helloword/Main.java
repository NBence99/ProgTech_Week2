package org.example.helloword;
import org.example.welcome.welcome_string;

public class Main {
    public static void main(String[] args) {

        welcome_string print_string = new welcome_string();
        String print_text = print_string.welcome(args);

        System.out.println(print_text);

    }
}
