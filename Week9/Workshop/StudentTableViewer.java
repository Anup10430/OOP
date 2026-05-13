package Workshop;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentTableViewer extends JFrame {
	 
    private JTable table;
    private DefaultTableModel tableModel;
 
    public StudentTableViewer() {
        setTitle("Student Records Viewer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 350);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
 
        // Title label
        JLabel titleLabel = new JLabel("Student Records", SwingConstants.CENTER);
        titleLabel.setFont(new Font("SansSerif", Font.BOLD, 18));
        titleLabel.setForeground(new Color(30, 70, 130));
        titleLabel.setBorder(BorderFactory.createEmptyBorder(14, 0, 10, 0));
        add(titleLabel, BorderLayout.NORTH);
 
        // Load CSV data
        String csvFile = "students.csv";
        List<String[]> data = new ArrayList<>();
        String[] columnHeaders = null;
 
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            String line;
            boolean isFirstLine = true;
 
            while ((line = br.readLine()) != null) {
                // Skip blank lines
                if (line.trim().isEmpty()) continue;
 
                String[] values = line.split(",");
 
                // Trim whitespace from each value
                for (int i = 0; i < values.length; i++) {
                    values[i] = values[i].trim();
                }
 
                if (isFirstLine) {
                    columnHeaders = values; // First row = headers
                    isFirstLine = false;
                } else {
                    data.add(values);
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this,
                "Error reading CSV file: " + e.getMessage(),
                "File Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
 
        // Build table model
        tableModel = new DefaultTableModel(columnHeaders, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Make table read-only
            }
        };
 
        for (String[] row : data) {
            tableModel.addRow(row);
        }
 
        // Create JTable
        table = new JTable(tableModel);
        table.setRowHeight(30);
        table.setFont(new Font("SansSerif", Font.PLAIN, 13));
        table.setSelectionBackground(new Color(180, 210, 250));
        table.setSelectionForeground(Color.BLACK);
        table.setGridColor(new Color(200, 210, 230));
        table.setShowGrid(true);
        table.setIntercellSpacing(new Dimension(1, 1));
 
        // Alternating row colors via custom renderer
        table.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(
                    JTable tbl, Object value, boolean isSelected,
                    boolean hasFocus, int row, int col) {
                Component c = super.getTableCellRendererComponent(
                        tbl, value, isSelected, hasFocus, row, col);
                if (!isSelected) {
                    c.setBackground(row % 2 == 0
                            ? Color.WHITE
                            : new Color(235, 243, 255));
                }
                setBorder(BorderFactory.createEmptyBorder(0, 8, 0, 8));
                return c;
            }
        });
 
        // Style header
        JTableHeader header = table.getTableHeader();
        header.setFont(new Font("SansSerif", Font.BOLD, 13));
        header.setBackground(new Color(30, 70, 130));
        header.setForeground(Color.WHITE);
        header.setPreferredSize(new Dimension(0, 36));
        ((DefaultTableCellRenderer) header.getDefaultRenderer())
                .setHorizontalAlignment(SwingConstants.CENTER);
 
        // Column widths
        table.getColumnModel().getColumn(0).setPreferredWidth(90);   // FIRST_NAME
        table.getColumnModel().getColumn(1).setPreferredWidth(90);   // LAST_NAME
        table.getColumnModel().getColumn(2).setPreferredWidth(240);  // ADDRESS
        table.getColumnModel().getColumn(3).setPreferredWidth(120);  // CONTACT_NUMBER
        table.getColumnModel().getColumn(4).setPreferredWidth(110);  // SEMESTER
 
        // Wrap table in scroll pane
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBorder(BorderFactory.createEmptyBorder(0, 16, 16, 16));
        add(scrollPane, BorderLayout.CENTER);
 
        // Status bar
        JLabel statusLabel = new JLabel(
            " " + data.size() + " record(s) loaded from " + csvFile);
        statusLabel.setFont(new Font("SansSerif", Font.ITALIC, 11));
        statusLabel.setForeground(Color.GRAY);
        statusLabel.setBorder(BorderFactory.createEmptyBorder(4, 16, 8, 0));
        add(statusLabel, BorderLayout.SOUTH);
    }
 
    public static void main(String[] args) {
        // Use system look and feel
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ignored) {}
 
        SwingUtilities.invokeLater(() -> {
            StudentTableViewer viewer = new StudentTableViewer();
            viewer.setVisible(true);
        });
    }
}
