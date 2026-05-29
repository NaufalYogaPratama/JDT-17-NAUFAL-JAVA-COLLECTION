package com.indivaragroup.collection.movie.dto;

import java.time.LocalDate;

public class MovieDTO {
    private String artistName;
    private String avCode;
    private LocalDate releaseDate;
    private String category;
    private String subCategory;

    public MovieDTO(String artistName, String avCode, LocalDate releaseDate, String category, String subCategory) {
        this.artistName = artistName;
        this.avCode = avCode;
        this.releaseDate = releaseDate;
        this.category = category;
        this.subCategory = subCategory;
    }

    public String getArtistName() {
        return artistName;
    }

    public String getAvCode() {
        return avCode;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public String getCategory() {
        return category;
    }

    public String getSubCategory() {
        return subCategory;
    }
}
