jetbrains://idea/navigate/reference?project=TugasPBO2_GAGAS&fqn=Matematika_Gagas3F.MatematikaBeraksi
C:\Users\USER\IdeaProjects\TugasPBO2_GAGAS\src\Matematika_Gagas3F\MatematikaBeraksi.java

  package Matematika_Gagas3F;

public class MatematikaBeraksi {
    public static void main(String[] args) {
            Matematika math = new Matematika();

            System.out.println("Pertambahan : 20 + 10 = " + math.pertambahan(20, 10));
            System.out.println("Pengurangan : 10 - 5  = " + math.pengurangan(10, 5));
            System.out.println("Perkalian   : 10 * 3  = " + math.perkalian(10, 3));
            System.out.println("Pembagian   : 21 / 2  = " + math.pembagian(21, 2));
    }
}
