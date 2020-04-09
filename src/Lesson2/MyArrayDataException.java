package Lesson2;

class MyArrayDataException extends Exception{
    private int i;
    private int j;
    public MyArrayDataException(int i, int j){
        this.i = i;
        this.j = j;
    }

    @Override
    public String getMessage(){
        return "ошибка значения в ячейке " + this.i + " " + this.j;
    }
}
