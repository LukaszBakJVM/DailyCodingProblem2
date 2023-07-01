import java.util.ArrayList;
import java.util.List;

public class Main {
    private static List<Integer> integers = List.of(1, 2, 3, 4, 5);

    public static void main(String[] args) {
        List<Integer> integerList = integersList(integers);
        System.out.println(integerList);


    }

    private static List<Integer> integersList(List<Integer> integers) {
        int sum = 1;
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < integers.size(); i++) {
            for (int j = 0; j < integers.size(); j++) {
                if (i != j) {
                    sum *= integers.get(j);
                }

            }
            integerList.add(sum);
            sum = 1;

        }


        return integerList;
    }

}