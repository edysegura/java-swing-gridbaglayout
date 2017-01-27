package br.edu.univas.si.lab4.gridbaglayout.view;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import br.edu.univas.si.lab4.gridbaglayout.model.Contact;

public class PanelData extends JPanel {
	private static final long serialVersionUID = 1L;

	private JLabel nameLabel;
	private JLabel emailLabel;
	private JLabel phoneLabel;
	private JLabel addressLabel;
	private JLabel zipCodeLabel;
	private JLabel cityLabel;
	private JLabel stateLabel;
	
	private JTextField nameField;
	private JTextField emailField;
	private JTextField phoneField;
	private JTextField addressField;
	private JTextField zipCodeField;
	private JTextField cityField;
	private JComboBox stateField;
	
	private GridBagConstraints nameLabelConstraints;
	private GridBagConstraints emailLabelConstraints;
	private GridBagConstraints phoneLabelConstraints;
	private GridBagConstraints addressLabelConstraints;
	private GridBagConstraints zipCodeLabelConstraints;
	private GridBagConstraints cityLabelConstraints;
	private GridBagConstraints stateLabelConstraints;
	
	private GridBagConstraints nameFieldConstraints;
	private GridBagConstraints emailFieldConstraints;
	private GridBagConstraints phoneFieldConstraints;
	private GridBagConstraints addressFieldConstraints;
	private GridBagConstraints zipCodeFieldConstraints;
	private GridBagConstraints cityFieldConstraints;
	private GridBagConstraints stateFieldConstraints;
	
	//components for display one jtable
	private JTable contactTable;
	private DefaultTableModel tableModel;
	private JScrollPane tableScroll;
	private GridBagConstraints tableConstraints;
	
	public PanelData() {
		setLayout(new GridBagLayout());
		setBorder(new EmptyBorder(6, 6, 6, 6));
		initialize();
	}
	
	private void initialize() {
		add(getNameLabel(), getNameLabelConstraints());
		add(getEmailLabel(), getEmailLabelConstraints());
		add(getPhoneLabel(), getPhoneLabelConstraints());
		add(getAddressLabel(), getAddressLabelConstraints());
		add(getZipCodeLabel(), getZipCodeLabelConstraints());
		add(getCityLabel(), getCityLabelConstraints());
		add(getStateLabel(), getStateLabelConstraints());
		add(getNameField(), getNameFieldConstraints());
		add(getEmailField(), getEmailFieldConstraints());
		add(getPhoneField(), getPhoneFieldConstraints());
		add(getAddressField(), getAddressFieldConstraints());
		add(getZipCodeField(), getZipCodeFieldConstraints());
		add(getCityField(), getCityFieldConstraints());
		add(getStateField(), getStateFieldConstraints());
		add(getTableScroll(), getTableConstraints());
	}

	/**
	 * @return the nameLabel
	 */
	private JLabel getNameLabel() {
		if(nameLabel == null) {
			nameLabel = new JLabel();
			nameLabel.setText("Name:");
		}
		return nameLabel;
	}

	/**
	 * @return the emailLabel
	 */
	private JLabel getEmailLabel() {
		if(emailLabel == null) {
			emailLabel = new JLabel();
			emailLabel.setText("E-mail:");
		}
		return emailLabel;
	}

	/**
	 * @return the phoneLabel
	 */
	private JLabel getPhoneLabel() {
		if(phoneLabel == null) {
			phoneLabel = new JLabel();
			phoneLabel.setText("Phone:");
		}
		return phoneLabel;
	}

	/**
	 * @return the addressLabel
	 */
	private JLabel getAddressLabel() {
		if(addressLabel == null) {
			addressLabel = new JLabel();
			addressLabel.setText("Address:");
		}
		return addressLabel;
	}

	/**
	 * @return the zipCodeLabel
	 */
	private JLabel getZipCodeLabel() {
		if(zipCodeLabel == null) {
			zipCodeLabel = new JLabel();
			zipCodeLabel.setText("Zip Code:");
		}
		return zipCodeLabel;
	}

	/**
	 * @return the cityLabel
	 */
	private JLabel getCityLabel() {
		if(cityLabel == null) {
			cityLabel = new JLabel();
			cityLabel.setText("City:");
		}
		return cityLabel;
	}

	/**
	 * @return the stateLabel
	 */
	private JLabel getStateLabel() {
		if(stateLabel == null) {
			stateLabel = new JLabel();
			stateLabel.setText("ST:");
		}
		return stateLabel;
	}

