package exercise2;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class ItemProcessor {

	private ItemDao itemDao;

    public void execute() {
        List<Item> items = itemDao.fetchItems();
        for (Item item : items) {
            System.out.println("Found item " + item);
        }
    }
    @Inject
    public ItemProcessor(@Demo ItemDao itemDao) {
        this.itemDao = itemDao;
    }
	
}
