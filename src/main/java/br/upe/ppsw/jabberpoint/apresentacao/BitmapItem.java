package br.upe.ppsw.jabberpoint.apresentacao;

import br.upe.ppsw.jabberpoint.model.Slide;

public class BitmapItem extends Slide {
	  private String filename;

	  public BitmapItem(String filename) {
	    this.filename = filename;
	  }
	  
	  public BitmapItem(int level, String fileName) {
	        super();
	        this.filename = fileName;
	    }
}
