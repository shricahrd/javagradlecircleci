package com.java_gradle_circleci;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

import org.commonmark.node.*;
import org.commonmark.parser.Parser;
import org.commonmark.renderer.html.HtmlRenderer;

public class Main {
    public static String readFile(String path) throws IOException {
        return new String(Files.readAllBytes(Paths.get(path)));
    }


    public static int getRandomNumber() {
        return 4;
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Hello");
        Parser parser = Parser.builder().build();
        Node document = parser.parse(readFile("README.md"));
        HtmlRenderer renderer = HtmlRenderer.builder().build();
        System.out.println(renderer.render(document));
    }
}
