package br.upe.ppsw.jabberpoint.apresentacao.view;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.ImageObserver;
import java.util.Vector;

import javax.swing.JFrame;

import br.upe.ppsw.jabberpoint.apresentacao.controller.KeyController;
import br.upe.ppsw.jabberpoint.apresentacao.controller.MenuController;
import br.upe.ppsw.jabberpoint.apresentacao.model.Presentation;
import br.upe.ppsw.jabberpoint.apresentacao.model.SlideItem;
import br.upe.ppsw.jabberpoint.apresentacao.model.Slide;

public class SlideViewerFrame extends JFrame {

  private static final long serialVersionUID = 3227L;

  private static final String JABTITLE = "Jabberpoint 1.6";
 
  
  public SlideViewerFrame(String title, Presentation presentation) {
    super(title);

    SlideViewerComponent slideViewerComponent = new SlideViewerComponent(presentation, this);
    presentation.setShowView(slideViewerComponent);

    setupWindow(slideViewerComponent, presentation);
  }

  public void setupWindow(SlideViewerComponent slideViewerComponent, Presentation presentation) {
    setTitle(JABTITLE);

    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    });

    getContentPane().add(slideViewerComponent);
    addKeyListener(new KeyController(presentation));
    setMenuBar(new MenuController(this, presentation));
    setSize(new Dimension(WIDTH, HEIGHT));

    setVisible(true);
  }
  
  private Vector<SlideItem> items;
  
  public Dimension getSize() {
	    return items.size();
	  }
  
  public void draw(Graphics g, Rectangle area, ImageObserver view) { 
	    float scale = getScale(area);

	    int y = area.y;

	    SlideItem slideItem = this.title;
	    Style style = Style.getStyle(slideItem.getLevel());
	    slideItem.draw(area.x, y, scale, g, style, view);

	    y += slideItem.getBoundingBox(g, view, scale, style).height;

	    for (int number = 0; number < getSize(); number++) {
	      slideItem = (SlideItem) getSlideItems().elementAt(number);

	      style = Style.getStyle(slideItem.getLevel());
	      slideItem.draw(area.x, y, scale, g, style, view);

	      y += slideItem.getBoundingBox(g, view, scale, style).height;
	    }
	    
  private float getScale(Rectangle area) {
	    return Math.min(((float) area.width) / ((float) WIDTH),
	        ((float) area.height) / ((float) HEIGHT));
	  }

}
