import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main extends JFrame {


    public List<ClassNode> generateNodes() {
        List<ClassNode> nodes = new ArrayList<>();
//        int[] ifPresent = new int[]{1};
//        int[] loopPresent = new int[]{1};
//        ClassNode classA = new ClassNode("Class A", 1, ifPresent, loopPresent);
//        nodes.add(classA);

        int[] ifPresent2 = new int[]{1, 1, 1, 0, 0};
        int[] loopPresent2 = new int[]{1, 1, 0, 1, 0};
        ClassNode classB = new ClassNode("Class B", 5, ifPresent2, loopPresent2);
        nodes.add(classB);

        int[] ifPresent3 = new int[]{1, 0, 1, 0};
        int[] loopPresent3 = new int[]{1, 1, 0, 0};
        ClassNode classC = new ClassNode("Class C", 4, ifPresent3, loopPresent3);
        nodes.add(classC);
//
//        int[] ifPresent4 = new int[]{1, 0, 0};
//        int[] loopPresent4 = new int[]{1, 1, 0};
//        ClassNode classD = new ClassNode("Class D", 3, ifPresent4, loopPresent4);
//        nodes.add(classD);
//
//        int[] ifPresent5 = new int[]{1, 0};
//        int[] loopPresent5 = new int[]{1, 1};
//        ClassNode classE = new ClassNode("Class E", 2, ifPresent5, loopPresent5);
//        nodes.add(classE);
//
//        int[] ifPresent6 = new int[]{1, 1, 1, 0, 0, 1};
//        int[] loopPresent6 = new int[]{1, 1, 0, 1, 0, 1};
//        ClassNode classF = new ClassNode("Class F", 6, ifPresent6, loopPresent6);
//        nodes.add(classF);
//
//        int[] ifPresent7 = new int[]{1, 1, 1, 0, 0};
//        int[] loopPresent7 = new int[]{1, 1, 0, 1, 0};
//        ClassNode classG = new ClassNode("Class G", 5, ifPresent7, loopPresent7);
//        nodes.add(classG);
//
//        int[] ifPresent8 = new int[]{1, 0};
//        int[] loopPresent8 = new int[]{1, 1};
//        ClassNode classH = new ClassNode("Class H", 2, ifPresent8, loopPresent8);
//        nodes.add(classH);
//
//        int[] ifPresent9 = new int[]{1, 1, 1, 0, 0, 1};
//        int[] loopPresent9 = new int[]{1, 1, 0, 1, 0, 1};
//        ClassNode classI = new ClassNode("Class I", 6, ifPresent9, loopPresent9);
//        nodes.add(classI);
//
//        int[] ifPresent10 = new int[]{1, 1, 1, 0, 0};
//        int[] loopPresent10 = new int[]{1, 1, 0, 1, 0};
//        ClassNode classJ = new ClassNode("Class J", 5, ifPresent10, loopPresent10);
//        nodes.add(classJ);

        return nodes;
    }

//    public Main() {
//
//        List<ClassNode> nodes = generateNodes();
//
//        JPanel panel = new Drawable(nodes);
//
//        List<DrawableRectangle> classRectangles = new ArrayList<>();
//        Point p1 = new Point(10, 10);
//        Color[] colors = new Color[]{Color.CYAN, Color.blue, Color.DARK_GRAY, Color.GREEN, Color.RED, Color.yellow, Color.MAGENTA, Color.gray, Color.black, Color.PINK};
//
//        for (int i = 0; i < nodes.size(); i ++) {
//            System.out.println("Print i = " + i);
//            ClassNode node = nodes.get(i);
//            JPanel rect = new DrawableRectangle(p1, node.getNumberOfMethods(), node.getIfPresent(), node.getLoopPresent(), node.getClassName(), colors[i], (i+1));
////            ((ClassRectangleTest) rect).drawRectangle();
//            classRectangles.add((DrawableRectangle) rect);
//            panel.add(rect);
//
//        }
//
//
//
//
//        add(panel);
//        panel.repaint();
//        panel.revalidate();
//
//        pack();
//
//    }

    public Main() {

        List<ClassNode> nodes = generateNodes();

        Drawable panel = new Drawable(nodes);

        add(panel);

//        panel.repaint();
//        panel.revalidate();

        pack();

    }

    public static void main (String[] args) {

        JFrame frame = new Main();

        frame.setSize(1000, 1000);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
//        frame.pack();
    }
}
