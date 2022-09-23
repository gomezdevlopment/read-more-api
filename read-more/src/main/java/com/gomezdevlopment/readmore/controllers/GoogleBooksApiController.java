package com.gomezdevlopment.readmore.controllers;

import com.gomezdevlopment.readmore.ApiKey;
import com.gomezdevlopment.readmore.models.BookInfo;
import com.gomezdevlopment.readmore.models.googleBooksJsonModels.BookItem;
import com.gomezdevlopment.readmore.models.googleBooksJsonModels.BookResponse;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/search")
public class GoogleBooksApiController {
    @RequestMapping("/{input}")
    public List<BookInfo> searchBooks(@PathVariable("input") String input){
        ArrayList<BookInfo> listOfBooks = new ArrayList<>();
        RestTemplate restTemplate = new RestTemplate();

        String BASE_URL = "https://www.googleapis.com/books/v1/volumes?q=";
        String KEY_PARAM = "&key=";

        BookResponse response = restTemplate.getForObject(BASE_URL + input + KEY_PARAM + ApiKey.API_KEY, BookResponse.class);
        if(response != null){
            for(BookItem item : response.getItems()){
                BookInfo bookInfo = new BookInfo(
                        item.getVolumeInfo().getTitle(),
                        item.getVolumeInfo().getAuthors(),
                        item.getVolumeInfo().getPublisher(),
                        item.getVolumeInfo().getPublishedDate(),
                        item.getVolumeInfo().getDescription(),
                        item.getVolumeInfo().getPageCount(),
                        item.getVolumeInfo().getPrintType(),
                        item.getVolumeInfo().getCategories(),
                        item.getVolumeInfo().getAverageRating(),
                        item.getVolumeInfo().getRatingsCount(),
                        item.getVolumeInfo().getMaturityRating(),
                        item.getVolumeInfo().getImageLinks().getSmallThumbnail(),
                        item.getVolumeInfo().getImageLinks().getThumbnail(),
                        item.getVolumeInfo().getLanguage()
                );
                listOfBooks.add(bookInfo);
            }
        }
        return listOfBooks;
    }
}
