public class Array {
    public static void main(String[] args) {
        String [] mentor = new String[7];
        mentor[0] = "singgih";
        mentor[1] = "aulia";
        mentor[2] = "najla";
        mentor[3] = "naura";
        mentor[4] = "gunawan";
        mentor[5] = "hafidzah";
        mentor[6] = "ratih";

        mentor[0] = "kinan";

        System.out.println(mentor[0]);

        for (int i = 0; i < mentor.length; i++) {
            System.out.println(mentor[i]);
            
        }

    }
}
