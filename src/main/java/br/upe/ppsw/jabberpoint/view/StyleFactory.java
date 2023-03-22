package br.upe.ppsw.jabberpoint.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

import br.upe.ppsw.jabberpoint.model.Style;

public class StyleFactory {

    public static Style createStyle(StyleType type, Graphics2D context) {
        switch (type) {
            case TITLE:
                return new Style(new Font("Arial", Font.BOLD, 32), Color.BLACK, context);
            case BULLET:
                return new Style(new Font("Arial", Font.PLAIN, 24), Color.BLACK, context);
            case NUMBER:
                return new Style(new Font("Arial", Font.PLAIN, 24), Color.BLACK, context);
            default:
                return new Style(new Font("Arial", Font.PLAIN, 24), Color.BLACK, context);
        }
    }
}
