package br.edu.univas.si.lab4.gridbaglayout.view;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import br.edu.univas.si.lab4.gridbaglayout.listener.ButtonsListener;
import br.edu.univas.si.lab4.gridbaglayout.model.Contact;

public class PrincipalFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private PanelData panelData;
	private PanelButtons panelButtons;
	
	public PrincipalFrame() {
		super("Contacts Manager");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		initialize();
		pack();
	}
	
	private void initialize() {
		add(getPanelData(), BorderLayout.CENTER);
		add(getPanelButtons(), BorderLayout.SOUTH);
	}

	/**
	 * @return the panelData
	 */
	private PanelData getPanelData() {
		if(panelData == null) {
			panelData = new PanelData();
		}
		return panelData;
	}

	/**
	 * @return the panelButtons
	 */
	private PanelButtons getPanelButtons() {
		if(panelButtons == null) {
			panelButtons = new PanelButtons();
			panelButtons.addListener(new ButtonsListener() {
				@Override
				public void okAction() {
					Contact contact = getPanelData().getContact();
					getPanelData().addContact(contact);
				}
				@Override
				public void cancelAction() {
					// TODO Please implements this in your home!
				}
			});
		}
		return panelButtons;
	}
	
	
}
