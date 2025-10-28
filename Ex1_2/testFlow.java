public class testFlow {
    public static void main(String[] args){
        int a = 3;
        int b = 0;
        int c = -1;

        if(a >=0) //Cat
            if(a == 0)
                System.out.println("Cow");
        else System.out.println("Donkey");
        System.out.println("Cat");

        if(b >=0) //Cow
            if(b == 0)
                System.out.println("Cow");
        else System.out.println("Donkey");
        System.out.println("Cat");

        if(c >=0) //Donkey(my guess) But it was wrong the else somehow attach to the nearest if so it actually print Cat
            if(c == 0)
                System.out.println("Cow");
        else System.out.println("Donkey");
        System.out.println("Cat");
    }
}
