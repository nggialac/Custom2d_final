package KTDH;

import static java.lang.Math.abs;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.util.Random;

import javax.swing.JPanel;

public class Surface extends JPanel {
	int a = 10 * 5;
	int b = 103 * 5;
	int c = 15 * 5;
	int d = 100 * 5;
	int e = 22 * 5;
	public int x1;
	public int y;
	public int k;
	public int index;
	// 3D_1
	int x_non;
	int y_non;
	int z_non;
	int r_non;
	int h_non;
	// 3D_2
	int x_cau;
	int y_cau;
	int z_cau;
	int r_cau;
	// 3D_1
	int x_tru;
	int y_tru;
	int z_tru;
	int r_tru;
	int h_tru;

	public static int height = 750;
	public static int width = 750;

	Random generator = new Random();
	int value = generator.nextInt((250 - 40) + 1) + 40;

	// Cac he so
	int f = 14;

	public int tiLeX;
	public int tiLeY;

	Point may = new Point(100, 50);
	Point may_dx = new Point();
	Point vienDan = new Point(-50, -50);
	Point lua1 = new Point(-50, -50);
	Point lua2 = new Point(-50, -50);
	Point nongsung1 = new Point(-50, -50);
	Point nongsung2 = new Point(-50, -50);
	Point nongsung3 = new Point(-50, -50);
	Point nongsung4 = new Point(-50, -50);

	Point vemaybay1 = new Point(1100, value);
	Point vemaybay2 = new Point(700, value);
	Point vemaybay3 = new Point(900, value);

	Point diem1 = new Point(-50, -50);
	Point diem2 = new Point(-50, -50);
	Point diem3 = new Point(-50, -50);
	Point diem4 = new Point(-50, -50);
	Point diem5 = new Point(-50, -50);
	Point diem6 = new Point(-50, -50);
	Point diem7 = new Point(-50, -50);
	Point diem8 = new Point(-50, -50);

	// 3d
	float[] dash1 = { 2f, 0f, 2f };
	BasicStroke bs1 = new BasicStroke(3, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND, 1.0f, dash1, 2f);

	//
	Object3D object1 = new Object3D();
	Transformation tm = new Transformation();

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.setBackground(Color.BLACK);
		this.setBounds(300, 0, height, width);
		Graphics2D g2d = (Graphics2D) g;
		doDrawing(g2d);
	}

	// ham ve thi ve vao day
	public Surface() {
		this.index = -1;
	}

	public void doDrawing(Graphics2D g2d) {
		if (index == 1) {
			Axis(g2d);
			int f = 7 * 5;
			XeTang(g2d);
			// banhrang(g2d, a + 3 * 5, d + 10 * 5, 8 * 5, 2 * 5);
			// ve4banh(g2d, a - f, b + 7 * 5, 2 * 5);
			// ve4banh(g2d, a - f, b + 7 * 5, 1 * 5);
			Banhrang(g2d);
			duongbang(g2d);
			// hangrao(g2d, (45 * 5-375)/5, (375-d + 11 * 5)/5, (47 * 5-375)/5, (375-d + 5 *
			// 5)/5);
			co(g2d);
			veDan(g2d, vienDan);
			veTiaDan(g2d, lua1, lua2);
			veMay(g2d, may);

			MayBay1(g2d, vemaybay1);
			MayBay1(g2d, vemaybay2);

			veTuong(g2d);
		}

		if (index == 2) {
			Axis3D(g2d);
			this.setBackground(Color.WHITE);
			object1.drawCone3D(x_non, y_non, z_non, r_non, h_non, g2d);
		}

		if (index == 3) {
			Axis3D(g2d); //
			this.setBackground(Color.WHITE);
			object1.drawSphere(x_cau, y_cau, z_cau, r_cau, g2d);
		}

		if (index == 4) {
			Axis3D(g2d);
			this.setBackground(Color.WHITE);
			object1.drawHinhTru(x_tru, y_tru, z_tru, r_tru, h_tru, g2d);
		}

	}

	public void Axis(Graphics2D g2d) {
		g2d.setColor(Color.GRAY);
		g2d.setStroke(new BasicStroke(1));
		for (int i = 0; i <= 160; i++) {
			g2d.drawLine(5 * i, 0, 5 * i, 750);
			g2d.drawLine(0, 5 * i, 750, 5 * i);
		}
		g2d.setStroke(new BasicStroke(1));
		g2d.setColor(Color.WHITE);
		g2d.drawLine(375, 0, 375, 750);
		g2d.drawLine(0, 375, 750, 375);
	}

