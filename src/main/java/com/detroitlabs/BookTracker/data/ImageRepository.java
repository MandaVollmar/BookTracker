package com.detroitlabs.BookTracker.data;

import com.detroitlabs.BookTracker.model.Book;
import com.detroitlabs.BookTracker.model.Image;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class ImageRepository {
    private static final List<Image> ALL_Images = Arrays.asList(
            new Image("HPSorcerer", 1),
            new Image("HPChamber", 2),
            new Image("HPPrisoner", 3),
            new Image("HPGoblet", 4),
            new Image("HPOrder", 5),
            new Image("HPHalfBlood", 6),
            new Image("HPDeathly", 7),
            new Image("HPCursedChild", 8),
            new Image("Songbirds", 9),
            new Image("IPHistory", 10),
            new Image("LastHouse", 11),
            new Image("HeartShaped", 12),
            new Image("CoffinPath", 13),
            new Image("DiggingMother", 14));


    public Image setImage(Integer id) {
        for (Image image : ALL_Images) {
            if (image.getId().equals(id)) {
                return image;
            }
        }
        return null;
    }
}
