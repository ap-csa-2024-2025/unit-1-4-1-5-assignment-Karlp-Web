public class Problem3
{
  public static void main(String[] args)
  {
    int value = 5678;

    System.out.println("Four digit number:");
    System.out.println(value);

    int val1 = (value % 5670);
    int val2 = (value % 5671);
    int val3 = (value % 5672);
    int val4 = (value % 5673);

    System.out.println(val1);
    System.out.println(val2);
    System.out.println(val3);
    System.out.println(val4);
  }
}
