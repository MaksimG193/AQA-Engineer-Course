package TaskL12;

public class MyArrayDataException extends Exception {
    public MyArrayDataException(int row, int col, String value) {
        super(String.format("Ошибка данных в ячейке:", row, col, value));
    }
}
