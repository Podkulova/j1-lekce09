package cz.czechitas.lekce09.api;

import java.awt.Point;
import java.util.List;

public class UlozenaPlocha {

    private Point meat;
    private Point cheese;
    private Point mouse;
    private Point cat;

    private List<Point> trees;

    public Point getMeat() {
        return meat;
    }

    public void setMeat(Point meat) {
        this.meat = meat;
    }

    public Point getCheese() {
        return cheese;
    }

    public void setCheese(Point cheese) {
        this.cheese = cheese;
    }

    public List<Point> getTrees() {
        return trees;
    }

    public void setTrees(List<Point> trees) {
        this.trees = trees;
    }

    public Point getMouse() {
        return mouse;
    }

    public void setMouse(Point mouse) {
        this.mouse = mouse;
    }

    public Point getCat() {
        return cat;
    }

    public void setCat(Point cat) {
        this.cat = cat;
    }
}
