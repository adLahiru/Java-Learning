/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.layered.controller;
import edu.ijse.layered.dto.ItemDto;
import edu.ijse.layered.service.ServiceFactory;
import java.util.ArrayList;
import edu.ijse.layered.service.custom.ItemService;

/**
 *
 * @author ASUS
 */
public class ItemController {
    
    private ItemService itemService= (ItemService) ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.ITEM);
    public String save(ItemDto itemDto) throws Exception{
        return itemService.save(itemDto);
    }
    public String update(ItemDto itemDto) throws Exception{
        return itemService.update(itemDto);
    }
    public String delete(String itemCode) throws Exception{
        return itemService.delete(itemCode);
    }
    public ItemDto search(String itemCode) throws Exception{
        return itemService.search(itemCode);
    }
    public ArrayList<ItemDto> getAll() throws Exception{
        return itemService.getAll();
    }
}
