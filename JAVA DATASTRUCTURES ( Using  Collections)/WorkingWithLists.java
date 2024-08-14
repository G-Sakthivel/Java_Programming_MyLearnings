import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    public static void main(String [] args){
        List<String> colors = new ArrayList<>();
        colors.add("blue");
        colors.add("red");
        colors.add("black");
        System.out.println(colors.size());
        System.out.println(colors.contains("yellow"));
        System.out.println(colors.contains("blue"));
        System.out.println(colors);

        //Accessing list/arraylist using for loop
        //Enhanced for loop
        for(String color : colors) {
            System.out.println(color);
        }

        //for each loop
        colors.forEach(System.out :: println);

        //Traditional for loop
        for(int i=0;i<colors.size();i++) {
            System.out.println(colors.get(i));
        }

        //methods for the creation of unmodified list/arraylist
        List<String> unmodifiedList = List.of(
                "white",
                "pink"
        );
        //unmodifiedList.add("violet");//this unmodified list is immutable //this makes error while executing
        System.out.println(unmodifiedList);
    }
}
