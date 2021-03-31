import javax.swing.*;
import java.awt.*;

public class DrawableRectangle extends JPanel {

    private Point p;
    private int numberOfMethods;
    private int[] ifPresent;
    private int[] loopPresent;
    private String name;
    private Color color;
    public Point m1, m2, m3, m4;
    public int width, height;
    public int gridNumber;

    public DrawableRectangle(Point p, int numberOfMethods, int[] ifPresent, int[] loopPresent, String name, Color color, int gridNumber) {
        System.out.println("Constructor in ClassRectangleTest " + name);
        this.p = p;
        this.ifPresent = ifPresent;
        this.loopPresent = loopPresent;
        this.numberOfMethods = numberOfMethods;
        this.name = name;
        this.color = color;
        this.gridNumber = gridNumber;
        this.m1 = new Point();
        this.m2 = new Point();
        this.m3 = new Point();
        this.m4 = new Point();
    }

    // Any point p in the grid
    public Point getCoordinates (Point p, int width, int height) {

        if (gridNumber == 1) {
            return p;
        }

        Point point = new Point();
        int multiplyingFactor = gridNumber / 2;
        if (gridNumber % 2 == 0) {
            point.x = width + p.x;
            point.y = (multiplyingFactor - 1) * height + p.y;
        } else {
            point.x = p.x;
            point.y = multiplyingFactor * height + p.y;
        }
        return point;
    }

    public void findMidPoints (int rectWidth, int rectHeight, int panelWidth, int panelHeight, Graphics g) {
        Point p1 = new Point();
        p1.x = this.p.x;
        p1.y = this.p.y;

        Point p2 = new Point();
        p2.x = p1.x + rectWidth;
        p2.y = p1.y;

        Point p3 = new Point();
        p3.x = p1.x + rectWidth;
        p3.y = p1.y + rectHeight;

        Point p4 = new Point();
        p4.x = p1.x;
        p4.y = p1.y + rectHeight;

        // find the midpoints of a rectangle

        Point a1 = new Point(), a2 = new Point(), a3 = new Point(), a4 = new Point();
        a1.x = p1.x + (int) (rectWidth / 2);
        a1.y = p1.y;

        a2.x = p2.x;
        a2.y = p2.y + (int) (rectHeight / 2);

        a3.x = p4.x + (int) (rectWidth / 2);
        a3.y = p4.y;

        a4.x = p1.x;
        a4.y = p1.y + + (int) (rectHeight / 2);

//        System.out.println("Points before transformation - Drawable Rectangle");
//        System.out.println(a1);
//        System.out.println(a2);
//        System.out.println(a3);
//        System.out.println(a4);
//
//        System.out.println("Points after transformation - Drawable Rectangle");

        m1 = getCoordinates(a1, panelWidth, panelHeight);
        m2 = getCoordinates(a2, panelWidth, panelHeight);
        m3 = getCoordinates(a3, panelWidth, panelHeight);
        m4 = getCoordinates(a4, panelWidth, panelHeight);

//        System.out.println(m1);
//        System.out.println(m2);
//        System.out.println(m3);
//        System.out.println(m4);

        // to be removed
        int r = 6;
        g.setColor(Color.black);
        g.fillOval(a1.x, a1.y, r, r);
        g.fillOval(a2.x, a2.y, r, r);
        g.fillOval(a3.x, a3.y, r, r);
        g.fillOval(a4.x, a4.y, r, r);

    }



    public void assignPanelWidthAndHeight (int panelWidth, int panelHeight) {
        this.width = panelWidth;
        this.height = panelHeight;
    }

