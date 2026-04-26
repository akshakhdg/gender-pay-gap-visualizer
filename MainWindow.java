

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class MainWindow extends JFrame {

    private final DataManager dataManager;
    private final JobDescriptionManager descriptionManager;

    private JTextField searchField;
    private JPopupMenu suggestionMenu;
    private JLabel jobTitleValue;
    private JTextArea jobDescriptionValue;
    private JTextArea whyValueArea;
    private JProgressBar femaleBar;
    private JLabel femaleValueLabel;
    private JProgressBar maleBar;
    private JLabel maleValueLabel;

    private final Color DEEP_BLUE = new Color(44, 62, 80);
    private final Color CORAL_PINK = new Color(231, 76, 60);
    private final Color LIGHT_GRAY = new Color(236, 240, 241);
    private final Color WHITE = Color.WHITE;
    private final Color BLACK = Color.BLACK;

    public MainWindow() {
        super("Gender Pay Gap Visualizer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900, 600);
        setLocationRelativeTo(null);

        dataManager = new DataManager("//Users/akulii/Desktop/salary-data-analysis-tool/salary_dataset.csv");
        descriptionManager = new JobDescriptionManager();

        initUI();
        showImportancePopup();

        setVisible(true);
    }

    private void initUI() {

        JLabel title = new JLabel("Gender Pay Gap Visualizer", SwingConstants.CENTER);
        title.setFont(new Font("Segoe UI", Font.BOLD, 24));
        add(title, BorderLayout.NORTH);

        JPanel main = new JPanel(new GridBagLayout());
        main.setBorder(BorderFactory.createEmptyBorder(20, 40, 20, 40));
        add(main, BorderLayout.CENTER);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(12, 0, 12, 0);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 3;

        
        JPanel searchRow = new JPanel(new BorderLayout(8, 8));
        searchField = new JTextField();
        searchField.setFont(new Font("Segoe UI", Font.PLAIN, 16));

        suggestionMenu = new JPopupMenu();

        searchField.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            public void changedUpdate(javax.swing.event.DocumentEvent e) { showSuggestions(); }
            public void removeUpdate(javax.swing.event.DocumentEvent e) { showSuggestions(); }
            public void insertUpdate(javax.swing.event.DocumentEvent e) { showSuggestions(); }
        });

        JButton btnSearch = new JButton("Search");
        btnSearch.setFont(new Font("Segoe UI", Font.PLAIN, 14));

        searchRow.add(searchField, BorderLayout.CENTER);
        searchRow.add(btnSearch, BorderLayout.EAST);
        main.add(searchRow, gbc);

        searchField.addActionListener(e -> doSearch());
        btnSearch.addActionListener(e -> doSearch());

        // Job Title
        gbc.gridy++;
        gbc.gridwidth = 1;
        gbc.gridx = 0;
        JLabel jobTitleLabel = new JLabel("Job Title:");
        jobTitleLabel.setFont(new Font("Segoe UI", Font.BOLD, 18));
        main.add(jobTitleLabel, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 2;
        jobTitleValue = new JLabel("");
        jobTitleValue.setFont(new Font("Segoe UI", Font.PLAIN, 17));
        main.add(jobTitleValue, gbc);

        // Description
        gbc.gridy++;
        gbc.gridx = 0;
        gbc.gridwidth = 1;
        JLabel descLabel = new JLabel("Job Description:");
        descLabel.setFont(new Font("Segoe UI", Font.BOLD, 18));
        main.add(descLabel, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 2;
        jobDescriptionValue = new JTextArea();
        jobDescriptionValue.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        jobDescriptionValue.setLineWrap(true);
        jobDescriptionValue.setWrapStyleWord(true);
        jobDescriptionValue.setEditable(false);
        jobDescriptionValue.setOpaque(false);
        jobDescriptionValue.setFocusable(false);

        // Let the text wrap naturally without a box UI
        jobDescriptionValue.setBorder(BorderFactory.createEmptyBorder());

        main.add(jobDescriptionValue, gbc);


        // Female Salary
        gbc.gridy++;
        gbc.gridx = 0;
        gbc.gridwidth = 1;
        JLabel femaleLabel = new JLabel("Female Avg Salary:");
        femaleLabel.setFont(new Font("Segoe UI", Font.BOLD, 18));
        main.add(femaleLabel, gbc);

        gbc.gridx = 1;
        femaleBar = new JProgressBar(0, 100);
        femaleBar.setStringPainted(true);
        femaleBar.setPreferredSize(new Dimension(320, 26));
        main.add(femaleBar, gbc);

        gbc.gridx = 2;
        femaleValueLabel = new JLabel("");
        femaleValueLabel.setFont(new Font("Segoe UI", Font.PLAIN, 17));
        main.add(femaleValueLabel, gbc);

        // Male Salary
        gbc.gridy++;
        gbc.gridx = 0;
        JLabel maleLabel = new JLabel("Male Avg Salary:");
        maleLabel.setFont(new Font("Segoe UI", Font.BOLD, 18));
        main.add(maleLabel, gbc);

        gbc.gridx = 1;
        maleBar = new JProgressBar(0, 100);
        maleBar.setStringPainted(true);
        maleBar.setPreferredSize(new Dimension(320, 26));
        main.add(maleBar, gbc);

        gbc.gridx = 2;
        maleValueLabel = new JLabel("");
        maleValueLabel.setFont(new Font("Segoe UI", Font.PLAIN, 17));
        main.add(maleValueLabel, gbc);

        // WHY SECTION (multiline)
        gbc.gridy++;
        gbc.gridx = 0;
        JLabel whyLabel = new JLabel("Why?");
        whyLabel.setFont(new Font("Segoe UI", Font.BOLD, 18));
        main.add(whyLabel, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 2;
        whyValueArea = new JTextArea();
        whyValueArea.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        whyValueArea.setWrapStyleWord(true);
        whyValueArea.setLineWrap(true);
        whyValueArea.setOpaque(false);
        whyValueArea.setEditable(false);
        main.add(whyValueArea, gbc);
    }


  
    private void showSuggestions() {
        String text = searchField.getText().trim().toLowerCase();
        suggestionMenu.setVisible(false);
        suggestionMenu.removeAll();

        if (text.isEmpty()) return;

        List<String> matches = descriptionManager.searchJobs(text);
        if (matches.isEmpty()) return;

        for (String job : matches) {
            JMenuItem item = new JMenuItem(job);
            item.addActionListener(e -> {
                searchField.setText(job);
                suggestionMenu.setVisible(false);
                doSearch();
            });
            suggestionMenu.add(item);
        }

        suggestionMenu.show(searchField, 0, searchField.getHeight());
    }

    
    private void doSearch() {
        String query = searchField.getText().trim();
        if (query.isEmpty()) return;

        jobTitleValue.setText(query);

        // Description
        String desc = descriptionManager.getDescription(query);
        jobDescriptionValue.setText(desc != null ? desc : "No description available."+ "If No description is available for all occupations please "
                + ""
                + "CHANGE the filepath in the datamanager function");

        // Salary data
        SalaryData data = dataManager.search(query);

        if (data == null) {
            femaleBar.setValue(0);
            femaleBar.setString("N/A");
            maleBar.setValue(0);
            maleBar.setString("N/A");
            femaleValueLabel.setText("N/A");
            maleValueLabel.setText("N/A");
            whyValueArea.setText("Salary data not available for this job.");
            return;
        }

        double female = data.getWomen();
        double male = data.getMen();

        femaleValueLabel.setText(String.format("%.1f USD", female));
        maleValueLabel.setText(String.format("%.1f USD", male));

        int max = (int) Math.ceil(Math.max(female, male) * 1.1);
        femaleBar.setMaximum(max);
        maleBar.setMaximum(max);

        femaleBar.setValue((int) female);
        maleBar.setValue((int) male);
        femaleBar.setString(String.format("%.1f USD", female));
        maleBar.setString(String.format("%.1f USD", male));

        // WHY explanation (from your data)
        String why = descriptionManager.getWhy(query);
        if (why != null)
            whyValueArea.setText(why);
        else
            whyValueArea.setText("No explanation available for this job.");
    }

    
    private void showImportancePopup() {
        JDialog popup = new JDialog(this, "Why is gender pay gap important?", true);
        popup.setSize(500, 300);
        popup.setLocationRelativeTo(this);
        popup.setLayout(new BorderLayout(10, 10));

        JLabel titleLabel = new JLabel("Why is gender pay gap important?", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Georgia", Font.BOLD, 20));
        popup.add(titleLabel, BorderLayout.NORTH);

        JTextArea paragraph = new JTextArea(
            "Gender pay gap is important because it displays economic gender inequality for women, resulting in lower retirement rates and savings for women, and lower lifetime earnings. "
             +"It is important to understand and acknowledge gender pay gap because it shows the inequalities in a work place "
                    + "and gives the opportunity for corporations to be more equitable and fair as an establishment. "
                +"Salary data from : bls.gov/opub/ted/2024/womens-earnings-were-83-6-percent-of-mens-in-2023.htm \n\n" +
                    " PLEASE CHANGE FILEPATH FOR CSV FILE IF YOU RUN INTO NO DESCRIPTION ERROR FOR ALL JOBS  "
        );
        paragraph.setWrapStyleWord(true);
        paragraph.setLineWrap(true);
        paragraph.setEditable(false);
        popup.add(paragraph, BorderLayout.CENTER);

        JButton btnClose = new JButton("Close");
        btnClose.addActionListener(e -> popup.dispose());
        popup.add(btnClose, BorderLayout.SOUTH);

        popup.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MainWindow::new);
    }
}

    