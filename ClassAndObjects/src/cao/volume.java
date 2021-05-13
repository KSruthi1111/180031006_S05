

package cao;

public class volume {
    double h,w,d;

     volume(double width,double height,double depth)
    {
        h=height;
        w=width;
        d=depth;
    }
    double volu()
    { double v;
    v=h*w*d;
    return v;
    }
   
    public static void main(String[] args) {
       
    volume bc = new volume(8.5,80.3,9.6);
    System.out.println(bc.volu());

    }

}