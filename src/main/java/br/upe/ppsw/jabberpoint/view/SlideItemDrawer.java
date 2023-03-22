package br.upe.ppsw.jabberpoint.view;

import java.awt.Graphics;
import java.awt.Rectangle;

import br.upe.ppsw.jabberpoint.model.Style;

public abstract class SlideItemDrawer {

    protected SlideItem slideItem;

    public SlideItemDrawer(SlideItem slideItem) {
        this.slideItem = slideItem;
    }

    public abstract void draw(Graphics graphics, Rectangle area, Style style);

    public SlideItem getSlideItem() {
        return slideItem;
    }

    public void setSlideItem(SlideItem slideItem) {
        this.slideItem = slideItem;
    }
}
