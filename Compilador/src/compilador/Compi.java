package compilador;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;


///////////////////////////////////////////////////////////////////////// NutPad
public class Compi extends JFrame {
    //... Components 
    File f=null;
    int cont=0;
    public JTextArea    _editArea;
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
                
            _Row.setText( "ROW: " + String.valueOf(getRowAndColumn()[0]));
            _Column.setText("COLUMN: " +String.valueOf(getRowAndColumn()[1]));
            
            //throw new UnsupportedOperationException("Not supported yet.");
        }
        
    };
    
    //===================================================================== main
    public static void main(String[] args) {
        
        new Compi();
    }
    
    //============================================================== constructor
    public Compi() {
        
        //... Create scrollable text area.
        _editArea = new JTextArea(15, 80);
        //_editArea.getText();
        _editArea.setBorder(BorderFactory.createEmptyBorder(2,2,2,2));
        _editArea.setFont(new Font("monospaced", Font.PLAIN, 14));
        JScrollPane scrollingText = new JScrollPane(_editArea);
         _editArea.addCaretListener(cListener);
        
        //Labels de Row y Column
        _Row = new JLabel("ROW: " + String.valueOf(getRowAndColumn()[0]));
        _Column = new JLabel("COLUMN: " + String.valueOf(getRowAndColumn()[1]));
        
        
        //-- Create a content pane, set layout, add component.
        JPanel content = new JPanel();
        content.setLayout(new BorderLayout());
        content.add(scrollingText, BorderLayout.CENTER);
        content.add(_Row,BorderLayout.SOUTH);
        content.add(_Column,BorderLayout.EAST);
        
        
        //... Create menubar
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = menuBar.add(new JMenu("Archivo"));
        fileMenu.setMnemonic('F');
        fileMenu.add(_openAction);       // Note use of actions, not text.
        fileMenu.add(_saveAction);
        fileMenu.addSeparator(); 
        fileMenu.add(_exitAction);
        JMenu fileMenu1 = menuBar.add(new JMenu("Compilar"));
        JMenuItem scanner = new JMenuItem( "Scanner" );
        fileMenu1.add(scanner);
        scanner.addActionListener(
 
         new ActionListener() {  // clase interna anónima
 
            // mostrar cuadro de diálogo de mensaje cuando el usuario seleccione Acerca de...
            public void actionPerformed( ActionEvent evento )
            {
                if(cont==0){
                int retval = _fileChooser.showSaveDialog(Compi.this);
                if (retval == JFileChooser.APPROVE_OPTION) {
                    f = _fileChooser.getSelectedFile();
                    try {
                        FileWriter writer = new FileWriter(f);
                        _editArea.write(writer);  // Use TextComponent write
                    } catch (IOException ioex) {
                        JOptionPane.showMessageDialog(Compi.this, ioex);
                        System.exit(1);
                    }
                }}
                try {
                        FileWriter writer = new FileWriter(f);
                        _editArea.write(writer);  // Use TextComponent write
                    } catch (IOException ioex) {
                        JOptionPane.showMessageDialog(Compi.this, ioex);
                        System.exit(1);
                    }
                reconocedor_tokens.tokens(f);
            }
 
         }  // fin de la clase interna anónima
 
      );
        
        //... Set window content and menu.
        setContentPane(content);
        setJMenuBar(menuBar);
        
        //... Set other window characteristics.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("NutPad");
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        
          
    }
    
    
   
    
    
    
  //File f;  
    
    ////////////////////////////////////////////////// inner class OpenAction
    class OpenAction extends AbstractAction {
        //============================================= constructor
        public OpenAction() {
            super("Open...");
            putValue(MNEMONIC_KEY, new Integer('O'));
        }
        
        //========================================= actionPerformed
        public void actionPerformed(ActionEvent e) {
            int retval = _fileChooser.showOpenDialog(Compi.this);
            if (retval == JFileChooser.APPROVE_OPTION) {
                f = _fileChooser.getSelectedFile();
                cont=1;
                try {
                    FileReader reader = new FileReader(f);
                    _editArea.read(reader, "");  // Use TextComponent read
                } catch (IOException ioex) {
                    System.out.println(e);
                    System.exit(1);
                }
            }
        }
    }
    
    //////////////////////////////////////////////////// inner class SaveAction
    class SaveAction extends AbstractAction {
        //============================================= constructor
        SaveAction() {
            super("Save...");
            putValue(MNEMONIC_KEY, new Integer('S'));
        }
        
        //========================================= actionPerformed
        public void actionPerformed(ActionEvent e) {
            int retval = _fileChooser.showSaveDialog(Compi.this);
            if (retval == JFileChooser.APPROVE_OPTION) {
                File f = _fileChooser.getSelectedFile();
                try {
                    FileWriter writer = new FileWriter(f);
                    _editArea.write(writer);  // Use TextComponent write
                } catch (IOException ioex) {
                    JOptionPane.showMessageDialog(Compi.this, ioex);
                    System.exit(1);
                }
            }
        }
    }
    
    ///////////////////////////////////////////////////// inner class ExitAction
    class ExitAction extends AbstractAction {
        
        //============================================= constructor
        public ExitAction() {
            super("Exit");
            putValue(MNEMONIC_KEY, new Integer('X'));
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