// Демонстрация обработки исключений,
public class test1 {
    public static void main(String args[]) {
        int Array[] = new int[2];
        try {
            Array[3] = 3;
            System.out.println("Доступ к 3 элементу" + Array[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Исключение " + e);
        }
        System.out.println("Вне блока");
    }
}