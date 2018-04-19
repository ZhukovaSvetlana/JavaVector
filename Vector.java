public class Vector {
    private double x,y,z;

    public Vector(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }


    public  Vector add(Vector vector2){

        return new Vector(this.x + vector2.x, this.y + vector2.y, this.z + vector2.z);
    }

    public Vector subtract(Vector vector2){

        return new Vector(this.x - vector2.x, this.y - vector2.y, this.z - vector2.z);
    }

    public double scalarToMultiply(Vector vector2){
        return new Double(this.x*vector2.x + this.y*vector2.y + this.z*vector2.z);
    }

    public double findToLengthOfVector(){
        return new Double(Math.sqrt(this.x*this.x + this.y*this.y + this.z*this.z));
    }

    public String toString(){
        return "(" + x + "; " + y + "; "  + z + ")";

    }
}
