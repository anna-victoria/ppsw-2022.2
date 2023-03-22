package br.upe.ppsw.jabberpoint.view;

import br.upe.ppsw.jabberpoint.model.Style;

import java.awt.*;

public class TitleSlideItemDrawer implements Drawer {
    @Override
    public void drawTitle(String title, Style style, int x, int y, int width, int height) {
        Graphics2D g2d = (Graphics2D) style.getContext();
        Font font = style.getFont();
        Color color = style.getColor();

        g2d.setFont(font);
        g2d.setColor(color);
        g2d.drawString(title, x, y + font.getSize());
    }

    @Override
    public void drawBody(String text, Style style, int x, int y, int width, int height) {
        // Do nothing - this drawer does not handle body items
    }

    @Override
    public void drawBullet(String text, Style style, int level, int x, int y, int width, int height) {
        // Do nothing - this drawer does not handle bullet items
    }

    @Override
    public void drawImage(String path, int x, int y, int width, int height) {
        // Do nothing - this drawer does not handle image items
    }
}
