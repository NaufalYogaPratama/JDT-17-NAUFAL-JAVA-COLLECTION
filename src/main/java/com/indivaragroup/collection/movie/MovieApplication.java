package com.indivaragroup.collection.movie;

import com.indivaragroup.collection.movie.service.MovieCollectionService;

import java.util.Scanner;

public class MovieApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MovieCollectionService service = new MovieCollectionService();

        System.out.println("Memulai Sistem Inventory Film...");
        service.startApplication(scanner);

        scanner.close();
    }
}
