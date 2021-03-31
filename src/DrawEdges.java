import java.awt.*;

public class DrawEdges {

    private Point start, end;
    private int type;

    public DrawEdges(Point start, Point end, int type) {
        this.start = start;
        this.end = end;
        this.type = type;
    }

    public void drawEdges(Graphics g) {

        g.setColor(Color.CYAN);
        g.fillOval(start.x + 5, start.y, 5, 5);
        g.fillOval(end.x + 5, end.y, 5, 5);

        int dx = end.x - start.x, dy = end.y - start.y;
        // Straight diamonds
        // double theta1 = Math.toRadians(Math.atan2((end.y - start.y), (end.x - start.x)));

        double theta1 = Math.atan2(dy, dx);

        // diamond shape
        double diamondWidth = 30, diamondSize = 15, theta2 = Math.toRadians(45);
        double x4 = start.x + diamondWidth * Math.cos(theta1);
        double y4 = start.y + diamondWidth * Math.sin(theta1);

        double hypotenuse = Math.sqrt(2 * diamondSize * diamondSize);
        double x2 = start.x + hypotenuse * Math.cos(theta1 + theta2);
        double y2 = start.y + hypotenuse * Math.sin(theta1 + theta2);
        double x3 = start.x + hypotenuse * Math.cos(theta1 - theta2);
        double y3 = start.y + hypotenuse * Math.sin(theta1 - theta2);


        // Arrow Head
        int d = 10, h = 10;

        double D = Math.sqrt(dx*dx + dy*dy);
        double x5 = D - d, x6 = x5, y5 = h, y6 = -h, x;
        double sine = dy / D, cosine = dx / D;

        x = start.x + x5 * cosine - y5 * sine;
        y5 = start.y + x5 * sine + y5 * cosine;
        x5 = x;

        x = start.x + x6 * cosine - y6 * sine;
        y6 = start.y + x6 * sine + y6 * cosine;
        x6 = x;
        g.setColor(Color.BLACK);

        // aggregation
        if (type == 1) {

            // draw diamond
            g.drawLine(start.x, start.y, (int) x2, (int) y2);
            g.drawLine((int) x2, (int) y2, (int) x4, (int) y4);
            g.drawLine((int) x4, (int) y4, (int) x3, (int) y3);
            g.drawLine(start.x, start.y, (int) x3, (int) y3);

            // draw line
            g.drawLine((int) x4, (int) y4, end.x, end.y);

            // draw arrow head
            g.drawLine(end.x, end.y, (int) x5, (int) y5);
            g.drawLine(end.x, end.y, (int) x6, (int) y6);

        }

        // association
        if (type == 0) {
            // draw line
            g.drawLine(start.x, start.y, end.x, end.y);

            // draw arrow head
            g.drawLine(end.x, end.y, (int) x5, (int) y5);
            g.drawLine(end.x, end.y, (int) x6, (int) y6);
        }
    }


}
