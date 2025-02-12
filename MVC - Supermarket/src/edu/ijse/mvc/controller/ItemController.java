/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.controller;
import edu.ijse.mvc.model.ItemModel;
import edu.ijse.mvc.dto.ItemDto;
import java.util.ArrayList;


/**
 *
 * @author ASUS
 */
public class ItemController{
    
    private ItemModel itemModel= new ItemModel();
    
    public String saveItem (ItemDto itemDto)throws Exception{
        return itemModel.saveItem(itemDto);
    }
    
    public ArrayList<ItemDto> gettAllItem()throws Exception{
        return itemModel.getAllItem();
    }
    public ItemDto searchItem(String itemCode)throws Exception{
        return itemModel.searchItem(itemCode);
    }
    public void deleteItem(String itemCode)throws Exception{
        itemModel.deleteItem(itemCode);
    }
    public String updateItem(ItemDto itemDto)throws Exception{
        return itemModel.updateItem(itemDto);
    }
}
