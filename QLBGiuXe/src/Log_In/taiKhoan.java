package Log_In;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ConnData.JframeQLBGX;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class taiKhoan extends JFrame {
	    public taiKhoan() {
	        initComponents();
	    }

	    private void exit(ActionEvent e) {

	        System.exit(0);
	    }

	    private void btnDangNhapMouseClicked(MouseEvent e) {
	        // TODO add your code here
	        try{
	            if(txtTaiKhoan.equals("") || txtMatKhau.equals("")){
	                JOptionPane.showMessageDialog(this,"Nhập tài khoản và mật khẩu");
	            }
	            else{
	                String query = "Select * from taikhoan where taiKhoan=? and matKhau=?";
	                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlkhachhang", "root", "");
	                PreparedStatement stmt = conn.prepareStatement(query);
	                stmt.setString(1,txtTaiKhoan.getText());
	                stmt.setString(2,txtMatKhau.getText());
	                ResultSet rs = stmt.executeQuery();
	                if (rs.next()) {
	                	JframeQLBGX ql = new JframeQLBGX();
	                    ql.setVisible(true);
	                    this.setVisible(false);
	                    JOptionPane.showMessageDialog(this, "Đăng nhập thành công");
	                }
	                else{
	                    JOptionPane.showMessageDialog(this,"Tài khoản hoặc mật khẩu sai");
	                }
	            }
	        }
	        catch (Exception ex){
	            ex.printStackTrace();
	        }
	    }

	    private void label3MouseClicked(MouseEvent e) {
	        System.exit(0);
	    }

	private JPanel contentPane;
	private JTextField txtTaiKhoan;
	private JPasswordField txtMatKhau;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					taiKhoan frame = new taiKhoan();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @return 
	 */
	public void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 464, 325);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(0, 0, 457, 105);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tài khoản");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel.setBounds(127, 20, 259, 77);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Tài khoản");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(25, 115, 118, 37);
		contentPane.add(lblNewLabel_1);
		
		txtTaiKhoan = new JTextField();
		txtTaiKhoan.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtTaiKhoan.setBounds(165, 115, 187, 39);
		contentPane.add(txtTaiKhoan);
		txtTaiKhoan.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Mật khẩu");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(25, 174, 118, 37);
		contentPane.add(lblNewLabel_1_1);
		
		txtMatKhau = new JPasswordField();
		txtMatKhau.setBounds(165, 177, 187, 39);
		contentPane.add(txtMatKhau);
		
		JButton btnDangNhap = new JButton("Đăng nhập");
		btnDangNhap.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                btnDangNhapMouseClicked(e);
            }
        });
		btnDangNhap.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDangNhap.setBounds(151, 226, 145, 47);
		contentPane.add(btnDangNhap);
	}
}
