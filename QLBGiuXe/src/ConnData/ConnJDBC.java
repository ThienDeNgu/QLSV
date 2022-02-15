package ConnData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConnJDBC {
	static String url="jdbc:mysql://localhost:3306/qlkhachhang";
	static String user="root";
	static String password="";
	public static Connection getConnection() {// connection function
		Connection connection=null;
		try {
			connection=DriverManager.getConnection(url,user,password);
		}catch(Exception ex) {
		ex.printStackTrace();
	}
		return connection;
}
	public static List<khachHang>findAll(){
		List<khachHang>khachhangList= new ArrayList<>();
		String query="select*from khachhang";
		try {
			Connection connection =getConnection();
			Statement stmt= connection.createStatement();
			ResultSet rs=stmt.executeQuery(query);
			while(rs.next()) {
				khachHang kh=new khachHang(rs.getInt("id"),rs.getString("hoVaTen"),rs.getString("queQuan"),
						rs.getString("ngaySinh"),rs.getInt("gioiTinh"),rs.getString("loaiXe"),rs.getString("bienSoXe"),
						rs.getFloat("giaTien"),rs.getString("ngayVaoBen"),rs.getString("ngayRaBen"));
				khachhangList.add(kh);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return khachhangList;
	}
	public static void insert(khachHang kh) {
		String query="insert into khachhang(hoVaTen,queQuan,ngaySinh,gioiTinh,loaiXe,bienSoXe,giaTien,ngayVaoBen,ngayRaBen) values(?,?,?,?,?,?,?,?,?)";
		try {
			Connection connection = getConnection();
			PreparedStatement pstmt=connection.prepareStatement(query);
			pstmt.setString(1, kh.getHoVaTen());
			pstmt.setString(2, kh.getQueQuan());
			pstmt.setString(3, kh.getNgaySinh());
			pstmt.setInt(4, kh.getGioiTinh());
			pstmt.setString(5, kh.getLoaiXe());
			pstmt.setString(6, kh.getBienSoXe());
			pstmt.setFloat(7, kh.getGiaTien());
			pstmt.setString(8, kh.getNgayVaoBen());
			pstmt.setString(9, kh.getNgayRaBen());
			pstmt.execute();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static void delete(khachHang kh) {
		String query="delete from khachhang where hoVaTen='"+kh.getHoVaTen()+"'";
		try {
			Connection connection=getConnection();
			PreparedStatement pstmt=connection.prepareStatement(query);
			pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static void Update(khachHang kh) {
		String query="Update khachhang set hoVaTen=?, queQuan=?,ngaySinh=?,gioiTinh=?,loaiXe=?,bienSoXe=?,giaTien=?,ngayVaoBen=?,ngayRaBen=? where hoVaTen='"+kh.getHoVaTen()+"'" ;
		try {
			Connection connection = getConnection();
			PreparedStatement pstmt=connection.prepareStatement(query);
			pstmt.setString(1, kh.getHoVaTen());
			pstmt.setString(2, kh.getQueQuan());
			pstmt.setString(3, kh.getNgaySinh());
			pstmt.setInt(4, kh.getGioiTinh());
			pstmt.setString(5, kh.getLoaiXe());
			pstmt.setString(6, kh.getBienSoXe());
			pstmt.setFloat(7, kh.getGiaTien());
			pstmt.setString(8, kh.getNgayVaoBen());
			pstmt.setString(9, kh.getNgayRaBen());
			pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	public static List<khachHang> findByName(khachHang k) {
		List<khachHang>khachHangl= new ArrayList<>();
		String query = "select*from khachhang where khachhang.hoVaTen='"+k.getHoVaTen()+"'";
		try {
			Connection connection = getConnection();
			Statement stmt= connection.createStatement();
			ResultSet rs=stmt.executeQuery(query);
			while(rs.next()) {
				khachHang kh= new khachHang(
						rs.getInt("id"),
						rs.getString("hoVaTen"),
						rs.getString("queQuan"),
						rs.getString("ngaySinh"),
						rs.getInt("gioiTinh"),
						rs.getString("loaiXe"),
						rs.getString("bienSoXe"),
						rs.getFloat("giaTien"),
						rs.getString("ngayVaoBen"),
						rs.getString("ngayRaBen")
						);
				khachHangl.add(kh);
			}
		} catch (Exception e) {
			
		}
		return khachHangl;
	}
}