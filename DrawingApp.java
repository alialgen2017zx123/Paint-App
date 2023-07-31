import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Path2D;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;

public class DrawingApp extends JFrame {
	private String selectedShape;
    private Color selectedColor;
    private boolean filledShape;
	private boolean eraserMode;
    private int startX, startY, endX, endY;
    private static ArrayList<ShapeInfo> shapesList;
    private int strokeSize;
    private ActionListener undoAction;
   private JCheckBox filledCheckBox;
    
    
    
    public DrawingApp() {
    	//default values
        selectedShape = "line";
        selectedColor = Color.BLACK;
		eraserMode=false;
        filledShape = false;
        shapesList = new ArrayList<>();
        filledCheckBox = new JCheckBox("Fill Shape");
        filledCheckBox.setFont(new Font("Times New Roman", Font.BOLD, 18));
        filledCheckBox.setBackground(Color.decode("#80C583"));
        filledCheckBox.setBorderPainted(true);
        strokeSize = 1;

        //Frame settings
        setTitle("Drawing App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(1400, 770));
        
        
        JPanel drawingPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                
                //Improve graphic quality
               g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);   
               g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
               g2d.setRenderingHint(RenderingHints.KEY_COLOR_RENDERING, RenderingHints.VALUE_COLOR_RENDER_QUALITY);
               g2d.setRenderingHint(RenderingHints.KEY_ALPHA_INTERPOLATION, RenderingHints.VALUE_ALPHA_INTERPOLATION_QUALITY);
               g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
               g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER,1.0f));
               
              g2d.setStroke(new BasicStroke(strokeSize));
              
                for (ShapeInfo shape : shapesList) {
                    g2d.setColor(shape.getColor());
                    if (shape.isFilled()) {
                        g2d.fill(shape.getShape());
                    } else {
                        g2d.draw(shape.getShape());
                        
                    }
                }
            }
        };
        
        
        //Background White
        drawingPanel.setBackground(Color.white);
       

        drawingPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                startX = e.getX();
                startY = e.getY();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                endX = e.getX();
                endY = e.getY();
                Shape shape
				
				 // if eraser mode is true
                if (eraserMode) {
                    // Create a small rectangle shape as an eraser
                    int eraserSize = 60;

                    //to be an eraser use white color

                    setSelectedColor(Color.WHITE);



                    shape = new Rectangle(
                            e.getX() - eraserSize / 2,
                            e.getY() - eraserSize / 2,
                            eraserSize,
                            eraserSize
                    );
                    //to fill shape with white color
                    setFilledShape(true);


                } else {

                    shape = createShape(startX, startY, endX, endY, strokeSize);
                }

				// push new changes to our constructor Shapeinfo
				
                shapesList.add(new ShapeInfo(shape, selectedColor, filledShape,strokeSize));

        	    
                drawingPanel.repaint();
                
                
            }
        });

 

        //Create  All	Button
        Font font = new Font( "Serif", Font. BOLD, 20);
        Dimension buttonSize = new Dimension(64, 40);
        
        JButton lineButton = new JButton("╱");
        lineButton.setFont(new Font("Arial", Font.BOLD, 10));
        lineButton.setFont(font);
        lineButton.setPreferredSize(buttonSize);
        lineButton.setBackground(Color.white);
        
        JButton rectangleButton = new JButton("▭");
        rectangleButton.setFont(new Font("Arial", Font.BOLD, 28));
        rectangleButton.setPreferredSize(buttonSize);
        rectangleButton.setBackground(Color.white);
        
        JButton ovalButton = new JButton("○");
        ovalButton.setFont(new Font("Arial", Font.BOLD, 35));
        ovalButton.setPreferredSize(buttonSize);
        ovalButton.setBackground(Color.white);
        
        JButton triangleButton = new JButton("∆");
        triangleButton.setFont(new Font("Arial", Font.BOLD, 35));
        triangleButton.setPreferredSize(buttonSize);
        triangleButton.setBackground(Color.white);
        
         JButton starButton = new JButton("☆");
         starButton.setFont(new Font("", Font.BOLD, 35));
         starButton.setPreferredSize(buttonSize);
         starButton.setBackground(Color.white);
        
        JButton colorRedButton = new JButton("Red");
        colorRedButton.setBackground(Color.red);
        colorRedButton.setForeground(Color.black);
        colorRedButton.setFont(font);
        
        JButton colorBlueButton = new JButton("Blue");
        colorBlueButton.setBackground(Color.blue);
        colorBlueButton.setForeground(Color.black);
        colorBlueButton.setFont(font);
        
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
		
		JButton eraseButton = new JButton("Erase");
        eraseButton.setBackground(Color.CYAN);
        eraseButton.setFont(font);
        
		JButton undoButton = new JButton("↩️ Undo");
		undoButton.setFont(new Font("", Font.BOLD, 16));
  
		JButton saveButton = new JButton("save ⤓");
		Dimension buttonSize2 = new Dimension(115, 35);
		saveButton.setPreferredSize(buttonSize2);
		saveButton.setForeground(Color.white);
		saveButton.setBackground(Color.decode("#FC8E01"));
		saveButton.setFont(new Font("", Font.BOLD, 25));
		saveButton.setBorderPainted(true);
		
		JButton openButton = new JButton("Open↑");
        Dimension open = new Dimension(115, 35);
        openButton.setPreferredSize(open);
        openButton.setForeground(Color.WHITE);
        openButton.setBackground(Color.decode("#FC8E01"));
        openButton.setFont(new Font("", Font.BOLD, 25));
        openButton.setBorderPainted(true);
  
  
