package br.upe.ppsw.jabberpoint.model;

import java.util.ArrayList;
import java.util.List;

import br.upe.ppsw.jabberpoint.apresentacao.BitmapItem;
import br.upe.ppsw.jabberpoint.view.SlideItem;
import br.upe.ppsw.jabberpoint.view.TextItem;

public class Slide {
    private List<SlideItem> items;
    private String title;
    private boolean hasTitle;

    public Slide() {
        this.items = new ArrayList<>();
    }

    public Slide(String title) {
        this.title = title;
        this.items = new ArrayList<>();
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void addItem(SlideItem item) {
        items.add(item);
        if (item instanceof TitleSlideItem) {
            this.title = ((TitleSlideItem) item).getTitle();
            this.hasTitle = true;
        }
    }

    public List<SlideItem> getItems() {
        return items;
    }

    public String getTitle() {
        return title;
    }

    public boolean hasTitle() {
        return hasTitle;
    }

	public void append(int i, String string) {
		// TODO Auto-generated method stub
		
	}

	public void append(BitmapItem bitmapItem) {
		// TODO Auto-generated method stub
		
	}

    
}
