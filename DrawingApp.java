







import java.awt.geom.Path2D;
import java.awt.geom.Point2D;






public class DrawingApp extends JFrame {
	
	
	
	
	
	
    private ActionListener undoAction;
	
	
	
	 public DrawingApp() {
		



		
		
		filledCheckBox = new JCheckBox("Fill Shape");
        filledCheckBox.setFont(new Font("Times New Roman", Font.BOLD, 18));
        filledCheckBox.setBackground(Color.decode("#80C583"));
        filledCheckBox.setBorderPainted(true);
		
		
		//Frame settings
        setTitle("Drawing App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(1400, 770));		
		
		
		
		
		
		
		
		
				//Improve graphic quality
               g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);   
               g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
               g2d.setRenderingHint(RenderingHints.KEY_COLOR_RENDERING, RenderingHints.VALUE_COLOR_RENDER_QUALITY);
               g2d.setRenderingHint(RenderingHints.KEY_ALPHA_INTERPOLATION, RenderingHints.VALUE_ALPHA_INTERPOLATION_QUALITY);
               g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
               g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER,1.0f));	
		
		
		
		
		
			if (shape.isFilled()) {
                        g2d.fill(shape.getShape());	
			} else {
                        g2d.draw(shape.getShape());
                        
                    }
                }
            }
        };
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	JButton starButton = new JButton("☆");
         starButton.setFont(new Font("", Font.BOLD, 35));
         starButton.setPreferredSize(buttonSize);
         starButton.setBackground(Color.white);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	JButton undoButton = new JButton("↩️ Undo");
  undoButton.setFont(new Font("", Font.BOLD, 16));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
 // Undo & Redo Button and  Action Undo & Redo 
        undoAction = e -> {
            ShapeInfo shapeInfo = shapesList.remove(shapesList.size() - 1);
            drawingPanel.repaint();
        };
        undoButton.addActionListener(undoAction);
		
		
		
		
		
		
		
		
	        starButton.addActionListener(e -> setSelectedShape("star"));	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	controlPanel.add(starButton);	
		
		
		
		
controlPanel.add(undoButton);		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	private void setFilledShape(boolean fill) {
        filledShape = fill;
        filledCheckBox.setSelected(fill);
       }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
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
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	 }
	 
}