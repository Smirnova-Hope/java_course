public abstract class Bird {
    public abstract void move();
}

public class Sparrow extends Bird {
    @Override
    public void move() {
        System.out.println("Воробей может летать");
    }
}

public class Penguin extends Bird {
    @Override
    public void move() {
        System.out.println("Пингвин не может летать, он плавает");
    }
}

public class BirdService {
    public void makeBirdMove(Bird bird) {
        bird.move(); 
    }
}

public class Main {
    public static void main(String[] args) {
        BirdService service = new BirdService();

        Bird sparrow = new Sparrow();
        Bird penguin = new Penguin();

        service.makeBirdMove(sparrow); 
        service.makeBirdMove(penguin);
    }
}