//	public void veBanhXeTang() {
//		Object3D ob3 = new Object3D();
//		ob3.eclipMidpoint(xc, yc, a, b, g2d, net);
//	}

	public void veDan(Graphics2D g2d, Point i) {
		g2d.setColor(Color.RED);
		// g2d.fillOval(i.x, i.y, tiLeX, tiLeY);
		Object3D ob3 = new Object3D();
		ob3.eclipMidpointRed((i.x - 375 + 20) / 5, (375 - i.y - 10) / 5, tiLeX, tiLeY, g2d, 1);
//		DrawElipDo(g2d, i.x + 30, i.y - 10, tiLeX, tiLeY);
	}

	public void veMay(Graphics2D g2d, Point i) {
		Object3D ob3 = new Object3D();
		// g2d.fillOval(i.x, i.y, 90, 65);
		ob3.eclipMidpointSky((i.x - 375) / 5, (375 - i.y) / 5, 80 / 8, 45 / 8, g2d, 1);
		may_dx = tm.doixung(i, new Point(i.x + 170, i.y + 50));
		ob3.eclipMidpointSky((may_dx.x - 375) / 5, (375 - may_dx.y) / 5, 80 / 8, 45 / 8, g2d, 1);
		// g2d.fillOval(may_dx.x, may_dx.y, 90, 65);
		Point temp = tm.translation(i.x, i.y, -50, 22);
		ob3.eclipMidpointSky((temp.x - 375) / 5, (375 - temp.y) / 5, 40 / 8, 25 / 8, g2d, 1);
		// g2d.fillOval(temp.x, temp.y, 50, 45);
		temp = tm.doixung(temp, new Point(temp.x + 170, temp.y + 50));
		ob3.eclipMidpointSky((temp.x - 375) / 5, (375 - temp.y) / 5, 40 / 8, 25 / 8, g2d, 1);
		// g2d.fillOval(temp.x, temp.y, 50, 45);
		Point temp2 = tm.translation(i.x, i.y, 50, 22);
		ob3.eclipMidpointSky((temp2.x - 375) / 5, (375 - temp2.y) / 5, 40 / 8, 25 / 8, g2d, 1);
		// g2d.fillOval(temp2.x, temp2.y, 50, 45);
		temp2 = tm.doixung(temp2, new Point(temp2.x + 170, temp2.y + 50));
		ob3.eclipMidpointSky((temp2.x - 375) / 5, (375 - temp2.y) / 5, 40 / 8, 25 / 8, g2d, 1);
		// g2d.fillOval(temp2.x, temp2.y, 50, 45);

	}

	//////////////////// 3DDDDD
	public void Axis3D(Graphics2D g2d) {
		g2d.setStroke(new BasicStroke(3));
		g2d.setColor(Color.BLACK);
		// ox
		g2d.drawLine(width / 2, height / 2, width, height / 2);
		g2d.drawString("Ox", width - 20, height / 2 - 25);
		g2d.drawLine(width, height / 2, width - 10, height / 2 - 5);
		g2d.drawLine(width, height / 2, width - 10, height / 2 + 5);
		// oy
		g2d.drawLine(width / 2, height / 2, width / 2, 0);
		g2d.drawString("Oy", width / 2 - 25, 15);
		g2d.drawLine(width / 2, 0, width / 2 - 5, 0 + 10);
		g2d.drawLine(width / 2, 0, width / 2 + 5, 0 + 10);
		// oz
		g2d.drawLine(width / 2, height / 2, 0, height);
		g2d.drawString("Oz", 5, height - 25);
		g2d.drawLine(2, height, 2, height - 10);
		g2d.drawLine(2, height, 2 + 10, height);
		g2d.setColor(Color.GRAY);
		g2d.setStroke(new BasicStroke(1));
		for (int i = 1; i <= 150; i++) {
			g2d.drawLine(width / 2 + i * 5, height / 2, 0 + i * 5, height);
		}
		for (int i = 1; i <= 75; i++) {
			g2d.drawLine(width / 2 - i * 5, height / 2 + i * 5, width, height / 2 + i * 5); // doi=ke*tan 300/290
			// System.out.println(300-(i*5.0*(float)30/29));
		}
	}

	public void veTuong(Graphics2D g2d) {
		g2d.setColor(Color.WHITE);
		duongthang(g2d, (diem1.x - 375) / 5, (375 - diem1.y - 10) / 5, (diem2.x - 375) / 5, (375 - diem2.y - 10) / 5);
		duongthang(g2d, (diem3.x - 375) / 5, (375 - diem3.y - 10) / 5, (diem4.x - 375) / 5, (375 - diem4.y - 10) / 5);
		duongthang(g2d, (diem5.x - 375) / 5, (375 - diem5.y - 10) / 5, (diem6.x - 375) / 5, (375 - diem6.y - 10) / 5);
		duongthang(g2d, (diem7.x - 375) / 5, (375 - diem7.y - 10) / 5, (diem8.x - 375) / 5, (375 - diem8.y - 10) / 5);
	}

	public void XeTang(Graphics2D g2d) {
		// ve than xe tang
		int x = 2 * 5;

		g2d.setColor(Color.blue);
		// than tren
		duongthangCyan((Graphics2D) g2d, (a - 375) / 5, (375 - b) / 5, (c - 375) / 5, (375 - b) / 5);
		duongthangCyan((Graphics2D) g2d, (a - 375) / 5, (375 - b) / 5, (a - 375) / 5, (375 - d + 20) / 5);
		duongthangCyan((Graphics2D) g2d, (c - 375) / 5, (375 - d + 20) / 5, (a - 375) / 5, (375 - d + 20) / 5);// ngang
																												// tren
		duongthangCyan((Graphics2D) g2d, (c - 375 + 20) / 5, (375 - d) / 5, (c - 375 + 30) / 5, (375 - b) / 5);
		duongthangCyan((Graphics2D) g2d, (a - 375 - 35) / 5, (375 - b) / 5, (c - 375 + 35) / 5, (375 - b) / 5);// ngang
		// than duoi

		duongthangCyan((Graphics2D) g2d, (a - 375 - 50) / 5, (375 - b - 25) / 5, (c - 375 + 50) / 5,
				(375 - 25 - b) / 5);
		duongthangCyan((Graphics2D) g2d, (a - 375 - 50) / 5, (375 - b - 25) / 5, (a - 375 - 35) / 5, (375 - b) / 5);// xien
		duongthangCyan((Graphics2D) g2d, (a - 375 - 50) / 5, (375 - b - 25) / 5, (a - 375 - 35) / 5,
				(375 - b - 50) / 5);// xien

		duongthangCyan((Graphics2D) g2d, (c - 375 + 50) / 5, (375 - b - 25) / 5, (c - 375 + 35) / 5, (375 - b) / 5);// xien
		duongthangCyan((Graphics2D) g2d, (c - 375 + 50) / 5, (375 - b - 25) / 5, (c - 375 + 35) / 5,
				(375 - b - 50) / 5);// xien

		duongthangCyan((Graphics2D) g2d, (a - 375 - 35) / 5, (375 - b - 50) / 5, (c - 375 + 35) / 5,
				(375 - 50 - b) / 5);

		duongthangCyan((Graphics2D) g2d, (a - 375 - 35) / 5, (375 - b) / 5, (a - 375 - 35) / 5, (375 - 50 - b) / 5);// doc
		duongthangCyan((Graphics2D) g2d, (c - 375 + 35) / 5, (375 - b) / 5, (c - 375 + 35) / 5, (375 - 50 - b) / 5);// doc
		// duongthangCyan((Graphics2D) g2d,(a-375)/5, (375-d)/5, (a-x-375)/5,
		// (375-b)/5);
		// duongthangCyan((Graphics2D) g2d, (a-375)/5, (375-b)/5, (c+x-375)/5,
		// (375-b)/5);
//		duongthangCyan((Graphics2D) g2d, c, d, c + x, b);
//		duongthangCyan((Graphics2D) g2d, a, b, c, d);
//		duongthangCyan((Graphics2D) g2d, a, d, c, b);
//
//		duongthangCyan((Graphics2D) g2d, a - 5 * 5, b, c + 6 * 5, b);
//		duongthangCyan((Graphics2D) g2d, a - 5 * 5, b, a - 5 * 5, b + 5 * 5);
//		duongthangCyan((Graphics2D) g2d, c + 6 * 5, b, c + 6 * 5, b + 5 * 5);
//		duongthangCyan((Graphics2D) g2d, a - 10 * 5, b + 5 * 5, c + 10 * 5, b + 5 * 5);
//		duongthangCyan((Graphics2D) g2d, a - 5 * 5, b, a - 10 * 5, b + 5 * 5);
//		duongthangCyan((Graphics2D) g2d, c + 6 * 5, b, c + 10 * 5, b + 5 * 5);
//		duongthangCyan((Graphics2D) g2d, a - 5 * 5, b + 5 * 5, a - 5 * 5, b + 9 * 5);
//		duongthangCyan((Graphics2D) g2d, a - 10 * 5, b + 5 * 5, a - 5 * 5, b + 9 * 5);
//		duongthangCyan((Graphics2D) g2d, c + 6 * 5, b + 9 * 5, c + 10 * 5, b + 5 * 5);
//		duongthangCyan((Graphics2D) g2d, c + 6 * 5, b + 5 * 5, c + 6 * 5, b + 9 * 5);
//		duongthangCyan((Graphics2D) g2d, a - 5 * 5, b + 9 * 5, c + 6 * 5, b + 9 * 5);

		// ve nong sung cua tank

//		g2d.drawLine(nongsung1.x, nongsung1.y, nongsung3.x, nongsung3.y);
//		g2d.drawLine(nongsung2.x, nongsung2.y, nongsung4.x, nongsung4.y);
//		g2d.drawLine(nongsung3.x, nongsung3.y, nongsung4.x, nongsung4.y);
		duongthangCyan(g2d, (nongsung1.x - 375) / 5, (375 - nongsung1.y) / 5, (nongsung3.x - 375) / 5,
				(375 - nongsung3.y) / 5);
		duongthangCyan(g2d, (nongsung2.x - 375) / 5, (375 - nongsung2.y) / 5, (nongsung4.x - 375) / 5,
				(375 - nongsung4.y) / 5);
		duongthangCyan(g2d, (nongsung3.x - 375) / 5, (375 - nongsung3.y) / 5, (nongsung4.x - 375) / 5,
				(375 - nongsung4.y) / 5);
	}

	public void veTiaDan(Graphics2D g2d, Point a, Point b) {
		g2d.setStroke(new BasicStroke(5));
		g2d.setColor(Color.YELLOW);
		duongthangYellow(g2d, (a.x - 375) / 5, (375 - a.y) / 5, (b.x - 375) / 5, (375 - b.y) / 5);
		tm.gocquay = -20;
		Point temp1 = tm.Quay(a, b);
		duongthangYellow(g2d, (temp1.x - 375) / 5, (375 - temp1.y) / 5, (b.x - 375) / 5, (375 - b.y) / 5);
		Point temp2 = tm.doixung(a, temp1);
		// g2d.drawLine(temp1.x, temp1.y, temp1.x-2, temp1.y-2);
		tm.gocquay = 70;
		Point temp3 = tm.Quay(b, temp1);
		duongthangYellow(g2d, (temp3.x - 375) / 5, (375 - temp3.y) / 5, (temp2.x - 375) / 5, (375 - temp2.y) / 5);
		duongthangYellow(g2d, (temp1.x - 375) / 5, (375 - temp1.y) / 5, (temp3.x - 375) / 5, (375 - temp3.y) / 5);
	}

	public void tomau(Graphics2D g2d, int x0, int y0, int x1, int y1) {
		// to mau
		int dy = Math.abs(y1 - y0);
		int dx = Math.abs(x1 - x0);
		int x, y;
		if (x0 >= x1)
			x = x1;
		else
			x = x0;
		if (y0 >= y1)
			y = y1;
		else
			y = y0;
		g2d.fillRect(x, y, dx, dy);
	}

	void put8pixel(Graphics2D g2d, int xc, int yc, int x, int y) {
		g2d.setColor(Color.WHITE);
		g2d.fillOval(x + xc, y + yc, 3, 3);
		g2d.fillOval(-x + xc, y + yc, 3, 3);
		g2d.fillOval(x + xc, -y + yc, 3, 3);
		g2d.fillOval(-x + xc, -y + yc, 3, 3);
		g2d.fillOval(y + xc, x + yc, 3, 3);
		g2d.fillOval(-y + xc, x + yc, 3, 3);
		g2d.fillOval(y + xc, -x + yc, 3, 3);
		g2d.fillOval(-y + xc, -x + yc, 3, 3);
	}

	void banhxe(Graphics2D g2d, int xc, int yc, int r) {
		int x = 0;
		int y = r;
		int f = 1 - r;
		put8pixel(g2d, xc, yc, x, y);
		while (x < y) {
			if (f < 0)
				f += (x << 1) + 3;
			else {
				y--;
				f += ((x - y) << 1) + 5;
			}
			x++;
			put8pixel(g2d, xc, yc, x, y);
		}
	}

	void ve4banh(Graphics2D g2d, int xc, int yc, int r) {
		int kc = 0;
		for (int i = 0; i < 4; i++) {
			kc += 4 * 5;
			banhxe(g2d, (xc + kc), yc, r);
		}
	}

	public void Banhrang(Graphics2D g2d) {
		Object3D ob3 = new Object3D();
		Point i = new Point(58, 550);
		ob3.eclipMidpointWhite((i.x - 375) / 5, (375 - i.y) / 5, 13, 2, g2d, 1);
		ob3.eclipMidpointWhite((i.x - 375 - 25) / 5, (375 - i.y) / 5, 3, 2, g2d, 1);
		ob3.eclipMidpointWhite((i.x - 375 + 5) / 5, (375 - i.y) / 5, 3, 2, g2d, 1);
		ob3.eclipMidpointWhite((i.x - 375 + 35) / 5, (375 - i.y) / 5, 3, 2, g2d, 1);
	}

	public void Banhrang(Graphics2D g2d, int x_center, int y_center, int a, int b) {
		float p, a2, b2;
		int x, y;
		int check1 = 1;
		int check2 = 1;
		a2 = a * a;
		b2 = b * b;
		x = 0;
		y = b;
		p = 2 * ((float) b2 / a2) - (2 * b) + 1;

		// Ve net dut
		// ve nhanh thu 1(tren trai)
		while (((float) b2 / a2) * x <= y) {
			if (check1 % 2 != 0) {
				for (int i = 0; i < 5; i++) {
					putnetdut(g2d, x_center, y_center, x, y);
					if (p < 0) {
						p = p + 2 * ((float) b2 / a2) * (2 * x + 3);
					} else {
						p = p - 4 * y + 2 * ((float) b2 / a2) * (2 * x + 3);
						y--;
					}
					x++;
				}
			} else {
				for (int i = 0; i < 5; i++) {
					if (p < 0) {
						p = p + 2 * ((float) b2 / a2) * (2 * x + 3);
					} else {
						p = p - 4 * y + 2 * ((float) b2 / a2) * (2 * x + 3);
						y--;
					}
					x++;
				}
			}
			check1++;
		}

		// ve nhanh thu 2(phia tren ben phai)
		y = 0;
		x = a;
		p = 2 * ((float) a2 / b2) - 2 * a + 1;
		while (((float) a2 / b2) * y <= x) {
			if (check2 % 2 != 0) {
				for (int i = 0; i < 5; i++) {
					putnetdut(g2d, x_center, y_center, x, y);
					if (p < 0) {
						p = p + 2 * ((float) a2 / b2) * (2 * y + 3);
					} else {
						p = p - 4 * x + 2 * ((float) a2 / b2) * (2 * y + 3);
						x--;
					}
					y++;
				}
			} else {
				for (int i = 0; i < 5; i++) {
					if (p < 0) {
						p = p + 2 * ((float) a2 / b2) * (2 * y + 3);
					} else {
						p = p - 4 * x + 2 * ((float) a2 / b2) * (2 * y + 3);
						x--;
					}
					y++;
				}
			}
			check2++;
		}

		// ve net lien
		x = 0;
		y = b;
		p = 2 * ((float) b2 / a2) - (2 * b) + 1;
		// ve nhanh thu 3(phia duoi ben phai)
		while (((float) b2 / a2) * x <= y) {
			putnetdut(g2d, x_center, y_center, x, y);
			if (p < 0) {
				p = p + 2 * ((float) b2 / a2) * (2 * x + 3);
			} else {
				p = p - 4 * y + 2 * ((float) b2 / a2) * (2 * x + 3);
				y--;
			}
			x++;
		}

		// ve nhanh thu 4(phia duoi ben trai)
		y = 0;
		x = a;
		p = 2 * ((float) a2 / b2) - 2 * a + 1;
		while (((float) a2 / b2) * y <= x) {
			putnetdut(g2d, x_center, y_center, x, y);
			if (p < 0) {
				p = p + 2 * ((float) a2 / b2) * (2 * y + 3);
			} else {
				p = p - 4 * x + 2 * ((float) a2 / b2) * (2 * y + 3);
				x--;
			}
			y++;
		}
	}

	void putnetdut(Graphics g2d, int xc, int yc, int x, int y) {
		g2d.setColor(Color.GRAY);
		g2d.fillOval(xc - x, yc - y, 3, 3);// trên trái
		g2d.fillOval(xc + x, yc - y, 3, 3);// trên phải
		g2d.fillOval(xc + x, yc + y, 3, 3);
		g2d.fillOval(xc - x, yc + y, 3, 3);
	}

	void putnetdutDo(Graphics g2d, int xc, int yc, int x, int y) {
		g2d.setColor(Color.RED);
		g2d.fillOval(xc - x, yc - y, 50, 50);// trên trái
		g2d.fillOval(xc + x, yc - y, 50, 50);// trên phải
		g2d.fillOval(xc + x, yc + y, 50, 50);
		g2d.fillOval(xc - x, yc + y, 50, 50);
	}

	void putnetlien(Graphics g2d, int xc, int yc, int x, int y) {
		g2d.setColor(Color.red);
		g2d.fillOval(xc + x, yc + y, 5, 5); // dưới phải
		g2d.fillOval(xc - x, yc + y, 5, 5); // dưới trái

	}

	public void duongthang(Graphics2D g2d, int a, int b, int c, int d) {
		int temp;
		if (abs(c - a) > abs(d - b)) {
			if (a > c) {
				temp = a;
				a = c;
				c = temp;
				temp = b;
				b = d;
				d = temp;
			}
			int x = a;
			float y = b;
			float m = (float) (d - b) / (float) (c - a);
//			int count = 0;
			while (x <= c) {
				y = y + m;
				g2d.setColor(Color.WHITE);
				g2d.setStroke(new BasicStroke(5));
				g2d.drawLine(375 + x * 5, 375 - Math.round(y) * 5, 375 + x * 5, 375 - Math.round(y) * 5);
				x++;
//				count++;
			}
		}
		if (a == c && b == d) {
			g2d.setColor(Color.WHITE);
			g2d.setStroke(new BasicStroke(5));
			g2d.drawLine(5 * a + 375, 375 - b * 5, 5 * a + 375, 375 - b * 5);
		} else {
			if (b > d) {
				temp = a;
				a = c;
				c = temp;
				temp = b;
				b = d;
				d = temp;
			}
			float x = a;
			int y = b;
			float m = (float) (c - a) / (float) (d - b);

			while (y < d) {
				x = x + m;
				g2d.setColor(Color.WHITE);
				g2d.setStroke(new BasicStroke(5));
				g2d.drawLine(375 + Math.round(x) * 5, 375 - y * 5, 375 + Math.round(x) * 5, 375 - y * 5);
				y++;
			}
		}
	}

	public void duongthangCyan(Graphics2D g2d, int a, int b, int c, int d) {
		int temp;
		if (abs(c - a) > abs(d - b)) {
			if (a > c) {
				temp = a;
				a = c;
				c = temp;
				temp = b;
				b = d;
				d = temp;
			}
			int x = a;
			float y = b;
			float m = (float) (d - b) / (float) (c - a);
//			int count = 0;
			while (x <= c) {
				y = y + m;
				g2d.setColor(Color.CYAN);
				g2d.setStroke(new BasicStroke(5));
				g2d.drawLine(375 + x * 5, 375 - Math.round(y) * 5, 375 + x * 5, 375 - Math.round(y) * 5);
				x++;
//				count++;
			}
		}
		if (a == c && b == d) {
			g2d.setColor(Color.CYAN);
			g2d.setStroke(new BasicStroke(5));
			g2d.drawLine(5 * a + 375, 375 - b * 5, 5 * a + 375, 375 - b * 5);
		} else {
			if (b > d) {
				temp = a;
				a = c;
				c = temp;
				temp = b;
				b = d;
				d = temp;
			}
			float x = a;
			int y = b;
			float m = (float) (c - a) / (float) (d - b);
			while (y < d) {
				x = x + m;
				g2d.setColor(Color.CYAN);
				g2d.setStroke(new BasicStroke(5));
				g2d.drawLine(375 + Math.round(x) * 5, 375 - y * 5, 375 + Math.round(x) * 5, 375 - y * 5);
				y++;
			}
		}
	}

	public void duongthangYellow(Graphics2D g2d, int a, int b, int c, int d) {
		int temp;
		if (abs(c - a) > abs(d - b)) {
			if (a > c) {
				temp = a;
				a = c;
				c = temp;
				temp = b;
				b = d;
				d = temp;
			}
			int x = a;
			float y = b;
			float m = (float) (d - b) / (float) (c - a);
//			int count = 0;
			while (x <= c) {
				y = y + m;
				g2d.setColor(Color.YELLOW);
				g2d.setStroke(new BasicStroke(5));
				g2d.drawLine(375 + x * 5, 375 - Math.round(y) * 5, 375 + x * 5, 375 - Math.round(y) * 5);
				x++;
//				count++;
			}
		}
		if (a == c && b == d) {
			g2d.setColor(Color.YELLOW);
			g2d.setStroke(new BasicStroke(5));
			g2d.drawLine(5 * a + 375, 375 - b * 5, 5 * a + 375, 375 - b * 5);
		} else {
			if (b > d) {
				temp = a;
				a = c;
				c = temp;
				temp = b;
				b = d;
				d = temp;
			}
			float x = a;
			int y = b;
			float m = (float) (c - a) / (float) (d - b);

			while (y <= d) {
				x = x + m;
				g2d.setColor(Color.YELLOW);
				g2d.setStroke(new BasicStroke(5));
				g2d.drawLine(375 + Math.round(x) * 5, 375 - y * 5, 375 + Math.round(x) * 5, 375 - y * 5);
				y++;
			}
		}
	}

	public void duongthangOrange(Graphics2D g2d, int x1, int y1, int x2, int y2) {
		int temp;
		if (abs(c - a) > abs(d - b)) {
			if (a > c) {
				temp = a;
				a = c;
				c = temp;
				temp = b;
				b = d;
				d = temp;
			}
			int x = a;
			float y = b;
			float m = (float) (d - b) / (float) (c - a);
//			int count = 0;
			while (x <= c) {
				y = y + m;
				g2d.setColor(Color.ORANGE);
				g2d.setStroke(new BasicStroke(5));
				g2d.drawLine(375 + x * 5, 375 - Math.round(y) * 5, 375 + x * 5, 375 - Math.round(y) * 5);
				x++;
//				count++;
			}
		}
		if (a == c && b == d) {
			g2d.setColor(Color.ORANGE);
			g2d.setStroke(new BasicStroke(5));
			g2d.drawLine(5 * a + 375, 375 - b * 5, 5 * a + 375, 375 - b * 5);
		} else {
			if (b > d) {
				temp = a;
				a = c;
				c = temp;
				temp = b;
				b = d;
				d = temp;
			}
			float x = a;
			int y = b;
			float m = (float) (c - a) / (float) (d - b);

			while (y <= d) {
				x = x + m;
				g2d.setColor(Color.ORANGE);
				g2d.setStroke(new BasicStroke(5));
				g2d.drawLine(375 + Math.round(x) * 5, 375 - y * 5, 375 + Math.round(x) * 5, 375 - y * 5);
				y++;
			}
		}
	}

	public void MayBay1(Graphics2D g2d, Point i) {

		x1 = i.x;
		y = i.y;
		// Than
		g2d.setColor(Color.RED);
//		DrawElip(g2d, x1, y, 14*5, 3*5);
		// g2d.fillOval(x1-70, y-13, 14*5*2, 3*5*2);
		Object3D ob3 = new Object3D();

		ob3.eclipMidpoint((x1 - 375) / 5, (375 - y) / 5, 14, 3, g2d, 1);

		// Canh tren
		duongthang(g2d, (x1 - 3 * 5 - 375) / 5, (375 - y - 3 * 5) / 5, (x1 - 375) / 5, (375 - y - 9 * 5) / 5);
		// duongthang(g2d, (x1 - 375) / 5, (375 - y - 9 * 5) / 5, (x1 - 3 * 5 - 375) /
		// 5, (375 - y - 10 * 5) / 5);
		duongthang(g2d, (x1 + 3 * 5 - 375) / 5, (375 - y - 10 * 5) / 5, (x1 + 5 - 375) / 5, (375 - y - 3 * 5) / 5);
		// Canh duoi
		duongthang(g2d, (x1 - 3 * 5 - 375) / 5, (375 - y + 5) / 5, (x1 - 375) / 5, (375 - y + 8 * 5) / 5);
		duongthang(g2d, (x1 - 375) / 5, (375 - y + 8 * 5) / 5, (x1 + 3 * 5 - 375) / 5, (375 - y + 9 * 5) / 5);
		duongthang(g2d, (x1 + 3 * 5 - 375) / 5, (375 - y + 9 * 5) / 5, (x1 + +5 - 375) / 5, (375 - y + 5) / 5);
		// Duoi
//		duongthang(g2d, (x1 + 9 * 5 - 375) / 5, (375 - y) / 5, (x1 + 13 * 5 - 375) / 5, (375 - y - 5 * 5) / 5);
//		duongthang(g2d, (x1 + 13 * 5 - 375) / 5, (375 - y - 5 * 5) / 5, (x1 + 17 * 5 - 375) / 5, (375 - y - 5 * 5) / 5);
//		duongthang(g2d, (x1 + 17 * 5 - 375) / 5, (375 - y - 5 * 5) / 5, (x1 + 14 * 5 - 375) / 5, (375 - y) / 5);
		//
		duongthang(g2d, (x1 + 7 * 5 - 375) / 5, (375 - y) / 5, (x1 + 11 * 5 - 375) / 5, (375 - y + 5 * 5) / 5);
		duongthang(g2d, (x1 + 11 * 5 - 375) / 5, (375 - y + 5 * 5) / 5, (x1 + 15 * 5 - 375) / 5, (375 - y + 5 * 5) / 5);
		duongthang(g2d, (x1 + 15 * 5 - 375) / 5, (375 - y + 5 * 5) / 5, (x1 + 12 * 5 - 375) / 5, (375 - y) / 5);

	}

	public void duongbang(Graphics2D g2d) {
//		 duongthang((Graphics2D) g2d, (22 * 5-375)/5, d + (375-11 * 5)/5, (200 *
//		 5-375)/5, (375-d+11 * 5)/5);
//		 duongthang((Graphics2D) g2d, (0-375)/5, d + (375-25 * 5)/5, (200 * 5-375)/5,
//		 (375-d+25 * 5)/5);
		duongthang((Graphics2D) g2d, (0 - 375) / 5, (375 - 568) / 5, (200 * 5 - 375) / 5, (375 - 568) / 5);
		duongthang((Graphics2D) g2d, (0 - 375) / 5, (375 - 629) / 5, (200 * 5 - 375) / 5, (375 - 629) / 5);
		tomau(g2d, (6 * 5), d + 17 * 5, 15 * 5, d + 18 * 5);
		int a1 = 6;
		int b1 = 15;
		for (int i = 0; i < 10; i++) {
			a1 = a1 + f;
			b1 = b1 + f;

			g2d.setColor(Color.white);
			tomau(g2d, a1 * 5, d + 17 * 5, b1 * 5, d + 18 * 5);

		}
	}

	public void DrawElip(Graphics2D g2d, int x_center, int y_center, int a, int b) {
		float p, a2, b2;
		int x, y;
		int check1 = 1;

		a2 = a * a;
		b2 = b * b;
		x = 0;
		y = b;
		p = 2 * ((float) b2 / a2) - (2 * b) + 1;

		// Ve net dut
		// ve nhanh thu 1(tren trai)
		while (((float) b2 / a2) * x <= y) {
			if (check1 % 2 != 0) {
				for (int i = 0; i < 15; i++) {
					putnetdut(g2d, x_center, y_center, x, y);
					if (p < 0) {
						p = p + 2 * ((float) b2 / a2) * (2 * x + 3);
					} else {
						p = p - 4 * y + 2 * ((float) b2 / a2) * (2 * x + 3);
						y--;
					}
					x++;
				}
			} else {
				for (int i = 0; i < 15; i++) {
					if (p < 0) {
						p = p + 2 * ((float) b2 / a2) * (2 * x + 3);
					} else {
						p = p - 4 * y + 2 * ((float) b2 / a2) * (2 * x + 3);
						y--;
					}
					x++;
				}
			}
			check1++;
		}
		// ve net lien
		x = 0;
		y = b;
		p = 2 * ((float) b2 / a2) - (2 * b) + 1;
		// ve nhanh thu 3(phia duoi ben phai)
		while (((float) b2 / a2) * x <= y) {
			putnetdut(g2d, x_center, y_center, x, y);
			if (p < 0) {
				p = p + 2 * ((float) b2 / a2) * (2 * x + 3);
			} else {
				p = p - 4 * y + 2 * ((float) b2 / a2) * (2 * x + 3);
				y--;
			}
			x++;
		}

		// ve nhanh thu 4(phia duoi ben trai)
		y = 0;
		x = a;
		p = 2 * ((float) a2 / b2) - 2 * a + 1;
		while (((float) a2 / b2) * y <= x) {
			putnetdut(g2d, x_center, y_center, x, y);
			if (p < 0) {
				p = p + 2 * ((float) a2 / b2) * (2 * y + 3);
			} else {
				p = p - 4 * x + 2 * ((float) a2 / b2) * (2 * y + 3);
				x--;
			}
			y++;
		}
	}

	public void DrawElipDo(Graphics2D g2d, int x_center, int y_center, int a, int b) {
		float p, a2, b2;
		int x, y;
		int check1 = 1;

		a2 = a * a;
		b2 = b * b;
		x = 0;
		y = b;
		p = 2 * ((float) b2 / a2) - (2 * b) + 1;

		// Ve net dut
		// ve nhanh thu 1(tren trai)
		while (((float) b2 / a2) * x <= y) {
			if (check1 % 2 != 0) {
				for (int i = 0; i < 15; i++) {
					putnetdutDo(g2d, x_center, y_center, x, y);
					if (p < 0) {
						p = p + 2 * ((float) b2 / a2) * (2 * x + 3);
					} else {
						p = p - 4 * y + 2 * ((float) b2 / a2) * (2 * x + 3);
						y--;
					}
					x++;
				}
			} else {
				for (int i = 0; i < 15; i++) {
					if (p < 0) {
						p = p + 2 * ((float) b2 / a2) * (2 * x + 3);
					} else {
						p = p - 4 * y + 2 * ((float) b2 / a2) * (2 * x + 3);
						y--;
					}
					x++;
				}
			}
			check1++;
		}
		// ve net lien
		x = 0;
		y = b;
		p = 2 * ((float) b2 / a2) - (2 * b) + 1;
		// ve nhanh thu 3(phia duoi ben phai)
		while (((float) b2 / a2) * x <= y) {
			putnetdutDo(g2d, x_center, y_center, x, y);
			if (p < 0) {
				p = p + 2 * ((float) b2 / a2) * (2 * x + 3);
			} else {
				p = p - 4 * y + 2 * ((float) b2 / a2) * (2 * x + 3);
				y--;
			}
			x++;
		}

		// ve nhanh thu 4(phia duoi ben trai)
		y = 0;
		x = a;
		p = 2 * ((float) a2 / b2) - 2 * a + 1;
		while (((float) a2 / b2) * y <= x) {
			putnetdutDo(g2d, x_center, y_center, x, y);
			if (p < 0) {
				p = p + 2 * ((float) a2 / b2) * (2 * y + 3);
			} else {
				p = p - 4 * x + 2 * ((float) a2 / b2) * (2 * y + 3);
				x--;
			}
			y++;
		}
	}

	public void co(Graphics2D g2d) {
		g2d.setColor(Color.green);
		tomau(g2d, 0, d + 26 * 5, 200 * 5, d + 50 * 5);
	}

	public void hangrao(Graphics2D g2d, int x0, int y0, int x1, int y1) {
		duongthangOrange((Graphics2D) g2d, x0, y0, x1, y1);
		duongthangOrange((Graphics2D) g2d, x1, y0, x0, y1);
		int kc = 2 * 5;
		int a = x0;
		int b = x1;
		int c = x0 + 30 * 5;
		int d = x1 + 30 * 5;
		for (int i = 0; i < 10; i++) {
			a = a + kc;
			b = b + kc;
			duongthangOrange((Graphics2D) g2d, a, y0, b, y1);
			duongthangOrange((Graphics2D) g2d, b, y0, a, y1);
		}

		for (int i = 0; i < 10; i++) {
			c = c + kc;
			d = d + kc;
			duongthangOrange((Graphics2D) g2d, c, y0, d, y1);
			duongthangOrange((Graphics2D) g2d, d, y0, c, y1);
		}
	}
}
