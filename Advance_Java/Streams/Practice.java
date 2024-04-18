package Advance_Java.Streams;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Practice {
    public static void main(String[] args) {
        List<String> names = List.of("Tantia Tope", "Rani Lakshmibai", "Mangal Pandey", "Nana Sahib");
              Optional<String> ans =   names.stream()
                .filter(str -> str.length() > 10)
                .findFirst();

              String ans1 = ans.orElseThrow();
            System.out.println(ans1);
    }
}
