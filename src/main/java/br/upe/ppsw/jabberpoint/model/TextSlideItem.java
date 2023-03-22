package br.upe.ppsw.jabberpoint.model;

import br.upe.ppsw.jabberpoint.view.SlideItem;

public class TextSlideItem extends SlideItem {
    private String text;

    public TextSlideItem(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public void setLevel(int level) {
        super.setLevel(level);
        if (level > 0 && level <= 4) {
            setStyleName("Level" + level);
        } else {
            setStyleName("Default");
        }
    }
}
