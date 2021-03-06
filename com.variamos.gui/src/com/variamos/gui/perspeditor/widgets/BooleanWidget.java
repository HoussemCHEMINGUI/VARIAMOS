package com.variamos.gui.perspeditor.widgets;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JComponent;

import com.variamos.dynsup.interfaces.IntInstAttribute;

/**
 * A class to support boolean widgets on the interface. Copied on BooleanWidget
 * from ProductLine. Part of PhD work at University of Paris 1
 * 
 * @author Juan C. Munoz Fernandez <jcmunoz@gmail.com>
 * 
 * @version 1.1
 * @since 2014-11-10
 * @see com.variamos.gui.pl.editor.widgets.BooleanWidget
 */
@SuppressWarnings("serial")
public class BooleanWidget extends WidgetR {

	private JCheckBox chkValue;

	public BooleanWidget() {
		super();
		setLayout(new BorderLayout());

		chkValue = new JCheckBox();

		chkValue.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				chkValue.firePropertyChange(WidgetR.PROPERTY_VALUE,
						!chkValue.isSelected(), chkValue.isSelected());
			}
		});
		add(chkValue, BorderLayout.CENTER);
		revalidate();
	}

	@Override
	protected boolean pushValue(IntInstAttribute v) {
		chkValue.setText(String.valueOf(v.getIdentifier()));
		chkValue.setSelected(v.getAsBoolean());
		group.setText((String) v.getGroup());
		revalidate();
		repaint();
		return false;
	}

	@Override
	protected void pullValue(IntInstAttribute v) {
		v.setValue(chkValue.isSelected());
		v.setGroup(group.getText());
	}

	@Override
	public JComponent getEditor() {
		return chkValue;
	}
	
	@Override
	public JComponent getGroup() {
		return group;
	}
}
