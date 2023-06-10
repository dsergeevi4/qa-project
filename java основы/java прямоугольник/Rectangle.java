public class Rectangle {
    private int x1, x2;
    private int y1, y2;

  public int getHeight() {
    return y1-x1;
  }
    
  public int getWidth() {
    return x2-x1;
  }

  public int getArea() {
    return (y1-x1) * (x2-x1);
  }

  public int getPerimeter() {
    return 2 * ((y1-x1) + (x2-x1));
  }
 
    public Rectangle(int x1, int x2, int y1, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }
 
    public Rectangle(int height, int width) {
        this.x1 = 0;
        this.y1 = 0;
        this.x2 = width;
        this.y2 = height;
    }
 
    public Rectangle() {
        this.x1 = 0;
        this.x2 = 0;
        this.y1 = 0;
        this.y2 = 0;
    }
 
    public int[] rect_print() {
        System.out.println(this.x1 + "  " + this.x2 + "  " + this.y1 + "  " + this.y2);
 
        int[] result = new int[4];
        result[0] = this.x1;
        result[1] = this.x2;
        result[2] = this.y1;
        result[3] = this.y2;
        if (this.x2-this.x1!=this.y1-this.x1)
        System.out.println( "прямоугольник не являтся квадратом");
         if (this.x2-this.x1==this.y1-this.x1)
          System.out.println( "прямоугольник  являтся квадратом");
 
        return result;
    }
 
    public void move(int dx, int dy) {
        this.x1 += dx;
        this.x2 += dx;
        this.y1 += dy;
        this.y2 += dy;
    }
    
    
}