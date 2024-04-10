package hello.itemservice.domain.item;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

class ItemRepositoryTest {

  ItemRepository itemRepository = new ItemRepository();

  @AfterEach
  void afterEach() {
    itemRepository.clearStore();
  }

  @Test
  void save() {
    //given
    Item item1 = new Item("item1", 1000, 10);
    Item item2 = new Item("item1", 1000, 10);

    //when
    Item save1 = itemRepository.save(item1);
    Item save2 = itemRepository.save(item2);

    //then
    assertThat(item1).isEqualTo(save1);
    assertThat(item2).isEqualTo(save2);
  }

  @Test
  void findAll() {
    //given
    Item item1 = new Item("item1", 1000, 10);
    Item item2 = new Item("item1", 1000, 10);
    itemRepository.save(item1);
    itemRepository.save(item2);
    //when
    List<Item> items = itemRepository.findAll();

    //then
    assertThat(items.size()).isEqualTo(2);
    assertThat(items).contains(item1, item2);
  }

  @Test
  void update() {
    //given
    Item item1 = new Item("item1", 1000, 10);
    Item saveItem = itemRepository.save(item1);
    long id = saveItem.getId();

    //when
    Item updateItem = new Item("updateItem", 2000, 20);
    itemRepository.update(id, updateItem);

    //then
    Item findItem = itemRepository.findById(id);
    assertThat(findItem.getItemName()).isEqualTo(updateItem.getItemName());
    assertThat(findItem.getPrice()).isEqualTo(updateItem.getPrice());
    assertThat(findItem.getQuantity()).isEqualTo(updateItem.getQuantity());
  }

}