/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nuevo_compilador;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import java.io.*;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
/**
 *
 * @author Jonnathan
 */
public class Nuevo_compilador extends JFrame {
    File f=null;
    int cont=0;
    public  JTextArea    _editArea;
    public JTextArea    _editAreaE;
    private JLabel       _Row;
    private JLabel       _Column;
    private JFileChooser _fileChooser = new JFileChooser();
    //... Create actions for menu items, buttons, ...
    private Action _openAction = new OpenAction();
    private Action _saveAction = new SaveAction();
    private Action _exitAction = new ExitAction(); 
    
    private CaretListener  cListener = new CaretListener() {
        
        @Override
        public void caretUpdate(CaretEvent e) {       
            _Row.setText( "Fila: " + String.valueOf(getRowAndColumn()[0]));
            _Column.setText("Columna: " +String.valueOf(getRowAndColumn()[1]));   
        }  
    };
    
    //===================================================================== main
    public static void main(String[] args) {
        
        new Nuevo_compilador();
    }
    
    //============================================================== constructor
    public Nuevo_compilador() {
        _editArea = new JTextArea(1, 1);
        _editArea.setBorder(BorderFactory.createEmptyBorder(2,2,2,2));
        _editArea.setFont(new Font("monospaced", Font.PLAIN, 14));
        JScrollPane scrollingText = new JScrollPane(_editArea);
        _editArea.addCaretListener(cListener);
         
        _editAreaE = new JTextArea(1, 50);
        _editAreaE.setBorder(BorderFactory.createEmptyBorder(2,2,2,2));
        _editAreaE.setFont(new Font("monospaced", Font.PLAIN, 14));
        JScrollPane scrollingTextE = new JScrollPane(_editAreaE);
        _editAreaE.addCaretListener(cListener);

        //Labels de Row y Column
        _Row = new JLabel("Fila: " + String.valueOf(getRowAndColumn()[0]));
        _Column = new JLabel("Columna: " + String.valueOf(getRowAndColumn()[1]));
        
        
        
        final JFrame vtn = new JFrame();
        vtn.setTitle("Compilador");
        vtn.setSize(1100,600);
        vtn.setDefaultCloseOperation(EXIT_ON_CLOSE);
         
        JPanel content = new JPanel();
        content.setLayout(new BorderLayout());
        content.add(scrollingText);
        vtn.add(content);

        JPanel content2 = new JPanel();
        content2.setLayout(new BorderLayout());
        content2.add(scrollingTextE);
        vtn.add(content2,BorderLayout.EAST);
         
        JPanel content1 = new JPanel();
        content1.add(_Row);
        content1.add(_Column);
        vtn.add(content1,BorderLayout.SOUTH);

        //... Create menubar
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = menuBar.add(new JMenu("Archivo"));
        fileMenu.setMnemonic('F');
        JMenuItem nuevo = new JMenuItem( "Nuevo" );
        fileMenu.add(nuevo);
        nuevo.addActionListener(
         new ActionListener() {
            public void actionPerformed( ActionEvent evento )
            {
                _editArea.setText("");
                _editAreaE.setText("");
                cont=0;
                f=null;
            }
         }
        );
        fileMenu.add(_openAction);
        fileMenu.add(_saveAction);
        fileMenu.addSeparator(); 
        fileMenu.add(_exitAction);
        
        JMenu fileMenu1 = menuBar.add(new JMenu("Herramientas"));
        final JMenuItem compilar = new JMenuItem( "Compilar" );
        fileMenu1.add(compilar);
        /*final JMenuItem parser = new JMenuItem( "Parser" );
        fileMenu1.add(parser).setEnabled(false);*/
        
        compilar.addActionListener(
         new ActionListener() {
            public void actionPerformed( ActionEvent evento )
            {
                if(cont==0){
                    int retval = _fileChooser.showSaveDialog(Nuevo_compilador.this);
                    if (retval == JFileChooser.APPROVE_OPTION) {
                        f = _fileChooser.getSelectedFile();
                        try {
                            FileWriter writer = new FileWriter(f);
                            _editArea.write(writer);  // Use TextComponent write
                        } catch (IOException ioex) {
                            JOptionPane.showMessageDialog(Nuevo_compilador.this, ioex);
                            System.exit(1);
                        }
                    }
                }
                try {
                        FileWriter writer = new FileWriter(f);
                        _editArea.write(writer);  // Use TextComponent write
                    } catch (IOException ioex) {
                        JOptionPane.showMessageDialog(Nuevo_compilador.this, ioex);
                        System.exit(1); 
                    }
                try {
                    reconocedor_tokens.tokens(f);
                } catch (Exception ex) {
                    Logger.getLogger(Nuevo_compilador.class.getName()).log(Level.SEVERE, null, ex);
                }
                int posc=1;
                _editAreaE.setText(Scanner.token.get(0).toString());
                    while(posc<Scanner.token.size()){
                        //_editAreaE. setText(Scanner.error.get(pos).toString());
                         _editAreaE.append(Scanner.token.get(posc).toString());
                        posc++;
                    }
                Scanner.token.clear();
                if(Scanner.error.size()>0){
                    int pos=0;
                    _editAreaE.append("----------------------------------------------------------------------------\n");
                    //_editAreaE.append(Scanner.error.get(0).toString());
                    while(pos<Scanner.error.size()){
                        //_editAreaE. setText(Scanner.error.get(pos).toString());
                         _editAreaE.append(Scanner.error.get(pos).toString());
                        pos++;
                    }   
                    Scanner.error.clear();        
                }
                _editAreaE.append("----------------------------------------------------------------------------\n");
                _editAreaE.append("Scanner Completo.\n");
                //else{_editAreaE.setText("Scanner Completo.");}
                //parser.setEnabled(true);
                
                if(parser.error_parser.size()>0){
                    int pos=0;
                    _editAreaE.append("----------------------------------------------------------------------------\n");
                    _editAreaE.append("Errores Parser.\n");
                    _editAreaE.append("----------------------------------------------------------------------------\n");
                    //_editAreaE.append(Scanner.error.get(0).toString());
                    while(pos<parser.error_parser.size()){
                        //_editAreaE. setText(Scanner.error.get(pos).toString());
                         _editAreaE.append(parser.error_parser.get(pos).toString());
                        pos++;
                    }   
                    parser.error_parser.clear();        
                }
                _editAreaE.append("----------------------------------------------------------------------------\n");
                //_editAreaE.append("Scanner Completo.");
            }
         }
      );
        
       /* parser.addActionListener(
         new ActionListener() {
            public void actionPerformed( ActionEvent evento )
            {
                scanner.setEnabled(false);
                //Driver.parser_r(reconocedor_tokens.s);
                _editAreaE.setText("Parser");
                
                
            }
         }
      );*/
        //setJMenuBar(menuBar);
        vtn.add(menuBar,BorderLayout.NORTH);
        vtn.setVisible(true);
        //pack();  
    }

    
    class OpenAction extends AbstractAction {
        //============================================= constructor
        public OpenAction() {
            super("Abrir");
            //putValue(MNEMONIC_KEY, new Integer('A'));
        }
        
