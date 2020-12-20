public class Circle extends Shape {

    double radius;
    public Circle(String color,double radius){
        super(color);
        this.radius=radius;
    }

    public double getArea(){

        return Math.PI * Math.pow(radius,2);
    }

    String draw(){

        return "A" +color+ "circle with a radius" +radius+ "is drawn";
    }
}

