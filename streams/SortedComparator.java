// streams/SortedComparator.java
// �2016 MindView LLC: see Copyright.txt
import java.util.*;

public class SortedComparator {
  public static void main(String[] args) throws Exception {
    FileToWords.stream("Cheese.dat")
      .skip(10)
      .limit(10)
      .sorted(Comparator.reverseOrder())
      .map(w -> w + " ")
      .forEach(System.out::print);
  }
}
/* Output:
you what to the that sir leads in district And
*/