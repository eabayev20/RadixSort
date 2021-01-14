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
        SortableLinkedList[] buckets = new SortableLinkedList[10];
        for(int i = 0; i < 10; i ++){
          buckets[i] = new SortableLinkedList();
        }

        int c = 1;
        for(int i = 0; i < c; i ++){
          while(data.size()>0) {
            if(length(data.get(0)) > c) {
              c = length(data.get(0));
            }
            int ele = data.get(0);
            int d = nth(ele,i);
            buckets[d].add(ele);
            data.remove(0);
          }
          merge(data,buckets);
        }

    }
public static void radixSort(SortableLinkedList data) {}
}
