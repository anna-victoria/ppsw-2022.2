package br.upe.ppsw.jabberpoint.apresentacao;

import java.io.IOException;

import br.upe.ppsw.jabberpoint.view.DemoPresentation;

public abstract class Accessor {

  public static final String DEMO_NAME = "Apresentação de Demonstração";
  public static final String DEFAULT_EXTENSION = ".xml";

  public static DemoPresentation getDemoAccessor() {
    return new DemoPresentation();
  }

  public Accessor() {}

  abstract public void loadFile(Presentation presentation, String fileName) throws IOException;

  abstract public void saveFile(Presentation presentation, String fileName) throws IOException;

}
