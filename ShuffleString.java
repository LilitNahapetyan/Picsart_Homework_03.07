/*4․ Shuffle String։
Ձեզ տրվում են s տող և նույն երկարության ամբողջ թվային զանգվածի ինդեքսներ: s տողը կխառնվի այնպես, 
որ i-րդ դիրքի նիշը տեղափոխվի խառնված տողի  համապատասխան i֊րդ ինդեքսում:
Վերադարձրեք խառնված շարանը։ */

class ShuffleString {

  public static void main(String[] args) {
    int[] arr = new int[] { 4,5,6,7,0,2,1,3};
    System.out.println(restoreString("codeleet", arr));
  }

  public static String restoreString(String s, int[] indices) {
    StringBuilder result = new StringBuilder(s);
    for (int i = 0; i < s.length(); i++) {
      result.setCharAt(indices[i], s.charAt(i));
    }
    return result.toString();
  }
}

