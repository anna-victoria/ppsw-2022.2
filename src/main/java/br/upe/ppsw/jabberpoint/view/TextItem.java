package br.upe.ppsw.jabberpoint.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public abstract class TextItem implements SlideItem {

    private int level;
    private String text;
    private Font font;
    private Color color;

    public TextItem(int level, String text) {
        this.level = level;
        this.text = text;
        this.font = new Font("Arial", Font.BOLD, 24);
        this.color = Color.BLACK;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setFont(Font font) {
        this.font = font;
    }

    public Font getFont() {
        return font;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public void draw(Graphics g, int x, int y, int maxWidth, int maxHeight) {
        g.setFont(font);
        g.setColor(color);

        int lineHeight = g.getFontMetrics().getHeight();

        String[] words = text.split(" ");
        StringBuilder line = new StringBuilder();
        int lineHeightCount = 0;

        for (String word : words) {
            if (lineHeightCount + lineHeight > maxHeight) {
                break;
            }
            if (g.getFontMetrics().stringWidth(line + word) <= maxWidth) {
                line.append(word).append(" ");
            } else {
                g.drawString(line.toString(), x, y + lineHeightCount);
                line = new StringBuilder(word + " ");
                lineHeightCount += lineHeight;
            }
        }

        g.drawString(line.toString(), x, y + lineHeightCount);
    }
}
