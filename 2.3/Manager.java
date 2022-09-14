
public class Manager extends Employee {

  private int bonus;

  Manager(int id, String name, String dept, int sal, int bonus) {
    setId(id);
    setName(name);
    setDept(dept);
    setSal(sal);
    this.bonus = bonus;
  }

  int calc() {
    return bonus + getSal();
  }

  void display() {
    System.out.println("Id: " + getId());
    System.out.println("Name: " + getName());
    System.out.println("Dept: " + getDept());
    System.out.println("Sal: " + getSal());
    System.out.println("Bonus: " + bonus);

  }
}
