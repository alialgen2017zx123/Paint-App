

import java.awt.*;




import java.awt.geom.Line2D;








public class DrawingApp extends JFrame {
	
	
	
	
	
	
	
	
	
	
	
	 public DrawingApp() {
		



		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


               for (ShapeInfo shape : shapesList) {
                    g2d.setColor(shape.getColor());		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
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


		
		
		
		
		
		

			

	 }
	 
}