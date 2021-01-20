package Play;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.io.*;
public class SelectPath {

	public String getPath()
	{
		File folder=new File("F:\\New folder (3)\\ADM");
		JFileChooser choose=new JFileChooser(folder);
		FileNameExtensionFilter filter=new FileNameExtensionFilter("*.mp3","mp3");
		choose.setFileFilter(filter);
	    choose.showOpenDialog(null);
	    File f1=choose.getSelectedFile();
	   String path=f1.getAbsolutePath();
		return path;
	}
	
}
