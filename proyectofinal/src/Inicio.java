
import java.awt.Image;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;


public class Inicio extends javax.swing.JFrame {
    BufferedReader Importacion = null;
    BufferedReader Importacion2 = null;
    public static DefaultTableModel Datos = new DefaultTableModel();
    public static DefaultTableModel Top3 = new DefaultTableModel();
    
    
    public static ArrayList Original = new ArrayList();
    public static String TituloTabla[] = new String[15];
    public static int Filas = 0;
    public static int Columnas = 0;
    public static int HoraOpcion = 0;
    public static int EdadOpcion = 0;
    public static int GeneroOpcion = 0;
    public static int ArmaOpcion = 0;
    public static int MovilOpcion = 0;
    
    int OpcionHora = 0;
    int OpcionEdad = 0;
    int OpcionGenero = 0;
    int OpcionArma = 0;
    int BloquearBoton = 0;
    
    int GB = 1;
    int GC = 0;
    

    public Inicio() {
        initComponents();
        Top3.setRowCount(4);
        Top3.setColumnCount(3);
        jTable2.setShowGrid(true);
        TableColumnModel columnModel = jTable2.getColumnModel();
        columnModel.getColumn(1).setPreferredWidth(200);
        ImageIcon IM = new ImageIcon("Foto4.jpg");
        ImageIcon IM2 = new ImageIcon("Foto5.jpg");
        Icon IconoIM2 = new ImageIcon(IM2.getImage().getScaledInstance(Foto2.getWidth(),Foto2.getHeight(),Image.SCALE_DEFAULT));
        Foto2.setIcon(IconoIM2);
        ImageIcon IM3 = new ImageIcon("Foto3.jpg");
        Icon IconoIM3 = new ImageIcon(IM3.getImage().getScaledInstance(Foto3.getWidth(),Foto3.getHeight(),Image.SCALE_DEFAULT));
        Foto3.setIcon(IconoIM3);
        Filtro1.setEnabled(false);
        Filtro2.setEnabled(false);
        Filtro3.setEnabled(false);
        Filtro4.setEnabled(false);
        Filtro5.setEnabled(false);
        jTable1.setEnabled(false);
        jTable2.setEnabled(false);
        jTable1.setShowGrid(true);
        jTable2.setShowGrid(true);
        Reestablecer.setEnabled(false);
        Graficar.setEnabled(false);
        Exportar.setEnabled(false);
        TopTotal.setEnabled(false);
        TopDia.setEnabled(false);
        TopHora.setEnabled(false);
        TopBarrio.setEnabled(false);
        TopArma.setEnabled(false);
        TopMovilA.setEnabled(false);
        TopMovilV.setEnabled(false);
        TopPais.setEnabled(false);
        TopEdad.setEnabled(false);
        TopEscolaridad.setEnabled(false);
        TopEdad.setEnabled(false);
        FilasImportadas.setEnabled(false);
        ColumnasImportadas.setEnabled(false);
        Datos.setRowCount(4);
        Datos.setColumnCount(2);
        Opcion1.setEnabled(false);
        Opcion2.setEnabled(false);
        Opcion3.setEnabled(false);
        Opcion4.setEnabled(false);
        ListaGrafica.setEnabled(false);
        Barra.setEnabled(false);
        Circular.setEnabled(false);
        
    }

    public void FiltroHora(int Hora1Seleccionada, int Hora2Seleccionada){
        BloquearBoton++;
        if(BloquearBoton==3){
            Graficar.setEnabled(false);
        }
        int a = 0;
        int b = 0;
        int Hora = 0;
        int Minutos = 0;
        int ColumnaFiltro = 0;
        int AyudanteHora = 0;
        String Ayudante1 = "";
        String AyudanteFiltros[][] = new String[Filas][Columnas];
        ColumnaFiltro = 0;
                while(a<Columnas){
                    if("<html><b>HORA<html></b>".equalsIgnoreCase(Datos.getValueAt(0,a).toString())){
                        ColumnaFiltro = a;}
                        a++;
                }
                for (int i = 1; i < Filas; i++) {
                    Ayudante1 = Datos.getValueAt(i,ColumnaFiltro).toString();
                    if(Ayudante1.length()==5){
                        Minutos = Integer.parseInt(Ayudante1.substring(3,5));
                        Hora = Integer.parseInt(Ayudante1.substring(0,2));
                    }
                    if(Ayudante1.length()==4){
                        Minutos = Integer.parseInt(Ayudante1.substring(2,4));
                        Hora = Integer.parseInt(Ayudante1.substring(0,1));
                    }
                    if(Hora2Seleccionada==23){
                        AyudanteHora = 23;
                    }else{
                        AyudanteHora = 0;
                    }
                    if((Hora==Hora1Seleccionada && Minutos==1) || (Hora==Hora2Seleccionada-AyudanteHora && Minutos==0) || (Hora>=Hora1Seleccionada && Hora<Hora2Seleccionada)){
                        for (int j = 0; j < Columnas; j++) {
                            if(b==0){
                                AyudanteFiltros[b][j] = TituloTabla[j];
                            }
                            AyudanteFiltros[b+1][j] = Datos.getValueAt(i,j).toString();
                        }
                        b++;
                    }
                }
                Datos.setRowCount(b+1);
                Datos.setColumnCount(Columnas);
                FilasImportadas.setText(String.valueOf(b));
                ColumnasImportadas.setText(String.valueOf(Columnas));
                Filas = b;
                for (int i = 0; i < b+1; i++) {
                    for (int j = 0; j < Columnas; j++) {
                        Datos.setValueAt(AyudanteFiltros[i][j],i,j);
                    }
                }
                Filtro1.setEnabled(false);
                Filtro2.setEnabled(true);
                Opcion1.setEnabled(false);
                Opcion1.setSelected(false);
    }
    
