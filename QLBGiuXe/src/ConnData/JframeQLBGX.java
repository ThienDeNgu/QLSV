package ConnData;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Log_In.taiKhoan;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class JframeQLBGX extends JFrame {
	private void btnDangXuatMouseClicked(MouseEvent e) {
	this.setVisible(false);
	taiKhoan tk=new taiKhoan();
	tk.setVisible(true);
	}
	

	private JPanel contentPane;
	private static JTable table;
	private JTextField txtHoVaTen;
	private JTextField txtQueQuan;
	private JTextField txtNgaySinh;
	private JTextField txtLoaiXe;
	private JTextField txtBienSoXe;
	private JTextField txtGiaTien;
	private JTextField txtNgayVaoBen;
	private JTextField txtNgayRaBen;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JframeQLBGX frame = new JframeQLBGX();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JframeQLBGX() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1405, 773);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		panel.setBounds(0, 0, 1391, 134);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("QUẢN LÝ BÃI GIỮ XE");
		lblNewLabel.setForeground(Color.GRAY);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 60));
		lblNewLabel.setBounds(10, 15, 725, 94);
		panel.add(lblNewLabel);
		
		JButton btnDangXuat = new JButton("Đăng xuất");
			btnDangXuat.addMouseListener(new MouseAdapter() {
                
                public void mouseClicked(MouseEvent e) {
                    btnDangXuatMouseClicked(e);
                }
            });
		btnDangXuat.setBackground(Color.LIGHT_GRAY);
		btnDangXuat.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDangXuat.setBounds(1191, 69, 163, 49);
		panel.add(btnDangXuat);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 110, 667, 21);
		panel.add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("Chào mừng đến với phần mềm quản lý");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_1.setBounds(771, 10, 583, 49);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Hiển thị thông tin khách hàng");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(10, 131, 339, 51);
		contentPane.add(lblNewLabel_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 178, 1391, 187);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"ID", "H\u1ECD v\u00E0 t\u00EAn", "Qu\u00EA qu\u00E1n", "Ng\u00E0y sinh", "Gi\u1EDBi t\u00EDnh", "Lo\u1EA1i xe", "Bi\u1EC3n s\u1ED1 xe", "Gi\u00E1 ti\u1EC1n", "Ng\u00E0y v\u00E0o b\u1EBFn", "Ng\u00E0y ra b\u1EBFn"
			}
		));
		showData(ConnJDBC.findAll());
		table.setFont(new Font("Tahoma", Font.PLAIN, 18));
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel_2_1 = new JLabel("Nhập thông tin khách hàng");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2_1.setBounds(10, 363, 339, 51);
		contentPane.add(lblNewLabel_2_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 408, 294, 2);
		contentPane.add(separator_1);
// Họ và tên		
		JLabel lblNewLabel_3 = new JLabel("Họ và tên");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_3.setBounds(10, 424, 95, 37);
		contentPane.add(lblNewLabel_3);
		
		txtHoVaTen = new JTextField();
		txtHoVaTen.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtHoVaTen.setBounds(137, 424, 194, 35);
		contentPane.add(txtHoVaTen);
		txtHoVaTen.setColumns(10);
// Quê quán		
		JLabel lblNewLabel_3_1 = new JLabel("Quê quán");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_3_1.setBounds(10, 487, 95, 37);
		contentPane.add(lblNewLabel_3_1);
		
		txtQueQuan = new JTextField();
		txtQueQuan.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtQueQuan.setColumns(10);
		txtQueQuan.setBounds(137, 488, 194, 35);
		contentPane.add(txtQueQuan);
// Ngày sinh		
		JLabel lblNewLabel_3_1_1 = new JLabel("Ngày sinh");
		lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_3_1_1.setBounds(10, 553, 95, 37);
		contentPane.add(lblNewLabel_3_1_1);
		
		txtNgaySinh = new JTextField();
		txtNgaySinh.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtNgaySinh.setColumns(10);
		txtNgaySinh.setBounds(137, 554, 194, 35);
		contentPane.add(txtNgaySinh);
		
