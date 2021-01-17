
package vistas;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

/**
 *
 * @author JSS JIMENEZ
 */
public class PersonaFormulario extends JFrame{
    private JPanel panel = new JPanel();
    SpringLayout layout = new SpringLayout();

    public PersonaFormulario() {
        //muestra el panel
        this.show();
        //titulo ventana
        this.setTitle("REGISTRO" );
        this.setSize(600, 600);//tamaño ventana
        panel.setBackground(Color.pink);//color ventana
        panel.setLayout(layout);
        //TITULO 
        JLabel label1 = new JLabel("REGISTRO DE PERSONAS");
            label1.setFont(new Font("ITALIC", Font.BOLD, 25));
        panel.add(label1);
        
        JLabel label2 = new JLabel(" ID: ");
        label2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        panel.add(label2);
        
        JLabel label3 = new JLabel(" Nombres: ");
        label3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        panel.add(label3);
        
        JLabel label4 = new JLabel(" Apellidos: ");
        label4.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        panel.add(label4);
        
        JLabel label5 = new JLabel(" Cédula: ");
        label5.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        panel.add(label5);
        
        JLabel label6 = new JLabel(" Dirección: ");
        label6.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        panel.add(label6);
        
        JLabel label7 = new JLabel(" Correo: ");
        label7.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        panel.add(label7);
        
        JLabel label8 = new JLabel(" Teléfono: ");
        label8.setFont(new Font("Times New Roman", Font.PLAIN, 16));
        panel.add(label8);
        
        //texto id
        JTextField data1 = new JTextField("", 30);
        data1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        panel.add(data1);
        //texto nombres
        JTextField data2 = new JTextField("", 30);
        data2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        panel.add(data2);
        //texto apellidos
        JTextField data3 = new JTextField("", 30);
        data3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        panel.add(data3);
        //texto cedula
        JTextField data4 = new JTextField("", 30);
        data4.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        panel.add(data4);
        //texto direccion
        JTextField data5 = new JTextField("", 30);
        data5.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        panel.add(data5);
        //texto correo
        JTextField data6 = new JTextField("", 30);
        data6.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        panel.add(data6);
        //Texto telefono
        JTextField data7 = new JTextField("", 10);
        data6.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        panel.add(data7);

        JButton button1 = new JButton("REGISTRAR");
        button1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        panel.add(button1);
        JButton button2 = new JButton("ACTUALIZAR");
        button2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        panel.add(button2);
        JButton button3 = new JButton("ELIMINAR");
        button3.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        panel.add(button3);

        //título 
        layout.putConstraint(SpringLayout.WEST, label1, 120, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, label1, 40, SpringLayout.NORTH, panel);

        //ID
        layout.putConstraint(SpringLayout.WEST, label2, 50, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, label2, 100, SpringLayout.NORTH, panel);
        //NOMBRES
        layout.putConstraint(SpringLayout.WEST, label3, 50, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, label3, 135, SpringLayout.NORTH, panel);
        //APELLIDOS
        layout.putConstraint(SpringLayout.WEST, label4, 50, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, label4, 170, SpringLayout.NORTH, panel);
        //CEDULA
        layout.putConstraint(SpringLayout.WEST, label5, 50, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, label5, 205, SpringLayout.NORTH, panel);
        //DIRECCION
        layout.putConstraint(SpringLayout.WEST, label6, 50, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, label6, 240, SpringLayout.NORTH, panel);
        //CORREO
        layout.putConstraint(SpringLayout.WEST, label7, 50, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, label7, 275, SpringLayout.NORTH, panel);
        //TELEFONO
        layout.putConstraint(SpringLayout.WEST, label8, 50, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, label8, 310, SpringLayout.NORTH, panel);

        //texto de ID
        layout.putConstraint(SpringLayout.WEST, data1, 100, SpringLayout.WEST, label2);
        layout.putConstraint(SpringLayout.NORTH, data1, 100, SpringLayout.NORTH, panel);
        //texto de nombres
        layout.putConstraint(SpringLayout.WEST, data2, 100, SpringLayout.WEST, label2);
        layout.putConstraint(SpringLayout.NORTH, data2, 135, SpringLayout.NORTH, panel);
        //texto de apellidos
        layout.putConstraint(SpringLayout.WEST, data3, 100, SpringLayout.WEST, label2);
        layout.putConstraint(SpringLayout.NORTH, data3,170, SpringLayout.NORTH, panel);
        //texto de cedula
        layout.putConstraint(SpringLayout.WEST, data4, 100, SpringLayout.WEST, label2);
        layout.putConstraint(SpringLayout.NORTH, data4, 205, SpringLayout.NORTH, panel);
        //texto de direccion
        layout.putConstraint(SpringLayout.WEST, data5, 100, SpringLayout.WEST, label2);
        layout.putConstraint(SpringLayout.NORTH, data5, 240, SpringLayout.NORTH, panel);
        //texto de correo
        layout.putConstraint(SpringLayout.WEST, data6, 100, SpringLayout.WEST, label2);
        layout.putConstraint(SpringLayout.NORTH, data6, 275, SpringLayout.NORTH, panel);
        //texto de telefono
        layout.putConstraint(SpringLayout.WEST, data7, 100, SpringLayout.WEST, label2);
        layout.putConstraint(SpringLayout.NORTH, data7, 310, SpringLayout.NORTH, panel);

        //boton registrar clientes
        layout.putConstraint(SpringLayout.SOUTH, button1, 410, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, button1, 50, SpringLayout.WEST, panel);
        //boton actualizar clientes
        layout.putConstraint(SpringLayout.SOUTH, button2, 410, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, button2, 200, SpringLayout.WEST, panel);
        //boton eliminar clientes
        layout.putConstraint(SpringLayout.SOUTH, button3, 410, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, button3, 360, SpringLayout.WEST, panel);

        this.add(panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
