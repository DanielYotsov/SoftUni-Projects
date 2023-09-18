package associativeArrays_Exercise07;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class p07_legendaryFarming {

        public static  void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            Map<String, Integer> materials = new HashMap<>();
            materials.put("shards", 0);
            materials.put("fragments", 0);
            materials.put("motes", 0);

            Map<String, Integer> junkItems = new HashMap<>();

            boolean obtained = false;

            while (true) {
                String[] input = scanner.nextLine().toLowerCase().split(" ");

                for (int i = 0; i < input.length; i += 2) {
                    int quantity = Integer.parseInt(input[i]);
                    String material = input[i + 1];

                    if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {
                        materials.put(material, materials.get(material) + quantity);

                        if (materials.get(material) >= 250) {
                            materials.put(material, materials.get(material) - 250);
                            printResult(material);
                            obtained = true;
                            break;
                        }
                    } else {
                        junkItems.put(material, junkItems.getOrDefault(material, 0) + quantity);
                    }
                }

                if (obtained) {
                    break;
                }
            }

            printMaterials(materials);
            printJunkItems(junkItems);
        }

        private static void printResult(String material) {
            String item = "";
            switch (material) {
                case "shards":
                    item = "Shadowmourne";
                    break;
                case "fragments":
                    item = "Valanyr";
                    break;
                case "motes":
                    item = "Dragonwrath";
                    break;
            }
            System.out.println(item + " obtained!");
        }

        private static void printMaterials(Map<String, Integer> materials) {
            materials.entrySet().stream()
                    .sorted((m1, m2) -> m2.getValue().compareTo(m1.getValue()))
                    .forEach(entry -> System.out.printf("%s: %d%n", entry.getKey(), entry.getValue()));
        }

        private static void printJunkItems(Map<String, Integer> junkItems) {
            junkItems.entrySet().stream()
                    .sorted(Map.Entry.comparingByKey())
                    .forEach(entry -> System.out.printf("%s: %d%n", entry.getKey(), entry.getValue()));
        }
    }
