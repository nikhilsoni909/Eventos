package eventos.services.impl;


import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import eventos.constants.IUserConstants;
import eventos.models.Customers;
//import eventos.constants.IUserConstants;
import eventos.services.CustomerDAOInterface;
import eventos.utility.PasswordDecryption;
import eventos.utility.dbutil;
//import com.shashi.utility.MailMessage;



public class CustomerDAOImpl implements CustomerDAOInterface {

	@Override
	public String registerUser(String customerName,String customerMobileNumber,String customerEmail,Date customerDob,String customerPasswordHash,String customerPasswordSalt) {

		Customers customer = new Customers(customerName,customerMobileNumber,customerEmail,customerDob,customerPasswordHash,customerPasswordSalt);

		String status = registerUser(customer);

		return status;
	}

	@Override
	public String registerUser(Customers customer) {

		String status = "Customer Registration Failed!";

		boolean isRegtd = isRegistered(customer.getCustomerEmail());

		if (isRegtd) {
			status = "Email Id Already Registered!";
			return status;
		}
		Connection conn = dbutil.provideConnection();
		PreparedStatement ps = null;
		if (conn != null) {
			System.out.println("Connected Successfully!");
		}

		try {

			ps = conn.prepareStatement("insert into tbl_customers(customer_name, customer_mobile_number, customer_email, customer_dob, customer_password_hash, customer_password_salt) values(?,?,?,?,?,?)");
			
			ps.setString(1, customer.getCustomerName());
			ps.setString(2, customer.getCustomerMobileNumber());
			ps.setString(3, customer.getCustomerEmail());
			ps.setDate(4, customer.getCustomerDob());
			ps.setString(5, customer.getCustomerPasswordHash());
			ps.setString(6, customer.getCustomerPasswordSalt());

			
			int k = ps.executeUpdate();

			if (k > 0) {
				status = "Customer Registered Successfully!";
				System.out.println(status);
//				MailMessage.registrationSuccess(user.getEmail(), user.getName().split(" ")[0]);
			}

		} catch (SQLException e) {
			status = "Error: " + e.getMessage();
			e.printStackTrace();
		}

		dbutil.closeConnection(ps);
		dbutil.closeConnection(ps);

		return status;
	}

	@Override
	public boolean isRegistered(String emailId) {
		boolean flag = false;

		Connection con = dbutil.provideConnection();

		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			ps = con.prepareStatement("select * from tbl_customers where email=?");

			ps.setString(1, emailId);

			rs = ps.executeQuery();

			if (rs.next())
				flag = true;     

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		dbutil.closeConnection(con);
		dbutil.closeConnection(ps);
		dbutil.closeConnection(rs);

		return flag;
	}

	@Override
	public String isValidCredential(String organizer_email, String organizer_password) {
	    String status = "Login Denied! Incorrect Username or Password";
	    boolean valid = false;

	    Connection con = dbutil.provideConnection();
	    PreparedStatement ps = null;
	    ResultSet rs = null;

	    try {
	        ps = con.prepareStatement("SELECT * FROM tbl_organizers WHERE organizer_email=?");
	        ps.setString(1, organizer_email);
	        rs = ps.executeQuery();

	        if(rs.next()) {
	            String passwordHash = rs.getString("organizer_password_hash");
	            String passwordSalt = rs.getString("organizer_password_salt");

	            System.out.println("Password Hash: " + passwordHash);
	            System.out.println("Password Salt: " + passwordSalt);

	            valid = PasswordDecryption.decryption(organizer_password, passwordHash, passwordSalt);

	            if(valid) {
	                status = "valid";
	            }
	        }
	    } catch (SQLException e) {
	        status = "Error: " + e.getMessage();
	        e.printStackTrace();
	    } finally {
	        dbutil.closeConnection(con);
	        dbutil.closeConnection(ps);
	        dbutil.closeConnection(rs);
	    }
	    return status;
	}

	@Override
	public Customers getCustomerDetails(String emailId, String password) {
		 //will complete later
		return null;
	}
//
//	@Override
//	public Customers getUserDetails(String emailId, String password) {
//
//		Customers customer = null;
//
//		Connection con = dbutil.provideConnection();
//
//		PreparedStatement ps = null;
//		ResultSet rs = null;
//
//		try {
//			ps = con.prepareStatement("select * from user where email=? and password=?");
//			ps.setString(1, emailId);
//			ps.setString(2, password);
//			rs = ps.executeQuery();
//
//			if (rs.next()) {
//				customer = new Customers();
//				customer.setName(rs.getString("name"));
//				customer.setMobile(rs.getLong("mobile"));
//				customer.setEmail(rs.getString("email"));
//				customer.setAddress(rs.getString("address"));
//				customer.setPinCode(rs.getInt("pincode"));
//				customer.setPassword(rs.getString("password"));
//
//				return customer;
//			}
//
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}


//		dbutil.closeConnection(con);
//		dbutil.closeConnection(ps);
//		dbutil.closeConnection(rs);
//
//		return customer;
	}

//	@Override
//	public String getFName(String emailId) {
//		String fname = "";
//
//		Connection con = dbutil.provideConnection();
//
//		PreparedStatement ps = null;
//		ResultSet rs = null;
//
//		try {
//			ps = con.prepareStatement("select name from user where email=?");
//			ps.setString(1, emailId);
//
//			rs = ps.executeQuery();
//
//			if (rs.next()) {
//				fname = rs.getString(1);
//
//				fname = fname.split(" ")[0];
//
//			}
//
//		} catch (SQLException e) {
//
//			e.printStackTrace();
//		}
//
//		return fname;
//	}
//
//	@Override
//	public String getUserAddr(String userId) {
//		String userAddr = "";
//
//		Connection con = DBUtil.provideConnection();
//		PreparedStatement ps = null;
//		ResultSet rs = null;
//
//		try {
//			ps = con.prepareStatement("select address from user where email=?");
//
//			ps.setString(1, userId);
//
//			rs = ps.executeQuery();
//
//			if (rs.next())
//				userAddr = rs.getString(1);
//
//		} catch (SQLException e) {
//
//			e.printStackTrace();
//		}
//
//		return userAddr;
//	}

//	@Override
//	public Customers getCustomerDetails(String emailId, String password) {
//		// TODO Auto-generated method stub
//		return null;
//	}

//}
