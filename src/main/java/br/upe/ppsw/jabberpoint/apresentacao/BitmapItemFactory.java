package br.upe.ppsw.jabberpoint.apresentacao;

import java.io.FileNotFoundException;

import org.springframework.util.ResourceUtils;


public class BitmapItemFactory implements ItemFactory {
    public BitmapItem createBitmapItem(int level, String imagePath) {
        try {
            String absolutePath = ResourceUtils.getFile(imagePath).getAbsolutePath();
            return new BitmapItem(absolutePath);
        } catch (FileNotFoundException e) {
            // Handle the exception as appropriate
        }
        return null;
    }
}
