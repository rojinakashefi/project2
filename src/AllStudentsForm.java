import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AllStudentsForm extends JFrame implements ActionListener {
    private JPanel panel;
    private JComboBox selectProfNameCombo;
    private JTable professorInfoTable;
    private JButton cancelBtn;

    AllStudentsForm() {
        selectProfNameCombo = new JComboBox();
        professorInfoTable = new JTable();
        String column_names[]= {"Student", "Course Name","Time Range"};
        DefaultTableModel table_model = new DefaultTableModel(column_names,8);
        professorInfoTable =new JTable(table_model);
        cancelBtn = new JButton(" Cancel ");
        panel = new JPanel();
        BoxLayout boxLayout = new BoxLayout(panel, BoxLayout.Y_AXIS);
        panel.setLayout(boxLayout);
        panel.add(Box.createRigidArea(new Dimension(0, 20)));
        panel.add(new JScrollPane(professorInfoTable));
        panel.add(Box.createRigidArea(new Dimension(0, 20)));
        panel.add(cancelBtn);
        panel.setBorder(new EmptyBorder(10, 10, 10, 10));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        cancelBtn.addActionListener(this);
        add(panel, BorderLayout.CENTER);
        setTitle("ADD PROFESSOR");
        setSize(500, 500);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == cancelBtn) {
            dispose();
        }
    }

}