//Create a combobox with four options for the stroke size
 JComboBox<Integer> strokeComboBox = new JComboBox<>();
 strokeComboBox.addItem(1);
 strokeComboBox.addItem(2);
 strokeComboBox.addItem(3);
 strokeComboBox.addItem(6);
 strokeComboBox.addItem(8);
 strokeComboBox.addItem(10);
 strokeComboBox.addItem(12);
 strokeComboBox.addItem(14);
 strokeComboBox.addItem(16);
 strokeComboBox.addItem(20);
 strokeComboBox.setFont(font);

 JLabel strokeLabel = new JLabel("Font Size");
 strokeLabel.setHorizontalAlignment(JLabel.CENTER);
 strokeLabel.setVerticalAlignment(JLabel.TOP);
 strokeLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));


 // Add an action listener to the combobox that updates the stroke size variable
 strokeComboBox.addActionListener(e -> {
	   int selected = (int) strokeComboBox.getSelectedItem();
	    strokeSize = selected;
	   
	});  
        
        
        // Undo Button and  Action Undo
        undoAction = e -> {
            ShapeInfo shapeInfo = shapesList.remove(shapesList.size() - 1);
            drawingPanel.repaint();
        };
        undoButton.addActionListener(undoAction);

        
        //Shapes ButtonAction
        lineButton.addActionListener(e -> setSelectedShape("line"));
        rectangleButton.addActionListener(e -> setSelectedShape("rectangle"));
        ovalButton.addActionListener(e -> setSelectedShape("oval"));
        triangleButton.addActionListener(e -> setSelectedShape("triangle"));
        starButton.addActionListener(e -> setSelectedShape("star"));
         
       // Color ButtonAction
        colorRedButton.addActionListener(e -> setSelectedColor(Color.RED));
        colorBlueButton.addActionListener(e -> setSelectedColor(Color.BLUE));
        colorGreenButton.addActionListener(e -> setSelectedColor(Color.GREEN));
        colorBlackButton.addActionListener(e -> setSelectedColor(Color.black));
        colorPinkButton.addActionListener(e -> setSelectedColor(Color.pink));
        
        //Filled CheckBoxAction
        filledCheckBox.addActionListener(e -> setFilledShape(filledCheckBox.isSelected()));
		
		//erase button Action
        eraseButton.addActionListener(e -> setEraserMode(true));
        
        
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
        
        
        // add Button in Panel
        JPanel controlPanel = new JPanel();
        controlPanel.add(lineButton);
        controlPanel.add(rectangleButton);
        controlPanel.add(ovalButton); 
        controlPanel.add(triangleButton);
        controlPanel.add(starButton);
        controlPanel.add(colorRedButton);
        controlPanel.add(colorBlueButton);
        controlPanel.add(colorBlackButton);
        controlPanel.add(colorGreenButton);
        controlPanel.add(colorPinkButton);
		controlPanel.add(eraseButton);
        controlPanel.add(undoButton);
        controlPanel.add(filledCheckBox);
		controlPanel.add(strokeComboBox);
		controlPanel.add(strokeLabel);
		controlPanel.add(openButton);
		controlPanel.add(saveButton);
		
		
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(controlPanel, BorderLayout.NORTH);
        contentPane.add(drawingPanel, BorderLayout.CENTER);

        pack();
    }
    
    private void setFilledShape(boolean fill) {
        filledShape = fill;
        filledCheckBox.setSelected(fill);
    }
	
	private void setEraserMode(boolean enable) {
        eraserMode = enable;
    }
    
    private void setSelectedShape(String shape) {
        selectedShape = shape;
        
    }
	

    private void setSelectedColor(Color color) {
        selectedColor = color;
    }

    private Shape createShape(int startX, int startY, int endX, int endY, int strokeSize) {
        int width = Math.abs(endX - startX);
        int height = Math.abs(endY - startY);

        // Select Shape
        switch (selectedShape) {
            case "rectangle":
                return new Rectangle(
                        Math.min(startX, endX),
                        Math.min(startY, endY),
                        width,
                        height
                        
                );
            case "oval":
                return new Ellipse2D.Double(
                        Math.min(startX, endX),
                        Math.min(startY, endY),
                        width,
                        height
                );
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
                
            case "star":
            	
                Point2D.Double center = new Point2D.Double((startX + endX) / 2, (startY + endY) / 2);
                double radius = Math.min(width, height) / 2;
                double innerRadius = radius / 2;
                int numPoints = 5;
                
                Path2D star = new Path2D.Double();
                for (int i = 0; i < numPoints * 2; i++) {
                    double angle = i * Math.PI / numPoints;
                    double x = center.getX() + (i % 2 == 0 ? radius : innerRadius) * Math.cos(angle);
                    double y = center.getY() + (i % 2 == 0 ? radius : innerRadius) * Math.sin(angle);
                    
                    if (i == 0) {
                        star.moveTo(x, y);
                    } else {
                        star.lineTo(x, y);
                    }
                }
                star.closePath();
                return star;
                
            default:
                return new Line2D.Double(startX, startY, endX, endY);
        }
    }

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

        public void setStrokeSize(int strokeSize) {
			
        	 }
        public int getStrokeSize ( ) {
        	return strokeSize;  }

		public Shape getShape() {
            return shape;   }

        public Color getColor() {
            return color;     }

        public boolean isFilled() {
            return filled;  }
        
    }
    
}
