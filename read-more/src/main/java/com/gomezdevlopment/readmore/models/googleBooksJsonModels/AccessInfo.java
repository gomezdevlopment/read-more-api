package com.gomezdevlopment.readmore.models.googleBooksJsonModels;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccessInfo {
    String country;
    String viewability;
    Boolean embeddable;
    Boolean publicDomain;
    String textToSpeechPermission;
    Epub epub;
    Pdf pdf;
    String webReaderLink;
    String accessViewStatus;
    Boolean quoteSharingAllowed;
}
