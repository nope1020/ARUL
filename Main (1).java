class Movie{
    void movie(){
        System.out.println("A Untold love");
    }
}
class Storytype extends Movie{
    void story(){
        System.out.println("love");
    }
}
class Musicby extends Movie{
    void music(){
        System.out.println("Aniruth");
    }
}

class Main{
public static void main(String[] args) {
  Musicby obj = new Musicby();
    obj.music();
    obj.movie(); 
  Storytype aa = new Storytype();
    aa.story();
    aa.movie();
}
}
