import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.awt.geom.Line2D;


import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

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
		
		
 
		
		
		
		
		
		
		
		
		
		
JButton rectangleButton = new JButton("?");
        rectangleButton.setFont(new Font("Arial", Font.BOLD, 28));
        rectangleButton.setPreferredSize(buttonSize);
        rectangleButton.setBackground(Color.white);			
 	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	JButton saveButton = new JButton("save ?");
        Dimension buttonSize2 = new Dimension(115, 35);
        saveButton.setPreferredSize(buttonSize2);
        saveButton.setForeground(Color.white);
        saveButton.setBackground(Color.decode("#FC8E01"));
        saveButton.setFont(new Font("", Font.BOLD, 25));
        saveButton.setBorderPainted(true);	
     		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
rectangleButton.addActionListener(e -> setSelectedShape("rectangle"));		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
// Save Feature Created by Abdullah Ahmed Abdel-Naim & Ali Mohamed Ali Abdel-Majeed
        saveButton.addActionListener(e -> {
            try {
                //Create a BufferedImage object with the same size as your JPanel
                BufferedImage image = new BufferedImage(drawingPanel.getWidth(), drawingPanel.getHeight(), BufferedImage.TYPE_INT_RGB);
                //Get the graphics context of the image
                Graphics2D g2d = image.createGraphics();
                //Paint your JPanel onto the image
                drawingPanel.paint(g2d);
                //Get a subimage of the image that excludes the borders and margins of your JPanel
                BufferedImage subImage = image.getSubimage(10, 10, drawingPanel.getWidth() - 20, drawingPanel.getHeight() - 20);
                //Create a JFileChooser object
                JFileChooser fileChooser = new JFileChooser();
                //Set the file filter to accept only PNG files
                fileChooser.setFileFilter(new FileNameExtensionFilter("PNG Images", "png"));
                //Show the save dialog and get the user's choice
                int choice = fileChooser.showSaveDialog(this);
                //If the user approves the choice
                if (choice == JFileChooser.APPROVE_OPTION) {
                    //Get the selected file
                    File file = fileChooser.getSelectedFile();
                    //Add the .png extension if it is not present
                    if (!file.getName().endsWith(".png")) {
                        file = new File(file.getAbsolutePath() + ".png");
                    }
                    //Write the subimage to the file as a PNG format
                    ImageIO.write(subImage, "png", file);
                    //Show a message dialog to confirm the saving
                    JOptionPane.showMessageDialog(this, "Image saved successfully!");
                }
            } catch (IOException ex) {
                //Show an error dialog if there is an exception
                JOptionPane.showMessageDialog(this, "Error saving image: " + ex.getMessage());
            }
        });  //end Save		
		
		
		
		
		
controlPanel.add(rectangleButton);		
		
		
		
		
		
		
		
		
		
		
		
		
controlPanel.add(saveButton);		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
 
 // Select Shape
        switch (selectedShape) {
            case "rectangle":
                return new Rectangle(
                        Math.min(startX, endX),
                        Math.min(startY, endY),
                        width,
                        height

                );		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
public boolean isFilled() {
            return filled;  }		
		
		}		
		
	}