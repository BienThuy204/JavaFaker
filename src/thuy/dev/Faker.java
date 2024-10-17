package thuy.dev;

import thuy.dev.data.dao.CategoryDao;
import thuy.dev.data.dao.Database;
import thuy.dev.data.model.Category;
import thuy.dev.data.impl.CategoryImpl;
import thuy.dev.data.model.Order;
import thuy.dev.data.model.OrderItem;
import thuy.dev.data.model.Product;
import thuy.dev.data.dao.DatabaseDao;
import thuy.dev.data.dao.OrderDao;
import thuy.dev.data.dao.OrderItemDao;
import thuy.dev.data.dao.ProductDao;
import thuy.dev.data.dao.UserDao;
import thuy.dev.data.impl.UserImpl;
import thuy.dev.data.model.User;
import thuy.dev.data.seeder.CategorySeeder;
import thuy.dev.data.seeder.ProductSeeder;
import thuy.dev.data.seeder.UserSeeder;

import java.util.List;
import java.util.Locale;
import com.github.javafaker.Faker;

public class Faker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			DatabaseDao.init(new Database());
			Faker faker = new Faker();
			
			// Lấy đối tượng UserDao thông qua DatabaseDao
	        UserDao userDao = DatabaseDao.getInstance().getUserDao();

	        // Khởi tạo UserSign với UserDao đã lấy được
	        UserSeeder userSign = new UserSeeder(userDao);

	        // Gọi phương thức seedUsers để tạo dữ liệu giả cho bảng user
	        userSign.seedUsers(0);

	        
	        
	        // Category Seeder
	        CategoryDao categoryDao = DatabaseDao.getInstance().getCategoryDao();
	        CategorySeeder categorySeeder = new CategorySeeder(categoryDao);
	        categorySeeder.seedCategories(0);

	        // Product Seeder
	        ProductDao productDao = DatabaseDao.getInstance().getProductDao();
	        ProductSeeder productSeeder = new ProductSeeder(productDao, categoryDao);
	        productSeeder.seedProducts(2);
	        
	        System.out.println("Seeded fake users successfully!");
			
	}
	
}