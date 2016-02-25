package cap17;

import java.awt.BorderLayout;
import java.awt.HeadlessException;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class FileDemonstration extends JFrame{
	private JTextArea outputArea;
	private JScrollPane scrollPane;
	
	
	public FileDemonstration() {
		super("Testing class file");
		
		outputArea = new JTextArea();
		scrollPane = new JScrollPane(outputArea);
		
		add(scrollPane, BorderLayout.CENTER);
		
		setSize(400,400);
		setVisible(true);
		
		analyzerPath();
		
	}
	
	public File getFileOrDirectory(){
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		
		int result = fileChooser.showOpenDialog(this);
		
		if (result == JFileChooser.CANCEL_OPTION) {
			System.exit(1);
		}
		
		File fileName = fileChooser.getSelectedFile();
		
		if((fileName == null) || (fileChooser.getName().equals(""))){
			JOptionPane.showMessageDialog(this, "Invalid Name File", 
					"Invalid Name File", JOptionPane.ERROR_MESSAGE);
			System.exit(1);
		}
		
		return fileName;
	}

	private void analyzerPath() {
		// TODO Auto-generated method stub
		File name = getFileOrDirectory();
		
		if(name.exists()){
			outputArea.setText(String.format("%s%s\n%s\n%s\n%s\n%s\n%s%s\n%s%s\n%s%s\n%s%s", name.getName(),"exists",
					(name.isFile()? "is a file" : "is not a file"),
					name.isDirectory()? "is a directory" : "is not a directory",
					name.isAbsolute()? "is absolute path" : "is not absolute path",
					name.lastModified(), "length: ", name.length(),
					"Path: ", name.getPath(), "Absolut Path: ",
					name.getAbsolutePath(), "Parent: ", name.getParent()));
			
			if(name.isDirectory()){
				String[] directory = name.list();
				outputArea.append("\n\nDirectory Contents: \n");
				
				for(String directoryName: directory){
					outputArea.append(directoryName + "\n");
				}
			}else{
				JOptionPane.showMessageDialog(this, name + "does not exist", 
						"ERROR", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	
	
}
