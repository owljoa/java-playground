import bird.Bird;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MainApplication {

  public static void main(String[] args) throws IOException, ClassNotFoundException {

    Bird bird = new Bird();
    bird.setType("sparrow");
    bird.setHeight(100);
    bird.setSpeed(10);

    FileOutputStream fileOutputStream = new FileOutputStream("test_file.txt");
    ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
    objectOutputStream.writeObject(bird);
    objectOutputStream.flush();
    objectOutputStream.close();

    FileInputStream fileInputStream = new FileInputStream("test_file.txt");
    ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
    Bird inputBird = (Bird) objectInputStream.readObject();
    objectInputStream.close();

    System.out.println("inputBird: " + inputBird);
    System.out.println("animalCode: " + Bird.getAnimalCode());
  }

}