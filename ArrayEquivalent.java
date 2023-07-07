/*5․ Check If Two String Arrays are Equivalent։
Տրված երկու տողային զանգվածներ word1 և word2, վերադարձրեք true, եթե երկու զանգվածները ներկայացնում են նույն տողը, 
իսկ հակառակ դեպքում՝ false:
Տողը ներկայացված է զանգվածով, եթե զանգվածի տարրերը, որոնք միացված են հերթականությամբ, կազմում են տողը:*/

class ArrayEquivalent {

  public static void main(String[] args) {
    String[] arr1 = new String[] { "Pi", "c", "sa", "rt" };
    String[] arr2 = new String[] { "P", "ic", "sar", "t" };
    System.out.println(arrayStringsAreEqual(arr1, arr2));
  }

  public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
    String str1 = "", str2 = "";
    for (String w1 : word1) {
      str1 += w1;
    }
    for (String w2 : word2) {
      str2 += w2;
    }

    return str1.equals(str2);
  }
}
