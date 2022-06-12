package principal;

public class PrimosAngela {
    public static void main(String[] args) {

        int numMax = 100;
        System.out.println("Los numeros primos del 1 al 100 son: ");

        for(int i =1; i<numMax;i++) {
            int cuenta=0;

            for (int a =1;a<=i;a++){

                if(i % a ==0)
                    cuenta++;
            }
            if (cuenta == 2)
                System.out.println(i);
        }
    }
}
