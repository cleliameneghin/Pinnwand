package Pinnwand;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.SwingUtilities;

public class RightClick implements MouseListener{
	
JPopupMenu popupMenu;

public JPopupMenu getPopupMenu() {
	return popupMenu;
}

public void setPopupMenu(JPopupMenu popupMenu) {
	this.popupMenu = popupMenu;
}

public RightClick(JPopupMenu popupMenu){
	setPopupMenu(popupMenu);	
}

public void showMenu(MouseEvent e){
//	editItem.addActionListener(this);
	/*
	editItem.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			//Neue Notiz
			System.out.println("Neue Notiz angewählt ");
		}
	});
	popupMenu.add(editItem);*/
}

public void mouseClicked(MouseEvent e) {
	popupMenu.show(e.getComponent(), e.getX(), e.getY());
}

public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

	
	/*@Override
	public void mouseClicked(MouseEvent e) {System.out.println(134);
		popupMenu.show(e.getComponent(), e.getX(), e.getY());
		e.getComponent().revalidate();
		e.getComponent().repaint();
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}*/
}