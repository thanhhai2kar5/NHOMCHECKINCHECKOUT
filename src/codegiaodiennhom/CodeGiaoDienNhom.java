package codegiaodiennhom;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CodeGiaoDienNhom extends JFrame {
    private JTextField textField;
    private JLabel resultLabel, timeLabel;
    private JButton confirmButton, clearButton;

    public CodeGiaoDienNhom() {
        setTitle("Chương trình nhóm");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        // Tiêu đề
        JLabel titleLabel = new JLabel("Nhập thông tin", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        titleLabel.setForeground(Color.BLUE);
        add(titleLabel, BorderLayout.NORTH);

        // Panel nhập thông tin
        JPanel inputPanel = new JPanel(new GridLayout(2, 1, 5, 5));
        textField = new JTextField();
        inputPanel.add(textField);

        // Nhãn hiển thị thời gian nhập liệu
        timeLabel = new JLabel("", SwingConstants.CENTER);
        inputPanel.add(timeLabel);
        add(inputPanel, BorderLayout.CENTER);

        // Panel nút bấm
        JPanel buttonPanel = new JPanel();
        confirmButton = new JButton("Hiển thị");
        clearButton = new JButton("Xóa");

        // Định dạng màu sắc cho nút
        confirmButton.setBackground(Color.GREEN);
        clearButton.setBackground(Color.RED);
        confirmButton.setForeground(Color.WHITE);
        clearButton.setForeground(Color.WHITE);

        buttonPanel.add(confirmButton);
        buttonPanel.add(clearButton);
        add(buttonPanel, BorderLayout.SOUTH);

        // Nhãn hiển thị kết quả
        resultLabel = new JLabel("", SwingConstants.CENTER);
        resultLabel.setFont(new Font("Arial", Font.ITALIC, 14));
        resultLabel.setForeground(Color.DARK_GRAY);
        add(resultLabel, BorderLayout.SOUTH);

        // Sự kiện khi nhấn nút "Hiển thị"
        confirmButton.addActionListener(e -> {
            String inputText = textField.getText();
            String timeStamp = new SimpleDateFormat("HH:mm:ss").format(new Date());
            timeLabel.setText("Thời gian nhập: " + timeStamp);
            resultLabel.setText("Bạn đã nhập: " + inputText);
        });

        // Sự kiện khi nhấn nút "Xóa"
        clearButton.addActionListener(e -> {
            textField.setText("");
            resultLabel.setText("");
            timeLabel.setText("");
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(CodeGiaoDienNhom::new);
    }
}

        
    }
}

