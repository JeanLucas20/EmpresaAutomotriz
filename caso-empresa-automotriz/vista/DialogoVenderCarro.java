package vista;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;

public class DialogoVenderCarro extends JDialog
{
    //----------------------
    // Atributos
    //----------------------
    private JLabel lbPrecioCarro;
    private JLabel lbNombreVendedor;
    private JTextField tfPrecioCarro;
    private JButton btVenderCarro;

    //----------------------
    // Metodos
    //----------------------
    public DialogoVenderCarro()
    {
        //Definición del layout del Dialogo
        this.setLayout(null);

        //Crear y agregar elementos
        String nombre = vista.PanelEntradaDatos.getEmpleado();
        lbNombreVendedor = new JLabel("Nombre del vendedor: " + nombre);
        lbNombreVendedor.setFont(new Font("Sans",Font.BOLD,12));
        lbNombreVendedor.setForeground(Color.BLUE);
        lbNombreVendedor.setBounds(30,15,240,20);
        this.add(lbNombreVendedor);

        lbPrecioCarro = new JLabel("Precio Carro: ");
        lbPrecioCarro.setBounds(10,50,140,20);
        this.add(lbPrecioCarro);

        tfPrecioCarro = new JTextField();
        tfPrecioCarro.setBounds(150,50,100, 25);
        this.add(tfPrecioCarro);

        btVenderCarro = new JButton("Vender");
        btVenderCarro.setBounds(20,140,260,25);
        btVenderCarro.setActionCommand("vender");
        this.add(btVenderCarro);

        //Caracteristicas de la ventana
        this.setTitle("Vender Carro");
        this.setSize(300,300);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }

    //Metodos de acceso
    public String getPrecioCarro()
    {
        return tfPrecioCarro.getText();
    }

    public void agregarOyenteBoton(ActionListener pAL)
    {
        btVenderCarro.addActionListener(pAL);
    }

    public void cerrarDialogoVenderCarro()
    {
        this.dispose();
    }

}
