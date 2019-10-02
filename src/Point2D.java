public class Point2D {
    private  float x,y;

    public Point2D() {
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
        this.x=x;
        this.y = y;
    }
    public float[] getXY(){
        float [] arry = new float[2];
        arry[0] =getX();
        arry [1] =getY();
        return arry;
    }
    @Override
    public String toString(){
                return "Point2D :x" +getX()+"\n"
                +" y :"+getY();



    }
}