// Giới tính
		JLabel lblNewLabel_3_1_1_6 = new JLabel("Giới tính");
		lblNewLabel_3_1_1_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_3_1_1_6.setBounds(10, 621, 95, 37);
		contentPane.add(lblNewLabel_3_1_1_6);
		
		
		JComboBox cbGioiTinh = new JComboBox();
		cbGioiTinh.setFont(new Font("Tahoma", Font.PLAIN, 18));
		cbGioiTinh.setModel(new DefaultComboBoxModel(new String[] {"Nam", "Nữ"}));
		cbGioiTinh.setBounds(137, 621, 194, 32);
		contentPane.add(cbGioiTinh);
		
// Loại xe
		JLabel lblNewLabel_3_1_1_1 = new JLabel("Loại xe");
		lblNewLabel_3_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_3_1_1_1.setBounds(502, 424, 95, 37);
		contentPane.add(lblNewLabel_3_1_1_1);
		
		txtLoaiXe = new JTextField();
		txtLoaiXe.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtLoaiXe.setColumns(10);
		txtLoaiXe.setBounds(670, 425, 194, 35);
		contentPane.add(txtLoaiXe);
// Biển số xe		
		JLabel lblNewLabel_3_1_1_2 = new JLabel("Biển số xe");
		lblNewLabel_3_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_3_1_1_2.setBounds(502, 487, 112, 37);
		contentPane.add(lblNewLabel_3_1_1_2);
		
		txtBienSoXe = new JTextField();
		txtBienSoXe.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtBienSoXe.setColumns(10);
		txtBienSoXe.setBounds(670, 488, 194, 35);
		contentPane.add(txtBienSoXe);
// Giá tiền		
		JLabel lblNewLabel_3_1_1_3 = new JLabel("Giá tiền");
		lblNewLabel_3_1_1_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_3_1_1_3.setBounds(502, 553, 95, 37);
		contentPane.add(lblNewLabel_3_1_1_3);
		
		txtGiaTien = new JTextField();
		txtGiaTien.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtGiaTien.setColumns(10);
		txtGiaTien.setBounds(670, 554, 194, 35);
		contentPane.add(txtGiaTien);
//Ngày vào bến		
		JLabel lblNewLabel_3_1_1_4 = new JLabel("Ngày vào bến");
		lblNewLabel_3_1_1_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_3_1_1_4.setBounds(502, 621, 126, 37);
		contentPane.add(lblNewLabel_3_1_1_4);
		
		txtNgayVaoBen = new JTextField();
		txtNgayVaoBen.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtNgayVaoBen.setColumns(10);
		txtNgayVaoBen.setBounds(670, 622, 194, 35);
		contentPane.add(txtNgayVaoBen);
//Ngày ra bến		
		JLabel lblNewLabel_3_1_1_5 = new JLabel("Ngày ra bến");
		lblNewLabel_3_1_1_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_3_1_1_5.setBounds(959, 424, 117, 37);
		contentPane.add(lblNewLabel_3_1_1_5);
		
		txtNgayRaBen = new JTextField();
		txtNgayRaBen.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtNgayRaBen.setColumns(10);
		txtNgayRaBen.setBounds(1086, 425, 194, 35);
		contentPane.add(txtNgayRaBen);
		
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 665, 1381, 2);
		contentPane.add(separator_2);
// Chức năng lưu		
		JButton btnLuu = new JButton("Lưu");
		btnLuu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				khachHang kh=new khachHang();
				kh.setHoVaTen(txtHoVaTen.getText());
				kh.setQueQuan(txtQueQuan.getText());
				kh.setNgaySinh(txtNgaySinh.getText());
				kh.setGioiTinh(cbGioiTinh.getSelectedIndex());
				kh.setLoaiXe(txtLoaiXe.getText());
				kh.setBienSoXe(txtBienSoXe.getText());
				kh.setGiaTien(Float.parseFloat(txtGiaTien.getText()));
				kh.setNgayVaoBen(txtNgayVaoBen.getText());
				kh.setNgayRaBen(txtNgayRaBen.getText());
				ConnJDBC.insert(kh);
				JOptionPane.showMessageDialog(null, "Lưu thành công!!! ");
				showData(ConnJDBC.findAll());
			}
		});
		btnLuu.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnLuu.setBackground(Color.LIGHT_GRAY);
		btnLuu.setBounds(62, 683, 148, 43);
		contentPane.add(btnLuu);
