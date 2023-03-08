package br.upe.ppsw.jabberpoint.apresentacao.model;

import java.util.ArrayList;

import br.upe.ppsw.jabberpoint.apresentacao.view.SlideViewerComponent;

public class Presentation {

  private String title;
  private ArrayList<Slide> slides = null;
  //private SlideViewerComponent slideViewComponent = null; //TODO: Tirar
  private int currentSlideNumber = 0; 
  

  public Presentation() {
    clear();
  }

  public int getSizeSize() {
    return this.slides.size();
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String newTitle) {
    title = newTitle;
  }
  
  public Slide getSlide(int number) {
	  Slide slide = null;
	  if (number >= 0 && number <= getSlidesSize()) {
		  slide.append(this.slides.get(number));
	  }
  }

  public int getSlideNumber() {
    return getSlide.(this.currentSlideNumber);
  }

  //public void setSlideNumber(int number) {
   // currentSlideNumber = number;
   // if (slideViewComponent != null) {
   //   slideViewComponent.update(this, getCurrentSlide());
   // }
  //}

  public void prevSlide() {
    if (currentSlideNumber > 0) {
      setSlideNumber(currentSlideNumber - 1);
    }
  }

  public void nextSlide() {
    if (currentSlideNumber < (showList.size() - 1)) {
      setSlideNumber(currentSlideNumber + 1);
    }
  }

  public void clear() {
    showList = new ArrayList<Slide>();
    setSlideNumber(-1);
  }

	/*
	 * public void append(Slide slide) { showList.add(slide); }
	 * 
	 * public Slide getSlide(int number) { if (number < 0 || number >= getSize()) {
	 * return null; } return (Slide) showList.get(number); }
	 */

  public Slide getCurrentSlide() {
    return getSlide(currentSlideNumber);
  }

  public void exit(int n) {
    System.exit(n);
  }
}