        //========================================= actionPerformed
        public void actionPerformed(ActionEvent e) {
            int retval = _fileChooser.showOpenDialog(Nuevo_compilador.this);
            if (retval == JFileChooser.APPROVE_OPTION) {
                f = _fileChooser.getSelectedFile();
                cont=1;
                try {
                    FileReader reader = new FileReader(f);
                    _editArea.read(reader, "");  // Use TextComponent read
                } catch (IOException ioex) {
                    //System.out.println(e);
                    JOptionPane.showMessageDialog(Nuevo_compilador.this, ioex);
                    System.exit(1);
                }
            }
        }
    }
    
    class SaveAction extends AbstractAction {
        //============================================= constructor
        SaveAction() {
            super("Guardar");
            //putValue(MNEMONIC_KEY, new Integer('G'));
        }
        
        //========================================= actionPerformed
        public void actionPerformed(ActionEvent e) {
            int retval = _fileChooser.showSaveDialog(Nuevo_compilador.this);
            if (retval == JFileChooser.APPROVE_OPTION) {
                f = _fileChooser.getSelectedFile();
                try {
                    FileWriter writer = new FileWriter(f);
                    _editArea.write(writer);  // Use TextComponent write
                } catch (IOException ioex) {
                    JOptionPane.showMessageDialog(Nuevo_compilador.this, ioex);
                    System.exit(1);
                }
                cont=1;
            }
        }
    }

    class ExitAction extends AbstractAction {
        //============================================= constructor
        public ExitAction() {
            super("Salir");
            putValue(MNEMONIC_KEY, new Integer('S'));
        }
        
        //========================================= actionPerformed
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }
    
    public int[] getRowAndColumn(){
        int caretpos =0;
        int[] posicion = new int[2];
        try{
        caretpos = _editArea.getCaretPosition();
        posicion[0] = _editArea.getLineOfOffset(caretpos);
        posicion[1] = caretpos - _editArea.getLineStartOffset(posicion[0]);
        }
        catch(Exception e){}
        return posicion;
    }
}