import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, fill, fill etc.
   */
  public void setup() {
    //light blue background
    background(158, 221, 255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
    //top petal
    stroke(240, 89, 229);
    fill(255, 201, 251);
    ellipse (200, 223, 35, 35);  

    //top right petal
    ellipse(225, 245, 35, 35); 

    //top left petal
    ellipse(175, 245, 35, 35); 

    //stem
    stroke(1, 71, 14);
    fill(14, 110, 32);
    rect(199, 280, 2, 90, 1);

    //bottom right petal
    stroke(240, 89, 229);
    fill(255, 201, 251);
    ellipse(215, 275, 35, 35); 

    //bottom left petal
    ellipse(185, 275, 35, 35);

    //center of flower
    stroke(255, 202, 25);
    fill(255, 236, 173);
    ellipse(200, 250, 30, 30);

    //leaf
    line(199, 315, 159, 315);
    
    stroke(1, 71, 14);
    fill(14, 110, 32);
    beginShape();
    curveVertex(199, 315);
    curveVertex(199, 315);
    curveVertex(180, 308);
    curveVertex(159, 315);
    curveVertex(159, 315);
    endShape();

    beginShape();
    curveVertex(199, 315);
    curveVertex(199, 315);
    curveVertex(180, 322);
    curveVertex(159, 315);
    curveVertex(159, 315);
    endShape();

    line(201, 330, 241, 330);
    beginShape();
    curveVertex(201, 330);
    curveVertex(201, 330);
    curveVertex(220, 323);
    curveVertex(241, 330);
    curveVertex(241, 330);
    endShape();

    beginShape();
    curveVertex(201, 330);
    curveVertex(201, 330);
    curveVertex(220, 337);
    curveVertex(241, 330);
    curveVertex(241, 330);
    endShape();
    
    //grass
    fill(210, 255, 173);
    rect(0, 370, 400, 30);

    //sun
    noStroke();
    fill(255, 234, 0);
    ellipse(400, 0, 120, 120);

    //clouds
    stroke(237, 244, 255);
    fill(237, 244, 255);
    ellipse(60, 120, 35, 35);
    ellipse(90, 105, 50, 50);
    ellipse(120, 120, 35, 35);
    rect(60, 125, 60, 12, 5);

    rect(300, 155, 90, 35, 160);
    ellipse(345, 155, 50, 50);
    ellipse(315, 173, 35, 35);
    ellipse(375, 173, 35, 35);
    
    



  }
  
  // define other methods down here.
}