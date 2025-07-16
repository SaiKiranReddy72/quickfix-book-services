public class BookingDAO {
    Connection conn;

    public BookingDAO() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/quickfix", "root", "yourpassword");
    }

    public void saveBooking(int userId, String service, String location, String date, String time) throws Exception {
        String query = "INSERT INTO bookings (user_id, service_type, location, appointment_date, appointment_time) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setInt(1, userId);
        stmt.setString(2, service);
        stmt.setString(3, location);
        stmt.setDate(4, Date.valueOf(date));
        stmt.setTime(5, Time.valueOf(time + ":00"));
        stmt.executeUpdate();
    }
}
