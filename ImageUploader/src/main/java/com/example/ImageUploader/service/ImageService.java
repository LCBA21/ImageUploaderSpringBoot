package com.example.ImageUploader.service;

import com.example.ImageUploader.model.Image;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface ImageService {
     public Image create(Image image);
    public List<Image> viewAll();
    public Image viewById(long id);
   
}



