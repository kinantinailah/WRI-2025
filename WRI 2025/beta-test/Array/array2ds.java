public class array2ds {
    public static void main(String[] args) {
        String [][] nama = {
            {"ratih","fazi","felia","fahkrun"},
            {"kinanti","nailah","hehe","xixi"},
        };
        for (int i = 0; i < nama.length; i++) {
            for (int j = 0; j < nama[i].length; j++) {
                System.out.print(nama[i][j]+" ");
            }
            System.out.println();
        }
    }
}
