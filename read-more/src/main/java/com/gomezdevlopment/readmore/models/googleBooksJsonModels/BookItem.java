package com.gomezdevlopment.readmore.models.googleBooksJsonModels;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookItem {
    String kind;
    String id;
    String etag;
    String selfLink;
    VolumeInfo volumeInfo;
    SalesInfo salesInfo;
    AccessInfo accessInfo;
    SearchInfo searchInfo;
}