    @Override
    public void paintComponent(Graphics g) {
//        super.paintComponent(g);

        System.out.println("IN PAINT COMPONENT DRAWABLE RECTANGLE " + this.name);
        int panelWidth = getWidth();
        int panelHeight = getHeight();
        //assignPanelWidthAndHeight(panelWidth, panelHeight);

//        System.out.println("Panel Height of class " + name + " : "  + panelHeight);
//        System.out.println("Panel Width of class " + name + " : "  + panelWidth);

        int classRectHeight = (int) (0.8 * panelHeight);
        int classRectWidth = (int) (0.6 * panelWidth);



        int methodClassTopPadding = (int) (0.15 * classRectHeight);
        int methodClassLeftPadding = (int) (0.1 * classRectWidth);
        int methodClassRightPadding = (int) (0.1 * classRectWidth);

        int methodHeightPlusMethodMethodPadding = numberOfMethods > 0
                ? (int) ((0.85 * classRectHeight) / numberOfMethods)
                : 0;
        int methodMethodPadding = (int) (0.2 * methodHeightPlusMethodMethodPadding);
        int methodHeight = (int) (0.8 * methodHeightPlusMethodMethodPadding);

        int methodWidth = classRectWidth - methodClassLeftPadding - methodClassRightPadding;

        int methodLoopTopPadding = (int) (0.3 * methodHeight);
        int methodLoopLeftPadding = (int) (0.05 * methodWidth);
        int loopRadius = methodHeight > methodWidth ? (int) (0.45 * methodWidth) : (int) (0.45 * methodHeight);

        int methodIfTopPadding = (int) (0.3 * methodHeight);
        int methodIfBottomPadding = (int) (0.3 * methodHeight);
        int methodIfRightPadding = methodHeight > methodWidth ? (int) (0.3 * methodWidth) : (int) (0.18 * methodWidth);
        int methodIfBaseRightPadding = (int) (0.05 * methodWidth);
        int ifBaseLength = methodHeight > methodWidth ? (int) (0.45 * methodWidth) : (int) (0.25 * methodWidth);

        int classNameLeftPadding = (int) (0.25 * methodClassTopPadding);
        int classNameTopPadding = (int) (0.6 * methodClassTopPadding);
        int fontSize = (int) (0.3 * methodClassTopPadding);


//        int classRectHeight = methodClassTopPadding
//                + (methodHeight * numberOfMethods)
//                + (methodMethodPadding * numberOfMethods)
//                + methodClassBottomPadding;

        // Class Rectangle
//        g.setColor(color);
//        g.fillRect(0,0, panelWidth, panelHeight);
        g.setColor(new Color(171, 196, 247));
        g.fillRect(p.x, p.y, classRectWidth, classRectHeight);
        g.setColor(Color.black);
        g.setFont(new Font("Courier New", Font.PLAIN, fontSize));
        g.drawString(name, p.x + classNameLeftPadding, p.y + classNameTopPadding);

//
//
        for (int i = 0; i < numberOfMethods; i++) {

            // Method Rectangles
            g.setColor(new Color(233, 237, 245));
            g.fillRect(p.x + methodClassLeftPadding,
                    p.y + methodClassTopPadding + (i * (methodHeight + methodMethodPadding)),
                    methodWidth, methodHeight);
//
//            // If Triangles
            if (ifPresent[i] == 1) {
                int x1 = p.x + methodClassLeftPadding + methodWidth - methodIfRightPadding;
                int y1 = p.y + methodClassTopPadding + methodIfTopPadding;
                int x2 = p.x + methodClassLeftPadding + methodWidth - methodIfBaseRightPadding - ifBaseLength;
                int y2 = p.y + methodClassTopPadding + methodHeight - methodIfBottomPadding;
                int x3 = p.x + methodClassLeftPadding + methodWidth - methodIfBaseRightPadding;
                int y3 = p.y + methodClassTopPadding + methodHeight - methodIfBottomPadding;

                g.setColor(new Color(83, 163, 59));
                g.fillPolygon(new int[] {x1, x2, x3}, new int[] {y1 + (i * (methodMethodPadding + methodHeight)) ,
                        y2 + (i * (methodMethodPadding + methodHeight)) ,
                        y3 + (i * (methodMethodPadding + methodHeight))}, 3);
            }
//
            // Loop Circles
            if (loopPresent[i] == 1) {
                g.setColor(new Color(247, 196, 54));
                g.fillOval(p.x + methodClassLeftPadding + methodLoopLeftPadding,
                        p.y + methodClassTopPadding + (i * (methodMethodPadding + methodHeight)) + methodLoopTopPadding,
                        loopRadius, loopRadius);
            }
        }
        findMidPoints(classRectWidth, classRectHeight, panelWidth, panelHeight, g);

//        Point start = new Point(308, 60);
//        Point end = new Point(700, 30);
//        ClassEdgesTest edge = new ClassEdgesTest(start, end, 1);
//        edge.drawEdges(g);
    }