	/**
	 * @return the nameField
	 */
	private JTextField getNameField() {
		if(nameField == null) {
			nameField = new JTextField();			
		}
		return nameField;
	}

	/**
	 * @return the emailField
	 */
	private JTextField getEmailField() {
		if(emailField == null) {
			emailField = new JTextField();			
		}
		return emailField;
	}

	/**
	 * @return the phoneField
	 */
	private JTextField getPhoneField() {
		if(phoneField == null) {
			phoneField = new JTextField();			
		}
		return phoneField;
	}

	/**
	 * @return the addressField
	 */
	private JTextField getAddressField() {
		if(addressField == null) {
			addressField = new JTextField();			
		}
		return addressField;
	}

	/**
	 * @return the zipCodeField
	 */
	private JTextField getZipCodeField() {
		if(zipCodeField == null) {
			zipCodeField = new JTextField();			
		}
		return zipCodeField;
	}

	/**
	 * @return the cityField
	 */
	private JTextField getCityField() {
		if(cityField == null) {
			cityField = new JTextField();			
		}
		return cityField;
	}

	/**
	 * @return the stateField
	 */
	private JComboBox getStateField() {
		if(stateField == null) {
			String[] itens = new String[]{
			  "AC","AL","AP","AM","BA",
			  "CE","DF","ES","GO","MA",
			  "MT","MS","MG","PA","PB",
			  "PR","PE","PI","RJ","RN",
			  "RS","RO","RR","SC","SP",
			  "SE","TO"
			};
			stateField = new JComboBox(itens);			
		}
		return stateField;
	}

		
	private GridBagConstraints createConstraintPrototype() {
		GridBagConstraints gbc = new GridBagConstraints();
		int space = 2;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.insets = new Insets(space, space, space, space);
		return gbc;
	}

	/**
	 * @return the nameLabelConstraints
	 */
	private GridBagConstraints getNameLabelConstraints() {
		if(nameLabelConstraints == null) {
			nameLabelConstraints = createConstraintPrototype();
			nameLabelConstraints.gridx = 0;
			nameLabelConstraints.gridy = 0;
		}
		return nameLabelConstraints;
	}

	/**
	 * @return the emailLabelConstraints
	 */
	private GridBagConstraints getEmailLabelConstraints() {
		if(emailLabelConstraints == null) {
			emailLabelConstraints = createConstraintPrototype();
			emailLabelConstraints.gridx = 0;
			emailLabelConstraints.gridy = 1;
		}
		return emailLabelConstraints;
	}

	/**
	 * @return the phoneLabelConstraints
	 */
	private GridBagConstraints getPhoneLabelConstraints() {
		if(phoneLabelConstraints == null) {
			phoneLabelConstraints = createConstraintPrototype();
			phoneLabelConstraints.gridx = 3;
			phoneLabelConstraints.gridy = 1;
		}
		return phoneLabelConstraints;
	}

	/**
	 * @return the addressLabelConstraints
	 */
	private GridBagConstraints getAddressLabelConstraints() {
		if(addressLabelConstraints == null) {
			addressLabelConstraints = createConstraintPrototype();
			addressLabelConstraints.gridx = 0;
			addressLabelConstraints.gridy = 2;
		}
		return addressLabelConstraints;
	}

	/**
	 * @return the zipCodeLabelConstraints
	 */
	private GridBagConstraints getZipCodeLabelConstraints() {
		if(zipCodeLabelConstraints == null) {
			zipCodeLabelConstraints = createConstraintPrototype();
			zipCodeLabelConstraints.gridx = 0;
			zipCodeLabelConstraints.gridy = 3;
		}
		return zipCodeLabelConstraints;
	}

	/**
	 * @return the cityLabelConstraints
	 */
	private GridBagConstraints getCityLabelConstraints() {
		if(cityLabelConstraints == null) {
			cityLabelConstraints = createConstraintPrototype();
			cityLabelConstraints.gridx = 2;
			cityLabelConstraints.gridy = 3;
		}
		return cityLabelConstraints;
	}

	/**
	 * @return the stateLabelConstraints
	 */
	private GridBagConstraints getStateLabelConstraints() {
		if(stateLabelConstraints == null) {
			stateLabelConstraints = createConstraintPrototype();
			stateLabelConstraints.gridx = 5;
			stateLabelConstraints.gridy = 3;
		}
		return stateLabelConstraints;
	}

	/**
	 * @return the nameFieldConstraints
	 */
	private GridBagConstraints getNameFieldConstraints() {
		if(nameFieldConstraints == null) {
			nameFieldConstraints = createConstraintPrototype();
			nameFieldConstraints.gridx = 1;
			nameFieldConstraints.gridy = 0;
			nameFieldConstraints.gridwidth = 6;
		}
		return nameFieldConstraints;
	}

