-- Dữ liệu mẫu cho bảng Users
INSERT INTO users (username, password, email, full_name, phone, address, role, is_active, created_at, updated_at)
VALUES ('admin', 'admin123', 'admin@example.com', 'Quản trị viên', '0123456789', 'Hà Nội', 'ADMIN', true, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

INSERT INTO users (username, password, email, full_name, phone, address, role, is_active, created_at, updated_at)
VALUES ('user1', 'user123', 'user1@example.com', 'Người dùng 1', '0987654321', 'Hồ Chí Minh', 'USER', true, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

-- Dữ liệu mẫu cho bảng Categories
INSERT INTO categories (name, description, created_at, updated_at)
VALUES ('Điện thoại', 'Các loại điện thoại thông minh', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

INSERT INTO categories (name, description, created_at, updated_at)
VALUES ('Laptop', 'Các loại máy tính xách tay', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

-- Dữ liệu mẫu cho bảng Products
INSERT INTO products (name, description, import_price, selling_price, stock_quantity, category_id, image_url, is_featured, created_at, updated_at)
VALUES ('iPhone 15', 'Điện thoại Apple mới nhất', 20000000, 25000000, 10, 1, 'https://example.com/iphone15.jpg', true, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

INSERT INTO products (name, description, import_price, selling_price, stock_quantity, category_id, image_url, is_featured, created_at, updated_at)
VALUES ('MacBook Pro 2023', 'Laptop Apple cao cấp', 35000000, 40000000, 5, 2, 'https://example.com/macbookpro2023.jpg', false, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP); 