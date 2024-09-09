jetbrains://idea/navigate/reference?project=TugasPBO2_GAGAS&fqn=Matematika_Gagas3F.MatematikaBeraksiInterface
C:\Users\USER\IdeaProjects\TugasPBO2_GAGAS\src\Matematika_Gagas3F\MatematikaBeraksiInterface.java

  package Matematika_Gagas3F;

public interface MatematikaBeraksiInterface {
    public static void main (String[] args) {

    MatematikaInterface math = new Matematika();
    math.pertambahan(20, 10);
    math.pengurangan(10, 5);
    math.perkalian(10, 3);
    math.pembagian(21, 2);
}
}
