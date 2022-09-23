package com.gomezdevlopment.readmore.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class BookInfo {
    String title;
    String[] authors;
    String publisher;
    String publishedDate;
    String description;
    Integer pageCount;
    String printType;
    String[] categories;
    Integer averageRating;
    Integer ratingsCount;
    String maturityRating;
    String smallThumbnail;
    String thumbnail;
    String language;
}
