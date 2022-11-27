package ExerciseLists;

import java.util.*;
import java.util.stream.Collectors;

public class AppendArrays07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<String> listSeparatedByPipe = Arrays.stream(input.split("\\|")).collect(Collectors.toList());
        Collections.reverse(listSeparatedByPipe);



       // System.out.println(listSeparatedByPipe.toString().replaceAll("[\\[\\],]", ""));
        System.out.println(listSeparatedByPipe.toString() //"[  7  8, 4 5 6 , 1 2 3 ]"
                .replace("[", "") //"  7  8, 4 5 6 , 1 2 3 ]"
                .replace("]", "") //"  7  8, 4 5 6 , 1 2 3 "
                .trim()  //"7  8, 4 5 6 , 1 2 3"
                .replaceAll(",", "") //"7  8 4 5 6  1 2 3"
                .replaceAll("\\s+", " ")); //"7 8 4 5 6 1 2 3"
    }
}
