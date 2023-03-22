package br.upe.ppsw.jabberpoint.model;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

public class Style {

    private Font font;
    private Color color;
    private Graphics2D context;

    public Style(Font font, Color color, Graphics2D context) {
        this.font = font;
        this.color = color;
        this.context = context;
    }

    public Font getFont() {
        return font;
    }

    public void setFont(Font font) {
        this.font = font;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Graphics2D getContext() {
        return context;
    }

    public void setContext(Graphics2D context) {
        this.context = context;
    }

}
