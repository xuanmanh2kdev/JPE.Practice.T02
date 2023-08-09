package fa.training.problem01;

    // Write a program to read the file and count the number of students in each programming language from course_register.txt

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

        public class CourseRegister {
            public static void main(String[] args) {
                String filePath = "course_register.txt";
                Map<String, Integer> studentCount = countRegister(filePath);
                for (Map.Entry<String, Integer> entry : studentCount.entrySet()) {
                    System.out.println(entry.getKey() + " : " + entry.getValue());
                }
            }

            public static Map<String, Integer> countRegister(String filePath) {
                   Map<String, Integer> studentCount = new LinkedHashMap<>();
                    try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
                        String line;
                        while ((line = br.readLine()) != null) {
                            String[] data = line.split(",");
                            String language = data[1];
                            if (studentCount.containsKey(language)) {
                                studentCount.put(language, studentCount.get(language) + 1);
                            } else {
                                studentCount.put(language, 1);
                            }
                        }
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    return studentCount;
            }
        }