    public void FiltroArma(String Arma){
        BloquearBoton++;
        if(BloquearBoton==3){
            Graficar.setEnabled(false);
        }
        String AyudanteFiltros2[][] = new String[Filas][Columnas];
        int a = 0;
        int ColumnaFiltro = 0;
        int b = 0;
        String Ayudante1 = "";
        while(a<Columnas){
                    if("<html><b>ARMA EMPLEADA<html></b>".equalsIgnoreCase(Datos.getValueAt(0,a).toString())){
                        ColumnaFiltro = a;}
                        a++;
                }
                for (int i = 1; i < Filas; i++) {
                    Ayudante1 = Datos.getValueAt(i,ColumnaFiltro).toString();
                    if(Ayudante1.equalsIgnoreCase(Arma)){
                        for (int j = 0; j < Columnas; j++) {
                            if(b==0){
                                AyudanteFiltros2[b][j] = TituloTabla[j];
                            }
                            AyudanteFiltros2[b+1][j] = Datos.getValueAt(i,j).toString();
                        }
                        b++;
                    }
                }
                Datos.setRowCount(b+1);
                Datos.setColumnCount(Columnas);
                FilasImportadas.setText(String.valueOf(b));
                ColumnasImportadas.setText(String.valueOf(Columnas));
                Filas = b;
                for (int i = 0; i < b+1; i++) {
                    for (int j = 0; j < Columnas; j++) {
                        Datos.setValueAt(AyudanteFiltros2[i][j],i,j);
                    }
                }
                Filtro2.setEnabled(false);
                Filtro3.setEnabled(true);
                TopArma.setEnabled(false);
                Opcion4.setEnabled(false);
                Opcion4.setSelected(false);
    }
    
    public void FiltroEdad(int Edad1, int Edad2){
        BloquearBoton++;
        if(BloquearBoton==3){
            Graficar.setEnabled(false);
        }
        String AyudanteFiltros3[][] = new String[Filas][Columnas];
        int a = 0;
        int ColumnaFiltro = 0;
        int b = 0;
        String Ayudante1 = "";
        while(a<Columnas){
            if("<html><b>EDAD<html></b>".equalsIgnoreCase(Datos.getValueAt(0,a).toString())){
                ColumnaFiltro = a;}
                a++;
            }
                for (int i = 1; i < Filas; i++) {
                    Ayudante1 = Datos.getValueAt(i,ColumnaFiltro).toString();
                    if(Ayudante1.equalsIgnoreCase("")){
                        
                    }else{
                    if((Integer.parseInt(Ayudante1)>=Edad1) && (Integer.parseInt(Ayudante1)<=Edad2)){
                        for (int j = 0; j < Columnas; j++) {
                            if(b==0){
                                AyudanteFiltros3[b][j] = TituloTabla[j];
                            }
                            AyudanteFiltros3[b+1][j] = Datos.getValueAt(i,j).toString();
                        }
                        b++;
                    }
                }}
                Datos.setRowCount(b+1);
                Datos.setColumnCount(Columnas);
                FilasImportadas.setText(String.valueOf(b));
                ColumnasImportadas.setText(String.valueOf(Columnas));
                Filas = b;
                for (int i = 0; i < b+1; i++) {
                    for (int j = 0; j < Columnas; j++) {
                        Datos.setValueAt(AyudanteFiltros3[i][j],i,j);
                    }
                }
                Filtro3.setEnabled(false);
                Filtro4.setEnabled(true);
                Opcion2.setEnabled(false);
                Opcion2.setSelected(false);
    }
    
    public void FiltroGenero(String Genero){
        BloquearBoton++;
        if(BloquearBoton==3){
            Graficar.setEnabled(false);
        }
        String AyudanteFiltros4[][] = new String[Filas][Columnas];
        int a = 0;
        int b = 0;
        int ColumnaFiltro = 0;
        String Ayudante1 = "";
        while(a<Columnas){
            if("<html><b>SEXO<html></b>".equalsIgnoreCase(Datos.getValueAt(0,a).toString())){
                ColumnaFiltro = a;}
                a++;
            }
                for (int i = 1; i < Filas; i++) {
                    Ayudante1 = Datos.getValueAt(i,ColumnaFiltro).toString();
                    if(Ayudante1.equalsIgnoreCase(Genero)){
                        for (int j = 0; j < Columnas; j++) {
                            if(b==0){
                                AyudanteFiltros4[b][j] = TituloTabla[j];
                            }
                            AyudanteFiltros4[b+1][j] = Datos.getValueAt(i,j).toString();
                        }
                        b++;
                    }
                }
                Datos.setRowCount(b+1);
                Datos.setColumnCount(Columnas);
                FilasImportadas.setText(String.valueOf(b));
                ColumnasImportadas.setText(String.valueOf(Columnas));
                Filas = b;
                for (int i = 0; i < b+1; i++) {
                    for (int j = 0; j < Columnas; j++) {
                        Datos.setValueAt(AyudanteFiltros4[i][j],i,j);
                    }
                }
                Filtro4.setEnabled(false);
                Filtro5.setEnabled(true);
                Opcion3.setEnabled(false);
                Opcion3.setSelected(false);
    }
    
