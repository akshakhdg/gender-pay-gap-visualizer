/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ife
 */
import java.io.*;
import java.util.*;

public class DataManager {

    private Map<String, SalaryData> dataMap = new HashMap<>();

    public DataManager(String fileName) {
        loadData(fileName);
    }

    private void loadData(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            br.readLine(); // skip header

            while ((line = br.readLine()) != null) {
                List<String> partsList = parseCSVLine(line);
                if (partsList.size() < 4) continue; // skip invalid lines

                String occupation = partsList.get(0).trim();
                double women = Double.parseDouble(partsList.get(1).trim());
                double men = Double.parseDouble(partsList.get(2).trim());
                double ratio = Double.parseDouble(partsList.get(3).trim());

                SalaryData entry = new SalaryData(occupation, women, men, ratio);
                dataMap.put(occupation.toLowerCase(), entry);
            }

            // Debug: print all loaded occupations
            System.out.println("Loaded occupations:");
            for (String key : dataMap.keySet()) {
                System.out.println("'" + key + "'");
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error reading file: " + fileName);
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Invalid number in CSV file.");
            e.printStackTrace();
        }
    }

    public SalaryData search(String jobTitle) {
        if (jobTitle == null) return null;
        return dataMap.get(jobTitle.trim().toLowerCase());
    }

    // Simple CSV parser that handles commas inside quotes
    private List<String> parseCSVLine(String line) {
        List<String> result = new ArrayList<>();
        boolean inQuotes = false;
        StringBuilder sb = new StringBuilder();

        for (char c : line.toCharArray()) {
            if (c == '"') {
                inQuotes = !inQuotes; // toggle quote state
            } else if (c == ',' && !inQuotes) {
                result.add(sb.toString());
                sb.setLength(0);
            } else {
                sb.append(c);
            }
        }
        result.add(sb.toString());
        return result;
    }
}


