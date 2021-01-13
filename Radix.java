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
    while(data.size()>0){ //loop through data to get maxValue
          if (data.get(0) > maxValue){
            maxValue = data.remove(0);
          }
      }
      int mostDigits = length(maxValue); //e.g 432, mostdigits would be 3
      SortableLinkedList[] buckets = new SortableLinkedList[10];
      for(int i = 0; i < 10; i ++){
        buckets[i] = new SortableLinkedList();
      }

      for(int i = 0; i < mostDigits; i ++){
        while(data.size()>0){
          int ele =data.remove(0);
          int digit = nth(ele,i);
          buckets[digit].add(ele);

        }
        merge(data,buckets);
      }

  }
public static void radixSort(SortableLinkedList data) {}
}
