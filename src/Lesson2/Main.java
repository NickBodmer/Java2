package Lesson2;

public class Main {
    public static void main(String[] args) {

        String[][] arr = new String[][]{{"5", "4", "3", "7"}, {"546", "78", "562", "65"},
                {"4", "3", "цук", "2"}, {"32", "22", "78", "23"}};
        try {
            method(arr);
            System.out.println(method(arr));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println("превышен размер массива");
        }


    }





    public static int method(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int a = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    a = a + Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }

        }
        return a;
    }
}


