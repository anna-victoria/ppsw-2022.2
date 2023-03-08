package br.upe.ppsw.jabberpoint.apresentacao.model;


public abstract class SlideItem {

  private int level = 0;
  private String text;
  private TypeSlideItem type;
  private byte[] media;

  public SlideItem(int level) {
    this.level = level;
    this.text = "";
    this.type = TypeSlideItem.TEXT;
  }

  public SlideItem(int level, String text) {
	  this.level = level;
	  this.text = "";
	  this.type = TypeSlideItem.TEXT;
  }

  public SlideItem(int level, String caption, byte[] image) {
	this(level);
	
    this.text = caption;
    this.type = TypeSlideItem.IMAGE;
    this.media = image;
    
}/*
	 * 
	 * public abstract Rectangle getBoundingBox(Graphics g, ImageObserver observer,
	 * float scale, Style style);
	 * 
	 * public abstract void draw(int x, int y, float scale, Graphics g, Style style,
	 * ImageObserver observer);
	 */

}
