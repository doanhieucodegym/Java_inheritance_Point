public class Main {
    public static void main(String[] args) {
        //ham khơi  tao  không  tham só
        Point2D point2d =new Point2D();
        System.out.println(point2d);
        //ham  khỏi tạo hai tham sô
        point2d = new Point2D(2.5f,5f);
        System.out.println(point2d);


        //đa hình vì  biến  có  thể  gọi  đến đối tượng  lớp con
        Point2D point3d=new Point3D();
        System.out.println(point3d);

        //goi  lóp  con, contru cos1 tham sô z
         point3d =new Point3D(3f);
        System.out.println(point3d);

        point3d =new Point3D(2.5f,6f,8.5f);
        System.out.println(point3d);
        //cho ta thấy kế  thừa đa  hình và ovredding

    }
}
