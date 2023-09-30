import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<String> groceries = new ArrayList<>();
        boolean flag = true;
        while(flag){
            printPrompt();
            switch (Integer.parseInt(sc.nextLine())){
                case 1 -> addItem(groceries);
                case 2 -> deleteItem(groceries);
                default -> flag = false;
            }
            groceries.sort(Comparator.naturalOrder());
            System.out.println();
            System.out.println(groceries);
            System.out.println();
        }
    }

    public static void addItem(ArrayList<String> groceries){
            System.out.print("Add item(s) to the list [Separated by commas]: ");
            String[] items = sc.nextLine().split(",");
            for(String i : items){
                String trimmed = i.trim();
                if(groceries.indexOf(trimmed) < 0){
                    groceries.add(trimmed);
                }
            }
    }

    public static void deleteItem(ArrayList<String> groceries){
        System.out.print("Remove item(s) to the list [Separated by commas]: ");
        String[] items = sc.nextLine().split(",");
        for(String i : items){
            String trimmed = i.trim();
            groceries.remove(trimmed);
            }
        }

    public static void printPrompt(){
        String prompt = """
                Available actions:
                                
                0 - to shutdown
                                
                1 - to add item(s) to list (comma delimited list)
                                
                2 - to remove any items (comma delimited list)
                                
                Enter a number for which action you want to do:""";
        System.out.print(prompt+"  ");
    }
}
