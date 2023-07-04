/*method overriding*/
class shape
{
    void draw()
    {
        System.out.println("Can't Say shape Type");
    }
}
class square extends shape
{
    @Override 
    void draw()
    {
        System.out.println("square shape")
    }
}
class demo
{
    public static void main(String[] args) {
        shape r=new square();
        r.draw();
    }
}
