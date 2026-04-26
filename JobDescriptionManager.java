/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ife
 */


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JobDescriptionManager {

    private Map<String, String> descriptions = new HashMap<>();
    private Map<String, String> whyReasons = new HashMap<>();

    public JobDescriptionManager() {
        loadDescriptions();
    }

    private void loadDescriptions() {

        // ---- Accountants and Auditors ----
    add("Accountants and Auditors",
        "Examine, interpret, and prepare financial records to ensure accuracy and compliance with regulations.");
    addWhy("Accountants and Auditors",
        "This difference is due to gender bias and occupational segregation, as women are often underrepresented in high-paying audit leadership roles.");

    // ---- Advertising Sales Agents ----
    add("Advertising Sales Agents",
        "Sell advertising space and time to businesses and organizations, helping them promote products or services.");
    addWhy("Advertising Sales Agents",
        "This difference is influenced by negotiation disparities, underrepresentation in senior sales positions, and gendered expectations.");

    // ---- Architects ----
    add("Architects",
        "Plan, design, and oversee the construction of buildings and other structures.");
    addWhy("Architects",
        "The pay gap arises from underrepresentation of women in large-scale projects and leadership roles, as well as implicit bias.");

    // ---- Bartenders ----
    add("Bartenders",
        "Mix, garnish, and serve drinks to customers in bars, restaurants, and events.");
    addWhy("Bartenders",
        "Differences are influenced by tip-based earnings variability, occupational segregation, and gendered role expectations.");

    // ---- Bakers ----
    add("Bakers",
        "Prepare and bake a variety of breads, pastries, and desserts.");
    addWhy("Bakers",
        "Pay differences stem from traditional gender roles in culinary tasks and underrepresentation in bakery ownership or management.");

    // ---- Cashiers ----
    add("Cashiers",
        "Handle customer transactions, process payments, and provide service at retail locations.");
    addWhy("Cashiers",
        "Differences are due to occupational segregation and limited access to advancement into supervisory roles.");

    // ---- Chefs and Head Cooks ----
    add("Chefs and Head Cooks",
        "Plan menus, supervise kitchen staff, and oversee food preparation and presentation.");
    addWhy("Chefs and Head Cooks",
        "The pay gap results from underrepresentation in high-end restaurants and executive culinary positions.");

    // ---- Civil Engineers ----
    add("Civil Engineers",
        "Design, plan, and supervise construction projects such as roads, bridges, and buildings.");
    addWhy("Civil Engineers",
        "Differences arise from underrepresentation in senior project roles and lingering stereotypes about engineering roles.");

    // ---- Clinical Laboratory Technologists and Technicians ----
    add("Clinical Laboratory Technologists and Technicians",
        "Perform lab tests to help diagnose, treat, and prevent diseases.");
    addWhy("Clinical Laboratory Technologists and Technicians",
        "Pay differences are influenced by occupational segregation and limited leadership opportunities for women.");

    // ---- Computer Programmers ----
    add("Computer Programmers",
        "Write, test, and maintain code for computer applications and systems.");
    addWhy("Computer Programmers",
        "Differences are due to underrepresentation in senior technical roles, unconscious bias, and stereotypes about women in tech.");
    // ---- Computer Support Specialists ----
    add("Computer Support Specialists",
        "Provide help and advice to computer users and organizations on software, hardware, and networks.");
    addWhy("Computer Support Specialists",
        "This difference is due to underrepresentation of women in advanced technical roles and leadership positions.");

    // ---- Computer Systems Analysts ----
    add("Computer Systems Analysts",
        "Study current IT systems and design improvements to increase efficiency and effectiveness.");
    addWhy("Computer Systems Analysts",
        "Pay gaps arise from position gaps in IT, unconscious bias, and stereotypes about women in technical leadership.");

    // ---- Computer and Information Systems Managers ----
    add("Computer and Information Systems Managers",
        "Determine a company's technology needs, upgrade systems, maintain security, and solve technical issues.");
    addWhy("Computer and Information Systems Managers",
        "This difference is due to the 'Position Gap' in IT, unconscious bias, and stereotypes about women in technology.");

    // ---- Correctional Officers and Jailers ----
    add("Correctional Officers and Jailers",
        "Supervise inmates in correctional facilities and ensure safety and order.");
    addWhy("Correctional Officers and Jailers",
        "Pay differences are influenced by gender representation in supervisory roles and stereotypes about physical labor.");

    // ---- Couriers and Messengers ----
    add("Couriers and Messengers",
        "Deliver packages and documents in a timely and secure manner.");
    addWhy("Couriers and Messengers",
        "Differences are due to occupational segregation and fewer women in high-volume or long-distance delivery roles.");

    // ---- Credit Counselors and Loan Officers ----
    add("Credit Counselors and Loan Officers",
        "Advise clients on managing debt, obtaining loans, and making sound financial decisions.");
    addWhy("Credit Counselors and Loan Officers",
        "This difference is due to systemic discrimination and stereotypes about women's financial decision-making.");

    // ---- Cooks ----
    add("Cooks",
        "Prepare, season, and cook food according to recipes and standards.");
    addWhy("Cooks",
        "Pay differences arise from occupational segregation and underrepresentation in management or high-end culinary positions.");

    // ---- Customer Service Representatives ----
    add("Customer Service Representatives",
        "Interact with customers to handle complaints, process orders, and provide information about products or services.");
    addWhy("Customer Service Representatives",
        "The pay gap is influenced by occupational segregation and limited access to supervisory positions.");

    // ---- Data Entry Keyers ----
    add("Data Entry Keyers",
        "Input, update, and maintain information in computer systems accurately and efficiently.");
    addWhy("Data Entry Keyers",
        "Pay differences result from occupational segregation and minimal career advancement opportunities.");

    // ---- Dining Room and Cafeteria Attendants and Bartender Helpers ----
    add("Dining Room and Cafeteria Attendants and Bartender Helpers",
        "Assist in serving food and beverages, clearing tables, and maintaining cleanliness.");
    addWhy("Dining Room and Cafeteria Attendants and Bartender Helpers",
        "This difference is due to gendered occupational roles and limited access to supervisory positions.");
    // ---- Industrial Engineers ----
    add("Industrial Engineers",
        "Design, analyze, and improve systems and processes for efficiency, productivity, and quality.");
    addWhy("Industrial Engineers",
        "Pay differences arise from underrepresentation of women in senior project roles and decision-making positions.");

    // ---- Industrial Truck and Tractor Operators ----
    add("Industrial Truck and Tractor Operators",
        "Operate forklifts, tractors, and other industrial vehicles to move materials within warehouses or production sites.");
    addWhy("Industrial Truck and Tractor Operators",
        "Differences are due to gendered occupational roles and underrepresentation in supervisory positions.");

    // ---- Insurance Claims and Policy Processing Clerks ----
    add("Insurance Claims and Policy Processing Clerks",
        "Review, process, and maintain insurance claims and policy information.");
    addWhy("Insurance Claims and Policy Processing Clerks",
        "Pay gaps are influenced by occupational segregation and limited advancement opportunities.");

    // ---- Insurance Sales Agents ----
    add("Insurance Sales Agents",
        "Sell insurance policies, advise clients on coverage, and maintain client relationships.");
    addWhy("Insurance Sales Agents",
        "The pay gap stems from negotiation disparities, underrepresentation in senior sales roles, and gender expectations.");

    // ---- Janitors and Building Cleaners ----
    add("Janitors and Building Cleaners",
        "Maintain cleanliness and order in buildings, including offices, schools, and public facilities.");
    addWhy("Janitors and Building Cleaners",
        "Differences are influenced by gendered occupational roles and limited opportunities for supervisory advancement.");

    // ---- Lawyers ----
    add("Lawyers",
        "Advise and represent clients in legal matters, and prepare legal documents and arguments.");
    addWhy("Lawyers",
        "Pay gaps arise from underrepresentation in top law firms, leadership positions, and specialized practice areas.");

    // ---- Licensed Practical and Licensed Vocational Nurses ----
    add("Licensed Practical and Licensed Vocational Nurses",
        "Provide basic nursing care and assist patients under the supervision of registered nurses and doctors.");
    addWhy("Licensed Practical and Licensed Vocational Nurses",
        "Differences are influenced by occupational segregation and underrepresentation in higher-paying healthcare management roles.");

    // ---- Logisticians ----
    add("Logisticians",
        "Analyze and coordinate supply chains to ensure efficient production and delivery of goods.");
    addWhy("Logisticians",
        "This difference is due to gender bias and occupational segregation.");

    // ---- Management Analysts ----
    add("Management Analysts",
        "Conduct organizational studies and design systems and procedures to improve efficiency and effectiveness.");
    addWhy("Management Analysts",
        "This difference is due to underrepresentation in higher-paying roles, unconscious bias, and the motherhood penalty.");

    // ---- Marketing Managers ----
    add("Marketing Managers",
        "Help companies expand into new markets, engage target audiences, and acquire new customers.");
    addWhy("Marketing Managers",
        "This difference is most likely due to negotiation gaps, underrepresentation within this role, and the motherhood penalty.");

    // ---- Medical Assistants ----
    add("Medical Assistants",
        "Perform administrative and clinical tasks to support doctors and healthcare staff.");
    addWhy("Medical Assistants",
        "Differences are influenced by occupational segregation and limited advancement opportunities in healthcare.");

    // ---- Medical and Health Services Managers ----
    add("Medical and Health Services Managers",
        "Develop policies, manage budgets, authorize expenditures, and coordinate reporting in healthcare settings.");
    addWhy("Medical and Health Services Managers",
        "This difference is due to gender bias and occupational segregation.");

    // ---- Medical Scientists ----
    add("Medical Scientists",
        "Conduct research to improve human health, develop treatments, and understand diseases.");
    addWhy("Medical Scientists",
        "Pay gaps arise from underrepresentation in high-profile research leadership and grant acquisition roles.");

    // ---- Miscellaneous Agricultural Workers ----
    add("Miscellaneous Agricultural Workers",
        "Perform various agricultural tasks, such as planting, harvesting, and caring for crops or livestock.");
    addWhy("Miscellaneous Agricultural Workers",
        "Differences are influenced by gendered occupational roles and limited access to higher-paying farm management positions.");

    // ---- Nurses Assistants ----
    add("Nursing Assistants",
        "Provide basic care to patients, assist with daily living activities, and support nursing staff.");
    addWhy("Nursing Assistants",
        "Pay differences stem from occupational segregation and underrepresentation in supervisory or specialized nursing roles.");

    // ---- Operations Research Analysts ----
    add("Operations Research Analysts",
        "Use mathematical modeling and analytical methods to help organizations make better decisions.");
    addWhy("Operations Research Analysts",
        "This difference is due to underrepresentation in high-paying analytics roles, unconscious bias, and the motherhood penalty.");

    // ---- Other Assemblers and Fabricators ----
    add("Other Assemblers and Fabricators",
        "Assemble products and components in manufacturing settings according to specifications.");
    addWhy("Other Assemblers and Fabricators",
        "Pay differences are influenced by occupational segregation and limited opportunities for supervisory advancement.");

    // ---- Other Designers ----
    add("Other Designers",
        "Create visual, industrial, or fashion designs according to client or market requirements.");
    addWhy("Other Designers",
        "Differences arise from underrepresentation in high-profile design projects and leadership roles.");

    // ---- Other Financial Specialists ----
    add("Other Financial Specialists",
        "Provide specialized financial services such as analysis, advising, or reporting.");
    addWhy("Other Financial Specialists",
        "This difference is due to systemic discrimination and stereotypes about women's financial decision-making abilities.");

    // ---- Other Healthcare Support Workers ----
    add("Other Healthcare Support Workers",
        "Provide non-clinical support to patients, such as assistance with daily activities or therapy support.");
    addWhy("Other Healthcare Support Workers",
        "Pay gaps result from occupational segregation and underrepresentation in supervisory roles.");

    // ---- Other Mathematical Science Occupations ----
    add("Other Mathematical Science Occupations",
        "Apply mathematical and statistical techniques in research, data analysis, and problem-solving.");
    addWhy("Other Mathematical Science Occupations",
        "Differences stem from underrepresentation in high-paying analytical and leadership positions.");

    // ---- Other Physicians ----
    add("Other Physicians",
        "Diagnose and treat illnesses, provide preventive care, and manage patient health.");
    addWhy("Other Physicians",
        "Pay differences arise from underrepresentation of women in high-paying specialties and leadership roles.");

    // ---- Other Production Workers ----
    add("Other Production Workers",
        "Perform various tasks in manufacturing settings, including assembly, maintenance, and quality control.");
    addWhy("Other Production Workers",
        "This difference is due to occupational segregation and limited advancement opportunities.");

    // ---- Other Teachers and Instructors ----
    add("Other Teachers and Instructors",
        "Provide instruction in specialized subjects or vocational skills outside the traditional school system.");
    addWhy("Other Teachers and Instructors",
        "Differences stem from occupational segregation and lower pay in predominantly female teaching roles.");

    // ---- Packaging and Filling Machine Operators and Tenders ----
    add("Packaging and Filling Machine Operators and Tenders",
        "Operate machinery that packages and fills products, ensuring proper quality and efficiency.");
    addWhy("Packaging and Filling Machine Operators and Tenders",
        "Pay gaps arise from gendered occupational roles and underrepresentation in supervisory positions.");

    // ---- Personal Care Aides ----
    add("Personal Care Aides",
        "Assist individuals with personal hygiene, daily living activities, and companionship.");
    addWhy("Personal Care Aides",
        "Differences result from low pay scales and the predominance of women in caregiving roles.");

    // ---- Personal Financial Advisors ----
    add("Personal Financial Advisors",
        "Meet with clients, discuss goals, advise on investments, and explain financial risks.");
    addWhy("Personal Financial Advisors",
        "This difference is due to systemic discrimination and stereotypes about women's financial abilities.");

    // ---- Postal Service Mail Carriers ----
    add("Postal Service Mail Carriers",
        "Deliver mail and packages to residences and businesses efficiently and securely.");
    addWhy("Postal Service Mail Carriers",
        "Pay differences stem from underrepresentation in supervisory routes and route management roles.");

    // ---- Pharmacists ----
    add("Pharmacists",
        "Dispense medications, advise patients on drug use, and ensure medication safety.");
    addWhy("Pharmacists",
        "Differences arise from underrepresentation in management or pharmacy ownership and unconscious bias.");

    // ---- Pharmacy Technicians ----
    add("Pharmacy Technicians",
        "Assist pharmacists in preparing and dispensing medications, managing inventory, and interacting with customers.");
    addWhy("Pharmacy Technicians",
        "Pay gaps result from occupational segregation and limited advancement opportunities.");

    // ---- Physical Scientists ----
    add("Physical Scientists",
        "Study natural phenomena and conduct research in areas such as physics, chemistry, and earth sciences.");
    addWhy("Physical Scientists",
        "This difference is due to underrepresentation of women in high-paying research roles and leadership positions.");

    // ---- Physical Therapists ----
    add("Physical Therapists",
        "Provide therapy to help patients improve mobility, manage pain, and recover from injuries.");
    addWhy("Physical Therapists",
        "Pay differences arise from occupational segregation and underrepresentation in leadership or specialized therapy roles.");

    // ---- Postal Service Mail Carriers ----
    add("Postal Service Mail Carriers",
        "Deliver mail and packages to residences and businesses efficiently and securely.");
    addWhy("Postal Service Mail Carriers",
        "Pay differences stem from underrepresentation in supervisory routes and route management roles.");

    // ---- Producers and Directors ----
    add("Producers and Directors",
        "Oversee film, television, theater, or music productions, coordinating creative and business aspects.");
    addWhy("Producers and Directors",
        "Pay gaps result from underrepresentation of women in high-profile or executive production roles.");

    // ---- Project Management Specialists ----
    add("Project Management Specialists",
        "Assist with product development, launch, and improvement tasks.");
    addWhy("Project Management Specialists",
        "This difference is due to underrepresentation in higher-paying project roles, unconscious bias, and the motherhood penalty.");

    // ---- Purchasing Managers ----
    add("Purchasing Managers",
        "Plan and coordinate the work of buyers and purchasing agents, and hire/train staff.");
    addWhy("Purchasing Managers",
        "This difference in pay is due to gender bias and occupational segregation.");

    // ---- Receptionists and Information Clerks ----
    add("Receptionists and Information Clerks",
        "Greet visitors, answer phones, and provide administrative support.");
    addWhy("Receptionists and Information Clerks",
        "Pay differences are influenced by occupational segregation and limited promotion opportunities.");

    // ---- Real Estate Brokers and Sales Agents ----
    add("Real Estate Brokers and Sales Agents",
        "Assist clients in buying, selling, and renting properties while negotiating transactions.");
    addWhy("Real Estate Brokers and Sales Agents",
        "This difference arises from negotiation gaps, underrepresentation in high-value deals, and gendered expectations.");

    // ---- Recreation Workers ----
    add("Recreation Workers",
        "Organize and lead recreational activities for individuals or groups in community or recreational settings.");
    addWhy("Recreation Workers",
        "Pay gaps are influenced by occupational segregation and underrepresentation in leadership positions.");

    // ---- Registered Nurses ----
    add("Registered Nurses",
        "Provide and coordinate patient care, educate patients, and support healthcare teams.");
    addWhy("Registered Nurses",
        "Differences stem from occupational segregation and underrepresentation in nursing leadership roles.");

    // ---- Retail Salespersons ----
    add("Retail Salespersons",
        "Sell merchandise directly to consumers, answer questions, and handle transactions.");
    addWhy("Retail Salespersons",
        "Pay gaps arise from occupational segregation and limited opportunities for advancement into supervisory roles.");

    // ---- Sales Managers ----
    add("Sales Managers",
        "Responsible for selling, distributing, and marketing products or services.");
    addWhy("Sales Managers",
        "This difference is most likely due to negotiation gaps, underrepresentation, and family-related career interruptions (motherhood penalty).");

    // ---- Secondary School Teachers ----
    add("Secondary School Teachers",
        "Teach academic subjects to students in middle and high school and foster intellectual and social development.");
    addWhy("Secondary School Teachers",
        "Pay differences arise from occupational segregation and lower pay scales in predominantly female educational roles.");

    // ---- Security Guards and Gambling Surveillance Officers ----
    add("Security Guards and Gambling Surveillance Officers",
        "Patrol and monitor premises to prevent theft, violence, or violations of rules.");
    addWhy("Security Guards and Gambling Surveillance Officers",
        "Differences are influenced by underrepresentation of women in higher-paying supervisory or specialized security roles.");

    // ---- Software Developers ----
    add("Software Developers",
        "Design, code, test, and maintain software applications and systems.");
    addWhy("Software Developers",
        "Pay gaps result from underrepresentation in senior developer or leadership roles, unconscious bias, and stereotypes about women in tech.");

    // ---- Stockers and Order Fillers ----
    add("Stockers and Order Fillers",
        "Receive, organize, and stock merchandise or materials in warehouses and stores.");
    addWhy("Stockers and Order Fillers",
        "Differences arise from gendered occupational roles and limited advancement opportunities.");

    // ---- Supervisors of Transportation and Material Moving Workers ----
    add("Supervisors of Transportation and Material Moving Workers",
        "Oversee and coordinate transportation and material moving workers, ensuring efficiency and safety.");
    addWhy("Supervisors of Transportation and Material Moving Workers",
        "Pay differences are influenced by underrepresentation in leadership roles and gender stereotypes.");

    // ---- Software Developers ----
    add("Software Developers",
        "Design, develop, and maintain computer applications or systems.");
    addWhy("Software Developers",
        "This difference is due to underrepresentation in senior technical positions, unconscious bias, and the motherhood penalty.");

    // ---- Teaching Assistants ----
    add("Teaching Assistants",
        "Support teachers in classroom activities, grading, and student engagement.");
    addWhy("Teaching Assistants",
        "Pay gaps stem from occupational segregation and lower pay scales in educational support roles.");

    // ---- Transportation Storage and Distribution Managers ----
    add("Transportation Storage and Distribution Managers",
        "Plan and coordinate the movement of people and goods.");
    addWhy("Transportation Storage and Distribution Managers",
        "This difference is most likely due to underrepresentation, unconscious bias, and the motherhood penalty.");

    // ---- Waiters and Waitresses ----
    add("Waiters and Waitresses",
        "Take orders, serve food and beverages, and ensure customer satisfaction in restaurants or cafes.");
    addWhy("Waiters and Waitresses",
        "Pay differences are influenced by tip variability, occupational segregation, and gendered role expectations.");

    // ---- First-Line Supervisors of Food Preparation and Serving Workers ----
    add("First-Line Supervisors of Food Preparation and Serving Workers",
        "Direct and coordinate activities of food preparation and serving staff in restaurants or cafeterias.");
    addWhy("First-Line Supervisors of Food Preparation and Serving Workers",
        "Differences are influenced by underrepresentation in managerial roles and gendered occupational expectations.");

    // ---- First-Line Supervisors of Office and Administrative Support Workers ----
    add("First-Line Supervisors of Office and Administrative Support Workers",
        "Supervise and coordinate administrative support staff in offices.");
    addWhy("First-Line Supervisors of Office and Administrative Support Workers",
        "Pay gaps arise from underrepresentation in high-level supervisory roles and occupational bias.");

    // ---- First-Line Supervisors of Production and Operating Workers ----
    add("First-Line Supervisors of Production and Operating Workers",
        "Oversee production and operating workers, ensuring efficiency and quality in manufacturing.");
    addWhy("First-Line Supervisors of Production and Operating Workers",
        "This difference is due to occupational segregation and underrepresentation of women in supervisory positions.");

    // ---- First-Line Supervisors of Retail Sales Workers ----
    add("First-Line Supervisors of Retail Sales Workers",
        "Manage retail sales staff, coordinate schedules, and ensure sales targets are met.");
    addWhy("First-Line Supervisors of Retail Sales Workers",
        "Pay differences arise from underrepresentation in managerial roles and occupational segregation.");

    // ---- First-Line Supervisors of Housekeeping and Janitorial Workers ----
    add("First-Line Supervisors of Housekeeping and Janitorial Workers",
        "Oversee cleaning staff in hotels, offices, or other facilities.");
    addWhy("First-Line Supervisors of Housekeeping and Janitorial Workers",
        "This difference is influenced by occupational segregation and limited promotion opportunities.");

    // ---- Chefs and Head Cooks ----
    add("Chefs and Head Cooks",
        "Plan menus, supervise kitchen staff, and oversee food preparation and presentation.");
    addWhy("Chefs and Head Cooks",
        "The pay gap results from underrepresentation in high-end restaurants and executive culinary positions.");

    // ---- Maids and Housekeeping Cleaners ----
    add("Maids and Housekeeping Cleaners",
        "Perform cleaning duties in hotels, hospitals, and private homes.");
    addWhy("Maids and Housekeeping Cleaners",
        "Differences stem from gendered occupational roles and low pay scales.");

    // ---- Bakers ----
    add("Bakers",
        "Prepare and bake a variety of breads, pastries, and desserts.");
    addWhy("Bakers",
        "Pay differences stem from traditional gender roles in culinary tasks and underrepresentation in management.");

    // ---- Fast Food and Counter Workers ----
    add("Fast Food and Counter Workers",
        "Prepare and serve food and beverages quickly while maintaining hygiene and customer service standards.");
    addWhy("Fast Food and Counter Workers",
        "Differences are influenced by occupational segregation and limited promotion opportunities.");

    // ---- Cooks ----
    add("Cooks",
        "Prepare, season, and cook food according to recipes and standards.");
    addWhy("Cooks",
        "Pay differences arise from occupational segregation and underrepresentation in management or high-end culinary positions.");

    // ---- Food Preparation Workers ----
    add("Food Preparation Workers",
        "Assist in preparing ingredients and assembling meals in kitchens and restaurants.");
    addWhy("Food Preparation Workers",
        "Pay differences result from occupational segregation and underrepresentation in supervisory kitchen roles.");

    // ---- Food Service Managers ----
    add("Food Service Managers",
        "Oversee food preparation, presentation, portioning, budgets, and staff management.");
    addWhy("Food Service Managers",
        "This difference is due to gender bias and occupational segregation.");


}

    private void add(String title, String description) {
        descriptions.put(title.toLowerCase(), description);
    }

    private void addWhy(String title, String why) {
        whyReasons.put(title.toLowerCase(), why);
    }

    public String getDescription(String query) {
        if (query == null) return null;
        return descriptions.get(query.toLowerCase());
    }

    public String getWhy(String query) {
        if (query == null) return null;
        return whyReasons.get(query.toLowerCase());
    }

    public List<String> searchJobs(String query) {
        List<String> matches = new ArrayList<>();
        if (query == null || query.isEmpty()) return matches;

        query = query.toLowerCase();

        for (String key : descriptions.keySet()) {
            if (key.contains(query)) {
                matches.add(capitalizeJobTitle(key));
            }
        }
        return matches;
    }

    private String capitalizeJobTitle(String title) {
        String[] words = title.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String w : words) {
            if (w.length() > 0) {
                sb.append(Character.toUpperCase(w.charAt(0)))
                  .append(w.substring(1))
                  .append(" ");
            }
        }
        return sb.toString().trim();
    }
}

