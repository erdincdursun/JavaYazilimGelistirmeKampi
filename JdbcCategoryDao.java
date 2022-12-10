package dataaAcces;

import entities.Category;

public class JdbcCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("Jdbc ile ile veritabanına eklendi.");
		
	}


	}
