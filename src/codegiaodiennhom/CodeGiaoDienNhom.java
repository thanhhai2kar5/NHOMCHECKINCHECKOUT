/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package codegiaodiennhom;

/**
 *
 * @author pc
 */
import javax.swing.*;
import java.awt.*;

public class CodeGiaoDienNhom extends JFrame {
    private JTextField textField;
    private JLabel resultLabel;

    public CodeGiaoDienNhom() {
        setTitle("Chương trình nhóm");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(3, 1, 10, 10));

        // Tiêu đề
        JLabel titleLabel = new JLabel("Nhập thông tin", SwingConstants.CENTER);
        add(titleLabel);

        // Ô nhập thông tin
        textField = new JTextField();
        add(textField);

        // Nút xác nhận
        JButton confirmButton = new JButton("Hiển thị");
        add(confirmButton);

        // Nhãn hiển thị kết quả
        resultLabel = new JLabel("", SwingConstants.CENTER);
        add(resultLabel);

        // Sự kiện khi nhấn nút
        confirmButton.addActionListener(e -> {
            String inputText = textField.getText();
            resultLabel.setText("Bạn đã nhập: " + inputText);
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(CodeGiaoDienNhom::new);
    }
}

