
package KTDH;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class MainFrame extends JFrame {

	Surface sf = new Surface();
	Transformation tm = new Transformation();
	int speed = 1700;

	// button 2D
	JButton btRs = new JButton();
	JButton btPause = new JButton();
	JButton bt4 = new JButton();
	JButton btSpeedInc = new JButton();
	JButton btSpeedDec = new JButton();
	JLabel lb4_viendan = new JLabel();
	JLabel lb4_nongsung1 = new JLabel();
	JLabel lb4_nongsung2 = new JLabel();
	JLabel lb4_tialua1 = new JLabel();
	JLabel lb4_tialua2 = new JLabel();
	JLabel lb4_maybay1 = new JLabel();
	JLabel lb4_maybay2 = new JLabel();
	JLabel lb4_may1 = new JLabel();
	JLabel lb4_may2 = new JLabel();
	JLabel lb_Note = new JLabel();
	// JLabel lb4_maybay3 = new JLabel();

	// 3D_1
	JButton bt1 = new JButton();
	JTextField tf1_1 = new JTextField();
	JTextField tf1_2 = new JTextField();
	JTextField tf1_3 = new JTextField();
	JTextField tf1_4 = new JTextField();
	JTextField tf1_5 = new JTextField();
	JLabel lb1_1 = new JLabel();
	JLabel lb1_2 = new JLabel();
	JLabel lb1_3 = new JLabel();
	JLabel lb1_4 = new JLabel();
	JLabel lb1_5 = new JLabel();
	// 3D_2
	JButton bt2 = new JButton();
	JTextField tf2_1 = new JTextField();
	JTextField tf2_2 = new JTextField();
	JTextField tf2_3 = new JTextField();
	JTextField tf2_4 = new JTextField();
	JLabel lb2_1 = new JLabel();
	JLabel lb2_2 = new JLabel();
	JLabel lb2_3 = new JLabel();
	JLabel lb2_4 = new JLabel();

	// 3D_3
	JButton bt3 = new JButton();
	JTextField tf3_1 = new JTextField();
	JTextField tf3_2 = new JTextField();
	JTextField tf3_3 = new JTextField();
	JTextField tf3_4 = new JTextField();
	JTextField tf3_5 = new JTextField();
	JLabel lb3_1 = new JLabel();
	JLabel lb3_2 = new JLabel();
	JLabel lb3_3 = new JLabel();
	JLabel lb3_4 = new JLabel();
	JLabel lb3_5 = new JLabel();

	public static boolean isNumeric(String str) {
		return str.matches("-?\\d+(\\.\\d+)?");
	}

	Thread ban = new Thread(new Runnable() {

		@Override
		public void run() {
			while (true) {

				sf.nongsung1 = new Point(15 * 5, 97 * 5);
				sf.nongsung2 = new Point(15 * 5, 99 * 5);
				sf.nongsung3 = new Point(35 * 5, 88 * 5);
				sf.nongsung4 = new Point(35 * 5, 90 * 5);
				sf.diem1 = new Point(500, 450);
				sf.diem2 = new Point(500, 550);
				sf.diem3 = new Point(580, 420);
				sf.diem4 = new Point(580, 550);
				sf.diem5 = new Point(660, 390);
				sf.diem6 = new Point(660, 550);
				sf.diem7 = new Point(740, 360);
				sf.diem8 = new Point(740, 550);
				sf.tiLeX = 5;
				sf.tiLeY = 4;
				lb4_nongsung1.setText(
						"Nong sung 1: " + "(" + (sf.nongsung3.x - 375) / 5 + "," + (375 - sf.nongsung3.y) / 5 + ")");
				lb4_nongsung2.setText(
						"Nong sung 2: " + "(" + (sf.nongsung4.x - 375) / 5 + "," + (375 - sf.nongsung4.y) / 5 + ")");
				tm.gocquay = 8;
				sf.nongsung4 = tm.Quay(sf.nongsung4, sf.nongsung2);
				sf.nongsung3 = tm.Quay(sf.nongsung3, sf.nongsung1);
				try {
					Thread.sleep(speed);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				lb4_nongsung1.setText(
						"Nong sung 1: " + "(" + (sf.nongsung3.x - 375) / 5 + "," + (sf.nongsung3.x - 375) / 5 + ")");
				lb4_nongsung2.setText(
						"Nong sung 2: " + "(" + (sf.nongsung4.x - 375) / 5 + "," + (sf.nongsung4.x - 375) / 5 + ")");
				tm.gocquay = 9;
				sf.nongsung4 = tm.Quay(sf.nongsung4, sf.nongsung2);
				sf.nongsung3 = tm.Quay(sf.nongsung3, sf.nongsung1);
				try {
					Thread.sleep(speed);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				lb4_nongsung1.setText(
						"Nong sung 1: " + "(" + (sf.nongsung3.x - 375) / 5 + "," + (375 - sf.nongsung3.y) / 5 + ")");
				lb4_nongsung2.setText(
						"Nong sung 2: " + "(" + (sf.nongsung4.x - 375) / 5 + "," + (375 - sf.nongsung4.y) / 5 + ")");
				tm.gocquay = 9;
				sf.nongsung4 = tm.Quay(sf.nongsung4, sf.nongsung2);
				sf.nongsung3 = tm.Quay(sf.nongsung3, sf.nongsung1);
				try {
					Thread.sleep(speed);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				lb4_nongsung1.setText(
						"Nong sung 1: " + "(" + (sf.nongsung3.x - 375) / 5 + "," + (375 - sf.nongsung3.y) / 5 + ")");
				lb4_nongsung2.setText(
						"Nong sung 2: " + "(" + (sf.nongsung4.x - 375) / 5 + "," + (375 - sf.nongsung4.y) / 5 + ")");
				sf.vienDan = new Point(150, 495);
				sf.lua1 = new Point(210, 490);
				sf.lua2 = new Point(240, 487);

				while (sf.vienDan.x < 450) {
					sf.vienDan = tm.translation(sf.vienDan.x, sf.vienDan.y, 80, 0);
					sf.tiLeX *= 1.2;
					sf.tiLeY *= 1.2;
					sf.vienDan.y += -2;
					sf.lua1 = new Point((int) (sf.lua1.x * 1.06), (int) (sf.lua1.y * 0.99));
					sf.lua2 = new Point((int) (sf.lua2.x * 1.1), (int) (sf.lua2.y * 0.97));
					lb4_tialua1
							.setText("Tia lua 1: " + "(" + (sf.lua1.x - 375) / 5 + "," + (375 - sf.lua1.y) / 5 + ")");
					lb4_tialua2
							.setText("Tia lua 2: " + "(" + (sf.lua2.x - 375) / 5 + "," + (375 - sf.lua2.y) / 5 + ")");
					lb4_viendan.setText(
							"Vien dan: " + "(" + (sf.vienDan.x - 375) / 5 + "," + (375 - sf.vienDan.y) / 5 + ")");
					try {
						Thread.sleep(speed);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

				sf.vienDan = tm.translation(sf.vienDan.x, sf.vienDan.y, 50, 0);
				sf.tiLeX *= 1.16;
				sf.tiLeY *= 1.16;
				sf.vienDan.y += -4.5;
				sf.lua1 = new Point((int) (sf.lua1.x * 1.06), (int) (sf.lua1.y * 0.99));
				sf.lua2 = new Point((int) (sf.lua2.x * 1.1), (int) (sf.lua2.y * 0.97));

				lb4_tialua1.setText("Tia lua 1: " + "(" + (sf.lua1.x - 375) / 5 + "," + (375 - sf.lua1.y) / 5 + ")");
				lb4_tialua2.setText("Tia lua 2: " + "(" + (sf.lua2.x - 375) / 5 + "," + (375 - sf.lua2.y) / 5 + ")");
				lb4_viendan
						.setText("Vien dan: " + "(" + (sf.vienDan.x - 375) / 5 + "," + (375 - sf.vienDan.y) / 5 + ")");
				tm.gocquay = 30;
				sf.diem1 = tm.Quay(sf.diem1, sf.diem2);
				try {
					Thread.sleep(speed);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				sf.vienDan = tm.translation(sf.vienDan.x, sf.vienDan.y, 50, 0);
				sf.tiLeX *= 1.16;
				sf.tiLeY *= 1.16;
				sf.vienDan.y += -4.5;

				sf.lua1.x = -50;
				sf.lua1.y = -50;
				sf.lua2.x = -50;
				sf.lua2.y = -50;
				lb4_viendan
						.setText("Vien dan: " + "(" + (sf.vienDan.x - 375) / 5 + "," + (375 - sf.vienDan.y) / 5 + ")");
				tm.gocquay = 60;
				sf.diem1 = tm.Quay(sf.diem1, sf.diem2);
				tm.gocquay = 30;
				sf.diem3 = tm.Quay(sf.diem3, sf.diem4);
				try {
					Thread.sleep(speed);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				sf.vienDan = tm.translation(sf.vienDan.x, sf.vienDan.y, 80, 0);
				sf.tiLeX *= 1.16;
				sf.tiLeY *= 1.16;
				sf.vienDan.y += -4.5;

				lb4_viendan
						.setText("Vien dan: " + "(" + (sf.vienDan.x - 375) / 5 + "," + (375 - sf.vienDan.y) / 5 + ")");

				tm.gocquay = 60;
				sf.diem3 = tm.Quay(sf.diem3, sf.diem4);
				tm.gocquay = 30;
				sf.diem5 = tm.Quay(sf.diem5, sf.diem6);
				try {
					Thread.sleep(speed);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				sf.vienDan = tm.translation(sf.vienDan.x, sf.vienDan.y, 100, 0);
				sf.tiLeX *= 1.16;
				sf.tiLeY *= 1.16;
				sf.vienDan.y += -4.5;
				lb4_viendan
						.setText("Vien dan: " + "(" + (sf.vienDan.x - 375) / 5 + "," + (375 - sf.vienDan.y) / 5 + ")");
				tm.gocquay = 60;
				sf.diem5 = tm.Quay(sf.diem5, sf.diem6);
				tm.gocquay = 30;
				sf.diem7 = tm.Quay(sf.diem7, sf.diem8);
				try {
					Thread.sleep(speed);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				sf.vienDan = tm.translation(sf.vienDan.x, sf.vienDan.y, 100, 0);
				sf.tiLeX *= 1.16;
				sf.tiLeY *= 1.16;
				sf.vienDan.y += -4.5;
				lb4_viendan
						.setText("Vien dan: " + "(" + (sf.vienDan.x - 375) / 5 + "," + (375 - sf.vienDan.y) / 5 + ")");
				tm.gocquay = 60;
				sf.diem7 = tm.Quay(sf.diem7, sf.diem8);
				sf.lua1.x = -50;
				sf.lua1.y = -50;
				sf.lua2.x = -50;
				sf.lua2.y = -50;
			}
		}
	});

	Thread bay1 = new Thread(new Runnable() {
		@Override
		public void run() {
			while (true) {
				Random vitri = new Random();
				tm.gocquay = vitri.nextInt((50 - -25) + 1) + -25;
				sf.may = tm.Quay(sf.may, new Point(160, 50));
				lb4_may1.setText("Dam may 1: " + "(" + (sf.may.x - 375) / 5 + "," + (375 - sf.may.y) / 5 + ")");
				lb4_may2.setText("Dam may 2: " + "(" + (sf.may_dx.x - 375) / 5 + "," + (375 - sf.may_dx.y) / 5 + ")");
				int doCao1 = vitri.nextInt((50 - -50) + 1) + -50;
				sf.vemaybay1 = tm.translation(sf.vemaybay1.x, sf.vemaybay1.y, -50, doCao1);
				if (sf.vemaybay1.y > 350)
					sf.vemaybay1 = tm.translation(sf.vemaybay1.x, sf.vemaybay1.y, -50, -50);
				lb4_maybay1.setText(
						"May bay 1: " + "(" + (sf.vemaybay1.x - 375) / 5 + "," + (375 - sf.vemaybay1.y) / 5 + ")");

				int doCao2 = vitri.nextInt((50 - -50) + 1) + -50;
				sf.vemaybay2 = tm.translation(sf.vemaybay2.x, sf.vemaybay2.y, -50, doCao2);
				if (sf.vemaybay2.y > 350)
					sf.vemaybay2 = tm.translation(sf.vemaybay2.x, sf.vemaybay2.y, -50, -50);
				lb4_maybay2.setText(
						"May bay 2: " + "(" + (sf.vemaybay2.x - 375) / 5 + "," + (375 - sf.vemaybay2.y) / 5 + ")");
				try {
					Thread.sleep(speed);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if (sf.vemaybay1.x < -100) {
					int valueX = vitri.nextInt((1100 - 700) + 1) + 700;
					int valueY = vitri.nextInt((300 - 50) + 1) + 50;
					sf.vemaybay1.x = valueX;
					sf.vemaybay1.y = valueY;
				}
				if (sf.vemaybay2.x < -100) {
					int valueX = vitri.nextInt((1100 - 700) + 1) + 700;
					int valueY = vitri.nextInt((300 - 50) + 1) + 50;
					sf.vemaybay2.x = valueX;
					sf.vemaybay2.y = valueY;
				}

			}
		}
	});

	// ham khoi tao
	public MainFrame() {
		// ham khoi tao cac gia tri do hoa
		initUI();
	}

	public synchronized void initUI() {
		this.setSize(1350, 800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("KTDH - NHOM 13");
		this.getContentPane().setBackground(new Color(194, 164, 223));
//		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
//		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2 );

		bt4.setText("Play");
		bt4.setBounds(60, 30, 150, 40);
		bt4.setBorder(BorderFactory.createBevelBorder(1));
		bt4.setFocusable(false);
		bt4.setFont(new Font("Ink Free", Font.CENTER_BASELINE, 16));
		bt4.addActionListener(new ActionListener() {

			@Override
			public synchronized void actionPerformed(ActionEvent e) {
				String message = "Do khi su dung Thread.sleep gay dong bang GUI tao nen hien tuong giat lag. De han che, vui long de toc do thap, co the nhan Pause 3s roi Resume";
				JOptionPane.showMessageDialog(new JFrame(), message, "Luu y!", JOptionPane.WARNING_MESSAGE);
				sf.index = 1;
				ban.start();
				bay1.start();
			}
		});

		lb4_maybay1.setBounds(60, 100, 150, 40);
		lb4_maybay2.setBounds(60, 150, 150, 40);
		// lb4_maybay3.setBounds(60, 250, 150, 40);
		lb4_viendan.setBounds(60, 200, 150, 40);
		lb4_nongsung1.setBounds(60, 250, 150, 40);
		lb4_nongsung2.setBounds(60, 300, 150, 40);
		lb4_tialua1.setBounds(60, 350, 150, 40);
		lb4_tialua2.setBounds(60, 400, 150, 40);
		lb4_may1.setBounds(60, 450, 150, 40);
		lb4_may2.setBounds(60, 500, 150, 40);

		btRs.setText("Resume 2D");
		btRs.setBounds(60, 600, 150, 40);
		btRs.setBorder(BorderFactory.createBevelBorder(1));
		btRs.setFocusable(false);
		btRs.setFont(new Font("Ink Free", Font.CENTER_BASELINE, 16));

		btRs.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sf.index = 1;
				ban.resume();
				bay1.resume();

			}
		});

		btPause.setText("Pause 2D");
		btPause.setBounds(60, 550, 150, 40);
		btPause.setBorder(BorderFactory.createBevelBorder(1));
		btPause.setFocusable(false);
		btPause.setFont(new Font("Ink Free", Font.CENTER_BASELINE, 16));

		btPause.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ban.suspend();
				bay1.suspend();
			}
		});

		btSpeedInc.setText("+Speed");
		btSpeedInc.setBounds(60, 650, 60, 40);
		btSpeedInc.setBorder(BorderFactory.createBevelBorder(1));
		btSpeedInc.setFocusable(false);
		btSpeedInc.setFont(new Font("Ink Free", Font.CENTER_BASELINE, 16));
		btSpeedInc.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				speed *= 0.75;
			}
		});
		btSpeedDec.setText("-Speed");
		btSpeedDec.setBounds(150, 650, 60, 40);
		btSpeedDec.setBorder(BorderFactory.createBevelBorder(1));
		btSpeedDec.setFocusable(false);
		btSpeedDec.setFont(new Font("Ink Free", Font.CENTER_BASELINE, 16));
		btSpeedDec.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				speed *= 1.5;
			}
		});

		// 3D_1
		bt1.setText("Ve Hinh Non");
		bt1.setBounds(1120, 30, 150, 40);
		bt1.setBorder(BorderFactory.createBevelBorder(1));
		bt1.setFocusable(false);
		bt1.setFont(new Font("Ink Free", Font.CENTER_BASELINE, 16));

		bt1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				ban.suspend();
				bay1.suspend();

				if (isNumeric(tf1_1.getText()) && isNumeric(tf1_2.getText()) && isNumeric(tf1_3.getText())
						&& isNumeric(tf1_4.getText()) && isNumeric(tf1_5.getText())) {
					sf.x_non = Integer.parseInt(tf1_1.getText());
					sf.y_non = Integer.parseInt(tf1_2.getText());
					sf.z_non = Integer.parseInt(tf1_3.getText());
					sf.r_non = Integer.parseInt(tf1_4.getText());
					sf.h_non = Integer.parseInt(tf1_5.getText());
					if (sf.r_non < 0) {
						String message = "Ban kinh khong the am";
						JOptionPane.showMessageDialog(new JFrame(), message, "Canh bao!", JOptionPane.ERROR_MESSAGE);
					} else {
						sf.index = 2;
						sf.repaint();
					}
				} else {
					String message = "Vui long nhap dung dung dang";
					JOptionPane.showMessageDialog(new JFrame(), message, "Canh bao!", JOptionPane.ERROR_MESSAGE);
				}

			}
		});

		tf1_1.setText("");
		tf1_1.setBounds(1110, 100, 60, 27);
		tf1_2.setText("");
		tf1_2.setBounds(1110, 140, 60, 27);
		tf1_3.setText("");
		tf1_3.setBounds(1110, 180, 60, 27);
		tf1_4.setText("");
		tf1_4.setBounds(1220, 100, 60, 27);
		tf1_5.setText("");
		tf1_5.setBounds(1220, 140, 60, 27);

		lb1_1.setText("X:");
		lb1_1.setBounds(1080, 100, 40, 27);
		lb1_1.setFont(new Font("Ink Free", Font.CENTER_BASELINE, 14));
		lb1_2.setText("Y:");
		lb1_2.setBounds(1080, 140, 40, 27);
		lb1_2.setFont(new Font("Ink Free", Font.CENTER_BASELINE, 14));
		lb1_3.setText("Z:");
		lb1_3.setBounds(1080, 180, 40, 27);
		lb1_3.setFont(new Font("Ink Free", Font.CENTER_BASELINE, 14));
		lb1_4.setText("R:");
		lb1_4.setBounds(1200, 100, 40, 27);
		lb1_4.setFont(new Font("Ink Free", Font.CENTER_BASELINE, 14));
		lb1_5.setText("H:");
		lb1_5.setBounds(1200, 140, 40, 27);
		lb1_5.setFont(new Font("Ink Free", Font.CENTER_BASELINE, 14));

		// 3D_2
		bt2.setText("Ve Hinh Cau");
		bt2.setBounds(1120, 240, 150, 40);
		bt2.setBorder(BorderFactory.createBevelBorder(1));
		bt2.setFocusable(false);
		bt2.setFont(new Font("Ink Free", Font.CENTER_BASELINE, 16));

		bt2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				ban.suspend();
				bay1.suspend();

				if (isNumeric(tf2_1.getText()) && isNumeric(tf2_2.getText()) && isNumeric(tf2_3.getText())
						&& isNumeric(tf2_4.getText())) {
					sf.x_cau = Integer.parseInt(tf2_1.getText());
					sf.y_cau = Integer.parseInt(tf2_2.getText());
					sf.z_cau = Integer.parseInt(tf2_3.getText());
					sf.r_cau = Integer.parseInt(tf2_4.getText());
					if (sf.r_cau < 0) {
						String message = "Ban kinh khong the am";
						JOptionPane.showMessageDialog(new JFrame(), message, "Canh bao!", JOptionPane.ERROR_MESSAGE);
					} else {
						sf.index = 3;
						sf.repaint();
					}
				} else {
					String message = "Vui long nhap dung dung dang";
					JOptionPane.showMessageDialog(new JFrame(), message, "Canh bao!", JOptionPane.ERROR_MESSAGE);
				}

			}
		});

		tf2_1.setText("");
		tf2_1.setBounds(1110, 300, 60, 27);
		tf2_2.setText("");
		tf2_2.setBounds(1110, 340, 60, 27);
		tf2_3.setText("");
		tf2_3.setBounds(1220, 300, 60, 27);
		tf2_4.setText("");
		tf2_4.setBounds(1220, 340, 60, 27);

		lb2_1.setText("X:");
		lb2_1.setBounds(1080, 300, 40, 27);
		lb2_1.setFont(new Font("Ink Free", Font.CENTER_BASELINE, 14));
		lb2_2.setText("Y:");
		lb2_2.setBounds(1080, 340, 40, 27);
		lb2_2.setFont(new Font("Ink Free", Font.CENTER_BASELINE, 14));
		lb2_3.setText("Z:");
		lb2_3.setBounds(1200, 300, 40, 27);
		lb2_3.setFont(new Font("Ink Free", Font.CENTER_BASELINE, 14));
		lb2_4.setText("R:");
		lb2_4.setBounds(1200, 340, 40, 27);
		lb2_4.setFont(new Font("Ink Free", Font.CENTER_BASELINE, 14));

		// 3d_3 HINH TRU
		bt3.setText("Ve Hinh Tru");
		bt3.setBounds(1120, 420, 150, 40);
		bt3.setBorder(BorderFactory.createBevelBorder(1));
		bt3.setFocusable(false);
		bt3.setFont(new Font("Ink Free", Font.CENTER_BASELINE, 16));

		bt3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ban.suspend();
				bay1.suspend();

				if (isNumeric(tf3_1.getText()) && isNumeric(tf3_2.getText()) && isNumeric(tf3_3.getText())
						&& isNumeric(tf3_4.getText()) && isNumeric(tf3_5.getText())) {
					sf.x_tru = Integer.parseInt(tf3_1.getText());
					sf.y_tru = Integer.parseInt(tf3_2.getText());
					sf.z_tru = Integer.parseInt(tf3_3.getText());
					sf.r_tru = Integer.parseInt(tf3_4.getText());
					sf.h_tru = Integer.parseInt(tf3_5.getText());
					if (sf.r_tru < 0) {
						String message = "Ban kinh khong the am";
						JOptionPane.showMessageDialog(new JFrame(), message, "Canh bao!", JOptionPane.ERROR_MESSAGE);
					} else {
						sf.index = 4;
						sf.repaint();
					}
				} else {
					String message = "Vui long nhap dung dung dang";
					JOptionPane.showMessageDialog(new JFrame(), message, "Canh bao!", JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		tf3_1.setText("");
		tf3_1.setBounds(1110, 480, 60, 27);
		tf3_2.setText("");
		tf3_2.setBounds(1110, 520, 60, 27);
		tf3_3.setText("");
		tf3_3.setBounds(1110, 560, 60, 27);
		tf3_4.setText("");
		tf3_4.setBounds(1220, 480, 60, 27);
		tf3_5.setText("");
		tf3_5.setBounds(1220, 520, 60, 27);

		lb3_1.setText("X:");
		lb3_1.setBounds(1080, 480, 40, 27);
		lb3_1.setFont(new Font("Ink Free", Font.CENTER_BASELINE, 14));
		lb3_2.setText("Y:");
		lb3_2.setBounds(1080, 520, 40, 27);
		lb3_2.setFont(new Font("Ink Free", Font.CENTER_BASELINE, 14));
		lb3_3.setText("Z:");
		lb3_3.setBounds(1080, 560, 40, 27);
		lb3_3.setFont(new Font("Ink Free", Font.CENTER_BASELINE, 14));
		lb3_4.setText("R:");
		lb3_4.setBounds(1200, 480, 40, 27);
		lb3_4.setFont(new Font("Ink Free", Font.CENTER_BASELINE, 14));
		lb3_5.setText("H:");
		lb3_5.setBounds(1200, 520, 40, 27);
		lb3_5.setFont(new Font("Ink Free", Font.CENTER_BASELINE, 14));

		// add labels
		this.add(lb4_maybay1);
		this.add(lb4_maybay2);
		// this.add(lb4_maybay3);
		this.add(lb4_nongsung1);
		this.add(lb4_nongsung2);
		this.add(lb4_tialua1);
		this.add(lb4_tialua2);
		this.add(lb4_viendan);
		this.add(lb4_may1);
		this.add(lb4_may2);

		// add buttons
		this.add(bt4);
		this.add(btRs);
		this.add(btPause);
		this.add(btSpeedInc);
		this.add(btSpeedDec);

		// Add 3D
		this.add(bt1);
		this.add(tf1_1);
		this.add(tf1_2);
		this.add(tf1_3);
		this.add(tf1_4);
		this.add(tf1_5);
		this.add(lb1_1);
		this.add(lb1_2);
		this.add(lb1_3);
		this.add(lb1_4);
		this.add(lb1_5);

		this.add(bt2);
		this.add(tf2_1);
		this.add(tf2_2);
		this.add(tf2_3);
		this.add(tf2_4);
		this.add(lb2_1);
		this.add(lb2_2);
		this.add(lb2_3);
		this.add(lb2_4);

		this.add(bt3);
		this.add(tf3_1);
		this.add(tf3_2);
		this.add(tf3_3);
		this.add(tf3_4);
		this.add(tf3_5);
		this.add(lb3_1);
		this.add(lb3_2);
		this.add(lb3_3);
		this.add(lb3_4);
		this.add(lb3_5);

		this.add(sf);
	}

	public static synchronized void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				MainFrame mainframe = new MainFrame();
				SwingUtilities.invokeLater(null);
				mainframe.setVisible(true);
			}
		});
	}
}