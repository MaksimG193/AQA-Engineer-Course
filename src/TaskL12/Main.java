package TaskL12;

public class Main {

    public static void main(String[] args){
        String[][] array1 = new String[4][4];
        String[][] array2 = new String[4][5];
        String[][] array3 = {
                {"1", "2", "3", "4" },
                {"5", "6", "7", "8" },
                {"9", "10", "11", "12" },
                {"13", "14", "15", "16" }
        };

        String[][] array4 = {
                {"1", "2", "3", "4" },
                {"5", "6", "f", "7" },
                {"8", "9", "10", "11" },
                {"12", "13", "14", "15" }
        };

        try{
            ArrayItself.arrayCheck(array1);
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }

        try{
            ArrayItself.arrayCheck(array2);
        } catch (MyArraySizeException | MyArrayDataException e){
            e.printStackTrace();
        }

        try{
            ArrayItself.arrayCheck(array3);
        } catch (MyArraySizeException | MyArrayDataException e){
            e.printStackTrace();
        }

        try{
            ArrayItself.arrayCheck(array4);
        } catch (MyArraySizeException | MyArrayDataException e){
            e.printStackTrace();
        }
    }
}
