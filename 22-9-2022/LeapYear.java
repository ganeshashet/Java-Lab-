public class LeapYear
{
public static void main(String args[])
{
  for (int i = 1947; i < 2022; i++) {
        if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
            System.out.printf("%4d%n", i);
        }
    }
}
} 