	/**
	 * @return the emailFieldConstraints
	 */
	private GridBagConstraints getEmailFieldConstraints() {
		if(emailFieldConstraints == null) {
			emailFieldConstraints = createConstraintPrototype();
			emailFieldConstraints.gridx = 1;
			emailFieldConstraints.gridy = 1;
			emailFieldConstraints.gridwidth = 2;
		}
		return emailFieldConstraints;
	}

	/**
	 * @return the phoneFieldConstraints
	 */
	private GridBagConstraints getPhoneFieldConstraints() {
		if(phoneFieldConstraints == null) {
			phoneFieldConstraints = createConstraintPrototype();
			phoneFieldConstraints.gridx = 4;
			phoneFieldConstraints.gridy = 1;
			phoneFieldConstraints.gridwidth = 3;
		}
		return phoneFieldConstraints;
	}

	/**
	 * @return the addressFieldConstraints
	 */
	private GridBagConstraints getAddressFieldConstraints() {
		if(addressFieldConstraints == null) {
			addressFieldConstraints = createConstraintPrototype();
			addressFieldConstraints.gridx = 1;
			addressFieldConstraints.gridy = 2;
			addressFieldConstraints.gridwidth = 6;
		}
		return addressFieldConstraints;
	}

	/**
	 * @return the zipCodeFieldConstraints
	 */
	private GridBagConstraints getZipCodeFieldConstraints() {
		if(zipCodeFieldConstraints == null) {
			zipCodeFieldConstraints = createConstraintPrototype();
			zipCodeFieldConstraints.gridx = 1;
			zipCodeFieldConstraints.gridy = 3;
			//It is not necessary because the value default is 1
			//zipCodeFieldConstraints.gridwidth = 1;
			zipCodeFieldConstraints.ipadx = 80; //define a column with
		}
		return zipCodeFieldConstraints;
	}

	/**
	 * @return the cityFieldConstraints
	 */
	private GridBagConstraints getCityFieldConstraints() {
		if(cityFieldConstraints == null) {
			cityFieldConstraints = createConstraintPrototype();
			cityFieldConstraints.gridx = 3;
			cityFieldConstraints.gridy = 3;
			cityFieldConstraints.gridwidth = 2;
			cityFieldConstraints.ipadx = 120;
		}
		return cityFieldConstraints;
	}

	/**
	 * @return the stateFieldConstraints
	 */
	private GridBagConstraints getStateFieldConstraints() {
		if(stateFieldConstraints == null) {
			stateFieldConstraints = createConstraintPrototype();
			stateFieldConstraints.gridx = 6;
			stateFieldConstraints.gridy = 3;
		}
		return stateFieldConstraints;
	}
	
	/**
	 * @return the contactTable
	 */
	private JTable getContactTable() {
		if(contactTable == null) {
			contactTable = new JTable();
			contactTable.setModel(getTableModel());
		}
		return contactTable;
	}

	/**
	 * @return the tableModel
	 */
	private DefaultTableModel getTableModel() {
		if(tableModel == null) {
			tableModel = new DefaultTableModel();
			tableModel.setColumnIdentifiers(new String[]{
			  "Name", "E-mail", "Phone", "State"
			});
		}
		return tableModel;
	}

	/**
	 * @return the tableScroll
	 */
	private JScrollPane getTableScroll() {
		if(tableScroll == null) {
			tableScroll = new JScrollPane(getContactTable());
			tableScroll.setPreferredSize(new Dimension(0,0));
		}
		return tableScroll;
	}

	/**
	 * @return the tableScrollConstraints
	 */
	private GridBagConstraints getTableConstraints() {
		tableConstraints = createConstraintPrototype();
		tableConstraints.gridx = 0;
		tableConstraints.gridy = 4;
		tableConstraints.gridwidth = 7;
		tableConstraints.ipady = 200;
		return tableConstraints;
	}
	
	public Contact getContact() {
		Contact c = new Contact();
		c.setName(getNameField().getText());
		c.setEmail(getEmailField().getText());
		c.setPhone(getPhoneField().getText());
		c.setState((String)getStateField().getSelectedItem());
		//FIXME Please complete this in your home as homework
		return c; 
	}
	
	public void addContact(Contact contact) {
		String[] newLine = new String[] {
			contact.getName(),
			contact.getEmail(),
			contact.getPhone(),
			contact.getState()
		};
		getTableModel().addRow(newLine);
	}
	
	
}
