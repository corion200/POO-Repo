package interfaceswing;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frmPersona extends JFrame {

    private JPanel pnlPersona;
    private JTextField txtId;
    private JTextField txtNombre;
    private JTextField txtEdad;
    private JTextField txtTelefono;
    private JComboBox<String> cmbSexo;
    private JButton btnObtenerDatos;
    private JButton btnLimpiar;
    private JPanel pnlBotones;
    private JTable tblDatos;
    private DefaultTableModel model;

    public frmPersona(String title) {

        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(pnlPersona);
        this.setMinimumSize(new Dimension(600, 500));
        this.setLocationRelativeTo(null);

        Object[][] data = null;

        String[] columns = {
                "Id", "Nombre", "Edad", "Telefono", "Sexo"
        };

        model = new DefaultTableModel(data, columns);

        tblDatos.setModel(model);

        btnObtenerDatos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BtnObtenerDatos();
            }
        });

        btnLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setBtnLimpiar();
            }
        });
    }

    private void BtnObtenerDatos() {

        String id, nombre, edad, telefono, sexo;

        id = txtId.getText();
        nombre = txtNombre.getText();
        edad = txtEdad.getText();
        telefono = txtTelefono.getText();
        sexo = cmbSexo.getSelectedItem().toString();

        JOptionPane.showMessageDialog(null,
                "Datos Obtenidos:\n" +
                        "ID: " + id +
                        "\nNombre: " + nombre +
                        "\nEdad: " + edad +
                        "\nTelefono: " + telefono +
                        "\nSexo: " + sexo
        );

        Object[] newRow = {id, nombre, edad, telefono, sexo};

        model.addRow(newRow);
    }

    private void setBtnLimpiar() {

        txtId.setText("");
        txtNombre.setText("");
        txtEdad.setText("");
        txtTelefono.setText("");
        cmbSexo.setSelectedIndex(0);

        txtId.requestFocus();
    }
}