/*2․ Goal Parser մեկնաբանություն։Դուք ունեք Goal Parser, որը կարող է մեկնաբանել տողային հրամանը: 
Հրամանը կազմված է «G», «()» և/կամ «(al)» այբուբենից՝ որոշ հերթականությամբ: 
Նպատակների վերլուծիչը «G»-ն կմեկնաբանի որպես «G» տող, «()»-ը որպես «o» տող, 
իսկ «(al)»-ը որպես «al» տող: Այնուհետև մեկնաբանված տողերը միացվում են սկզբնական կարգով:
Հաշվի առնելով string հրամանը, վերադարձրեք Goal Parser-ի հրամանի մեկնաբանությունը:*/

class Solution {

    public static void main(String[] args) {
        System.out.println(interpret("G()(al)"));
    }
  public static String interpret(String command) {
    StringBuilder result = new StringBuilder();
    int i = 0;
    while (i < command.length()) {
      if (command.charAt(i) == 'G') {
    result.append('G');
        i++;
      } else if (command.charAt(i) == '(') {
        if (command.charAt(i + 1) == ')') {
          result.append('o');
          i += 2;
        } else if (
          command.charAt(i + 1) == 'a' &&
          command.charAt(i + 2) == 'l' &&
          command.charAt(i + 3) == ')'
        ) {
          result.append("al");
          i += 4;
        }
      }
    }
    return result.toString();
  }
}
