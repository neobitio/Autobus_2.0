package client.view;

import javax.swing.JPanel;

public abstract class Window extends JPanel implements ViewInterface{

	private static final long serialVersionUID = 1L;
	protected static View view;

    Window() {
        initComponents();
        createEvents();
    }
}
