

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
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
       //Shapes ButtonAction
        lineButton.addActionListener(e -> setSelectedShape("line"));		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
       // add Button in Panel
        JPanel controlPanel = new JPanel();
        controlPanel.add(lineButton);		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
       Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(controlPanel, BorderLayout.NORTH);
        contentPane.add(drawingPanel, BorderLayout.CENTER);

        pack();
    }				
		
		
		
		
		
		
	   private void setSelectedShape(String shape) {
        selectedShape = shape;
        
    }	
		
		
		
		
		
		
  private Shape createShape(int startX, int startY, int endX, int endY, int strokeSize) {
        int width = Math.abs(endX - startX);
        int height = Math.abs(endY - startY);		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
           default:
                return new Line2D.Double(startX, startY, endX, endY);
        }
    }

						

	
		
		
		
		
		
		
		
		
	     private Shape shape;	
		
		
		
		
		
          this.shape = shape;		
		
		
		
		
		
		
		
		
		
		
		public Shape getShape() {
            return shape;   }
		
		
		
		
		
		
			
	 }
	 
}