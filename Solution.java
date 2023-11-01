import java.util.ArrayList;
import java.util.List;

import javax.xml.transform.Source;

class Node<T> {
  T val;
  Node<T> next;

  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}

class Solution {
  public static List<String> linkedListValues(Node<String> head) {
    ArrayList<String> result = new ArrayList<>();
    Node<String> temp = head;
    while(temp != null){
      result.add(temp.val);
      temp = temp.next;
    }
    System.out.println(result);
    return result;
  }


}
