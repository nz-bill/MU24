import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int x = 10;
        int z = 10;
        int y = 5;

        int[] intArray = {1,2,3};


        String xString = "5";
        x = addNumbers(x,y);

        int difference = subtractNumbers(y,x);
        System.out.println("intArray = " + intArray);
        System.out.println("arrayen innan vi anropar funktionen: " + Arrays.toString(intArray));
        setNumber(intArray, 5);
        System.out.println("arrayen efter vi anropar funktionen: " + Arrays.toString(intArray));
//        System.out.println("x = " + x);
//        //System.out.println("summa = " + summa);
//        System.out.println("difference = " + difference);
    }

    public static void setNumber(int[] array, int x){
        int[] intArray2 = array.clone();
        intArray2[1] = x;
        System.out.println("arrayen inne i funktionen: " + Arrays.toString(intArray2));
        System.out.println("array = " + intArray2);

    }

    public static int addNumbers(int x, int y){
        x = x + 10;

      return x + y;
    }

    public static int subtractNumbers(int kanelbulle, int kanin){



        return kanelbulle - kanin;
    }




    // accessModifier [static] returTyp namnPåFunktionen(datatypPåParameter namnPåParameter, ...){

                ///kod här
//}

}