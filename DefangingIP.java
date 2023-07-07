/*3. Defanging an IP Address։
Տրված է վավեր (IPv4) IP հասցե, վերադարձրեք այդ IP հասցեի անսարք տարբերակը:
Ձևափեխված IP հասցեն փոխարինում է յուրաքանչյուր «․» կետին «[.]»-ով։*/

class DefangingIP {
    public static void main(String[] args) {
        System.out.println(defangIPaddr("1.1.1.1"));
    }

    public static String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}