import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.awt.geom.Line2D;











public class DrawingApp extends JFrame {
	private String selectedShape;
    private Color selectedColor;
    private boolean filledShape;
    private int startX, startY, endX, endY;
    private static ArrayList<ShapeInfo> shapesList;
    private ActionListener undoAction;
    private JCheckBox filledCheckBox;
    private int strokeSize;
	
	
	
	
	
	
	
	
	
	
	 public DrawingApp() {
		



		
		
		
		
		
		
 JPanel drawingPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
 //Background White
        drawingPanel.setBackground(Color.white);		
		
		
		
		
		
		
		
		
 @Override
            public void mouseReleased(MouseEvent e) {
                endX = e.getX();
                endY = e.getY();
                Shape shape;

                shape = createShape(startX, startY, endX, endY,strokeSize);

                shapesList.add(new ShapeInfo(shape, selectedColor, filledShape,strokeSize));


                drawingPanel.repaint();


            }
        });		
		
		
		
		
		
		
		
		
		
		
		
 JButton rectangleButton = new JButton("▭");
        rectangleButton.setFont(new Font("Arial", Font.BOLD, 28));
        rectangleButton.setPreferredSize(buttonSize);
        rectangleButton.setBackground(Color.white);		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
     JButton saveButton = new JButton("save ⤓");
        Dimension buttonSize2 = new Dimension(115, 35);
        saveButton.setPreferredSize(buttonSize2);
        saveButton.setForeground(Color.white);
        saveButton.setBackground(Color.decode("#FC8E01"));
        saveButton.setFont(new Font("", Font.BOLD, 25));
        saveButton.setBorderPainted(true);		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
rectangleButton.addActionListener(e -> setSelectedShape("rectangle"));		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
controlPanel.add(rectangleButton);		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	 }
	 
}