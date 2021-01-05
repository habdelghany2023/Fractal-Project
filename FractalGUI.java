package fractal;

import java.awt.Color;
import java.awt.image.BufferedImage;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;

@SuppressWarnings("serial")
class FractalGUI extends JFrame {

  // Window size. Reduce if it doesn't fit your screen
  private static final int winw = 650;
  private static final int winh = 650;
  private JButton javaxButton1;
  private JButton javaxButton2;
  private JButton javaxButton3;
  private JButton javaxButton4;
  private JButton javaxButton5;
  private JButton javaxButton6;
  private JSlider javaxSlider1;
  private BufferedImage image = new BufferedImage(winw, winh, BufferedImage.TYPE_INT_RGB);
  private JPanel  javaxPanel1;
  private Fractal fractal;

  public FractalGUI() {

    javaxButton1 = new JButton();
    javaxButton2 = new JButton();
    javaxButton3 = new JButton();
    javaxButton4 = new JButton();
    javaxButton5 = new JButton();
    javaxButton6 = new JButton();        
    javaxSlider1 = new JSlider();
    final JLabel javaxLabel1 = new JLabel();
    javaxPanel1 = new JPanel();

    javaxButton1.setText("Koch Curve");
    javaxButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        javaxButtonActionPerformed(evt);
      }
    });

    javaxButton2.setText("Snowflake");
    javaxButton2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        javaxButtonActionPerformed(evt);
      }
    });


    javaxButton3.setText("Tree");
    javaxButton3.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        javaxButtonActionPerformed(evt);
      }
    });  

    javaxButton4.setText("Sp Triangle");
    javaxButton4.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        javaxButtonActionPerformed(evt);
      }
    });        

    javaxButton5.setText("Sp Carpet");
    javaxButton5.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        javaxButtonActionPerformed(evt);
      }
    });         

    javaxButton6.setText("My Fractal");
    javaxButton6.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        javaxButtonActionPerformed(evt);
      }
    }); 

    javaxSlider1.setMajorTickSpacing(1);
    javaxSlider1.setMaximum(6);
    javaxSlider1.setMinimum(0);
    javaxSlider1.setMinorTickSpacing(1);
    javaxSlider1.setPaintTicks(true);
    javaxSlider1.setSnapToTicks(true);
    javaxSlider1.createStandardLabels(1);
    javaxSlider1.setPaintLabels(true);
    javaxSlider1.setValue(0);
    javaxSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
      public void stateChanged(javax.swing.event.ChangeEvent evt) {
        javaxSlider1StateChanged(evt);
      }
    });


    javaxLabel1.setText("Recursion Level");

    javaxPanel1.setBackground(Color.black);
    javaxPanel1.setPreferredSize(new java.awt.Dimension(winw, winh));

    javax.swing.GroupLayout javaxPanel1Layout = new javax.swing.GroupLayout(javaxPanel1);
    javaxPanel1.setLayout(javaxPanel1Layout);
    javaxPanel1Layout.setHorizontalGroup(
        javaxPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, winw, Short.MAX_VALUE)
    );
    javaxPanel1Layout.setVerticalGroup(
        javaxPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGap(0, winh, Short.MAX_VALUE)
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(javaxPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 
                              javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(javaxLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(javaxSlider1, javax.swing.GroupLayout.DEFAULT_SIZE, 
                                      javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(javaxButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(javaxButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(javaxButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(javaxButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(javaxButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(javaxButton6))))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(javaxButton1)
                .addComponent(javaxButton2)
                .addComponent(javaxButton3)
                .addComponent(javaxButton4)
                .addComponent(javaxButton5)                    
                .addComponent(javaxButton6))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(javaxLabel1)
                .addComponent(javaxSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, 
                              javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addComponent(javaxPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 
                          javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
    );

    pack();
    fractal = new Fractal();
    fractal.setGraphics(image.getGraphics(), winw, winh);
  }
  
  public void initdraw() {
    javaxButton1.doClick();
  }
  
  public void redraw() {
    fractal.draw();
    javaxPanel1.getGraphics().drawImage(image, 0, 0, null);
    // enable the section below to save the image to a PNG file
    /*try {
            File file = new File("output.png");
            ImageIO.write(image, "png", file);
          } catch(Exception e) {}*/
  }
  
  private void javaxButtonActionPerformed(java.awt.event.ActionEvent evt) {
    fractal.setFractalType(evt.getActionCommand());
    redraw();
  }
  
  private void javaxSlider1StateChanged(javax.swing.event.ChangeEvent evt) {
    fractal.setMaxRecursion(javaxSlider1.getValue());
    redraw();
  }
  
  public static void main(String[] args) {
    // initialization code to set up Jframe
    FractalGUI gui = new FractalGUI();

    gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    gui.setTitle("Fun with Fractals");
    gui.setLocationRelativeTo(null);
    gui.setVisible(true);
    gui.initdraw();
  }    
}
