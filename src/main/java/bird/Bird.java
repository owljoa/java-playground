package bird;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Bird implements Serializable {

  private static final long serialVersionUID = 1L;
  static String animalCode = "61rd";
  private int height;
  private String type;
  transient int speed;

  private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
    objectOutputStream.defaultWriteObject();
    objectOutputStream.writeObject(getSpeed());
  }

  private void readObject(ObjectInputStream objectInputStream)
    throws IOException, ClassNotFoundException {
    objectInputStream.defaultReadObject();
    int speed = (int) objectInputStream.readObject();
    this.setSpeed(speed);
  }

  public static String getAnimalCode() {
    return animalCode;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public int getSpeed() {
    return speed;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  @Override
  public String toString() {
    return "Bird{" +
      "height=" + height +
      ", type='" + type + '\'' +
      ", speed=" + speed +
      '}';
  }
}
