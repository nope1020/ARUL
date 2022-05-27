class Movie{
    void movie(){
        System.out.println("A Untold love");
    }
}
class Storytype extends Movie{
    void storytype(){
        System.out.println("love");
    }
}
class Main{
public static void main(String[] args) {
        Storytype obj=new Storytype();
        obj.storytype();
        obj.movie();
        }
    }