    public void drawRectangle(Graphics g) {
        System.out.println("I am being called");
//        int classRectWidth = 170;
//        int methodClassTopPadding = 50;
//        int methodClassLeftPadding = 10;
//        int methodClassRightPadding = 10;
//        int methodClassBottomPadding = 10;
//        int methodMethodPadding = 10;
//        int methodHeight = 60;
//        int methodWidth = classRectWidth - methodClassLeftPadding - methodClassRightPadding;
//
//        int methodLoopTopPadding = 15;
//        int methodLoopLeftPadding = 20;
//        int loopRadius = 30;
//
//        int methodIfTopPadding = 15;
//        int methodIfBottomPadding = 15;
//        int methodIfRightPadding = 30;
//        int methodIfBaseRightPadding = 15;
//        int ifBaseLength = 30;
//
//        int classNameLeftPadding = 15;
//        int classNameTopPadding = 30;
//        int fontSize = 18;
//
//
//        int classRectHeight = methodClassTopPadding
//                + (methodHeight * numberOfMethods)
//                + (methodMethodPadding * numberOfMethods)
//                + methodClassBottomPadding;
//
//        // Class Rectangle
//        g.setColor(new Color(171, 196, 247));
//        g.fillRect(p.x, p.y, classRectWidth, classRectHeight);
//        g.setColor(Color.black);
//        g.setFont(new Font("Courier New", Font.PLAIN, fontSize));
//        g.drawString(name, p.x + classNameLeftPadding, p.y + classNameTopPadding);
//
//
//        for (int i = 0; i < numberOfMethods; i++) {
//
//            // Method Rectangles
//            g.setColor(new Color(233, 237, 245));
//            g.fillRect(p.x + methodClassLeftPadding,
//                    p.y + methodClassTopPadding + (i * (methodHeight + methodMethodPadding)),
//                    methodWidth, methodHeight);
//
//            // If Triangles
//            if (ifPresent[i] == 1) {
//                int x1 = p.x + methodClassLeftPadding + methodWidth - methodIfRightPadding;
//                int y1 = p.y + methodClassTopPadding + methodIfTopPadding;
//                int x2 = p.x + methodClassLeftPadding + methodWidth - methodIfBaseRightPadding - ifBaseLength;
//                int y2 = p.y + methodClassTopPadding + methodHeight - methodIfBottomPadding;
//                int x3 = p.x + methodClassLeftPadding + methodWidth - methodIfBaseRightPadding;
//                int y3 = p.y + methodClassTopPadding + methodHeight - methodIfBottomPadding;
//
//                g.setColor(new Color(83, 163, 59));
//                g.fillPolygon(new int[] {x1, x2, x3}, new int[] {y1 + (i * (methodMethodPadding + methodHeight)) ,
//                        y2 + (i * (methodMethodPadding + methodHeight)) ,
//                        y3 + (i * (methodMethodPadding + methodHeight))}, 3);
//            }
//
//            // Loop Circles
//            if (loopPresent[i] == 1) {
//                g.setColor(new Color(247, 196, 54));
//                g.fillOval(p.x + methodClassLeftPadding + methodLoopLeftPadding,
//                        p.y + methodClassTopPadding + (i * (methodMethodPadding + methodHeight)) + methodLoopTopPadding,
//                        loopRadius, loopRadius);
//            }
//        }
    }
}
