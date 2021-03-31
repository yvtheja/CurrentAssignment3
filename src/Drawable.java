import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Drawable extends JPanel {

    private List<DrawableRectangle> classRectangles;
    public Drawable(List<ClassNode> nodes) {


        int nodesSize = nodes.size();
        int m = nodesSize % 2 == 0 ? nodesSize / 2 : (nodesSize / 2 + 1);
        System.out.println("Layout size  = ( " + m + ", " + 2 + ")");
        setLayout(new GridLayout(m, 2));

        classRectangles = new ArrayList<>();
        Point p1 = new Point(10, 10);
        Color[] colors = new Color[]{Color.CYAN, Color.blue, Color.DARK_GRAY, Color.GREEN, Color.RED, Color.yellow, Color.MAGENTA, Color.gray, Color.black, Color.PINK};


        for (int i = 0; i < nodes.size(); i ++) {
            System.out.println("Print i = " + i);
            ClassNode node = nodes.get(i);
            JPanel rect = new DrawableRectangle(p1, node.getNumberOfMethods(), node.getIfPresent(), node.getLoopPresent(), node.getClassName(), colors[i], (i+1));
//            ((ClassRectangleTest) rect).drawRectangle();
            classRectangles.add((DrawableRectangle) rect);
            add(rect);
        }
        //setLayout(new FlowLayout());
    }


//    public Point getCoordinates (Point p, int gridNumber, int panelWidth, int panelHeight) {
//
//        if (gridNumber == 1) {
//            return p;
//        }
//
//        Point point = new Point();
//        int multiplyingFactor = gridNumber / 2;
//        if (gridNumber % 2 == 0) {
//            point.x = panelWidth + p.x;
//            point.y = (multiplyingFactor - 1) * panelHeight + p.y;
//        } else {
//            point.x = p.x;
//            point.y = multiplyingFactor * panelHeight + p.y;
//        }
//        return point;
//    }

//    public void drawEdges(Graphics g) {
//
//
//        System.out.println("In Draw Edges");
//
//        DrawableRectangle rectA = nodes.get(0);
//        DrawableRectangle rectB = nodes.get(1);
//
//        Point start = getCoordinates(rectA.m2, rectA.gridNumber, rectA.width, rectA.height);
//        Point end = getCoordinates(rectB.m4, rectB.gridNumber, rectB.width, rectB.height);
//        ClassEdgesTest edge = new ClassEdgesTest(start, end, 1);
//        edge.drawEdges(g);
//
//        Point start1 = new Point(190, 60);
//        Point end1 = new Point(300, 30);
//        ClassEdgesTest edge1 = new ClassEdgesTest(start1, end1, 1);
//        edge1.drawEdges(g);
//
//        Point start6 = new Point(190, 300);
//        Point end6 = new Point(300, 340);
//        ClassEdgesTest edge6 = new ClassEdgesTest(start6, end6, 0);
//        edge6.drawEdges(g);
//
//        Point start5 = new Point(190, 290);
//        Point end5 = new Point(300, 290);
//        ClassEdgesTest edge5 = new ClassEdgesTest(start5, end5, 0);
//        edge5.drawEdges(g);
//
//    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        System.out.println("IN PAINT COMPONENT _ DRAWABLE");



        if (classRectangles.size() > 0) {
            DrawableRectangle rectA = classRectangles.get(0);
            DrawableRectangle rectB = classRectangles.get(1);

            Point start2 = rectA.m2;
            Point end2 = rectB.m4;
//
//            System.out.println("Points that are getting plotted in Drawable");
//            System.out.println("Rect A: (" + start2.x + " ," + start2.y + ")");
//            System.out.println("Rect B: (" + end2.x + " ," + end2.y + ")");

//        Point start2 = new Point(300, 100);
//        Point end2 = new Point(300, 100);
            DrawEdges edge2 = new DrawEdges(start2, end2, 1);
            edge2.drawEdges(g);

//            DrawableRectangle rectC = classRectangles.get(2);
//
//            Point start3 = rectA.m3;
//            Point end3 = rectC.m1;

//            System.out.println("Rect C: (" + start3.x + " ," + start3.y + ")");
//            System.out.println("Rect D: (" + end3.x + " ," + end3.y + ")");

//        Point start2 = new Point(300, 100);
//        Point end2 = new Point(300, 100);
//            DrawEdges edge3 = new DrawEdges(start3, end3, 1);
//            edge3.drawEdges(g);
        }



//        Point start3 = new Point(190, 150);
//        Point end3 = new Point(300, 200);
//        DrawEdges edge3 = new DrawEdges(start3, end3, 1);
//        edge3.drawEdges(g);
//
//        Point start4 = new Point(190, 270);
//        Point end4 = new Point(300, 220);
//        DrawEdges edge4 = new DrawEdges(start4, end4, 0);
//        edge4.drawEdges(g);


//
//        Point start5 = new Point(190, 290);
//        Point end5 = new Point(300, 290);
//        ClassEdgesTest edge5 = new ClassEdgesTest(start5, end5, 0);
//        edge5.drawEdges(g);
//


    }
    }



