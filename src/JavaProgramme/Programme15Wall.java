package JavaProgramme;

public class Programme15Wall {
    //instance variables
    double width;
    double height;

    //First constructor , No argument constructor
    public Programme15Wall() {
        this.width = 0.0;
        this.height = 0.0;
    }

    //second constructor with parameters
    public Programme15Wall(double width, double height) {
        if (width < 0) {
            this.width = 0.0;
        } else {
            this.width = width;
        }
        if (height < 0) {
            this.height = 0.0;
        } else {
            this.height = height;
        }
    }

    //method to get width
    public double getWidth() {
        return width;
    }

    //method to get height
    public double getHeight() {
        return height;
    }

    //method to set width
    public void setWidth(double width1) {
        if (width1 < 0) {
            this.width = 0.0;
        } else {
            this.width = width1;
        }
    }

    //method to set height
    public void setHeight(double height1) {
        if (height1 < 0) {
            this.height = 0.0;
        } else {
            this.height = height1;
        }
    }

    //calculate Area of wall
    public double getArea() {
        return width * height;
    }


    public static void main(String[] args) {
        Programme15Wall wall = new Programme15Wall(5, 4);
        System.out.println("area = " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width = " + wall.getWidth());
        System.out.println("Height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }
}

