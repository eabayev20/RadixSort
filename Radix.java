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
      SortableLinkedList six = new 

}
