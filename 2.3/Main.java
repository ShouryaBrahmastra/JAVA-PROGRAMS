public class Main {
  public static void main(String args[]) {

    Manager man[] = new Manager[3];

    man[0] = new Manager(001, "ram", "cse", 100, 10);
    man[1] = new Manager(002, "sam", "ese", 90, 50);
    man[2] = new Manager(003, "mike", "it", 50, 10);

    int sal[] = new int[3];

    for (int i = 0; i < 3; i++) {
      sal[i] = man[i].calc();
    }

    int maxSal = Integer.MIN_VALUE;
    Manager maxMan = man[0];

    for (int i = 0; i < 3; i++) {
      if (maxSal < sal[i]) {
        maxSal = sal[i];
        maxMan = man[i];
      }
    }

    maxMan.display();

  }
}
