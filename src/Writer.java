import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.*;
public class Writer {
JFrame frame;
JPanel panel;
File f;
PrintWriter write;
JTextField filename;
JButton button;
JLabel label;

	public Writer() throws IOException {
		frame = new JFrame("Auto Manager");
		frame.setSize(400, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		frame.add(panel);
		panel.setLayout(null);
		filename = new JTextField(30);
		filename.setBounds(75, 50, 200, 25);
		panel.add(filename);
		button = new JButton("New");
		button.setBounds(300, 50, 75, 24);
		panel.add(button);
		button.requestFocusInWindow();
		filename.requestFocusInWindow();
		label = new JLabel();
		label.setBounds(75, 80, 300, 25);
		panel.add(label);
		label.setVisible(false);
		frame.setVisible(true);
	}
	
	public String getFile() throws IOException{
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f = new File("/Users/gwarfield/auto/" + filename.getText() + ".txt");
				try {
					f.createNewFile();
				if(f.exists()) {
					label.setText(f.getAbsolutePath() + " Created");
					label.setVisible(true);
				}
			  } catch(IOException e1) {
					label.setText("Failed to create file: " + e1.getMessage());
					label.setVisible(true);
				}
			}
		});
		return f.getAbsolutePath();
	}

	
	public void writeFile(String file) throws IOException {
		write = new PrintWriter(file, "utf-8");
		//Write code for writing to file here
		write.flush();
	}
	
	
}
