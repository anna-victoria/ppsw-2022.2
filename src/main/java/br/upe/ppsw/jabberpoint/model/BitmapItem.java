package br.upe.ppsw.jabberpoint.model;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.imageio.ImageIO;

import br.upe.ppsw.jabberpoint.view.SlideItem;

public class BitmapItem implements SlideItem {
    private String filename;
    private Image image;
    private int x, y;

    public BitmapItem(int level, String filename) {
        super();
        this.filename = filename;
        loadImage();
    }

    private void loadImage() {
        try {
            image = ImageIO.read(new FileInputStream(new File(filename)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void draw(Graphics g, int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        g.drawImage(image, x, y, width, height, null);
    }

    public int getHeight(Graphics g) {
        return image.getHeight(null);
    }

    public int getWidth(Graphics g) {
        return image.getWidth(null);
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

	@Override
	public boolean isDrawable() {
		// TODO Auto-generated method stub
		return false;
	}
}
