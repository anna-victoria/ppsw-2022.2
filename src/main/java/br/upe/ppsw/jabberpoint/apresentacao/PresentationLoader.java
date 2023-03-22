package br.upe.ppsw.jabberpoint.apresentacao;

import java.io.FileNotFoundException;

public interface PresentationLoader {
	  void loadFile(Presentation presentation, String filename) throws FileNotFoundException;
	}

