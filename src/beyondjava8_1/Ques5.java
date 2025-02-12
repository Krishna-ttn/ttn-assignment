package beyondjava8_1;
/*
Ques 5:
Demonstrate the use of repeat(), strip(),trim(), isBlank(), indent(), transform(),
stripIndent(), translateEscapes(),tripleQuotes and formatted() methods.
*/

public class Ques5 {
    public static void main(String[] args) {

        //repeat
        String toBeRepeated = "Hello";
        System.out.println(toBeRepeated.repeat(2));

        //strip
        String string = "\n   Hello\u2005";
        System.out.println(string.strip());

        //trim
        String string2 = "\n   Hello   ";
        System.out.println(string2.trim());

        //isBlank
        String blankString = "  \n";
        System.out.println(blankString.isBlank());
        // will return true but .isEmpty() will return false

        //indent()
        System.out.println("Hello World".indent(5));

        //transform
        String text = "Krishna";
        String reverseText = text.transform(str-> new StringBuilder(str)
                .reverse().toString());
        System.out.println(reverseText);

        //stripIndent
        String string3 = """
                \tHello
                \t\t\tWorld
                \thow are you""";
        //System.out.println(string3);
        System.out.println(string3.stripIndent());

        //translateEscapes()
        String str = "Krishna\\n Sharma";
        //System.out.println(str);
        System.out.println(str.translateEscapes());

        //triple Qoutes
        String multilineString = """
                line1
                     line2""";
        System.out.println(multilineString);

        //formated()
        System.out.println("Krishna Age is :%d".formatted(21));

    }
}
