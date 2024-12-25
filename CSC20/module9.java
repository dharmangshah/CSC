import java.util.*;
public class module9
{
}
class searchSort
{
 public static void main(String[] args)
 {
  int[] numbers = {-12,66,97,5,46,12,30};
  insertionSort(numbers);
  System.out.println(Arrays.toString(numbers));
  int index = binarySearch(numbers,12);
  System.out.println(index);
 }
 public static int binarySearch(int[] list,int num)
 {
  int first = 0;
  int last = list.length-1;
  int mid = (first+last/2);
  while (first<=last)
  {
   mid = (first+last/2);
   if (list[mid] == num)
   {
    return mid;
   }
   else if (list[mid]>num)
   {
    last = mid;
   }
   else if (list[mid]<num)
   {
    first = mid;
   }
  }
  return -1;
 }
 public static void bubbleSort(int[] list)
 {
  int num;
  for (int i =0; i<list.length;i++)
  {
   for (int j=0;j<list.length-i-1;j++)
   {
    if (list[j+1]<list[j])
    {
     num = list[j];
     list[j] = list[j+1];
     list[j+1] = num;
    }
   }
  }
 }
 public static void selectionSort(int[] list)
 {
  for (int i =0 ;i<list.length;i++)
  {
   int min = list[i];
   int index = i;
   for (int j = i ;j<list.length;j++)
   {
    if (min>list[j])
    {
     min = list[j];
     index =j;
    }
   }
   int temp = list[i];
   list[i] = list[index];
   list[index] = temp;
  }
 }
 public static void insertionSort(int[] num)
 {
  for (int i=0;i<num.length-1;i++)
  {
   int j = i+1;
   while(j>0 && num[j]<num[j-1])
   {
    int temp = num[j];
    num[j] = num[j-1];
    num[j-1] = temp;
    j--;
   }
  }
 }
}