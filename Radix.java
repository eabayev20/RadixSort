public class Radix{

  public static int nth(int n, int col) {

    return (int) (Math.abs(n) / Math.pow(10, col)) % 10;
  }
  public static int length(int n){
    int r = 0;
    if(n == 0) {
      return r;
    }
    else {
    return (int) (Math.log10(Math.abs(n)) + 1);
  }
}
public static void merge(SortableLinkedList original, SortableLinkedList[] buckets){
    for(int i = 0; i < buckets.length; i ++){
      original.extend(buckets[i]);
    }
  }
  public static void radixSortSimple(SortableLinkedList data){

      int maxValue = 0;
      for(int i = 0; i < data.size(); i ++){ //loop through data to get maxValue
          if (data.get(i) > maxValue){
            maxValue = data.get(i);
          }
      }
      int mostDigits = length(maxValue); //e.g 432, mostdigits would be 3
      for(int i = 0; i < mostDigits; i ++){
        SortableLinkedList zero = new SortableLinkedList();
        SortableLinkedList one = new SortableLinkedList();
        SortableLinkedList two = new SortableLinkedList();
        SortableLinkedList three = new SortableLinkedList();
        SortableLinkedList four = new SortableLinkedList();
        SortableLinkedList five = new SortableLinkedList();
        SortableLinkedList six = new SortableLinkedList();
        SortableLinkedList seven = new SortableLinkedList();
        SortableLinkedList eight = new SortableLinkedList();
        SortableLinkedList nine = new SortableLinkedList();
        for(int j = 0; j < data.size(); j ++){ //loop through data to sort
      int element = data.get(j);
      int num = nth(element,i);  //gets ones place, added according to where. This is a stable sort too. Is there a way to do this with a loop?
      if(num ==0) {
         zero.add(element);
       }
      else if(num == 1) {
        one.add(element);
      }
      else if(num == 2) {
        two.add(element);
      }
      else if(num == 3) {
        three.add(element);
      }
      else if(num == 4) {
        four.add(element);
      }
      else if(num == 5) {
        five.add(element);
      }
      else if(num == 6) {
        six.add(element);
      }
      else if(num == 7) {
        seven.add(element);
      }
      else if(num == 8) {
        eight.add(element);
      }
      else {
        nine.add(element);
      }
    }
    SortableLinkedList temp = new SortableLinkedList();
    SortableLinkedList[] buckets = new SortableLinkedList[]{zero,one,two,three,four,five,six,seven,eight,nine};
    Radix.merge(temp,buckets);
    for(int j = data.size()-1; j >= 0; j --){//removing from data to add in a sorted order
      data.remove(j);
    }
    data.extend(temp);

  }
}
}
