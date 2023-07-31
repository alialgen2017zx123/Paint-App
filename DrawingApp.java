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

import java.awt.*;



import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;







import java.util.ArrayList;

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
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
    private int strokeSize;
	
	
	
	
	
	
	 public DrawingApp() {
		//default values
        selectedShape = "line";
        selectedColor = Color.BLACK;
        filledShape = false;
        shapesList = new ArrayList<>();
		
		


               for (ShapeInfo shape : shapesList) {
                    g2d.setColor(shape.getColor());		
		
		
	strokeSize = 1;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	g2d.setStroke(new BasicStroke(strokeSize));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	drawingPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                startX = e.getX();
                startY = e.getY();
            }

        //Create  All	Button
        Font font = new Font( "Serif", Font. BOLD, 20);
        Dimension buttonSize = new Dimension(64, 40);
        
        JButton lineButton = new JButton("╱");
        lineButton.setFont(new Font("Arial", Font.BOLD, 10));
        lineButton.setFont(font);
        lineButton.setPreferredSize(buttonSize);
        lineButton.setBackground(Color.white);		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	    JButton triangleButton = new JButton("∆");
        triangleButton.setFont(new Font("Arial", Font.BOLD, 35));
        triangleButton.setPreferredSize(buttonSize);
        triangleButton.setBackground(Color.white);	
		
		
		
		
		
		
		
		
		
		
		
	JButton ovalButton = new JButton("○");
        ovalButton.setFont(new Font("Arial", Font.BOLD, 35));
        ovalButton.setPreferredSize(buttonSize);
        ovalButton.setBackground(Color.white);
		
		
		
		
		
		
		
		
		
 JButton colorGreenButton = new JButton("Green");
        colorGreenButton.setBackground(Color.green);
        colorGreenButton.setForeground(Color.black);
        colorGreenButton.setFont(font);
        
        JButton colorBlackButton = new JButton("Black");
        colorBlackButton.setBackground(Color.black);
        colorBlackButton.setForeground(Color.white);
        colorBlackButton.setFont(font);
        
        JButton colorPinkButton = new JButton("Pink");
        colorPinkButton.setBackground(Color.pink);
        colorPinkButton.setForeground(Color.black);
        colorPinkButton.setFont(font); 		
		
	JButton colorRedButton = new JButton("Red");
        colorRedButton.setBackground(Color.red);
        colorRedButton.setForeground(Color.black);
        colorRedButton.setFont(font);
        
        JButton colorBlueButton = new JButton("Blue");
        colorBlueButton.setBackground(Color.blue);
        colorBlueButton.setForeground(Color.black);
        colorBlueButton.setFont(font);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
       //Shapes ButtonAction
        lineButton.addActionListener(e -> setSelectedShape("line"));		
		
		
		
		
     triangleButton.addActionListener(e -> setSelectedShape("triangle"));		
		
		
		
		
		
		colorGreenButton.addActionListener(e -> setSelectedColor(Color.GREEN));
        colorBlackButton.addActionListener(e -> setSelectedColor(Color.black));
        colorPinkButton.addActionListener(e -> setSelectedColor(Color.pink));
       		
		
		
		
		
		
		
		
		
		
		
		
		
		
		colorRedButton.addActionListener(e -> setSelectedColor(Color.RED));
        colorBlueButton.addActionListener(e -> setSelectedColor(Color.BLUE));
		
		
		
		
		
		
	ovalButton.addActionListener(e -> setSelectedShape("oval"));	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
       // add Button in Panel
        JPanel controlPanel = new JPanel();
        controlPanel.add(lineButton);		
		
		
		
		
	    controlPanel.add(triangleButton);	
		
		
		controlPanel.add(colorBlackButton);
        controlPanel.add(colorGreenButton);
        controlPanel.add(colorPinkButton);
       		
		
		
		
		
		
		
		
		
		
		
       Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(controlPanel, BorderLayout.NORTH);
        contentPane.add(drawingPanel, BorderLayout.CENTER);

        pack();
    }				
		
		
		
		
		controlPanel.add(colorRedButton);
        controlPanel.add(colorBlueButton);
		
		
	   private void setSelectedShape(String shape) {
        selectedShape = shape;
        
    }	
		
		
		
		
		
		
  private Shape createShape(int startX, int startY, int endX, int endY, int strokeSize) {
        int width = Math.abs(endX - startX);
        int height = Math.abs(endY - startY);		
		
		
	controlPanel.add(ovalButton); 	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	private void setSelectedColor(Color color) {
        selectedColor = color;
    }
		
		
		
		
		
		
		
	case "triangle":
            	
                Point2D.Double point1 = new Point2D.Double(startX, endY);
                Point2D.Double point2 = new Point2D.Double((startX + endX) / 2, startY);
                Point2D.Double point3 = new Point2D.Double(endX, endY);
                
                Path2D triangle = new Path2D.Double();
                triangle.moveTo(point1.getX(), point1.getY());
                triangle.lineTo(point2.getX(), point2.getY());
                triangle.lineTo(point3.getX(), point3.getY());
                triangle.closePath();
                
                return triangle;	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	 case "oval":
                return new Ellipse2D.Double(
                        Math.min(startX, endX),
                        Math.min(startY, endY),
                        width,
                        height
                );
		
           default:
                return new Line2D.Double(startX, startY, endX, endY);
        }
    }

						

	
		
		
		
		
		
		
		
		
	     private Shape shape;	
		
		
		
		
		
          this.shape = shape;		

   // Main Method 
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            DrawingApp app = new DrawingApp();
            app.setVisible(true);
        });
	}
  
	 // Class of shapes and their properties
    public static class ShapeInfo {
        private Shape shape;
        private Color color;
        private boolean filled;
		private int strokeSize;

        public ShapeInfo(Shape shape, Color color, boolean filled,int strokesize) {
            this.shape = shape;
            this.color = color;
            this.filled = filled;
            this.strokeSize = strokesize;     }

		
		
		
		
		
		
		
		
		
		

		public Shape getShape() {
            return shape;   }


		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	public Color getColor() {
            return color;     }
		
		
		
			


			


	 }
	 }
	 
	
	 
