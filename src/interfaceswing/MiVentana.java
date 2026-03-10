package interfaceswing;

import javax.swing.*;

public class MiVentana extends JFrame {
    public MiVentana(){
    //dimensiones (ancho, alto) de ventana
        this.setSize(1020,800);
    //titulo de ventana a generar
        this.setTitle("Mi primer ventana con JFrame");
    //cuando cierre ventana, se finaliza instancia de esta clase
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null); //centra ventana en monitor
        this.setVisible(true);
        JLabel lblHola = new JLabel("Hola Mundo!!!");
        this.add(lblHola);
    }
}
