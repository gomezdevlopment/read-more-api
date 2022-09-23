package com.gomezdevlopment.readmore.models.googleBooksJsonModels;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VolumeInfo {
    String title;
    String[] authors;
    String publisher;
    String publishedDate;
    String description;
    IndustryIdentifiers[] industryIdentifiers;
    ReadingModes readingModes;
    Integer pageCount;
    String printType;
    String[] categories;
    Integer averageRating;
    Integer ratingsCount;
    String maturityRating;
    Boolean allowAnonLogging;
    String contentVersion;
    PanelizationSummary panelizationSummary;
    ImageLinks imageLinks;
    String language;
    String previewLink;
    String infoLink;
    String canonicalVolumeLink;
}
