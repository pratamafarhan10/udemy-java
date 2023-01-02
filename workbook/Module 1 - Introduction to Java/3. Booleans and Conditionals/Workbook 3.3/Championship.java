public class Championship {
    public static void main(String[] args) {

        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).  

        int gryffindor = 400;    //gryffindor points
        int ravenclaw = 200;    //ravenclaw points

        // int margin = amount of points by which gryffindor scored over ravenclaw;
        if (gryffindor - ravenclaw >= 300) {
            System.out.println("Gryffindor win the championship");
        }else if (gryffindor - ravenclaw >= 0) {
            System.out.println("Gryffindor 2nd");
        }else if (gryffindor - ravenclaw >= -100) {
            System.out.println("Gryffindor 3rd");
        }else {
            System.out.println("Gryffindor 4th");
        }
    }
}