// Chức năng xóa		
		JButton btnXoa = new JButton("Xóa");
		btnXoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				khachHang kh=new khachHang();
				kh.setHoVaTen(txtHoVaTen.getText());
				ConnJDBC.delete(kh);
				showData(ConnJDBC.findAll());
			}
		});
		btnXoa.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnXoa.setBackground(Color.LIGHT_GRAY);
		btnXoa.setBounds(296, 683, 148, 43);
		contentPane.add(btnXoa);
// Chức năng cập nhật		
		JButton btnCapNhat = new JButton("Cập nhật");
		btnCapNhat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				khachHang kh=new khachHang();
				kh.setHoVaTen(txtHoVaTen.getText());
				kh.setQueQuan(txtQueQuan.getText());
				kh.setNgaySinh(txtNgaySinh.getText());
				kh.setGioiTinh(cbGioiTinh.getSelectedIndex());
				kh.setLoaiXe(txtLoaiXe.getText());
				kh.setBienSoXe(txtBienSoXe.getText());
				kh.setGiaTien(Float.parseFloat(txtGiaTien.getText()));
				kh.setNgayVaoBen(txtNgayVaoBen.getText());
				kh.setNgayRaBen(txtNgayRaBen.getText());
				ConnJDBC.Update(kh);
				JOptionPane.showMessageDialog(null, "Lưu thành công! ");
				showData(ConnJDBC.findAll());
			}
		});
		btnCapNhat.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnCapNhat.setBackground(Color.LIGHT_GRAY);
		btnCapNhat.setBounds(531, 683, 148, 43);
		contentPane.add(btnCapNhat);
//Chức năng tìm kiếm		
		JButton btnTimKiem = new JButton("Tìm kiếm");
		btnTimKiem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				khachHang kh =new khachHang();
				kh.setHoVaTen(txtHoVaTen.getText());
				showData(ConnJDBC.findByName(kh));
			}
		});
		btnTimKiem.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnTimKiem.setBackground(Color.LIGHT_GRAY);
		btnTimKiem.setBounds(772, 683, 148, 43);
		contentPane.add(btnTimKiem);
//Chức năng làm mới		
		JButton btnLamMoi = new JButton("Làm mới");
		btnLamMoi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					txtHoVaTen.setText("");
					txtQueQuan.setText("");
					txtNgaySinh.setText("");
					txtLoaiXe.setText("");
					txtBienSoXe.setText("");
					txtGiaTien.setText("");
					txtNgayVaoBen.setText("");
					txtNgayRaBen.setText("");
				}
		});
		btnLamMoi.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnLamMoi.setBackground(Color.LIGHT_GRAY);
		btnLamMoi.setBounds(1000, 683, 148, 43);
		contentPane.add(btnLamMoi);
		
		
		scrollPane.setViewportView(table);
	}
// Hiển thị thông tin
	
	public void showData(List<khachHang>khachhangl) {
		List<khachHang>listkhachHang=new ArrayList<>();
		listkhachHang=khachhangl;
		DefaultTableModel tableModel;
	    table.getModel();
	    tableModel=(DefaultTableModel)table.getModel();
	    tableModel.setRowCount(0);
	    listkhachHang.forEach((khachhang) -> { 
	    	String gioiTinh;
	    	if(khachhang.getGioiTinh()==0) gioiTinh="Nam";
	    	else {gioiTinh="Nữ";}
	    	tableModel.addRow(new Object [] {
	    		khachhang.getId(),khachhang.getHoVaTen(),khachhang.getQueQuan(),khachhang.getNgaySinh(),
	    		gioiTinh,khachhang.getLoaiXe(),khachhang.getBienSoXe(),khachhang.getGiaTien(),khachhang.getNgayVaoBen(),khachhang.getNgayRaBen()
	    	});
	    });
	    }
}
