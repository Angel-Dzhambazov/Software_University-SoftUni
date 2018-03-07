package hw01_JavaBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P15_UrlParser {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line = reader.readLine();
//      String line = "www.nakov.com";

        String protocol = "";
        String server = "";
        String resource = "";
        if (line.contains("://")) {
            String[] tokens = line.split("://");
            protocol = tokens[0];
            if (!tokens[1].contains("/")) {
                server = tokens[1];
            } else {
                server = tokens[1].substring(0, tokens[1].indexOf("/"));
                resource = tokens[1].substring(tokens[1].indexOf("/") + 1, tokens[1].length());
            }
        } else {
            if (!line.contains("/")) {
                server = line;
            } else {
                server = line.substring(0, line.indexOf("/"));
                resource = line.substring(line.indexOf("/") + 1, line.length());
            }
        }
        System.out.println(String.format("[protocol] = \"%s\"", protocol));
        System.out.println(String.format("[server] = \"%s\"", server));
        System.out.println(String.format("[resource] = \"%s\"", resource));


    }
}
