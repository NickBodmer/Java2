package Lesson1;

public class Man implements Actor {
    private int maxLength;
    private int maxHeight;

    public Man(int maxLength, int maxHeight) {
        this.maxLength = maxLength;
        this.maxHeight = maxHeight;
    }

    @Override
    public void doJump(int height) throws Exception {
        if ( height < maxHeight ){
            System.out.println("Jump " + height);
        }else{
            throw new RuntimeException("Не могу прыгнуть так высоко");
        }
    }

    @Override
    public void doRun(int length) throws Exception {
        if ( length < maxLength){
            System.out.println("Run " + length);
        }else{
            throw new RuntimeException("Не могу идти так далеко");
        }

    }
}
