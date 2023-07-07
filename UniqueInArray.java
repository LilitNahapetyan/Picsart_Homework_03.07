/*7. Unique element in array
Ձեզ տրվում է ամբողջ թվերի զանգված, որտեղ յուրաքանչյուր տարր ունի իր զույգը, բացի մեկից: 
Գտեք և վերադարձրեք այդ տարրը: */

class UniqueInArray {

  public static void main(String[] args) {
    int[] array = new int[] { 1, 4, 5, 3, 2, 4, 5, 3, 2 };
    System.out.println(findUnique(array));
  }

  public static int findUnique(int[] arr) {
    int result = 0;
    for (int element : arr) {
      result ^= element;
    }

    return result;
  }
}
