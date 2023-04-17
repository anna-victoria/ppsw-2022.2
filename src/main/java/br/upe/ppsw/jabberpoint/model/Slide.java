package br.upe.ppsw.jabberpoint.model;
import java.util.Vector;

public class Slide {

// public final static int WIDTH = 1200;
//  public final static int HEIGHT = 800;

  protected TextItem title;
  protected Vector<SlideItem> items;

  public Slide() {
    items = new Vector<SlideItem>();
  }

  public void appendSlideItem(SlideItem anItem) {
    items.addElement(anItem);
  }

  public String getTitleText() {
    return title.getText();
  }
  
  public TextItem getTitle() {
		return this.title;
	}

  public void setTitle(String newTitle) {
    title = new TextItem(0, newTitle);
  }

  public void appendTextItem(int level, String message) {
    appendSlideItem(new TextItem(level, message));
  }

  public SlideItem getSlideItem(int number) {
    return (SlideItem) items.elementAt(number);
  }

  public Vector<SlideItem> getSlideItems() {
    return items;
  }

  public int getSize() {
    return items.size();
  }

}
