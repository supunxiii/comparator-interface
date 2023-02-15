import java.util.ArrayList;
import java.util.Collections;

public class ComparableTest {
  public static void main(String[] args) {
    BankAccount ba1 = new BankAccount(100.0);
    BankAccount ba2 = new BankAccount(50.0);
    BankAccount ba3 = new BankAccount(20.0);
    ArrayList<BankAccount> list = new ArrayList<BankAccount>();
    list.add(ba1);
    list.add(ba2);
    list.add(ba3);
    Collections.sort(list);
    for (BankAccount b : list)
    System.out.println(b.getBalance());
  }
}
