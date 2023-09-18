package associativeArrays_Exercise07;


import java.util.*;

public class p08_companyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Set<String>> companies = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] parts = input.split(" -> ");
            String companyName = parts[0];
            String employeeId = parts[1];

            companies.putIfAbsent(companyName, new LinkedHashSet<>());
            companies.get(companyName).add(employeeId);

            input = scanner.nextLine();
        }

        for (Map.Entry<String, Set<String>> entry : companies.entrySet()) {
            String companyName = entry.getKey();
            Set<String> employeeIds = entry.getValue();

            System.out.println(companyName);
            for (String employeeId : employeeIds) {
                System.out.println("-- " + employeeId);
            }
        }
    }
}