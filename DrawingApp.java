


import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;






import java.util.ArrayList;


public class DrawingApp extends JFrame {
	private String selectedShape;
    private Color selectedColor;
    private boolean filledShape;
    private int startX, startY, endX, endY;
    private static ArrayList<ShapeInfo> shapesList;
    private int strokeSize;
	
	
	
	
	
	 public DrawingApp() {
		//default values
        selectedShape = "line";
        selectedColor = Color.BLACK;
        filledShape = false;
        shapesList = new ArrayList<>();
		
		
		
		
	strokeSize = 1;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	g2d.setStroke(new BasicStroke(strokeSize));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	drawingPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                startX = e.getX();
                startY = e.getY();
            }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	JButton ovalButton = new JButton("○");
        ovalButton.setFont(new Font("Arial", Font.BOLD, 35));
        ovalButton.setPreferredSize(buttonSize);
        ovalButton.setBackground(Color.white);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	ovalButton.addActionListener(e -> setSelectedShape("oval"));	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	controlPanel.add(ovalButton); 	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	 case "oval":
                return new Ellipse2D.Double(
                        Math.min(startX, endX),
                        Math.min(startY, endY),
                        width,
                        height
                );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	public Color getColor() {
            return color;     }
		
		
		
			
	 }
	 
}