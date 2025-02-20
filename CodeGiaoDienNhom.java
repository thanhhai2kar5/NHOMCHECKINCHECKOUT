package codegiaodiennhom;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CodeGiaoDienNhom extends JFrame {
    private JTextField textField;
    private JLabel resultLabel;
    private DefaultListModel<String> listModel;
    private JList<String> displayList;

    public CodeGiaoDienNhom() {
        setTitle("Chương trình nhóm ");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        // Panel nhập dữ liệu
        // Cập nhật chức năng Thêm
        JPanel inputPanel = new JPanel(new GridLayout(2, 1, 10, 10));
        JLabel titleLabel = new JLabel("Nhập thông tin ", SwingConstants.CENTER);
        textField = new JTextField();
        inputPanel.add(titleLabel);
        inputPanel.add(textField);
        add(inputPanel, BorderLayout.NORTH);
        // Danh sách hiển thị dữ liệu
        listModel = new DefaultListModel<>();
        displayList = new JList<>(listModel);
        add(new JScrollPane(displayList), BorderLayout.CENTER);
        // Panel chứa các nút chức năng
        JPanel buttonPanel = new JPanel(new GridLayout(1, 3, 10, 10));
        JButton addButton = new JButton("Thêm"); // Việt Anh
        buttonPanel.add(addButton);
        add(buttonPanel, BorderLayout.SOUTH);
        // Chức năng Thêm - Việt Anh
        addButton.addActionListener(e -> {
            String inputText = textField.getText().trim();
            if (!inputText.isEmpty()) {
                listModel.addElement(inputText);
                textField.setText("");
            }
        });
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(CodeGiaoDienNhom::new);
    }
}
