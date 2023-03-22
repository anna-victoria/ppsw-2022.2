package br.upe.ppsw.jabberpoint.model;

import java.awt.Graphics;

import br.upe.ppsw.jabberpoint.view.Drawer;
import br.upe.ppsw.jabberpoint.view.SlideItem;
import br.upe.ppsw.jabberpoint.view.StyleType;

public abstract class TitleSlideItem implements SlideItem {

    private String title;
    private Style style;

    public TitleSlideItem(String title, Style style) {
        this.title = title;
        this.style = style;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Style getStyle() {
        return style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }

    public void draw(Drawer drawer, int x, int y, int width, int height) {
        drawer.drawTitle(title, style, x, y, width, height);
    }

    public int getLevel() {
        return 0;
    }

    public StyleType getStyleType() {
        return StyleType.TITLE;
    }

	@Override
	public void draw(Graphics g, int x, int y, int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getHeight(Graphics g) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getWidth(Graphics g) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setLevel(int level) {
		// TODO Auto-generated method stub
		
	}
}
