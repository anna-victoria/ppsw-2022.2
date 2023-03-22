package br.upe.ppsw.jabberpoint.view;

import java.awt.Graphics;

public interface SlideItem {
    public void draw(Graphics g, int x, int y, int width, int height);
    public int getHeight(Graphics g);
    public int getWidth(Graphics g);
    public boolean isDrawable();
}
