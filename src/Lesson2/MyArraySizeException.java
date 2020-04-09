package Lesson2;


class MyArraySizeException extends Exception{
    @Override
    public String getMessage(){
        return "неверный размер массива";
    }
}

