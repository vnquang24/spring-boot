# Spring Boot E-commerce API


## Công nghệ sử dụng

- **Spring Boot 3.5.4**
- **Spring Data JPA**
- **PostgreSQL 15**
- **Java 17**
- **Maven**

## Chạy ứng dụng

1. **Đảm bảo PostgreSQL container đang chạy**
2. **Chạy ứng dụng**:
   ```bash
   ./mvnw spring-boot:run
   ```
3. **Ứng dụng sẽ chạy trên**: http://localhost:8081

## API Endpoints

### Users API
- `GET /api/users` - Lấy danh sách tất cả users
- `GET /api/users/{id}` - Lấy thông tin user theo ID
- `POST /api/users` - Tạo user mới
- `PUT /api/users/{id}` - Cập nhật user
- `DELETE /api/users/{id}` - Xóa user

### Categories API
- `GET /api/categories` - Lấy danh sách tất cả categories
- `GET /api/categories/{id}` - Lấy thông tin category theo ID
- `POST /api/categories` - Tạo category mới
- `PUT /api/categories/{id}` - Cập nhật category
- `DELETE /api/categories/{id}` - Xóa category

### Products API
- `GET /api/products` - Lấy danh sách tất cả products
- `GET /api/products/{id}` - Lấy thông tin product theo ID
- `POST /api/products` - Tạo product mới
- `PUT /api/products/{id}` - Cập nhật product
- `DELETE /api/products/{id}` - Xóa product


## Database Schema

Ứng dụng bao gồm các bảng chính:
- **users** - Quản lý người dùng
- **categories** - Danh mục sản phẩm
- **products** - Sản phẩm
- **product_images** - Hình ảnh sản phẩm
- **carts** - Giỏ hàng
- **cart_items** - Chi tiết giỏ hàng
- **orders** - Đơn hàng
- **order_items** - Chi tiết đơn hàng
- **reviews** - Đánh giá sản phẩm
- **ship_info** - Thông tin giao hàng
- **reasons** - Lý do hủy/từ chối
- **product_suggestions** - Đề xuất sản phẩm
- **messages** - Tin nhắn
- **sales_statistics** - Thống kê bán hàng

