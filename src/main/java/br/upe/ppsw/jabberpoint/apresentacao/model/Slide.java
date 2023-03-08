package br.upe.ppsw.jabberpoint.apresentacao.model;


import java.util.LinkedList;


public class Slide {

  private String title;
  private LinkedList<SlideItem> items;
  //LinkedList is a collection which can contain many objects of the same type.

  public Slide() {
    this.items = new LinkedList<>();
  }
  
  public Slide(String title) {
	  this();
	  this.title = title;
  }

  public void append(SlideItem item) { //append = acrescentar, muito usado para adicionar data em um arquivo
    this.items.addLast(item);
  }

  public void add(int level, SlideItem item) {
    this.items.add(level, item);
  }

  public SlideItem getSlideItem(int number) {
    return items.get(number);
  }

  public int getSlideItems() {
    return this.items.size();
  }


}
