public class equalsIgnore{
    public static void main(String[] args){
        String str1 = "bon voyage";
        String str2 = "Bon Appetit";
        String str3 = "Bon Voyage";
		boolean equals1 = str1.equalsIgnoreCase(str2);
		boolean equals2 = str1.equalsIgnoreCase(str3);
		System.out.println("\"" + str1 + "\" equals \"" + str2 + "\"? " + equals1);
		System.out.println("\"" + str1 + "\" equals \"" + str3 + "\"? " + equals2);
    }
}