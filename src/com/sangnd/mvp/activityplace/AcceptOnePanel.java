/*
Copyright 2013 heroandtn3 (@sangnd.com)

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.sangnd.mvp.activityplace;

import java.awt.Component;

import javax.swing.JFrame;

/**
 * @author heroandtn3
 * @date Jul 17, 2013
 */
public class AcceptOnePanel {

	private JFrame frame;

	/**
	 * 
	 */
	public AcceptOnePanel(JFrame frame) {
		this.frame = frame;
	}

	public void setPanel(Component panel) {
		frame.getContentPane().removeAll();
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}
