package br.upe.ppsw.jabberpoint.controller;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import br.upe.ppsw.jabberpoint.model.Presentation;
import br.upe.ppsw.jabberpoint.view.SlideViewerComponent;

public class KeyController extends KeyAdapter {

  private Presentation presentation;
  private SlideViewerComponent slideViewerComponent;

  public KeyController(Presentation p, SlideViewerComponent slideViewerComponent) {
		this.presentation = p;
		this.slideViewerComponent = slideViewerComponent;
  }

  public void keyPressed(KeyEvent keyEvent) {
    switch (keyEvent.getKeyCode()) {
      case KeyEvent.VK_PAGE_DOWN:
      case KeyEvent.VK_RIGHT:
      case KeyEvent.VK_ENTER:
      case '+':
        presentation.nextSlide();
        slideViewerComponent.update();
        break;
      case KeyEvent.VK_PAGE_UP:
      case KeyEvent.VK_LEFT:
      case '-':
        presentation.prevSlide();
        slideViewerComponent.update();
        break;
      case 'q':
      case 'Q':
        System.exit(0);
        break; // TODO: Needs fix
      default:
        break;
    }
  }

}
