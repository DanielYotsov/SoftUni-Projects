package list_Exercise05;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p10_SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> topics = Arrays.stream(scanner.nextLine()
                        .split(", "))
                .collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("course start")) {
            String[] commandParts = command.split(":");
            String commandName = commandParts[0];
            String topic = commandParts[1];
            switch (commandName) {
                case "Add":
                    if (!topics.contains(topic)) {
                        topics.add(topic);
                    }
                    break;
                case "Insert":
                    int index = Integer.parseInt(commandParts[2]);
                    if (!topics.contains(topic)) {
                        topics.add(index, topic);
                    }
                    break;
                case "Remove":
                    if (topics.contains(topic)) {
                        int indexTopic = topics.indexOf(topic);
                        String exercise = topic + "-Exercise";
                        boolean hasExercise = indexTopic != topics.size() - 1 && topics.get(indexTopic + 1).equals(exercise);
                        topics.remove(topic);
                        if (hasExercise) {
                            topics.remove(exercise);
                        }
                    }
                    break;
                case "Swap":
                    String topic2 = commandParts[2];
                    if (topics.contains(topic) && topics.contains(topic2)) {
                        int indexFirst = topics.indexOf(topic);
                        int indexSecond = topics.indexOf(topic2);

                        topics.set(indexFirst, topic2);
                        topics.set(indexSecond, topic);
                        String exFirst = topic + "-Exercise";
                        String exSecond = topic2 + "-Exercise";
                        if (topics.contains(exFirst)) {
                            topics.remove(topics.indexOf(exFirst));
                            topics.add(topic.indexOf(topic) + 1, exFirst);
                        }
                        if (topics.contains(exSecond)) {
                            topics.remove(topics.indexOf(exSecond));
                            topics.add(topic.indexOf(topic2) + 1, exSecond);
                        }
                    }
                    break;
                case "Exercise":
                    String exerciseName = topic + "-Exercise";
                    int index1 = topics.indexOf(topic);
                    if (topics.contains(topic)) {
                        if (index1 == topics.size() - 1) {
                            topics.add(index1 + 1, exerciseName);
                        } else if (!topics.get(index1 + 1).equals(exerciseName)) {
                            topics.add(index1 + 1, exerciseName);
                        }
                    } else {
                        topics.add(topic);
                        topics.add(exerciseName);
                    }
                    break;
            }

            command = scanner.nextLine();
        }
        int count = 1;
        for (String topic : topics){
            System.out.println(count + "." + topic);
            count++;
        }
    }
}
