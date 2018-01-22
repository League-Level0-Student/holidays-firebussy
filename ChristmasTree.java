
/*******************************************************************************
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 *    
 ******************************************************************************/

import org.jointheleague.graphical.robot.Robot;


public class ChristmasTree {

	Robot rob  = new Robot();
	
    public static void main(String[] args) {
        ChristmasTree ohChristmasTree = new ChristmasTree();
        ohChristmasTree.drawStar();
        ohChristmasTree.drawTreeBody();
        ohChristmasTree.drawTreeTrunk();
    }


    double treeWidth = 15;
    double scale = 1.1;    //This is how much the width of the tree increases with each layer down


    void drawTreeBody() {
        // 8. Change the color of the line the robot draws to forest green    


        // 1. Make a variable for turnAmount and set it to 175
int turnAmount= 175;

        // 2. Start the Robot facing to the right
rob.miniaturize();
rob.penDown();
rob.setPenWidth(10);
rob.setPenColor(0, 128, 0);
rob.setSpeed(10000);
rob.setAngle(90);

        // 5. Repeat steps 3 through 11, 11 times
for (int i = 0; i < 11; i++) {
	


            // 3. Move the robot the width of the tree
    rob.move((int) treeWidth);
            // 4. Turn the robot the current turnAmount to the right
    rob.turn(turnAmount);
            // 6. Set the treeWidth to the current treeWidth times the scale
    treeWidth=treeWidth*scale;
            // 7. Move the robot the width of a tree again
    rob.move((int) treeWidth);
            // 9. Turn the robot the current turn amount to the LEFT
    rob.turn(-turnAmount);
            // 10. Set the treeWidth to the current treeWidth times the scale again
    treeWidth=treeWidth*scale;
            // 11. Decrease turnAmount by 1
turnAmount--;
}

    }
    
    void drawTreeTrunk() {
        // 1. Move the robot half the width of the tree
    	rob.penUp();
rob.move((int)treeWidth/2);

        // 2. Change the robot so that it is pointing straight down
rob.penDown();
rob.turn(-270);

        // 4. Set the pen width to the tree width divided by 10
rob.setPenWidth((int) (treeWidth/10));

        // 5. Change the color of the line the robot draws to brown
rob.setPenColor(164, 42, 42);

        // 3. Move the robot a quarter the tree width
rob.move((int) (treeWidth/4));
   
    rob.penUp();
    rob.turn(-5);
    rob.move(1/9999999);
    rob.turn(-180);
    rob.move(155);
    rob.penDown();
    for (int i = 0; i < 5; i++) {
	  rob.turn(144);
    rob.move(-50);	
	}
  
     }
    void drawStar() {
        // * Optional: Draw a red star on top of the tree. Hint: 144 degrees makes a star.
    	
    }

    
}

