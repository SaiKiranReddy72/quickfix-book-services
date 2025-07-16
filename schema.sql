-- Create database
CREATE DATABASE IF NOT EXISTS quickfix_db;

-- Use the database
USE quickfix_db;

-- Create bookings table
CREATE TABLE IF NOT EXISTS bookings (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    phone VARCHAR(15) NOT NULL,
    address VARCHAR(255) NOT NULL,
    service VARCHAR(50) NOT NULL,
    booking_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
