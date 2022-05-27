class movie{
    void movie(){
        System.out.println("A Untold love");
    }
}
class storytype extends movie{
    void storytype(){
        System.out.println("love");
    }
}
class musicby extends storytype{
    void musicby(){
        System.out.println("Aniruth");
    }
}
class staringby extends musicby{
    void staringby(){
        System.out.println("Prince SK");
    }
}
class directedby extends staringby{
    void directedby(){
        System.out.println("ARULKUMAR");
    }
}    
class Main{
public static void main(String[] args) {
    directedby obj=new directedby();
    obj.directedby();
    obj.staringby();
    obj.musicby();
    obj.storytype();
    obj.movie();
}
}
