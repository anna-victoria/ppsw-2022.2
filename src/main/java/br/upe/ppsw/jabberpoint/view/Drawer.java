package br.upe.ppsw.jabberpoint.view;

import br.upe.ppsw.jabberpoint.model.Style;

public interface Drawer {
    void drawTitle(String title, Style style, int x, int y, int width, int height);
    void drawBody(String text, Style style, int x, int y, int width, int height);
    void drawBullet(String text, Style style, int level, int x, int y, int width, int height);
    void drawImage(String path, int x, int y, int width, int height);
}
