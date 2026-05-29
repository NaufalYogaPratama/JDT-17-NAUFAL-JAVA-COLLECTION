package com.indivaragroup.collection.movie.service;

import com.indivaragroup.collection.movie.dto.MovieDTO;

import java.time.LocalDate;
import java.util.*;

public class MovieCollectionService {

    private Map<String, Map<String, Map<String, Map<String, List<MovieDTO>>>>> categoryTree;
    private List<MovieDTO> allMovies;

    public MovieCollectionService() {
        this.categoryTree = new LinkedHashMap<>();
        this.allMovies = new ArrayList<>();
        initializeData();
    }

    private void addMovieToTree(String level1, String level2, String level3, String level4, MovieDTO movie) {
        categoryTree
                .computeIfAbsent(level1, k -> new LinkedHashMap<>())
                .computeIfAbsent(level2, k -> new LinkedHashMap<>())
                .computeIfAbsent(level3, k -> new LinkedHashMap<>())
                .computeIfAbsent(level4, k -> new ArrayList<>())
                .add(movie);

        allMovies.add(movie);
    }

    private void initializeData() {
        addMovieToTree("TEEN YO", "SCHOOL GIRL", "UNIFORM", "SUMMER EDITION",
                new MovieDTO("Nagi Hikaru", "ABX-001", LocalDate.of(2026, 1, 15), "TEEN YO", "SUMMER EDITION"));
        addMovieToTree("TEEN YO", "SCHOOL GIRL", "UNIFORM", "SUMMER EDITION",
                new MovieDTO("Remu Suzumori", "ABX-002", LocalDate.of(2026, 2, 20), "TEEN YO", "SUMMER EDITION"));

        addMovieToTree("TEEN YO", "SCHOOL GIRL", "CASUAL", "WEEKEND EDITION",
                new MovieDTO("Yua Mikami", "ABX-003", LocalDate.of(2026, 3, 10), "TEEN YO", "WEEKEND EDITION"));

        addMovieToTree("TEEN YO", "COLLEGE", "FRESHMAN", "DEBUT 2026",
                new MovieDTO("Eimi Fukada", "ABX-004", LocalDate.of(2026, 4, 5), "TEEN YO", "DEBUT 2026"));

        addMovieToTree("BEAUTIFUL GIRL", "OFFICE LADY", "SECRETARY", "NIGHT SHIFT",
                new MovieDTO("Minami Aizawa", "ABX-005", LocalDate.of(2026, 5, 12), "BEAUTIFUL GIRL", "NIGHT SHIFT"));
    }

    public void startApplication(Scanner scanner) {
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("\n--- MENU UTAMA ---");
            System.out.println("1. Cek Kategori Film");
            System.out.println("2. Cari Film via KODE AV");
            System.out.println("3. Liat Total Koleksi Film");
            System.out.println("4. Exit");
            System.out.print("Pilih mau ngapain nih: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    browseCategories(scanner);
                    break;
                case "2":
                    searchByAvCode(scanner);
                    break;
                case "3":
                    displayTotalMovies();
                    break;
                case "4":
                    System.out.println("Sip, makasih udah mampir king!");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Inputnya kaga valid kocak. Coba lagi sono!");
            }
        }
    }

    private void browseCategories(Scanner scanner) {
        // Level1
        String level1Key = selectFromMap(categoryTree, "PILIH KATEGORI", scanner);
        if (level1Key == null) return;

        // Level2
        Map<String, Map<String, Map<String, List<MovieDTO>>>> level2Map = categoryTree.get(level1Key);
        String level2Key = selectFromMap(level2Map, "SUB KATEGORI DARI: " + level1Key, scanner);
        if (level2Key == null) return;

        // Level3
        Map<String, Map<String, List<MovieDTO>>> level3Map = level2Map.get(level2Key);
        String level3Key = selectFromMap(level3Map, "MASUK LAGI KE: " + level2Key, scanner);
        if (level3Key == null) return;

        // Level4
        Map<String, List<MovieDTO>> level4Map = level3Map.get(level3Key);
        String level4Key = selectFromMap(level4Map, "LEVEL MENTOK: " + level3Key, scanner);
        if (level4Key == null) return;

        // FinalLevel
        List<MovieDTO> movies = level4Map.get(level4Key);
        printMoviesTable(movies, level4Key);
    }

    private String selectFromMap(Map<String, ?> currentMap, String header, Scanner scanner) {
        System.out.println("\n>>> " + header + " <<<");

        List<String> keys = new ArrayList<>(currentMap.keySet());
        for (int i = 0; i < keys.size(); i++) {
            System.out.println((i + 1) + ". " + keys.get(i));
        }
        System.out.println("0. Balik ke Menu Utama");

        System.out.print("Pilihan lu: ");
        try {
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 0) return null;
            if (choice > 0 && choice <= keys.size()) {
                return keys.get(choice - 1);
            } else {
                System.out.println("Pilihannya kejauhan bang, nggak ada di list kocak!");
            }
        } catch (NumberFormatException e) {
            System.out.println("Tulis angkanya ajaa, jangan pakai huruf!");
        }
        return null;
    }

    private void printMoviesTable(List<MovieDTO> movies, String level4Name) {
        System.out.println("\n--- LIST FILM BUAT: " + level4Name + " ---");

        int counter = 1;
        for (MovieDTO m : movies) {
            System.out.println(counter + ". " + m.getArtistName() +
                    " | Kode: " + m.getAvCode() +
                    " | Rilis: " + m.getReleaseDate() +
                    " | Kategori: " + m.getCategory() + " - " + m.getSubCategory());
            counter++;
        }
        System.out.println("-------------------------------------------------");
    }

    // BONUS 1
    private void searchByAvCode(Scanner scanner) {
        System.out.print("\nMasukin kode NUKLIR yang mau dicari: ");
        String keyword = scanner.nextLine().trim();

        boolean found = false;
        System.out.println("\nNih hasil pencariannya:");
        for (MovieDTO m : allMovies) {
            if (m.getAvCode().equalsIgnoreCase(keyword)) {
                System.out.println("Ketemu! => " + m.getArtistName() + " (Ada di kategori: " + m.getCategory() + " -> " + m.getSubCategory() + ")");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Wah, film dengan kode '" + keyword + "' nggak ada mpruy.");
        }
    }

    // BONUS 2
    private void displayTotalMovies() {
        System.out.println("\n--- TOTAL KOLEKSI SAAT INI ---");
        System.out.println("Sistem ini sekarang nyimpen total " + allMovies.size() + " judul film paporit.");
    }
}