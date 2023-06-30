public class arrys {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50};
//        float b [] = {22.9f, 55.9f,60,90,50};
        // System.out.println("printing using naive way");
//        System.out.println(a[4]);
//        System.out.println(a.length);
//        System.out.println(b[1]);
//        System.out.println(b.length);
//        String  c[] = {"alpha", "beta", "gamma"};
//        System.out.println(c.length);
//        System.out.println(c[2]);

        //displaying the array for loop
//        System.out.println("printing using for loop");
//        for (int i=0; i<a.length; i++){
//            System.out.println(a[i]);
//
//        }
//displaying the array in reverse order for for loop
//        System.out.println("printing array in reverse order");
//        for (int i = a.length-1; i>=0; i--){
//            System.out.println(a[i]);
//
//        }
        //displaying the array for each loop

        System.out.println("using for each loop ");
        for (int element : a) {
            System.out.println(element);
        }

    }
}