    public void FiltroMovilidad(String Movilidad){
        BloquearBoton++;
        if(BloquearBoton==3){
            Graficar.setEnabled(false);
        }
        int a = 0;
        int b = 0;
        int ColumnaFiltro = 0;
        String Ayudante1 = "";
        String AyudanteFiltros5[][] = new String[Filas][Columnas];
        while(a<Columnas){
            if("<html><b>MOVIL AGRESOR<html></b>".equalsIgnoreCase(Datos.getValueAt(0,a).toString())){
                ColumnaFiltro = a;}
                a++;
            }
                for (int i = 1; i < Filas; i++) {
                    Ayudante1 = Datos.getValueAt(i,ColumnaFiltro).toString();
                    if(Ayudante1.equalsIgnoreCase(Movilidad)){
                        for (int j = 0; j < Columnas; j++) {
                            if(b==0){
                                AyudanteFiltros5[b][j] = TituloTabla[j];
                            }
                            AyudanteFiltros5[b+1][j] = Datos.getValueAt(i,j).toString();
                        }
                        b++;
                    }
                }
                Datos.setRowCount(b+1);
                Datos.setColumnCount(Columnas);
                FilasImportadas.setText(String.valueOf(b));
                ColumnasImportadas.setText(String.valueOf(Columnas));
                Filas = b;
                for (int i = 0; i < b+1; i++) {
                    for (int j = 0; j < Columnas; j++) {
                        Datos.setValueAt(AyudanteFiltros5[i][j],i,j);
                    }
                }
                Filtro5.setEnabled(false);
                TopMovilA.setEnabled(false);
    }
    
public void ObtenerTop1(int Columna){
        HashMap<Object, Integer> Tops = new HashMap();
        int a = 0;
        int b = 1;
      for (int i = 1; i <= Filas; i++) {
                if((Datos.getValueAt(i,Columna).toString()).equalsIgnoreCase("")){
                }else{
                Tops.put((Datos.getValueAt(i, Columna)), 0);
                }
            }
            for (int j = 1; j <= Filas; j++) {
                if((Datos.getValueAt(j,Columna).toString()).equalsIgnoreCase("")){
                }else{
                a = Tops.get(Datos.getValueAt(j, Columna));
                a++;
                Tops.put((Datos.getValueAt(j, Columna)), a);
                }
            }
            ArrayList Orden = new ArrayList();
            ArrayList Orden2 = new ArrayList();
            for (Map.Entry<Object, Integer> e : Tops.entrySet()) {
                Object key = e.getKey();
                Object value = e.getValue();
                Orden2.add(key);
                Orden.add(value);
            }
            if(Orden2.size()<3){
                JOptionPane.showMessageDialog(this, "NO ES POSIBLE REALIZAR UN TOP3 PORQUE NO SE CUENTAN CON LOS DATOS SUFICIENTES");
            }else{
            int z = 1;
            while (z<4) {
            for (int i=0; i<Orden.size();i++){
                b=1;
                for (int j=Orden.size()-1; j>=0;j--){
                if (Integer.parseInt(Orden.get(i).toString())>=Integer.parseInt((Orden.get(j)).toString())){
                    b++;
                }
                if((b==Orden.size()+1) && (z<4)){
                    Top3.setValueAt(Orden2.get(i), z, 1);
                    Top3.setValueAt(Orden.get(i), z, 2);
                    Orden.remove(i);
                    Orden2.remove(i);
                    z++;
                    b=1;
                }
            }
        }}}
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        Foto2 = new javax.swing.JLabel();
        Titulo = new javax.swing.JTextField();
        Foto3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Filtro1 = new javax.swing.JComboBox<>();
        Filtro2 = new javax.swing.JComboBox<>();
        Filtro3 = new javax.swing.JComboBox<>();
        Filtro4 = new javax.swing.JComboBox<>();
        Filtro5 = new javax.swing.JComboBox<>();
        Exportar = new javax.swing.JButton();
        Importar = new javax.swing.JButton();
        FilasImportadas = new javax.swing.JTextField();
        ColumnasImportadas = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Graficar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        Reestablecer = new javax.swing.JButton();
        TopDia = new javax.swing.JRadioButton();
        TopHora = new javax.swing.JRadioButton();
        TopBarrio = new javax.swing.JRadioButton();
        TopArma = new javax.swing.JRadioButton();
        TopMovilA = new javax.swing.JRadioButton();
        TopMovilV = new javax.swing.JRadioButton();
        TopEdad = new javax.swing.JRadioButton();
        TopPais = new javax.swing.JRadioButton();
        TopEscolaridad = new javax.swing.JRadioButton();
        TopTotal = new javax.swing.JButton();
        Barra = new javax.swing.JRadioButton();
        Circular = new javax.swing.JRadioButton();
        Opcion1 = new javax.swing.JRadioButton();
        Opcion2 = new javax.swing.JRadioButton();
        Opcion3 = new javax.swing.JRadioButton();
        Opcion4 = new javax.swing.JRadioButton();
        ListaGrafica = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));
        jPanel1.setForeground(new java.awt.Color(0, 102, 255));

        Foto2.setText("jLabel1");

        Titulo.setEditable(false);
        Titulo.setBackground(new java.awt.Color(255, 102, 0));
        Titulo.setFont(new java.awt.Font("Cooper Black", 1, 30)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Titulo.setText("HURTOS EN BOGOTÁ COLOMBIA PARA EL 2015");
        Titulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));
        Titulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TituloActionPerformed(evt);
            }
        });

        Foto3.setText("jLabel3");

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jTable1.setModel(Datos);
        jTable1.setTableHeader(null);
        jScrollPane1.setViewportView(jTable1);

        Filtro1.setFont(new java.awt.Font("BankGothic Md BT", 1, 12)); // NOI18N
        Filtro1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin Filtro", "00:01 - 06:00", "06:01 - 12:00", "12:01 - 18:00", "18:01 - 00:00" }));
        Filtro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Filtro1ActionPerformed(evt);
            }
        });

        Filtro2.setFont(new java.awt.Font("BankGothic Md BT", 1, 12)); // NOI18N
        Filtro2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin Filtro", "Blanca", "de Fuego", "Contundente", "Cortante", "Escopolamina", "Jeringa", "No Reportado", "Perro", "Sin Arma" }));
        Filtro2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Filtro2ActionPerformed(evt);
            }
        });

        Filtro3.setFont(new java.awt.Font("BankGothic Md BT", 1, 12)); // NOI18N
        Filtro3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin Filtro", "0 - 15 años", "16 - 30 años", "31 - 45 años", "46 - 60 años", "61 años o más" }));
        Filtro3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Filtro3ActionPerformed(evt);
            }
        });

        Filtro4.setFont(new java.awt.Font("BankGothic Md BT", 1, 12)); // NOI18N
        Filtro4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin Filtro", "Femenino", "Masculino" }));
        Filtro4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Filtro4ActionPerformed(evt);
            }
        });

        Filtro5.setFont(new java.awt.Font("BankGothic Md BT", 1, 12)); // NOI18N
        Filtro5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin Filtro", "A pie", "Bicicleta", "Conductor Bus", "Conductor Motocicleta", "Conductor Taxi", "No Reportado", "Pasajero Bus", "Pasajero Metro", "Pasajero Motocicleta", "Pasajero Taxi", "Vehiculo" }));
        Filtro5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Filtro5ActionPerformed(evt);
            }
        });

        Exportar.setBackground(new java.awt.Color(0, 153, 0));
        Exportar.setFont(new java.awt.Font("BankGothic Lt BT", 1, 14)); // NOI18N
        Exportar.setForeground(new java.awt.Color(255, 255, 255));
        Exportar.setText("EXPORTAR DATOS");
        Exportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExportarActionPerformed(evt);
            }
        });

        Importar.setBackground(new java.awt.Color(0, 0, 153));
        Importar.setFont(new java.awt.Font("BankGothic Lt BT", 1, 14)); // NOI18N
        Importar.setForeground(new java.awt.Color(255, 255, 255));
        Importar.setText("IMPORTAR DATOS");
        Importar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImportarActionPerformed(evt);
            }
        });

        FilasImportadas.setFont(new java.awt.Font("BankGothic Md BT", 1, 14)); // NOI18N
        FilasImportadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilasImportadasActionPerformed(evt);
            }
        });

        ColumnasImportadas.setFont(new java.awt.Font("BankGothic Md BT", 1, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("BankGothic Md BT", 1, 14)); // NOI18N
        jLabel1.setText("FILAS IMPORTADAS");

        jLabel2.setFont(new java.awt.Font("BankGothic Md BT", 1, 14)); // NOI18N
        jLabel2.setText("COLUMNAS IMPORTADAS");

        jLabel3.setBackground(new java.awt.Color(0, 0, 204));
        jLabel3.setFont(new java.awt.Font("BankGothic Md BT", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Hora");

        jLabel4.setBackground(new java.awt.Color(0, 0, 204));
        jLabel4.setFont(new java.awt.Font("BankGothic Md BT", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Arma Empleada");

        jLabel5.setBackground(new java.awt.Color(0, 0, 204));
        jLabel5.setFont(new java.awt.Font("BankGothic Md BT", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Edad");

        jLabel6.setBackground(new java.awt.Color(0, 0, 204));
        jLabel6.setFont(new java.awt.Font("BankGothic Md BT", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Género");

        jLabel7.setBackground(new java.awt.Color(0, 0, 204));
        jLabel7.setFont(new java.awt.Font("BankGothic Md BT", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Movilidad Agresor");

        Graficar.setBackground(new java.awt.Color(153, 0, 0));
        Graficar.setFont(new java.awt.Font("BankGothic Md BT", 1, 14)); // NOI18N
        Graficar.setForeground(new java.awt.Color(255, 255, 255));
        Graficar.setText("GRAFICAR");
        Graficar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GraficarActionPerformed(evt);
            }
        });

        jTable2.setFont(new java.awt.Font("BankGothic Md BT", 0, 11)); // NOI18N
        jTable2.setModel(Top3);
        jTable2.setTableHeader(null);
        jScrollPane2.setViewportView(jTable2);

        Reestablecer.setBackground(new java.awt.Color(0, 153, 153));
        Reestablecer.setFont(new java.awt.Font("BankGothic Md BT", 1, 14)); // NOI18N
        Reestablecer.setForeground(new java.awt.Color(255, 255, 255));
        Reestablecer.setText("PREDETERMINADO");
        Reestablecer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReestablecerActionPerformed(evt);
            }
        });

        buttonGroup1.add(TopDia);
        TopDia.setFont(new java.awt.Font("Lucida Sans", 1, 8)); // NOI18N
        TopDia.setText("Día");

        buttonGroup1.add(TopHora);
        TopHora.setFont(new java.awt.Font("Lucida Sans", 1, 8)); // NOI18N
        TopHora.setText("Hora");

        buttonGroup1.add(TopBarrio);
        TopBarrio.setFont(new java.awt.Font("Lucida Sans", 1, 8)); // NOI18N
        TopBarrio.setText("Barrio");

        buttonGroup1.add(TopArma);
        TopArma.setFont(new java.awt.Font("Lucida Sans", 1, 8)); // NOI18N
        TopArma.setText("Arma empleada");

        buttonGroup1.add(TopMovilA);
        TopMovilA.setFont(new java.awt.Font("Lucida Sans", 1, 8)); // NOI18N
        TopMovilA.setText("Movilidad Agresor");

        buttonGroup1.add(TopMovilV);
        TopMovilV.setFont(new java.awt.Font("Lucida Sans", 1, 8)); // NOI18N
        TopMovilV.setText("Movilidad Victima");

        buttonGroup1.add(TopEdad);
        TopEdad.setFont(new java.awt.Font("Lucida Sans", 1, 8)); // NOI18N
        TopEdad.setText("Edad");

        buttonGroup1.add(TopPais);
        TopPais.setFont(new java.awt.Font("Lucida Sans", 1, 8)); // NOI18N
        TopPais.setText("País Nacimiento");

        buttonGroup1.add(TopEscolaridad);
        TopEscolaridad.setFont(new java.awt.Font("Lucida Sans", 1, 8)); // NOI18N
        TopEscolaridad.setText("Escolaridad");

        TopTotal.setBackground(new java.awt.Color(255, 0, 0));
        TopTotal.setFont(new java.awt.Font("BankGothic Md BT", 1, 10)); // NOI18N
        TopTotal.setForeground(new java.awt.Color(255, 255, 255));
        TopTotal.setText("TOP 3");
        TopTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TopTotalActionPerformed(evt);
            }
        });

        buttonGroup2.add(Barra);
        Barra.setFont(new java.awt.Font("BankGothic Lt BT", 0, 12)); // NOI18N
        Barra.setText("Grafico Barras");
        Barra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BarraActionPerformed(evt);
            }
        });

        buttonGroup2.add(Circular);
        Circular.setFont(new java.awt.Font("BankGothic Lt BT", 0, 12)); // NOI18N
        Circular.setText("Grafico Circular");
        Circular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CircularActionPerformed(evt);
            }
        });

        Opcion1.setFont(new java.awt.Font("BankGothic Md BT", 1, 12)); // NOI18N
        Opcion1.setText("Hora");
        Opcion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Opcion1ActionPerformed(evt);
            }
        });

        Opcion2.setFont(new java.awt.Font("BankGothic Md BT", 1, 12)); // NOI18N
        Opcion2.setText("Edad");
        Opcion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Opcion2ActionPerformed(evt);
            }
        });

        Opcion3.setFont(new java.awt.Font("BankGothic Md BT", 1, 12)); // NOI18N
        Opcion3.setText("Género");
        Opcion3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Opcion3ActionPerformed(evt);
            }
        });

        Opcion4.setFont(new java.awt.Font("BankGothic Md BT", 1, 12)); // NOI18N
        Opcion4.setText("Arma");
        Opcion4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Opcion4ActionPerformed(evt);
            }
        });

        ListaGrafica.setFont(new java.awt.Font("BankGothic Md BT", 1, 12)); // NOI18N
        ListaGrafica.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hora", "Edad", "Genero", "Arma" }));
        ListaGrafica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListaGraficaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Titulo)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Foto2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Filtro4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Filtro2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Filtro3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(41, 41, 41)
                                        .addComponent(Filtro1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(44, 44, 44)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Filtro5, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(298, 298, 298))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(286, 286, 286)
                                .addComponent(Reestablecer)
                                .addContainerGap(587, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1304, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(TopTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(TopHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(TopBarrio, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                                            .addComponent(TopDia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(33, 33, 33)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(TopArma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(TopMovilA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(TopMovilV, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TopPais, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(TopEdad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(TopEscolaridad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Foto3, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(ColumnasImportadas, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(83, 83, 83)
                                                .addComponent(FilasImportadas, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(Opcion4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Opcion3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Opcion2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Opcion1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(Circular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(Barra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(28, 28, 28)
                                                .addComponent(ListaGrafica, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGap(69, 69, 69))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Exportar)
                                .addGap(59, 59, 59)
                                .addComponent(Importar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Graficar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(113, 113, 113))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Foto2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Filtro5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Filtro2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Filtro4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Filtro3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Filtro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(Reestablecer)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Foto3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TopDia)
                                    .addComponent(TopArma)
                                    .addComponent(TopEdad))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TopHora)
                                    .addComponent(TopMovilA)
                                    .addComponent(TopPais))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TopBarrio)
                                    .addComponent(TopMovilV)
                                    .addComponent(TopEscolaridad))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TopTotal)
                            .addComponent(Exportar)
                            .addComponent(Importar)
                            .addComponent(Graficar))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FilasImportadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ColumnasImportadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Opcion1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(Opcion2)
                                            .addComponent(Circular)))
                                    .addComponent(Barra))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Opcion3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Opcion4))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(ListaGrafica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)))
                        .addGap(31, 31, 31))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TituloActionPerformed

    private void ImportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImportarActionPerformed
        String Ayudante = "";
        String Ayudante2 = "";
        String Negrilla = "";
        String[] Informacion;
        String[] Informacion2;
        
        int j = 0;
        try{
            JOptionPane.showMessageDialog(this, "SE IMPORTARA EL ARCHIVO 'Base de datos Hurtos.csv'","IMPORTACION",JOptionPane.INFORMATION_MESSAGE);
            Exportar.setEnabled(true);
            Filtro1.setEnabled(true);
            Importar.setEnabled(false);
            Reestablecer.setEnabled(true);
            Graficar.setEnabled(false);
            Exportar.setEnabled(false);
            TopTotal.setEnabled(true);
            TopDia.setEnabled(true);
            TopBarrio.setEnabled(true);
            TopMovilV.setEnabled(true);
            TopPais.setEnabled(true);
            TopEscolaridad.setEnabled(true);
            TopEdad.setEnabled(true);
            TopHora.setEnabled(true);
            TopArma.setEnabled(true);
            TopMovilA.setEnabled(true);
            Exportar.setEnabled(true);
            Opcion1.setEnabled(true);
            Opcion2.setEnabled(true);
            Opcion3.setEnabled(true);
            Opcion4.setEnabled(true);
            Barra.setSelected(true);
            Barra.setEnabled(true);
            Circular.setEnabled(true);
            Importacion = new BufferedReader(new FileReader("Base de datos Hurtos.csv"));
            Importacion2 = new BufferedReader(new FileReader("Base de datos Hurtos.csv"));
            while((Ayudante = Importacion.readLine())!=null){
                Informacion = Ayudante.split(";");
                Columnas = Informacion.length;
                Datos.setColumnCount(Columnas);
                Filas++;
            }
            Datos.setRowCount(Filas);
            FilasImportadas.setText(String.valueOf(Filas));
            ColumnasImportadas.setText(String.valueOf(Columnas));
            while((Ayudante2 = Importacion2.readLine())!=null){
                Informacion2 = Ayudante2.split(";");
                for(int i=0; i<Columnas; i++){
                    if(j==0){
                        Negrilla = Informacion2[i];
                        Datos.setValueAt("<html><b>" + Negrilla + "<html></b>", j, i);
                        TituloTabla[i] = "<html><b>" + Negrilla + "<html></b>";
                        Original.add("<html><b>" + Negrilla + "<html></b>");
                    }else{
                        Datos.setValueAt(Informacion2[i], j, i);
                        Original.add(Informacion2[i]);
                    }                }
                j++;
            }
            Filas = Filas-1;
        }catch (FileNotFoundException ex){
            Logger.getLogger(Inicio.class.getName()). log(Level.SEVERE, null, ex);
        }catch (IOException ex){
            Logger.getLogger(Inicio.class.getName()). log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ImportarActionPerformed

    private void Filtro3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Filtro3ActionPerformed
        int Edad1 = 0;
        int Edad2 = 0;
        String AyudanteFiltros3[][] = new String[Filas][Columnas];
        String FiltroEdad = new String();
        FiltroEdad = Filtro3.getSelectedItem().toString();
        switch (FiltroEdad){
            case "0 - 15 años":
                Edad1 = 0;
                Edad2 = 15;
                FiltroEdad(Edad1,Edad2);
                break;
            case "16 - 30 años":
                Edad1 = 16;
                Edad2 = 30;
                FiltroEdad(Edad1,Edad2);
                break;
            case "31 - 45 años":
                Edad1 = 31;
                Edad2 = 45;
                FiltroEdad(Edad1,Edad2);
                break;
            case "46 - 60 años":
                Edad1 = 46;
                Edad2 = 60;
                FiltroEdad(Edad1,Edad2);
                break;
            case "61 años o más":
                Edad1 = 61;
                Edad2 = 100;
                FiltroEdad(Edad1,Edad2);
                break;
            case"Sin Filtro":
                for (int i = 0; i < Filas; i++) {
                    for (int j = 0; j < Columnas; j++) {
                        AyudanteFiltros3[i][j] = Datos.getValueAt(i,j).toString();
                    }
                }
                Filtro3.setEnabled(false);
                Filtro4.setEnabled(true);
                break;
        }
    }//GEN-LAST:event_Filtro3ActionPerformed

    private void Filtro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Filtro1ActionPerformed
        Opcion1.setSelected(false);
        Opcion2.setSelected(false);
        Opcion3.setSelected(false);
        Opcion4.setSelected(false);
        OpcionHora = 0;
        OpcionEdad = 0;
        OpcionGenero = 0;
        OpcionArma = 0;
        int Hora1Seleccionada = 0;
        int Hora2Seleccionada = 0;
        String AyudanteFiltros[][] = new String[Filas][Columnas];
        String FiltroHora = new String();
        FiltroHora = Filtro1.getSelectedItem().toString();
        switch (FiltroHora){
            case "00:01 - 06:00":
                Hora1Seleccionada = 0;
                Hora2Seleccionada = 6;
                FiltroHora(Hora1Seleccionada,Hora2Seleccionada);
                break;
            case "06:01 - 12:00":
                Hora1Seleccionada = 6;
                Hora2Seleccionada = 12;
                FiltroHora(Hora1Seleccionada,Hora2Seleccionada);
                break;
            case "12:01 - 18:00":
                Hora1Seleccionada = 12;
                Hora2Seleccionada = 18;
                FiltroHora(Hora1Seleccionada,Hora2Seleccionada);
                break;
            case "18:01 - 00:00":
                Hora1Seleccionada = 18;
                Hora2Seleccionada = 23;
                FiltroHora(Hora1Seleccionada,Hora2Seleccionada);
                break;
            case "Sin Filtro":
                for (int i = 0; i < Filas; i++) {
                    for (int j = 0; j < Columnas; j++) {
                        AyudanteFiltros[i][j] = Datos.getValueAt(i,j).toString();
                    }
                }
                Filtro1.setEnabled(false);
                Filtro2.setEnabled(true);
                break;
        }
    }//GEN-LAST:event_Filtro1ActionPerformed

    private void ReestablecerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReestablecerActionPerformed
        BloquearBoton = 0;
        Filtro1.setEnabled(true);
        Filtro2.setEnabled(false);
        Filtro3.setEnabled(false);
        Filtro4.setEnabled(false);
        Filtro5.setEnabled(false);
        TopTotal.setEnabled(true);
        TopArma.setEnabled(true);
        TopMovilA.setEnabled(true);
        Opcion1.setEnabled(true);
        Opcion2.setEnabled(true);
        Opcion3.setEnabled(true);
        Opcion4.setEnabled(true);
        int a = 0;
        Filas =  Original.size()/15;
        Columnas = 15;
        Datos.setRowCount(Filas);
        Datos.setColumnCount(Columnas);
        for (int i = 0; i < Filas; i++) {
                    for (int j = 0; j < Columnas; j++) {
                        Datos.setValueAt(Original.get(a),i,j);
                        a++;
                    }
                }
        FilasImportadas.setText(String.valueOf(Filas));
        ColumnasImportadas.setText(String.valueOf(Columnas));
    }//GEN-LAST:event_ReestablecerActionPerformed

    private void Filtro2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Filtro2ActionPerformed
        String Arma = "";
        String AyudanteFiltros2[][] = new String[Filas][Columnas];
        String FiltroArma = new String();
        FiltroArma = Filtro2.getSelectedItem().toString();
        switch (FiltroArma){
            case "Blanca":
                Arma = "ARMA BLANCA";
                FiltroArma(Arma);
                break;
            case "de Fuego":
                Arma = "ARMA DE FUEGO";
                FiltroArma(Arma);
                break;
            case "Contundente":
                Arma = "CONTUNDENTES";
                FiltroArma(Arma);
                break;
            case "Cortante":
                Arma = "CORTANTES";
                FiltroArma(Arma);
                break;
            case "Escopolamina":
                Arma = "ESCOPOLAMINA";
                FiltroArma(Arma);
                break;
            case "Jeringa":
                Arma = "JERINGA";
                FiltroArma(Arma);
                break;
            case "No Reportado":
                Arma = "NO REPORTADO";
                FiltroArma(Arma);
                break;
            case "Perro":
                Arma = "PERRO";
                FiltroArma(Arma);
                break;
            case "Sin Arma":
                Arma = "SIN EMPLEO DE ARMAS";
                FiltroArma(Arma);
                break;
            case "Sin Filtro":
                for (int i = 0; i < Filas; i++) {
                    for (int j = 0; j < Columnas; j++) {
                        AyudanteFiltros2[i][j] = Datos.getValueAt(i,j).toString();
                    }
                }
                Filtro2.setEnabled(false);
                Filtro3.setEnabled(true);
                TopArma.setEnabled(true);
                break;
        }
    }//GEN-LAST:event_Filtro2ActionPerformed

    private void Filtro4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Filtro4ActionPerformed
        String Genero = "";
        String AyudanteFiltros4[][] = new String[Filas][Columnas];
        String FiltroGenero = new String();
        FiltroGenero = Filtro4.getSelectedItem().toString();
        
        switch (FiltroGenero){
            case"Femenino":
                Genero = "FEMENINO";
                FiltroGenero(Genero);
                break;
            case"Masculino":
                Genero = "MASCULINO";
                FiltroGenero(Genero);
                break;
            case"Sin Filtro":
                for (int i = 0; i < Filas; i++) {
                    for (int j = 0; j < Columnas; j++) {
                        AyudanteFiltros4[i][j] = Datos.getValueAt(i,j).toString();
                    }
                }
                Filtro4.setEnabled(false);
                Filtro5.setEnabled(true);
                break;
        }
    }//GEN-LAST:event_Filtro4ActionPerformed

    private void Filtro5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Filtro5ActionPerformed
        String Movilidad = "";
        String AyudanteFiltros5[][] = new String[Filas][Columnas];
        String FiltroMovilidad = new String();
        FiltroMovilidad = Filtro5.getSelectedItem().toString();
        
        switch (FiltroMovilidad){
            case"A pie":
                Movilidad = "A PIE";
                FiltroMovilidad(Movilidad);
                break;
            case"Bicicleta":
                Movilidad = "BICICLETA";
                FiltroMovilidad(Movilidad);
                break;
            case"Conductor Bus":
                Movilidad = "CONDUCTOR BUS";
                FiltroMovilidad(Movilidad);
                break;
            case"Conductor Motocicleta":
                Movilidad = "CONDUCTOR MOTOCICLETA";
                FiltroMovilidad(Movilidad);
                break;
            case"Conductor Taxi":
                Movilidad = "CONDUCTOR TAXI";
                FiltroMovilidad(Movilidad);
                break;
            case"No Reportado":
                Movilidad = "NO REPORTADO";
                FiltroMovilidad(Movilidad);
                break;
            case"Pasajero Bus":
                Movilidad = "PASAJERO BUS";
                FiltroMovilidad(Movilidad);
                break;
            case"Pasajero Metro":
                Movilidad = "PASAJERO METRO";
                FiltroMovilidad(Movilidad);
                break;
            case"Pasajero Motocicleta":
                Movilidad = "PASAJERO MOTOCICLETA";
                FiltroMovilidad(Movilidad);
                break;
            case"Pasajero Taxi":
                Movilidad = "PASAJERO TAXI";
                FiltroMovilidad(Movilidad);
                break;
            case"Vehiculo":
                Movilidad = "VEHICULO";
                FiltroMovilidad(Movilidad);
                break;
            case"Sin Filtros":
                for (int i = 0; i < Filas; i++) {
                    for (int j = 0; j < Columnas; j++) {
                        AyudanteFiltros5[i][j] = Datos.getValueAt(i,j).toString();
                    }
                }
                Filtro5.setEnabled(false);
                TopMovilA.setEnabled(true);
                break;
        }
    }//GEN-LAST:event_Filtro5ActionPerformed

    private void TopTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TopTotalActionPerformed
        Top3.setValueAt("NUMERO", 0, 0);
        Top3.setValueAt("DESCRIPCIÓN", 0, 1);
        Top3.setValueAt("VALOR", 0, 2);
        Top3.setValueAt("   1", 1, 0);
        Top3.setValueAt("   2", 2, 0);
        Top3.setValueAt("   3", 3, 0);
        if (TopDia.isSelected()&&TopDia.isEnabled()) {
            ObtenerTop1(0);
        }
        if (TopBarrio.isSelected()&&TopBarrio.isEnabled()) {
            ObtenerTop1(2);
        }
        if (TopArma.isSelected()&&TopArma.isEnabled()) {
            ObtenerTop1(5);
        }
        if (TopMovilA.isSelected()&&TopMovilA.isEnabled()) {
            ObtenerTop1(6);
        }
        if (TopMovilV.isSelected()&&TopMovilV.isEnabled()) {
            ObtenerTop1(7);
        }
        if (TopPais.isSelected()&&TopPais.isEnabled()) {
            ObtenerTop1(11);
        }
        if (TopEscolaridad.isSelected()&&TopEscolaridad.isEnabled()) {
            ObtenerTop1(14);
        }
        if(TopHora.isSelected()&&TopHora.isEnabled()){
            ObtenerTop1(1);
        }
        
        if(TopEdad.isSelected()&&TopEdad.isEnabled()){
            ObtenerTop1(8);
        }
    }//GEN-LAST:event_TopTotalActionPerformed

    private void ExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExportarActionPerformed
         FileWriter Exportacion = null;
         String Titulo[] = new String[15];
         Titulo[0] = "DIA"; Titulo[1] = "HORA"; Titulo[2] = "BARRIO";Titulo[3] = "ZONA";Titulo[4] = "CLASE SITIO";
         Titulo[5] = "ARMA EMPLEADA"; Titulo[6] = "MOVIL AGRESOR";Titulo[7] = "MOVIL VICTIMA";Titulo[8] = "EDAD";Titulo[9] = "SEXO";
         Titulo[10] = "ESTADO CIVIL";Titulo[11] = "PAIS NACE";Titulo[12] = "CALSE EMPLEADO";Titulo[13] = "PROFESION";Titulo[14] = "ESCOLARIDAD";
         try{
            Exportacion = new FileWriter("BasedeDatosFiltrada.csv");
            for(int i = 0; i<=Integer.parseInt(FilasImportadas.getText());i++){
                for (int j = 0;j< Integer.parseInt(ColumnasImportadas.getText());j++){
                    if(i==0){
                        Exportacion.append(String.valueOf(Titulo[j]));
                        Exportacion.append(";");
                    }else{
                        Exportacion.append(String.valueOf(Datos.getValueAt(i, j)));
                        Exportacion.append(";");
                    }
                }
                Exportacion.append("\n");
            }
            
            JOptionPane.showMessageDialog(this, "DATOS EXPORTADOS CORRECTAMENTE","VALIDO",JOptionPane.INFORMATION_MESSAGE);
        }catch(IOException ex){
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE,null, ex);
} finally{
            try{
                Exportacion.close();
            }catch(IOException ex){
                Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE,null, ex);
            }
        }
    }//GEN-LAST:event_ExportarActionPerformed

    private void FilasImportadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilasImportadasActionPerformed
        
    }//GEN-LAST:event_FilasImportadasActionPerformed

    private void GraficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GraficarActionPerformed
        String TitulosBarras[] = new String[2];
        
        int a = 0;
        if(Opcion1.isSelected()){
            TitulosBarras[a] = "Hora";
            a++;
        }
        if(Opcion2.isSelected()){
            TitulosBarras[a] = "Edad";
            a++;
        }
        if(Opcion3.isSelected()){
            TitulosBarras[a] = "Genero";
            a++;            
        }
        if(Opcion4.isSelected()){
            TitulosBarras[a] = "Arma";
            a++;
        }
        DiagramasBarras Barras = new DiagramasBarras();
        Barras.Graficando(TitulosBarras);
    }//GEN-LAST:event_GraficarActionPerformed

    private void Opcion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Opcion1ActionPerformed
        if(OpcionHora==0){
            OpcionHora = 1;}
        else{
            OpcionHora = 0;
        }
        if(OpcionHora+OpcionEdad+OpcionArma+OpcionGenero==2){
            Graficar.setEnabled(true);
        }else{
            Graficar.setEnabled(false);
        }
    }//GEN-LAST:event_Opcion1ActionPerformed

    private void Opcion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Opcion2ActionPerformed
        if(OpcionEdad==0){
            OpcionEdad = 1;}
        else{
            OpcionEdad = 0;
        }
        if(OpcionHora+OpcionEdad+OpcionArma+OpcionGenero==2){
            Graficar.setEnabled(true);
        }else{
            Graficar.setEnabled(false);
        }
    }//GEN-LAST:event_Opcion2ActionPerformed

    private void Opcion3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Opcion3ActionPerformed
        if(OpcionGenero==0){
            OpcionGenero=1;}
        else{
            OpcionGenero=0;
        }
        if(OpcionHora+OpcionEdad+OpcionArma+OpcionGenero==2){
            Graficar.setEnabled(true);
        }else{
            Graficar.setEnabled(false);
        }
    }//GEN-LAST:event_Opcion3ActionPerformed

    private void Opcion4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Opcion4ActionPerformed
        if(OpcionArma==0){
            OpcionArma = 1;}
        else{
            OpcionArma = 0;
        }
        if(OpcionHora+OpcionEdad+OpcionArma+OpcionGenero==2){
            Graficar.setEnabled(true);
        }else{
            Graficar.setEnabled(false);
        }
    }//GEN-LAST:event_Opcion4ActionPerformed

    private void BarraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BarraActionPerformed
        if(Barra.isSelected()){
            ListaGrafica.setEnabled(false);
            Opcion1.setSelected(false);
            Opcion2.setSelected(false);
            Opcion3.setSelected(false);
            Opcion4.setSelected(false);
            OpcionHora = 0;
            OpcionEdad = 0;
            OpcionArma = 0;
            OpcionGenero = 0;
            if(Filtro1.getSelectedIndex()==0){
                Opcion1.setEnabled(true);
                OpcionHora = 1;
            }
            if(Filtro2.getSelectedIndex()==0){
                Opcion4.setEnabled(true);
                OpcionArma = 1;
            }
            if(Filtro3.getSelectedIndex()==0){
                Opcion2.setEnabled(true);
                OpcionEdad = 1;
            }
            if(Filtro4.getSelectedIndex()==0){
                Opcion3.setEnabled(true);
                OpcionGenero = 1;
            }
            if(OpcionHora+OpcionEdad+OpcionArma+OpcionGenero==2){
            Graficar.setEnabled(true);
            }else{
            Graficar.setEnabled(false);
        }
        }else{
            ListaGrafica.setEnabled(true);
        }
    }//GEN-LAST:event_BarraActionPerformed

    private void CircularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CircularActionPerformed
        if(Circular.isSelected()){
            ListaGrafica.setEnabled(true);
            Opcion1.setEnabled(false);
            Opcion2.setEnabled(false);
            Opcion3.setEnabled(false);
            Opcion4.setEnabled(false);
            Opcion1.setSelected(false);
            Opcion2.setSelected(false);
            Opcion3.setSelected(false);
            Opcion4.setSelected(false);
            Graficar.setEnabled(false);
        }else{
            ListaGrafica.setEnabled(false);
        }
    }//GEN-LAST:event_CircularActionPerformed

    private void ListaGraficaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListaGraficaActionPerformed
        String Lista = new String();
        Lista = ListaGrafica.getSelectedItem().toString();
        String Opcion = "";
        if (Filas>0){
        switch (Lista){
            case "Hora":
                Opcion = "Hora";
                DiagramasCirculares DiagramaHora = new DiagramasCirculares();
                DiagramaHora.Graficando2(Opcion);
                break;
            case "Edad":
                Opcion = "Edad";
                DiagramasCirculares DiagramaEdad = new DiagramasCirculares();
                DiagramaEdad.Graficando2(Opcion);
                break;
            case "Genero":
                Opcion = "Genero";
                DiagramasCirculares DiagramaGenero = new DiagramasCirculares();
                DiagramaGenero.Graficando2(Opcion);
                break;
            case "Arma":
                Opcion = "Arma";
                DiagramasCirculares DiagramaArma = new DiagramasCirculares();
                DiagramaArma.Graficando2(Opcion);
                break;
        }}else{
            JOptionPane.showMessageDialog(this, "NO EXISTEN DATOS PARA GRAFICAR");
        }
    }//GEN-LAST:event_ListaGraficaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JRadioButton Barra;
    public static javax.swing.JRadioButton Circular;
    private javax.swing.JTextField ColumnasImportadas;
    private javax.swing.JButton Exportar;
    private javax.swing.JTextField FilasImportadas;
    private javax.swing.JComboBox<String> Filtro1;
    private javax.swing.JComboBox<String> Filtro2;
    private javax.swing.JComboBox<String> Filtro3;
    private javax.swing.JComboBox<String> Filtro4;
    private javax.swing.JComboBox<String> Filtro5;
    private javax.swing.JLabel Foto2;
    private javax.swing.JLabel Foto3;
    private javax.swing.JButton Graficar;
    private javax.swing.JButton Importar;
    private javax.swing.JComboBox<String> ListaGrafica;
    public static javax.swing.JRadioButton Opcion1;
    public static javax.swing.JRadioButton Opcion2;
    public static javax.swing.JRadioButton Opcion3;
    public static javax.swing.JRadioButton Opcion4;
    private javax.swing.JButton Reestablecer;
    private javax.swing.JTextField Titulo;
    private javax.swing.JRadioButton TopArma;
    private javax.swing.JRadioButton TopBarrio;
    private javax.swing.JRadioButton TopDia;
    private javax.swing.JRadioButton TopEdad;
    private javax.swing.JRadioButton TopEscolaridad;
    private javax.swing.JRadioButton TopHora;
    private javax.swing.JRadioButton TopMovilA;
    private javax.swing.JRadioButton TopMovilV;
    private javax.swing.JRadioButton TopPais;
    private javax.swing.JButton TopTotal;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
