package classes;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class Main {
	/* Main method to run the method below.
	*/
	public static void main(String[] args) {
		
		hi();
			
	}
	
	  /* The method hi() shows a dialog box of the information on the rules
	  * of the game. Then it shows a dialog box if you want to play the game.
	  * If not, it gives gredit and exits the program. But, if you do want to play,
	  * it shows the list of characters that you must guess one of that the computer has
	  * chosen. There are 8 questions to ask, a help button, and an exit button. Once you
	  * ask the first question, the computer will answer, and it will increment the counter for
	  * the number of questions asked. Once, the counter reaches 4, then you must guess who it is.
	  * If guessed correctly, you win and shows the correct characyer and the credits. It then asks you
	  / if you wan to play again, if so, it repeats the process, if not, it exits the program.
	  * If you incorrectly guessed the character, then you lose and asks if you want to play again.
	  *  If so, it repeats the process, if not, it exits the program.
	  */
	public static void hi() {
		//INSTANCE VARIABLES
		Object[] options10 = {"Yes","Exit"};
		Object[] options11 = {"Yes","No"};
		Object[] options = {"Yes","Exit"};	
		Object[] options2 = {"Yes","No","Exit"};
		Object[] options3 = {"Kai","Jay","Zane","Cole","Nya","Lloyd","Misako","Sensei Wu","Exit"};
		Object[] options4 = {"Are they female","Are they male","Are they blond","Do they have tan/brown hair","Do they have black/gray hair","Wearing green","Wearing red","Wearing blue","\n Show characters","Exit"};
		final int rand =(int)(Math.random()*8);
		int num = 0;
		int ninja=8;;
		int n = 1;
		int kai = 0;
		int jay = 0;
		int zane = 0;
		int cole= 0;
		int nya= 0;
		int lloyd = 0;
		int misako = 0;
		int senseiwu= 0;
		
		JOptionPane.showMessageDialog(null, "Hello Welcome to the Guess Who Game"
				+ "\n Your number of questions that you have will be increasing in the top from 0 - 4."
				+ "\n In this Guess Who game you have to guess the character based on the questions and responses that are given.\n To complete the game, you must guess correctly, guess incorrectly and you lose. \nYou will only be given 4 attempts to gather information to guess the character. \n You can use the show character button as much as possible and at the end the characters that have a value of zero are still guessable, but you have to remebr what questions you've used");
		ImageIcon icon = new ImageIcon(Main.class.getResource("kaik.jpg"));
		ImageIcon icon2 = new ImageIcon(Main.class.getResource("jay.jpg"));
		ImageIcon icon3 = new ImageIcon(Main.class.getResource("zanez.jpg"));
		ImageIcon icon4 = new ImageIcon(Main.class.getResource("cole.jpg"));
		ImageIcon icon5 = new ImageIcon(Main.class.getResource("nyan.jpg"));
		ImageIcon icon6 = new ImageIcon(Main.class.getResource("lloyd.jpg"));
		ImageIcon icon7 = new ImageIcon(Main.class.getResource("misako.jpg"));
		ImageIcon icon8 = new ImageIcon(Main.class.getResource("ywu.png"));
		ImageIcon icon9 = new ImageIcon(Main.class.getResource("ninjagoc.jpg"));
	
		
		int s  = JOptionPane.showOptionDialog(null, "Would you like to play Guess who?","Guess Who",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options,null);
		if(s == 0) {
			//int f  = JOptionPane.showOptionDialog(null, "Please choose your player to guess?","Guess Who",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options3,null);
			//Kai
			JOptionPane.showMessageDialog(null,"The characters",null, JOptionPane.INFORMATION_MESSAGE, icon9);
			while(num<=3 && n <=1){
			
			if(rand == 0) {
				int a = JOptionPane.showOptionDialog(null, num +".Choose a question in the box below?","Guess Who",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options4,null);
				ninja = ninja -1;
				
				if(a == 0) {
					JOptionPane.showMessageDialog(null,"They are not female");   
				
					
					jay = jay +0;
					kai = kai+0;
					zane = zane +0;
					lloyd = lloyd +0;
					misako = misako-1;
					senseiwu = senseiwu +0;
					nya = nya - 1;
					cole = cole +0;
					num = num +1;
					
				}
				
				else if(a == 1) {
					JOptionPane.showMessageDialog(null,"They are male");
					jay = jay +0;
					kai = kai+0;
					zane = zane +0;
					lloyd = lloyd +0;
					misako = misako-1;
					senseiwu = senseiwu +0;
					nya = nya - 1;
					cole = cole +0;
					num = num +1;
					
					num = num +1;
					
				}
				else if(a == 2) {
					JOptionPane.showMessageDialog(null,"They do not have blond hair");	
			
					jay = jay +0;
					kai = kai+0;
					zane = zane +0;
					lloyd = lloyd +0;
					misako = misako-1;
					senseiwu = senseiwu +0;
					nya = nya - 1;
					cole = cole +0;
					num = num +1;
				}
				else if(a == 3) {
					JOptionPane.showMessageDialog(null,"They do have tan/brown hair");
					jay = jay +0;
					kai = kai+0;
					zane = zane -1;
					lloyd = lloyd -1;
					misako = misako-1;
					senseiwu = senseiwu -1;
					nya = nya - 1;
					cole = cole -1;
					num = num +1;
				}
				else if(a == 4) {
					JOptionPane.showMessageDialog(null,"They do not have black/gray hair");
					jay = jay +0;
					kai = kai+0;
					zane = zane +0;
					lloyd = lloyd +0;
					misako = misako-1;
					senseiwu = senseiwu+0;
					nya = nya - 1;
					cole = cole -1;
					num = num +1;
				}
				else if(a == 5) {
					JOptionPane.showMessageDialog(null,"They are not wearing green");
					jay = jay +0;
					kai = kai+0;
					zane = zane +0;
					lloyd = lloyd -1;
					misako = misako-1;
					senseiwu = senseiwu -1;
					nya = nya +0;
					cole = cole +0;
					num = num +1;
				}
				else if(a == 6) {
					JOptionPane.showMessageDialog(null,"They are wearing red");
					jay = jay -1;
					kai = kai+0;
					zane = zane -1;
					lloyd = lloyd -1;
					misako = misako-1;
					senseiwu = senseiwu -1;
					nya = nya - 1;
					cole = cole -1;
					num = num +1;
				}
				else if(a == 7) {
					JOptionPane.showMessageDialog(null,"They are not wearing blue");
					jay = jay -1;
					kai = kai+0;
					zane = zane +0;
					lloyd = lloyd +0;
					misako = misako+0;
					senseiwu = senseiwu +0;
					nya = nya +0;
					cole = cole +0;
					num = num+1;
				}
				else if(a == 8) {
					JOptionPane.showMessageDialog(null, "The characters",null, JOptionPane.INFORMATION_MESSAGE, icon9);
					n = n -1;
				}
				else if(a==9) {
					JOptionPane.showMessageDialog(null,"Credits:"
							+ "\n Creator: Angel Montenegro"
							+ "\n User: You are the user"
							+ "\n Thanks for looking at my code");
					System.exit(0);
				}
			}
			//Jay
			if(rand == 1) {
				ninja = ninja -1;
				int b  = JOptionPane.showOptionDialog(null, num +".Choose a question in the box below?","Guess Who",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options4,null);
				if(b == 0) {
					JOptionPane.showMessageDialog(null,"They are not female");
					jay = jay +0;
					kai = kai+0;
					zane = zane +0;
					lloyd = lloyd +0;
					misako = misako-1;
					senseiwu = senseiwu +0;
					nya = nya - 1;
					cole = cole +0;
					num = num +1;
				}
				else if(b == 1) {
					JOptionPane.showMessageDialog(null,"They are male");
					jay = jay +0;
					kai = kai+0;
					zane = zane +0;
					lloyd = lloyd +0;
					misako = misako-1;
					senseiwu = senseiwu +0;
					nya = nya - 1;
					cole = cole +0;
					num = num +1;
				}
				else if(b == 2) {
					JOptionPane.showMessageDialog(null,"They do not have blond hair");
					jay = jay +0;
					kai = kai+0;
					zane = zane -1;
					lloyd = lloyd -1;
					misako = misako-0;
					senseiwu = senseiwu +0;
					nya = nya - 0;
					cole = cole +0;
					num = num +1;
				}
				else if(b == 3) {
					JOptionPane.showMessageDialog(null,"They do have tan/brown hair");
					jay = jay +0;
					kai = kai+0;
					zane = zane -1;
					lloyd = lloyd -1;
					misako = misako-1;
					senseiwu = senseiwu -1;
					nya = nya - 1;
					cole = cole -1;
					num = num +1;
				}
				else if(b == 4) {
					JOptionPane.showMessageDialog(null,"They do not have black/gray hair");
					jay = jay +0;
					kai = kai+0;
					zane = zane +0;
					lloyd = lloyd +0;
					misako = misako-1;
					senseiwu = senseiwu+0;
					nya = nya - 1;
					cole = cole -1;
					num = num +1;
				}
				else if(b == 5) {
					JOptionPane.showMessageDialog(null,"They are not wearing green");
					jay = jay +0;
					kai = kai+0;
					zane = zane +0;
					lloyd = lloyd -1;
					misako = misako-1;
					senseiwu = senseiwu -1;
					nya = nya +0;
					cole = cole +0;
					num = num +1;
				}
				else if(b == 6) {
					JOptionPane.showMessageDialog(null,"They are not wearing red");
					jay = jay +0;
					kai = kai-1;
					zane = zane +0;
					lloyd = lloyd +0;
					misako = misako+0;
					senseiwu = senseiwu+0;
					nya = nya +0;
					cole = cole +0;
					
					num = num +1;
				}
				else if(b == 7) {
					JOptionPane.showMessageDialog(null,"They are wearing blue");
					jay = jay +0;
					kai = kai-1;
					zane = zane -1;
					lloyd = lloyd -1;
					misako = misako-1;
					senseiwu = senseiwu -1;
					nya = nya -1;
					cole = cole -1;
					
					num = num +1;
				}
				else if(b == 8) {
					JOptionPane.showMessageDialog(null, "The characters",null, JOptionPane.INFORMATION_MESSAGE, icon9);
					n = n -1;
				}
				else if(b==9) {
					JOptionPane.showMessageDialog(null,"Credits:"
							+ "\n Creator: Angel Montenegro"
							+ "\n User: You are the user"
							+ "\n Thanks for looking at my code");
					System.exit(0);
				}
			}
			//Zane
			if(rand == 2) {
				ninja = ninja -1;
				int c  = JOptionPane.showOptionDialog(null,num+ ".Choose a question in the box below?","Guess Who",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options4,null);
				if(c == 0) {
					JOptionPane.showMessageDialog(null,"They are not female");
					jay = jay +0;
					kai = kai+0;
					zane = zane +0;
					lloyd = lloyd +0;
					misako = misako-1;
					senseiwu = senseiwu +0;
					nya = nya -1;
					cole = cole +0;
					num = num +1;
				}
				else if(c == 1) {
					JOptionPane.showMessageDialog(null,"They are male");
					jay = jay +0;
					kai = kai+0;
					zane = zane +0;
					lloyd = lloyd +0;
					misako = misako-1;
					senseiwu = senseiwu +0;
					nya = nya -1;
					cole = cole +0;
					num = num +1;
				}
				else if(c == 2) {
					JOptionPane.showMessageDialog(null,"They do have blond hair");	
					jay = jay -1;
					kai = kai-1;
					zane = zane +0;
					lloyd = lloyd +0;
					misako = misako-1;
					senseiwu = senseiwu -1;
					nya = nya -1;
					cole = cole -1;
					num = num +1;
				}
				else if(c == 3) {
					JOptionPane.showMessageDialog(null,"They do not have tan/brown hair");
					num = num +1;
					jay = jay -1;
					kai = kai-1;
					zane = zane +0;
					lloyd = lloyd +0;
					misako = misako-0;
					senseiwu = senseiwu +0;
					nya = nya -0;
					cole = cole +0;
				}
				else if(c == 4) {
					JOptionPane.showMessageDialog(null,"They do not have black/gray hair");
					jay = jay +0;
					kai = kai+0;
					zane = zane +0;
					lloyd = lloyd +0;
					misako = misako-1;
					senseiwu = senseiwu +0;
					nya = nya -1;
					cole = cole -1;
					num = num +1;
				}else if(c == 5) {
					JOptionPane.showMessageDialog(null,"They are not wearing green");
					num = num +1;
					jay = jay +0;
					kai = kai+0;
					zane = zane +0;
					lloyd = lloyd -1;
					misako = misako-1;
					senseiwu = senseiwu -1;
					nya = nya -0;
					cole = cole +0;
				}
				else if(c == 6) {
					JOptionPane.showMessageDialog(null,"They are not wearing red");
					jay = jay +0;
					kai = kai-1;
					zane = zane +0;
					lloyd = lloyd +0;
					misako = misako-0;
					senseiwu = senseiwu +0;
					nya = nya -0;
					cole = cole +0;
					num = num +1;
				}
				else if(c == 7) {
					JOptionPane.showMessageDialog(null,"They are not wearing blue");
					jay = jay -1;
					kai = kai+0;
					zane = zane +0;
					lloyd = lloyd +0;
					misako = misako-0;
					senseiwu = senseiwu +0;
					nya = nya -0;
					cole = cole +0;
					num = num +1;
				}
				else if(c == 8) {
					JOptionPane.showMessageDialog(null, "The characters",null, JOptionPane.INFORMATION_MESSAGE, icon9);
					n = n -1;
				}
				else if(c==9) {
					JOptionPane.showMessageDialog(null,"Credits:"
							+ "\n Creator: Angel Montenegro"
							+ "\n User: You are the user"
							+ "\n Thanks for looking at my code");
					System.exit(0);
				}
			}
			//Cole
			if(rand== 3) {
				ninja = ninja -1;
				int d  = JOptionPane.showOptionDialog(null, num+".Choose a question in the box below?","Guess Who",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options4,null);
				if(d == 0) {
					JOptionPane.showMessageDialog(null,"They are not female");
					num = num +1;
					jay = jay +0;
					kai = kai+0;
					zane = zane +0;
					lloyd = lloyd +0;
					misako = misako-1;
					senseiwu = senseiwu +0;
					nya = nya -1;
					cole = cole +0;
				}
				else if(d == 1) {
					JOptionPane.showMessageDialog(null,"They are male");
					num = num +1;
					jay = jay +0;
					kai = kai+0;
					zane = zane +0;
					lloyd = lloyd +0;
					misako = misako-1;
					senseiwu = senseiwu +0;
					nya = nya -1;
					cole = cole +0;
				}
				else if(d == 2) {
					JOptionPane.showMessageDialog(null,"They do not have blond hair");	
					num = num +1;
					jay = jay +0;
					kai = kai+0;
					zane = zane -1;
					lloyd = lloyd -1;
					misako = misako-0;
					senseiwu = senseiwu +0;
					nya = nya -0;
					cole = cole +0;
				}
				else if(d == 3) {
					JOptionPane.showMessageDialog(null,"They do not have tan/brown hair");
					num = num +1;
					jay = jay -1;
					kai = kai-1;
					zane = zane +0;
					lloyd = lloyd +0;
					misako = misako-0;
					senseiwu = senseiwu +0;
					nya = nya -0;
					cole = cole +0;
				}
				else if(d == 4) {
					JOptionPane.showMessageDialog(null,"They do have black/gray hair");
					jay = jay -1;
					kai = kai-1;
					zane = zane -1;
					lloyd = lloyd-1;
					misako = misako+0;
					senseiwu = senseiwu -1;
					nya = nya +0;
					cole = cole +0;
					num = num +1;
				}
				else if(d == 5) {
					JOptionPane.showMessageDialog(null,"They are not wearing green");
					jay = jay +0;
					kai = kai+0;
					zane = zane +0;
					lloyd = lloyd -1;
					misako = misako-1;
					senseiwu = senseiwu -1;
					nya = nya +0;
					cole = cole +0;
					num = num +1;
				}
				else if(d == 6) {
					JOptionPane.showMessageDialog(null,"They are not wearing red");
					jay = jay +0;
					kai = kai-1;
					zane = zane +0;
					lloyd = lloyd +0;
					misako = misako-0;
					senseiwu = senseiwu +0;
					nya = nya -0;
					cole = cole +0;
					num = num +1;
				}
				else if(d == 7) {
					JOptionPane.showMessageDialog(null,"They are not wearing blue");
					jay = jay -1;
					kai = kai+0;
					zane = zane +0;
					lloyd = lloyd +0;
					misako = misako-0;
					senseiwu = senseiwu +0;
					nya = nya -0;
					cole = cole +0;
					num = num +1;
				}
				else if(d == 8) {
					JOptionPane.showMessageDialog(null, "The characters",null, JOptionPane.INFORMATION_MESSAGE, icon9);
					n = n -1;
				}
				else if(d==9) {
					JOptionPane.showMessageDialog(null,"Credits:"
							+ "\n Creator: Angel Montenegro"
							+ "\n User: You are the user"
							+ "\n Thanks for looking at my code");
					System.exit(0);
				}
			}
			//Nya
			if(rand == 4) {
				ninja = ninja -1;
				int e  = JOptionPane.showOptionDialog(null, num+".Choose a question in the box below?","Guess Who",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options4,null);
				if(e == 0) {
					JOptionPane.showMessageDialog(null,"They are female");
					jay = jay -1;
					kai = kai-1;
					zane = zane -1;
					lloyd = lloyd -1;
					misako = misako+0;
					senseiwu = senseiwu -1;
					nya = nya -0;
					cole = cole -1;
					num = num +1;
				}
				else if(e == 1) {
					JOptionPane.showMessageDialog(null,"They are not male");
					num = num +1;
					jay = jay -1;
					kai = kai-1;
					zane = zane -1;
					lloyd = lloyd -1;
					misako = misako+0;
					senseiwu = senseiwu -1;
					nya = nya -0;
					cole = cole -1;
				}
				else if(e == 2) {
					JOptionPane.showMessageDialog(null,"They do not have blond hair");	
					num = num +1;
					jay = jay -0;
					kai = kai-0;
					zane = zane -1;
					lloyd = lloyd -1;
					misako = misako+0;
					senseiwu = senseiwu+ 0;
					nya = nya -0;
					cole = cole -0;
				}
				else if(e == 3) {
					JOptionPane.showMessageDialog(null,"They do not have tan/brown hair");
					num = num +1;
					jay = jay -1;
					kai = kai-1;
					zane = zane -0;
					lloyd = lloyd -0;
					misako = misako+0;
					senseiwu = senseiwu -0;
					nya = nya -0;
					cole = cole -0;
				}
				else if(e == 4) {
					JOptionPane.showMessageDialog(null,"They do have black/gray hair");
					num = num +1;
					jay = jay -1;
					kai = kai-1;
					zane = zane -1;
					lloyd = lloyd -1;
					misako = misako+0;
					senseiwu = senseiwu -1;
					nya = nya -0;
					cole = cole -0;
				}
				else if(e == 5) {
					JOptionPane.showMessageDialog(null,"They are not wearing green");
					num = num +1;
					jay = jay -0;
					kai = kai-0;
					zane = zane -0;
					lloyd = lloyd -1;
					misako = misako+0;
					senseiwu = senseiwu -1;
					nya = nya -0;
					cole = cole -0;
				}
				else if(e == 6) {
					JOptionPane.showMessageDialog(null,"They are not wearing red");
					
					kai = kai-1;
					
					num = num +1;
				}
				else if(e == 7) {
					JOptionPane.showMessageDialog(null,"They are not wearing blue");
					jay = jay-1;
					num = num +1;
				}
				else if(e == 8) {
					JOptionPane.showMessageDialog(null, "The characters",null, JOptionPane.INFORMATION_MESSAGE, icon9);
					n = n -1;
				}
				else if(e==9) {
					JOptionPane.showMessageDialog(null,"Credits:"
							+ "\n Creator: Angel Montenegro"
							+ "\n User: You are the user"
							+ "\n Thanks for looking at my code");
					System.exit(0);
				}
			}
			//Lloyd
			if(rand == 5) {
				ninja = ninja -1;
				int g  = JOptionPane.showOptionDialog(null, num+".Choose a question in the box below?","Guess Who",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options4,null);
				if(g == 0) {
					JOptionPane.showMessageDialog(null,"They are not female");
					num = num +1;
					misako = misako -1;
					nya = nya -1;
				}
				else if(g == 1) {
					JOptionPane.showMessageDialog(null,"They are male");
					misako = misako -1;
					nya = nya -1;
					num = num +1;
				}
				else if(g == 2) {
					JOptionPane.showMessageDialog(null,"They do have blond hair");	
					jay = jay -1;
					kai = kai-1;
					
					misako = misako-1;
					senseiwu = senseiwu -1;
					nya = nya -1;
					cole = cole -1;
					num = num +1;
				}
				else if(g == 3) {
					JOptionPane.showMessageDialog(null,"They do not have tan/brown hair");
					kai = kai -1;
					jay = jay-1;
					num = num +1;
				}
				else if(g == 4) {
					JOptionPane.showMessageDialog(null,"They do not have black/gray hair");
				misako = misako-1;
				nya = nya-1;
				cole = cole -1;
					num = num +1;
				}
				else if(g == 5) {
					JOptionPane.showMessageDialog(null,"They are wearing green");
					num = num +1;
					jay = jay -1;
					kai = kai-1;
					zane = zane -1;
					
					nya = nya -1;
					cole = cole -1;
				}
				else if(g == 6) {
					JOptionPane.showMessageDialog(null,"They are not wearing red");
					kai=kai-1;
					num = num +1;
				}
				else if(g == 7) {
					JOptionPane.showMessageDialog(null,"They are not wearing blue");
					jay=jay-1;
					num = num +1;
				}
				else if(g == 8) {
					JOptionPane.showMessageDialog(null, "The characters",null, JOptionPane.INFORMATION_MESSAGE, icon9);
					n = n -1;
				}
				else if(g==9) {
					JOptionPane.showMessageDialog(null,"Credits:"
							+ "\n Creator: Angel Montenegro"
							+ "\n User: You are the user"
							+ "\n Thanks for looking at my code");
					System.exit(0);
				}
			}
			//Misako
			if(rand == 6) {
				ninja = ninja -1;
				int h  = JOptionPane.showOptionDialog(null,num+ ".Choose a question in the box below?","Guess Who",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options4,null);
				if(h == 0) {
					JOptionPane.showMessageDialog(null,"They are female");
					num = num +1;
					jay = jay -1;
					kai = kai-1;
					zane = zane -1;
					lloyd = lloyd -1;
					
					senseiwu = senseiwu -1;
					
					cole = cole -1;
				}
				else if(h == 1) {
					JOptionPane.showMessageDialog(null,"They are not male");
					jay = jay -1;
					kai = kai-1;
					zane = zane -1;
					lloyd = lloyd -1;
					
					senseiwu = senseiwu -1;
					
					cole = cole -1;
					num = num +1;
				}
				else if(h == 2) {
					JOptionPane.showMessageDialog(null,"They do not have blond hair");	
					zane = zane-1;
					lloyd=lloyd-1;
					num = num +1;
				}
				else if(h == 3) {
					JOptionPane.showMessageDialog(null,"They do not have tan/brown hair");
					jay=jay-1;
					kai=kai-1;
					num = num +1;
				}
				else if(h == 4) {
					JOptionPane.showMessageDialog(null,"They do have black/gray hair");
					jay = jay -1;
					kai = kai-1;
					zane = zane -1;
					lloyd = lloyd -1;
					
					senseiwu = senseiwu -1;
					
					
					num = num +1;
				}
				else if(h == 5) {
					JOptionPane.showMessageDialog(null,"They are wearing green");
					jay = jay -1;
					kai = kai-1;
					zane = zane -1;
					nya = nya-1;
					cole = cole -1;
					num = num +1;
				}
				else if(h == 6) {
					JOptionPane.showMessageDialog(null,"They are not wearing red");
					kai=kai-1;
					
					num = num +1;
				}
				else if(h == 7) {
					JOptionPane.showMessageDialog(null,"They are not wearing blue");
					jay=jay-1;
					
					num = num +1;
				}
				else if(h == 8) {
					JOptionPane.showMessageDialog(null, "The characters",null, JOptionPane.INFORMATION_MESSAGE, icon9);
					n = n -1;
				}
				else if(h==9) {
					JOptionPane.showMessageDialog(null,"Credits:"
							+ "\n Creator: Angel Montenegro"
							+ "\n User: You are the user"
							+ "\n Thanks for looking at my code");
					System.exit(0);
				}
				
				
			}
			//Sensei Wu
			if(rand == 7) {
				ninja = ninja -1;
				int i  = JOptionPane.showOptionDialog(null,num+ ".Choose a question in the box below?","Guess Who",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options4,null);
				if(i == 0) {
					JOptionPane.showMessageDialog(null,"They are not female");
					misako=misako-1;
					nya=nya-1;
					num = num +1;
				}
				else if(i == 1) {
					JOptionPane.showMessageDialog(null,"They are male");
					misako=misako-1;
					nya=nya-1;
					num = num +1;
				}
				else if(i == 2) {
					JOptionPane.showMessageDialog(null,"They do not have blond hair");	
					zane=zane-1;
					lloyd=lloyd-1;
					num = num +1;
				}
				else if(i == 3) {
					JOptionPane.showMessageDialog(null,"They do not have tan/brown hair");
					kai=kai-1;
					jay=jay-1;
					num = num +1;
				}
				else if(i == 4) {
					JOptionPane.showMessageDialog(null,"They do not have black/gray hair");
					cole=cole-1;
					nya=nya-1;
					misako=misako-1;
					num = num +1;
				}
				else if(i == 5) {
					JOptionPane.showMessageDialog(null,"They are wearing green");
					jay = jay -1;
					kai = kai-1;
					zane = zane -1;
					nya = nya-1;
					cole = cole -1;
					num = num +1;
				}
				else if(i == 6) {
					JOptionPane.showMessageDialog(null,"They are not wearing red");
					kai=kai-1;
					
					num = num +1;
				}
				else if(i == 7) {
					JOptionPane.showMessageDialog(null,"They are not wearing blue");
					jay=jay-1;
					
					num = num +1;
				}
				else if(i == 8) {
					JOptionPane.showMessageDialog(null, "The characters",null, JOptionPane.INFORMATION_MESSAGE, icon9);
					n = n -1;
				}
				else if(i==9) {
					JOptionPane.showMessageDialog(null,"Credits:"
							+ "\n Creator: Angel Montenegro"
							+ "\n User: You are the user"
							+ "\n Thanks for looking at my code");
					System.exit(0);
				}
	
					
			}
			}	
		}
		if(s == 1) {
			JOptionPane.showMessageDialog(null,"Credits:"
					+ "\n Creator: Angel Montenegro"
					+ "\n User: You are the user"
					+ "\n Thanks for looking at my code");
			System.exit(0);
		}
		/*
		if(kai == 1 && jay !=1&&zane !=1&&cole!=1&&nya !=1&&lloyd!=1&&misako !=1&&senseiwu!=1) {
			JOptionPane.showMessageDialog(null,"You crossed everyone out, its kai", null, JOptionPane.INFORMATION_MESSAGE,icon);
		}
		if(kai != 1 && jay ==1&&zane !=1&&cole!=1&&nya !=1&&lloyd!=1&&misako !=1&&senseiwu!=1) {
			JOptionPane.showMessageDialog(null,"You crossed everyone out, its jay", null, JOptionPane.INFORMATION_MESSAGE,icon2);
		}
		if(kai != 1 && jay !=1&&zane ==1&&cole!=1&&nya !=1&&lloyd!=1&&misako !=1&&senseiwu!=1) {
			JOptionPane.showMessageDialog(null,"You crossed everyone out, its zane", null, JOptionPane.INFORMATION_MESSAGE,icon3);
		}
		if(kai != 1 && jay !=1&&zane !=1&&cole==1&&nya !=1&&lloyd!=1&&misako !=1&&senseiwu!=1) {
			JOptionPane.showMessageDialog(null,"You crossed everyone out, its cole", null, JOptionPane.INFORMATION_MESSAGE,icon4);
		}
		if(kai != 1 && jay !=1&&zane !=1&&cole!=1&&nya ==1&&lloyd!=1&&misako !=1&&senseiwu!=1) {
			JOptionPane.showMessageDialog(null,"You crossed everyone out, its nya", null, JOptionPane.INFORMATION_MESSAGE,icon5);
		}
		if(kai != 1 && jay !=1&&zane !=1&&cole!=1&&nya !=1&&lloyd==1&&misako !=1&&senseiwu!=1) {
			JOptionPane.showMessageDialog(null,"You crossed everyone out, its lloyd", null, JOptionPane.INFORMATION_MESSAGE,icon6);
		}
		if(kai != 1 && jay !=1&&zane !=1&&cole!=1&&nya !=1&&lloyd!=1&&misako ==1&&senseiwu!=1) {
			JOptionPane.showMessageDialog(null,"You crossed everyone out, its misako", null, JOptionPane.INFORMATION_MESSAGE,icon7);
		}
		if(kai != 1 && jay !=1&&zane !=1&&cole!=1&&nya !=1&&lloyd!=1&&misako !=1&&senseiwu==1) {
			JOptionPane.showMessageDialog(null,"You crossed everyone out, its sensei wu", null, JOptionPane.INFORMATION_MESSAGE,icon8);
		}
		*/
		if(num >=4) {
			//JOptionPane.showMessageDialog(null, "Characters remaining" + " ,Kai:" + +kai + " ,Jay:" + +jay + " ,Zane:" + +zane + " ,Cole" + +cole + " ,Lloyd:" + +lloyd+ " ,Nya" + +nya + " ,Misako:" + +misako + " ,Sensei Wu" + +senseiwu);
			int g = JOptionPane.showOptionDialog(null, "Your four questions are up. Would you like to guess who the character is",null, JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options10,null);
			
			if(g == 0) {
			if(rand == 0) {//Kai
				int a = JOptionPane.showOptionDialog(null, "The characters remaining: (The ones with zero are possible answers)"+ " ,Kai:" + +kai + " ,Jay:" + +jay + " ,Zane:" + +zane + " ,Cole" + +cole + " ,Lloyd:" + +lloyd+ " ,Nya" + +nya + " ,Misako:" + +misako + " ,Sensei Wu" + +senseiwu,null, JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options3,null);
				if(a ==0) {
					JOptionPane.showMessageDialog(null, "Correct, It is Kai",null, JOptionPane.INFORMATION_MESSAGE, icon);
					JOptionPane.showMessageDialog(null,"Credits:"
							+ "\n Creator: Angel Montenegro"
							+ "\n User: You are the user"
							+ "\n Thanks for looking at my code");
					int i  = JOptionPane.showOptionDialog(null,"Would you like to play again?","Guess Who",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options11,null);
					if(i == 0) {
						hi();
					}
					else {
						System.exit(0);
					}
				
				}
				if(a == 1) {
					JOptionPane.showMessageDialog(null, "Incorrect, the correct guess is Kai",null, JOptionPane.INFORMATION_MESSAGE, icon);
					JOptionPane.showMessageDialog(null,"Credits:"
							+ "\n Creator: Angel Montenegro"
							+ "\n User: You are the user"
							+ "\n Thanks for looking at my code");
					int i  = JOptionPane.showOptionDialog(null,"Would you like to play again?","Guess Who",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options11,null);
					if(i == 0) {
						hi();
					}
					else {
						System.exit(0);
					}
				}
				if(a == 2) {
					JOptionPane.showMessageDialog(null, "Incorrect, the correct guess is Kai",null, JOptionPane.INFORMATION_MESSAGE, icon);
					JOptionPane.showMessageDialog(null,"Credits:"
							+ "\n Creator: Angel Montenegro"
							+ "\n User: You are the user"
							+ "\n Thanks for looking at my code");
					int i  = JOptionPane.showOptionDialog(null,"Would you like to play again?","Guess Who",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options11,null);
					if(i == 0) {
						hi();
					}
					else {
						System.exit(0);
					}
				}
				if(a == 3) {
					JOptionPane.showMessageDialog(null, "Incorrect, the correct guess is Kai",null, JOptionPane.INFORMATION_MESSAGE, icon);
					JOptionPane.showMessageDialog(null,"Credits:"
							+ "\n Creator: Angel Montenegro"
							+ "\n User: You are the user"
							+ "\n Thanks for looking at my code");
					int i  = JOptionPane.showOptionDialog(null,"Would you like to play again?","Guess Who",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options11,null);
					if(i == 0) {
						hi();
					}
					else {
						System.exit(0);
					}
				}
				if(a == 4) {
					JOptionPane.showMessageDialog(null, "Incorrect, the correct guess is Kai",null, JOptionPane.INFORMATION_MESSAGE, icon);
					JOptionPane.showMessageDialog(null,"Credits:"
							+ "\n Creator: Angel Montenegro"
							+ "\n User: You are the user"
							+ "\n Thanks for looking at my code");
					int i  = JOptionPane.showOptionDialog(null,"Would you like to play again?","Guess Who",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options11,null);
					if(i == 0) {
						hi();
					}
					else {
						System.exit(0);
					}
				}
				if(a == 5) {
					JOptionPane.showMessageDialog(null, "Incorrect, the correct guess is Kai",null, JOptionPane.INFORMATION_MESSAGE, icon);
					JOptionPane.showMessageDialog(null,"Credits:"
							+ "\n Creator: Angel Montenegro"
							+ "\n User: You are the user"
							+ "\n Thanks for looking at my code");
					int i  = JOptionPane.showOptionDialog(null,"Would you like to play again?","Guess Who",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options11,null);
					if(i == 0) {
						hi();
					}
					else {
						System.exit(0);
					}
				}
				if(a == 6) {
					JOptionPane.showMessageDialog(null, "Incorrect, the correct guess is Kai",null, JOptionPane.INFORMATION_MESSAGE, icon);
					JOptionPane.showMessageDialog(null,"Credits:"
							+ "\n Creator: Angel Montenegro"
							+ "\n User: You are the user"
							+ "\n Thanks for looking at my code");
					int i  = JOptionPane.showOptionDialog(null,"Would you like to play again?","Guess Who",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options11,null);
					if(i == 0) {
						hi();
					}
					else {
						System.exit(0);
					}
				}
				if(a == 7) {
					JOptionPane.showMessageDialog(null, "Incorrect, the correct guess is Kai",null, JOptionPane.INFORMATION_MESSAGE, icon);
					JOptionPane.showMessageDialog(null,"Credits:"
							+ "\n Creator: Angel Montenegro"
							+ "\n User: You are the user"
							+ "\n Thanks for looking at my code");
					int i  = JOptionPane.showOptionDialog(null,"Would you like to play again?","Guess Who",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options11,null);
					if(i == 0) {
						hi();
					}
					else {
						System.exit(0);
					}
				}
				if(a == 8) {
					JOptionPane.showMessageDialog(null,"Credits:"
							+ "\n Creator: Angel Montenegro"
							+ "\n User: You are the user"
							+ "\n Thanks for looking at my code");
					int i  = JOptionPane.showOptionDialog(null,"Would you like to play again?","Guess Who",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options11,null);
					if(i == 0) {
						hi();
					}
					else {
						System.exit(0);
					}
				}
							
				
			}
			else if(rand == 1) {//Jay
				//int a = JOptionPane.showOptionDialog(null, "Your guess is:",null, JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options3,null);
				int a = JOptionPane.showOptionDialog(null, "The characters remaining: (The ones with zero are possible answers)"+ " ,Kai:" + +kai + " ,Jay:" + +jay + " ,Zane:" + +zane + " ,Cole" + +cole + " ,Lloyd:" + +lloyd+ " ,Nya" + +nya + " ,Misako:" + +misako + " ,Sensei Wu" + +senseiwu,null, JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options3,null);
				if(a ==0) {
					JOptionPane.showMessageDialog(null, "Incorrect, the correct guess is Jay",null, JOptionPane.INFORMATION_MESSAGE, icon2);
					JOptionPane.showMessageDialog(null,"Credits:"
							+ "\n Creator: Angel Montenegro"
							+ "\n User: You are the user"
							+ "\n Thanks for looking at my code");
					int i  = JOptionPane.showOptionDialog(null,"Would you like to play again?","Guess Who",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options11,null);
					if(i == 0) {
						hi();
					}
					else {
						System.exit(0);
					}
				}
				if(a == 1) {
					JOptionPane.showMessageDialog(null, "Correct, It is Jay",null, JOptionPane.INFORMATION_MESSAGE, icon2);
					JOptionPane.showMessageDialog(null,"Credits:"
							+ "\n Creator: Angel Montenegro"
							+ "\n User: You are the user"
							+ "\n Thanks for looking at my code");
					int i  = JOptionPane.showOptionDialog(null,"Would you like to play again?","Guess Who",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options11,null);
					if(i == 0) {
						hi();
					}
					else {
						System.exit(0);
					}
				}
				if(a == 2) {
					JOptionPane.showMessageDialog(null, "Incorrect, the correct guess is Jay",null, JOptionPane.INFORMATION_MESSAGE, icon2);
					JOptionPane.showMessageDialog(null,"Credits:"
							+ "\n Creator: Angel Montenegro"
							+ "\n User: You are the user"
							+ "\n Thanks for looking at my code");
					int i  = JOptionPane.showOptionDialog(null,"Would you like to play again?","Guess Who",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options11,null);
					if(i == 0) {
						hi();
					}
					else {
						System.exit(0);
					}
				}
				if(a == 3) {
					JOptionPane.showMessageDialog(null, "Incorrect, the correct guess is Jay",null, JOptionPane.INFORMATION_MESSAGE, icon2);
					JOptionPane.showMessageDialog(null,"Credits:"
							+ "\n Creator: Angel Montenegro"
							+ "\n User: You are the user"
							+ "\n Thanks for looking at my code");
					int i  = JOptionPane.showOptionDialog(null,"Would you like to play again?","Guess Who",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options11,null);
					if(i == 0) {
						hi();
					}
					else {
						System.exit(0);
					}
				}
				if(a == 4) {
					JOptionPane.showMessageDialog(null, "Incorrect, the correct guess is Jay",null, JOptionPane.INFORMATION_MESSAGE, icon2);
					JOptionPane.showMessageDialog(null,"Credits:"
							+ "\n Creator: Angel Montenegro"
							+ "\n User: You are the user"
							+ "\n Thanks for looking at my code");
					int i  = JOptionPane.showOptionDialog(null,"Would you like to play again?","Guess Who",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options11,null);
					if(i == 0) {
						hi();
					}
					else {
						System.exit(0);
					}
				}
				if(a == 5) {
					JOptionPane.showMessageDialog(null, "Incorrect, the correct guess is Jay",null, JOptionPane.INFORMATION_MESSAGE, icon2);
					JOptionPane.showMessageDialog(null,"Credits:"
							+ "\n Creator: Angel Montenegro"
							+ "\n User: You are the user"
							+ "\n Thanks for looking at my code");
					int i  = JOptionPane.showOptionDialog(null,"Would you like to play again?","Guess Who",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options11,null);
					if(i == 0) {
						hi();
					}
					else {
						System.exit(0);
					}
				}
				if(a == 6) {
					JOptionPane.showMessageDialog(null, "Incorrect, the correct guess is Jay",null, JOptionPane.INFORMATION_MESSAGE, icon2);
					JOptionPane.showMessageDialog(null,"Credits:"
							+ "\n Creator: Angel Montenegro"
							+ "\n User: You are the user"
							+ "\n Thanks for looking at my code");
					int i  = JOptionPane.showOptionDialog(null,"Would you like to play again?","Guess Who",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options11,null);
					if(i == 0) {
						hi();
					}
					else {
						System.exit(0);
					}
				}
				if(a == 7) {
					JOptionPane.showMessageDialog(null, "Incorrect, the correct guess is Jay",null, JOptionPane.INFORMATION_MESSAGE, icon2);
					JOptionPane.showMessageDialog(null,"Credits:"
							+ "\n Creator: Angel Montenegro"
							+ "\n User: You are the user"
							+ "\n Thanks for looking at my code");
					int i  = JOptionPane.showOptionDialog(null,"Would you like to play again?","Guess Who",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options11,null);
					if(i == 0) {
						hi();
					}
					else {
						System.exit(0);
					}
				}
				if(a == 8) {
					JOptionPane.showMessageDialog(null,"Credits:"
							+ "\n Creator: Angel Montenegro"
							+ "\n User: You are the user"
							+ "\n Thanks for looking at my code");
					int i  = JOptionPane.showOptionDialog(null,"Would you like to play again?","Guess Who",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options11,null);
					if(i == 0) {
						hi();
					}
					else {
						System.exit(0);
					}
				}
							
			}
			else if(rand == 2) {//Zane
				int a = JOptionPane.showOptionDialog(null, "The characters remaining: (The ones with zero are possible answers)"+ " ,Kai:" + +kai + " ,Jay:" + +jay + " ,Zane:" + +zane + " ,Cole" + +cole + " ,Lloyd:" + +lloyd+ " ,Nya" + +nya + " ,Misako:" + +misako + " ,Sensei Wu" + +senseiwu,null, JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options3,null);
				//int a = JOptionPane.showOptionDialog(null, "Your guess is:",null, JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options3,null);
				if(a ==0) {
					JOptionPane.showMessageDialog(null, "Incorrect, the correct guess is Zane",null, JOptionPane.INFORMATION_MESSAGE, icon3);
					JOptionPane.showMessageDialog(null,"Credits:"
							+ "\n Creator: Angel Montenegro"
							+ "\n User: You are the user"
							+ "\n Thanks for looking at my code");
					int i  = JOptionPane.showOptionDialog(null,"Would you like to play again?","Guess Who",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options11,null);
					if(i == 0) {
						hi();
					}
					else {
						System.exit(0);
					}
				}
				if(a == 1) {
					JOptionPane.showMessageDialog(null, "Incorrect, the correct guess is Zane",null, JOptionPane.INFORMATION_MESSAGE, icon3);
					JOptionPane.showMessageDialog(null,"Credits:"
							+ "\n Creator: Angel Montenegro"
							+ "\n User: You are the user"
							+ "\n Thanks for looking at my code");int i  = JOptionPane.showOptionDialog(null,"Would you like to play again?","Guess Who",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options11,null);
							if(i == 0) {
								hi();
							}
							else {
								System.exit(0);
							}
				}
				if(a == 2) {
					JOptionPane.showMessageDialog(null, "Correct, It is Zane",null, JOptionPane.INFORMATION_MESSAGE, icon3);
					JOptionPane.showMessageDialog(null,"Credits:"
							+ "\n Creator: Angel Montenegro"
							+ "\n User: You are the user"
							+ "\n Thanks for looking at my code");int i  = JOptionPane.showOptionDialog(null,"Would you like to play again?","Guess Who",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options11,null);
							if(i == 0) {
								hi();
							}
							else {
								System.exit(0);
							}
				}
				if(a == 3) {
					JOptionPane.showMessageDialog(null, "Incorrect, the correct guess is Zane",null, JOptionPane.INFORMATION_MESSAGE, icon3);
					JOptionPane.showMessageDialog(null,"Credits:"
							+ "\n Creator: Angel Montenegro"
							+ "\n User: You are the user"
							+ "\n Thanks for looking at my code");
					int i  = JOptionPane.showOptionDialog(null,"Would you like to play again?","Guess Who",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options11,null);
					if(i == 0) {
						hi();
					}
					else {
						System.exit(0);
					}
				}
				if(a == 4) {
					JOptionPane.showMessageDialog(null, "Incorrect, the correct guess is Zane",null, JOptionPane.INFORMATION_MESSAGE, icon3);
					JOptionPane.showMessageDialog(null,"Credits:"
							+ "\n Creator: Angel Montenegro"
							+ "\n User: You are the user"
							+ "\n Thanks for looking at my code");
					int i  = JOptionPane.showOptionDialog(null,"Would you like to play again?","Guess Who",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options11,null);
					if(i == 0) {
						hi();
					}
					else {
						System.exit(0);
					}
				}
				if(a == 5) {
					JOptionPane.showMessageDialog(null, "Incorrect, the correct guess is Zane",null, JOptionPane.INFORMATION_MESSAGE, icon3);
					JOptionPane.showMessageDialog(null,"Credits:"
							+ "\n Creator: Angel Montenegro"
							+ "\n User: You are the user"
							+ "\n Thanks for looking at my code");
					int i  = JOptionPane.showOptionDialog(null,"Would you like to play again?","Guess Who",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options11,null);
					if(i == 0) {
						hi();
					}
					else {
						System.exit(0);
					}
				}
				if(a == 6) {
					JOptionPane.showMessageDialog(null, "Incorrect, the correct guess is Zane",null, JOptionPane.INFORMATION_MESSAGE, icon3);
					JOptionPane.showMessageDialog(null,"Credits:"
							+ "\n Creator: Angel Montenegro"
							+ "\n User: You are the user"
							+ "\n Thanks for looking at my code");
					int i  = JOptionPane.showOptionDialog(null,"Would you like to play again?","Guess Who",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options11,null);
					if(i == 0) {
						hi();
					}
					else {
						System.exit(0);
					}
				}
				if(a == 7) {
					JOptionPane.showMessageDialog(null, "Incorrect, the correct guess is Zane",null, JOptionPane.INFORMATION_MESSAGE, icon3);
					JOptionPane.showMessageDialog(null,"Credits:"
							+ "\n Creator: Angel Montenegro"
							+ "\n User: You are the user"
							+ "\n Thanks for looking at my code");
					int i  = JOptionPane.showOptionDialog(null,"Would you like to play again?","Guess Who",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options11,null);
					if(i == 0) {
						hi();
					}
					else {
						System.exit(0);
					}
				}
				if(a == 8) {
					JOptionPane.showMessageDialog(null,"Credits:"
							+ "\n Creator: Angel Montenegro"
							+ "\n User: You are the user"
							+ "\n Thanks for looking at my code");
					int i  = JOptionPane.showOptionDialog(null,"Would you like to play again?","Guess Who",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options11,null);
					if(i == 0) {
						hi();
					}
					else {
						System.exit(0);
					}
				}
							
			}
			else if(rand == 3) {//Cole
				int a = JOptionPane.showOptionDialog(null, "The characters remaining: (The ones with zero are possible answers)"+ " ,Kai:" + +kai + " ,Jay:" + +jay + " ,Zane:" + +zane + " ,Cole" + +cole + " ,Lloyd:" + +lloyd+ " ,Nya" + +nya + " ,Misako:" + +misako + " ,Sensei Wu" + +senseiwu,null, JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options3,null);
				//int a = JOptionPane.showOptionDialog(null, "Your guess is:",null, JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options3,null);
				if(a ==0) {
					JOptionPane.showMessageDialog(null, "Incorrect, the correct guess is Cole",null, JOptionPane.INFORMATION_MESSAGE, icon4);
					JOptionPane.showMessageDialog(null,"Credits:"
							+ "\n Creator: Angel Montenegro"
							+ "\n User: You are the user"
							+ "\n Thanks for looking at my code");
					int i  = JOptionPane.showOptionDialog(null,"Would you like to play again?","Guess Who",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options11,null);
					if(i == 0) {
						hi();
					}
					else {
						System.exit(0);
					}
				}
				if(a == 1) {
					JOptionPane.showMessageDialog(null, "Incorrect, the correct guess is Cole",null, JOptionPane.INFORMATION_MESSAGE, icon4);
					JOptionPane.showMessageDialog(null,"Credits:"
							+ "\n Creator: Angel Montenegro"
							+ "\n User: You are the user"
							+ "\n Thanks for looking at my code");
					int i  = JOptionPane.showOptionDialog(null,"Would you like to play again?","Guess Who",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options11,null);
					if(i == 0) {
						hi();
					}
					else {
						System.exit(0);
					}
				}
				if(a == 2) {
					JOptionPane.showMessageDialog(null, "Incorrect, the correct guess is Cole",null, JOptionPane.INFORMATION_MESSAGE, icon4);
					JOptionPane.showMessageDialog(null,"Credits:"
							+ "\n Creator: Angel Montenegro"
							+ "\n User: You are the user"
							+ "\n Thanks for looking at my code");
					int i  = JOptionPane.showOptionDialog(null,"Would you like to play again?","Guess Who",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options11,null);
					if(i == 0) {
						hi();
					}
					else {
						System.exit(0);
					}
				}
				if(a == 3) {
					JOptionPane.showMessageDialog(null, "Correct, It is Cole",null, JOptionPane.INFORMATION_MESSAGE, icon4);
					JOptionPane.showMessageDialog(null,"Credits:"
							+ "\n Creator: Angel Montenegro"
							+ "\n User: You are the user"
							+ "\n Thanks for looking at my code");
					int i  = JOptionPane.showOptionDialog(null,"Would you like to play again?","Guess Who",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options11,null);
					if(i == 0) {
						hi();
					}
					else {
						System.exit(0);
					}
				}
				if(a == 4) {
					JOptionPane.showMessageDialog(null, "Incorrect, the correct guess is Cole",null, JOptionPane.INFORMATION_MESSAGE, icon4);
					JOptionPane.showMessageDialog(null,"Credits:"
							+ "\n Creator: Angel Montenegro"
							+ "\n User: You are the user"
							+ "\n Thanks for looking at my code");
					int i  = JOptionPane.showOptionDialog(null,"Would you like to play again?","Guess Who",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options11,null);
					if(i == 0) {
						hi();
					}
					else {
						System.exit(0);
					}
				}
				if(a == 5) {
					JOptionPane.showMessageDialog(null, "Incorrect, the correct guess is Cole",null, JOptionPane.INFORMATION_MESSAGE, icon4);
					JOptionPane.showMessageDialog(null,"Credits:"
							+ "\n Creator: Angel Montenegro"
							+ "\n User: You are the user"
							+ "\n Thanks for looking at my code");
					int i  = JOptionPane.showOptionDialog(null,"Would you like to play again?","Guess Who",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options11,null);
					if(i == 0) {
						hi();
					}
					else {
						System.exit(0);
					}
				}
				if(a == 6) {
					JOptionPane.showMessageDialog(null, "Incorrect, the correct guess is Cole",null, JOptionPane.INFORMATION_MESSAGE, icon4);
					JOptionPane.showMessageDialog(null,"Credits:"
							+ "\n Creator: Angel Montenegro"
							+ "\n User: You are the user"
							+ "\n Thanks for looking at my code");
					int i  = JOptionPane.showOptionDialog(null,"Would you like to play again?","Guess Who",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options11,null);
					if(i == 0) {
						hi();
					}
					else {
						System.exit(0);
					}
				}
				if(a == 7) {
					JOptionPane.showMessageDialog(null, "Incorrect, the correct guess is Cole",null, JOptionPane.INFORMATION_MESSAGE, icon4);
					JOptionPane.showMessageDialog(null,"Credits:"
							+ "\n Creator: Angel Montenegro"
							+ "\n User: You are the user"
							+ "\n Thanks for looking at my code");
					int i  = JOptionPane.showOptionDialog(null,"Would you like to play again?","Guess Who",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options11,null);
					if(i == 0) {
						hi();
					}
					else {
						System.exit(0);
					}
				}
				if(a == 8) {
					JOptionPane.showMessageDialog(null,"Credits:"
							+ "\n Creator: Angel Montenegro"
							+ "\n User: You are the user"
							+ "\n Thanks for looking at my code");
					int i  = JOptionPane.showOptionDialog(null,"Would you like to play again?","Guess Who",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options11,null);
					if(i == 0) {
						hi();
					}
					else {
						System.exit(0);
					}
				}
							
			}
			else if(rand == 4) {//Nya
				int a = JOptionPane.showOptionDialog(null, "The characters remaining: (The ones with zero are possible answers)"+ " ,Kai:" + +kai + " ,Jay:" + +jay + " ,Zane:" + +zane + " ,Cole" + +cole + " ,Lloyd:" + +lloyd+ " ,Nya" + +nya + " ,Misako:" + +misako + " ,Sensei Wu" + +senseiwu,null, JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options3,null);
				//int a = JOptionPane.showOptionDialog(null, "Your guess is:",null, JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options3,null);
				if(a ==0) {
					JOptionPane.showMessageDialog(null, "Incorrect, the correct guess is Nya",null, JOptionPane.INFORMATION_MESSAGE, icon5);
					JOptionPane.showMessageDialog(null,"Credits:"
							+ "\n Creator: Angel Montenegro"
							+ "\n User: You are the user"
							+ "\n Thanks for looking at my code");
					int i  = JOptionPane.showOptionDialog(null,"Would you like to play again?","Guess Who",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options11,null);
					if(i == 0) {
						hi();
					}
					else {
						System.exit(0);
					}
				}
				if(a == 1) {
					JOptionPane.showMessageDialog(null, "Incorrect, the correct guess is Nya",null, JOptionPane.INFORMATION_MESSAGE, icon5);
					JOptionPane.showMessageDialog(null,"Credits:"
							+ "\n Creator: Angel Montenegro"
							+ "\n User: You are the user"
							+ "\n Thanks for looking at my code");
					int i  = JOptionPane.showOptionDialog(null,"Would you like to play again?","Guess Who",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options11,null);
					if(i == 0) {
						hi();
					}
					else {
						System.exit(0);
					}
				}
				if(a == 2) {
					JOptionPane.showMessageDialog(null, "Incorrect, the correct guess is Nya",null, JOptionPane.INFORMATION_MESSAGE, icon5);
					JOptionPane.showMessageDialog(null,"Credits:"
							+ "\n Creator: Angel Montenegro"
							+ "\n User: You are the user"
							+ "\n Thanks for looking at my code");
					int i  = JOptionPane.showOptionDialog(null,"Would you like to play again?","Guess Who",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options11,null);
					if(i == 0) {
						hi();
					}
					else {
						System.exit(0);
					}
				}
				if(a == 3) {
					JOptionPane.showMessageDialog(null, "Incorrect, the correct guess is Nya",null, JOptionPane.INFORMATION_MESSAGE, icon5);
					JOptionPane.showMessageDialog(null,"Credits:"
							+ "\n Creator: Angel Montenegro"
							+ "\n User: You are the user"
							+ "\n Thanks for looking at my code");
					int i  = JOptionPane.showOptionDialog(null,"Would you like to play again?","Guess Who",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options11,null);
					if(i == 0) {
						hi();
					}
					else {
						System.exit(0);
					}
				}
				if(a == 4) {
					JOptionPane.showMessageDialog(null, "Correct, It is Nya",null, JOptionPane.INFORMATION_MESSAGE, icon5);
					JOptionPane.showMessageDialog(null,"Credits:"
							+ "\n Creator: Angel Montenegro"
							+ "\n User: You are the user"
							+ "\n Thanks for looking at my code");
					int i  = JOptionPane.showOptionDialog(null,"Would you like to play again?","Guess Who",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options11,null);
					if(i == 0) {
						hi();
					}
					else {
						System.exit(0);
					}
				}
				if(a == 5) {
					JOptionPane.showMessageDialog(null, "Incorrect, the correct guess is Nya",null, JOptionPane.INFORMATION_MESSAGE, icon5);
					JOptionPane.showMessageDialog(null,"Credits:"
							+ "\n Creator: Angel Montenegro"
							+ "\n User: You are the user"
							+ "\n Thanks for looking at my code");
					int i  = JOptionPane.showOptionDialog(null,"Would you like to play again?","Guess Who",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options11,null);
					if(i == 0) {
						hi();
					}
					else {
						System.exit(0);
					}
				}
				if(a == 6) {
					JOptionPane.showMessageDialog(null, "Incorrect, the correct guess is Nya",null, JOptionPane.INFORMATION_MESSAGE, icon5);
					JOptionPane.showMessageDialog(null,"Credits:"
							+ "\n Creator: Angel Montenegro"
							+ "\n User: You are the user"
							+ "\n Thanks for looking at my code");
					int i  = JOptionPane.showOptionDialog(null,"Would you like to play again?","Guess Who",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options11,null);
					if(i == 0) {
						hi();
					}
					else {
						System.exit(0);
					}
				}
				if(a == 7) {
					JOptionPane.showMessageDialog(null, "Incorrect, the correct guess is Nya",null, JOptionPane.INFORMATION_MESSAGE, icon5);
					JOptionPane.showMessageDialog(null,"Credits:"
							+ "\n Creator: Angel Montenegro"
							+ "\n User: You are the user"
							+ "\n Thanks for looking at my code");
					int i  = JOptionPane.showOptionDialog(null,"Would you like to play again?","Guess Who",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options11,null);
					if(i == 0) {
						hi();
					}
					else {
						System.exit(0);
					}
				}
				if(a == 8) {
					JOptionPane.showMessageDialog(null,"Credits:"
							+ "\n Creator: Angel Montenegro"
							+ "\n User: You are the user"
							+ "\n Thanks for looking at my code");
					int i  = JOptionPane.showOptionDialog(null,"Would you like to play again?","Guess Who",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options11,null);
					if(i == 0) {
						hi();
					}
					else {
						System.exit(0);
					}
				}
							
			}
			else if(rand == 5) {//Lloyd
				int a = JOptionPane.showOptionDialog(null, "The characters remaining: (The ones with zero are possible answers)"+ " ,Kai:" + +kai + " ,Jay:" + +jay + " ,Zane:" + +zane + " ,Cole" + +cole + " ,Lloyd:" + +lloyd+ " ,Nya" + +nya + " ,Misako:" + +misako + " ,Sensei Wu" + +senseiwu,null, JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options3,null);
				//int a = JOptionPane.showOptionDialog(null, "Your guess is:",null, JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options3,null);
				if(a ==0) {
					JOptionPane.showMessageDialog(null, "Incorrect, the correct guess is Lloyd",null, JOptionPane.INFORMATION_MESSAGE, icon6);
					JOptionPane.showMessageDialog(null,"Credits:"
							+ "\n Creator: Angel Montenegro"
							+ "\n User: You are the user"
							+ "\n Thanks for looking at my code");
					int i  = JOptionPane.showOptionDialog(null,"Would you like to play again?","Guess Who",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options11,null);
					if(i == 0) {
						hi();
					}
					else {
						System.exit(0);
					}
				}
				if(a == 1) {
					JOptionPane.showMessageDialog(null, "Incorrect, the correct guess is Lloyd",null, JOptionPane.INFORMATION_MESSAGE, icon6);
					JOptionPane.showMessageDialog(null,"Credits:"
							+ "\n Creator: Angel Montenegro"
							+ "\n User: You are the user"
							+ "\n Thanks for looking at my code");
					int i  = JOptionPane.showOptionDialog(null,"Would you like to play again?","Guess Who",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options11,null);
					if(i == 0) {
						hi();
					}
					else {
						System.exit(0);
					}
				}
				if(a == 2) {
					JOptionPane.showMessageDialog(null, "Incorrect, the correct guess is Lloyd",null, JOptionPane.INFORMATION_MESSAGE, icon6);
					JOptionPane.showMessageDialog(null,"Credits:"
							+ "\n Creator: Angel Montenegro"
							+ "\n User: You are the user"
							+ "\n Thanks for looking at my code");
					int i  = JOptionPane.showOptionDialog(null,"Would you like to play again?","Guess Who",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options11,null);
					if(i == 0) {
						hi();
					}
					else {
						System.exit(0);
					}
				}
				if(a == 3) {
					JOptionPane.showMessageDialog(null, "Incorrect, the correct guess is Lloyd",null, JOptionPane.INFORMATION_MESSAGE, icon6);
					JOptionPane.showMessageDialog(null,"Credits:"
							+ "\n Creator: Angel Montenegro"
							+ "\n User: You are the user"
							+ "\n Thanks for looking at my code");
					int i  = JOptionPane.showOptionDialog(null,"Would you like to play again?","Guess Who",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options11,null);
					if(i == 0) {
						hi();
					}
					else {
						System.exit(0);
					}
				}
				if(a == 4) {
					JOptionPane.showMessageDialog(null, "Incorrect, the correct guess is Lloyd",null, JOptionPane.INFORMATION_MESSAGE, icon6);
					JOptionPane.showMessageDialog(null,"Credits:"
							+ "\n Creator: Angel Montenegro"
							+ "\n User: You are the user"
							+ "\n Thanks for looking at my code");
					int i  = JOptionPane.showOptionDialog(null,"Would you like to play again?","Guess Who",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options11,null);
					if(i == 0) {
						hi();
					}
					else {
						System.exit(0);
					}
				}
				if(a == 5) {
					JOptionPane.showMessageDialog(null, "Correct, It is Lloyd",null, JOptionPane.INFORMATION_MESSAGE, icon6);
					JOptionPane.showMessageDialog(null,"Credits:"
							+ "\n Creator: Angel Montenegro"
							+ "\n User: You are the user"
							+ "\n Thanks for looking at my code");
					int i  = JOptionPane.showOptionDialog(null,"Would you like to play again?","Guess Who",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options11,null);
					if(i == 0) {
						hi();
					}
					else {
						System.exit(0);
					}
				}
				if(a == 6) {
					JOptionPane.showMessageDialog(null, "Incorrect, the correct guess is Lloyd",null, JOptionPane.INFORMATION_MESSAGE, icon6);
					JOptionPane.showMessageDialog(null,"Credits:"
							+ "\n Creator: Angel Montenegro"
							+ "\n User: You are the user"
							+ "\n Thanks for looking at my code");
					int i  = JOptionPane.showOptionDialog(null,"Would you like to play again?","Guess Who",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options11,null);
					if(i == 0) {
						hi();
					}
					else {
						System.exit(0);
					}
				}
				if(a == 7) {
					JOptionPane.showMessageDialog(null, "Incorrect, the correct guess is Lloyd",null, JOptionPane.INFORMATION_MESSAGE, icon6);
					JOptionPane.showMessageDialog(null,"Credits:"
							+ "\n Creator: Angel Montenegro"
							+ "\n User: You are the user"
							+ "\n Thanks for looking at my code");
					int i  = JOptionPane.showOptionDialog(null,"Would you like to play again?","Guess Who",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options11,null);
					if(i == 0) {
						hi();
					}
					else {
						System.exit(0);
					}
				}
				if(a == 8) {
					JOptionPane.showMessageDialog(null,"Credits:"
							+ "\n Creator: Angel Montenegro"
							+ "\n User: You are the user"
							+ "\n Thanks for looking at my code");
					int i  = JOptionPane.showOptionDialog(null,"Would you like to play again?","Guess Who",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options11,null);
					if(i == 0) {
						hi();
					}
					else {
						System.exit(0);
					}
				}
							
			}
			else if(rand == 6) {//Misako
				int a = JOptionPane.showOptionDialog(null, "The characters remaining: (The ones with zero are possible answers)"+ " ,Kai:" + +kai + " ,Jay:" + +jay + " ,Zane:" + +zane + " ,Cole" + +cole + " ,Lloyd:" + +lloyd+ " ,Nya" + +nya + " ,Misako:" + +misako + " ,Sensei Wu" + +senseiwu,null, JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options3,null);
				//int a = JOptionPane.showOptionDialog(null, "Your guess is:",null, JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options3,null);
				if(a ==0) {
					JOptionPane.showMessageDialog(null, "Incorrect, the correct guess is Misako",null, JOptionPane.INFORMATION_MESSAGE, icon7);
					JOptionPane.showMessageDialog(null,"Credits:"
							+ "\n Creator: Angel Montenegro"
							+ "\n User: You are the user"
							+ "\n Thanks for looking at my code");
					int i  = JOptionPane.showOptionDialog(null,"Would you like to play again?","Guess Who",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options11,null);
					if(i == 0) {
						hi();
					}
					else {
						System.exit(0);
					}
				}
				if(a == 1) {
					JOptionPane.showMessageDialog(null, "Incorrect, the correct guess is Misako",null, JOptionPane.INFORMATION_MESSAGE, icon7);
					JOptionPane.showMessageDialog(null,"Credits:"
							+ "\n Creator: Angel Montenegro"
							+ "\n User: You are the user"
							+ "\n Thanks for looking at my code");
					int i  = JOptionPane.showOptionDialog(null,"Would you like to play again?","Guess Who",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options11,null);
					if(i == 0) {
						hi();
					}
					else {
						System.exit(0);
					}
				}
				if(a == 2) {
					JOptionPane.showMessageDialog(null, "Incorrect, the correct guess is Misako",null, JOptionPane.INFORMATION_MESSAGE, icon7);
					JOptionPane.showMessageDialog(null,"Credits:"
							+ "\n Creator: Angel Montenegro"
							+ "\n User: You are the user"
							+ "\n Thanks for looking at my code");
					int i  = JOptionPane.showOptionDialog(null,"Would you like to play again?","Guess Who",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options11,null);
					if(i == 0) {
						hi();
					}
					else {
						System.exit(0);
					}
				}
				if(a == 3) {
					JOptionPane.showMessageDialog(null, "Incorrect, the correct guess is Misako",null, JOptionPane.INFORMATION_MESSAGE, icon7);
					JOptionPane.showMessageDialog(null,"Credits:"
							+ "\n Creator: Angel Montenegro"
							+ "\n User: You are the user"
							+ "\n Thanks for looking at my code");
					int i  = JOptionPane.showOptionDialog(null,"Would you like to play again?","Guess Who",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options11,null);
					if(i == 0) {
						hi();
					}
					else {
						System.exit(0);
					}
				}
				if(a == 4) {
					JOptionPane.showMessageDialog(null, "Incorrect, the correct guess is Misako",null, JOptionPane.INFORMATION_MESSAGE, icon7);
					JOptionPane.showMessageDialog(null,"Credits:"
							+ "\n Creator: Angel Montenegro"
							+ "\n User: You are the user"
							+ "\n Thanks for looking at my code");
					int i  = JOptionPane.showOptionDialog(null,"Would you like to play again?","Guess Who",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options11,null);
					if(i == 0) {
						hi();
					}
					else {
						System.exit(0);
					}
				}
				if(a == 5) {
					JOptionPane.showMessageDialog(null, "Incorrect, the correct guess is Misako",null, JOptionPane.INFORMATION_MESSAGE, icon7);
					JOptionPane.showMessageDialog(null,"Credits:"
							+ "\n Creator: Angel Montenegro"
							+ "\n User: You are the user"
							+ "\n Thanks for looking at my code");
					int i  = JOptionPane.showOptionDialog(null,"Would you like to play again?","Guess Who",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options11,null);
					if(i == 0) {
						hi();
					}
					else {
						System.exit(0);
					}
				}
				if(a == 6) {
					JOptionPane.showMessageDialog(null, "Correct, It is Misako",null, JOptionPane.INFORMATION_MESSAGE, icon7);
					JOptionPane.showMessageDialog(null,"Credits:"
							+ "\n Creator: Angel Montenegro"
							+ "\n User: You are the user"
							+ "\n Thanks for looking at my code");
					int i  = JOptionPane.showOptionDialog(null,"Would you like to play again?","Guess Who",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options11,null);
					if(i == 0) {
						hi();
					}
					else {
						System.exit(0);
					}
				}
				if(a == 7) {
					JOptionPane.showMessageDialog(null, "Incorrect, the correct guess is Misako",null, JOptionPane.INFORMATION_MESSAGE, icon7);
					JOptionPane.showMessageDialog(null,"Credits:"
							+ "\n Creator: Angel Montenegro"
							+ "\n User: You are the user"
							+ "\n Thanks for looking at my code");
					int i  = JOptionPane.showOptionDialog(null,"Would you like to play again?","Guess Who",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options11,null);
					if(i == 0) {
						hi();
					}
					else {
						System.exit(0);
					}
				}
				if(a == 8) {
					JOptionPane.showMessageDialog(null,"Credits:"
							+ "\n Creator: Angel Montenegro"
							+ "\n User: You are the user"
							+ "\n Thanks for looking at my code");
					int i  = JOptionPane.showOptionDialog(null,"Would you like to play again?","Guess Who",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options11,null);
					if(i == 0) {
						hi();
					}
					else {
						System.exit(0);
					}
				}
							
			}
			else if(rand == 7) {//Sensei wu
				int a = JOptionPane.showOptionDialog(null, "The characters remaining: (The ones with zero are possible answers)"+ " ,Kai:" + +kai + " ,Jay:" + +jay + " ,Zane:" + +zane + " ,Cole" + +cole + " ,Lloyd:" + +lloyd+ " ,Nya" + +nya + " ,Misako:" + +misako + " ,Sensei Wu" + +senseiwu,null, JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options3,null);
				//int a = JOptionPane.showOptionDialog(null, "Your guess is:",null, JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options3,null);
				if(a ==0) {
					JOptionPane.showMessageDialog(null, "Incorrect, the correct guess is Sensei Wu",null, JOptionPane.INFORMATION_MESSAGE, icon8);
					JOptionPane.showMessageDialog(null,"Credits:"
							+ "\n Creator: Angel Montenegro"
							+ "\n User: You are the user"
							+ "\n Thanks for looking at my code");
					int i  = JOptionPane.showOptionDialog(null,"Would you like to play again?","Guess Who",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options11,null);
					if(i == 0) {
						hi();
					}
					else {
						System.exit(0);
					}
				}
				if(a == 1) {
					JOptionPane.showMessageDialog(null, "Incorrect, the correct guess is Sensei Wu",null, JOptionPane.INFORMATION_MESSAGE, icon8);
					JOptionPane.showMessageDialog(null,"Credits:"
							+ "\n Creator: Angel Montenegro"
							+ "\n User: You are the user"
							+ "\n Thanks for looking at my code");
					int i  = JOptionPane.showOptionDialog(null,"Would you like to play again?","Guess Who",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options11,null);
					if(i == 0) {
						hi();
					}
					else {
						System.exit(0);
					}
				}
				if(a == 2) {
					JOptionPane.showMessageDialog(null, "Incorrect, the correct guess is Sensei Wu",null, JOptionPane.INFORMATION_MESSAGE, icon8);
					JOptionPane.showMessageDialog(null,"Credits:"
							+ "\n Creator: Angel Montenegro"
							+ "\n User: You are the user"
							+ "\n Thanks for looking at my code");
					int i  = JOptionPane.showOptionDialog(null,"Would you like to play again?","Guess Who",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options11,null);
					if(i == 0) {
						hi();
					}
					else {
						System.exit(0);
					}
				}
				if(a == 3) {
					JOptionPane.showMessageDialog(null, "Incorrect, the correct guess is Sensei Wu",null, JOptionPane.INFORMATION_MESSAGE, icon8);
					JOptionPane.showMessageDialog(null,"Credits:"
							+ "\n Creator: Angel Montenegro"
							+ "\n User: You are the user"
							+ "\n Thanks for looking at my code");
					int i  = JOptionPane.showOptionDialog(null,"Would you like to play again?","Guess Who",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options11,null);
					if(i == 0) {
						hi();
					}
					else {
						System.exit(0);
					}
				}
				if(a == 4) {
					JOptionPane.showMessageDialog(null, "Incorrect, the correct guess is Senseu Wu",null, JOptionPane.INFORMATION_MESSAGE, icon8);
					JOptionPane.showMessageDialog(null,"Credits:"
							+ "\n Creator: Angel Montenegro"
							+ "\n User: You are the user"
							+ "\n Thanks for looking at my code");
					int i  = JOptionPane.showOptionDialog(null,"Would you like to play again?","Guess Who",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options11,null);
					if(i == 0) {
						hi();
					}
					else {
						System.exit(0);
					}
				}
				if(a == 5) {
					JOptionPane.showMessageDialog(null, "Incorrect, the correct guess is Sensei Wu",null, JOptionPane.INFORMATION_MESSAGE, icon8);
					JOptionPane.showMessageDialog(null,"Credits:"
							+ "\n Creator: Angel Montenegro"
							+ "\n User: You are the user"
							+ "\n Thanks for looking at my code");
					int i  = JOptionPane.showOptionDialog(null,"Would you like to play again?","Guess Who",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options11,null);
					if(i == 0) {
						hi();
					}
					else {
						System.exit(0);
					}
				}
				if(a == 6) {
					JOptionPane.showMessageDialog(null, "Incorrect, the correct guess is Sensei Wu",null, JOptionPane.INFORMATION_MESSAGE, icon8);
					JOptionPane.showMessageDialog(null,"Credits:"
							+ "\n Creator: Angel Montenegro"
							+ "\n User: You are the user"
							+ "\n Thanks for looking at my code");
					int i  = JOptionPane.showOptionDialog(null,"Would you like to play again?","Guess Who",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options11,null);
					if(i == 0) {
						hi();
					}
					else {
						System.exit(0);
					}				}
				if(a == 7) {
					JOptionPane.showMessageDialog(null, "Correct, It is Sensei Wu",null, JOptionPane.INFORMATION_MESSAGE, icon8);
							JOptionPane.showMessageDialog(null,"Credits:"
									+ "\n Creator: Angel Montenegro"
									+ "\n User: You are the user"
									+ "\n Thanks for looking at my code");int i  = JOptionPane.showOptionDialog(null,"Would you like to play again?","Guess Who",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options11,null);
							if(i == 0) {
								hi();
							}
							else {
								System.exit(0);
							}
				}
				if(a == 8) {
					JOptionPane.showMessageDialog(null,"Credits:"
							+ "\n Creator: Angel Montenegro"
							+ "\n User: You are the user"
							+ "\n Thanks for looking at my code");
					int i  = JOptionPane.showOptionDialog(null,"Would you like to play again?","Guess Who",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,options11,null);
					if(i == 0) {
						hi();
					}
					else {
						System.exit(0);
					}
				}
							
			}
			}
			
			if (g == 1) {
				JOptionPane.showMessageDialog(null,"Credits:"
						+ "\n Creator: Angel Montenegro"
						+ "\n User: You are the user"
						+ "\n Thanks for looking at my code");
				System.exit(0);
			}
			
		}
		
		
	}
	
	}



