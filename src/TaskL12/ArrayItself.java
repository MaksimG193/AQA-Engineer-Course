package TaskL12;

public class ArrayItself {

    public static void arrayCheck(String[][] array) throws MyArrayDataException, MyArraySizeException{
        if(array.length !=4 || array[0].length != 4){
            throw new MyArraySizeException("Размер массива не должен привышать 4*4");
        }

        int sum = 0;
        for (int a = 0; a < array.length; a++){
            for (int b = 0; b < array[a].length; b++){
                try{
                    sum += Integer.parseInt(array[a][b]);
                } catch (NumberFormatException e){
                    throw new MyArrayDataException("Неверные данные");
                }
            }
        }
        System.out.println("Сумма элементов" + sum);
    }
}
