package org.example.welcome;

public class welcome_string {

    public String welcome(String[] text){

        String welcome_string;

        if (text.length == 2){

            welcome_string = switch (text[1]) {
                case "hun" -> "Szia, " + text[0] + "!";
                case "eng" -> "Hello, " + text[0] + "!";
                case "haw" -> "Aloha, " + text[0] + "!";
                default -> "Ismeretlen nyelv";
            };
        }else
        {
            welcome_string = "Szia, " + text[0]+"!";
        }


        return  welcome_string;
    }

}
